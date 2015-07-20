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

/**
 * Created by TB on 16.07.15.
 */
public class ConnectionListenerAdapter implements ClientListener
{
    public void onListenEnd(LightstreamerClient lightstreamerClient)
    {
        System.out.println("onListenEnd");
    }

    public void onListenStart(LightstreamerClient lightstreamerClient)
    {
        System.out.println("onListenStart");
    }

    public void onServerError(int i, String s)
    {
        System.out.println("onServerError: " + s);
    }

    public void onStatusChange(String s)
    {
        System.out.println("onStatusChange: " + s);
    }

    public void onPropertyChange(String s)
    {
        System.out.println("onPropertyChange: " + s);
    }
}
