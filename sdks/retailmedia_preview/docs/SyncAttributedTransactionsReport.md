

# SyncAttributedTransactionsReport

Attributed transactions report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignIds** | **List&lt;String&gt;** | Campaign ids to report on |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** | Line item ids to report on |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of metrics to report on |  [optional] |
|**accountId** | **String** | Account id to report on |  |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Click attribution window |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | View attribution window |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Filter the type of campaigns to report on: sponsoredProducts or onSiteDisplays |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) | Filter on specific sales channel: offline or online |  [optional] |
|**startDate** | **OffsetDateTime** | Start date |  |
|**endDate** | **OffsetDateTime** | End date |  |
|**timezone** | **String** | Time zone : see criteo developer portal for supported time zones |  [optional] |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| CAMPAIGNNAME | &quot;campaignName&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| LINEITEMID | &quot;lineItemId&quot; |
| PURCHASEDDATE | &quot;purchasedDate&quot; |
| PURCHASEDHOUR | &quot;purchasedHour&quot; |
| ADVDATE | &quot;advDate&quot; |
| ADVHOUR | &quot;advHour&quot; |
| DAYSDIFFERENCE | &quot;daysDifference&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| ADVPRODUCTID | &quot;advProductId&quot; |
| ADVPRODUCTGTIN | &quot;advProductGtin&quot; |
| ADVPRODUCTMPN | &quot;advProductMpn&quot; |
| ADVPRODUCTNAME | &quot;advProductName&quot; |
| ADVPRODUCTCATEGORY | &quot;advProductCategory&quot; |
| PURCHASEDPRODUCTID | &quot;purchasedProductId&quot; |
| PURCHASEDPRODUCTGTIN | &quot;purchasedProductGtin&quot; |
| PURCHASEDPRODUCTMPN | &quot;purchasedProductMpn&quot; |
| PURCHASEDPRODUCTNAME | &quot;purchasedProductName&quot; |
| PURCHASEDPRODUCTCATEGORY | &quot;purchasedProductCategory&quot; |
| ADVENGAGEMENT | &quot;advEngagement&quot; |
| ADVTOPURCHASEDPRODUCTRELATIONSHIP | &quot;advToPurchasedProductRelationship&quot; |
| SALESCHANNEL | &quot;salesChannel&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| KEYWORD | &quot;keyword&quot; |
| ATTRIBUTIONWINDOW | &quot;attributionWindow&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| ATTRIBUTEDUNITS | &quot;attributedUnits&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |



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



