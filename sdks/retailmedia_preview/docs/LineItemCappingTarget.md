

# LineItemCappingTarget

Represents the frequency capping target for a line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cappingCount** | **Integer** | The maximum number of times the line item can be shown within the specified duration. |  |
|**cappingDurationType** | [**CappingDurationTypeEnum**](#CappingDurationTypeEnum) | The duration type for the frequency capping (e.g., per session or per day). |  |



## Enum: CappingDurationTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| SESSION | &quot;session&quot; |
| DAY | &quot;day&quot; |



