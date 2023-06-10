# destinationDefinition

## Overview

DestinationDefinition related resources.

### Available Operations

* [createCustomDestinationDefinition](#createcustomdestinationdefinition) - Creates a custom destinationDefinition for the given workspace
* [deleteDestinationDefinition](#deletedestinationdefinition) - Delete a destination definition
* [getDestinationDefinition](#getdestinationdefinition) - Get destinationDefinition
* [getDestinationDefinitionForWorkspace](#getdestinationdefinitionforworkspace) - Get a destinationDefinition that is configured for the given workspace
* [grantDestinationDefinitionToWorkspace](#grantdestinationdefinitiontoworkspace) - grant a private, non-custom destinationDefinition to a given workspace
* [listDestinationDefinitions](#listdestinationdefinitions) - List all the destinationDefinitions the current Airbyte deployment is configured to use
* [listDestinationDefinitionsForWorkspace](#listdestinationdefinitionsforworkspace) - List all the destinationDefinitions the given workspace is configured to use
* [listLatestDestinationDefinitions](#listlatestdestinationdefinitions) - List the latest destinationDefinitions Airbyte supports
* [listPrivateDestinationDefinitions](#listprivatedestinationdefinitions) - List all private, non-custom destinationDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.
* [revokeDestinationDefinitionFromWorkspace](#revokedestinationdefinitionfromworkspace) - revoke a grant to a private, non-custom destinationDefinition from a given workspace
* [updateDestinationDefinition](#updatedestinationdefinition) - Update destinationDefinition

## createCustomDestinationDefinition

Creates a custom destinationDefinition for the given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateCustomDestinationDefinitionResponse;
import WayScript.airbyte_test.models.shared.ActorDefinitionResourceRequirements;
import WayScript.airbyte_test.models.shared.CustomDestinationDefinitionCreate;
import WayScript.airbyte_test.models.shared.DestinationDefinitionCreate;
import WayScript.airbyte_test.models.shared.JobType;
import WayScript.airbyte_test.models.shared.JobTypeResourceLimit;
import WayScript.airbyte_test.models.shared.ResourceRequirements;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.CustomDestinationDefinitionCreate req = new CustomDestinationDefinitionCreate(                new DestinationDefinitionCreate("delectus", "tempore", "https://conventional-yurt.org", "nemo") {{
                                icon = "reprehenderit";
                                resourceRequirements = new ActorDefinitionResourceRequirements() {{
                                    default_ = new ResourceRequirements() {{
                                        cpuLimit = "aperiam";
                                        cpuRequest = "odio";
                                        memoryLimit = "minima";
                                        memoryRequest = "in";
                                    }};;
                                    jobSpecific = new WayScript.airbyte_test.models.shared.JobTypeResourceLimit[]{{
                                        add(new JobTypeResourceLimit(JobType.SYNC,                 new ResourceRequirements() {{
                                                            cpuLimit = "pariatur";
                                                            cpuRequest = "itaque";
                                                            memoryLimit = "similique";
                                                            memoryRequest = "optio";
                                                        }};) {{
                                            jobType = JobType.SYNC;
                                            resourceRequirements = new ResourceRequirements() {{
                                                cpuLimit = "dolores";
                                                cpuRequest = "error";
                                                memoryLimit = "veritatis";
                                                memoryRequest = "ducimus";
                                            }};
                                        }}),
                                        add(new JobTypeResourceLimit(JobType.RESET_CONNECTION,                 new ResourceRequirements() {{
                                                            cpuLimit = "exercitationem";
                                                            cpuRequest = "quam";
                                                            memoryLimit = "dolorem";
                                                            memoryRequest = "modi";
                                                        }};) {{
                                            jobType = JobType.DISCOVER_SCHEMA;
                                            resourceRequirements = new ResourceRequirements() {{
                                                cpuLimit = "quaerat";
                                                cpuRequest = "commodi";
                                                memoryLimit = "officiis";
                                                memoryRequest = "placeat";
                                            }};
                                        }}),
                                    }};
                                }};;
                            }};, "09e3eb1e-5a2b-412e-b07f-116db99545fc");            

            CreateCustomDestinationDefinitionResponse res = sdk.destinationDefinition.createCustomDestinationDefinition(req);

            if (res.destinationDefinitionRead != null) {
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
| `request`                                                                                                                          | [WayScript.airbyte_test.models.shared.CustomDestinationDefinitionCreate](../../models/shared/CustomDestinationDefinitionCreate.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[WayScript.airbyte_test.models.operations.CreateCustomDestinationDefinitionResponse](../../models/operations/CreateCustomDestinationDefinitionResponse.md)**


## deleteDestinationDefinition

Delete a destination definition

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteDestinationDefinitionResponse;
import WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody req = new DestinationDefinitionIdRequestBody("95fa8897-0e18-49db-b30f-cb33ea055b19");            

            DeleteDestinationDefinitionResponse res = sdk.destinationDefinition.deleteDestinationDefinition(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody](../../models/shared/DestinationDefinitionIdRequestBody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[WayScript.airbyte_test.models.operations.DeleteDestinationDefinitionResponse](../../models/operations/DeleteDestinationDefinitionResponse.md)**


## getDestinationDefinition

Get destinationDefinition

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetDestinationDefinitionResponse;
import WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody req = new DestinationDefinitionIdRequestBody("7cd44e2f-52d8-42d3-913b-b6f48b656bcd");            

            GetDestinationDefinitionResponse res = sdk.destinationDefinition.getDestinationDefinition(req);

            if (res.destinationDefinitionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody](../../models/shared/DestinationDefinitionIdRequestBody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[WayScript.airbyte_test.models.operations.GetDestinationDefinitionResponse](../../models/operations/GetDestinationDefinitionResponse.md)**


## getDestinationDefinitionForWorkspace

Get a destinationDefinition that is configured for the given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetDestinationDefinitionForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId req = new DestinationDefinitionIdWithWorkspaceId("b35ff2e4-b275-437a-8cd9-e7319c177d52", "5f77b114-eeb5-42ff-b85f-c37814d4c98e");            

            GetDestinationDefinitionForWorkspaceResponse res = sdk.destinationDefinition.getDestinationDefinitionForWorkspace(req);

            if (res.destinationDefinitionRead != null) {
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

**[WayScript.airbyte_test.models.operations.GetDestinationDefinitionForWorkspaceResponse](../../models/operations/GetDestinationDefinitionForWorkspaceResponse.md)**


## grantDestinationDefinitionToWorkspace

grant a private, non-custom destinationDefinition to a given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GrantDestinationDefinitionToWorkspaceResponse;
import WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId req = new DestinationDefinitionIdWithWorkspaceId("0c2bb89e-b75d-4ad6-b6c6-00503d8bb311", "80f739ae-9e05-47eb-809e-2810331f3981");            

            GrantDestinationDefinitionToWorkspaceResponse res = sdk.destinationDefinition.grantDestinationDefinitionToWorkspace(req);

            if (res.privateDestinationDefinitionRead != null) {
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

**[WayScript.airbyte_test.models.operations.GrantDestinationDefinitionToWorkspaceResponse](../../models/operations/GrantDestinationDefinitionToWorkspaceResponse.md)**


## listDestinationDefinitions

List all the destinationDefinitions the current Airbyte deployment is configured to use

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListDestinationDefinitionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            ListDestinationDefinitionsResponse res = sdk.destinationDefinition.listDestinationDefinitions();

            if (res.destinationDefinitionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.ListDestinationDefinitionsResponse](../../models/operations/ListDestinationDefinitionsResponse.md)**


## listDestinationDefinitionsForWorkspace

List all the destinationDefinitions the given workspace is configured to use

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListDestinationDefinitionsForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("d4c700b6-07f3-4c93-873b-9da3f2ceda7e");            

            ListDestinationDefinitionsForWorkspaceResponse res = sdk.destinationDefinition.listDestinationDefinitionsForWorkspace(req);

            if (res.destinationDefinitionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody](../../models/shared/WorkspaceIdRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.ListDestinationDefinitionsForWorkspaceResponse](../../models/operations/ListDestinationDefinitionsForWorkspaceResponse.md)**


## listLatestDestinationDefinitions

Guaranteed to retrieve the latest information on supported destinations.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListLatestDestinationDefinitionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            ListLatestDestinationDefinitionsResponse res = sdk.destinationDefinition.listLatestDestinationDefinitions();

            if (res.destinationDefinitionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.ListLatestDestinationDefinitionsResponse](../../models/operations/ListLatestDestinationDefinitionsResponse.md)**


## listPrivateDestinationDefinitions

List all private, non-custom destinationDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListPrivateDestinationDefinitionsResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("23f22574-11fa-4f4b-b544-e472e802857a");            

            ListPrivateDestinationDefinitionsResponse res = sdk.destinationDefinition.listPrivateDestinationDefinitions(req);

            if (res.privateDestinationDefinitionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody](../../models/shared/WorkspaceIdRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.ListPrivateDestinationDefinitionsResponse](../../models/operations/ListPrivateDestinationDefinitionsResponse.md)**


## revokeDestinationDefinitionFromWorkspace

revoke a grant to a private, non-custom destinationDefinition from a given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.RevokeDestinationDefinitionFromWorkspaceResponse;
import WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId req = new DestinationDefinitionIdWithWorkspaceId("5b40463a-7d57-45f1-800e-764ad7334ec1", "b781b36a-0808-48d1-80ef-ada200ef0422");            

            RevokeDestinationDefinitionFromWorkspaceResponse res = sdk.destinationDefinition.revokeDestinationDefinitionFromWorkspace(req);

            if (res.statusCode == 200) {
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

**[WayScript.airbyte_test.models.operations.RevokeDestinationDefinitionFromWorkspaceResponse](../../models/operations/RevokeDestinationDefinitionFromWorkspaceResponse.md)**


## updateDestinationDefinition

Update destinationDefinition

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateDestinationDefinitionResponse;
import WayScript.airbyte_test.models.shared.ActorDefinitionResourceRequirements;
import WayScript.airbyte_test.models.shared.DestinationDefinitionUpdate;
import WayScript.airbyte_test.models.shared.JobType;
import WayScript.airbyte_test.models.shared.JobTypeResourceLimit;
import WayScript.airbyte_test.models.shared.ResourceRequirements;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationDefinitionUpdate req = new DestinationDefinitionUpdate("eb2164cf-9ab8-4366-8723-ffda9e06bee4") {{
                dockerImageTag = "rem";
                resourceRequirements = new ActorDefinitionResourceRequirements() {{
                    default_ = new ResourceRequirements() {{
                        cpuLimit = "quia";
                        cpuRequest = "ullam";
                        memoryLimit = "quisquam";
                        memoryRequest = "dicta";
                    }};;
                    jobSpecific = new WayScript.airbyte_test.models.shared.JobTypeResourceLimit[]{{
                        add(new JobTypeResourceLimit(JobType.DISCOVER_SCHEMA,                 new ResourceRequirements() {{
                                            cpuLimit = "optio";
                                            cpuRequest = "rem";
                                            memoryLimit = "perferendis";
                                            memoryRequest = "facilis";
                                        }};) {{
                            jobType = JobType.CONNECTION_UPDATER;
                            resourceRequirements = new ResourceRequirements() {{
                                cpuLimit = "quae";
                                cpuRequest = "officiis";
                                memoryLimit = "architecto";
                                memoryRequest = "architecto";
                            }};
                        }}),
                        add(new JobTypeResourceLimit(JobType.DISCOVER_SCHEMA,                 new ResourceRequirements() {{
                                            cpuLimit = "dolore";
                                            cpuRequest = "modi";
                                            memoryLimit = "itaque";
                                            memoryRequest = "maxime";
                                        }};) {{
                            jobType = JobType.REPLICATE;
                            resourceRequirements = new ResourceRequirements() {{
                                cpuLimit = "a";
                                cpuRequest = "iste";
                                memoryLimit = "dicta";
                                memoryRequest = "quos";
                            }};
                        }}),
                        add(new JobTypeResourceLimit(JobType.CONNECTION_UPDATER,                 new ResourceRequirements() {{
                                            cpuLimit = "porro";
                                            cpuRequest = "accusamus";
                                            memoryLimit = "totam";
                                            memoryRequest = "reiciendis";
                                        }};) {{
                            jobType = JobType.CHECK_CONNECTION;
                            resourceRequirements = new ResourceRequirements() {{
                                cpuLimit = "consequuntur";
                                cpuRequest = "assumenda";
                                memoryLimit = "vero";
                                memoryRequest = "doloribus";
                            }};
                        }}),
                        add(new JobTypeResourceLimit(JobType.SYNC,                 new ResourceRequirements() {{
                                            cpuLimit = "nesciunt";
                                            cpuRequest = "debitis";
                                            memoryLimit = "vel";
                                            memoryRequest = "neque";
                                        }};) {{
                            jobType = JobType.GET_SPEC;
                            resourceRequirements = new ResourceRequirements() {{
                                cpuLimit = "sint";
                                cpuRequest = "nihil";
                                memoryLimit = "esse";
                                memoryRequest = "iure";
                            }};
                        }}),
                    }};
                }};;
            }};            

            UpdateDestinationDefinitionResponse res = sdk.destinationDefinition.updateDestinationDefinition(req);

            if (res.destinationDefinitionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [WayScript.airbyte_test.models.shared.DestinationDefinitionUpdate](../../models/shared/DestinationDefinitionUpdate.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[WayScript.airbyte_test.models.operations.UpdateDestinationDefinitionResponse](../../models/operations/UpdateDestinationDefinitionResponse.md)**

