# SaveStatsRequestBody


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `attemptNumber`                                                       | *Integer*                                                             | :heavy_check_mark:                                                    | N/A                                                                   |
| `jobId`                                                               | *Long*                                                                | :heavy_check_mark:                                                    | N/A                                                                   |
| `stats`                                                               | [AttemptStats](../../models/shared/AttemptStats.md)                   | :heavy_check_mark:                                                    | N/A                                                                   |
| `streamStats`                                                         | List<[AttemptStreamStats](../../models/shared/AttemptStreamStats.md)> | :heavy_minus_sign:                                                    | N/A                                                                   |