# SynchronousJobRead


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `configId`                                            | *String*                                              | :heavy_minus_sign:                                    | only present if a config id was provided.             |
| `configType`                                          | [JobConfigType](../../models/shared/JobConfigType.md) | :heavy_check_mark:                                    | N/A                                                   |
| `connectorConfigurationUpdated`                       | *Boolean*                                             | :heavy_minus_sign:                                    | N/A                                                   |
| `createdAt`                                           | *Long*                                                | :heavy_check_mark:                                    | N/A                                                   |
| `endedAt`                                             | *Long*                                                | :heavy_check_mark:                                    | N/A                                                   |
| `id`                                                  | *String*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `logs`                                                | [LogRead](../../models/shared/LogRead.md)             | :heavy_minus_sign:                                    | N/A                                                   |
| `succeeded`                                           | *Boolean*                                             | :heavy_check_mark:                                    | N/A                                                   |