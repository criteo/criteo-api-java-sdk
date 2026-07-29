

# AuctionLineItem

A Retail Media Auction Line Item used to hold bid settings for one or many promoted products on a single retailer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional] |
|**budget** | **Double** |  |  [optional] |
|**budgetRemaining** | **Double** |  |  [optional] |
|**budgetSpent** | **Double** |  |  [optional] |
|**campaignId** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**dailyPacing** | **Double** |  |  [optional] |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  [optional] |
|**id** | **String** |  |  [optional] |
|**isAutoDailyPacing** | **Boolean** |  |  [optional] |
|**maxBid** | **Double** |  |  [optional] |
|**monthlyPacing** | **Double** |  |  [optional] |
|**name** | **String** |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**targetBid** | **Double** |  |  [optional] |
|**targetRetailerId** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



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



