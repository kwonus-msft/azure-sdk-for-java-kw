// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.DatastoreDataInner;

/** An immutable client-side representation of DatastoreData. */
public interface DatastoreData {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: [Required] Additional attributes of the entity.
     *
     * @return the properties value.
     */
    DatastoreDetails properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.DatastoreDataInner object.
     *
     * @return the inner object.
     */
    DatastoreDataInner innerModel();

    /** The entirety of the DatastoreData definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The DatastoreData definition stages. */
    interface DefinitionStages {
        /** The first stage of the DatastoreData definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DatastoreData definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the DatastoreData definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             *
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            WithCreate withProperties(DatastoreDetails properties);
        }
        /**
         * The stage of the DatastoreData definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithSkipValidation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DatastoreData create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DatastoreData create(Context context);
        }
        /** The stage of the DatastoreData definition allowing to specify skipValidation. */
        interface WithSkipValidation {
            /**
             * Specifies the skipValidation property: Flag to skip validation..
             *
             * @param skipValidation Flag to skip validation.
             * @return the next definition stage.
             */
            WithCreate withSkipValidation(Boolean skipValidation);
        }
    }
    /**
     * Begins update for the DatastoreData resource.
     *
     * @return the stage of resource update.
     */
    DatastoreData.Update update();

    /** The template for DatastoreData update. */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithSkipValidation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DatastoreData apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DatastoreData apply(Context context);
    }
    /** The DatastoreData update stages. */
    interface UpdateStages {
        /** The stage of the DatastoreData update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             *
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            Update withProperties(DatastoreDetails properties);
        }
        /** The stage of the DatastoreData update allowing to specify skipValidation. */
        interface WithSkipValidation {
            /**
             * Specifies the skipValidation property: Flag to skip validation..
             *
             * @param skipValidation Flag to skip validation.
             * @return the next definition stage.
             */
            Update withSkipValidation(Boolean skipValidation);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DatastoreData refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DatastoreData refresh(Context context);

    /**
     * Get datastore secrets.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return datastore secrets.
     */
    DatastoreSecrets listSecrets();

    /**
     * Get datastore secrets.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return datastore secrets along with {@link Response}.
     */
    Response<DatastoreSecrets> listSecretsWithResponse(Context context);
}
