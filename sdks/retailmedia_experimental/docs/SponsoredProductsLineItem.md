

# SponsoredProductsLineItem

Model of a retail media auction line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) | Bid strategy for the line item. |  [optional] |
|**budget** | **Double** | The total budget allocated for this line item. |  [optional] |
|**budgetRemaining** | **Double** | The amount of the budget that remains available. |  |
|**budgetSpent** | **Double** | The amount of the budget that has been spent so far. |  [optional] |
|**campaignId** | **String** | The ID of the campaign this line item belongs to. |  |
|**createdAt** | **OffsetDateTime** | The date and time when the line item was created. |  |
|**dailyPacing** | **Double** | The daily pacing limit for budget spending. |  [optional] |
|**endDate** | **OffsetDateTime** | The date and time when the line item stops running. |  [optional] |
|**flightSchedule** | [**FlightSchedule**](FlightSchedule.md) |  |  [optional] |
|**isAutoDailyPacing** | **Boolean** | Indicates whether automatic daily pacing is enabled. |  [optional] |
|**keywordStrategy** | [**KeywordStrategyEnum**](#KeywordStrategyEnum) | The keyword targeting strategy for this line item. |  [optional] |
|**maxBid** | **Double** | The maximum bid amount allowed for this line item. |  [optional] |
|**monthlyPacing** | **Double** | The monthly pacing limit for budget spending. |  [optional] |
|**name** | **String** | The name of the line item. |  |
|**optimizationStrategy** | [**OptimizationStrategyEnum**](#OptimizationStrategyEnum) | The optimization strategy for this line item. |  [optional] |
|**startDate** | **OffsetDateTime** | The date and time when the line item starts running. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the line item.                unknown: could not be determined (data issue, not a line item state).  draft: never fully configured, has never served.  scheduled: configured, start date is in the future.  active: in flight, funded, under no budget cap.  paused: previously active, manually deactivated.                ended: end date passed, within the last 90 days.  archived: end date passed more than 90 days ago - same as ended, just older, not reversible.                noFunds: no currently-active funding source (no Active mapped Insertion Order, no active  Make-Good credit IO) - a missing-funding problem, separate from any budget cap.  budgetHit: a budget cap (daily, hourly, monthly, or total) is capped with zero or below  remaining. Doesn&#39;t distinguish line item vs. campaign budget, or which cap type.                draft/scheduled/ended/archived short-circuit before the funding/budget check runs, so  those states never report noFunds or budgetHit regardless of underlying financial data.  Where both would apply, noFunds takes precedence over budgetHit. |  [optional] |
|**targetBid** | **Double** | The target bid amount for the line item. |  [optional] |
|**targetRetailerId** | **String** | The ID of the retailer targeted by this line item. |  |
|**updatedAt** | **OffsetDateTime** | The date and time when the line item was last updated. |  |



## Enum: BidStrategyEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| AUTOMATED | &quot;automated&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: KeywordStrategyEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| CONQUESTING | &quot;conquesting&quot; |
| GENERICANDBRANDED | &quot;genericAndBranded&quot; |
| GENERICBRANDEDANDCONQUESTING | &quot;genericBrandedAndConquesting&quot; |



## Enum: OptimizationStrategyEnum

| Name | Value |
|---- | -----|
| CONVERSION | &quot;conversion&quot; |
| CLICKS | &quot;clicks&quot; |
| REVENUE | &quot;revenue&quot; |
| UNKNOWN | &quot;unknown&quot; |



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



