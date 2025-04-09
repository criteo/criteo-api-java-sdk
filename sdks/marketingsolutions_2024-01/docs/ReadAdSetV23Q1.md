

# ReadAdSetV23Q1

ad set read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** |  |  [optional] |
|**bidding** | [**ReadAdSetBiddingV23Q1**](ReadAdSetBiddingV23Q1.md) |  |  [optional] |
|**budget** | [**ReadAdSetBudgetV23Q1**](ReadAdSetBudgetV23Q1.md) |  |  [optional] |
|**campaignId** | **String** |  |  [optional] |
|**datasetId** | **String** |  |  [optional] |
|**destinationEnvironment** | [**DestinationEnvironmentEnum**](#DestinationEnvironmentEnum) |  |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) |  |  [optional] |
|**schedule** | [**ReadAdSetScheduleV23Q1**](ReadAdSetScheduleV23Q1.md) |  |  [optional] |
|**targeting** | [**AdSetTargetingV23Q1**](AdSetTargetingV23Q1.md) |  |  [optional] |
|**videoChannel** | [**VideoChannelEnum**](#VideoChannelEnum) |  |  [optional] |



## Enum: DestinationEnvironmentEnum

| Name | Value |
|---- | -----|
| UNDEFINED | &quot;undefined&quot; |
| WEB | &quot;web&quot; |
| APP | &quot;app&quot; |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| DISPLAY | &quot;display&quot; |
| VIDEO | &quot;video&quot; |



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



## Enum: VideoChannelEnum

| Name | Value |
|---- | -----|
| OLV | &quot;olv&quot; |
| CTV | &quot;ctv&quot; |



