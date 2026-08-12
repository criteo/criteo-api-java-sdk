

# ExperimentalLineItemModel

A unit of ad delivery configuration within a campaign. It defines how a specific subset of ads  is targeted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignId** | **String** | The campaign id of the associated campaign. |  [optional] |
|**conquestingSettings** | [**ExperimentalConquestingSettingsModel**](ExperimentalConquestingSettingsModel.md) |  |  [optional] |
|**effectiveFlightDates** | [**ExperimentalFlightDatesModel**](ExperimentalFlightDatesModel.md) |  |  [optional] |
|**financialStatus** | [**FinancialStatusEnum**](#FinancialStatusEnum) | The financial status of the line item. |  [optional] |
|**isPaused** | **Boolean** | Whether the line item should be paused or unpaused. |  [optional] |
|**lineItemId** | **String** | The unique identifier of the line item. |  [optional] |
|**name** | **String** | The name of the line item. |  [optional] |
|**onsiteDisplayDetails** | [**ExperimentalOnsiteDisplayLineItemDetails**](ExperimentalOnsiteDisplayLineItemDetails.md) |  |  [optional] |
|**retailerId** | **String** | The retailer id of the associated retailer. |  [optional] |
|**serveToOptOutUser** | **Boolean** | Whether ads are served to users who have opted out of personalization. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the line item. |  [optional] |



## Enum: FinancialStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| ACTIVE | &quot;Active&quot; |
| BUDGETHITDAILY | &quot;BudgetHitDaily&quot; |
| BUDGETHITMONTHLY | &quot;BudgetHitMonthly&quot; |
| BUDGETHITTOTAL | &quot;BudgetHitTotal&quot; |
| BALANCEHIT | &quot;BalanceHit&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



