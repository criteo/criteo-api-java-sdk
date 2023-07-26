

# AttributedTransactionsReport

Attributed transactions report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignIds** | **List&lt;String&gt;** | Campaign ids to report on |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** | Line item ids to report on |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of metrics to report on |  [optional] |
|**soldBy** | [**SoldByEnum**](#SoldByEnum) | Filter on the type of seller |  [optional] |
|**campaignSubType** | [**CampaignSubTypeEnum**](#CampaignSubTypeEnum) | Filter on the campaign sub type |  [optional] |
|**accountId** | **String** | Account id to report on |  |
|**startDate** | **OffsetDateTime** | Start date |  |
|**endDate** | **OffsetDateTime** | End Date |  |
|**timezone** | **String** | Time zone : see criteo developer portal for supported time zones |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Click Attribution Window |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | View Attribution window |  [optional] |



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



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| _1D | &quot;1D&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |
| NONE | &quot;none&quot; |



