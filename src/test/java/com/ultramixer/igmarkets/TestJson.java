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

import com.google.gson.Gson;
import com.ultramixer.igmarkets.api.model.AccountInfo;
import org.junit.Test;

/**
 * Created by TB on 16.07.15.
 */
public class TestJson
{
    @Test
    public void test()
    {
        AccountInfo info = new AccountInfo();
        info.setAvailable(2000.12);
        info.setBalance(102.43);
        info.setDeposit(2434.32);
        info.setProfitLoss(111.11);

        Gson gson = new Gson();
        String json = gson.toJson(info);
        System.out.println("json = " + json);

        AccountInfo info2 = gson.fromJson(json, AccountInfo.class);
        System.out.println("info2 = " + info2.getBalance());

    }
}
