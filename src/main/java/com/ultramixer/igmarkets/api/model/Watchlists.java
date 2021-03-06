
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
public class Watchlists {

    @Expose
    private List<Watchlist> watchlists = new ArrayList<Watchlist>();

    /**
     * 
     * @return
     *     The watchlists
     */
    public List<Watchlist> getWatchlists() {
        return watchlists;
    }

    /**
     * 
     * @param watchlists
     *     The watchlists
     */
    public void setWatchlists(List<Watchlist> watchlists) {
        this.watchlists = watchlists;
    }

}
