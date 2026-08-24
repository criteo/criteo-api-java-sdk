

# AttributionSettingsCreateModel

Wrapper for attribution settings. Each setting may be omitted, in which case it is  populated with the default for the campaign type: OnsiteDisplay defaults to a 14D click  window, a 14D view window and sameSkuCategory for both scopes; SponsoredProducts defaults  to a 30D click window, a 1D view window, sameSkuCategory click scope and sameSku view  scope.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clickAttributionScope** | [**ClickAttributionScopeEnum**](#ClickAttributionScopeEnum) | Post-click attribution scope setting. |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Post-click attribution window setting. |  [optional] |
|**viewAttributionScope** | [**ViewAttributionScopeEnum**](#ViewAttributionScopeEnum) | Post-view attribution scope setting. Must not be broader than the click attribution scope. |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | Post-view attribution window setting. Must not exceed the click attribution window. |  [optional] |



## Enum: ClickAttributionScopeEnum

| Name | Value |
|---- | -----|
| SAMESKU | &quot;SameSku&quot; |
| SAMESKUCATEGORY | &quot;SameSkuCategory&quot; |
| SAMESKUCATEGORYBRAND | &quot;SameSkuCategoryBrand&quot; |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| ONEWEEK | &quot;OneWeek&quot; |
| TWOWEEKS | &quot;TwoWeeks&quot; |
| ONEMONTH | &quot;OneMonth&quot; |



## Enum: ViewAttributionScopeEnum

| Name | Value |
|---- | -----|
| SAMESKU | &quot;SameSku&quot; |
| SAMESKUCATEGORY | &quot;SameSkuCategory&quot; |
| SAMESKUCATEGORYBRAND | &quot;SameSkuCategoryBrand&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| ONEDAY | &quot;OneDay&quot; |
| ONEWEEK | &quot;OneWeek&quot; |
| TWOWEEKS | &quot;TwoWeeks&quot; |
| ONEMONTH | &quot;OneMonth&quot; |



