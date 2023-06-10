# webBackend

## Overview

Endpoints for the Airbyte web application. Those APIs should not be called outside the web application implementation and are not
guaranteeing any backwards compatibility.


### Available Operations

* [getStateType](#getstatetype) - Fetch the current state type for a connection.
* [webBackendCheckUpdates](#webbackendcheckupdates) - Returns a summary of source and destination definitions that could be updated.
* [webBackendCreateConnection](#webbackendcreateconnection) - Create a connection
* [webBackendGetConnection](#webbackendgetconnection) - Get a connection
* [webBackendGetWorkspaceState](#webbackendgetworkspacestate) - Returns the current state of a workspace
* [webBackendListConnectionsForWorkspace](#webbackendlistconnectionsforworkspace) - Returns all non-deleted connections for a workspace.
* [webBackendListGeographies](#webbackendlistgeographies) - Returns available geographies can be selected to run data syncs in a particular geography.
The 'auto' entry indicates that the sync will be automatically assigned to a geography according
to the platform default behavior. Entries other than 'auto' are two-letter country codes that
follow the ISO 3166-1 alpha-2 standard.

* [webBackendUpdateConnection](#webbackendupdateconnection) - Update a connection

## getStateType

Fetch the current state type for a connection.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetStateTypeResponse;
import WayScript.airbyte_test.models.shared.ConnectionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("379aa69c-d5fb-4cf7-9da1-8a7822bf9589");            

            GetStateTypeResponse res = sdk.webBackend.getStateType(req);

            if (res.connectionStateType != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [WayScript.airbyte_test.models.shared.ConnectionIdRequestBody](../../models/shared/ConnectionIdRequestBody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.GetStateTypeResponse](../../models/operations/GetStateTypeResponse.md)**


## webBackendCheckUpdates

Returns a summary of source and destination definitions that could be updated.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendCheckUpdatesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WebBackendCheckUpdatesResponse res = sdk.webBackend.webBackendCheckUpdates();

            if (res.webBackendCheckUpdatesRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.WebBackendCheckUpdatesResponse](../../models/operations/WebBackendCheckUpdatesResponse.md)**


## webBackendCreateConnection

Create a connection

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendCreateConnectionResponse;
import WayScript.airbyte_test.models.shared.AirbyteCatalog;
import WayScript.airbyte_test.models.shared.AirbyteStream;
import WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration;
import WayScript.airbyte_test.models.shared.AirbyteStreamConfiguration;
import WayScript.airbyte_test.models.shared.ConnectionSchedule;
import WayScript.airbyte_test.models.shared.ConnectionScheduleData;
import WayScript.airbyte_test.models.shared.ConnectionScheduleDataBasicSchedule;
import WayScript.airbyte_test.models.shared.ConnectionScheduleDataBasicScheduleTimeUnit;
import WayScript.airbyte_test.models.shared.ConnectionScheduleDataCron;
import WayScript.airbyte_test.models.shared.ConnectionScheduleTimeUnit;
import WayScript.airbyte_test.models.shared.ConnectionScheduleType;
import WayScript.airbyte_test.models.shared.ConnectionStatus;
import WayScript.airbyte_test.models.shared.DestinationSyncMode;
import WayScript.airbyte_test.models.shared.Geography;
import WayScript.airbyte_test.models.shared.NamespaceDefinitionType;
import WayScript.airbyte_test.models.shared.NonBreakingChangesPreference;
import WayScript.airbyte_test.models.shared.OperationCreate;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOption;
import WayScript.airbyte_test.models.shared.OperatorType;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookType;
import WayScript.airbyte_test.models.shared.ResourceRequirements;
import WayScript.airbyte_test.models.shared.SelectedFieldInfo;
import WayScript.airbyte_test.models.shared.StreamJsonSchema;
import WayScript.airbyte_test.models.shared.SyncMode;
import WayScript.airbyte_test.models.shared.WebBackendConnectionCreate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WebBackendConnectionCreate req = new WebBackendConnectionCreate("4e6861ad-b55f-49e5-9751-c9fe8f7502bf", "dc345084-1f17-4644-9637-9f3fb27e21f8", ConnectionStatus.INACTIVE) {{
                geography = Geography.AUTO;
                name = "Ida Kihn";
                namespaceDefinition = NamespaceDefinitionType.DESTINATION;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingChangesPreference = NonBreakingChangesPreference.DISABLE;
                operationIds = new String[]{{
                    add("6b9f587c-e525-4c67-a41a-8312e5047b4c"),
                    add("21ccb423-abcd-4c91-baab-dd88e71f6c48"),
                    add("252d7771-e7fd-4074-809e-f8d29de1dd70"),
                    add("97b5da08-c57f-4a6c-b8a2-16e19bafeca6"),
                }};
                operations = new WayScript.airbyte_test.models.shared.OperationCreate[]{{
                    add(new OperationCreate("repudiandae",                 new OperatorConfiguration(OperatorType.NORMALIZATION) {{
                                        dbt = new OperatorDbt("quod") {{
                                            dbtArguments = "dolorem";
                                            dockerImage = "neque";
                                            gitRepoBranch = "ipsa";
                                        }};;
                                        normalization = new OperatorNormalization() {{
                                            option = OperatorNormalizationOption.BASIC;
                                        }};;
                                        webhook = new OperatorWebhook() {{
                                            dbtCloud = new OperatorWebhookDbtCloud(570047L, 831105L);;
                                            executionBody = "soluta";
                                            executionUrl = "aut";
                                            webhookConfigId = "536d9e75-ca00-46f5-b92c-11a25a8bf92f";
                                            webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                                        }};;
                                    }};, "97428ad9-a9f8-4bf8-a211-25359d98387f") {{
                        name = "Patrick Gutmann";
                        operatorConfiguration = new OperatorConfiguration(OperatorType.WEBHOOK) {{
                            dbt = new OperatorDbt("suscipit") {{
                                dbtArguments = "dicta";
                                dockerImage = "magnam";
                                gitRepoBranch = "doloremque";
                                gitRepoUrl = "cum";
                            }};
                            normalization = new OperatorNormalization() {{
                                option = OperatorNormalizationOption.BASIC;
                            }};
                            operatorType = OperatorType.NORMALIZATION;
                            webhook = new OperatorWebhook() {{
                                dbtCloud = new OperatorWebhookDbtCloud(549710L, 661949L) {{
                                    accountId = 978113L;
                                    jobId = 964021L;
                                }};
                                executionBody = "officiis";
                                executionUrl = "ab";
                                webhookConfigId = "70ef03b5-f37e-44aa-8685-55966732aa5d";
                                webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                            }};
                        }};
                        workspaceId = "b6682cb7-0f8c-4fd5-bb6e-91b9a9f74846";
                    }}),
                }};
                prefix = "iusto";
                resourceRequirements = new ResourceRequirements() {{
                    cpuLimit = "culpa";
                    cpuRequest = "voluptate";
                    memoryLimit = "cupiditate";
                    memoryRequest = "maxime";
                }};;
                schedule = new ConnectionSchedule(ConnectionScheduleTimeUnit.MONTHS, 471693L);;
                scheduleData = new ConnectionScheduleData() {{
                    basicSchedule = new ConnectionScheduleDataBasicSchedule(ConnectionScheduleDataBasicScheduleTimeUnit.MINUTES, 758366L);;
                    cron = new ConnectionScheduleDataCron("nulla", "magni");;
                }};;
                scheduleType = ConnectionScheduleType.MANUAL;
                sourceCatalogId = "84da2172-9f2a-4c41-af57-25f1169ac1e4";
                syncCatalog = new AirbyteCatalog(                new WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration[]{{
                                    add(new AirbyteStreamAndConfiguration() {{
                                        config = new AirbyteStreamConfiguration(DestinationSyncMode.APPEND_DEDUP, SyncMode.INCREMENTAL) {{
                                            aliasName = "temporibus";
                                            cursorField = new String[]{{
                                                add("deserunt"),
                                                add("aspernatur"),
                                                add("neque"),
                                            }};
                                            destinationSyncMode = DestinationSyncMode.APPEND_DEDUP;
                                            fieldSelectionEnabled = false;
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("saepe"),
                                                }}),
                                            }};
                                            selected = false;
                                            selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("repellat"),
                                                        add("eos"),
                                                    }};
                                                }}),
                                            }};
                                            suggested = false;
                                            syncMode = SyncMode.INCREMENTAL;
                                        }};
                                        stream = new AirbyteStream("voluptatem") {{
                                            defaultCursorField = new String[]{{
                                                add("officia"),
                                                add("sunt"),
                                            }};
                                            jsonSchema = new StreamJsonSchema() {{}};
                                            name = "Erik Wilderman";
                                            namespace = "recusandae";
                                            sourceDefinedCursor = false;
                                            sourceDefinedPrimaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("aspernatur"),
                                                }}),
                                                add(new String[]{{
                                                    add("ipsam"),
                                                }}),
                                                add(new String[]{{
                                                    add("delectus"),
                                                }}),
                                            }};
                                            supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.FULL_REFRESH),
                                            }};
                                        }};
                                    }}),
                                }});;
            }};            

            WebBackendCreateConnectionResponse res = sdk.webBackend.webBackendCreateConnection(req);

            if (res.webBackendConnectionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [WayScript.airbyte_test.models.shared.WebBackendConnectionCreate](../../models/shared/WebBackendConnectionCreate.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[WayScript.airbyte_test.models.operations.WebBackendCreateConnectionResponse](../../models/operations/WebBackendCreateConnectionResponse.md)**


## webBackendGetConnection

Get a connection

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendGetConnectionResponse;
import WayScript.airbyte_test.models.shared.WebBackendConnectionRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WebBackendConnectionRequestBody req = new WebBackendConnectionRequestBody("99853e9f-543d-4854-839e-e224460443bc") {{
                withRefreshedCatalog = false;
            }};            

            WebBackendGetConnectionResponse res = sdk.webBackend.webBackendGetConnection(req);

            if (res.webBackendConnectionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [WayScript.airbyte_test.models.shared.WebBackendConnectionRequestBody](../../models/shared/WebBackendConnectionRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.WebBackendGetConnectionResponse](../../models/operations/WebBackendGetConnectionResponse.md)**


## webBackendGetWorkspaceState

Returns the current state of a workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendGetWorkspaceStateResponse;
import WayScript.airbyte_test.models.shared.WebBackendWorkspaceState;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WebBackendWorkspaceState req = new WebBackendWorkspaceState("154188c2-f56e-485d-a783-2eabd617c3b0");            

            WebBackendGetWorkspaceStateResponse res = sdk.webBackend.webBackendGetWorkspaceState(req);

            if (res.webBackendWorkspaceStateResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [WayScript.airbyte_test.models.shared.WebBackendWorkspaceState](../../models/shared/WebBackendWorkspaceState.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[WayScript.airbyte_test.models.operations.WebBackendGetWorkspaceStateResponse](../../models/operations/WebBackendGetWorkspaceStateResponse.md)**


## webBackendListConnectionsForWorkspace

Returns all non-deleted connections for a workspace.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendListConnectionsForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WebBackendConnectionListRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WebBackendConnectionListRequestBody req = new WebBackendConnectionListRequestBody("d51a44bf-01ba-4d87-86d4-6082bfbdc41f") {{
                destinationId = new String[]{{
                    add("5d4e2ae4-fb5c-4b35-9176-38f1edb78359"),
                    add("ecc5cb86-0f8c-4d58-8ba7-3810e4fe4447"),
                    add("297cd3b1-dd3b-4bce-a47b-7684eff50126"),
                    add("d71cffbd-0eb7-44b8-8219-53b44bd3c431"),
                }};
                sourceId = new String[]{{
                    add("9d33e595-3c00-4113-9863-aa41e6c31cc2"),
                    add("f1fcb51c-9a41-4ffb-a9cb-d795ee65e076"),
                }};
            }};            

            WebBackendListConnectionsForWorkspaceResponse res = sdk.webBackend.webBackendListConnectionsForWorkspace(req);

            if (res.webBackendConnectionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [WayScript.airbyte_test.models.shared.WebBackendConnectionListRequestBody](../../models/shared/WebBackendConnectionListRequestBody.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[WayScript.airbyte_test.models.operations.WebBackendListConnectionsForWorkspaceResponse](../../models/operations/WebBackendListConnectionsForWorkspaceResponse.md)**


## webBackendListGeographies

Returns all available geographies in which a data sync can run.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendListGeographiesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WebBackendListGeographiesResponse res = sdk.webBackend.webBackendListGeographies();

            if (res.webBackendGeographiesListResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.WebBackendListGeographiesResponse](../../models/operations/WebBackendListGeographiesResponse.md)**


## webBackendUpdateConnection

Apply a patch-style update to a connection. Only fields present on the update request body will be updated.
Any operations that lack an ID will be created. Then, the newly created operationId will be applied to the
connection along with the rest of the operationIds in the request body.
Apply a patch-style update to a connection. Only fields present on the update request body will be updated.
Note that if a catalog is present in the request body, the connection's entire catalog will be replaced
with the catalog from the request. This means that to modify a single stream, the entire new catalog
containing the updated stream needs to be sent.


### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WebBackendUpdateConnectionResponse;
import WayScript.airbyte_test.models.shared.AirbyteCatalog;
import WayScript.airbyte_test.models.shared.AirbyteStream;
import WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration;
import WayScript.airbyte_test.models.shared.AirbyteStreamConfiguration;
import WayScript.airbyte_test.models.shared.ConnectionSchedule;
import WayScript.airbyte_test.models.shared.ConnectionScheduleData;
import WayScript.airbyte_test.models.shared.ConnectionScheduleDataBasicSchedule;
import WayScript.airbyte_test.models.shared.ConnectionScheduleDataBasicScheduleTimeUnit;
import WayScript.airbyte_test.models.shared.ConnectionScheduleDataCron;
import WayScript.airbyte_test.models.shared.ConnectionScheduleTimeUnit;
import WayScript.airbyte_test.models.shared.ConnectionScheduleType;
import WayScript.airbyte_test.models.shared.ConnectionStatus;
import WayScript.airbyte_test.models.shared.DestinationSyncMode;
import WayScript.airbyte_test.models.shared.Geography;
import WayScript.airbyte_test.models.shared.NamespaceDefinitionType;
import WayScript.airbyte_test.models.shared.NonBreakingChangesPreference;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOption;
import WayScript.airbyte_test.models.shared.OperatorType;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookType;
import WayScript.airbyte_test.models.shared.ResourceRequirements;
import WayScript.airbyte_test.models.shared.SelectedFieldInfo;
import WayScript.airbyte_test.models.shared.StreamJsonSchema;
import WayScript.airbyte_test.models.shared.SyncMode;
import WayScript.airbyte_test.models.shared.WebBackendConnectionUpdate;
import WayScript.airbyte_test.models.shared.WebBackendOperationCreateOrUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WebBackendConnectionUpdate req = new WebBackendConnectionUpdate("cc7abf61-6ea5-4c71-a419-34b90f2e09d1") {{
                geography = Geography.US;
                name = "Martin Wilderman DVM";
                namespaceDefinition = NamespaceDefinitionType.DESTINATION;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingChangesPreference = NonBreakingChangesPreference.DISABLE;
                notifySchemaChanges = false;
                operations = new WayScript.airbyte_test.models.shared.WebBackendOperationCreateOrUpdate[]{{
                    add(new WebBackendOperationCreateOrUpdate("omnis",                 new OperatorConfiguration(OperatorType.DBT) {{
                                        dbt = new OperatorDbt("vitae") {{
                                            dbtArguments = "reiciendis";
                                            dockerImage = "cumque";
                                            gitRepoBranch = "atque";
                                        }};;
                                        normalization = new OperatorNormalization() {{
                                            option = OperatorNormalizationOption.BASIC;
                                        }};;
                                        webhook = new OperatorWebhook() {{
                                            dbtCloud = new OperatorWebhookDbtCloud(126733L, 24945L);;
                                            executionBody = "eligendi";
                                            executionUrl = "commodi";
                                            webhookConfigId = "5b037bb8-e0cc-4885-987e-4de04af28c5d";
                                            webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                                        }};;
                                    }};, "ddb46aa1-cfd6-4d82-8da0-131911296466") {{
                        name = "Justin Adams";
                        operationId = "44b935d2-37a7-42f9-8849-d6aed4aecb75";
                        operatorConfiguration = new OperatorConfiguration(OperatorType.DBT) {{
                            dbt = new OperatorDbt("excepturi") {{
                                dbtArguments = "neque";
                                dockerImage = "esse";
                                gitRepoBranch = "placeat";
                                gitRepoUrl = "at";
                            }};
                            normalization = new OperatorNormalization() {{
                                option = OperatorNormalizationOption.BASIC;
                            }};
                            operatorType = OperatorType.NORMALIZATION;
                            webhook = new OperatorWebhook() {{
                                dbtCloud = new OperatorWebhookDbtCloud(804894L, 567379L) {{
                                    accountId = 139505L;
                                    jobId = 154268L;
                                }};
                                executionBody = "sapiente";
                                executionUrl = "maiores";
                                webhookConfigId = "57491aab-fa2e-4761-b0ca-4d456ef1031e";
                                webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                            }};
                        }};
                        workspaceId = "899f0c20-01e2-42cd-95cc-0584a184d76d";
                    }}),
                }};
                prefix = "quaerat";
                resourceRequirements = new ResourceRequirements() {{
                    cpuLimit = "enim";
                    cpuRequest = "cumque";
                    memoryLimit = "ab";
                    memoryRequest = "quibusdam";
                }};;
                schedule = new ConnectionSchedule(ConnectionScheduleTimeUnit.DAYS, 93299L);;
                scheduleData = new ConnectionScheduleData() {{
                    basicSchedule = new ConnectionScheduleDataBasicSchedule(ConnectionScheduleDataBasicScheduleTimeUnit.MONTHS, 128744L);;
                    cron = new ConnectionScheduleDataCron("iste", "perferendis");;
                }};;
                scheduleType = ConnectionScheduleType.MANUAL;
                skipReset = false;
                sourceCatalogId = "2f569b7a-ff0e-4a22-96cb-e071bc163e27";
                status = ConnectionStatus.INACTIVE;
                syncCatalog = new AirbyteCatalog(                new WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration[]{{
                                    add(new AirbyteStreamAndConfiguration() {{
                                        config = new AirbyteStreamConfiguration(DestinationSyncMode.APPEND, SyncMode.FULL_REFRESH) {{
                                            aliasName = "sequi";
                                            cursorField = new String[]{{
                                                add("ipsa"),
                                                add("blanditiis"),
                                                add("aliquam"),
                                            }};
                                            destinationSyncMode = DestinationSyncMode.APPEND_DEDUP;
                                            fieldSelectionEnabled = false;
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("occaecati"),
                                                    add("consequuntur"),
                                                    add("veniam"),
                                                }}),
                                                add(new String[]{{
                                                    add("repellendus"),
                                                    add("eaque"),
                                                }}),
                                                add(new String[]{{
                                                    add("asperiores"),
                                                    add("eius"),
                                                }}),
                                            }};
                                            selected = false;
                                            selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("incidunt"),
                                                        add("iusto"),
                                                        add("laborum"),
                                                    }};
                                                }}),
                                            }};
                                            suggested = false;
                                            syncMode = SyncMode.FULL_REFRESH;
                                        }};
                                        stream = new AirbyteStream("dolores") {{
                                            defaultCursorField = new String[]{{
                                                add("blanditiis"),
                                                add("ut"),
                                                add("eius"),
                                                add("cupiditate"),
                                            }};
                                            jsonSchema = new StreamJsonSchema() {{}};
                                            name = "Chelsea Reynolds";
                                            namespace = "debitis";
                                            sourceDefinedCursor = false;
                                            sourceDefinedPrimaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("ex"),
                                                    add("tempore"),
                                                    add("provident"),
                                                    add("provident"),
                                                }}),
                                                add(new String[]{{
                                                    add("maxime"),
                                                    add("commodi"),
                                                    add("consectetur"),
                                                }}),
                                                add(new String[]{{
                                                    add("nisi"),
                                                    add("aspernatur"),
                                                }}),
                                                add(new String[]{{
                                                    add("tempore"),
                                                    add("asperiores"),
                                                    add("temporibus"),
                                                    add("delectus"),
                                                }}),
                                            }};
                                            supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.INCREMENTAL),
                                            }};
                                        }};
                                    }}),
                                    add(new AirbyteStreamAndConfiguration() {{
                                        config = new AirbyteStreamConfiguration(DestinationSyncMode.OVERWRITE, SyncMode.FULL_REFRESH) {{
                                            aliasName = "iste";
                                            cursorField = new String[]{{
                                                add("porro"),
                                                add("eaque"),
                                            }};
                                            destinationSyncMode = DestinationSyncMode.OVERWRITE;
                                            fieldSelectionEnabled = false;
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("accusantium"),
                                                    add("ea"),
                                                    add("laborum"),
                                                }}),
                                            }};
                                            selected = false;
                                            selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("quos"),
                                                    }};
                                                }}),
                                            }};
                                            suggested = false;
                                            syncMode = SyncMode.FULL_REFRESH;
                                        }};
                                        stream = new AirbyteStream("dignissimos") {{
                                            defaultCursorField = new String[]{{
                                                add("voluptates"),
                                                add("debitis"),
                                            }};
                                            jsonSchema = new StreamJsonSchema() {{}};
                                            name = "Miss Sam Shanahan";
                                            namespace = "temporibus";
                                            sourceDefinedCursor = false;
                                            sourceDefinedPrimaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("nulla"),
                                                    add("excepturi"),
                                                    add("quod"),
                                                    add("in"),
                                                }}),
                                                add(new String[]{{
                                                    add("temporibus"),
                                                }}),
                                            }};
                                            supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.FULL_REFRESH),
                                            }};
                                        }};
                                    }}),
                                    add(new AirbyteStreamAndConfiguration() {{
                                        config = new AirbyteStreamConfiguration(DestinationSyncMode.APPEND, SyncMode.FULL_REFRESH) {{
                                            aliasName = "illo";
                                            cursorField = new String[]{{
                                                add("ipsa"),
                                                add("occaecati"),
                                            }};
                                            destinationSyncMode = DestinationSyncMode.APPEND_DEDUP;
                                            fieldSelectionEnabled = false;
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("deleniti"),
                                                    add("dignissimos"),
                                                    add("doloremque"),
                                                    add("quibusdam"),
                                                }}),
                                                add(new String[]{{
                                                    add("minus"),
                                                }}),
                                                add(new String[]{{
                                                    add("id"),
                                                    add("architecto"),
                                                }}),
                                            }};
                                            selected = false;
                                            selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("quod"),
                                                        add("magni"),
                                                        add("incidunt"),
                                                    }};
                                                }}),
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("quisquam"),
                                                    }};
                                                }}),
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("quidem"),
                                                        add("iure"),
                                                    }};
                                                }}),
                                                add(new SelectedFieldInfo() {{
                                                    fieldPath = new String[]{{
                                                        add("culpa"),
                                                        add("illo"),
                                                    }};
                                                }}),
                                            }};
                                            suggested = false;
                                            syncMode = SyncMode.INCREMENTAL;
                                        }};
                                        stream = new AirbyteStream("at") {{
                                            defaultCursorField = new String[]{{
                                                add("dignissimos"),
                                                add("non"),
                                                add("facere"),
                                                add("repellat"),
                                            }};
                                            jsonSchema = new StreamJsonSchema() {{}};
                                            name = "Alison Jast V";
                                            namespace = "voluptatum";
                                            sourceDefinedCursor = false;
                                            sourceDefinedPrimaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("reiciendis"),
                                                }}),
                                                add(new String[]{{
                                                    add("consequuntur"),
                                                    add("est"),
                                                }}),
                                                add(new String[]{{
                                                    add("nobis"),
                                                    add("expedita"),
                                                }}),
                                            }};
                                            supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                add(SyncMode.FULL_REFRESH),
                                                add(SyncMode.INCREMENTAL),
                                            }};
                                        }};
                                    }}),
                                }});;
            }};            

            WebBackendUpdateConnectionResponse res = sdk.webBackend.webBackendUpdateConnection(req);

            if (res.webBackendConnectionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [WayScript.airbyte_test.models.shared.WebBackendConnectionUpdate](../../models/shared/WebBackendConnectionUpdate.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[WayScript.airbyte_test.models.operations.WebBackendUpdateConnectionResponse](../../models/operations/WebBackendUpdateConnectionResponse.md)**

