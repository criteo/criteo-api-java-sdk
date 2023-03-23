

# CreateAdSet

ad set create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the ad set |  [optional] |
|**datasetId** | **String** | Dataset id of this ad set |  [optional] |
|**campaignId** | **String** | Campaign id this ad set belongs to |  [optional] |
|**schedule** | [**CreateAdSetSchedule**](CreateAdSetSchedule.md) |  |  [optional] |
|**bidding** | [**CreateAdSetBidding**](CreateAdSetBidding.md) |  |  [optional] |
|**targeting** | [**CreateAdSetTargeting**](CreateAdSetTargeting.md) |  |  [optional] |
|**budget** | [**CreateAdSetBudget**](CreateAdSetBudget.md) |  |  [optional] |
|**trackingCode** | **String** | The click tracking code associated to this Ad Set. |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | Media type for the ad set |  [optional] |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| DISPLAY | &quot;display&quot; |
| VIDEO | &quot;video&quot; |



