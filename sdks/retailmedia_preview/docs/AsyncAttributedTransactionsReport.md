

# AsyncAttributedTransactionsReport

Create payload attributes for an attributed-transactions async report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Optional click attribution window. |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | Required output grouping fields. Empty array means no grouping fields. At least one of dimensions or metrics must be non-empty. |  |
|**endDate** | **LocalDate** | Required inclusive report end date in YYYY-MM-DD format. Must be greater than or equal to startDate. |  |
|**filters** | [**AttributedTransactionsReportFilters**](AttributedTransactionsReportFilters.md) |  |  |
|**format** | [**FormatEnum**](#FormatEnum) | Output format. If omitted, json-compact is used. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | Required output measure fields. Empty array means no measure fields. At least one of dimensions or metrics must be non-empty. |  |
|**startDate** | **LocalDate** | Required inclusive report start date in YYYY-MM-DD format. |  |
|**timezone** | **String** | Optional time zone identifier. If omitted, UTC is used. If provided, it must be valid. |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | Optional view attribution window. |  [optional] |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| PURCHASEDDATE | &quot;purchasedDate&quot; |
| PURCHASEDHOUR | &quot;purchasedHour&quot; |
| ADVERTISEDDATE | &quot;advertisedDate&quot; |
| ADVERTISEDHOUR | &quot;advertisedHour&quot; |
| DAYSDIFFERENCE | &quot;daysDifference&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| LINEITEMID | &quot;lineItemId&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| ADVERTISEDPRODUCTID | &quot;advertisedProductId&quot; |
| ADVERTISEDPRODUCTGTIN | &quot;advertisedProductGtin&quot; |
| ADVERTISEDPRODUCTMPN | &quot;advertisedProductMpn&quot; |
| ADVERTISEDPRODUCTNAME | &quot;advertisedProductName&quot; |
| ADVERTISEDPRODUCTCATEGORY | &quot;advertisedProductCategory&quot; |
| PURCHASEDPRODUCTID | &quot;purchasedProductId&quot; |
| PURCHASEDPRODUCTGTIN | &quot;purchasedProductGtin&quot; |
| PURCHASEDPRODUCTMPN | &quot;purchasedProductMpn&quot; |
| PURCHASEDPRODUCTNAME | &quot;purchasedProductName&quot; |
| PURCHASEDPRODUCTCATEGORY | &quot;purchasedProductCategory&quot; |
| ADVERTISEDENGAGEMENT | &quot;advertisedEngagement&quot; |
| ADVERTISEDTOPURCHASEDPRODUCTRELATIONSHIP | &quot;advertisedToPurchasedProductRelationship&quot; |
| SALESCHANNEL | &quot;salesChannel&quot; |
| RETAILERID | &quot;retailerId&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| PAGETYPE | &quot;pageType&quot; |
| KEYWORD | &quot;keyword&quot; |
| ATTRIBUTIONWINDOW | &quot;attributionWindow&quot; |
| SALESELLERID | &quot;saleSellerId&quot; |
| SALESELLERNAME | &quot;saleSellerName&quot; |
| ACTIVITYSELLERID | &quot;activitySellerId&quot; |
| ACTIVITYSELLERNAME | &quot;activitySellerName&quot; |



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
| ATTRIBUTEDUNITS | &quot;attributedUnits&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _1D | &quot;1D&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



