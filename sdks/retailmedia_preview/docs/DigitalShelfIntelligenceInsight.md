

# DigitalShelfIntelligenceInsight

Parameters of a Digital Shelf Intelligence insight.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID the insight report is generated for. |  |
|**aggregationLevel** | [**AggregationLevelEnum**](#AggregationLevelEnum) | Aggregation level of the report. Allowed values: &#x60;brand&#x60;, &#x60;sku&#x60;. |  |
|**endDate** | **String** | End date of the report (inclusive), in ISO 8601 format (YYYY-MM-DD).  Adjusted to the Sunday of the week containing the provided date. |  |
|**filters** | [**DigitalShelfIntelligenceFilters**](DigitalShelfIntelligenceFilters.md) |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Output format of the report. Allowed values: &#x60;json&#x60;, &#x60;json-compact&#x60;, &#x60;json-newline&#x60;, &#x60;csv&#x60;. Defaults to &#x60;json-compact&#x60;. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | Metrics to report on. |  |
|**startDate** | **String** | Start date of the report (inclusive), in ISO 8601 format (YYYY-MM-DD).  Adjusted to the Monday of the week containing the provided date. |  |



## Enum: AggregationLevelEnum

| Name | Value |
|---- | -----|
| BRAND | &quot;brand&quot; |
| SKU | &quot;sku&quot; |



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
| CONSIDERATIONINDEX | &quot;considerationIndex&quot; |
| LISTINGPRICE | &quot;listingPrice&quot; |
| PDPVIEWRANK | &quot;pdpViewRank&quot; |
| SALESINDEX | &quot;salesIndex&quot; |
| SALESRANK | &quot;salesRank&quot; |
| TOTALPDPPAGEVIEWS | &quot;totalPdpPageViews&quot; |
| TOTALSALESONLINE | &quot;totalSalesOnline&quot; |
| TOTALSOLDUNITSONLINE | &quot;totalSoldUnitsOnline&quot; |



