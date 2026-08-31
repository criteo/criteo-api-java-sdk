

# ShareOfVoiceFilters

Filters for a Share of Voice insight.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;String&gt;** | Accounts to filter on. |  [optional] |
|**activationPlatforms** | [**List&lt;ActivationPlatformsEnum&gt;**](#List&lt;ActivationPlatformsEnum&gt;) | Activation platforms to filter on. Allowed values: &#x60;commerceMax&#x60;, &#x60;privateMarket&#x60;. |  [optional] |
|**brandIds** | **List&lt;String&gt;** | Brands to filter on. |  [optional] |
|**budgetModels** | [**List&lt;BudgetModelsEnum&gt;**](#List&lt;BudgetModelsEnum&gt;) | Budget models to filter on. Allowed values: &#x60;criteoBudget&#x60;, &#x60;retailerBudget&#x60;. |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Campaign type to filter on. Allowed values: &#x60;all&#x60;, &#x60;onsiteSponsoredProducts&#x60;, &#x60;onsiteDisplay&#x60;. Defaults to &#x60;all&#x60;. |  [optional] |
|**keywords** | **List&lt;String&gt;** | Keywords to filter on. |  [optional] |
|**keywordTypes** | [**List&lt;KeywordTypesEnum&gt;**](#List&lt;KeywordTypesEnum&gt;) | Keyword types to filter on. Allowed values: &#x60;unknown&#x60;, &#x60;generic&#x60;, &#x60;branded&#x60;, &#x60;conquesting&#x60;. |  [optional] |
|**retailerIds** | **List&lt;String&gt;** | Retailers to filter on. |  [optional] |
|**servedCategories** | **List&lt;String&gt;** | Retailer-specific category taxonomy values to filter on. |  [optional] |



## Enum: List&lt;ActivationPlatformsEnum&gt;

| Name | Value |
|---- | -----|
| COMMERCEMAX | &quot;commerceMax&quot; |
| PRIVATEMARKET | &quot;privateMarket&quot; |



## Enum: List&lt;BudgetModelsEnum&gt;

| Name | Value |
|---- | -----|
| CRITEOBUDGET | &quot;criteoBudget&quot; |
| RETAILERBUDGET | &quot;retailerBudget&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| ONSITESPONSOREDPRODUCTS | &quot;onsiteSponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;onsiteDisplay&quot; |



## Enum: List&lt;KeywordTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| GENERIC | &quot;generic&quot; |
| BRANDED | &quot;branded&quot; |
| CONQUESTING | &quot;conquesting&quot; |



