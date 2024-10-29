

# CreateAdSetV24Q1

ad set create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the ad set |  |
|**datasetId** | **String** | Dataset id of this ad set |  |
|**campaignId** | **String** | Campaign id this ad set belongs to |  |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Objective of the ad set |  |
|**schedule** | [**CreateAdSetScheduleV24Q1**](CreateAdSetScheduleV24Q1.md) |  |  |
|**bidding** | [**CreateAdSetBiddingV24Q1**](CreateAdSetBiddingV24Q1.md) |  |  |
|**targeting** | [**CreateAdSetTargetingV24Q1**](CreateAdSetTargetingV24Q1.md) |  |  |
|**budget** | [**CreateAdSetBudgetV24Q1**](CreateAdSetBudgetV24Q1.md) |  |  |
|**trackingCode** | **String** | The click tracking code associated to this Ad Set. |  |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | Media type for the ad set |  |



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



