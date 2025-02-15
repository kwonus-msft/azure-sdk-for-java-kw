// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Specify action need to be taken when rule type is Alert. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName(
    "Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources"
        + ".ScheduledQueryRules.AlertingAction")
@Fluent
public final class AlertingAction extends Action {
    /*
     * Severity of the alert
     */
    @JsonProperty(value = "severity", required = true)
    private AlertSeverity severity;

    /*
     * Azure action group reference.
     */
    @JsonProperty(value = "aznsAction")
    private AzNsActionGroup aznsAction;

    /*
     * time (in minutes) for which Alerts should be throttled or suppressed.
     */
    @JsonProperty(value = "throttlingInMin")
    private Integer throttlingInMin;

    /*
     * The trigger condition that results in the alert rule being.
     */
    @JsonProperty(value = "trigger", required = true)
    private TriggerCondition trigger;

    /**
     * Get the severity property: Severity of the alert.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Severity of the alert.
     *
     * @param severity the severity value to set.
     * @return the AlertingAction object itself.
     */
    public AlertingAction withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the aznsAction property: Azure action group reference.
     *
     * @return the aznsAction value.
     */
    public AzNsActionGroup aznsAction() {
        return this.aznsAction;
    }

    /**
     * Set the aznsAction property: Azure action group reference.
     *
     * @param aznsAction the aznsAction value to set.
     * @return the AlertingAction object itself.
     */
    public AlertingAction withAznsAction(AzNsActionGroup aznsAction) {
        this.aznsAction = aznsAction;
        return this;
    }

    /**
     * Get the throttlingInMin property: time (in minutes) for which Alerts should be throttled or suppressed.
     *
     * @return the throttlingInMin value.
     */
    public Integer throttlingInMin() {
        return this.throttlingInMin;
    }

    /**
     * Set the throttlingInMin property: time (in minutes) for which Alerts should be throttled or suppressed.
     *
     * @param throttlingInMin the throttlingInMin value to set.
     * @return the AlertingAction object itself.
     */
    public AlertingAction withThrottlingInMin(Integer throttlingInMin) {
        this.throttlingInMin = throttlingInMin;
        return this;
    }

    /**
     * Get the trigger property: The trigger condition that results in the alert rule being.
     *
     * @return the trigger value.
     */
    public TriggerCondition trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The trigger condition that results in the alert rule being.
     *
     * @param trigger the trigger value to set.
     * @return the AlertingAction object itself.
     */
    public AlertingAction withTrigger(TriggerCondition trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (severity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property severity in model AlertingAction"));
        }
        if (aznsAction() != null) {
            aznsAction().validate();
        }
        if (trigger() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property trigger in model AlertingAction"));
        } else {
            trigger().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AlertingAction.class);
}
