# destinationOauth

## Overview

Source OAuth related resources to delegate access from user.

### Available Operations

* [completeDestinationOAuth](#completedestinationoauth) - Given a destination def ID generate an access/refresh token etc.
* [getDestinationOAuthConsent](#getdestinationoauthconsent) - Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.
* [setInstancewideDestinationOauthParams](#setinstancewidedestinationoauthparams) - Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables.


## completeDestinationOAuth

Given a destination def ID generate an access/refresh token etc.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CompleteDestinationOAuthResponse;
import WayScript.airbyte_test.models.shared.CompleteDestinationOAuthRequest;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.CompleteDestinationOAuthRequest req = new CompleteDestinationOAuthRequest("a5126243-835b-4bc0-9a23-a45cefc5fde1", "0a0ce216-9e51-4001-9c6d-c5e34762799b") {{
                destinationId = "fbbe6949-fb2b-4b4e-8ae6-c3d5db3adebd";
                oAuthInputConfiguration = "ad";
                queryParams = new java.util.HashMap<String, Object>() {{
                    put("laborum", "eveniet");
                    put("laborum", "incidunt");
                    put("maxime", "ipsam");
                    put("alias", "suscipit");
                }};
                redirectUrl = "deserunt";
            }};            

            CompleteDestinationOAuthResponse res = sdk.destinationOauth.completeDestinationOAuth(req);

            if (res.completeOAuthResponse != null) {
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
| `request`                                                                                                                      | [WayScript.airbyte_test.models.shared.CompleteDestinationOAuthRequest](../../models/shared/CompleteDestinationOAuthRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[WayScript.airbyte_test.models.operations.CompleteDestinationOAuthResponse](../../models/operations/CompleteDestinationOAuthResponse.md)**


## getDestinationOAuthConsent

Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetDestinationOAuthConsentResponse;
import WayScript.airbyte_test.models.shared.DestinationOauthConsentRequest;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.DestinationOauthConsentRequest req = new DestinationOauthConsentRequest("8aa94c02-644c-4f5e-9d9a-4578adc1ac60", "voluptatem", "dec001ac-802e-42ec-89ff-8f0f816ff347") {{
                destinationId = "7c13e902-c141-425b-8960-a668151a472a";
                oAuthInputConfiguration = "delectus";
            }};            

            GetDestinationOAuthConsentResponse res = sdk.destinationOauth.getDestinationOAuthConsent(req);

            if (res.oAuthConsentRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [WayScript.airbyte_test.models.shared.DestinationOauthConsentRequest](../../models/shared/DestinationOauthConsentRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.GetDestinationOAuthConsentResponse](../../models/operations/GetDestinationOAuthConsentResponse.md)**


## setInstancewideDestinationOauthParams

Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables.


### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SetInstancewideDestinationOauthParamsResponse;
import WayScript.airbyte_test.models.shared.SetInstancewideDestinationOauthParamsRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SetInstancewideDestinationOauthParamsRequestBody req = new SetInstancewideDestinationOauthParamsRequestBody("923c5949-f83f-4350-8f87-6ffb901c6ecb",                 new java.util.HashMap<String, Object>() {{
                                put("modi", "voluptates");
                                put("fugit", "eius");
                                put("sequi", "eligendi");
                            }});            

            SetInstancewideDestinationOauthParamsResponse res = sdk.destinationOauth.setInstancewideDestinationOauthParams(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [WayScript.airbyte_test.models.shared.SetInstancewideDestinationOauthParamsRequestBody](../../models/shared/SetInstancewideDestinationOauthParamsRequestBody.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[WayScript.airbyte_test.models.operations.SetInstancewideDestinationOauthParamsResponse](../../models/operations/SetInstancewideDestinationOauthParamsResponse.md)**

