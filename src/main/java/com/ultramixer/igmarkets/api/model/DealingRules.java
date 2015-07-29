
package com.ultramixer.igmarkets.api.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class DealingRules {

    @Expose
    private MinStepDistance minStepDistance;
    @Expose
    private MinDealSize minDealSize;
    @Expose
    private MinControlledRiskStopDistance minControlledRiskStopDistance;
    @Expose
    private MinNormalStopOrLimitDistance minNormalStopOrLimitDistance;
    @Expose
    private MaxStopOrLimitDistance maxStopOrLimitDistance;
    @Expose
    private String marketOrderPreference;
    @Expose
    private String trailingStopsPreference;

    /**
     * 
     * @return
     *     The minStepDistance
     */
    public MinStepDistance getMinStepDistance() {
        return minStepDistance;
    }

    /**
     * 
     * @param minStepDistance
     *     The minStepDistance
     */
    public void setMinStepDistance(MinStepDistance minStepDistance) {
        this.minStepDistance = minStepDistance;
    }

    /**
     * 
     * @return
     *     The minDealSize
     */
    public MinDealSize getMinDealSize() {
        return minDealSize;
    }

    /**
     * 
     * @param minDealSize
     *     The minDealSize
     */
    public void setMinDealSize(MinDealSize minDealSize) {
        this.minDealSize = minDealSize;
    }

    /**
     * 
     * @return
     *     The minControlledRiskStopDistance
     */
    public MinControlledRiskStopDistance getMinControlledRiskStopDistance() {
        return minControlledRiskStopDistance;
    }

    /**
     * 
     * @param minControlledRiskStopDistance
     *     The minControlledRiskStopDistance
     */
    public void setMinControlledRiskStopDistance(MinControlledRiskStopDistance minControlledRiskStopDistance) {
        this.minControlledRiskStopDistance = minControlledRiskStopDistance;
    }

    /**
     * 
     * @return
     *     The minNormalStopOrLimitDistance
     */
    public MinNormalStopOrLimitDistance getMinNormalStopOrLimitDistance() {
        return minNormalStopOrLimitDistance;
    }

    /**
     * 
     * @param minNormalStopOrLimitDistance
     *     The minNormalStopOrLimitDistance
     */
    public void setMinNormalStopOrLimitDistance(MinNormalStopOrLimitDistance minNormalStopOrLimitDistance) {
        this.minNormalStopOrLimitDistance = minNormalStopOrLimitDistance;
    }

    /**
     * 
     * @return
     *     The maxStopOrLimitDistance
     */
    public MaxStopOrLimitDistance getMaxStopOrLimitDistance() {
        return maxStopOrLimitDistance;
    }

    /**
     * 
     * @param maxStopOrLimitDistance
     *     The maxStopOrLimitDistance
     */
    public void setMaxStopOrLimitDistance(MaxStopOrLimitDistance maxStopOrLimitDistance) {
        this.maxStopOrLimitDistance = maxStopOrLimitDistance;
    }

    /**
     * 
     * @return
     *     The marketOrderPreference
     */
    public String getMarketOrderPreference() {
        return marketOrderPreference;
    }

    /**
     * 
     * @param marketOrderPreference
     *     The marketOrderPreference
     */
    public void setMarketOrderPreference(String marketOrderPreference) {
        this.marketOrderPreference = marketOrderPreference;
    }

    /**
     * 
     * @return
     *     The trailingStopsPreference
     */
    public String getTrailingStopsPreference() {
        return trailingStopsPreference;
    }

    /**
     * 
     * @param trailingStopsPreference
     *     The trailingStopsPreference
     */
    public void setTrailingStopsPreference(String trailingStopsPreference) {
        this.trailingStopsPreference = trailingStopsPreference;
    }

}
