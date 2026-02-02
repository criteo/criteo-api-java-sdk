

# ShareOfVoiceInsight

Description of a Share of voice insight

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**brandIds** | **List&lt;String&gt;** |  |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) |  |  |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) |  |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) |  |  |
|**retailerIds** | **List&lt;String&gt;** |  |  [optional] |
|**servedCategories** | [**List&lt;ServedCategoryFilter&gt;**](ServedCategoryFilter.md) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| ONSITESPONSOREDPRODUCTS | &quot;onsiteSponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;onsiteDisplay&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| ACCOUNTID | &quot;accountId&quot; |
| ACCOUNTNAME | &quot;accountName&quot; |
| RETAILERID | &quot;retailerId&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| BRANDID | &quot;brandId&quot; |
| BRANDNAME | &quot;brandName&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| BUYTYPE | &quot;buyType&quot; |
| SKUID | &quot;skuId&quot; |
| SKUNAME | &quot;skuName&quot; |
| LINEITEMID | &quot;lineItemId&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| PAGETYPEID | &quot;pageTypeId&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| PRODUCTGTIN | &quot;productGtin&quot; |
| PRODUCTMPN | &quot;productMpn&quot; |
| PRODUCTCATEGORY | &quot;productCategory&quot; |
| SERVEDCATEGORY | &quot;servedCategory&quot; |
| CAMPAIGNTYPE | &quot;campaignType&quot; |
| CREATIVETYPE | &quot;creativeType&quot; |
| ADFORMAT | &quot;adFormat&quot; |
| CREATIVENAME | &quot;creativeName&quot; |
| ENVIRONMENT | &quot;environment&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| JSON_COMPACT | &quot;json-compact&quot; |
| JSON_NEWLINE | &quot;json-newline&quot; |
| CSV | &quot;csv&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| IMPRESSIONS | &quot;impressions&quot; |
| CLICKS | &quot;clicks&quot; |
| GROSSCLICKS | &quot;grossClicks&quot; |
| SPEND | &quot;spend&quot; |
| CPC | &quot;cpc&quot; |
| CTR | &quot;ctr&quot; |
| CPM | &quot;cpm&quot; |
| ROAS | &quot;roas&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |
| ATTRIBUTEDUNITS | &quot;attributedUnits&quot; |
| ASSISTEDUNITS | &quot;assistedUnits&quot; |
| ASSISTEDSALES | &quot;assistedSales&quot; |
| EXPOSEDUSERS | &quot;exposedUsers&quot; |
| IMPRESSIONSHARE | &quot;impressionShare&quot; |
| CLICKSHARE | &quot;clickShare&quot; |
| INVALIDCLICKS | &quot;invalidClicks&quot; |



