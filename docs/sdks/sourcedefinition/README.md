# sourceDefinition

## Overview

SourceDefinition related resources.

### Available Operations

* [createCustomSourceDefinition](#createcustomsourcedefinition) - Creates a custom sourceDefinition for the given workspace
* [deleteSourceDefinition](#deletesourcedefinition) - Delete a source definition
* [getSourceDefinition](#getsourcedefinition) - Get source
* [getSourceDefinitionForWorkspace](#getsourcedefinitionforworkspace) - Get a sourceDefinition that is configured for the given workspace
* [grantSourceDefinitionToWorkspace](#grantsourcedefinitiontoworkspace) - grant a private, non-custom sourceDefinition to a given workspace
* [listLatestSourceDefinitions](#listlatestsourcedefinitions) - List the latest sourceDefinitions Airbyte supports
* [listPrivateSourceDefinitions](#listprivatesourcedefinitions) - List all private, non-custom sourceDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.
* [listSourceDefinitions](#listsourcedefinitions) - List all the sourceDefinitions the current Airbyte deployment is configured to use
* [listSourceDefinitionsForWorkspace](#listsourcedefinitionsforworkspace) - List all the sourceDefinitions the given workspace is configured to use
* [revokeSourceDefinitionFromWorkspace](#revokesourcedefinitionfromworkspace) - revoke a grant to a private, non-custom sourceDefinition from a given workspace
* [updateSourceDefinition](#updatesourcedefinition) - Update a sourceDefinition

## createCustomSourceDefinition

Creates a custom sourceDefinition for the given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateCustomSourceDefinitionResponse;
import WayScript.airbyte_test.models.shared.ActorDefinitionResourceRequirements;
import WayScript.airbyte_test.models.shared.CustomSourceDefinitionCreate;
import WayScript.airbyte_test.models.shared.JobType;
import WayScript.airbyte_test.models.shared.JobTypeResourceLimit;
import WayScript.airbyte_test.models.shared.ResourceRequirements;
import WayScript.airbyte_test.models.shared.SourceDefinitionCreate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.CustomSourceDefinitionCreate req = new CustomSourceDefinitionCreate(                new SourceDefinitionCreate("ipsam", "odio", "http://complex-sulfur.org", "praesentium") {{
                                icon = "sint";
                                resourceRequirements = new ActorDefinitionResourceRequirements() {{
                                    default_ = new ResourceRequirements() {{
                                        cpuLimit = "exercitationem";
                                        cpuRequest = "cum";
                                        memoryLimit = "voluptatum";
                                        memoryRequest = "facilis";
                                    }};;
                                    jobSpecific = new WayScript.airbyte_test.models.shared.JobTypeResourceLimit[]{{
                                        add(new JobTypeResourceLimit(JobType.RESET_CONNECTION,                 new ResourceRequirements() {{
                                                            cpuLimit = "nemo";
                                                            cpuRequest = "natus";
                                                            memoryLimit = "nisi";
                                                            memoryRequest = "provident";
                                                        }};) {{
                                            jobType = JobType.REPLICATE;
                                            resourceRequirements = new ResourceRequirements() {{
                                                cpuLimit = "dolores";
                                                cpuRequest = "dolore";
                                                memoryLimit = "pariatur";
                                                memoryRequest = "facilis";
                                            }};
                                        }}),
                                        add(new JobTypeResourceLimit(JobType.SYNC,                 new ResourceRequirements() {{
                                                            cpuLimit = "dolore";
                                                            cpuRequest = "ullam";
                                                            memoryLimit = "velit";
                                                            memoryRequest = "adipisci";
                                                        }};) {{
                                            jobType = JobType.CHECK_CONNECTION;
                                            resourceRequirements = new ResourceRequirements() {{
                                                cpuLimit = "dolor";
                                                cpuRequest = "nostrum";
                                                memoryLimit = "qui";
                                                memoryRequest = "tenetur";
                                            }};
                                        }}),
                                        add(new JobTypeResourceLimit(JobType.SYNC,                 new ResourceRequirements() {{
                                                            cpuLimit = "repellendus";
                                                            cpuRequest = "saepe";
                                                            memoryLimit = "amet";
                                                            memoryRequest = "distinctio";
                                                        }};) {{
                                            jobType = JobType.RESET_CONNECTION;
                                            resourceRequirements = new ResourceRequirements() {{
                                                cpuLimit = "occaecati";
                                                cpuRequest = "numquam";
                                                memoryLimit = "fugiat";
                                                memoryRequest = "molestiae";
                                            }};
                                        }}),
                                        add(new JobTypeResourceLimit(JobType.RESET_CONNECTION,                 new ResourceRequirements() {{
                                                            cpuLimit = "voluptatibus";
                                                            cpuRequest = "ullam";
                                                            memoryLimit = "dolorum";
                                                            memoryRequest = "soluta";
                                                        }};) {{
                                            jobType = JobType.DISCOVER_SCHEMA;
                                            resourceRequirements = new ResourceRequirements() {{
                                                cpuLimit = "necessitatibus";
                                                cpuRequest = "iste";
                                                memoryLimit = "nesciunt";
                                                memoryRequest = "corrupti";
                                            }};
                                        }}),
                                    }};
                                }};;
                            }};, "b7f66255-0a28-4382-ac48-3afd2315bba6");            

            CreateCustomSourceDefinitionResponse res = sdk.sourceDefinition.createCustomSourceDefinition(req);

            if (res.sourceDefinitionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [WayScript.airbyte_test.models.shared.CustomSourceDefinitionCreate](../../models/shared/CustomSourceDefinitionCreate.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[WayScript.airbyte_test.models.operations.CreateCustomSourceDefinitionResponse](../../models/operations/CreateCustomSourceDefinitionResponse.md)**


## deleteSourceDefinition

Delete a source definition

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteSourceDefinitionResponse;
import WayScript.airbyte_test.models.shared.SourceDefinitionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionIdRequestBody req = new SourceDefinitionIdRequestBody("50164e06-f5bf-46ae-991b-c8bdef3612b6");            

            DeleteSourceDefinitionResponse res = sdk.sourceDefinition.deleteSourceDefinition(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [WayScript.airbyte_test.models.shared.SourceDefinitionIdRequestBody](../../models/shared/SourceDefinitionIdRequestBody.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[WayScript.airbyte_test.models.operations.DeleteSourceDefinitionResponse](../../models/operations/DeleteSourceDefinitionResponse.md)**


## getSourceDefinition

Get source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetSourceDefinitionResponse;
import WayScript.airbyte_test.models.shared.SourceDefinitionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionIdRequestBody req = new SourceDefinitionIdRequestBody("3c205fda-8407-474a-a8a9-a35d086b6f66");            

            GetSourceDefinitionResponse res = sdk.sourceDefinition.getSourceDefinition(req);

            if (res.sourceDefinitionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [WayScript.airbyte_test.models.shared.SourceDefinitionIdRequestBody](../../models/shared/SourceDefinitionIdRequestBody.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[WayScript.airbyte_test.models.operations.GetSourceDefinitionResponse](../../models/operations/GetSourceDefinitionResponse.md)**


## getSourceDefinitionForWorkspace

Get a sourceDefinition that is configured for the given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetSourceDefinitionForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId req = new SourceDefinitionIdWithWorkspaceId("fef020e9-f443-4b42-97b9-92c8dbda6a61", "efa21982-58fd-40a9-aba4-7f7d3ef04964");            

            GetSourceDefinitionForWorkspaceResponse res = sdk.sourceDefinition.getSourceDefinitionForWorkspace(req);

            if (res.sourceDefinitionRead != null) {
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

**[WayScript.airbyte_test.models.operations.GetSourceDefinitionForWorkspaceResponse](../../models/operations/GetSourceDefinitionForWorkspaceResponse.md)**


## grantSourceDefinitionToWorkspace

grant a private, non-custom sourceDefinition to a given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GrantSourceDefinitionToWorkspaceResponse;
import WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId req = new SourceDefinitionIdWithWorkspaceId("0d6a1831-c87a-4df5-96fd-f1ad837ae80c", "1c19c95b-a998-4678-ba3f-696991af388c");            

            GrantSourceDefinitionToWorkspaceResponse res = sdk.sourceDefinition.grantSourceDefinitionToWorkspace(req);

            if (res.privateSourceDefinitionRead != null) {
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

**[WayScript.airbyte_test.models.operations.GrantSourceDefinitionToWorkspaceResponse](../../models/operations/GrantSourceDefinitionToWorkspaceResponse.md)**


## listLatestSourceDefinitions

Guaranteed to retrieve the latest information on supported sources.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListLatestSourceDefinitionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            ListLatestSourceDefinitionsResponse res = sdk.sourceDefinition.listLatestSourceDefinitions();

            if (res.sourceDefinitionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.ListLatestSourceDefinitionsResponse](../../models/operations/ListLatestSourceDefinitionsResponse.md)**


## listPrivateSourceDefinitions

List all private, non-custom sourceDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListPrivateSourceDefinitionsResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("e0361444-8c79-477a-8ef2-f536028efeef");            

            ListPrivateSourceDefinitionsResponse res = sdk.sourceDefinition.listPrivateSourceDefinitions(req);

            if (res.privateSourceDefinitionReadList != null) {
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

**[WayScript.airbyte_test.models.operations.ListPrivateSourceDefinitionsResponse](../../models/operations/ListPrivateSourceDefinitionsResponse.md)**


## listSourceDefinitions

List all the sourceDefinitions the current Airbyte deployment is configured to use

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListSourceDefinitionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            ListSourceDefinitionsResponse res = sdk.sourceDefinition.listSourceDefinitions();

            if (res.sourceDefinitionReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.ListSourceDefinitionsResponse](../../models/operations/ListSourceDefinitionsResponse.md)**


## listSourceDefinitionsForWorkspace

List all the sourceDefinitions the given workspace is configured to use

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListSourceDefinitionsForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("934152ed-7e25-43f4-8157-deaa7170f445");            

            ListSourceDefinitionsForWorkspaceResponse res = sdk.sourceDefinition.listSourceDefinitionsForWorkspace(req);

            if (res.sourceDefinitionReadList != null) {
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

**[WayScript.airbyte_test.models.operations.ListSourceDefinitionsForWorkspaceResponse](../../models/operations/ListSourceDefinitionsForWorkspaceResponse.md)**


## revokeSourceDefinitionFromWorkspace

revoke a grant to a private, non-custom sourceDefinition from a given workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.RevokeSourceDefinitionFromWorkspaceResponse;
import WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId req = new SourceDefinitionIdWithWorkspaceId("accf667a-af9b-4bad-985f-e431d6bf5c83", "8fbb8c20-cb67-4fc4-b425-e99e6234c9f7");            

            RevokeSourceDefinitionFromWorkspaceResponse res = sdk.sourceDefinition.revokeSourceDefinitionFromWorkspace(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId](../../models/shared/SourceDefinitionIdWithWorkspaceId.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[WayScript.airbyte_test.models.operations.RevokeSourceDefinitionFromWorkspaceResponse](../../models/operations/RevokeSourceDefinitionFromWorkspaceResponse.md)**


## updateSourceDefinition

Update a sourceDefinition

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateSourceDefinitionResponse;
import WayScript.airbyte_test.models.shared.ActorDefinitionResourceRequirements;
import WayScript.airbyte_test.models.shared.JobType;
import WayScript.airbyte_test.models.shared.JobTypeResourceLimit;
import WayScript.airbyte_test.models.shared.ResourceRequirements;
import WayScript.airbyte_test.models.shared.SourceDefinitionUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDefinitionUpdate req = new SourceDefinitionUpdate("tempore", "79dfeb77-a5c3-48d4-baf9-1e506ef890a5") {{
                resourceRequirements = new ActorDefinitionResourceRequirements() {{
                    default_ = new ResourceRequirements() {{
                        cpuLimit = "tempora";
                        cpuRequest = "nam";
                        memoryLimit = "numquam";
                        memoryRequest = "odio";
                    }};;
                    jobSpecific = new WayScript.airbyte_test.models.shared.JobTypeResourceLimit[]{{
                        add(new JobTypeResourceLimit(JobType.DISCOVER_SCHEMA,                 new ResourceRequirements() {{
                                            cpuLimit = "possimus";
                                            cpuRequest = "nesciunt";
                                            memoryLimit = "corrupti";
                                            memoryRequest = "nostrum";
                                        }};) {{
                            jobType = JobType.REPLICATE;
                            resourceRequirements = new ResourceRequirements() {{
                                cpuLimit = "veritatis";
                                cpuRequest = "autem";
                                memoryLimit = "earum";
                                memoryRequest = "minima";
                            }};
                        }}),
                        add(new JobTypeResourceLimit(JobType.CONNECTION_UPDATER,                 new ResourceRequirements() {{
                                            cpuLimit = "autem";
                                            cpuRequest = "adipisci";
                                            memoryLimit = "sunt";
                                            memoryRequest = "rerum";
                                        }};) {{
                            jobType = JobType.RESET_CONNECTION;
                            resourceRequirements = new ResourceRequirements() {{
                                cpuLimit = "sequi";
                                cpuRequest = "maxime";
                                memoryLimit = "numquam";
                                memoryRequest = "laborum";
                            }};
                        }}),
                    }};
                }};;
            }};            

            UpdateSourceDefinitionResponse res = sdk.sourceDefinition.updateSourceDefinition(req);

            if (res.sourceDefinitionRead != null) {
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
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.SourceDefinitionUpdate](../../models/shared/SourceDefinitionUpdate.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.UpdateSourceDefinitionResponse](../../models/operations/UpdateSourceDefinitionResponse.md)**

