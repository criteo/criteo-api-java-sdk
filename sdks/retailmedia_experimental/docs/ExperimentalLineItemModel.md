

# ExperimentalLineItemModel

A unit of ad delivery configuration within a campaign. It defines how a specific subset of ads  is targeted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignId** | **String** | The campaign id of the associated campaign. |  [optional] |
|**conquestingSettings** | [**ExperimentalConquestingSettingsModel**](ExperimentalConquestingSettingsModel.md) |  |  [optional] |
|**effectiveFlightDates** | [**ExperimentalFlightDatesModel**](ExperimentalFlightDatesModel.md) |  |  [optional] |
|**fundingStatus** | [**FundingStatusEnum**](#FundingStatusEnum) | Indicates whether the line item is funded. |  [optional] |
|**isPaused** | **Boolean** | Indicates whether the line item is paused. |  [optional] |
|**lineItemId** | **String** | The unique identifier of the line item. |  [optional] |
|**name** | **String** | The name of the line item. |  [optional] |
|**onsiteDisplayDetails** | [**ExperimentalOnsiteDisplayLineItemDetails**](ExperimentalOnsiteDisplayLineItemDetails.md) |  |  [optional] |
|**retailerId** | **String** | The retailer id of the associated retailer. |  [optional] |
|**serveToOptOutUser** | **Boolean** | Whether ads are served to users who have opted out of personalization. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the line item. |  [optional] |



## Enum: FundingStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| FUNDED | &quot;Funded&quot; |
| DAILYBUDGETREACHED | &quot;DailyBudgetReached&quot; |
| MONTHLYBUDGETREACHED | &quot;MonthlyBudgetReached&quot; |
| TOTALBUDGETREACHED | &quot;TotalBudgetReached&quot; |
| BALANCEEXHAUSTED | &quot;BalanceExhausted&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



