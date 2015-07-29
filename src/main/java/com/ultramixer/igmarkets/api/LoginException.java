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

import com.mashape.unirest.http.exceptions.UnirestException;
import com.ultramixer.igmarkets.api.model.GeneralErrors;
import org.apache.http.HttpStatus;
import org.apache.http.impl.client.HttpClients;

import java.net.UnknownHostException;

/**
 * Created by TB on 16.07.15.
 */
public class LoginException extends Exception
{
    private int loginStatus;
    private String loginMessage;
    private String errorCode;

    public LoginException(String message)
    {
        super(message);
    }


    public LoginException()
    {
        super("Login error");
    }

    public LoginException(int loginStatus, String loginMessage, String errorCode)
    {
        this.loginStatus = loginStatus;
        this.loginMessage = loginMessage;
        this.errorCode = errorCode;
    }

    public LoginException(UnirestException e)
    {
        super(e);
        if(e.getCause() instanceof UnknownHostException)
        {
            this.setErrorCode("error.no_internet_connection");
        }
    }

    public int getLoginStatus()
    {
        return loginStatus;
    }

    public void setLoginStatus(int loginStatus)
    {
        this.loginStatus = loginStatus;
    }

    public String getLoginMessage()
    {
        return loginMessage;
    }

    public void setLoginMessage(String loginMessage)
    {
        this.loginMessage = loginMessage;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorMessage()
    {
        return GeneralErrors.getError(getErrorCode());

    }

    @Override
    public String toString()
    {
        return String.format("LoginException: %s - %s - %s: %s", getLoginStatus(), getLoginMessage(), getErrorCode(), getErrorMessage());
    }
}
