

# CampaignResponseModel

A Retail Media Campaign used to represent an advertiser's marketing objective

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**attributionSettings** | [**AttributionSettingsModel**](AttributionSettingsModel.md) |  |  |
|**billByRetailerId** | **String** |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | Buy type of campaign, set only on creation. |  |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of campaign, set only on creation. |  |
|**companyName** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**drawableBalanceIds** | **List&lt;String&gt;** |  |  |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**onsiteDisplayDetails** | [**OnsiteDisplayDetailsModel**](OnsiteDisplayDetailsModel.md) |  |  [optional] |
|**regulatedCategory** | [**RegulatedCategoryEnum**](#RegulatedCategoryEnum) | Regulated category the campaign advertises in, set only on creation. |  |
|**scheduleDetails** | [**ScheduleDetailsModel**](ScheduleDetailsModel.md) |  |  [optional] |
|**sponsoredProductsDetails** | [**SponsoredProductsDetailsModel**](SponsoredProductsDetailsModel.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Campaign status, derived from the status of Line Items it holds; active if at least  one line item is active. |  |
|**updatedAt** | **OffsetDateTime** |  |  |



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



## Enum: RegulatedCategoryEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| NONE | &quot;None&quot; |
| ALCOHOL | &quot;Alcohol&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |



