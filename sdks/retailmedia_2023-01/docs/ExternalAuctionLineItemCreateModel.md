

# ExternalAuctionLineItemCreateModel

Model to create a retail media auction line item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD | 
**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**targetRetailerId** | **String** |  | 
**budget** | **BigDecimal** |  |  [optional]
**targetBid** | **BigDecimal** |  |  [optional]
**maxBid** | **BigDecimal** |  |  [optional]
**monthlyPacing** | **BigDecimal** |  |  [optional]
**dailyPacing** | **BigDecimal** |  |  [optional]
**isAutoDailyPacing** | **Boolean** |  |  [optional]
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



