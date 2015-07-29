
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
public class Account {

    @Expose
    private String accountId;
    @Expose
    private String accountName;
    @Expose
    private String accountAlias;
    @Expose
    private String status;
    @Expose
    private String accountType;
    @Expose
    private Boolean preferred;
    @Expose
    private Balance balance;
    @Expose
    private String currency;
    @Expose
    private Boolean canTransferFrom;
    @Expose
    private Boolean canTransferTo;

    /**
     * 
     * @return
     *     The accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 
     * @param accountName
     *     The accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 
     * @return
     *     The accountAlias
     */
    public String getAccountAlias() {
        return accountAlias;
    }

    /**
     * 
     * @param accountAlias
     *     The accountAlias
     */
    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     *     The accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 
     * @param accountType
     *     The accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     *
     * @return
     *     The preferred
     */
    public Boolean getPreferred() {
        return preferred;
    }

    /**
     *
     * @param preferred
     *     The preferred
     */
    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    /**
     *
     * @return
     *     The balance
     */
    public Balance getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     *     The balance
     */
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    /**
     *
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     *     The canTransferFrom
     */
    public Boolean getCanTransferFrom() {
        return canTransferFrom;
    }

    /**
     *
     * @param canTransferFrom
     *     The canTransferFrom
     */
    public void setCanTransferFrom(Boolean canTransferFrom) {
        this.canTransferFrom = canTransferFrom;
    }

    /**
     *
     * @return
     *     The canTransferTo
     */
    public Boolean getCanTransferTo() {
        return canTransferTo;
    }

    /**
     *
     * @param canTransferTo
     *     The canTransferTo
     */
    public void setCanTransferTo(Boolean canTransferTo) {
        this.canTransferTo = canTransferTo;
    }

    @Override
    public String toString()
    {
        return String.format("Account-ID: %s - Account-Name:%s - Account-Type:%s - Currency:%s - Status:%s",this.getAccountId(),this.getAccountName(),this.getAccountType(),this.getCurrency(),this.getStatus());
    }
}
