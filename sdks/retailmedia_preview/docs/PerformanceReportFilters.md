

# PerformanceReportFilters

Array-valued constraints for performance DSP analytics. At least one of accountIds, campaignIds, or lineItemIds is required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;String&gt;** | Optional scope filter. Allows up to 5 account IDs per request. |  [optional] |
|**activationPlatforms** | [**List&lt;ActivationPlatformsEnum&gt;**](#List&lt;ActivationPlatformsEnum&gt;) | Optional activation platform filter. |  [optional] |
|**budgetModels** | [**List&lt;BudgetModelsEnum&gt;**](#List&lt;BudgetModelsEnum&gt;) | Optional budget model filter. |  [optional] |
|**buyTypes** | [**List&lt;BuyTypesEnum&gt;**](#List&lt;BuyTypesEnum&gt;) | Optional buy type filter. |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | Optional scope filter. Allows up to 50 campaign IDs per request. |  [optional] |
|**campaignTypes** | [**List&lt;CampaignTypesEnum&gt;**](#List&lt;CampaignTypesEnum&gt;) | Optional inherited campaign type filter. |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** | Optional scope filter. Allows up to 50 line-item IDs per request. |  [optional] |
|**mediaTypes** | [**List&lt;MediaTypesEnum&gt;**](#List&lt;MediaTypesEnum&gt;) | Optional inherited media type filter. |  [optional] |
|**salesChannels** | [**List&lt;SalesChannelsEnum&gt;**](#List&lt;SalesChannelsEnum&gt;) | Optional inherited sales channel filter. |  [optional] |
|**searchTermTargetings** | [**List&lt;SearchTermTargetingsEnum&gt;**](#List&lt;SearchTermTargetingsEnum&gt;) | Optional search term targeting filter. |  [optional] |
|**searchTermTypes** | [**List&lt;SearchTermTypesEnum&gt;**](#List&lt;SearchTermTypesEnum&gt;) | Optional search term type filter. |  [optional] |
|**targetedKeywordTypes** | [**List&lt;TargetedKeywordTypesEnum&gt;**](#List&lt;TargetedKeywordTypesEnum&gt;) | Optional targeted keyword type filter. |  [optional] |



## Enum: List&lt;ActivationPlatformsEnum&gt;

| Name | Value |
|---- | -----|
| COMMERCEMAX | &quot;CommerceMax&quot; |
| PRIVATEMARKET | &quot;PrivateMarket&quot; |



## Enum: List&lt;BudgetModelsEnum&gt;

| Name | Value |
|---- | -----|
| CRITEOBUDGET | &quot;CriteoBudget&quot; |
| RETAILERBUDGET | &quot;RetailerBudget&quot; |



## Enum: List&lt;BuyTypesEnum&gt;

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERREDDEALS | &quot;preferredDeals&quot; |
| SPONSORSHIP | &quot;sponsorship&quot; |



## Enum: List&lt;CampaignTypesEnum&gt;

| Name | Value |
|---- | -----|
| SPONSOREDPRODUCTS | &quot;sponsoredProducts&quot; |
| ONSITEDISPLAYS | &quot;onSiteDisplays&quot; |



## Enum: List&lt;MediaTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| DISPLAY | &quot;display&quot; |



## Enum: List&lt;SalesChannelsEnum&gt;

| Name | Value |
|---- | -----|
| ONLINE | &quot;online&quot; |
| OFFLINE | &quot;offline&quot; |



## Enum: List&lt;SearchTermTargetingsEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| AUTOMATIC | &quot;automatic&quot; |
| MANUAL | &quot;manual&quot; |



## Enum: List&lt;SearchTermTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| SEARCHED | &quot;searched&quot; |
| ENTERED | &quot;entered&quot; |



## Enum: List&lt;TargetedKeywordTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| GENERIC | &quot;generic&quot; |
| BRANDED | &quot;branded&quot; |
| CONQUESTING | &quot;conquesting&quot; |



