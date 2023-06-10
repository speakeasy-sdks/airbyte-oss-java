# destination

## Overview

Destination related resources.

### Available Operations

* [checkConnectionToDestination](#checkconnectiontodestination) - Check connection to the destination
* [checkConnectionToDestinationForUpdate](#checkconnectiontodestinationforupdate) - Check connection for a proposed update to a destination
* [cloneDestination](#clonedestination) - Clone destination
* [createDestination](#createdestination) - Create a destination
* [deleteDestination](#deletedestination) - Delete the destination
* [getDestination](#getdestination) - Get configured destination
* [listDestinationsForWorkspace](#listdestinationsforworkspace) - List configured destinations for a workspace
* [searchDestinations](#searchdestinations) - Search destinations
* [updateDestination](#updatedestination) - Update a destination

## checkConnectionToDestination

Check connection to the destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CheckConnectionToDestinationResponse;
import WayScript.airbyte_test.models.shared.DestinationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationIdRequestBody req = new DestinationIdRequestBody("008e6f8c-5f35-40d8-8db5-a34181430104");            

            CheckConnectionToDestinationResponse res = sdk.destination.checkConnectionToDestination(req);

            if (res.checkConnectionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [WayScript.airbyte_test.models.shared.DestinationIdRequestBody](../../models/shared/DestinationIdRequestBody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[WayScript.airbyte_test.models.operations.CheckConnectionToDestinationResponse](../../models/operations/CheckConnectionToDestinationResponse.md)**


## checkConnectionToDestinationForUpdate

Check connection for a proposed update to a destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CheckConnectionToDestinationForUpdateResponse;
import WayScript.airbyte_test.models.shared.DestinationUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationUpdate req = new DestinationUpdate("fugit", "1813d520-8ece-47e2-93b6-68451c6c6e20", "exercitationem");            

            CheckConnectionToDestinationForUpdateResponse res = sdk.destination.checkConnectionToDestinationForUpdate(req);

            if (res.checkConnectionRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [WayScript.airbyte_test.models.shared.DestinationUpdate](../../models/shared/DestinationUpdate.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[WayScript.airbyte_test.models.operations.CheckConnectionToDestinationForUpdateResponse](../../models/operations/CheckConnectionToDestinationForUpdateResponse.md)**


## cloneDestination

Clone destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CloneDestinationResponse;
import WayScript.airbyte_test.models.shared.DestinationCloneConfiguration;
import WayScript.airbyte_test.models.shared.DestinationCloneRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationCloneRequestBody req = new DestinationCloneRequestBody("e16deab3-fec9-4578-a645-84273a8418d1") {{
                destinationConfiguration = new DestinationCloneConfiguration() {{
                    connectionConfiguration = "nisi";
                    name = "Edith Beahan";
                }};;
            }};            

            CloneDestinationResponse res = sdk.destination.cloneDestination(req);

            if (res.destinationRead != null) {
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
| `request`                                                                                                              | [WayScript.airbyte_test.models.shared.DestinationCloneRequestBody](../../models/shared/DestinationCloneRequestBody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[WayScript.airbyte_test.models.operations.CloneDestinationResponse](../../models/operations/CloneDestinationResponse.md)**


## createDestination

Create a destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateDestinationResponse;
import WayScript.airbyte_test.models.shared.DestinationCreate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationCreate req = new DestinationCreate("soluta", "0929921a-efb9-4f58-84d8-6e68e4be0560", "quasi", "3f59da75-7a59-4ecf-af66-ef1caa3383c2");            

            CreateDestinationResponse res = sdk.destination.createDestination(req);

            if (res.destinationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [WayScript.airbyte_test.models.shared.DestinationCreate](../../models/shared/DestinationCreate.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[WayScript.airbyte_test.models.operations.CreateDestinationResponse](../../models/operations/CreateDestinationResponse.md)**


## deleteDestination

Delete the destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteDestinationResponse;
import WayScript.airbyte_test.models.shared.DestinationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationIdRequestBody req = new DestinationIdRequestBody("beb47737-3c8d-472f-a4d1-db1f2c431066");            

            DeleteDestinationResponse res = sdk.destination.deleteDestination(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [WayScript.airbyte_test.models.shared.DestinationIdRequestBody](../../models/shared/DestinationIdRequestBody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[WayScript.airbyte_test.models.operations.DeleteDestinationResponse](../../models/operations/DeleteDestinationResponse.md)**


## getDestination

Get configured destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetDestinationResponse;
import WayScript.airbyte_test.models.shared.DestinationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationIdRequestBody req = new DestinationIdRequestBody("1e96349e-1cf9-4e06-a3a4-37000ae6b6bc");            

            GetDestinationResponse res = sdk.destination.getDestination(req);

            if (res.destinationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [WayScript.airbyte_test.models.shared.DestinationIdRequestBody](../../models/shared/DestinationIdRequestBody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[WayScript.airbyte_test.models.operations.GetDestinationResponse](../../models/operations/GetDestinationResponse.md)**


## listDestinationsForWorkspace

List configured destinations for a workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListDestinationsForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("9b8f759e-ac55-4a97-81d3-11352965bb8a");            

            ListDestinationsForWorkspaceResponse res = sdk.destination.listDestinationsForWorkspace(req);

            if (res.destinationReadList != null) {
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

**[WayScript.airbyte_test.models.operations.ListDestinationsForWorkspaceResponse](../../models/operations/ListDestinationsForWorkspaceResponse.md)**


## searchDestinations

Search destinations

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SearchDestinationsResponse;
import WayScript.airbyte_test.models.shared.DestinationSearch;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationSearch req = new DestinationSearch() {{
                connectionConfiguration = "odio";
                destinationDefinitionId = "20261143-5e13-49db-8225-9b1abda8c070";
                destinationId = "e1084cb0-672d-41ad-879e-eb9665b85efb";
                destinationName = "at";
                name = "Rachel Powlowski";
                workspaceId = "0be2d782-259e-43ea-8b51-97f92443da7c";
            }};            

            SearchDestinationsResponse res = sdk.destination.searchDestinations(req);

            if (res.destinationReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [WayScript.airbyte_test.models.shared.DestinationSearch](../../models/shared/DestinationSearch.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[WayScript.airbyte_test.models.operations.SearchDestinationsResponse](../../models/operations/SearchDestinationsResponse.md)**


## updateDestination

Update a destination

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateDestinationResponse;
import WayScript.airbyte_test.models.shared.DestinationUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationUpdate req = new DestinationUpdate("necessitatibus", "52b895c5-37c6-4454-afb0-b34896c3ca5a", "impedit");            

            UpdateDestinationResponse res = sdk.destination.updateDestination(req);

            if (res.destinationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [WayScript.airbyte_test.models.shared.DestinationUpdate](../../models/shared/DestinationUpdate.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[WayScript.airbyte_test.models.operations.UpdateDestinationResponse](../../models/operations/UpdateDestinationResponse.md)**

