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

package com.ultramixer.igmarkets;

import com.ultramixer.igmarkets.api.API;
import com.ultramixer.igmarkets.api.IGBigDecimal;
import com.ultramixer.igmarkets.api.LoginException;
import com.ultramixer.igmarkets.api.LogoutException;
import com.ultramixer.igmarkets.api.model.LoginResponse;
import com.ultramixer.igmarkets.api.model.Watchlist;
import com.ultramixer.igmarkets.api.model.Watchlists;
import com.ultramixer.igmarkets.api.model.WorkingOrderV2Request;
import junit.framework.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by TB on 16.07.15.
 */
public class TestAPI
{
    public static final String USERNAME = "";
    public static final String PASSWORD = "";
    public static final String APIKEY = "";
    private Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args)
    {
        new TestAPI().test();
    }


    @Test
    public void test()
    {
        API api = new API();
        LoginResponse loginResponse = null;
        try
        {


            api.setApiKey(APIKEY);
            loginResponse = api.connect(USERNAME, PASSWORD);
            Assert.assertNotNull(loginResponse);
        }
        catch (LoginException e)
        {
            e.printStackTrace();
            System.out.println("e.getLoginMessage() = " + e.getLoginMessage());
            Assert.fail(e.toString());

        }


        Watchlists watchlists = api.getWatchlists();
        for (Watchlist watchlist : watchlists.getWatchlists())
        {
            System.out.println("watchlist = " + watchlist.getName());
        }

        WorkingOrderV2Request workingOrderV2Request = new WorkingOrderV2Request();
        workingOrderV2Request.setCurrencyCode("USD");
        workingOrderV2Request.setDirection(WorkingOrderV2Request.Direction.SELL);
        workingOrderV2Request.setEpic("CS.D.EURUSD.CFD.IP");
        workingOrderV2Request.setExpiry("-");
        workingOrderV2Request.setForceOpen(true);
        workingOrderV2Request.setGoodTillDate(null);
        workingOrderV2Request.setLevel(IGBigDecimal.create(1.0909));
        workingOrderV2Request.setGuaranteedStop(false);
        workingOrderV2Request.setTimeInForce(WorkingOrderV2Request.TimeInForce.GOOD_TILL_CANCELLED);
        //workingOrderV2Request.setType(WorkingOrderV2Request.Type.LIMIT);
        workingOrderV2Request.setSize(1.0);
        //workingOrderV2Request.setStopDistance(null);
        //workingOrderV2Request.setLimitDistance(2);
        //workingOrderV2Request.setStopDistance(5);
        //  workingOrderV2Request.setLimitLevel(IGBigDecimal.create(1.08031));

        /*
        String dealReference = api.createWorkingOrderV2(workingOrderV2Request);
        System.out.println("dealReference = " + dealReference);

        TradeConfirmationV1Response tradeConfirmation = api.getTradeConfirmation(dealReference);
        System.out.println("tradeConfirmation = " + tradeConfirmation);
        if (tradeConfirmation != null)
        {
            System.out.println("tradeConfirmation = " + tradeConfirmation.getDealStatus());
            System.out.println("tradeConfirmation = " + tradeConfirmation.getReason());
            System.out.println("TradeErrors.getTradeError(tradeConfirmation.getReason()) = " + TradeErrors.getTradeError(tradeConfirmation.getReason()));
        }
        */


        /*
        Markets markets = api.getWatchlist("3793700");
        for (Market market : markets.getMarkets())
        {
            System.out.println("market = " + market);
        }

        Accounts accounts = api.getAccounts();
        for (Account account : accounts.getAccounts())
        {
            System.out.println("account = " + account.getAccountName());
        }


        IGLightStreamer igLightStreamer = new IGLightStreamer();
        try
        {
            igLightStreamer.connect(loginResponse.getCurrentAccountId(), api.getCst(), api.getSecurityToken(), loginResponse.getLightstreamerEndpoint());
            Subscription subscription = igLightStreamer.subscribeForMarket("CS.D.EURUSD.CFD.IP", new SubscriptionPrintAdapter());
            logger.info("subscribed");
            Thread.sleep(2000);
            igLightStreamer.unsubscribe(subscription);
            igLightStreamer.disconnect();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        */

        try
        {
            api.disconnect();
        }
        catch (LogoutException e)
        {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }


    }
}
