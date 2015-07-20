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

@Generated("org.jsonschema2pojo")
public class WorkingOrderV2Request
{

    @Expose
    private String epic;
    @Expose
    private String expiry;
    @Expose
    private Direction direction;
    @Expose
    private Double size;
    @Expose
    private BigDecimal level;
    @Expose
    private Boolean forceOpen;
    @Expose
    private Type type;
    @Expose
    private String currencyCode;
    @Expose
    private TimeInForce timeInForce;
    @Expose
    private String goodTillDate;
    @Expose
    private Boolean guaranteedStop;
    @Expose
    private Integer stopDistance;
    @Expose
    private Integer limitDistance;
    @Expose
    private BigDecimal limitLevel;

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
     * @return The direction
     */
    public Direction getDirection()
    {
        return direction;
    }

    /**
     * @param direction The direction
     */
    public void setDirection(Direction direction)
    {
        this.direction = direction;
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
     * @return The forceOpen
     */
    public Boolean getForceOpen()
    {
        return forceOpen;
    }

    /**
     * @param forceOpen The forceOpen
     */
    public void setForceOpen(Boolean forceOpen)
    {
        this.forceOpen = forceOpen;
    }

    /**
     * @return The type
     */
    public Type getType()
    {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(Type type)
    {
        this.type = type;
    }

    /**
     * @return The currencyCode
     */
    public String getCurrencyCode()
    {
        return currencyCode;
    }

    /**
     * @param currencyCode The currencyCode
     */
    public void setCurrencyCode(String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    /**
     * @return The timeInForce
     */
    public TimeInForce getTimeInForce()
    {
        return timeInForce;
    }

    /**
     * @param timeInForce The timeInForce
     */
    public void setTimeInForce(TimeInForce timeInForce)
    {
        this.timeInForce = timeInForce;
    }

    /**
     * @return The goodTillDate
     */
    public Object getGoodTillDate()
    {
        return goodTillDate;
    }

    /**
     * @param goodTillDate The goodTillDate
     */
    public void setGoodTillDate(String goodTillDate)
    {
        this.goodTillDate = goodTillDate;
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
     * @return The stopDistance
     */
    public int getStopDistance()
    {
        return stopDistance;
    }

    /**
     * @param stopDistance The stopDistance
     */
    public void setStopDistance(int stopDistance)
    {
        this.stopDistance = stopDistance;
    }

    /**
     * @return The limitDistance
     */
    public Integer getLimitDistance()
    {
        return limitDistance;
    }

    /**
     * @param limitDistance The limitDistance
     */
    public void setLimitDistance(int limitDistance)
    {
        this.limitDistance = limitDistance;
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


    public enum Direction
    {
        SELL("SELL"),
        BUY("BUY");

        public String id;

        Direction(String id)
        {

            this.id = id;
        }
    }

    public enum TimeInForce
    {
        GOOD_TILL_CANCELLED("GOOD_TILL_CANCELLED"),
        GOOD_TILL_DATE("GOOD_TILL_DATE");

        public String id;

        TimeInForce(String id)
        {

            this.id = id;
        }
    }

    public enum Type
    {
        LIMIT("LIMIT"),
        STOP("STOP");

        public String id;

        Type(String id)
        {

            this.id = id;
        }
    }


}
