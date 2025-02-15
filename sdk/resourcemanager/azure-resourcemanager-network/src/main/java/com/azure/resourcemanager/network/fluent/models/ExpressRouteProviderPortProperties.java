// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of ExpressRouteProviderPort. */
@Fluent
public final class ExpressRouteProviderPortProperties {
    /*
     * The name of the port pair.
     */
    @JsonProperty(value = "portPairDescriptor", access = JsonProperty.Access.WRITE_ONLY)
    private String portPairDescriptor;

    /*
     * The name of the primary port.
     */
    @JsonProperty(value = "primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /*
     * The name of the secondary port.
     */
    @JsonProperty(value = "secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /*
     * The peering location of the port pair.
     */
    @JsonProperty(value = "peeringLocation")
    private String peeringLocation;

    /*
     * Overprovisioning factor for the port pair.
     */
    @JsonProperty(value = "overprovisionFactor")
    private Integer overprovisionFactor;

    /*
     * Bandwidth of the port in Mbps
     */
    @JsonProperty(value = "portBandwidthInMbps")
    private Integer portBandwidthInMbps;

    /*
     * Used Bandwidth of the port in Mbps
     */
    @JsonProperty(value = "usedBandwidthInMbps")
    private Integer usedBandwidthInMbps;

    /*
     * Remaining Bandwidth of the port in Mbps
     */
    @JsonProperty(value = "remainingBandwidthInMbps")
    private Integer remainingBandwidthInMbps;

    /**
     * Get the portPairDescriptor property: The name of the port pair.
     *
     * @return the portPairDescriptor value.
     */
    public String portPairDescriptor() {
        return this.portPairDescriptor;
    }

    /**
     * Get the primaryAzurePort property: The name of the primary port.
     *
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The name of the secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the peeringLocation property: The peering location of the port pair.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The peering location of the port pair.
     *
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the overprovisionFactor property: Overprovisioning factor for the port pair.
     *
     * @return the overprovisionFactor value.
     */
    public Integer overprovisionFactor() {
        return this.overprovisionFactor;
    }

    /**
     * Set the overprovisionFactor property: Overprovisioning factor for the port pair.
     *
     * @param overprovisionFactor the overprovisionFactor value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withOverprovisionFactor(Integer overprovisionFactor) {
        this.overprovisionFactor = overprovisionFactor;
        return this;
    }

    /**
     * Get the portBandwidthInMbps property: Bandwidth of the port in Mbps.
     *
     * @return the portBandwidthInMbps value.
     */
    public Integer portBandwidthInMbps() {
        return this.portBandwidthInMbps;
    }

    /**
     * Set the portBandwidthInMbps property: Bandwidth of the port in Mbps.
     *
     * @param portBandwidthInMbps the portBandwidthInMbps value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withPortBandwidthInMbps(Integer portBandwidthInMbps) {
        this.portBandwidthInMbps = portBandwidthInMbps;
        return this;
    }

    /**
     * Get the usedBandwidthInMbps property: Used Bandwidth of the port in Mbps.
     *
     * @return the usedBandwidthInMbps value.
     */
    public Integer usedBandwidthInMbps() {
        return this.usedBandwidthInMbps;
    }

    /**
     * Set the usedBandwidthInMbps property: Used Bandwidth of the port in Mbps.
     *
     * @param usedBandwidthInMbps the usedBandwidthInMbps value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withUsedBandwidthInMbps(Integer usedBandwidthInMbps) {
        this.usedBandwidthInMbps = usedBandwidthInMbps;
        return this;
    }

    /**
     * Get the remainingBandwidthInMbps property: Remaining Bandwidth of the port in Mbps.
     *
     * @return the remainingBandwidthInMbps value.
     */
    public Integer remainingBandwidthInMbps() {
        return this.remainingBandwidthInMbps;
    }

    /**
     * Set the remainingBandwidthInMbps property: Remaining Bandwidth of the port in Mbps.
     *
     * @param remainingBandwidthInMbps the remainingBandwidthInMbps value to set.
     * @return the ExpressRouteProviderPortProperties object itself.
     */
    public ExpressRouteProviderPortProperties withRemainingBandwidthInMbps(Integer remainingBandwidthInMbps) {
        this.remainingBandwidthInMbps = remainingBandwidthInMbps;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
