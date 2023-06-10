# workspace

## Overview

Workspace related resources.

### Available Operations

* [createWorkspace](#createworkspace) - Creates a workspace
* [deleteWorkspace](#deleteworkspace) - Deletes a workspace
* [getWorkspace](#getworkspace) - Find workspace by ID
* [getWorkspaceByConnectionId](#getworkspacebyconnectionid) - Find workspace by connection id
* [getWorkspaceBySlug](#getworkspacebyslug) - Find workspace by slug
* [listWorkspaces](#listworkspaces) - List all workspaces registered in the current Airbyte deployment
* [updateWorkspace](#updateworkspace) - Update workspace state
* [updateWorkspaceFeedback](#updateworkspacefeedback) - Update workspace feedback state
* [updateWorkspaceName](#updateworkspacename) - Update workspace name

## createWorkspace

Creates a workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateWorkspaceResponse;
import WayScript.airbyte_test.models.shared.CustomerioNotificationConfiguration;
import WayScript.airbyte_test.models.shared.Geography;
import WayScript.airbyte_test.models.shared.Notification;
import WayScript.airbyte_test.models.shared.NotificationType;
import WayScript.airbyte_test.models.shared.SlackNotificationConfiguration;
import WayScript.airbyte_test.models.shared.WebhookConfigWrite;
import WayScript.airbyte_test.models.shared.WorkspaceCreate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceCreate req = new WorkspaceCreate("rem") {{
                anonymousDataCollection = false;
                defaultGeography = Geography.US;
                displaySetupWizard = false;
                email = "Chester32@hotmail.com";
                news = false;
                notifications = new WayScript.airbyte_test.models.shared.Notification[]{{
                    add(new Notification(NotificationType.SLACK, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("reprehenderit") {{
                            webhook = "assumenda";
                        }};
                    }}),
                    add(new Notification(NotificationType.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("sequi") {{
                            webhook = "voluptates";
                        }};
                    }}),
                    add(new Notification(NotificationType.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("veniam") {{
                            webhook = "quae";
                        }};
                    }}),
                }};
                securityUpdates = false;
                webhookConfigs = new WayScript.airbyte_test.models.shared.WebhookConfigWrite[]{{
                    add(new WebhookConfigWrite() {{
                        authToken = "excepturi";
                        name = "Bryan Wolff";
                        validationUrl = "esse";
                    }}),
                    add(new WebhookConfigWrite() {{
                        authToken = "officiis";
                        name = "Kellie Cormier";
                        validationUrl = "odio";
                    }}),
                    add(new WebhookConfigWrite() {{
                        authToken = "suscipit";
                        name = "Shelia Breitenberg";
                        validationUrl = "consequuntur";
                    }}),
                    add(new WebhookConfigWrite() {{
                        authToken = "delectus";
                        name = "Woodrow Osinski";
                        validationUrl = "architecto";
                    }}),
                }};
            }};            

            CreateWorkspaceResponse res = sdk.workspace.createWorkspace(req);

            if (res.workspaceRead != null) {
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
| `request`                                                                                      | [WayScript.airbyte_test.models.shared.WorkspaceCreate](../../models/shared/WorkspaceCreate.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[WayScript.airbyte_test.models.operations.CreateWorkspaceResponse](../../models/operations/CreateWorkspaceResponse.md)**


## deleteWorkspace

Deletes a workspace

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("f01216ce-2239-4e8f-a5cd-0d19d959f439");            

            DeleteWorkspaceResponse res = sdk.workspace.deleteWorkspace(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody](../../models/shared/WorkspaceIdRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.DeleteWorkspaceResponse](../../models/operations/DeleteWorkspaceResponse.md)**


## getWorkspace

Find workspace by ID

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetWorkspaceResponse;
import WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("e39266cb-d95f-47aa-ab24-113695d1e669");            

            GetWorkspaceResponse res = sdk.workspace.getWorkspace(req);

            if (res.workspaceRead != null) {
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

**[WayScript.airbyte_test.models.operations.GetWorkspaceResponse](../../models/operations/GetWorkspaceResponse.md)**


## getWorkspaceByConnectionId

Find workspace by connection id

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetWorkspaceByConnectionIdResponse;
import WayScript.airbyte_test.models.shared.ConnectionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("8fcc4596-217c-4297-b676-334254038bfb");            

            GetWorkspaceByConnectionIdResponse res = sdk.workspace.getWorkspaceByConnectionId(req);

            if (res.workspaceRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [WayScript.airbyte_test.models.shared.ConnectionIdRequestBody](../../models/shared/ConnectionIdRequestBody.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.GetWorkspaceByConnectionIdResponse](../../models/operations/GetWorkspaceByConnectionIdResponse.md)**


## getWorkspaceBySlug

Find workspace by slug

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetWorkspaceBySlugResponse;
import WayScript.airbyte_test.models.shared.SlugRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SlugRequestBody req = new SlugRequestBody("minima");            

            GetWorkspaceBySlugResponse res = sdk.workspace.getWorkspaceBySlug(req);

            if (res.workspaceRead != null) {
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
| `request`                                                                                      | [WayScript.airbyte_test.models.shared.SlugRequestBody](../../models/shared/SlugRequestBody.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[WayScript.airbyte_test.models.operations.GetWorkspaceBySlugResponse](../../models/operations/GetWorkspaceBySlugResponse.md)**


## listWorkspaces

List all workspaces registered in the current Airbyte deployment

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListWorkspacesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            ListWorkspacesResponse res = sdk.workspace.listWorkspaces();

            if (res.workspaceReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[WayScript.airbyte_test.models.operations.ListWorkspacesResponse](../../models/operations/ListWorkspacesResponse.md)**


## updateWorkspace

Update workspace state

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateWorkspaceResponse;
import WayScript.airbyte_test.models.shared.CustomerioNotificationConfiguration;
import WayScript.airbyte_test.models.shared.Geography;
import WayScript.airbyte_test.models.shared.Notification;
import WayScript.airbyte_test.models.shared.NotificationType;
import WayScript.airbyte_test.models.shared.SlackNotificationConfiguration;
import WayScript.airbyte_test.models.shared.WebhookConfigWrite;
import WayScript.airbyte_test.models.shared.WorkspaceUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceUpdate req = new WorkspaceUpdate("971e9819-0557-4389-8edb-ac7fda39594d") {{
                anonymousDataCollection = false;
                defaultGeography = Geography.US;
                displaySetupWizard = false;
                email = "Nathan65@yahoo.com";
                initialSetupComplete = false;
                news = false;
                notifications = new WayScript.airbyte_test.models.shared.Notification[]{{
                    add(new Notification(NotificationType.SLACK, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("aut") {{
                            webhook = "quas";
                        }};
                    }}),
                    add(new Notification(NotificationType.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("rerum") {{
                            webhook = "explicabo";
                        }};
                    }}),
                    add(new Notification(NotificationType.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.CUSTOMERIO;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("tempora") {{
                            webhook = "enim";
                        }};
                    }}),
                    add(new Notification(NotificationType.SLACK, false, false) {{
                        customerioConfiguration = new CustomerioNotificationConfiguration() {{}};
                        notificationType = NotificationType.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("id") {{
                            webhook = "voluptatibus";
                        }};
                    }}),
                }};
                securityUpdates = false;
                webhookConfigs = new WayScript.airbyte_test.models.shared.WebhookConfigWrite[]{{
                    add(new WebhookConfigWrite() {{
                        authToken = "accusantium";
                        name = "Crystal Johnson";
                        validationUrl = "explicabo";
                    }}),
                }};
            }};            

            UpdateWorkspaceResponse res = sdk.workspace.updateWorkspace(req);

            if (res.workspaceRead != null) {
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
| `request`                                                                                      | [WayScript.airbyte_test.models.shared.WorkspaceUpdate](../../models/shared/WorkspaceUpdate.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[WayScript.airbyte_test.models.operations.UpdateWorkspaceResponse](../../models/operations/UpdateWorkspaceResponse.md)**


## updateWorkspaceFeedback

Update workspace feedback state

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateWorkspaceFeedbackResponse;
import WayScript.airbyte_test.models.shared.WorkspaceGiveFeedback;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceGiveFeedback req = new WorkspaceGiveFeedback("8553cb10-006b-4ef4-921e-c2053b749366");            

            UpdateWorkspaceFeedbackResponse res = sdk.workspace.updateWorkspaceFeedback(req);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [WayScript.airbyte_test.models.shared.WorkspaceGiveFeedback](../../models/shared/WorkspaceGiveFeedback.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[WayScript.airbyte_test.models.operations.UpdateWorkspaceFeedbackResponse](../../models/operations/UpdateWorkspaceFeedbackResponse.md)**


## updateWorkspaceName

Update workspace name

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateWorkspaceNameResponse;
import WayScript.airbyte_test.models.shared.WorkspaceUpdateName;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceUpdateName req = new WorkspaceUpdateName("officia", "c8ee0f2b-f195-488d-80d0-3f3deba297be");            

            UpdateWorkspaceNameResponse res = sdk.workspace.updateWorkspaceName(req);

            if (res.workspaceRead != null) {
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
| `request`                                                                                              | [WayScript.airbyte_test.models.shared.WorkspaceUpdateName](../../models/shared/WorkspaceUpdateName.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[WayScript.airbyte_test.models.operations.UpdateWorkspaceNameResponse](../../models/operations/UpdateWorkspaceNameResponse.md)**

