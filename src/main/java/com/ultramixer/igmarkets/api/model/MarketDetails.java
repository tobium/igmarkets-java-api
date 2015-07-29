
package com.ultramixer.igmarkets.api.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class MarketDetails {

    @Expose
    private Instrument instrument;
    @Expose
    private DealingRules dealingRules;
    @Expose
    private Snapshot snapshot;

    /**
     * 
     * @return
     *     The instrument
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * 
     * @param instrument
     *     The instrument
     */
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    /**
     * 
     * @return
     *     The dealingRules
     */
    public DealingRules getDealingRules() {
        return dealingRules;
    }

    /**
     * 
     * @param dealingRules
     *     The dealingRules
     */
    public void setDealingRules(DealingRules dealingRules) {
        this.dealingRules = dealingRules;
    }

    /**
     * 
     * @return
     *     The snapshot
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * 
     * @param snapshot
     *     The snapshot
     */
    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

}
