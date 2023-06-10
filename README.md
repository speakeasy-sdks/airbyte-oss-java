# airbyte-test

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'WayScript.airbyte_test:airbyte-test:1.10.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SaveStatsResponse;
import WayScript.airbyte_test.models.shared.AttemptStats;
import WayScript.airbyte_test.models.shared.AttemptStreamStats;
import WayScript.airbyte_test.models.shared.SaveStatsRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SaveStatsRequestBody req = new SaveStatsRequestBody(548814, 592845L,                 new AttemptStats() {{
                                bytesEmitted = 715190L;
                                estimatedBytes = 844266L;
                                estimatedRecords = 602763L;
                                recordsCommitted = 857946L;
                                recordsEmitted = 544883L;
                                stateMessagesEmitted = 847252L;
                            }};) {{
                streamStats = new WayScript.airbyte_test.models.shared.AttemptStreamStats[]{{
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 272656L;
                                        estimatedBytes = 383441L;
                                        estimatedRecords = 477665L;
                                        recordsCommitted = 791725L;
                                        recordsEmitted = 812169L;
                                        stateMessagesEmitted = 528895L;
                                    }};, "iusto") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 623564L;
                            estimatedBytes = 645894L;
                            estimatedRecords = 384382L;
                            recordsCommitted = 437587L;
                            recordsEmitted = 297534L;
                            stateMessagesEmitted = 891773L;
                        }};
                        streamName = "ipsa";
                        streamNamespace = "delectus";
                    }}),
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 20218L;
                                        estimatedBytes = 368241L;
                                        estimatedRecords = 832620L;
                                        recordsCommitted = 957156L;
                                        recordsEmitted = 778157L;
                                        stateMessagesEmitted = 140350L;
                                    }};, "at") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 568045L;
                            estimatedBytes = 392785L;
                            estimatedRecords = 925597L;
                            recordsCommitted = 836079L;
                            recordsEmitted = 71036L;
                            stateMessagesEmitted = 337396L;
                        }};
                        streamName = "veritatis";
                        streamNamespace = "deserunt";
                    }}),
                }};
            }};            

            SaveStatsResponse res = sdk.attempt.saveStats(req);

            if (res.internalOperationResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [attempt](docs/sdks/attempt/README.md)

* [saveStats](docs/sdks/attempt/README.md#savestats) - For worker to set sync stats of a running attempt.
* [saveSyncConfig](docs/sdks/attempt/README.md#savesyncconfig) - For worker to save the AttemptSyncConfig for an attempt.
* [setWorkflowInAttempt](docs/sdks/attempt/README.md#setworkflowinattempt) - For worker to register the workflow id in attempt.

### [connection](docs/sdks/connection/README.md)

* [createConnection](docs/sdks/connection/README.md#createconnection) - Create a connection between a source and a destination
* [deleteConnection](docs/sdks/connection/README.md#deleteconnection) - Delete a connection
* [getConnection](docs/sdks/connection/README.md#getconnection) - Get a connection
* [listAllConnectionsForWorkspace](docs/sdks/connection/README.md#listallconnectionsforworkspace) - Returns all connections for a workspace, including deleted connections.
* [listConnectionsForWorkspace](docs/sdks/connection/README.md#listconnectionsforworkspace) - Returns all connections for a workspace.
* [resetConnection](docs/sdks/connection/README.md#resetconnection) - Reset the data for the connection. Deletes data generated by the connection in the destination. Resets any cursors back to initial state.
* [searchConnections](docs/sdks/connection/README.md#searchconnections) - Search connections
* [syncConnection](docs/sdks/connection/README.md#syncconnection) - Trigger a manual sync of the connection
* [updateConnection](docs/sdks/connection/README.md#updateconnection) - Update a connection

### [destination](docs/sdks/destination/README.md)

* [checkConnectionToDestination](docs/sdks/destination/README.md#checkconnectiontodestination) - Check connection to the destination
* [checkConnectionToDestinationForUpdate](docs/sdks/destination/README.md#checkconnectiontodestinationforupdate) - Check connection for a proposed update to a destination
* [cloneDestination](docs/sdks/destination/README.md#clonedestination) - Clone destination
* [createDestination](docs/sdks/destination/README.md#createdestination) - Create a destination
* [deleteDestination](docs/sdks/destination/README.md#deletedestination) - Delete the destination
* [getDestination](docs/sdks/destination/README.md#getdestination) - Get configured destination
* [listDestinationsForWorkspace](docs/sdks/destination/README.md#listdestinationsforworkspace) - List configured destinations for a workspace
* [searchDestinations](docs/sdks/destination/README.md#searchdestinations) - Search destinations
* [updateDestination](docs/sdks/destination/README.md#updatedestination) - Update a destination

### [destinationDefinition](docs/sdks/destinationdefinition/README.md)

* [createCustomDestinationDefinition](docs/sdks/destinationdefinition/README.md#createcustomdestinationdefinition) - Creates a custom destinationDefinition for the given workspace
* [deleteDestinationDefinition](docs/sdks/destinationdefinition/README.md#deletedestinationdefinition) - Delete a destination definition
* [getDestinationDefinition](docs/sdks/destinationdefinition/README.md#getdestinationdefinition) - Get destinationDefinition
* [getDestinationDefinitionForWorkspace](docs/sdks/destinationdefinition/README.md#getdestinationdefinitionforworkspace) - Get a destinationDefinition that is configured for the given workspace
* [grantDestinationDefinitionToWorkspace](docs/sdks/destinationdefinition/README.md#grantdestinationdefinitiontoworkspace) - grant a private, non-custom destinationDefinition to a given workspace
* [listDestinationDefinitions](docs/sdks/destinationdefinition/README.md#listdestinationdefinitions) - List all the destinationDefinitions the current Airbyte deployment is configured to use
* [listDestinationDefinitionsForWorkspace](docs/sdks/destinationdefinition/README.md#listdestinationdefinitionsforworkspace) - List all the destinationDefinitions the given workspace is configured to use
* [listLatestDestinationDefinitions](docs/sdks/destinationdefinition/README.md#listlatestdestinationdefinitions) - List the latest destinationDefinitions Airbyte supports
* [listPrivateDestinationDefinitions](docs/sdks/destinationdefinition/README.md#listprivatedestinationdefinitions) - List all private, non-custom destinationDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.
* [revokeDestinationDefinitionFromWorkspace](docs/sdks/destinationdefinition/README.md#revokedestinationdefinitionfromworkspace) - revoke a grant to a private, non-custom destinationDefinition from a given workspace
* [updateDestinationDefinition](docs/sdks/destinationdefinition/README.md#updatedestinationdefinition) - Update destinationDefinition

### [destinationDefinitionSpecification](docs/sdks/destinationdefinitionspecification/README.md)

* [getDestinationDefinitionSpecification](docs/sdks/destinationdefinitionspecification/README.md#getdestinationdefinitionspecification) - Get specification for a destinationDefinition

### [destinationOauth](docs/sdks/destinationoauth/README.md)

* [completeDestinationOAuth](docs/sdks/destinationoauth/README.md#completedestinationoauth) - Given a destination def ID generate an access/refresh token etc.
* [getDestinationOAuthConsent](docs/sdks/destinationoauth/README.md#getdestinationoauthconsent) - Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.
* [setInstancewideDestinationOauthParams](docs/sdks/destinationoauth/README.md#setinstancewidedestinationoauthparams) - Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables.


### [health](docs/sdks/health/README.md)

* [getHealthCheck](docs/sdks/health/README.md#gethealthcheck) - Health Check

### [internal](docs/sdks/internal/README.md)

* [createOrUpdateState](docs/sdks/internal/README.md#createorupdatestate) - Create or update the state for a connection.
* [getAttemptNormalizationStatusesForJob](docs/sdks/internal/README.md#getattemptnormalizationstatusesforjob) - Get normalization status to determine if we can bypass normalization phase
* [saveStats](docs/sdks/internal/README.md#savestats) - For worker to set sync stats of a running attempt.
* [saveSyncConfig](docs/sdks/internal/README.md#savesyncconfig) - For worker to save the AttemptSyncConfig for an attempt.
* [setWorkflowInAttempt](docs/sdks/internal/README.md#setworkflowinattempt) - For worker to register the workflow id in attempt.
* [writeDiscoverCatalogResult](docs/sdks/internal/README.md#writediscovercatalogresult) - Should only called from worker, to write result from discover activity back to DB.

### [jobs](docs/sdks/jobs/README.md)

* [cancelJob](docs/sdks/jobs/README.md#canceljob) - Cancels a job
* [getAttemptNormalizationStatusesForJob](docs/sdks/jobs/README.md#getattemptnormalizationstatusesforjob) - Get normalization status to determine if we can bypass normalization phase
* [getJobDebugInfo](docs/sdks/jobs/README.md#getjobdebuginfo) - Gets all information needed to debug this job
* [getJobInfo](docs/sdks/jobs/README.md#getjobinfo) - Get information about a job
* [getJobInfoLight](docs/sdks/jobs/README.md#getjobinfolight) - Get information about a job excluding attempt info and logs
* [getLastReplicationJob](docs/sdks/jobs/README.md#getlastreplicationjob)
* [listJobsFor](docs/sdks/jobs/README.md#listjobsfor) - Returns recent jobs for a connection. Jobs are returned in descending order by createdAt.

### [logs](docs/sdks/logs/README.md)

* [getLogs](docs/sdks/logs/README.md#getlogs) - Get logs

### [notifications](docs/sdks/notifications/README.md)

* [tryNotificationConfig](docs/sdks/notifications/README.md#trynotificationconfig) - Try sending a notifications

### [openapi](docs/sdks/openapi/README.md)

* [getOpenApiSpec](docs/sdks/openapi/README.md#getopenapispec) - Returns the openapi specification

### [operation](docs/sdks/operation/README.md)

* [checkOperation](docs/sdks/operation/README.md#checkoperation) - Check if an operation to be created is valid
* [createOperation](docs/sdks/operation/README.md#createoperation) - Create an operation to be applied as part of a connection pipeline
* [deleteOperation](docs/sdks/operation/README.md#deleteoperation) - Delete an operation
* [getOperation](docs/sdks/operation/README.md#getoperation) - Returns an operation
* [listOperationsForConnection](docs/sdks/operation/README.md#listoperationsforconnection) - Returns all operations for a connection.
* [updateOperation](docs/sdks/operation/README.md#updateoperation) - Update an operation

### [scheduler](docs/sdks/scheduler/README.md)

* [executeDestinationCheckConnection](docs/sdks/scheduler/README.md#executedestinationcheckconnection) - Run check connection for a given destination configuration
* [executeSourceCheckConnection](docs/sdks/scheduler/README.md#executesourcecheckconnection) - Run check connection for a given source configuration
* [executeSourceDiscoverSchema](docs/sdks/scheduler/README.md#executesourcediscoverschema) - Run discover schema for a given source a source configuration

### [source](docs/sdks/source/README.md)

* [checkConnectionToSource](docs/sdks/source/README.md#checkconnectiontosource) - Check connection to the source
* [checkConnectionToSourceForUpdate](docs/sdks/source/README.md#checkconnectiontosourceforupdate) - Check connection for a proposed update to a source
* [cloneSource](docs/sdks/source/README.md#clonesource) - Clone source
* [createSource](docs/sdks/source/README.md#createsource) - Create a source
* [deleteSource](docs/sdks/source/README.md#deletesource) - Delete a source
* [discoverSchemaForSource](docs/sdks/source/README.md#discoverschemaforsource) - Discover the schema catalog of the source
* [getMostRecentSourceActorCatalog](docs/sdks/source/README.md#getmostrecentsourceactorcatalog) - Get most recent ActorCatalog for source
* [getSource](docs/sdks/source/README.md#getsource) - Get source
* [listSourcesForWorkspace](docs/sdks/source/README.md#listsourcesforworkspace) - List sources for workspace
* [searchSources](docs/sdks/source/README.md#searchsources) - Search sources
* [updateSource](docs/sdks/source/README.md#updatesource) - Update a source
* [writeDiscoverCatalogResult](docs/sdks/source/README.md#writediscovercatalogresult) - Should only called from worker, to write result from discover activity back to DB.

### [sourceDefinition](docs/sdks/sourcedefinition/README.md)

* [createCustomSourceDefinition](docs/sdks/sourcedefinition/README.md#createcustomsourcedefinition) - Creates a custom sourceDefinition for the given workspace
* [deleteSourceDefinition](docs/sdks/sourcedefinition/README.md#deletesourcedefinition) - Delete a source definition
* [getSourceDefinition](docs/sdks/sourcedefinition/README.md#getsourcedefinition) - Get source
* [getSourceDefinitionForWorkspace](docs/sdks/sourcedefinition/README.md#getsourcedefinitionforworkspace) - Get a sourceDefinition that is configured for the given workspace
* [grantSourceDefinitionToWorkspace](docs/sdks/sourcedefinition/README.md#grantsourcedefinitiontoworkspace) - grant a private, non-custom sourceDefinition to a given workspace
* [listLatestSourceDefinitions](docs/sdks/sourcedefinition/README.md#listlatestsourcedefinitions) - List the latest sourceDefinitions Airbyte supports
* [listPrivateSourceDefinitions](docs/sdks/sourcedefinition/README.md#listprivatesourcedefinitions) - List all private, non-custom sourceDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.
* [listSourceDefinitions](docs/sdks/sourcedefinition/README.md#listsourcedefinitions) - List all the sourceDefinitions the current Airbyte deployment is configured to use
* [listSourceDefinitionsForWorkspace](docs/sdks/sourcedefinition/README.md#listsourcedefinitionsforworkspace) - List all the sourceDefinitions the given workspace is configured to use
* [revokeSourceDefinitionFromWorkspace](docs/sdks/sourcedefinition/README.md#revokesourcedefinitionfromworkspace) - revoke a grant to a private, non-custom sourceDefinition from a given workspace
* [updateSourceDefinition](docs/sdks/sourcedefinition/README.md#updatesourcedefinition) - Update a sourceDefinition

### [sourceDefinitionSpecification](docs/sdks/sourcedefinitionspecification/README.md)

* [getSourceDefinitionSpecification](docs/sdks/sourcedefinitionspecification/README.md#getsourcedefinitionspecification) - Get specification for a SourceDefinition.

### [sourceOauth](docs/sdks/sourceoauth/README.md)

* [completeSourceOAuth](docs/sdks/sourceoauth/README.md#completesourceoauth) - Given a source def ID generate an access/refresh token etc.
* [getSourceOAuthConsent](docs/sdks/sourceoauth/README.md#getsourceoauthconsent) - Given a source connector definition ID, return the URL to the consent screen where to redirect the user to.
* [setInstancewideSourceOauthParams](docs/sdks/sourceoauth/README.md#setinstancewidesourceoauthparams) - Sets instancewide variables to be used for the oauth flow when creating this source. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables.


### [state](docs/sdks/state/README.md)

* [createOrUpdateState](docs/sdks/state/README.md#createorupdatestate) - Create or update the state for a connection.
* [getState](docs/sdks/state/README.md#getstate) - Fetch the current state for a connection.

### [webBackend](docs/sdks/webbackend/README.md)

* [getStateType](docs/sdks/webbackend/README.md#getstatetype) - Fetch the current state type for a connection.
* [webBackendCheckUpdates](docs/sdks/webbackend/README.md#webbackendcheckupdates) - Returns a summary of source and destination definitions that could be updated.
* [webBackendCreateConnection](docs/sdks/webbackend/README.md#webbackendcreateconnection) - Create a connection
* [webBackendGetConnection](docs/sdks/webbackend/README.md#webbackendgetconnection) - Get a connection
* [webBackendGetWorkspaceState](docs/sdks/webbackend/README.md#webbackendgetworkspacestate) - Returns the current state of a workspace
* [webBackendListConnectionsForWorkspace](docs/sdks/webbackend/README.md#webbackendlistconnectionsforworkspace) - Returns all non-deleted connections for a workspace.
* [webBackendListGeographies](docs/sdks/webbackend/README.md#webbackendlistgeographies) - Returns available geographies can be selected to run data syncs in a particular geography.
The 'auto' entry indicates that the sync will be automatically assigned to a geography according
to the platform default behavior. Entries other than 'auto' are two-letter country codes that
follow the ISO 3166-1 alpha-2 standard.

* [webBackendUpdateConnection](docs/sdks/webbackend/README.md#webbackendupdateconnection) - Update a connection

### [workspace](docs/sdks/workspace/README.md)

* [createWorkspace](docs/sdks/workspace/README.md#createworkspace) - Creates a workspace
* [deleteWorkspace](docs/sdks/workspace/README.md#deleteworkspace) - Deletes a workspace
* [getWorkspace](docs/sdks/workspace/README.md#getworkspace) - Find workspace by ID
* [getWorkspaceByConnectionId](docs/sdks/workspace/README.md#getworkspacebyconnectionid) - Find workspace by connection id
* [getWorkspaceBySlug](docs/sdks/workspace/README.md#getworkspacebyslug) - Find workspace by slug
* [listWorkspaces](docs/sdks/workspace/README.md#listworkspaces) - List all workspaces registered in the current Airbyte deployment
* [updateWorkspace](docs/sdks/workspace/README.md#updateworkspace) - Update workspace state
* [updateWorkspaceFeedback](docs/sdks/workspace/README.md#updateworkspacefeedback) - Update workspace feedback state
* [updateWorkspaceName](docs/sdks/workspace/README.md#updateworkspacename) - Update workspace name
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
