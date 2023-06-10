# AirbyteStreamAndConfiguration

each stream is split in two parts; the immutable schema from source and mutable configuration for destination


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `config`                                                                        | [AirbyteStreamConfiguration](../../models/shared/AirbyteStreamConfiguration.md) | :heavy_minus_sign:                                                              | the mutable part of the stream to configure the destination                     |
| `stream`                                                                        | [AirbyteStream](../../models/shared/AirbyteStream.md)                           | :heavy_minus_sign:                                                              | the immutable schema defined by the source                                      |