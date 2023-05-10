# logs

### Available Operations

* [getLogs](#getlogs) - Get logs

## getLogs

Get logs

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetLogsResponse;
import WayScript.airbyte_test.models.shared.LogTypeEnum;
import WayScript.airbyte_test.models.shared.LogsRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.LogsRequestBody req = new LogsRequestBody(LogTypeEnum.SCHEDULER);            

            GetLogsResponse res = sdk.logs.getLogs(req);

            if (res.getLogs200TextPlainBinaryString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
