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

import com.lightstreamer.client.ItemUpdate;
import com.lightstreamer.client.Subscription;
import com.lightstreamer.client.SubscriptionListener;

/**
 * Created by TB on 16.07.15.
 */
public class SubscriptionPrintAdapter implements SubscriptionListener
{
    public void onClearSnapshot(String s, int i)
    {
        System.out.println("onClearSnapshot: " + s);
    }

    public void onCommandSecondLevelItemLostUpdates(int i, String s)
    {
        System.out.println("onCommandSecondLevelItemLostUpdates: " + s);
    }

    public void onCommandSecondLevelSubscriptionError(int i, String s, String s1)
    {
        System.out.println("onCommandSecondLevelSubscriptionError: " + s);
    }

    public void onEndOfSnapshot(String s, int i)
    {
        System.out.println("onEndOfSnapshot: " + s);
    }

    public void onItemLostUpdates(String s, int i, int i1)
    {
        System.out.println("onItemLostUpdates: " + s);
    }

    public void onItemUpdate(ItemUpdate itemUpdate)
    {
        System.out.println(String.format("onItemUpdate: %s - %s",itemUpdate.getItemName(),itemUpdate.getFields()));
    }

    public void onListenEnd(Subscription subscription)
    {
        System.out.println("onListenEnd: " + subscription);
    }

    public void onListenStart(Subscription subscription)
    {
        System.out.println("onListenStart: " + subscription);
    }

    public void onSubscription()
    {
        System.out.println("onSubscription");
    }

    public void onSubscriptionError(int i, String s)
    {
        System.out.println("onSubscriptionError: " + s);
    }

    public void onUnsubscription()
    {
        System.out.println("onUnsubscription");
    }
}
