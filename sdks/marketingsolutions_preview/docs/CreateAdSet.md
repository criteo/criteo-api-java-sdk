

# CreateAdSet

ad set create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the ad set |  [optional] |
|**datasetId** | **String** | Dataset id of this ad set |  [optional] |
|**campaignId** | **String** | Campaign id this ad set belongs to |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Objective of the ad set |  [optional] |
|**schedule** | [**CreateAdSetSchedule**](CreateAdSetSchedule.md) |  |  [optional] |
|**bidding** | [**CreateAdSetBidding**](CreateAdSetBidding.md) |  |  [optional] |
|**targeting** | [**CreateAdSetTargeting**](CreateAdSetTargeting.md) |  |  [optional] |
|**budget** | [**CreateAdSetBudget**](CreateAdSetBudget.md) |  |  [optional] |
|**trackingCode** | **String** | The click tracking code associated to this Ad Set. |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | Media type for the ad set |  [optional] |



## Enum: ObjectiveEnum

| Name | Value |
|---- | -----|
| CUSTOMACTION | &quot;customAction&quot; |
| CLICKS | &quot;clicks&quot; |
| CONVERSIONS | &quot;conversions&quot; |
| DISPLAYS | &quot;displays&quot; |
| APPPROMOTION | &quot;appPromotion&quot; |
| REVENUE | &quot;revenue&quot; |
| STORECONVERSIONS | &quot;storeConversions&quot; |
| VALUE | &quot;value&quot; |
| REACH | &quot;reach&quot; |
| VISITS | &quot;visits&quot; |
| VIDEOVIEWS | &quot;videoViews&quot; |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| DISPLAY | &quot;display&quot; |
| VIDEO | &quot;video&quot; |



