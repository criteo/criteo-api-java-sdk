

# SponsoredProductsLineItem

A model representing a Sponsored Products Line Item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional] |
|**budget** | **Double** |  |  [optional] |
|**budgetRemaining** | **Double** |  |  |
|**budgetSpent** | **Double** |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) |  |  [optional] |
|**campaignId** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**dailyPacing** | **Double** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**externalLineItemId** | **Long** |  |  |
|**flightSchedule** | [**FlightSchedule**](FlightSchedule.md) |  |  [optional] |
|**isAutoDailyPacing** | **Boolean** |  |  [optional] |
|**maxBid** | **Double** |  |  [optional] |
|**monthlyPacing** | **Double** |  |  [optional] |
|**name** | **String** |  |  |
|**startDate** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of a line item. |  [optional] |
|**targetBid** | **Double** |  |  [optional] |
|**targetRetailerId** | **Long** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: BidStrategyEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| CONVERSION | &quot;Conversion&quot; |
| CLICKS | &quot;Clicks&quot; |
| REVENUE | &quot;Revenue&quot; |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| AUCTION | &quot;Auction&quot; |
| PREFERRED | &quot;Preferred&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| ACTIVE | &quot;Active&quot; |
| SCHEDULED | &quot;Scheduled&quot; |
| DRAFT | &quot;Draft&quot; |
| PAUSED | &quot;Paused&quot; |
| BUDGETHIT | &quot;BudgetHit&quot; |
| ENDED | &quot;Ended&quot; |
| ARCHIVED | &quot;Archived&quot; |
| NOFUNDS | &quot;NoFunds&quot; |



