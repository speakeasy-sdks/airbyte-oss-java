# operation

### Available Operations

* [checkOperation](#checkoperation) - Check if an operation to be created is valid
* [createOperation](#createoperation) - Create an operation to be applied as part of a connection pipeline
* [deleteOperation](#deleteoperation) - Delete an operation
* [getOperation](#getoperation) - Returns an operation
* [listOperationsForConnection](#listoperationsforconnection) - Returns all operations for a connection.
* [updateOperation](#updateoperation) - Update an operation

## checkOperation

Check if an operation to be created is valid

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CheckOperationResponse;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOption;
import WayScript.airbyte_test.models.shared.OperatorType;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookType;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperatorConfiguration req = new OperatorConfiguration(OperatorType.DBT) {{
                dbt = new OperatorDbt("ad") {{
                    dbtArguments = "reiciendis";
                    dockerImage = "sequi";
                    gitRepoBranch = "porro";
                }};;
                normalization = new OperatorNormalization() {{
                    option = OperatorNormalizationOption.BASIC;
                }};;
                webhook = new OperatorWebhook() {{
                    dbtCloud = new OperatorWebhookDbtCloud(671528L, 748973L);;
                    executionBody = "quibusdam";
                    executionUrl = "omnis";
                    webhookConfigId = "05a972e0-5672-4822-bb2d-309470bf7a4f";
                    webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                }};;
            }};            

            CheckOperationResponse res = sdk.operation.checkOperation(req);

            if (res.checkOperationRead != null) {
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
| `request`                                                                                                  | [WayScript.airbyte_test.models.shared.OperatorConfiguration](../../models/shared/OperatorConfiguration.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[WayScript.airbyte_test.models.operations.CheckOperationResponse](../../models/operations/CheckOperationResponse.md)**


## createOperation

Create an operation to be applied as part of a connection pipeline

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateOperationResponse;
import WayScript.airbyte_test.models.shared.OperationCreate;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOption;
import WayScript.airbyte_test.models.shared.OperatorType;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookType;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationCreate req = new OperationCreate("culpa",                 new OperatorConfiguration(OperatorType.DBT) {{
                                dbt = new OperatorDbt("iusto") {{
                                    dbtArguments = "quod";
                                    dockerImage = "voluptatibus";
                                    gitRepoBranch = "voluptas";
                                }};;
                                normalization = new OperatorNormalization() {{
                                    option = OperatorNormalizationOption.BASIC;
                                }};;
                                webhook = new OperatorWebhook() {{
                                    dbtCloud = new OperatorWebhookDbtCloud(247767L, 353819L);;
                                    executionBody = "laborum";
                                    executionUrl = "voluptas";
                                    webhookConfigId = "fae54ebf-60c3-421f-823b-75d2367fe1a0";
                                    webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                                }};;
                            }};, "cc8df79f-0a39-46d9-8c36-4b7c15dfbace");            

            CreateOperationResponse res = sdk.operation.createOperation(req);

            if (res.operationRead != null) {
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
| `request`                                                                                      | [WayScript.airbyte_test.models.shared.OperationCreate](../../models/shared/OperationCreate.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[WayScript.airbyte_test.models.operations.CreateOperationResponse](../../models/operations/CreateOperationResponse.md)**


## deleteOperation

Delete an operation

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteOperationResponse;
import WayScript.airbyte_test.models.shared.OperationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationIdRequestBody req = new OperationIdRequestBody("188b1c4e-e2c8-4c6c-a611-feeb1c7cbdb6");            

            DeleteOperationResponse res = sdk.operation.deleteOperation(req);

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
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.OperationIdRequestBody](../../models/shared/OperationIdRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.DeleteOperationResponse](../../models/operations/DeleteOperationResponse.md)**


## getOperation

Returns an operation

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetOperationResponse;
import WayScript.airbyte_test.models.shared.OperationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationIdRequestBody req = new OperationIdRequestBody("eec74378-ba25-4317-b47d-c915ad2caf5d");            

            GetOperationResponse res = sdk.operation.getOperation(req);

            if (res.operationRead != null) {
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
| `request`                                                                                                    | [WayScript.airbyte_test.models.shared.OperationIdRequestBody](../../models/shared/OperationIdRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[WayScript.airbyte_test.models.operations.GetOperationResponse](../../models/operations/GetOperationResponse.md)**


## listOperationsForConnection

List operations for connection.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListOperationsForConnectionResponse;
import WayScript.airbyte_test.models.shared.ConnectionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("d6723dc0-f5ae-42f3-a6b7-00878756143f");            

            ListOperationsForConnectionResponse res = sdk.operation.listOperationsForConnection(req);

            if (res.operationReadList != null) {
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

**[WayScript.airbyte_test.models.operations.ListOperationsForConnectionResponse](../../models/operations/ListOperationsForConnectionResponse.md)**


## updateOperation

Update an operation

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateOperationResponse;
import WayScript.airbyte_test.models.shared.OperationUpdate;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOption;
import WayScript.airbyte_test.models.shared.OperatorType;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookType;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationUpdate req = new OperationUpdate("corporis", "a6c98b55-5540-480d-80bc-acc6cbd6b5f3",                 new OperatorConfiguration(OperatorType.WEBHOOK) {{
                                dbt = new OperatorDbt("maxime") {{
                                    dbtArguments = "cupiditate";
                                    dockerImage = "voluptatem";
                                    gitRepoBranch = "provident";
                                }};;
                                normalization = new OperatorNormalization() {{
                                    option = OperatorNormalizationOption.BASIC;
                                }};;
                                webhook = new OperatorWebhook() {{
                                    dbtCloud = new OperatorWebhookDbtCloud(239097L, 34267L);;
                                    executionBody = "magnam";
                                    executionUrl = "repellat";
                                    webhookConfigId = "926bad25-5381-49b4-b4b0-ed20e56248ff";
                                    webhookType = OperatorWebhookWebhookType.DBT_CLOUD;
                                }};;
                            }};);            

            UpdateOperationResponse res = sdk.operation.updateOperation(req);

            if (res.operationRead != null) {
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
| `request`                                                                                      | [WayScript.airbyte_test.models.shared.OperationUpdate](../../models/shared/OperationUpdate.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[WayScript.airbyte_test.models.operations.UpdateOperationResponse](../../models/operations/UpdateOperationResponse.md)**

