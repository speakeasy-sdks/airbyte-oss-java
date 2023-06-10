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
import WayScript.airbyte_test.models.shared.LogType;
import WayScript.airbyte_test.models.shared.LogsRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.LogsRequestBody req = new LogsRequestBody(LogType.SCHEDULER);            

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

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [WayScript.airbyte_test.models.shared.LogsRequestBody](../../models/shared/LogsRequestBody.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[WayScript.airbyte_test.models.operations.GetLogsResponse](../../models/operations/GetLogsResponse.md)**

