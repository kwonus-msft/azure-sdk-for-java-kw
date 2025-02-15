// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ConfigurationType;
import com.azure.resourcemanager.network.models.NetworkManagerPropertiesNetworkManagerScopes;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Managed Network. */
@Fluent
public final class NetworkManagerProperties {
    /*
     * A description of the network manager.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Scope of Network Manager.
     */
    @JsonProperty(value = "networkManagerScopes", required = true)
    private NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes;

    /*
     * Scope Access.
     */
    @JsonProperty(value = "networkManagerScopeAccesses", required = true)
    private List<ConfigurationType> networkManagerScopeAccesses;

    /*
     * The provisioning state of the network manager resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the description property: A description of the network manager.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of the network manager.
     *
     * @param description the description value to set.
     * @return the NetworkManagerProperties object itself.
     */
    public NetworkManagerProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the networkManagerScopes property: Scope of Network Manager.
     *
     * @return the networkManagerScopes value.
     */
    public NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes() {
        return this.networkManagerScopes;
    }

    /**
     * Set the networkManagerScopes property: Scope of Network Manager.
     *
     * @param networkManagerScopes the networkManagerScopes value to set.
     * @return the NetworkManagerProperties object itself.
     */
    public NetworkManagerProperties withNetworkManagerScopes(
        NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes) {
        this.networkManagerScopes = networkManagerScopes;
        return this;
    }

    /**
     * Get the networkManagerScopeAccesses property: Scope Access.
     *
     * @return the networkManagerScopeAccesses value.
     */
    public List<ConfigurationType> networkManagerScopeAccesses() {
        return this.networkManagerScopeAccesses;
    }

    /**
     * Set the networkManagerScopeAccesses property: Scope Access.
     *
     * @param networkManagerScopeAccesses the networkManagerScopeAccesses value to set.
     * @return the NetworkManagerProperties object itself.
     */
    public NetworkManagerProperties withNetworkManagerScopeAccesses(
        List<ConfigurationType> networkManagerScopeAccesses) {
        this.networkManagerScopeAccesses = networkManagerScopeAccesses;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network manager resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkManagerScopes() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkManagerScopes in model NetworkManagerProperties"));
        } else {
            networkManagerScopes().validate();
        }
        if (networkManagerScopeAccesses() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkManagerScopeAccesses in model NetworkManagerProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkManagerProperties.class);
}
