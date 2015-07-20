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

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by TB on 17.07.15.
 */
//todo: i18n?
public class TradeErrors
{
    private static final Properties p;
    private static Logger logger = Logger.getLogger(TradeErrors.class.getName());

    static
    {
        p = new Properties();
        try
        {
            p.load(TradeErrors.class.getResourceAsStream("/com/ultramixer/igmarkets/api/TradeErrors.properties"));
        }
        catch (IOException e)
        {
            logger.log(Level.WARNING, "", e);
        }
    }

    public static String getTradeError(String reasonID)
    {
        return p.getProperty(reasonID, reasonID);
    }
}
