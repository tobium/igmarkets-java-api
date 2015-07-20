/*
 * Copyright (c) 2015 UltraMixer Digital Audio Solutions
 * Matthias Haenel & Tobias Bley
 * www.ultramixer.com
 * Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.ultramixer.igmarkets.api;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.ultramixer.igmarkets.api.model.*;

/**
 * Created by TB on 16.07.15.
 */
public class API
{
    private String apiURL = "https://demo-api.ig.com/gateway/deal";
    private String apiKey = "";

    private Gson gson = null;
    private LoginResponse loginResponse;
    private String securityToken;
    private String cst;

    public API()
    {
        this.gson = new Gson();
    }

    public String getApiKey()
    {
        return apiKey;
    }


    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
    }

    public LoginResponse connect(String username, String password) throws LoginException
    {
        try
        {
            JsonNode json = new JsonNode("");
            json.getObject().put("identifier", username);
            json.getObject().put("password", password);

            HttpResponse<JsonNode> response = createPostHttpRequest("session")
                    .body(json)
                    .asJson();
            if (response.getStatus() == 200)
            {
                this.securityToken = response.getHeaders().getFirst("x-security-token");
                this.cst = response.getHeaders().getFirst("cst");
                loginResponse = gson.fromJson(response.getBody().toString(), LoginResponse.class);
                return loginResponse;


            }
            else
            {
                throw new LoginException(response.getStatus(), response.getStatusText());
            }

        }
        catch (UnirestException e)
        {
            throw new LoginException(e);
        }
    }

    public void disconnect() throws LogoutException
    {

        try
        {
            HttpResponse<JsonNode> response = createDeleteHttpRequest("session")
                    .asJson();
            if (response.getStatus() == 200)
            {
                this.securityToken = response.getHeaders().getFirst("x-security-token");
                this.cst = response.getHeaders().getFirst("cst");
            }
            else
            {
                throw new LogoutException(response.getStatus(), response.getStatusText());
            }

        }
        catch (UnirestException e)
        {
            throw new LogoutException(e);
        }
    }

    public String getSecurityToken()
    {
        return securityToken;
    }

    public String getCst()
    {
        return cst;
    }

    public Watchlists getWatchlists()
    {
        try
        {
            HttpResponse<JsonNode> response = createGetHttpRequest("watchlists").header("version", "1").asJson();
            return gson.fromJson(response.getBody().toString(), Watchlists.class);
        }
        catch (UnirestException e)
        {
            //todo: eigene Exception feuern?
            e.printStackTrace();
        }

        return null;
    }


    //todo: Exceoptions
    public Markets getWatchlist(String watchlistID)
    {
        //
        try
        {
            HttpResponse<String> response = createGetHttpRequest("watchlists/" + watchlistID).header("version", "1").asString();
            if (response.getStatus() == 200)
            {
                return gson.fromJson(response.getBody(), Markets.class);
            }
            else
            {
                System.out.println("response = " + response);
                System.out.println("response.getStatusText() = " + response.getStatusText());
                System.out.println("response.getBody() = " + response.getBody());
            }
        }
        catch (UnirestException e)
        {
            e.printStackTrace();
        }
        return null;
    }


    //todo: Exceoptions
    public Accounts getAccounts()
    {
        //
        try
        {
            HttpResponse<String> response = createGetHttpRequest("accounts").header("version", "1").asString();
            if (response.getStatus() == 200)
            {
                return gson.fromJson(response.getBody(), Accounts.class);
            }
            else
            {
                System.out.println("response = " + response);
                System.out.println("response.getStatusText() = " + response.getStatusText());
                System.out.println("response.getBody() = " + response.getBody());
            }
        }
        catch (UnirestException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public HttpRequestWithBody createPostHttpRequest(String url)
    {
        HttpRequestWithBody request = Unirest.post(this.apiURL + "/" + url);
        setHeaders(request);
        return request;
    }

    public HttpRequestWithBody createDeleteHttpRequest(String url)
    {
        HttpRequestWithBody request = Unirest.delete(this.apiURL + "/" + url);
        setHeaders(request);
        return request;
    }

    private HttpRequest setHeaders(HttpRequest request)
    {
        request.header("Content-Type", "application/json; charset=UTF-8")
                .header("Accept", "application/json; charset=UTF-8")
                .header("X-IG-API-KEY", this.apiKey);
        System.out.println("this.securityToken = " + this.securityToken);
        if (this.securityToken != null)
        {
            request = request.header("X-SECURITY-TOKEN", this.securityToken);
        }
        if (this.cst != null)
        {
            request = request.header("CST", this.cst);
        }
        return request;
    }

    public GetRequest createGetHttpRequest(String url)
    {
        GetRequest request = Unirest.get(this.apiURL + "/" + url);
        System.out.println("request.getUrl() = " + request.getUrl());
        setHeaders(request);
        return request;
    }

    public String getApiURL()
    {
        return apiURL;
    }

    public void setApiURL(String apiURL)
    {
        this.apiURL = apiURL;
    }

    //todo: Exception
    public String createWorkingOrderV2(WorkingOrderV2Request workingOrderV2Request)
    {
        try
        {
            String json = gson.toJson(workingOrderV2Request);
            HttpResponse<JsonNode> response = createPostHttpRequest("workingorders/otc").header("version", "2").body(json).asJson();

            if (response.getStatus() == 200)
            {
                return response.getBody().getObject().getString("dealReference");
            }
            else
            {
                System.out.println("createWorkingOrderV2: response = " + response);
                System.out.println("createWorkingOrderV2: response.getBody().toString() = " + response.getBody().toString());
            }
        }
        catch (UnirestException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    //todo: Exception
    public TradeConfirmationV1Response getTradeConfirmation(String dealReference)
    {
        try
        {
            HttpResponse<String> response = createGetHttpRequest("confirms/" + dealReference).header("version", "1").asString();
            if (response.getStatus() == 200)
            {
                System.out.println("response.getBody() = " + response.getBody());
                return gson.fromJson(response.getBody(), TradeConfirmationV1Response.class);
            }
            else
            {
                System.out.println("getTradeConfirmation: response.getStatusText() = " + response.getStatusText());
                System.out.println("getTradeConfirmation: response.getStatus() = " + response.getStatus());
            }
        }
        catch (UnirestException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
