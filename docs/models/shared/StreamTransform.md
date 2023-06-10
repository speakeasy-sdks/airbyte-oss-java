# StreamTransform


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `streamDescriptor`                                                                  | [StreamDescriptor](../../models/shared/StreamDescriptor.md)                         | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `transformType`                                                                     | [StreamTransformTransformType](../../models/shared/StreamTransformTransformType.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `updateStream`                                                                      | List<[FieldTransform](../../models/shared/FieldTransform.md)>                       | :heavy_minus_sign:                                                                  | list of field transformations. order does not matter.                               |