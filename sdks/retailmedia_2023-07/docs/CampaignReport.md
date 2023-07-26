

# CampaignReport

Campaign report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | List of campaign Ids to filter |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of Metrics to report on |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**accountId** | **String** | Account id to report on |  |
|**startDate** | **OffsetDateTime** | Start date |  |
|**endDate** | **OffsetDateTime** | End Date |  |
|**timezone** | **String** | Time zone : see criteo developer portal for supported time zones |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Click Attribution Window |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | View Attribution window |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Filter the type of campaign to report on |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) | Filter on the channel of sales |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SUMMARY | &quot;summary&quot; |
| PAGETYPE | &quot;pageType&quot; |
| KEYWORD | &quot;keyword&quot; |
| PRODUCTCATEGORY | &quot;productCategory&quot; |
| PRODUCT | &quot;product&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| IMPRESSIONS | &quot;impressions&quot; |
| CLICKS | &quot;clicks&quot; |
| SPEND | &quot;spend&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |
| ATTRIBUTEDUNITS | &quot;attributedUnits&quot; |
| ATTRIBUTEDORDERS | &quot;attributedOrders&quot; |
| CTR | &quot;ctr&quot; |
| CPC | &quot;cpc&quot; |
| CPO | &quot;cpo&quot; |
| CPM | &quot;cpm&quot; |
| ROAS | &quot;roas&quot; |
| UNIQUEVISITORS | &quot;uniqueVisitors&quot; |
| FREQUENCY | &quot;frequency&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| CAMPAIGNTYPENAME | &quot;campaignTypeName&quot; |
| ADVPRODUCTCATEGORY | &quot;advProductCategory&quot; |
| ADVPRODUCTID | &quot;advProductId&quot; |
| ADVPRODUCTNAME | &quot;advProductName&quot; |
| BRANDID | &quot;brandId&quot; |
| BRANDNAME | &quot;brandName&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| KEYWORD | &quot;keyword&quot; |
| SALESCHANNEL | &quot;salesChannel&quot; |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



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



