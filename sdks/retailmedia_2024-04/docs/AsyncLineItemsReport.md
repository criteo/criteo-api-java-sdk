

# AsyncLineItemsReport

Async Line Items report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;String&gt;** | Line Item ids to report on |  [optional] |
|**id** | **String** | Line Item id to report on |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Filter the type of campaigns to report on: sponsoredProducts or onSiteDisplays |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) | Filter on specific sales channel: offline or online |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Format of the output |  [optional] |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of report, if no dimensions/metrics are provided, falls back to summary reportType |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Click attribution window |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | View attribution window |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of metrics to report on |  [optional] |
|**startDate** | **OffsetDateTime** | Start date |  |
|**endDate** | **OffsetDateTime** | End date |  |
|**timezone** | **String** | Time zone : see criteo developer portal for supported time zones |  [optional] |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SPONSOREDPRODUCTS | &quot;sponsoredProducts&quot; |
| ONSITEDISPLAYS | &quot;onSiteDisplays&quot; |



## Enum: SalesChannelEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| OFFLINE | &quot;offline&quot; |
| ONLINE | &quot;online&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| JSON_COMPACT | &quot;json-compact&quot; |
| JSON_NEWLINE | &quot;json-newline&quot; |
| CSV | &quot;csv&quot; |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SUMMARY | &quot;summary&quot; |
| PAGETYPE | &quot;pageType&quot; |
| KEYWORD | &quot;keyword&quot; |
| PRODUCTCATEGORY | &quot;productCategory&quot; |
| PRODUCT | &quot;product&quot; |
| ATTRIBUTEDTRANSACTIONS | &quot;attributedTransactions&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| SERVEDCATEGORY | &quot;servedCategory&quot; |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _1D | &quot;1D&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| HOUR | &quot;hour&quot; |
| ACCOUNTID | &quot;accountId&quot; |
| ACCOUNTNAME | &quot;accountName&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| CAMPAIGNTYPENAME | &quot;campaignTypeName&quot; |
| LINEITEMID | &quot;lineItemId&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| RETAILERID | &quot;retailerId&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| BRANDID | &quot;brandId&quot; |
| BRANDNAME | &quot;brandName&quot; |
| ADVPRODUCTCATEGORY | &quot;advProductCategory&quot; |
| ADVPRODUCTID | &quot;advProductId&quot; |
| ADVPRODUCTNAME | &quot;advProductName&quot; |
| SALESCHANNEL | &quot;salesChannel&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| PAGECATEGORY | &quot;pageCategory&quot; |
| TAXONOMYBREADCRUMB | &quot;taxonomyBreadcrumb&quot; |
| KEYWORD | &quot;keyword&quot; |
| SEARCHTERM | &quot;searchTerm&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| IMPRESSIONS | &quot;impressions&quot; |
| CLICKS | &quot;clicks&quot; |
| SPEND | &quot;spend&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |
| ATTRIBUTEDUNITS | &quot;attributedUnits&quot; |
| ATTRIBUTEDORDERS | &quot;attributedOrders&quot; |
| ASSISTEDSALES | &quot;assistedSales&quot; |
| ASSISTEDUNITS | &quot;assistedUnits&quot; |
| CTR | &quot;ctr&quot; |
| CPC | &quot;cpc&quot; |
| CPO | &quot;cpo&quot; |
| CPM | &quot;cpm&quot; |
| ROAS | &quot;roas&quot; |
| VIDEOVIEWS | &quot;videoViews&quot; |
| VIDEOSSTARTED | &quot;videosStarted&quot; |
| VIDEOSPLAYEDTO25 | &quot;videosPlayedTo25&quot; |
| VIDEOSPLAYEDTO50 | &quot;videosPlayedTo50&quot; |
| VIDEOSPLAYEDTO75 | &quot;videosPlayedTo75&quot; |
| VIDEOSPLAYEDTO100 | &quot;videosPlayedTo100&quot; |
| VIDEOPLAYINGRATE | &quot;videoPlayingRate&quot; |
| VIDEOCOMPLETIONRATE | &quot;videoCompletionRate&quot; |
| UNIQUEVISITORS | &quot;uniqueVisitors&quot; |
| FREQUENCY | &quot;frequency&quot; |



