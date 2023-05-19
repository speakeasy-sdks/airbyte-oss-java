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
import WayScript.airbyte_test.models.shared.Notification;
import WayScript.airbyte_test.models.shared.NotificationType;
import WayScript.airbyte_test.models.shared.SlackNotificationConfiguration;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.Notification req = new Notification(NotificationType.SLACK, false, false) {{
                customerioConfiguration = new java.util.HashMap<String, Object>() {{
                    put("dignissimos", "minus");
                    put("distinctio", "possimus");
                    put("cum", "suscipit");
                    put("saepe", "earum");
                }};
                slackConfiguration = new SlackNotificationConfiguration("quod");;
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
