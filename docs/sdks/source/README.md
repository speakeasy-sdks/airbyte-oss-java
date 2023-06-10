# source

## Overview

Source related resources.

### Available Operations

* [checkConnectionToSource](#checkconnectiontosource) - Check connection to the source
* [checkConnectionToSourceForUpdate](#checkconnectiontosourceforupdate) - Check connection for a proposed update to a source
* [cloneSource](#clonesource) - Clone source
* [createSource](#createsource) - Create a source
* [deleteSource](#deletesource) - Delete a source
* [discoverSchemaForSource](#discoverschemaforsource) - Discover the schema catalog of the source
* [getMostRecentSourceActorCatalog](#getmostrecentsourceactorcatalog) - Get most recent ActorCatalog for source
* [getSource](#getsource) - Get source
* [listSourcesForWorkspace](#listsourcesforworkspace) - List sources for workspace
* [searchSources](#searchsources) - Search sources
* [updateSource](#updatesource) - Update a source
* [writeDiscoverCatalogResult](#writediscovercatalogresult) - Should only called from worker, to write result from discover activity back to DB.

## checkConnectionToSource

Check connection to the source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CheckConnectionToSourceResponse;
import WayScript.airbyte_test.models.shared.SourceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceIdRequestBody req = new SourceIdRequestBody("c11a0836-4290-468b-8502-a55e7f73bc84");            

            CheckConnectionToSourceResponse res = sdk.source.checkConnectionToSource(req);

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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [WayScript.airbyte_test.models.shared.SourceIdRequestBody](../../models/shared/SourceIdRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[WayScript.airbyte_test.models.operations.CheckConnectionToSourceResponse](../../models/operations/CheckConnectionToSourceResponse.md)**


## checkConnectionToSourceForUpdate

Check connection for a proposed update to a source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CheckConnectionToSourceForUpdateResponse;
import WayScript.airbyte_test.models.shared.SourceUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceUpdate req = new SourceUpdate("ipsam", "officiis", "320a319f-4bad-4f94-bc9a-867bc4242666");            

            CheckConnectionToSourceForUpdateResponse res = sdk.source.checkConnectionToSourceForUpdate(req);

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

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `request`                                                                                | [WayScript.airbyte_test.models.shared.SourceUpdate](../../models/shared/SourceUpdate.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[WayScript.airbyte_test.models.operations.CheckConnectionToSourceForUpdateResponse](../../models/operations/CheckConnectionToSourceForUpdateResponse.md)**


## cloneSource

Clone source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CloneSourceResponse;
import WayScript.airbyte_test.models.shared.SourceCloneConfiguration;
import WayScript.airbyte_test.models.shared.SourceCloneRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceCloneRequestBody req = new SourceCloneRequestBody("5816ddca-8ef5-41fc-b4c5-93ec12cdaad0") {{
                sourceConfiguration = new SourceCloneConfiguration() {{
                    connectionConfiguration = "accusamus";
                    name = "Jamie Murazik";
                }};;
            }};            

            CloneSourceResponse res = sdk.source.cloneSource(req);

            if (res.sourceRead != null) {
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
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.SourceCloneRequestBody](../../models/shared/SourceCloneRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.CloneSourceResponse](../../models/operations/CloneSourceResponse.md)**


## createSource

Create a source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateSourceResponse;
import WayScript.airbyte_test.models.shared.SourceCreate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceCreate req = new SourceCreate("facere", "nobis", "d80df448-a47f-4939-8c58-880983dabf9e", "f3ffdd9f-7f07-49af-8d35-724cdb0f4d28");            

            CreateSourceResponse res = sdk.source.createSource(req);

            if (res.sourceRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `request`                                                                                | [WayScript.airbyte_test.models.shared.SourceCreate](../../models/shared/SourceCreate.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[WayScript.airbyte_test.models.operations.CreateSourceResponse](../../models/operations/CreateSourceResponse.md)**


## deleteSource

Delete a source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteSourceResponse;
import WayScript.airbyte_test.models.shared.SourceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceIdRequestBody req = new SourceIdRequestBody("1187d568-44ed-4ed8-9a90-65e628bdfc20");            

            DeleteSourceResponse res = sdk.source.deleteSource(req);

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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [WayScript.airbyte_test.models.shared.SourceIdRequestBody](../../models/shared/SourceIdRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[WayScript.airbyte_test.models.operations.DeleteSourceResponse](../../models/operations/DeleteSourceResponse.md)**


## discoverSchemaForSource

Discover the schema catalog of the source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DiscoverSchemaForSourceResponse;
import WayScript.airbyte_test.models.shared.SourceDiscoverSchemaRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDiscoverSchemaRequestBody req = new SourceDiscoverSchemaRequestBody("32b6c879-923b-47e1-b584-f7ae12c6891f") {{
                connectionId = "82ce1157-1723-4053-b7dc-fa89df975e35";
                disableCache = false;
                notifySchemaChange = false;
            }};            

            DiscoverSchemaForSourceResponse res = sdk.source.discoverSchemaForSource(req);

            if (res.sourceDiscoverSchemaRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [WayScript.airbyte_test.models.shared.SourceDiscoverSchemaRequestBody](../../models/shared/SourceDiscoverSchemaRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.DiscoverSchemaForSourceResponse](../../models/operations/DiscoverSchemaForSourceResponse.md)**


## getMostRecentSourceActorCatalog

Get most recent ActorCatalog for source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetMostRecentSourceActorCatalogResponse;
import WayScript.airbyte_test.models.shared.SourceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceIdRequestBody req = new SourceIdRequestBody("6686092e-9c3d-4dc5-b111-dea1026d541a");            

            GetMostRecentSourceActorCatalogResponse res = sdk.source.getMostRecentSourceActorCatalog(req);

            if (res.actorCatalogWithUpdatedAt != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [WayScript.airbyte_test.models.shared.SourceIdRequestBody](../../models/shared/SourceIdRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[WayScript.airbyte_test.models.operations.GetMostRecentSourceActorCatalogResponse](../../models/operations/GetMostRecentSourceActorCatalogResponse.md)**


## getSource

Get source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetSourceResponse;
import WayScript.airbyte_test.models.shared.SourceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceIdRequestBody req = new SourceIdRequestBody("4d190feb-2178-40bc-8c0d-bbddb484708f");            

            GetSourceResponse res = sdk.source.getSource(req);

            if (res.sourceRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [WayScript.airbyte_test.models.shared.SourceIdRequestBody](../../models/shared/SourceIdRequestBody.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[WayScript.airbyte_test.models.operations.GetSourceResponse](../../models/operations/GetSourceResponse.md)**


## listSourcesForWorkspace

List sources for workspace. Does not return deleted sources.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListSourcesForWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("b4e391e6-bc15-48c4-84e5-4599ea342260");            

            ListSourcesForWorkspaceResponse res = sdk.source.listSourcesForWorkspace(req);

            if (res.sourceReadList != null) {
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

**[WayScript.airbyte_test.models.operations.ListSourcesForWorkspaceResponse](../../models/operations/ListSourcesForWorkspaceResponse.md)**


## searchSources

Search sources

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SearchSourcesResponse;
import WayScript.airbyte_test.models.shared.SourceSearch;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceSearch req = new SourceSearch() {{
                connectionConfiguration = "eveniet";
                name = "Mr. Robin Dibbert";
                sourceDefinitionId = "e78a1bd8-fb7a-40a1-96ce-723d4097fa30";
                sourceId = "e9af725b-2912-4203-8d83-f5aeb7799d22";
                sourceName = "vero";
                workspaceId = "8c1f8493-825f-4dc4-ac87-6c2c2dfb4cfc";
            }};            

            SearchSourcesResponse res = sdk.source.searchSources(req);

            if (res.sourceReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `request`                                                                                | [WayScript.airbyte_test.models.shared.SourceSearch](../../models/shared/SourceSearch.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[WayScript.airbyte_test.models.operations.SearchSourcesResponse](../../models/operations/SearchSourcesResponse.md)**


## updateSource

Update a source

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateSourceResponse;
import WayScript.airbyte_test.models.shared.SourceUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceUpdate req = new SourceUpdate("illo", "nobis", "76230f84-1fb1-4bd2-bfdb-14db6be5a685");            

            UpdateSourceResponse res = sdk.source.updateSource(req);

            if (res.sourceRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `request`                                                                                | [WayScript.airbyte_test.models.shared.SourceUpdate](../../models/shared/SourceUpdate.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[WayScript.airbyte_test.models.operations.UpdateSourceResponse](../../models/operations/UpdateSourceResponse.md)**


## writeDiscoverCatalogResult

Should only called from worker, to write result from discover activity back to DB.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse;
import WayScript.airbyte_test.models.shared.AirbyteCatalog;
import WayScript.airbyte_test.models.shared.AirbyteStream;
import WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration;
import WayScript.airbyte_test.models.shared.AirbyteStreamConfiguration;
import WayScript.airbyte_test.models.shared.DestinationSyncMode;
import WayScript.airbyte_test.models.shared.SelectedFieldInfo;
import WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody;
import WayScript.airbyte_test.models.shared.StreamJsonSchema;
import WayScript.airbyte_test.models.shared.SyncMode;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody req = new SourceDiscoverSchemaWriteRequestBody(                new AirbyteCatalog(                new WayScript.airbyte_test.models.shared.AirbyteStreamAndConfiguration[]{{
                                                add(new AirbyteStreamAndConfiguration() {{
                                                    config = new AirbyteStreamConfiguration(DestinationSyncMode.APPEND_DEDUP, SyncMode.INCREMENTAL) {{
                                                        aliasName = "natus";
                                                        cursorField = new String[]{{
                                                            add("necessitatibus"),
                                                            add("aspernatur"),
                                                            add("dolores"),
                                                        }};
                                                        destinationSyncMode = DestinationSyncMode.APPEND_DEDUP;
                                                        fieldSelectionEnabled = false;
                                                        primaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("voluptatem"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("id"),
                                                                add("quae"),
                                                                add("commodi"),
                                                                add("a"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("sed"),
                                                                add("nam"),
                                                                add("quia"),
                                                                add("iusto"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("deserunt"),
                                                            }}),
                                                        }};
                                                        selected = false;
                                                        selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("sint"),
                                                                    add("placeat"),
                                                                    add("ullam"),
                                                                }};
                                                            }}),
                                                        }};
                                                        suggested = false;
                                                        syncMode = SyncMode.FULL_REFRESH;
                                                    }};
                                                    stream = new AirbyteStream("vel") {{
                                                        defaultCursorField = new String[]{{
                                                            add("non"),
                                                            add("recusandae"),
                                                        }};
                                                        jsonSchema = new StreamJsonSchema() {{}};
                                                        name = "Jeffrey Gutmann";
                                                        namespace = "quibusdam";
                                                        sourceDefinedCursor = false;
                                                        sourceDefinedPrimaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("consequuntur"),
                                                            }}),
                                                        }};
                                                        supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                            add(SyncMode.FULL_REFRESH),
                                                            add(SyncMode.FULL_REFRESH),
                                                        }};
                                                    }};
                                                }}),
                                                add(new AirbyteStreamAndConfiguration() {{
                                                    config = new AirbyteStreamConfiguration(DestinationSyncMode.APPEND, SyncMode.FULL_REFRESH) {{
                                                        aliasName = "cupiditate";
                                                        cursorField = new String[]{{
                                                            add("nisi"),
                                                            add("explicabo"),
                                                        }};
                                                        destinationSyncMode = DestinationSyncMode.APPEND;
                                                        fieldSelectionEnabled = false;
                                                        primaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("sit"),
                                                                add("voluptatum"),
                                                            }}),
                                                        }};
                                                        selected = false;
                                                        selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("quam"),
                                                                    add("dolorum"),
                                                                    add("libero"),
                                                                    add("ratione"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("optio"),
                                                                    add("saepe"),
                                                                }};
                                                            }}),
                                                        }};
                                                        suggested = false;
                                                        syncMode = SyncMode.INCREMENTAL;
                                                    }};
                                                    stream = new AirbyteStream("est") {{
                                                        defaultCursorField = new String[]{{
                                                            add("consequuntur"),
                                                        }};
                                                        jsonSchema = new StreamJsonSchema() {{}};
                                                        name = "Jean Mayert";
                                                        namespace = "quidem";
                                                        sourceDefinedCursor = false;
                                                        sourceDefinedPrimaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("modi"),
                                                                add("quasi"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("similique"),
                                                            }}),
                                                        }};
                                                        supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                            add(SyncMode.INCREMENTAL),
                                                            add(SyncMode.FULL_REFRESH),
                                                            add(SyncMode.FULL_REFRESH),
                                                            add(SyncMode.INCREMENTAL),
                                                        }};
                                                    }};
                                                }}),
                                                add(new AirbyteStreamAndConfiguration() {{
                                                    config = new AirbyteStreamConfiguration(DestinationSyncMode.APPEND, SyncMode.INCREMENTAL) {{
                                                        aliasName = "doloribus";
                                                        cursorField = new String[]{{
                                                            add("alias"),
                                                            add("deserunt"),
                                                            add("fugit"),
                                                        }};
                                                        destinationSyncMode = DestinationSyncMode.OVERWRITE;
                                                        fieldSelectionEnabled = false;
                                                        primaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("maxime"),
                                                                add("facere"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("cupiditate"),
                                                                add("deleniti"),
                                                                add("quasi"),
                                                                add("maiores"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("aliquid"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("unde"),
                                                                add("corrupti"),
                                                                add("quae"),
                                                            }}),
                                                        }};
                                                        selected = false;
                                                        selectedFields = new WayScript.airbyte_test.models.shared.SelectedFieldInfo[]{{
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("libero"),
                                                                    add("nam"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("adipisci"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("hic"),
                                                                    add("similique"),
                                                                    add("fuga"),
                                                                    add("consectetur"),
                                                                }};
                                                            }}),
                                                            add(new SelectedFieldInfo() {{
                                                                fieldPath = new String[]{{
                                                                    add("laudantium"),
                                                                    add("cumque"),
                                                                }};
                                                            }}),
                                                        }};
                                                        suggested = false;
                                                        syncMode = SyncMode.FULL_REFRESH;
                                                    }};
                                                    stream = new AirbyteStream("corrupti") {{
                                                        defaultCursorField = new String[]{{
                                                            add("magnam"),
                                                            add("aperiam"),
                                                            add("ducimus"),
                                                            add("itaque"),
                                                        }};
                                                        jsonSchema = new StreamJsonSchema() {{}};
                                                        name = "Francis Yundt";
                                                        namespace = "alias";
                                                        sourceDefinedCursor = false;
                                                        sourceDefinedPrimaryKey = new String[][]{{
                                                            add(new String[]{{
                                                                add("aspernatur"),
                                                                add("nobis"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("voluptatum"),
                                                                add("reiciendis"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("ullam"),
                                                            }}),
                                                            add(new String[]{{
                                                                add("consequuntur"),
                                                                add("voluptas"),
                                                            }}),
                                                        }};
                                                        supportedSyncModes = new WayScript.airbyte_test.models.shared.SyncMode[]{{
                                                            add(SyncMode.INCREMENTAL),
                                                        }};
                                                    }};
                                                }}),
                                            }});) {{
                configurationHash = "est";
                connectorVersion = "perferendis";
                sourceId = "dc766324-ccb0-46c8-8a12-d02529270b8d";
            }};            

            WriteDiscoverCatalogResultResponse res = sdk.source.writeDiscoverCatalogResult(req);

            if (res.discoverCatalogResult != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody](../../models/shared/SourceDiscoverSchemaWriteRequestBody.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse](../../models/operations/WriteDiscoverCatalogResultResponse.md)**

