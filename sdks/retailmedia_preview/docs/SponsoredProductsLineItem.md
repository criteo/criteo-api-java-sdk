

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
|**campaignId** | **String** |  |  |
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
|**targetRetailerId** | **String** |  |  |
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
| UNKNOWN | &quot;unknown&quot; |
| ACTIVE | &quot;active&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| DRAFT | &quot;draft&quot; |
| PAUSED | &quot;paused&quot; |
| BUDGETHIT | &quot;budgetHit&quot; |
| ENDED | &quot;ended&quot; |
| ARCHIVED | &quot;archived&quot; |
| NOFUNDS | &quot;noFunds&quot; |



