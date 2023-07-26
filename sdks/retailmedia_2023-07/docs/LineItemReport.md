

# LineItemReport

Line item report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** |  |  [optional] |
|**campaignIds** | **List&lt;String&gt;** |  |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) |  |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**accountId** | **String** |  |  |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**timezone** | **String** |  |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) |  |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) |  |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) |  |  [optional] |



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
| ROAS | &quot;roas&quot; |
| ASSISTEDUNITS | &quot;assistedUnits&quot; |
| ASSISTEDSALES | &quot;assistedSales&quot; |
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
| LINEITEMID | &quot;lineItemId&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| RETAILERID | &quot;retailerId&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| KEYWORD | &quot;keyword&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| SALESCHANNEL | &quot;salesChannel&quot; |



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



