# health

## Overview

Healthchecks

### Available Operations

* [getHealthCheck](#gethealthcheck) - Health Check

## getHealthCheck

Health Check

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetHealthCheckResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            GetHealthCheckResponse res = sdk.health.getHealthCheck();

            if (res.healthCheckRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.GetHealthCheckResponse](../../models/operations/GetHealthCheckResponse.md)**

