# destinationDefinitionSpecification

## Overview

DestinationDefinitionSpecification related resources.

### Available Operations

* [getDestinationDefinitionSpecification](#getdestinationdefinitionspecification) - Get specification for a destinationDefinition

## getDestinationDefinitionSpecification

Get specification for a destinationDefinition

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetDestinationDefinitionSpecificationResponse;
import WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId req = new DestinationDefinitionIdWithWorkspaceId("562a7b40-8f05-4e3d-88fd-af313a1f5fd9", "4259c0b3-6f25-4ea9-84f3-b756c11f6c37");            

            GetDestinationDefinitionSpecificationResponse res = sdk.destinationDefinitionSpecification.getDestinationDefinitionSpecification(req);

            if (res.destinationDefinitionSpecificationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId](../../models/shared/DestinationDefinitionIdWithWorkspaceId.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.GetDestinationDefinitionSpecificationResponse](../../models/operations/GetDestinationDefinitionSpecificationResponse.md)**

