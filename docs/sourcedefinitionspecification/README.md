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

            WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId req = new SourceDefinitionIdWithWorkspaceId("a0e123b7-847e-4c59-a1f6-7f3c4cce4b6d", "7696ff3c-5747-4501-b57e-44f51f8b084c");            

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
