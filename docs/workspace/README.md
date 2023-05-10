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
import WayScript.airbyte_test.models.shared.GeographyEnum;
import WayScript.airbyte_test.models.shared.Notification;
import WayScript.airbyte_test.models.shared.NotificationTypeEnum;
import WayScript.airbyte_test.models.shared.SlackNotificationConfiguration;
import WayScript.airbyte_test.models.shared.WebhookConfigWrite;
import WayScript.airbyte_test.models.shared.WorkspaceCreate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceCreate req = new WorkspaceCreate("ut") {{
                anonymousDataCollection = false;
                defaultGeography = GeographyEnum.EU;
                displaySetupWizard = false;
                email = "Valentine.Turcotte34@hotmail.com";
                news = false;
                notifications = new WayScript.airbyte_test.models.shared.Notification[]{{
                    add(new Notification(NotificationTypeEnum.SLACK, false, false) {{
                        customerioConfiguration = new java.util.HashMap<String, Object>() {{
                            put("recusandae", "a");
                        }};
                        notificationType = NotificationTypeEnum.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("mollitia") {{
                            webhook = "neque";
                        }};
                    }}),
                    add(new Notification(NotificationTypeEnum.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new java.util.HashMap<String, Object>() {{
                            put("est", "quasi");
                            put("rerum", "blanditiis");
                        }};
                        notificationType = NotificationTypeEnum.CUSTOMERIO;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("perspiciatis") {{
                            webhook = "recusandae";
                        }};
                    }}),
                }};
                securityUpdates = false;
                webhookConfigs = new WayScript.airbyte_test.models.shared.WebhookConfigWrite[]{{
                    add(new WebhookConfigWrite() {{
                        authToken = "dolorem";
                        name = "Kristine Stiedemann II";
                        validationUrl = "fugiat";
                    }}),
                    add(new WebhookConfigWrite() {{
                        authToken = "quas";
                        name = "Lee Upton";
                        validationUrl = "delectus";
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

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("b70fb387-4290-4d33-a561-eca16ef89451");            

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

            WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody req = new WorkspaceIdRequestBody("bd76eeeb-518c-44da-9fad-35512f06d4e5");            

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

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("b72f0f54-8568-4a04-a4e0-0a1d6eb94346");            

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

            WayScript.airbyte_test.models.shared.SlugRequestBody req = new SlugRequestBody("aliquam");            

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

## updateWorkspace

Update workspace state

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateWorkspaceResponse;
import WayScript.airbyte_test.models.shared.GeographyEnum;
import WayScript.airbyte_test.models.shared.Notification;
import WayScript.airbyte_test.models.shared.NotificationTypeEnum;
import WayScript.airbyte_test.models.shared.SlackNotificationConfiguration;
import WayScript.airbyte_test.models.shared.WebhookConfigWrite;
import WayScript.airbyte_test.models.shared.WorkspaceUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.WorkspaceUpdate req = new WorkspaceUpdate("5d03084f-bba5-4cce-bf5c-b01fe51e528a") {{
                anonymousDataCollection = false;
                defaultGeography = GeographyEnum.AUTO;
                displaySetupWizard = false;
                email = "Lysanne.Schimmel@gmail.com";
                initialSetupComplete = false;
                news = false;
                notifications = new WayScript.airbyte_test.models.shared.Notification[]{{
                    add(new Notification(NotificationTypeEnum.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new java.util.HashMap<String, Object>() {{
                            put("ullam", "maiores");
                            put("corrupti", "libero");
                            put("placeat", "explicabo");
                        }};
                        notificationType = NotificationTypeEnum.CUSTOMERIO;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("expedita") {{
                            webhook = "animi";
                        }};
                    }}),
                    add(new Notification(NotificationTypeEnum.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new java.util.HashMap<String, Object>() {{
                            put("assumenda", "laborum");
                            put("magnam", "veritatis");
                            put("fugit", "nihil");
                        }};
                        notificationType = NotificationTypeEnum.CUSTOMERIO;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("nemo") {{
                            webhook = "nulla";
                        }};
                    }}),
                    add(new Notification(NotificationTypeEnum.CUSTOMERIO, false, false) {{
                        customerioConfiguration = new java.util.HashMap<String, Object>() {{
                            put("hic", "sapiente");
                            put("eius", "esse");
                        }};
                        notificationType = NotificationTypeEnum.SLACK;
                        sendOnFailure = false;
                        sendOnSuccess = false;
                        slackConfiguration = new SlackNotificationConfiguration("similique") {{
                            webhook = "inventore";
                        }};
                    }}),
                }};
                securityUpdates = false;
                webhookConfigs = new WayScript.airbyte_test.models.shared.WebhookConfigWrite[]{{
                    add(new WebhookConfigWrite() {{
                        authToken = "distinctio";
                        name = "Neil Gerhold";
                        validationUrl = "aliquid";
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

            WayScript.airbyte_test.models.shared.WorkspaceGiveFeedback req = new WorkspaceGiveFeedback("cecc74f7-7b48-448b-96a6-f0441d2c3b80");            

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

            WayScript.airbyte_test.models.shared.WorkspaceUpdateName req = new WorkspaceUpdateName("laudantium", "094373e0-6045-49be-bbad-02f2586bcf15");            

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
