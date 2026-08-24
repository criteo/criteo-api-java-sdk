

# CampaignCreateModel

An object that represents the available options to set when creating a Retail Media Campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionSettings** | [**AttributionSettingsCreateModel**](AttributionSettingsCreateModel.md) |  |  [optional] |
|**billByRetailerId** | **String** |  |  [optional] |
|**budgetDetails** | [**BudgetDetailsCreateModel**](BudgetDetailsCreateModel.md) |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | Buy type of campaign, set only on creation. Auction is the only buy type currently supported. |  |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of campaign, set only on creation. |  |
|**companyName** | **String** |  |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) |  |  [optional] |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**scheduleDetails** | [**ScheduleDetailsCreateModel**](ScheduleDetailsCreateModel.md) |  |  [optional] |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;Auction&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



## Enum: ObjectiveEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;Manual&quot; |
| CLICKS | &quot;Clicks&quot; |
| CONVERSION | &quot;Conversion&quot; |
| REVENUE | &quot;Revenue&quot; |



