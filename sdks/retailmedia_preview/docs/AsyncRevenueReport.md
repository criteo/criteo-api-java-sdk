

# AsyncRevenueReport

Async Revenue report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  |  [optional] |
|**revenueType** | [**RevenueTypeEnum**](#RevenueTypeEnum) |  |  [optional] |
|**ids** | **List&lt;String&gt;** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) |  |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**timezone** | **String** |  |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) |  |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| ADVERTISER | &quot;advertiser&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| PAGETYPE | &quot;pageType&quot; |
| PAGECATEGORY | &quot;pageCategory&quot; |
| BRAND | &quot;brand&quot; |



## Enum: RevenueTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERRED | &quot;preferred&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| CLICKS | &quot;clicks&quot; |
| SPEND | &quot;spend&quot; |
| ATTRIBUTEDORDERS | &quot;attributedOrders&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |
| ATTRIBUTEDUNITS | &quot;attributedUnits&quot; |
| CPC | &quot;cpc&quot; |
| CPO | &quot;cpo&quot; |
| ROAS | &quot;roas&quot; |
| OPENAUCTIONREVENUE | &quot;openAuctionRevenue&quot; |
| PREFERREDDEALSREVENUE | &quot;preferredDealsRevenue&quot; |
| AVGCPC | &quot;avgCpc&quot; |
| AVGCPM | &quot;avgCpm&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| ACCOUNTID | &quot;accountId&quot; |
| ACCOUNTNAME | &quot;accountName&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| ADVPRODUCTCATEGORY | &quot;advProductCategory&quot; |
| BRANDID | &quot;brandId&quot; |
| BRANDNAME | &quot;brandName&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| JSON_COMPACT | &quot;json-compact&quot; |
| JSON_NEWLINE | &quot;json-newline&quot; |
| CSV | &quot;csv&quot; |



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



