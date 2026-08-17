

# OrchestratorContractCampaignCreateModelV2

An object that represents the available options to set when creating a Retail Media Campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionSettings** | [**CampaignServiceContractAttributionSettingsCreateModelV2**](CampaignServiceContractAttributionSettingsCreateModelV2.md) |  |  [optional] |
|**billByRetailerId** | **String** |  |  [optional] |
|**budgetDetails** | [**OrchestratorContractBudgetDetailsCreateModelV2**](OrchestratorContractBudgetDetailsCreateModelV2.md) |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) |  |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) |  |  [optional] |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**scheduleDetails** | [**CampaignServiceContractScheduleDetailsCreateModelV2**](CampaignServiceContractScheduleDetailsCreateModelV2.md) |  |  [optional] |



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



