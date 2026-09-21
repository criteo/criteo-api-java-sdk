

# CampaignCreateModel

An object that represents the available options to set when creating a Retail Media Campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionSettings** | [**AttributionSettingsCreateModel**](AttributionSettingsCreateModel.md) |  |  [optional] |
|**billByRetailerId** | **String** |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | Buy type of campaign, set only on creation. Auction is the only buy type currently supported. |  |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of campaign, set only on creation. |  |
|**companyName** | **String** |  |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**onsiteDisplayDetails** | [**OnsiteDisplayDetailsCreateModel**](OnsiteDisplayDetailsCreateModel.md) |  |  [optional] |
|**regulatedCategory** | [**RegulatedCategoryEnum**](#RegulatedCategoryEnum) |  |  [optional] |
|**scheduleDetails** | [**ScheduleDetailsCreateModel**](ScheduleDetailsCreateModel.md) |  |  [optional] |
|**sponsoredProductsDetails** | [**SponsoredProductsDetailsCreateModel**](SponsoredProductsDetailsCreateModel.md) |  |  [optional] |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;Auction&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



## Enum: RegulatedCategoryEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| ALCOHOL | &quot;Alcohol&quot; |



