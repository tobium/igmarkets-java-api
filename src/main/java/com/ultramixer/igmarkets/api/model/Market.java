
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
public class Market {

    @Expose
    private String instrumentName;
    @Expose
    private String expiry;
    @Expose
    private String epic;
    @Expose
    private String instrumentType;
    @Expose
    private String marketStatus;
    @Expose
    private Double lotSize;
    @Expose
    private Double high;
    @Expose
    private Double low;
    @Expose
    private Double percentageChange;
    @Expose
    private Double netChange;
    @Expose
    private Double bid;
    @Expose
    private Double offer;
    @Expose
    private String updateTime;
    @Expose
    private Integer delayTime;
    @Expose
    private Boolean streamingPricesAvailable;
    @Expose
    private Integer scalingFactor;

    /**
     * 
     * @return
     *     The instrumentName
     */
    public String getInstrumentName() {
        return instrumentName;
    }

    /**
     * 
     * @param instrumentName
     *     The instrumentName
     */
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    /**
     * 
     * @return
     *     The expiry
     */
    public String getExpiry() {
        return expiry;
    }

    /**
     * 
     * @param expiry
     *     The expiry
     */
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * 
     * @return
     *     The epic
     */
    public String getEpic() {
        return epic;
    }

    /**
     * 
     * @param epic
     *     The epic
     */
    public void setEpic(String epic) {
        this.epic = epic;
    }

    /**
     * 
     * @return
     *     The instrumentType
     */
    public String getInstrumentType() {
        return instrumentType;
    }

    /**
     * 
     * @param instrumentType
     *     The instrumentType
     */
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * 
     * @return
     *     The marketStatus
     */
    public String getMarketStatus() {
        return marketStatus;
    }

    /**
     * 
     * @param marketStatus
     *     The marketStatus
     */
    public void setMarketStatus(String marketStatus) {
        this.marketStatus = marketStatus;
    }

    /**
     * 
     * @return
     *     The lotSize
     */
    public Double getLotSize() {
        return lotSize;
    }

    /**
     * 
     * @param lotSize
     *     The lotSize
     */
    public void setLotSize(Double lotSize) {
        this.lotSize = lotSize;
    }

    /**
     * 
     * @return
     *     The high
     */
    public Double getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The low
     */
    public Double getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    public void setLow(Double low) {
        this.low = low;
    }

    /**
     * 
     * @return
     *     The percentageChange
     */
    public Double getPercentageChange() {
        return percentageChange;
    }

    /**
     * 
     * @param percentageChange
     *     The percentageChange
     */
    public void setPercentageChange(Double percentageChange) {
        this.percentageChange = percentageChange;
    }

    /**
     * 
     * @return
     *     The netChange
     */
    public Double getNetChange() {
        return netChange;
    }

    /**
     * 
     * @param netChange
     *     The netChange
     */
    public void setNetChange(Double netChange) {
        this.netChange = netChange;
    }

    /**
     * 
     * @return
     *     The bid
     */
    public Double getBid() {
        return bid;
    }

    /**
     * 
     * @param bid
     *     The bid
     */
    public void setBid(Double bid) {
        this.bid = bid;
    }

    /**
     * 
     * @return
     *     The offer
     */
    public Double getOffer() {
        return offer;
    }

    /**
     * 
     * @param offer
     *     The offer
     */
    public void setOffer(Double offer) {
        this.offer = offer;
    }

    /**
     * 
     * @return
     *     The updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime
     *     The updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 
     * @return
     *     The delayTime
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * 
     * @param delayTime
     *     The delayTime
     */
    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * 
     * @return
     *     The streamingPricesAvailable
     */
    public Boolean getStreamingPricesAvailable() {
        return streamingPricesAvailable;
    }

    /**
     * 
     * @param streamingPricesAvailable
     *     The streamingPricesAvailable
     */
    public void setStreamingPricesAvailable(Boolean streamingPricesAvailable) {
        this.streamingPricesAvailable = streamingPricesAvailable;
    }

    /**
     * 
     * @return
     *     The scalingFactor
     */
    public Integer getScalingFactor() {
        return scalingFactor;
    }

    /**
     * 
     * @param scalingFactor
     *     The scalingFactor
     */
    public void setScalingFactor(Integer scalingFactor) {
        this.scalingFactor = scalingFactor;
    }

}
