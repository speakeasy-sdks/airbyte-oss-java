# notifications

### Available Operations

* [tryNotificationConfig](#trynotificationconfig) - Try sending a notifications

## tryNotificationConfig

Try sending a notifications

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.TryNotificationConfigResponse;
import WayScript.airbyte_test.models.shared.CustomerioNotificationConfiguration;
import WayScript.airbyte_test.models.shared.Notification;
import WayScript.airbyte_test.models.shared.NotificationType;
import WayScript.airbyte_test.models.shared.SlackNotificationConfiguration;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.Notification req = new Notification(NotificationType.SLACK, false, false) {{
                customerioConfiguration = new CustomerioNotificationConfiguration();;
                slackConfiguration = new SlackNotificationConfiguration("dolorum");;
            }};            

            TryNotificationConfigResponse res = sdk.notifications.tryNotificationConfig(req);

            if (res.notificationRead != null) {
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
| `request`                                                                                | [WayScript.airbyte_test.models.shared.Notification](../../models/shared/Notification.md) | :heavy_check_mark:                                                                       | The request object to use for the request.                                               |


### Response

**[WayScript.airbyte_test.models.operations.TryNotificationConfigResponse](../../models/operations/TryNotificationConfigResponse.md)**

