

# ExternalLineItem

A Retail Media Line Item used to hold bid settings for one or many promoted products on a single retailer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **String** |  | 
**budgetSpent** | **Double** |  |  [optional]
**budgetRemaining** | **BigDecimal** |  | 
**createdAt** | **OffsetDateTime** |  | 
**updatedAt** | **OffsetDateTime** |  | 
**targetRetailerId** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**targetBid** | **BigDecimal** |  |  [optional]
**isAutoDailyPacing** | **Boolean** |  |  [optional]
**name** | **String** |  | 
**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD | 
**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  [optional]
**maxBid** | **BigDecimal** |  |  [optional]
**budget** | **BigDecimal** |  |  [optional]
**monthlyPacing** | **BigDecimal** |  |  [optional]
**dailyPacing** | **BigDecimal** |  |  [optional]
**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ACTIVE | &quot;active&quot;
SCHEDULED | &quot;scheduled&quot;
DRAFT | &quot;draft&quot;
PAUSED | &quot;paused&quot;
BUDGETHIT | &quot;budgetHit&quot;
ENDED | &quot;ended&quot;
ARCHIVED | &quot;archived&quot;
NOFUNDS | &quot;noFunds&quot;



## Enum: BidStrategyEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
CONVERSION | &quot;conversion&quot;
CLICKS | &quot;clicks&quot;
REVENUE | &quot;revenue&quot;



