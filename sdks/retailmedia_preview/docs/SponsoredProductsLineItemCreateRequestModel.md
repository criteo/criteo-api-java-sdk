

# SponsoredProductsLineItemCreateRequestModel

Model to create a retail media auction line item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional] |
|**budget** | **Double** |  |  [optional] |
|**conquestingAdstrategyEnabled** | **Boolean** |  |  [optional] |
|**dailyPacing** | **Double** |  |  [optional] |
|**defensiveAdstrategyEnabled** | **Boolean** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**flightSchedule** | [**FlightSchedule**](FlightSchedule.md) |  |  [optional] |
|**isAutoDailyPacing** | **Boolean** |  |  [optional] |
|**maxBid** | **Double** |  |  [optional] |
|**monthlyPacing** | **Double** |  |  [optional] |
|**name** | **String** |  |  |
|**neutralAdstrategyEnabled** | **Boolean** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  |
|**targetBid** | **Double** |  |  [optional] |
|**targetRetailerId** | **String** |  |  |



## Enum: BidStrategyEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| CONVERSION | &quot;conversion&quot; |
| CLICKS | &quot;clicks&quot; |
| REVENUE | &quot;revenue&quot; |



