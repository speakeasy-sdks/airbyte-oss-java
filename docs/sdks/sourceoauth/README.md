# sourceOauth

## Overview

Source OAuth related resources to delegate access from user.

### Available Operations

* [completeSourceOAuth](#completesourceoauth) - Given a source def ID generate an access/refresh token etc.
* [getSourceOAuthConsent](#getsourceoauthconsent) - Given a source connector definition ID, return the URL to the consent screen where to redirect the user to.
* [setInstancewideSourceOauthParams](#setinstancewidesourceoauthparams) - Sets instancewide variables to be used for the oauth flow when creating this source. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables.


## completeSourceOAuth

Given a source def ID generate an access/refresh token etc.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CompleteSourceOAuthResponse;
import WayScript.airbyte_test.models.shared.CompleteSourceOauthRequest;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.CompleteSourceOauthRequest req = new CompleteSourceOauthRequest("bf125ce4-152e-4ab9-8d7e-5224a6a0e123", "b7847ec5-9e1f-467f-bc4c-ce4b6d7696ff") {{
                oAuthInputConfiguration = "consectetur";
                queryParams = new java.util.HashMap<String, Object>() {{
                    put("ullam", "nihil");
                    put("eius", "dignissimos");
                    put("corporis", "perferendis");
                    put("architecto", "amet");
                }};
                redirectUrl = "corporis";
                sourceId = "7e44f51f-8b08-44c3-997e-193a245467f9";
            }};            

            CompleteSourceOAuthResponse res = sdk.sourceOauth.completeSourceOAuth(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [WayScript.airbyte_test.models.shared.CompleteSourceOauthRequest](../../models/shared/CompleteSourceOauthRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[WayScript.airbyte_test.models.operations.CompleteSourceOAuthResponse](../../models/operations/CompleteSourceOAuthResponse.md)**


## getSourceOAuthConsent

Given a source connector definition ID, return the URL to the consent screen where to redirect the user to.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetSourceOAuthConsentResponse;
import WayScript.airbyte_test.models.shared.SourceOauthConsentRequest;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SourceOauthConsentRequest req = new SourceOauthConsentRequest("modi", "874c2d5c-c497-4223-be66-bd8fe5d00b97", "9ef20387-3205-490c-8c10-96400313b3e5") {{
                oAuthInputConfiguration = "eaque";
                sourceId = "44f65fe7-2dc4-4077-90cc-3f408efc15ce";
            }};            

            GetSourceOAuthConsentResponse res = sdk.sourceOauth.getSourceOAuthConsent(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [WayScript.airbyte_test.models.shared.SourceOauthConsentRequest](../../models/shared/SourceOauthConsentRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[WayScript.airbyte_test.models.operations.GetSourceOAuthConsentResponse](../../models/operations/GetSourceOAuthConsentResponse.md)**


## setInstancewideSourceOauthParams

Sets instancewide variables to be used for the oauth flow when creating this source. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables.


### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.SetInstancewideSourceOauthParamsResponse;
import WayScript.airbyte_test.models.shared.SetInstancewideSourceOauthParamsRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.SetInstancewideSourceOauthParamsRequestBody req = new SetInstancewideSourceOauthParamsRequestBody(                new java.util.HashMap<String, Object>() {{
                                put("dolore", "illum");
                                put("ea", "officiis");
                                put("quasi", "accusamus");
                            }}, "ae0f75ae-df2a-4cab-98b9-91c926ddb589");            

            SetInstancewideSourceOauthParamsResponse res = sdk.sourceOauth.setInstancewideSourceOauthParams(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [WayScript.airbyte_test.models.shared.SetInstancewideSourceOauthParamsRequestBody](../../models/shared/SetInstancewideSourceOauthParamsRequestBody.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[WayScript.airbyte_test.models.operations.SetInstancewideSourceOauthParamsResponse](../../models/operations/SetInstancewideSourceOauthParamsResponse.md)**

