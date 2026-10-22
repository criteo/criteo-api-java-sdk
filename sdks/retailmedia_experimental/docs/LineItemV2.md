

# LineItemV2

A unit of ad delivery configuration within a campaign. It defines how a specific subset of ads  is targeted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**budgetStatus** | [**BudgetStatusEnum**](#BudgetStatusEnum) | Indicates whether the line item has budget headroom to serve ads. |  |
|**campaignId** | **String** | The campaign id of the associated campaign. |  |
|**effectiveFlightDates** | [**ExternalFlightDatesModelV2**](ExternalFlightDatesModelV2.md) |  |  [optional] |
|**isPaused** | **Boolean** | Indicates whether the line item is paused. |  |
|**lineItemId** | **String** | The unique identifier of the line item. |  |
|**name** | **String** | The name of the line item. |  |
|**onsiteDisplayDetails** | [**OnsiteDisplayLineItemDetailsV2**](OnsiteDisplayLineItemDetailsV2.md) |  |  [optional] |
|**retailerId** | **String** | The retailer id of the associated retailer. |  |
|**serveToOptOutUser** | **Boolean** | Whether ads are served to users who have opted out of personalization. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the line item. |  |



## Enum: BudgetStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| BUDGETAVAILABLE | &quot;BudgetAvailable&quot; |
| DAILYBUDGETREACHED | &quot;DailyBudgetReached&quot; |
| MONTHLYBUDGETREACHED | &quot;MonthlyBudgetReached&quot; |
| TOTALBUDGETREACHED | &quot;TotalBudgetReached&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



