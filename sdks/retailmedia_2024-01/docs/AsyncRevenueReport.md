

# AsyncRevenueReport

Async Revenue report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;String&gt;** | Campaign ids to report on |  [optional] |
|**id** | **String** | Campaign id to report on |  [optional] |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of report |  [optional] |
|**revenueType** | [**RevenueTypeEnum**](#RevenueTypeEnum) | Type of revenue |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Format of the output |  [optional] |
|**soldBy** | [**SoldByEnum**](#SoldByEnum) | Filter on the seller: indirect, direct or private market |  [optional] |
|**campaignSubType** | [**CampaignSubTypeEnum**](#CampaignSubTypeEnum) | Filter on campaign subType : Auction and Preferred Deals or Lockout campaign |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Click attribution window |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | View attribution window |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Filter the type of campaigns to report on: sponsoredProducts or onSiteDisplays |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) | Filter on specific sales channel: offline or online |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of metrics to report on |  [optional] |
|**startDate** | **OffsetDateTime** | Start date |  |
|**endDate** | **OffsetDateTime** | End date |  |
|**timezone** | **String** | Time zone : see criteo developer portal for supported time zones |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| ADVERTISER | &quot;advertiser&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| PAGETYPE | &quot;pageType&quot; |
| PRODUCTCATEGORY | &quot;productCategory&quot; |
| BRAND | &quot;brand&quot; |



## Enum: RevenueTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERRED | &quot;preferred&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| JSON_COMPACT | &quot;json-compact&quot; |
| JSON_NEWLINE | &quot;json-newline&quot; |
| CSV | &quot;csv&quot; |



## Enum: SoldByEnum

| Name | Value |
|---- | -----|
| DIRECTSOLD | &quot;directSold&quot; |
| INDIRECTSOLD | &quot;indirectSold&quot; |
| PRIVATEMARKET | &quot;privateMarket&quot; |



## Enum: CampaignSubTypeEnum

| Name | Value |
|---- | -----|
| AUCTIONANDPREFERRED | &quot;auctionAndPreferred&quot; |
| LOCKOUT | &quot;lockout&quot; |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |
| NONE | &quot;none&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| _1D | &quot;1D&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |
| NONE | &quot;none&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| SPONSOREDPRODUCTS | &quot;sponsoredProducts&quot; |
| ONSITEDISPLAYS | &quot;onSiteDisplays&quot; |



## Enum: SalesChannelEnum

| Name | Value |
|---- | -----|
| OFFLINE | &quot;offline&quot; |
| ONLINE | &quot;online&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| ACCOUNTID | &quot;accountId&quot; |
| ACCOUNTNAME | &quot;accountName&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| ADVPRODUCTCATEGORY | &quot;advProductCategory&quot; |
| BRANDID | &quot;brandId&quot; |
| BRANDNAME | &quot;brandName&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| ADVPRODUCTNAME | &quot;advProductName&quot; |
| ADVPRODUCTGTIN | &quot;advProductGtin&quot; |
| ADVPRODUCTMPN | &quot;advProductMpn&quot; |
| ADVPRODUCTID | &quot;advProductId&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| IMPRESSIONS | &quot;impressions&quot; |
| CLICKS | &quot;clicks&quot; |
| SPEND | &quot;spend&quot; |
| SALES | &quot;sales&quot; |
| UNITS | &quot;units&quot; |
| CPO | &quot;cpo&quot; |
| ROAS | &quot;roas&quot; |
| OPENAUCTIONREVENUE | &quot;openAuctionRevenue&quot; |
| PREFERREDDEALSREVENUE | &quot;preferredDealsRevenue&quot; |
| AVGCPC | &quot;avgCpc&quot; |
| AVGCPM | &quot;avgCpm&quot; |



