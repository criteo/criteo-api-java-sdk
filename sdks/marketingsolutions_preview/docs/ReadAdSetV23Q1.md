

# ReadAdSetV23Q1

ad set read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the ad set |  [optional] |
|**advertiserId** | **String** | Advertiser id of the campaign this ad set belongs to |  [optional] |
|**datasetId** | **String** | Dataset id of this ad set |  [optional] |
|**campaignId** | **String** | Campaign id this ad set belongs to |  [optional] |
|**destinationEnvironment** | [**DestinationEnvironmentEnum**](#DestinationEnvironmentEnum) | The environment that an ad click will lead a user to |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Objective of the ad set |  [optional] |
|**schedule** | [**ReadAdSetScheduleV23Q1**](ReadAdSetScheduleV23Q1.md) |  |  [optional] |
|**bidding** | [**ReadAdSetBiddingV23Q1**](ReadAdSetBiddingV23Q1.md) |  |  [optional] |
|**targeting** | [**AdSetTargetingV23Q1**](AdSetTargetingV23Q1.md) |  |  [optional] |
|**budget** | [**ReadAdSetBudgetV23Q1**](ReadAdSetBudgetV23Q1.md) |  |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | Media type of the ad set |  [optional] |



## Enum: DestinationEnvironmentEnum

| Name | Value |
|---- | -----|
| UNDEFINED | &quot;undefined&quot; |
| WEB | &quot;web&quot; |
| APP | &quot;app&quot; |



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



