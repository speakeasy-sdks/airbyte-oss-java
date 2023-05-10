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

            WayScript.airbyte_test.models.shared.DestinationCoreConfig req = new DestinationCoreConfig("dolor", "90066a6d-2d00-4035-9338-cec086fa21e9", "152cb311-9167-4b8e-bc8d-b03408d6d364") {{
                destinationId = "ffd45590-6d12-463d-88e9-35c2c9e81f30";
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

            WayScript.airbyte_test.models.shared.SourceCoreConfig req = new SourceCoreConfig("soluta", "e3e43202-d721-4657-a506-641870d9d21f", "9ad030c4-ecc1-41a0-8364-29068b8502a5") {{
                sourceId = "5e7f73bc-845e-4320-a319-f4badf947c9a";
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

            WayScript.airbyte_test.models.shared.SourceCoreConfig req = new SourceCoreConfig("voluptatum", "67bc4242-6665-4816-9dca-8ef51fcb4c59", "3ec12cda-ad0e-4c7a-bedb-d80df448a47f") {{
                sourceId = "9390c588-8098-43da-bf9e-f3ffdd9f7f07";
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
