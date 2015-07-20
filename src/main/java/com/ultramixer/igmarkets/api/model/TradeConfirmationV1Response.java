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

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class TradeConfirmationV1Response
{

    @Expose
    private String status;
    @Expose
    private String reason;
    @Expose
    private String dealStatus;
    @Expose
    private String epic;
    @Expose
    private String expiry;
    @Expose
    private String dealReference;
    @Expose
    private String dealId;
    @Expose
    private List<Object> affectedDeals = new ArrayList<Object>();
    @Expose
    private BigDecimal level;
    @Expose
    private Double size;
    @Expose
    private String direction;
    @Expose
    private BigDecimal stopLevel;
    @Expose
    private BigDecimal limitLevel;
    @Expose
    private BigDecimal stopDistance;
    @Expose
    private BigDecimal limitDistance;
    @Expose
    private Boolean guaranteedStop;
    @Expose
    private Boolean trailingStop;


    /**
     * @return The status
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status)
    {
        this.status = status;
    }

    /**
     * @return The reason
     */
    public String getReason()
    {
        return reason;
    }

    /**
     * @param reason The reason
     */
    public void setReason(String reason)
    {
        this.reason = reason;
    }

    /**
     * @return The dealStatus
     */
    public String getDealStatus()
    {
        return dealStatus;
    }

    /**
     * @param dealStatus The dealStatus
     */
    public void setDealStatus(String dealStatus)
    {
        this.dealStatus = dealStatus;
    }

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
     * @return The dealReference
     */
    public String getDealReference()
    {
        return dealReference;
    }

    /**
     * @param dealReference The dealReference
     */
    public void setDealReference(String dealReference)
    {
        this.dealReference = dealReference;
    }

    /**
     * @return The dealId
     */
    public String getDealId()
    {
        return dealId;
    }

    /**
     * @param dealId The dealId
     */
    public void setDealId(String dealId)
    {
        this.dealId = dealId;
    }

    /**
     * @return The affectedDeals
     */
    public List<Object> getAffectedDeals()
    {
        return affectedDeals;
    }

    /**
     * @param affectedDeals The affectedDeals
     */
    public void setAffectedDeals(List<Object> affectedDeals)
    {
        this.affectedDeals = affectedDeals;
    }

    /**
     * @return The level
     */
    public BigDecimal getLevel()
    {
        return level;
    }

    /**
     * @param level The level
     */
    public void setLevel(BigDecimal level)
    {
        this.level = level;
    }

    /**
     * @return The size
     */
    public Double getSize()
    {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Double size)
    {
        this.size = size;
    }

    /**
     * @return The direction
     */
    public String getDirection()
    {
        return direction;
    }

    /**
     * @param direction The direction
     */
    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    /**
     * @return The stopLevel
     */
    public Object getStopLevel()
    {
        return stopLevel;
    }

    /**
     * @param stopLevel The stopLevel
     */
    public void setStopLevel(BigDecimal stopLevel)
    {
        this.stopLevel = stopLevel;
    }

    /**
     * @return The limitLevel
     */
    public BigDecimal getLimitLevel()
    {
        return limitLevel;
    }

    /**
     * @param limitLevel The limitLevel
     */
    public void setLimitLevel(BigDecimal limitLevel)
    {
        this.limitLevel = limitLevel;
    }

    /**
     * @return The stopDistance
     */
    public BigDecimal getStopDistance()
    {
        return stopDistance;
    }

    /**
     * @param stopDistance The stopDistance
     */
    public void setStopDistance(BigDecimal stopDistance)
    {
        this.stopDistance = stopDistance;
    }

    /**
     * @return The limitDistance
     */
    public BigDecimal getLimitDistance()
    {
        return limitDistance;
    }

    /**
     * @param limitDistance The limitDistance
     */
    public void setLimitDistance(BigDecimal limitDistance)
    {
        this.limitDistance = limitDistance;
    }

    /**
     * @return The guaranteedStop
     */
    public Boolean getGuaranteedStop()
    {
        return guaranteedStop;
    }

    /**
     * @param guaranteedStop The guaranteedStop
     */
    public void setGuaranteedStop(Boolean guaranteedStop)
    {
        this.guaranteedStop = guaranteedStop;
    }

    /**
     * @return The trailingStop
     */
    public Boolean getTrailingStop()
    {
        return trailingStop;
    }

    /**
     * @param trailingStop The trailingStop
     */
    public void setTrailingStop(Boolean trailingStop)
    {
        this.trailingStop = trailingStop;
    }

}
