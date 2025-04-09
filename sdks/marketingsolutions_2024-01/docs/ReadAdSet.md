

# ReadAdSet

ad set read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** |  |  [optional] |
|**bidding** | [**ReadAdSetBidding**](ReadAdSetBidding.md) |  |  [optional] |
|**budget** | [**ReadAdSetBudget**](ReadAdSetBudget.md) |  |  [optional] |
|**campaignId** | **String** |  |  [optional] |
|**datasetId** | **String** |  |  [optional] |
|**destinationEnvironment** | [**DestinationEnvironmentEnum**](#DestinationEnvironmentEnum) |  |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**schedule** | [**ReadAdSetSchedule**](ReadAdSetSchedule.md) |  |  [optional] |
|**targeting** | [**AdSetTargeting**](AdSetTargeting.md) |  |  [optional] |



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



