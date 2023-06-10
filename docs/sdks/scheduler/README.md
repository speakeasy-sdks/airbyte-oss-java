# scheduler

### Available Operations

* [executeDestinationCheckConnection](#executedestinationcheckconnection) - Run check connection for a given destination configuration
* [executeSourceCheckConnection](#executesourcecheckconnection) - Run check connection for a given source configuration
* [executeSourceDiscoverSchema](#executesourcediscoverschema) - Run discover schema for a given source a source configuration

## executeDestinationCheckConnection

Run check connection for a given destination configuration

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ExecuteDestinationCheckConnectionResponse;
import WayScript.airbyte_test.models.shared.DestinationCoreConfig;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationCoreConfig req = new DestinationCoreConfig("asperiores", "639a910a-bdca-4b62-a766-96e1ec00221b", "335d89ac-b3ec-4fda-8d0c-549ef0300497") {{
                destinationId = "8a61fa1c-f206-488f-b7c1-ffc71dca163f";
            }};            

            ExecuteDestinationCheckConnectionResponse res = sdk.scheduler.executeDestinationCheckConnection(req);

            if (res.checkConnectionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [WayScript.airbyte_test.models.shared.DestinationCoreConfig](../../models/shared/DestinationCoreConfig.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[WayScript.airbyte_test.models.operations.ExecuteDestinationCheckConnectionResponse](../../models/operations/ExecuteDestinationCheckConnectionResponse.md)**


## executeSourceCheckConnection

Run check connection for a given source configuration

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ExecuteSourceCheckConnectionResponse;
import WayScript.airbyte_test.models.shared.SourceCoreConfig;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceCoreConfig req = new SourceCoreConfig("sed", "a3c80a97-ff33-44cd-9f85-7a9e61876c6a", "b21d29df-c94d-46fe-8d79-9390066a6d2d") {{
                sourceId = "00035533-8cec-4086-ba21-e9152cb31191";
            }};            

            ExecuteSourceCheckConnectionResponse res = sdk.scheduler.executeSourceCheckConnection(req);

            if (res.checkConnectionRead != null) {
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
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.SourceCoreConfig](../../models/shared/SourceCoreConfig.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.ExecuteSourceCheckConnectionResponse](../../models/operations/ExecuteSourceCheckConnectionResponse.md)**


## executeSourceDiscoverSchema

Run discover schema for a given source a source configuration

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ExecuteSourceDiscoverSchemaResponse;
import WayScript.airbyte_test.models.shared.SourceCoreConfig;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceCoreConfig req = new SourceCoreConfig("autem", "7b8e3c8d-b034-408d-ad36-4ffd455906d1", "263d48e9-35c2-4c9e-81f3-0be3e43202d7") {{
                sourceId = "21657650-6641-4870-99d2-1f9ad030c4ec";
            }};            

            ExecuteSourceDiscoverSchemaResponse res = sdk.scheduler.executeSourceDiscoverSchema(req);

            if (res.sourceDiscoverSchemaRead != null) {
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
| `request`                                                                                        | [WayScript.airbyte_test.models.shared.SourceCoreConfig](../../models/shared/SourceCoreConfig.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[WayScript.airbyte_test.models.operations.ExecuteSourceDiscoverSchemaResponse](../../models/operations/ExecuteSourceDiscoverSchemaResponse.md)**

