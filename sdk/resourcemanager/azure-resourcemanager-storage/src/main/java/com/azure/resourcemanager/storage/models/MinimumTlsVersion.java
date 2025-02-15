// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this
 * property.
 */
public final class MinimumTlsVersion extends ExpandableStringEnum<MinimumTlsVersion> {
    /** Static value TLS1_0 for MinimumTlsVersion. */
    public static final MinimumTlsVersion TLS1_0 = fromString("TLS1_0");

    /** Static value TLS1_1 for MinimumTlsVersion. */
    public static final MinimumTlsVersion TLS1_1 = fromString("TLS1_1");

    /** Static value TLS1_2 for MinimumTlsVersion. */
    public static final MinimumTlsVersion TLS1_2 = fromString("TLS1_2");

    /**
     * Creates or finds a MinimumTlsVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MinimumTlsVersion.
     */
    @JsonCreator
    public static MinimumTlsVersion fromString(String name) {
        return fromString(name, MinimumTlsVersion.class);
    }

    /**
     * Gets known MinimumTlsVersion values.
     *
     * @return known MinimumTlsVersion values.
     */
    public static Collection<MinimumTlsVersion> values() {
        return values(MinimumTlsVersion.class);
    }
}
