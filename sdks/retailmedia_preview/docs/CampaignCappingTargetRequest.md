

# CampaignCappingTargetRequest

Represents the frequency capping settings for a campaign, defining limits on how often ads are shown to users.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cappingCount** | **Integer** | Specifies the maximum number of times an ad from this campaign can be shown within the specified duration. |  [optional] |
|**cappingDurationType** | [**CappingDurationTypeEnum**](#CappingDurationTypeEnum) | Specifies the time period type over which the capping count is applied. |  [optional] |



## Enum: CappingDurationTypeEnum

| Name | Value |
|---- | -----|
| SESSION | &quot;session&quot; |
| DAY | &quot;day&quot; |



