// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An action with its associated features used for ranking. */
@Fluent
public final class RankableAction {
    /*
     * Id of the action.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * List of dictionaries containing features.
     */
    @JsonProperty(value = "features", required = true)
    private List<Object> features;

    /**
     * Get the id property: Id of the action.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id of the action.
     *
     * @param id the id value to set.
     * @return the RankableAction object itself.
     */
    public RankableAction setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the features property: List of dictionaries containing features.
     *
     * @return the features value.
     */
    public List<Object> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: List of dictionaries containing features.
     *
     * @param features the features value to set.
     * @return the RankableAction object itself.
     */
    public RankableAction setFeatures(List<Object> features) {
        this.features = features;
        return this;
    }
}
