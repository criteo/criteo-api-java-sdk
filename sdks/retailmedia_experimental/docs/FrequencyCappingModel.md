

# FrequencyCappingModel

How often a single user may be shown the line item's ads.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cappingCount** | **Integer** | How many times the ads may be shown within the duration. |  [optional] |
|**cappingDurationType** | [**CappingDurationTypeEnum**](#CappingDurationTypeEnum) | The period the count applies to. |  [optional] |



## Enum: CappingDurationTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SESSION | &quot;Session&quot; |
| DAY | &quot;Day&quot; |



