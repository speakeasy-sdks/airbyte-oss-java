# FieldTransform

Describes the difference between two Streams.


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `addField`                                                                        | [FieldAdd](../../models/shared/FieldAdd.md)                                       | :heavy_minus_sign:                                                                | N/A                                                                               |
| `breaking`                                                                        | *Boolean*                                                                         | :heavy_check_mark:                                                                | N/A                                                                               |
| `fieldName`                                                                       | List<*String*>                                                                    | :heavy_check_mark:                                                                | A field name is a list of strings that form the path to the field.                |
| `removeField`                                                                     | [FieldRemove](../../models/shared/FieldRemove.md)                                 | :heavy_minus_sign:                                                                | N/A                                                                               |
| `transformType`                                                                   | [FieldTransformTransformType](../../models/shared/FieldTransformTransformType.md) | :heavy_check_mark:                                                                | N/A                                                                               |
| `updateFieldSchema`                                                               | [FieldSchemaUpdate](../../models/shared/FieldSchemaUpdate.md)                     | :heavy_minus_sign:                                                                | N/A                                                                               |