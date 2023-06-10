# attempt

## Overview

Interactions with attempt related resources.

### Available Operations

* [saveStats](#savestats) - For worker to set sync stats of a running attempt.
* [saveSyncConfig](#savesyncconfig) - For worker to save the AttemptSyncConfig for an attempt.
* [setWorkflowInAttempt](#setworkflowinattempt) - For worker to register the workflow id in attempt.

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

            WayScript.airbyte_test.models.shared.SaveStatsRequestBody req = new SaveStatsRequestBody(870088, 978619L,                 new AttemptStats() {{
                                bytesEmitted = 473608L;
                                estimatedBytes = 799159L;
                                estimatedRecords = 800911L;
                                recordsCommitted = 461479L;
                                recordsEmitted = 520478L;
                                stateMessagesEmitted = 780529L;
                            }};) {{
                streamStats = new WayScript.airbyte_test.models.shared.AttemptStreamStats[]{{
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 521848L;
                                        estimatedBytes = 105907L;
                                        estimatedRecords = 414662L;
                                        recordsCommitted = 473600L;
                                        recordsEmitted = 264555L;
                                        stateMessagesEmitted = 186332L;
                                    }};, "impedit") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 118274L;
                            estimatedBytes = 720633L;
                            estimatedRecords = 639921L;
                            recordsCommitted = 582020L;
                            recordsEmitted = 143353L;
                            stateMessagesEmitted = 537373L;
                        }};
                        streamName = "hic";
                        streamNamespace = "optio";
                    }}),
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 149675L;
                                        estimatedBytes = 612096L;
                                        estimatedRecords = 222321L;
                                        recordsCommitted = 616934L;
                                        recordsEmitted = 386489L;
                                        stateMessagesEmitted = 943749L;
                                    }};, "saepe") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 736918L;
                            estimatedBytes = 456150L;
                            estimatedRecords = 216550L;
                            recordsCommitted = 568434L;
                            recordsEmitted = 135218L;
                            stateMessagesEmitted = 18789L;
                        }};
                        streamName = "ad";
                        streamNamespace = "natus";
                    }}),
                    add(new AttemptStreamStats(                new AttemptStats() {{
                                        bytesEmitted = 60225L;
                                        estimatedBytes = 969810L;
                                        estimatedRecords = 666767L;
                                        recordsCommitted = 653140L;
                                        recordsEmitted = 670638L;
                                        stateMessagesEmitted = 170909L;
                                    }};, "dolorem") {{
                        stats = new AttemptStats() {{
                            bytesEmitted = 681820L;
                            estimatedBytes = 449950L;
                            estimatedRecords = 359508L;
                            recordsCommitted = 613064L;
                            recordsEmitted = 437032L;
                            stateMessagesEmitted = 902349L;
                        }};
                        streamName = "quidem";
                        streamNamespace = "architecto";
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

            WayScript.airbyte_test.models.shared.SaveAttemptSyncConfigRequestBody req = new SaveAttemptSyncConfigRequestBody(358152, 128926L,                 new AttemptSyncConfig("nobis", "enim") {{
                                state = new ConnectionState("955907af-f1a3-4a2f-a946-7739251aa52c", ConnectionStateType.GLOBAL) {{
                                    globalState = new GlobalState(                new WayScript.airbyte_test.models.shared.StreamState[]{{
                                                        add(new StreamState(                new StreamDescriptor("quasi") {{
                                                                            namespace = "reiciendis";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("laborum") {{
                                                                name = "Mr. Alberta Schuster";
                                                                namespace = "temporibus";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                        add(new StreamState(                new StreamDescriptor("voluptate") {{
                                                                            namespace = "cum";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("omnis") {{
                                                                name = "Caleb Koss";
                                                                namespace = "ipsa";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                        add(new StreamState(                new StreamDescriptor("dolore") {{
                                                                            namespace = "iusto";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("corporis") {{
                                                                name = "Sharon Kiehn";
                                                                namespace = "dicta";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                        add(new StreamState(                new StreamDescriptor("ipsum") {{
                                                                            namespace = "quidem";
                                                                        }};) {{
                                                            streamDescriptor = new StreamDescriptor("quae") {{
                                                                name = "Maryann Hamill";
                                                                namespace = "repudiandae";
                                                            }};
                                                            streamState = new StateBlob() {{}};
                                                        }}),
                                                    }}) {{
                                        sharedState = new StateBlob();;
                                    }};;
                                    state = new StateBlob();;
                                    streamState = new WayScript.airbyte_test.models.shared.StreamState[]{{
                                        add(new StreamState(                new StreamDescriptor("repudiandae") {{
                                                            namespace = "sint";
                                                        }};) {{
                                            streamDescriptor = new StreamDescriptor("quasi") {{
                                                name = "Ervin Gleason";
                                                namespace = "voluptates";
                                            }};
                                            streamState = new StateBlob() {{}};
                                        }}),
                                        add(new StreamState(                new StreamDescriptor("deserunt") {{
                                                            namespace = "distinctio";
                                                        }};) {{
                                            streamDescriptor = new StreamDescriptor("explicabo") {{
                                                name = "Patti Gottlieb MD";
                                                namespace = "quibusdam";
                                            }};
                                            streamState = new StateBlob() {{}};
                                        }}),
                                        add(new StreamState(                new StreamDescriptor("perferendis") {{
                                                            namespace = "magni";
                                                        }};) {{
                                            streamDescriptor = new StreamDescriptor("quos") {{
                                                name = "Francisco Gleason";
                                                namespace = "cupiditate";
                                            }};
                                            streamState = new StateBlob() {{}};
                                        }}),
                                    }};
                                }};;
                            }};);            

            SaveSyncConfigResponse res = sdk.attempt.saveSyncConfig(req);

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

            WayScript.airbyte_test.models.shared.SetWorkflowInAttemptRequestBody req = new SetWorkflowInAttemptRequestBody(828940, 369808L, "alias") {{
                processingTaskQueue = "fugit";
            }};            

            SetWorkflowInAttemptResponse res = sdk.attempt.setWorkflowInAttempt(req);

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

