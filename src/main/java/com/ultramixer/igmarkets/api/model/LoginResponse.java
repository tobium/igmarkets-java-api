
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

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class LoginResponse {

    @Expose
    private String accountType;
    @Expose
    private AccountInfo accountInfo;
    @Expose
    private String currencyIsoCode;
    @Expose
    private String currencySymbol;
    @Expose
    private String currentAccountId;
    @Expose
    private String lightstreamerEndpoint;
    @Expose
    private List<Account> accounts = new ArrayList<Account>();
    @Expose
    private String clientId;
    @Expose
    private Integer timezoneOffset;
    @Expose
    private Boolean hasActiveDemoAccounts;
    @Expose
    private Boolean hasActiveLiveAccounts;
    @Expose
    private Boolean trailingStopsEnabled;
    @Expose
    private Object reroutingEnvironment;
    @Expose
    private Boolean dealingEnabled;

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
     *     The accountInfo
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * 
     * @param accountInfo
     *     The accountInfo
     */
    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    /**
     * 
     * @return
     *     The currencyIsoCode
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    /**
     * 
     * @param currencyIsoCode
     *     The currencyIsoCode
     */
    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    /**
     * 
     * @return
     *     The currencySymbol
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * 
     * @param currencySymbol
     *     The currencySymbol
     */
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    /**
     * 
     * @return
     *     The currentAccountId
     */
    public String getCurrentAccountId() {
        return currentAccountId;
    }

    /**
     * 
     * @param currentAccountId
     *     The currentAccountId
     */
    public void setCurrentAccountId(String currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    /**
     * 
     * @return
     *     The lightstreamerEndpoint
     */
    public String getLightstreamerEndpoint() {
        return lightstreamerEndpoint;
    }

    /**
     * 
     * @param lightstreamerEndpoint
     *     The lightstreamerEndpoint
     */
    public void setLightstreamerEndpoint(String lightstreamerEndpoint) {
        this.lightstreamerEndpoint = lightstreamerEndpoint;
    }

    /**
     * 
     * @return
     *     The accounts
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * 
     * @param accounts
     *     The accounts
     */
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * 
     * @return
     *     The clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 
     * @param clientId
     *     The clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 
     * @return
     *     The timezoneOffset
     */
    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * 
     * @param timezoneOffset
     *     The timezoneOffset
     */
    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    /**
     * 
     * @return
     *     The hasActiveDemoAccounts
     */
    public Boolean getHasActiveDemoAccounts() {
        return hasActiveDemoAccounts;
    }

    /**
     * 
     * @param hasActiveDemoAccounts
     *     The hasActiveDemoAccounts
     */
    public void setHasActiveDemoAccounts(Boolean hasActiveDemoAccounts) {
        this.hasActiveDemoAccounts = hasActiveDemoAccounts;
    }

    /**
     * 
     * @return
     *     The hasActiveLiveAccounts
     */
    public Boolean getHasActiveLiveAccounts() {
        return hasActiveLiveAccounts;
    }

    /**
     * 
     * @param hasActiveLiveAccounts
     *     The hasActiveLiveAccounts
     */
    public void setHasActiveLiveAccounts(Boolean hasActiveLiveAccounts) {
        this.hasActiveLiveAccounts = hasActiveLiveAccounts;
    }

    /**
     * 
     * @return
     *     The trailingStopsEnabled
     */
    public Boolean getTrailingStopsEnabled() {
        return trailingStopsEnabled;
    }

    /**
     * 
     * @param trailingStopsEnabled
     *     The trailingStopsEnabled
     */
    public void setTrailingStopsEnabled(Boolean trailingStopsEnabled) {
        this.trailingStopsEnabled = trailingStopsEnabled;
    }

    /**
     * 
     * @return
     *     The reroutingEnvironment
     */
    public Object getReroutingEnvironment() {
        return reroutingEnvironment;
    }

    /**
     * 
     * @param reroutingEnvironment
     *     The reroutingEnvironment
     */
    public void setReroutingEnvironment(Object reroutingEnvironment) {
        this.reroutingEnvironment = reroutingEnvironment;
    }

    /**
     * 
     * @return
     *     The dealingEnabled
     */
    public Boolean getDealingEnabled() {
        return dealingEnabled;
    }

    /**
     * 
     * @param dealingEnabled
     *     The dealingEnabled
     */
    public void setDealingEnabled(Boolean dealingEnabled) {
        this.dealingEnabled = dealingEnabled;
    }

}
