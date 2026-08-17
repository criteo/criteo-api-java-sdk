

# OrchestratorContractCampaignResponseModelV2

A Retail Media Campaign used to represent an advertiser's marketing objective

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  [optional] |
|**attributionSettings** | [**CampaignServiceContractAttributionSettingsModelV2**](CampaignServiceContractAttributionSettingsModelV2.md) |  |  [optional] |
|**billByRetailerId** | **String** |  |  [optional] |
|**budgetDetails** | [**OrchestratorContractBudgetDetailsModelV2**](OrchestratorContractBudgetDetailsModelV2.md) |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) |  |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) |  |  [optional] |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**scheduleDetails** | [**CampaignServiceContractScheduleDetailsModelV2**](CampaignServiceContractScheduleDetailsModelV2.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| AUCTION | &quot;Auction&quot; |
| PREFERREDDEALS | &quot;PreferredDeals&quot; |
| SPONSORSHIP | &quot;Sponsorship&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



## Enum: ObjectiveEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;Manual&quot; |
| CLICKS | &quot;Clicks&quot; |
| CONVERSION | &quot;Conversion&quot; |
| REVENUE | &quot;Revenue&quot; |
| UNKNOWN | &quot;Unknown&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |



