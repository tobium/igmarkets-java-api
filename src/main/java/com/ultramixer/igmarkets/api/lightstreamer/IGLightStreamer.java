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

package com.ultramixer.igmarkets.api.lightstreamer;

import com.lightstreamer.client.ClientListener;
import com.lightstreamer.client.LightstreamerClient;
import com.lightstreamer.client.Subscription;
import com.lightstreamer.client.SubscriptionListener;

import java.util.logging.Logger;


/**
 * available fields: https://labs.ig.com/streaming-api-reference
 */
public class IGLightStreamer
{

    private static final Logger logger = Logger.getLogger(IGLightStreamer.class.getName());

    private static final String TRADE_PATTERN = "TRADE:{accountId}";
    private static final String ACCOUNT_BALANCE_INFO_PATTERN = "ACCOUNT:{accountId}";
    private static final String MARKET_L1_PATTERN = "MARKET:{epic}";
    private static final String SPRINT_MARKET_PATTERN = "MARKET:{epic}";
    private static final String CHART_TICK_PATTERN = "CHART:{epic}:TICK";
    //private static final String CHART_CANDLE_PATTERN = "CHART:{epic}:{scale}";

    private LightstreamerClient lsClient;

    public ClientListener connect(String accountID, String cst, String securityToken,
                                  String lightstreamerEndpoint) throws Exception
    {

        lsClient = new LightstreamerClient(lightstreamerEndpoint, null);
        lsClient.connectionDetails.setUser(accountID);
        lsClient.connectionDetails.setPassword("CST-" + cst + "|XST-" + securityToken);


        final ConnectionListenerAdapter connectionListener = new ConnectionListenerAdapter();
        lsClient.addListener(connectionListener);

        lsClient.connect();
        logger.info("Lightstreamer connected");


        return connectionListener;
    }

    public Subscription subscribeForMarket(String epic, SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "MERGE",
                MARKET_L1_PATTERN.replace("{epic}", epic), // e.g. {"MARKET:IX.D.FTSE.DAILY.IP","MARKET:MT.D.GC.MONTH1.IP"}
                new String[] { "BID", "OFFER", "MARKET_STATE" } // e.g. {"BID", "OFFER"}
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }


    public void unsubscribe(Subscription key) throws Exception
    {
        lsClient.unsubscribe(key);
    }


    public void disconnect()
    {
        lsClient.disconnect();
    }


    public Subscription subscribeForConfirms(String accountId, SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "DISTINCT",
                TRADE_PATTERN.replace("{accountId}", accountId),
                new String[] { "CONFIRMS" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }

    public Subscription subscribeForAccountBalanceInfo(String accountId, SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "MERGE",
                ACCOUNT_BALANCE_INFO_PATTERN.replace("{accountId}", accountId),
                new String[] { "PNL", "DEPOSIT", "USED_MARGIN", "AMOUNT_DUE", "AVAILABLE_CASH" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }


    public Subscription subscribeForB2CSprintMarket(String epic,
                                                    SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "MERGE",
                SPRINT_MARKET_PATTERN.replace("{epic}", epic),
                new String[] { "STRIKE_PRICE", "MARKET_STATE", "ODDS", "OPEN_TIME", "CLOSE_TIME" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }

    public Subscription subscribeForB2BSprintMarket(String epic,
                                                    SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "MERGE",
                SPRINT_MARKET_PATTERN.replace("{epic}", epic),
                new String[] { "STRIKE_PRICE", "SETTLEMENT_PRICE", "MARKET_STATE", "ODDS", "OPEN_TIME", "CLOSE_TIME" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }


    public Subscription subscribeForOPUs(String accountId,
                                         SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "DISTINCT",
                TRADE_PATTERN.replace("{accountId}", accountId),
                new String[] { "OPU" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }

    public Subscription subscribeForWOUs(String accountId,
                                         SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "DISTINCT",
                TRADE_PATTERN.replace("{accountId}", accountId),
                new String[] { "WOU" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }

    public Subscription subscribeForChartTicks(String epic,
                                               SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "DISTINCT",
                CHART_TICK_PATTERN.replace("{epic}", epic),
                new String[] { "BID", "OFR", "LTP", "LTV", "UTM", "DAY_OPEN_MID", "DAY_PERC_CHG_MID", "DAY_HIGH", "DAY_LOW" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }

    public Subscription subscribeForChartCandles(String epic,
                                                 String scale, SubscriptionListener subscriptionListener) throws Exception
    {
        Subscription subscription = new Subscription(
                "MERGE",
                CHART_TICK_PATTERN.replace("{epic}", epic).replace("{scale}", scale),
                new String[] { "LTV", "LTV", "UTM", "DAY_OPEN_MID", "UTM", "DAY_OPEN_MID",
                        "DAY_PERC_CHG_MID", "DAY_HIGH", "DAY_LOW", "OFR_OPEN",
                        "OFR_HIGH", "OFR_LOW", "OFR_CLOSE", "BID_OPEN",
                        "BID_HIGH", "BID_LOW", "BID_CLOSE", "LTP_OPEN",
                        "LTP_HIGH", "LTP_LOW", "LTP_CLOSE", "CANDLE_START",
                        "CANDLE_TICK_COUNT" }
        );
        subscription.addListener(subscriptionListener);
        lsClient.subscribe(subscription);
        return subscription;
    }

}
