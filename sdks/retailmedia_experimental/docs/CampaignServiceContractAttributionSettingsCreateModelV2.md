

# CampaignServiceContractAttributionSettingsCreateModelV2

Wrapper for attribution settings. Each setting may be omitted, in which case it is populated with the default for the campaign type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clickAttributionScope** | [**ClickAttributionScopeEnum**](#ClickAttributionScopeEnum) |  |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) |  |  [optional] |
|**viewAttributionScope** | [**ViewAttributionScopeEnum**](#ViewAttributionScopeEnum) |  |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) |  |  [optional] |



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



