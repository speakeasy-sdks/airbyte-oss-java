# state

## Overview

Interactions with state related resources.

### Available Operations

* [createOrUpdateState](#createorupdatestate) - Create or update the state for a connection.
* [getState](#getstate) - Fetch the current state for a connection.

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

            WayScript.airbyte_test.models.shared.ConnectionStateCreateOrUpdate req = new ConnectionStateCreateOrUpdate("461e7421-cbe6-4d95-82f0-ea930b69f7ac",                 new ConnectionState("2f72f885-0090-4491-9608-207888ec6618", ConnectionStateType.GLOBAL) {{
                                globalState = new GlobalState(                new WayScript.airbyte_test.models.shared.StreamState[]{{
                                                    add(new StreamState(                new StreamDescriptor("quidem") {{
                                                                        namespace = "magnam";
                                                                    }};) {{
                                                        streamDescriptor = new StreamDescriptor("debitis") {{
                                                            name = "Terence Mertz";
                                                            namespace = "unde";
                                                        }};
                                                        streamState = new StateBlob() {{}};
                                                    }}),
                                                    add(new StreamState(                new StreamDescriptor("nihil") {{
                                                                        namespace = "nostrum";
                                                                    }};) {{
                                                        streamDescriptor = new StreamDescriptor("earum") {{
                                                            name = "Mrs. Sophia Schmidt";
                                                            namespace = "est";
                                                        }};
                                                        streamState = new StateBlob() {{}};
                                                    }}),
                                                    add(new StreamState(                new StreamDescriptor("modi") {{
                                                                        namespace = "illum";
                                                                    }};) {{
                                                        streamDescriptor = new StreamDescriptor("id") {{
                                                            name = "Joseph Reilly";
                                                            namespace = "eos";
                                                        }};
                                                        streamState = new StateBlob() {{}};
                                                    }}),
                                                }}) {{
                                    sharedState = new StateBlob();;
                                }};;
                                state = new StateBlob();;
                                streamState = new WayScript.airbyte_test.models.shared.StreamState[]{{
                                    add(new StreamState(                new StreamDescriptor("magnam") {{
                                                        namespace = "eius";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("a") {{
                                            name = "Delores Rosenbaum";
                                            namespace = "culpa";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                    add(new StreamState(                new StreamDescriptor("eligendi") {{
                                                        namespace = "cupiditate";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("explicabo") {{
                                            name = "Lori Schmeler";
                                            namespace = "numquam";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                    add(new StreamState(                new StreamDescriptor("est") {{
                                                        namespace = "sapiente";
                                                    }};) {{
                                        streamDescriptor = new StreamDescriptor("nulla") {{
                                            name = "Adam Ortiz";
                                            namespace = "explicabo";
                                        }};
                                        streamState = new StateBlob() {{}};
                                    }}),
                                }};
                            }};);            

            CreateOrUpdateStateResponse res = sdk.state.createOrUpdateState(req);

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


## getState

Fetch the current state for a connection.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetStateResponse;
import WayScript.airbyte_test.models.shared.ConnectionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("e81a88f4-4445-473f-acd4-7353f63c8209");            

            GetStateResponse res = sdk.state.getState(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [WayScript.airbyte_test.models.shared.ConnectionIdRequestBody](../../models/shared/ConnectionIdRequestBody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.GetStateResponse](../../models/operations/GetStateResponse.md)**

