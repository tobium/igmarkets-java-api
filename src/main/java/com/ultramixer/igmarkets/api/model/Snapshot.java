package com.ultramixer.igmarkets.api.model;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Snapshot
{

    @Expose
    private String marketStatus;
    @Expose
    private Double netChange;
    @Expose
    private Double percentageChange;
    @Expose
    private String updateTime;
    @Expose
    private Long delayTime;
    @Expose
    private Double bid;
    @Expose
    private Double offer;
    @Expose
    private Double high;
    @Expose
    private Double low;
    @Expose
    private Double binaryOdds;
    @Expose
    private Long decimalPlacesFactor;
    @Expose
    private Double scalingFactor;
    @Expose
    private Double controlledRiskExtraSpread;

    /**
     * @return The marketStatus
     */
    public String getMarketStatus()
    {
        return marketStatus;
    }

    /**
     * @param marketStatus The marketStatus
     */
    public void setMarketStatus(String marketStatus)
    {
        this.marketStatus = marketStatus;
    }

    /**
     * @return The netChange
     */
    public Double getNetChange()
    {
        return netChange;
    }

    /**
     * @param netChange The netChange
     */
    public void setNetChange(Double netChange)
    {
        this.netChange = netChange;
    }

    /**
     * @return The percentageChange
     */
    public Double getPercentageChange()
    {
        return percentageChange;
    }

    /**
     * @param percentageChange The percentageChange
     */
    public void setPercentageChange(Double percentageChange)
    {
        this.percentageChange = percentageChange;
    }

    /**
     * @return The updateTime
     */
    public String getUpdateTime()
    {
        return updateTime;
    }

    /**
     * @param updateTime The updateTime
     */
    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

    /**
     * @return The delayTime
     */
    public Long getDelayTime()
    {
        return delayTime;
    }

    /**
     * @param delayTime The delayTime
     */
    public void setDelayTime(Long delayTime)
    {
        this.delayTime = delayTime;
    }

    /**
     * @return The bid
     */
    public Double getBid()
    {
        return bid;
    }

    /**
     * @param bid The bid
     */
    public void setBid(Double bid)
    {
        this.bid = bid;
    }

    /**
     * @return The offer
     */
    public Double getOffer()
    {
        return offer;
    }

    /**
     * @param offer The offer
     */
    public void setOffer(Double offer)
    {
        this.offer = offer;
    }

    /**
     * @return The high
     */
    public Double getHigh()
    {
        return high;
    }

    /**
     * @param high The high
     */
    public void setHigh(Double high)
    {
        this.high = high;
    }

    /**
     * @return The low
     */
    public Double getLow()
    {
        return low;
    }

    /**
     * @param low The low
     */
    public void setLow(Double low)
    {
        this.low = low;
    }

    /**
     * @return The binaryOdds
     */
    public Object getBinaryOdds()
    {
        return binaryOdds;
    }

    /**
     * @param binaryOdds The binaryOdds
     */
    public void setBinaryOdds(Double binaryOdds)
    {
        this.binaryOdds = binaryOdds;
    }

    /**
     * @return The decimalPlacesFactor
     */
    public Long getDecimalPlacesFactor()
    {
        return decimalPlacesFactor;
    }

    /**
     * @param decimalPlacesFactor The decimalPlacesFactor
     */
    public void setDecimalPlacesFactor(Long decimalPlacesFactor)
    {
        this.decimalPlacesFactor = decimalPlacesFactor;
    }

    /**
     * @return The scalingFactor
     */
    public Double getScalingFactor()
    {
        return scalingFactor;
    }

    /**
     * @param scalingFactor The scalingFactor
     */
    public void setScalingFactor(Double scalingFactor)
    {
        this.scalingFactor = scalingFactor;
    }

    /**
     * @return The controlledRiskExtraSpread
     */
    public Double getControlledRiskExtraSpread()
    {
        return controlledRiskExtraSpread;
    }

    /**
     * @param controlledRiskExtraSpread The controlledRiskExtraSpread
     */
    public void setControlledRiskExtraSpread(Double controlledRiskExtraSpread)
    {
        this.controlledRiskExtraSpread = controlledRiskExtraSpread;
    }

}
