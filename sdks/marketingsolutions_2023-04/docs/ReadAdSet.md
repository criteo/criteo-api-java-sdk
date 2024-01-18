

# ReadAdSet

ad set read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**advertiserId** | **String** |  |  [optional] |
|**datasetId** | **String** |  |  [optional] |
|**campaignId** | **String** |  |  [optional] |
|**destinationEnvironment** | [**DestinationEnvironmentEnum**](#DestinationEnvironmentEnum) |  |  [optional] |
|**schedule** | [**ReadAdSetSchedule**](ReadAdSetSchedule.md) |  |  [optional] |
|**bidding** | [**ReadAdSetBidding**](ReadAdSetBidding.md) |  |  [optional] |
|**targeting** | [**AdSetTargeting**](AdSetTargeting.md) |  |  [optional] |
|**budget** | [**ReadAdSetBudget**](ReadAdSetBudget.md) |  |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional] |



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



