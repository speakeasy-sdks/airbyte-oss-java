# CatalogDiff

Describes the difference between two Airbyte catalogs.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `transforms`                                                    | List<[StreamTransform](../../models/shared/StreamTransform.md)> | :heavy_check_mark:                                              | list of stream transformations. order does not matter.          |