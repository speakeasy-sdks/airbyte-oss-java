# sourceDefinitionSpecification

## Overview

SourceDefinition specification related resources.

### Available Operations

* [getSourceDefinitionSpecification](#getsourcedefinitionspecification) - Get specification for a SourceDefinition.

## getSourceDefinitionSpecification

Get specification for a SourceDefinition.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetSourceDefinitionSpecificationResponse;
import WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId req = new SourceDefinitionIdWithWorkspaceId("99e26ced-8f9f-4db9-810f-63bbf817837b", "01afdd78-8624-4189-ab44-873f5033f19d");            

            GetSourceDefinitionSpecificationResponse res = sdk.sourceDefinitionSpecification.getSourceDefinitionSpecification(req);

            if (res.sourceDefinitionSpecificationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId](../../models/shared/SourceDefinitionIdWithWorkspaceId.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[WayScript.airbyte_test.models.operations.GetSourceDefinitionSpecificationResponse](../../models/operations/GetSourceDefinitionSpecificationResponse.md)**

