

# LineItem

Line Item search attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account id of the associated account. |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | The buy type of the line item. |  [optional] |
|**campaignId** | **String** | The campaign id of the associated campaign. |  [optional] |
|**conquestingSettings** | [**ConquestingSettings**](ConquestingSettings.md) |  |  [optional] |
|**flightDates** | [**FlightDates**](FlightDates.md) |  |  [optional] |
|**fundingStatus** | [**FundingStatusEnum**](#FundingStatusEnum) | Indicates whether the line item is funded. |  [optional] |
|**isPaused** | **Boolean** | Indicates whether the line item is paused. |  [optional] |
|**lineItemId** | **String** | The id of the line item. |  [optional] |
|**lineItemType** | [**LineItemTypeEnum**](#LineItemTypeEnum) | The type of the line item. |  [optional] |
|**name** | **String** | The name of the line item. |  [optional] |
|**onsiteDisplay** | [**OnsiteDisplayAttributes**](OnsiteDisplayAttributes.md) |  |  [optional] |
|**retailerId** | **String** | The retailer id of the associated retailer. |  [optional] |
|**serveToOptOutUser** | **Boolean** | Whether to serve ads to users who have opted out of personalization. |  [optional] |
|**sponsoredProducts** | [**SponsoredProductsAttributes**](SponsoredProductsAttributes.md) |  |  [optional] |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;Auction&quot; |
| PREFERREDDEALS | &quot;PreferredDeals&quot; |
| SPONSORSHIP | &quot;Sponsorship&quot; |



## Enum: FundingStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| FUNDED | &quot;Funded&quot; |
| DAILYBUDGETREACHED | &quot;DailyBudgetReached&quot; |
| MONTHLYBUDGETREACHED | &quot;MonthlyBudgetReached&quot; |
| TOTALBUDGETREACHED | &quot;TotalBudgetReached&quot; |
| BALANCEEXHAUSTED | &quot;BalanceExhausted&quot; |



## Enum: LineItemTypeEnum

| Name | Value |
|---- | -----|
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



