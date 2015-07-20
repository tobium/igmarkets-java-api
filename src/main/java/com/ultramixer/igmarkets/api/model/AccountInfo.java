
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

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class AccountInfo {

    @Expose
    private Double balance;
    @Expose
    private Double deposit;
    @Expose
    private Double profitLoss;
    @Expose
    private Double available;

    /**
     * 
     * @return
     *     The balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 
     * @param balance
     *     The balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 
     * @return
     *     The deposit
     */
    public Double getDeposit() {
        return deposit;
    }

    /**
     * 
     * @param deposit
     *     The deposit
     */
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    /**
     * 
     * @return
     *     The profitLoss
     */
    public Double getProfitLoss() {
        return profitLoss;
    }

    /**
     * 
     * @param profitLoss
     *     The profitLoss
     */
    public void setProfitLoss(Double profitLoss) {
        this.profitLoss = profitLoss;
    }

    /**
     * 
     * @return
     *     The available
     */
    public Double getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(Double available) {
        this.available = available;
    }

}
