# openapi

### Available Operations

* [getOpenApiSpec](#getopenapispec) - Returns the openapi specification

## getOpenApiSpec

Returns the openapi specification

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetOpenApiSpecResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            GetOpenApiSpecResponse res = sdk.openapi.getOpenApiSpec();

            if (res.getOpenApiSpec200TextPlainBinaryString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.GetOpenApiSpecResponse](../../models/operations/GetOpenApiSpecResponse.md)**

