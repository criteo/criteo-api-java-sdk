

# CampaignCreateModel

An object that represents the available options to set when creating a Retail Media Campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionSettings** | [**AttributionSettingsCreateModel**](AttributionSettingsCreateModel.md) |  |  [optional] |
|**billByRetailerId** | **String** |  |  [optional] |
|**budget** | [**DynamicBudgetCreateModel**](DynamicBudgetCreateModel.md) |  |  |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | Buy type of campaign, set only on creation. Auction is the only buy type currently supported. |  |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of campaign, set only on creation. |  |
|**companyName** | **String** |  |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Objective the campaign is optimized for. The platform derives the line item budgets from the  campaign budget to serve it. SponsoredProducts accepts clicks, conversion and revenue;  OnsiteDisplay accepts impressions. |  |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**regulatedCategory** | [**RegulatedCategoryEnum**](#RegulatedCategoryEnum) |  |  [optional] |
|**scheduleDetails** | [**ScheduleDetailsCreateModel**](ScheduleDetailsCreateModel.md) |  |  |



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
| CLICKS | &quot;Clicks&quot; |
| CONVERSION | &quot;Conversion&quot; |
| REVENUE | &quot;Revenue&quot; |
| IMPRESSIONS | &quot;Impressions&quot; |



## Enum: RegulatedCategoryEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| ALCOHOL | &quot;Alcohol&quot; |



