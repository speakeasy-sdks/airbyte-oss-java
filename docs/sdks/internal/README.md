# internal

### Available Operations

* [createOrUpdateState](#createorupdatestate) - Create or update the state for a connection.
* [getAttemptNormalizationStatusesForJob](#getattemptnormalizationstatusesforjob) - Get normalization status to determine if we can bypass normalization phase
* [saveStats](#savestats) - For worker to set sync stats of a running attempt.
* [saveSyncConfig](#savesyncconfig) - For worker to save the AttemptSyncConfig for an attempt.
* [setWorkflowInAttempt](#setworkflowinattempt) - For worker to register the workflow id in attempt.
* [writeDiscoverCatalogResult](#writediscovercatalogresult) - Should only called from worker, to write result from discover activity back to DB.

## createOrUpdateState

Create or update the state for a connection.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateOrUpdateStateResponse;
import WayScript.airbyte_test.models.shared.ConnectionState;
import WayScript.airbyte_test.models.shared.ConnectionStateCreateOrUpdate;
import WayScript.airbyte_test.models.shared.ConnectionStateType;
import WayScript.airbyte_test.models.shared.GlobalState;
import WayScript.airbyte_test.models.shared.StateBlob;
import WayScript.airbyte_test.models.shared.StreamDescriptor;
import WayScript.airbyte_test.models.shared.StreamState;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionStateCreateOrUpdate req = new ConnectionStateCreateOrUpdate("f789ffaf-eda5-43e5-ae6e-0ac184c2b9c2",                 new ConnectionState("47c88373-a40e-4194-af32-e55055756f5d", ConnectionStateType.STREAM) {{
                                globalState = new GlobalState(                new WayScript.airbyte_test.models.shared.StreamState[]{{
                                                    add(new StreamState(                new StreamDescriptor("possimus") {{
                                                                        namespace = "repellat";
                                                                    }};) {{
                                                        streamDescriptor = new StreamDescriptor("sed") {{
                                                            name = "Paul Powlowski MD";
                                                            namespace = "sapiente";
                                                        }};
                                                        streamState = new StateBlob() {{}};
                                                    }}),
                                                    add(new StreamState(                new StreamDescriptor("iure") {{
                                                                        namespace = "explicabo";
                                                                    }};) {{
                                                        streamDescriptor = new StreamDescriptor("voluptatibus") {{
                                                            name = "Joe Fisher";
                                                            namespace = "dolore";
                                                        }};
                                                        streamState = new StateBlob() {{}};
                                                    }}),
                                                }}) {{
                                    sharedState = new StateBlob();;
                                }};;
                                state = new StateBlob();;
                                streamState = new WayScript.airbyte_test.models.shared.StreamState[]{{
                                    add(new StreamState(                new StreamDescriptor("quasi") {{
                                                        namespace = "mollitia";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("non") {{
                                            name = "Lorenzo Flatley";
                                            namespace = "error";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                    add(new StreamState(                new StreamDescriptor("aliquid") {{
                                                        namespace = "excepturi";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("deserunt") {{
                                            name = "Miss Horace Runte";
                                            namespace = "eaque";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                    add(new StreamState(                new StreamDescriptor("optio") {{
                                                        namespace = "delectus";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("accusamus") {{
                                            name = "Rhonda Schuster";
                                            namespace = "sed";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                    add(new StreamState(                new StreamDescriptor("accusantium") {{
                                                        namespace = "illo";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("corporis") {{
                                            name = "Garrett Lubowitz";
                                            namespace = "iste";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                }};
                            }};);            

            CreateOrUpdateStateResponse res = sdk.internal.createOrUpdateState(req);

            if (res.connectionState != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [WayScript.airbyte_test.models.shared.ConnectionStateCreateOrUpdate](../../models/shared/ConnectionStateCreateOrUpdate.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[WayScript.airbyte_test.models.operations.CreateOrUpdateStateResponse](../../models/operations/CreateOrUpdateStateResponse.md)**


## getAttemptNormalizationStatusesForJob

Get normalization status to determine if we can bypass normalization phase

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse;
import WayScript.airbyte_test.models.shared.JobIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.JobIdRequestBody req = new JobIdRequestBody(14251L);            

            GetAttemptNormalizationStatusesForJobResponse res = sdk.internal.getAttemptNormalizationStatusesForJob(req);

            if (res.attemptNormalizationStatusReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.JobIdRequestBody](../../models/shared/JobIdRequestBody.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse](../../models/operations/GetAttemptNormalizationStatusesForJobResponse.md)**


## saveStats

For worker to set sync stats of a running attempt.

### Example Usage

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

            WayScript.airbyte_test.models.shared.SaveStatsRequestBody req = new SaveStatsRequestBody(984031, 342104L,                 new AttemptStats() {{
                                bytesEmitted = 869848L;
                                estimatedBytes = 823472L;
                                estimatedRecords = 205499L;
                                recordsCommitted = 866135L;
                                recordsEmitted = 424853L;
                                stateMessagesEmitted = 960813L;
                            }};) {{
                streamStats = new WayScript.airbyte_test.models.shared.AttemptStreamStats[]{{
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 557987L;
                                        estimatedBytes = 162450L;
                                        estimatedRecords = 982445L;
                                        recordsCommitted = 81581L;
                                        recordsEmitted = 400448L;
                                        stateMessagesEmitted = 513185L;
                                    }};, "est") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 65121L;
                            estimatedBytes = 552646L;
                            estimatedRecords = 44571L;
                            recordsCommitted = 251200L;
                            recordsEmitted = 913284L;
                            stateMessagesEmitted = 324052L;
                        }};
                        streamName = "aliquam";
                        streamNamespace = "quisquam";
                    }}),
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 927959L;
                                        estimatedBytes = 271306L;
                                        estimatedRecords = 503449L;
                                        recordsCommitted = 258059L;
                                        recordsEmitted = 196374L;
                                        stateMessagesEmitted = 532320L;
                                    }};, "sit") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 221329L;
                            estimatedBytes = 400879L;
                            estimatedRecords = 232316L;
                            recordsCommitted = 768195L;
                            recordsEmitted = 525917L;
                            stateMessagesEmitted = 527715L;
                        }};
                        streamName = "ducimus";
                        streamNamespace = "adipisci";
                    }}),
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 168926L;
                                        estimatedBytes = 471207L;
                                        estimatedRecords = 374062L;
                                        recordsCommitted = 658199L;
                                        recordsEmitted = 413780L;
                                        stateMessagesEmitted = 716L;
                                    }};, "fuga") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 703189L;
                            estimatedBytes = 84178L;
                            estimatedRecords = 949280L;
                            recordsCommitted = 419858L;
                            recordsEmitted = 694088L;
                            stateMessagesEmitted = 517121L;
                        }};
                        streamName = "porro";
                        streamNamespace = "deserunt";
                    }}),
                }};
            }};            

            SaveStatsResponse res = sdk.internal.saveStats(req);

            if (res.internalOperationResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [WayScript.airbyte_test.models.shared.SaveStatsRequestBody](../../models/shared/SaveStatsRequestBody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[WayScript.airbyte_test.models.operations.SaveStatsResponse](../../models/operations/SaveStatsResponse.md)**


## saveSyncConfig

For worker to save the AttemptSyncConfig for an attempt.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SaveSyncConfigResponse;
import WayScript.airbyte_test.models.shared.AttemptSyncConfig;
import WayScript.airbyte_test.models.shared.ConnectionState;
import WayScript.airbyte_test.models.shared.ConnectionStateType;
import WayScript.airbyte_test.models.shared.GlobalState;
import WayScript.airbyte_test.models.shared.SaveAttemptSyncConfigRequestBody;
import WayScript.airbyte_test.models.shared.StateBlob;
import WayScript.airbyte_test.models.shared.StreamDescriptor;
import WayScript.airbyte_test.models.shared.StreamState;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SaveAttemptSyncConfigRequestBody req = new SaveAttemptSyncConfigRequestBody(14780, 295892L,                 new AttemptSyncConfig("maxime", "aliquam") {{
                                state = new ConnectionState("95cc6991-71b5-41c1-bdb1-cf4b888ebdfc", ConnectionStateType.STREAM) {{
                                    globalState = new GlobalState(                new WayScript.airbyte_test.models.shared.StreamState[]{{
                                                        add(new StreamState(                new StreamDescriptor("esse") {{
                                                                            namespace = "hic";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("quo") {{
                                                                name = "Lowell Olson";
                                                                namespace = "libero";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                        add(new StreamState(                new StreamDescriptor("veritatis") {{
                                                                            namespace = "aut";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("recusandae") {{
                                                                name = "Edward Roberts";
                                                                namespace = "eligendi";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                        add(new StreamState(                new StreamDescriptor("doloremque") {{
                                                                            namespace = "voluptatem";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("rerum") {{
                                                                name = "Mathew Erdman";
                                                                namespace = "magni";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                        add(new StreamState(                new StreamDescriptor("atque") {{
                                                                            namespace = "rerum";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("nihil") {{
                                                                name = "Cristina Keeling";
                                                                namespace = "blanditiis";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                    }}) {{
                                        sharedState = new StateBlob();;
                                    }};;
                                    state = new StateBlob();;
                                    streamState = new WayScript.airbyte_test.models.shared.StreamState[]{{
                                        add(new StreamState(                new StreamDescriptor("quae") {{
                                                            namespace = "quas";
                                                        }};) {{
                                            streamDescriptor = new StreamDescriptor("magni") {{
                                                name = "Miss Dean Littel";
                                                namespace = "rem";
                                            }};
                                            streamState = new StateBlob() {{}};
                                        }}),
                                        add(new StreamState(                new StreamDescriptor("natus") {{
                                                            namespace = "cumque";
                                                        }};) {{
                                            streamDescriptor = new StreamDescriptor("officia") {{
                                                name = "Lloyd Grant";
                                                namespace = "delectus";
                                            }};
                                            streamState = new StateBlob() {{}};
                                        }}),
                                        add(new StreamState(                new StreamDescriptor("quis") {{
                                                            namespace = "enim";
                                                        }};) {{
                                            streamDescriptor = new StreamDescriptor("cumque") {{
                                                name = "Jon Yost";
                                                namespace = "mollitia";
                                            }};
                                            streamState = new StateBlob() {{}};
                                        }}),
                                    }};
                                }};;
                            }};);            

            SaveSyncConfigResponse res = sdk.internal.saveSyncConfig(req);

            if (res.internalOperationResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [WayScript.airbyte_test.models.shared.SaveAttemptSyncConfigRequestBody](../../models/shared/SaveAttemptSyncConfigRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[WayScript.airbyte_test.models.operations.SaveSyncConfigResponse](../../models/operations/SaveSyncConfigResponse.md)**


## setWorkflowInAttempt

For worker to register the workflow id in attempt.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SetWorkflowInAttemptResponse;
import WayScript.airbyte_test.models.shared.SetWorkflowInAttemptRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SetWorkflowInAttemptRequestBody req = new SetWorkflowInAttemptRequestBody(430235, 365539L, "illum") {{
                processingTaskQueue = "nesciunt";
            }};            

            SetWorkflowInAttemptResponse res = sdk.internal.setWorkflowInAttempt(req);

            if (res.internalOperationResult != null) {
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
| `request`                                                                                                                      | [WayScript.airbyte_test.models.shared.SetWorkflowInAttemptRequestBody](../../models/shared/SetWorkflowInAttemptRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.SetWorkflowInAttemptResponse](../../models/operations/SetWorkflowInAttemptResponse.md)**


## writeDiscoverCatalogResult

Should only called from worker, to write result from discover activity back to DB.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse;
import WayScript.airbyte_test.models.shared.AirbyteCatalog;
import WayScript.airbyte_test.models.shared.AirbyteStream;
import WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration;
import WayScript.airbyte_test.models.shared.AirbyteStreamConfiguration;
import WayScript.airbyte_test.models.shared.DestinationSyncMode;
import WayScript.airbyte_test.models.shared.SelectedFieldInfo;
import WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody;
import WayScript.airbyte_test.models.shared.StreamJsonSchema;
import WayScript.airbyte_test.models.shared.SyncMode;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody req = new SourceDiscoverSchemaWriteRequestBody(                new AirbyteCatalog(                new WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration[]{{
                                                add(new AirbyteStreamAndConfiguration() {{
                                                    config = new AirbyteStreamConfiguration(DestinationSyncMode.OVERWRITE, SyncMode.FULL_REFRESH) {{
                                                        aliasName = "odio";
                                                        cursorField = new String[]{{
                                                            add("asperiores"),
                                                            add("recusandae"),
                                                            add("voluptates"),
                                                            add("praesentium"),
                                                        }};
                                                        destinationSyncMode = DestinationSyncMode.APPEND;
                                                        fieldSelectionEnabled = false;
                                                        primaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("aliquid"),
                                                            }}),
                                                        }};
                                                        selected = false;
                                                        selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("deleniti"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("nesciunt"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("laborum"),
                                                                    add("aliquam"),
                                                                    add("deserunt"),
                                                                    add("modi"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("impedit"),
                                                                }};
                                                            }}),
                                                        }};
                                                        suggested = false;
                                                        syncMode = SyncMode.FULL_REFRESH;
                                                    }};
                                                    stream = new AirbyteStream("delectus") {{
                                                        defaultCursorField = new String[]{{
                                                            add("dolorem"),
                                                            add("repellat"),
                                                            add("aspernatur"),
                                                            add("inventore"),
                                                        }};
                                                        jsonSchema = new StreamJsonSchema() {{}};
                                                        name = "Theresa Pfannerstill I";
                                                        namespace = "architecto";
                                                        sourceDefinedCursor = false;
                                                        sourceDefinedPrimaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("nulla"),
                                                            }}),
                                                        }};
                                                        supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                            add(SyncMode.FULL_REFRESH),
                                                            add(SyncMode.FULL_REFRESH),
                                                        }};
                                                    }};
                                                }}),
                                            }});) {{
                configurationHash = "numquam";
                connectorVersion = "optio";
                sourceId = "c6f18bf9-621a-46a4-b77a-87ee3e4be752";
            }};            

            WriteDiscoverCatalogResultResponse res = sdk.internal.writeDiscoverCatalogResult(req);

            if (res.discoverCatalogResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody](../../models/shared/SourceDiscoverSchemaWriteRequestBody.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse](../../models/operations/WriteDiscoverCatalogResultResponse.md)**

