// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** This class contains the summary of evaluating a policy on a counterfactual evaluation. */
@Fluent
public class PolicyResultSummary {
    /*
     * Timestamp of the aggregation.
     */
    @JsonProperty(value = "timeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeStamp;

    /*
     * Numerator for IPS estimator.
     */
    @JsonProperty(value = "ipsEstimatorNumerator", access = JsonProperty.Access.WRITE_ONLY)
    private Float ipsEstimatorNumerator;

    /*
     * Denominator for IPS estimator.
     */
    @JsonProperty(value = "ipsEstimatorDenominator", access = JsonProperty.Access.WRITE_ONLY)
    private Float ipsEstimatorDenominator;

    /*
     * Denominator for SNIPS estimator.
     */
    @JsonProperty(value = "snipsEstimatorDenominator", access = JsonProperty.Access.WRITE_ONLY)
    private Float snipsEstimatorDenominator;

    /*
     * Time window for aggregation.
     * For example, PT5M (5 mins). For information about the time format,
     * see http://en.wikipedia.org/wiki/ISO_8601#Durations
     */
    @JsonProperty(value = "aggregateTimeWindow", access = JsonProperty.Access.WRITE_ONLY)
    private Duration aggregateTimeWindow;

    /*
     * Probability of non-zero values for the Policy evaluation.
     */
    @JsonProperty(value = "nonZeroProbability")
    private Float nonZeroProbability;

    /*
     * Sum of Squares for the Policy evaluation results.
     */
    @JsonProperty(value = "sumOfSquares", access = JsonProperty.Access.WRITE_ONLY)
    private Float sumOfSquares;

    /*
     * Gaussian confidence interval for the Policy evaluation.
     */
    @JsonProperty(value = "confidenceInterval", access = JsonProperty.Access.WRITE_ONLY)
    private Float confidenceInterval;

    /*
     * Average reward.
     */
    @JsonProperty(value = "averageReward", access = JsonProperty.Access.WRITE_ONLY)
    private Float averageReward;

    /**
     * Get the timeStamp property: Timestamp of the aggregation.
     *
     * @return the timeStamp value.
     */
    public OffsetDateTime getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Get the ipsEstimatorNumerator property: Numerator for IPS estimator.
     *
     * @return the ipsEstimatorNumerator value.
     */
    public Float getIpsEstimatorNumerator() {
        return this.ipsEstimatorNumerator;
    }

    /**
     * Get the ipsEstimatorDenominator property: Denominator for IPS estimator.
     *
     * @return the ipsEstimatorDenominator value.
     */
    public Float getIpsEstimatorDenominator() {
        return this.ipsEstimatorDenominator;
    }

    /**
     * Get the snipsEstimatorDenominator property: Denominator for SNIPS estimator.
     *
     * @return the snipsEstimatorDenominator value.
     */
    public Float getSnipsEstimatorDenominator() {
        return this.snipsEstimatorDenominator;
    }

    /**
     * Get the aggregateTimeWindow property: Time window for aggregation. For example, PT5M (5 mins). For information
     * about the time format, see http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @return the aggregateTimeWindow value.
     */
    public Duration getAggregateTimeWindow() {
        return this.aggregateTimeWindow;
    }

    /**
     * Get the nonZeroProbability property: Probability of non-zero values for the Policy evaluation.
     *
     * @return the nonZeroProbability value.
     */
    public Float getNonZeroProbability() {
        return this.nonZeroProbability;
    }

    /**
     * Set the nonZeroProbability property: Probability of non-zero values for the Policy evaluation.
     *
     * @param nonZeroProbability the nonZeroProbability value to set.
     * @return the PolicyResultSummary object itself.
     */
    public PolicyResultSummary setNonZeroProbability(Float nonZeroProbability) {
        this.nonZeroProbability = nonZeroProbability;
        return this;
    }

    /**
     * Get the sumOfSquares property: Sum of Squares for the Policy evaluation results.
     *
     * @return the sumOfSquares value.
     */
    public Float getSumOfSquares() {
        return this.sumOfSquares;
    }

    /**
     * Get the confidenceInterval property: Gaussian confidence interval for the Policy evaluation.
     *
     * @return the confidenceInterval value.
     */
    public Float getConfidenceInterval() {
        return this.confidenceInterval;
    }

    /**
     * Get the averageReward property: Average reward.
     *
     * @return the averageReward value.
     */
    public Float getAverageReward() {
        return this.averageReward;
    }
}
