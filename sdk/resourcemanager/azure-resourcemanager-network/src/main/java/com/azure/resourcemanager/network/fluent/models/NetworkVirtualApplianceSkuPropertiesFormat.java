// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.NetworkVirtualApplianceSkuInstances;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network Virtual Appliance Sku Properties
 *
 * <p>Properties specific to NetworkVirtualApplianceSkus.
 */
@Fluent
public final class NetworkVirtualApplianceSkuPropertiesFormat {
    /*
     * Network Virtual Appliance Sku vendor.
     */
    @JsonProperty(value = "vendor", access = JsonProperty.Access.WRITE_ONLY)
    private String vendor;

    /*
     * Available Network Virtual Appliance versions.
     */
    @JsonProperty(value = "availableVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> availableVersions;

    /*
     * The list of scale units available.
     */
    @JsonProperty(value = "availableScaleUnits")
    private List<NetworkVirtualApplianceSkuInstances> availableScaleUnits;

    /**
     * Get the vendor property: Network Virtual Appliance Sku vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Get the availableVersions property: Available Network Virtual Appliance versions.
     *
     * @return the availableVersions value.
     */
    public List<String> availableVersions() {
        return this.availableVersions;
    }

    /**
     * Get the availableScaleUnits property: The list of scale units available.
     *
     * @return the availableScaleUnits value.
     */
    public List<NetworkVirtualApplianceSkuInstances> availableScaleUnits() {
        return this.availableScaleUnits;
    }

    /**
     * Set the availableScaleUnits property: The list of scale units available.
     *
     * @param availableScaleUnits the availableScaleUnits value to set.
     * @return the NetworkVirtualApplianceSkuPropertiesFormat object itself.
     */
    public NetworkVirtualApplianceSkuPropertiesFormat withAvailableScaleUnits(
        List<NetworkVirtualApplianceSkuInstances> availableScaleUnits) {
        this.availableScaleUnits = availableScaleUnits;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableScaleUnits() != null) {
            availableScaleUnits().forEach(e -> e.validate());
        }
    }
}
