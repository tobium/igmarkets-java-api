package com.ultramixer.igmarkets.api.model;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Instrument
{

    @Expose
    private String epic;
    @Expose
    private String expiry;
    @Expose
    private String name;
    @Expose
    private Boolean forceOpenAllowed;
    @Expose
    private Boolean stopsLimitsAllowed;
    @Expose
    private Double lotSize;
    @Expose
    private String unit;
    @Expose
    private String type;
    @Expose
    private Boolean controlledRiskAllowed;
    @Expose
    private Boolean streamingPricesAvailable;
    @Expose
    private String marketId;
    @Expose
    private List<Currency> currencies = new ArrayList<Currency>();
    @Expose
    private Double sprintMarketsMinimumExpiryTime;
    @Expose
    private Double sprintMarketsMaximumExpiryTime;
    @Expose
    private List<MarginDepositBand> marginDepositBands = new ArrayList<MarginDepositBand>();
    @Expose
    private Double marginFactor;
    @Expose
    private String marginFactorUnit;
    @Expose
    private SlippageFactor slippageFactor;
    @Expose
    private Object openingHours; //todo: Klasse
    @Expose
    private Object expiryDetails;//todo: Klasse
    @Expose
    private Object rolloverDetails;//todo: Klasse
    @Expose
    private String newsCode;
    @Expose
    private String chartCode;
    @Expose
    private Object country; //todo: Klasse
    @Expose
    private String valueOfOnePip;
    @Expose
    private String onePipMeans;
    @Expose
    private String contractSize;
    @Expose
    private Object specialInfo; //todo: Klasse

    /**
     * @return The epic
     */
    public String getEpic()
    {
        return epic;
    }

    /**
     * @param epic The epic
     */
    public void setEpic(String epic)
    {
        this.epic = epic;
    }

    /**
     * @return The expiry
     */
    public String getExpiry()
    {
        return expiry;
    }

    /**
     * @param expiry The expiry
     */
    public void setExpiry(String expiry)
    {
        this.expiry = expiry;
    }

    /**
     * @return The name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return The forceOpenAllowed
     */
    public Boolean getForceOpenAllowed()
    {
        return forceOpenAllowed;
    }

    /**
     * @param forceOpenAllowed The forceOpenAllowed
     */
    public void setForceOpenAllowed(Boolean forceOpenAllowed)
    {
        this.forceOpenAllowed = forceOpenAllowed;
    }

    /**
     * @return The stopsLimitsAllowed
     */
    public Boolean getStopsLimitsAllowed()
    {
        return stopsLimitsAllowed;
    }

    /**
     * @param stopsLimitsAllowed The stopsLimitsAllowed
     */
    public void setStopsLimitsAllowed(Boolean stopsLimitsAllowed)
    {
        this.stopsLimitsAllowed = stopsLimitsAllowed;
    }

    /**
     * @return The lotSize
     */
    public Double getLotSize()
    {
        return lotSize;
    }

    /**
     * @param lotSize The lotSize
     */
    public void setLotSize(Double lotSize)
    {
        this.lotSize = lotSize;
    }

    /**
     * @return The unit
     */
    public String getUnit()
    {
        return unit;
    }

    /**
     * @param unit The unit
     */
    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    /**
     * @return The type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @return The controlledRiskAllowed
     */
    public Boolean getControlledRiskAllowed()
    {
        return controlledRiskAllowed;
    }

    /**
     * @param controlledRiskAllowed The controlledRiskAllowed
     */
    public void setControlledRiskAllowed(Boolean controlledRiskAllowed)
    {
        this.controlledRiskAllowed = controlledRiskAllowed;
    }

    /**
     * @return The streamingPricesAvailable
     */
    public Boolean getStreamingPricesAvailable()
    {
        return streamingPricesAvailable;
    }

    /**
     * @param streamingPricesAvailable The streamingPricesAvailable
     */
    public void setStreamingPricesAvailable(Boolean streamingPricesAvailable)
    {
        this.streamingPricesAvailable = streamingPricesAvailable;
    }

    /**
     * @return The marketId
     */
    public String getMarketId()
    {
        return marketId;
    }

    /**
     * @param marketId The marketId
     */
    public void setMarketId(String marketId)
    {
        this.marketId = marketId;
    }

    /**
     * @return The currencies
     */
    public List<Currency> getCurrencies()
    {
        return currencies;
    }

    /**
     * @param currencies The currencies
     */
    public void setCurrencies(List<Currency> currencies)
    {
        this.currencies = currencies;
    }

    /**
     * @return The sprintMarketsMinimumExpiryTime
     */
    public Object getSprintMarketsMinimumExpiryTime()
    {
        return sprintMarketsMinimumExpiryTime;
    }

    /**
     * @param sprintMarketsMinimumExpiryTime The sprintMarketsMinimumExpiryTime
     */
    public void setSprintMarketsMinimumExpiryTime(Double sprintMarketsMinimumExpiryTime)
    {
        this.sprintMarketsMinimumExpiryTime = sprintMarketsMinimumExpiryTime;
    }

    /**
     * @return The sprintMarketsMaximumExpiryTime
     */
    public Object getSprintMarketsMaximumExpiryTime()
    {
        return sprintMarketsMaximumExpiryTime;
    }

    /**
     * @param sprintMarketsMaximumExpiryTime The sprintMarketsMaximumExpiryTime
     */
    public void setSprintMarketsMaximumExpiryTime(Double sprintMarketsMaximumExpiryTime)
    {
        this.sprintMarketsMaximumExpiryTime = sprintMarketsMaximumExpiryTime;
    }

    /**
     * @return The marginDepositBands
     */
    public List<MarginDepositBand> getMarginDepositBands()
    {
        return marginDepositBands;
    }

    /**
     * @param marginDepositBands The marginDepositBands
     */
    public void setMarginDepositBands(List<MarginDepositBand> marginDepositBands)
    {
        this.marginDepositBands = marginDepositBands;
    }

    /**
     * @return The marginFactor
     */
    public Double getMarginFactor()
    {
        return marginFactor;
    }

    /**
     * @param marginFactor The marginFactor
     */
    public void setMarginFactor(Double marginFactor)
    {
        this.marginFactor = marginFactor;
    }

    /**
     * @return The marginFactorUnit
     */
    public String getMarginFactorUnit()
    {
        return marginFactorUnit;
    }

    /**
     * @param marginFactorUnit The marginFactorUnit
     */
    public void setMarginFactorUnit(String marginFactorUnit)
    {
        this.marginFactorUnit = marginFactorUnit;
    }

    /**
     * @return The slippageFactor
     */
    public SlippageFactor getSlippageFactor()
    {
        return slippageFactor;
    }

    /**
     * @param slippageFactor The slippageFactor
     */
    public void setSlippageFactor(SlippageFactor slippageFactor)
    {
        this.slippageFactor = slippageFactor;
    }

    /**
     * @return The openingHours
     */
    public Object getOpeningHours()
    {
        return openingHours;
    }

    /**
     * @param openingHours The openingHours
     */
    public void setOpeningHours(Object openingHours)
    {
        this.openingHours = openingHours;
    }

    /**
     * @return The expiryDetails
     */
    public Object getExpiryDetails()
    {
        return expiryDetails;
    }

    /**
     * @param expiryDetails The expiryDetails
     */
    public void setExpiryDetails(Object expiryDetails)
    {
        this.expiryDetails = expiryDetails;
    }

    /**
     * @return The rolloverDetails
     */
    public Object getRolloverDetails()
    {
        return rolloverDetails;
    }

    /**
     * @param rolloverDetails The rolloverDetails
     */
    public void setRolloverDetails(Object rolloverDetails)
    {
        this.rolloverDetails = rolloverDetails;
    }

    /**
     * @return The newsCode
     */
    public String getNewsCode()
    {
        return newsCode;
    }

    /**
     * @param newsCode The newsCode
     */
    public void setNewsCode(String newsCode)
    {
        this.newsCode = newsCode;
    }

    /**
     * @return The chartCode
     */
    public String getChartCode()
    {
        return chartCode;
    }

    /**
     * @param chartCode The chartCode
     */
    public void setChartCode(String chartCode)
    {
        this.chartCode = chartCode;
    }

    /**
     * @return The country
     */
    public Object getCountry()
    {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(Object country)
    {
        this.country = country;
    }

    /**
     * @return The valueOfOnePip
     */
    public String getValueOfOnePip()
    {
        return valueOfOnePip;
    }

    /**
     * @param valueOfOnePip The valueOfOnePip
     */
    public void setValueOfOnePip(String valueOfOnePip)
    {
        this.valueOfOnePip = valueOfOnePip;
    }

    /**
     * @return The onePipMeans
     */
    public String getOnePipMeans()
    {
        return onePipMeans;
    }

    /**
     * @param onePipMeans The onePipMeans
     */
    public void setOnePipMeans(String onePipMeans)
    {
        this.onePipMeans = onePipMeans;
    }

    /**
     * @return The contractSize
     */
    public String getContractSize()
    {
        return contractSize;
    }

    /**
     * @param contractSize The contractSize
     */
    public void setContractSize(String contractSize)
    {
        this.contractSize = contractSize;
    }

    /**
     * @return The specialInfo
     */
    public Object getSpecialInfo()
    {
        return specialInfo;
    }

    /**
     * @param specialInfo The specialInfo
     */
    public void setSpecialInfo(Object specialInfo)
    {
        this.specialInfo = specialInfo;
    }

}
