

# SponsoredProductsLineItem

Model of a retail media auction line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional] |
|**budget** | **Double** |  |  [optional] |
|**budgetRemaining** | **Double** |  |  |
|**budgetSpent** | **Double** |  |  [optional] |
|**campaignId** | **String** |  |  |
|**conquestingAdstrategyEnabled** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
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
|**status** | [**StatusEnum**](#StatusEnum) | Status of a line item. |  [optional] |
|**targetBid** | **Double** |  |  [optional] |
|**targetRetailerId** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: BidStrategyEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| CONVERSION | &quot;conversion&quot; |
| CLICKS | &quot;clicks&quot; |
| REVENUE | &quot;revenue&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ACTIVE | &quot;active&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| DRAFT | &quot;draft&quot; |
| PAUSED | &quot;paused&quot; |
| BUDGETHIT | &quot;budgetHit&quot; |
| ENDED | &quot;ended&quot; |
| ARCHIVED | &quot;archived&quot; |
| NOFUNDS | &quot;noFunds&quot; |



