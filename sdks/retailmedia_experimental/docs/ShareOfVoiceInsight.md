

# ShareOfVoiceInsight

Parameters of a Share of Voice insight.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID the insight report is generated for. |  |
|**aggregationLevel** | [**AggregationLevelEnum**](#AggregationLevelEnum) | Aggregation level of the report. Allowed values: &#x60;category&#x60;, &#x60;keyword&#x60;. Defaults to &#x60;category&#x60;. |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | Dimensions to report on. |  |
|**endDate** | **String** | End date of the report, in ISO 8601 format (YYYY-MM-DD). |  |
|**filters** | [**ShareOfVoiceFilters**](ShareOfVoiceFilters.md) |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Output format of the report. Allowed values: &#x60;json&#x60;, &#x60;json-compact&#x60;, &#x60;json-newline&#x60;, &#x60;csv&#x60;. Defaults to &#x60;json-compact&#x60;. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | Metrics to report on. |  |
|**startDate** | **String** | Start date of the report, in ISO 8601 format (YYYY-MM-DD). |  |



## Enum: AggregationLevelEnum

| Name | Value |
|---- | -----|
| CATEGORY | &quot;category&quot; |
| KEYWORD | &quot;keyword&quot; |



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
| KEYWORD | &quot;keyword&quot; |
| KEYWORDTYPE | &quot;keywordType&quot; |
| CAMPAIGNTYPE | &quot;campaignType&quot; |
| CREATIVETYPE | &quot;creativeType&quot; |
| ADFORMAT | &quot;adFormat&quot; |
| CREATIVENAME | &quot;creativeName&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| BUDGETMODEL | &quot;budgetModel&quot; |
| ACTIVATIONPLATFORM | &quot;activationPlatform&quot; |



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



