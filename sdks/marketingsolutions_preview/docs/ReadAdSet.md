

# ReadAdSet

ad set read model

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the ad set |  [optional]
**advertiserId** | **String** | Advertiser id of the campaign this ad set belongs to |  [optional]
**datasetId** | **String** | Dataset id of this ad set |  [optional]
**campaignId** | **String** | Campaign id this ad set belongs to |  [optional]
**destinationEnvironment** | [**DestinationEnvironmentEnum**](#DestinationEnvironmentEnum) | The environment that an ad click will lead a user to |  [optional]
**schedule** | [**ReadAdSetSchedule**](ReadAdSetSchedule.md) |  |  [optional]
**bidding** | [**ReadAdSetBidding**](ReadAdSetBidding.md) |  |  [optional]
**targeting** | [**AdSetTargeting**](AdSetTargeting.md) |  |  [optional]
**budget** | [**ReadAdSetBudget**](ReadAdSetBudget.md) |  |  [optional]



## Enum: DestinationEnvironmentEnum

Name | Value
---- | -----
UNDEFINED | &quot;undefined&quot;
WEB | &quot;web&quot;
APP | &quot;app&quot;



