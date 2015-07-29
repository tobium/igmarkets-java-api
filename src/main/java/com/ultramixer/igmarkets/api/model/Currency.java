
package com.ultramixer.igmarkets.api.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Currency {

    @Expose
    private String code;
    @Expose
    private String symbol;
    @Expose
    private Double baseExchangeRate;
    @Expose
    private Double exchangeRate;
    @Expose
    private Boolean isDefault;

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * @param symbol
     *     The symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * 
     * @return
     *     The baseExchangeRate
     */
    public Double getBaseExchangeRate() {
        return baseExchangeRate;
    }

    /**
     * 
     * @param baseExchangeRate
     *     The baseExchangeRate
     */
    public void setBaseExchangeRate(Double baseExchangeRate) {
        this.baseExchangeRate = baseExchangeRate;
    }

    /**
     * 
     * @return
     *     The exchangeRate
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 
     * @param exchangeRate
     *     The exchangeRate
     */
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 
     * @return
     *     The isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 
     * @param isDefault
     *     The isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

}
