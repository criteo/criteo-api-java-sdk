

# FrequencyCapping

Caps how often the same user may be shown an impression while the forecast is computed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | Maximum impressions per user per window. Must be at least 1 - omit the whole frequency  capping object to forecast without a cap. |  |
|**durationType** | [**DurationTypeEnum**](#DurationTypeEnum) | The window the cap applies over. |  |



## Enum: DurationTypeEnum

| Name | Value |
|---- | -----|
| SESSION | &quot;session&quot; |
| DAY | &quot;day&quot; |



