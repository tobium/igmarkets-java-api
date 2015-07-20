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

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by TB on 16.07.15.
 */
public class IGBigDecimal
{
    public static BigDecimal create(double v)
    {
        return create(BigDecimal.valueOf(v));
    }

    public static BigDecimal create(BigDecimal v)
    {
        return v.setScale(5, RoundingMode.HALF_UP);
    }

}

