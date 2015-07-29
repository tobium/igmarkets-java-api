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

package com.ultramixer.igmarkets.api.model;

import com.ultramixer.igmarkets.api.UTF8Control;

import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by TB on 27.07.15.
 */
public class GeneralErrors
{

    private static Logger logger = Logger.getLogger(GeneralErrors.class.getName());
    private static ResourceBundle bundle = ResourceBundle.getBundle("com.ultramixer.igmarkets.api.GeneralErrors", new UTF8Control());


    public static String getError(String reasonID)
    {
        String s = reasonID;
        if (reasonID == null)
        {
            return "no error code";
        }
        if (bundle.containsKey(reasonID))
        {
            s = bundle.getString(reasonID);
        }
        return s;
    }

}
