

# ExternalEditableLineItemAttributes

The mutable attributes of a Retail Media Line Item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  [optional] |
|**targetBid** | **BigDecimal** | The greater value between RMP default of $0.3 or a retailer-specific value - varies by retailer |  |
|**maxBid** | **BigDecimal** |  |  [optional] |
|**budget** | **BigDecimal** |  |  [optional] |
|**monthlyPacing** | **BigDecimal** |  |  [optional] |
|**dailyPacing** | **BigDecimal** |  |  [optional] |
|**isAutoDailyPacing** | **Boolean** |  |  |
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



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



