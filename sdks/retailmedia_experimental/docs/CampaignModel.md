

# CampaignModel

A campaign. A campaign groups line items that share attribution settings, flight dates and  budget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID associated with the campaign, generated internally by Criteo. |  [optional] |
|**attributionSettings** | [**AttributionSettingsModel**](AttributionSettingsModel.md) |  |  [optional] |
|**billByRetailerId** | **String** | The retailer this campaign is associated with, set only on creation. Required when using a  retailer budget balance. |  [optional] |
|**budget** | [**CampaignBudgetModel**](CampaignBudgetModel.md) |  |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | Buy type of campaign, set only on creation. |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of campaign, set only on creation. |  [optional] |
|**companyName** | **String** | This optional field, exclusively accessible to marketplaces within the European Union (in  compliance with the Digital Service Act - DSA), will display the name of the company  associated with the advertisement. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp of campaign creation, in UTC. |  [optional] |
|**id** | **String** | Campaign ID, generated internally by Criteo. |  [optional] |
|**name** | **String** | Campaign name; must be unique within an Account. |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Objective of a campaign. |  [optional] |
|**onBehalfCompanyName** | **String** | This optional field, exclusively accessible to marketplaces within the European Union (in  compliance with the Digital Service Act - DSA), will display the name of the company (on  behalf of companyName) associated with the advertisement. |  [optional] |
|**regulatedCategory** | [**RegulatedCategoryEnum**](#RegulatedCategoryEnum) | Regulated category the campaign advertises in, set only on creation. |  [optional] |
|**scheduleDetails** | [**ScheduleDetailsModel**](ScheduleDetailsModel.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Campaign status, derived from the status of Line Items it holds; active if at least  one line item is active. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of last campaign update, in UTC. |  [optional] |



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
| IMPRESSIONS | &quot;Impressions&quot; |
| UNKNOWN | &quot;Unknown&quot; |



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



