

# SellerReportRequest

Filters and options used to generate a synchronous seller performance report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adSetIds** | **List&lt;String&gt;** | Restricts the report to the specified ad sets. If omitted, all ad sets in scope are included.  Up to 10 ad set identifiers can be supplied. |  [optional] |
|**advertiserId** | **String** | Identifier of the advertiser for which the report is generated. |  |
|**campaignIds** | **List&lt;String&gt;** | Restricts the report to the specified marketing campaigns. If omitted, all campaigns in scope are included.  Up to 10 campaign identifiers can be supplied. |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | Dimensions used to group the report. At least one dimension is required. |  |
|**endDate** | **LocalDate** | Inclusive end date of the reporting period, formatted as yyyy-MM-dd. |  |
|**format** | [**FormatEnum**](#FormatEnum) | Output format. Defaults to JSON. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | Metrics returned for each dimension combination. At least one metric is required. |  |
|**sellerIds** | **List&lt;String&gt;** | Restricts the report to the specified sellers. If omitted, all sellers in scope are included.  Up to 10 seller identifiers can be supplied. |  [optional] |
|**startDate** | **LocalDate** | Inclusive start date of the reporting period, formatted as yyyy-MM-dd. |  |
|**timezone** | **String** | IANA time zone used for time-based aggregation. Defaults to UTC. |  [optional] |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| CAMPAIGNID | &quot;campaignId&quot; |
| ADSETID | &quot;adSetId&quot; |
| SELLERID | &quot;sellerId&quot; |
| HOUR | &quot;hour&quot; |
| DAY | &quot;day&quot; |
| MONTH | &quot;month&quot; |
| YEAR | &quot;year&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| CSV | &quot;csv&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| IMPRESSIONS | &quot;impressions&quot; |
| CLICKS | &quot;clicks&quot; |
| COST | &quot;cost&quot; |
| SELLERVISITS | &quot;sellerVisits&quot; |
| SELLERUNIQUEUSERS | &quot;sellerUniqueUsers&quot; |
| SALEUNITSPC1DSAMESELLER | &quot;saleUnitsPc1dSameSeller&quot; |
| SALEUNITSPC1DANYSELLER | &quot;saleUnitsPc1dAnySeller&quot; |
| SALEUNITSPC7DSAMESELLER | &quot;saleUnitsPc7dSameSeller&quot; |
| SALEUNITSPC7DANYSELLER | &quot;saleUnitsPc7dAnySeller&quot; |
| SALEUNITSPC30DSAMESELLER | &quot;saleUnitsPc30dSameSeller&quot; |
| SALEUNITSPC30DANYSELLER | &quot;saleUnitsPc30dAnySeller&quot; |
| SALEUNITSPC1DPV1DSAMESELLER | &quot;saleUnitsPc1dPv1dSameSeller&quot; |
| SALEUNITSPC1DPV1DANYSELLER | &quot;saleUnitsPc1dPv1dAnySeller&quot; |
| SALEUNITSPC1DPV7DSAMESELLER | &quot;saleUnitsPc1dPv7dSameSeller&quot; |
| SALEUNITSPC1DPV7DANYSELLER | &quot;saleUnitsPc1dPv7dAnySeller&quot; |
| SALEUNITSPC7DPV1DSAMESELLER | &quot;saleUnitsPc7dPv1dSameSeller&quot; |
| SALEUNITSPC7DPV1DANYSELLER | &quot;saleUnitsPc7dPv1dAnySeller&quot; |
| SALEUNITSPC7DPV7DSAMESELLER | &quot;saleUnitsPc7dPv7dSameSeller&quot; |
| SALEUNITSPC7DPV7DANYSELLER | &quot;saleUnitsPc7dPv7dAnySeller&quot; |
| SALEUNITSPC30DPV1DSAMESELLER | &quot;saleUnitsPc30dPv1dSameSeller&quot; |
| SALEUNITSPC30DPV1DANYSELLER | &quot;saleUnitsPc30dPv1dAnySeller&quot; |
| SALEUNITSPC30DPV7DSAMESELLER | &quot;saleUnitsPc30dPv7dSameSeller&quot; |
| SALEUNITSPC30DPV7DANYSELLER | &quot;saleUnitsPc30dPv7dAnySeller&quot; |
| REVENUEPC1DSAMESELLER | &quot;revenuePc1dSameSeller&quot; |
| REVENUEPC1DANYSELLER | &quot;revenuePc1dAnySeller&quot; |
| REVENUEPC7DSAMESELLER | &quot;revenuePc7dSameSeller&quot; |
| REVENUEPC7DANYSELLER | &quot;revenuePc7dAnySeller&quot; |
| REVENUEPC30DSAMESELLER | &quot;revenuePc30dSameSeller&quot; |
| REVENUEPC30DANYSELLER | &quot;revenuePc30dAnySeller&quot; |
| REVENUEPC1DPV1DSAMESELLER | &quot;revenuePc1dPv1dSameSeller&quot; |
| REVENUEPC1DPV1DANYSELLER | &quot;revenuePc1dPv1dAnySeller&quot; |
| REVENUEPC1DPV7DSAMESELLER | &quot;revenuePc1dPv7dSameSeller&quot; |
| REVENUEPC1DPV7DANYSELLER | &quot;revenuePc1dPv7dAnySeller&quot; |
| REVENUEPC7DPV1DSAMESELLER | &quot;revenuePc7dPv1dSameSeller&quot; |
| REVENUEPC7DPV1DANYSELLER | &quot;revenuePc7dPv1dAnySeller&quot; |
| REVENUEPC7DPV7DSAMESELLER | &quot;revenuePc7dPv7dSameSeller&quot; |
| REVENUEPC7DPV7DANYSELLER | &quot;revenuePc7dPv7dAnySeller&quot; |
| REVENUEPC30DPV1DSAMESELLER | &quot;revenuePc30dPv1dSameSeller&quot; |
| REVENUEPC30DPV1DANYSELLER | &quot;revenuePc30dPv1dAnySeller&quot; |
| REVENUEPC30DPV7DSAMESELLER | &quot;revenuePc30dPv7dSameSeller&quot; |
| REVENUEPC30DPV7DANYSELLER | &quot;revenuePc30dPv7dAnySeller&quot; |
| CRPC1DSAMESELLER | &quot;crPc1dSameSeller&quot; |
| CRPC1DANYSELLER | &quot;crPc1dAnySeller&quot; |
| CRPC7DSAMESELLER | &quot;crPc7dSameSeller&quot; |
| CRPC7DANYSELLER | &quot;crPc7dAnySeller&quot; |
| CRPC30DSAMESELLER | &quot;crPc30dSameSeller&quot; |
| CRPC30DANYSELLER | &quot;crPc30dAnySeller&quot; |
| CRPC1DPV1DSAMESELLER | &quot;crPc1dPv1dSameSeller&quot; |
| CRPC1DPV1DANYSELLER | &quot;crPc1dPv1dAnySeller&quot; |
| CRPC1DPV7DSAMESELLER | &quot;crPc1dPv7dSameSeller&quot; |
| CRPC1DPV7DANYSELLER | &quot;crPc1dPv7dAnySeller&quot; |
| CRPC7DPV1DSAMESELLER | &quot;crPc7dPv1dSameSeller&quot; |
| CRPC7DPV1DANYSELLER | &quot;crPc7dPv1dAnySeller&quot; |
| CRPC7DPV7DSAMESELLER | &quot;crPc7dPv7dSameSeller&quot; |
| CRPC7DPV7DANYSELLER | &quot;crPc7dPv7dAnySeller&quot; |
| CRPC30DPV1DSAMESELLER | &quot;crPc30dPv1dSameSeller&quot; |
| CRPC30DPV1DANYSELLER | &quot;crPc30dPv1dAnySeller&quot; |
| CRPC30DPV7DSAMESELLER | &quot;crPc30dPv7dSameSeller&quot; |
| CRPC30DPV7DANYSELLER | &quot;crPc30dPv7dAnySeller&quot; |
| CPOPC1DSAMESELLER | &quot;cpoPc1dSameSeller&quot; |
| CPOPC1DANYSELLER | &quot;cpoPc1dAnySeller&quot; |
| CPOPC7DSAMESELLER | &quot;cpoPc7dSameSeller&quot; |
| CPOPC7DANYSELLER | &quot;cpoPc7dAnySeller&quot; |
| CPOPC30DSAMESELLER | &quot;cpoPc30dSameSeller&quot; |
| CPOPC30DANYSELLER | &quot;cpoPc30dAnySeller&quot; |
| CPOPC1DPV1DSAMESELLER | &quot;cpoPc1dPv1dSameSeller&quot; |
| CPOPC1DPV1DANYSELLER | &quot;cpoPc1dPv1dAnySeller&quot; |
| CPOPC1DPV7DSAMESELLER | &quot;cpoPc1dPv7dSameSeller&quot; |
| CPOPC1DPV7DANYSELLER | &quot;cpoPc1dPv7dAnySeller&quot; |
| CPOPC7DPV1DSAMESELLER | &quot;cpoPc7dPv1dSameSeller&quot; |
| CPOPC7DPV1DANYSELLER | &quot;cpoPc7dPv1dAnySeller&quot; |
| CPOPC7DPV7DSAMESELLER | &quot;cpoPc7dPv7dSameSeller&quot; |
| CPOPC7DPV7DANYSELLER | &quot;cpoPc7dPv7dAnySeller&quot; |
| CPOPC30DPV1DSAMESELLER | &quot;cpoPc30dPv1dSameSeller&quot; |
| CPOPC30DPV1DANYSELLER | &quot;cpoPc30dPv1dAnySeller&quot; |
| CPOPC30DPV7DSAMESELLER | &quot;cpoPc30dPv7dSameSeller&quot; |
| CPOPC30DPV7DANYSELLER | &quot;cpoPc30dPv7dAnySeller&quot; |
| COSPC1DSAMESELLER | &quot;cosPc1dSameSeller&quot; |
| COSPC1DANYSELLER | &quot;cosPc1dAnySeller&quot; |
| COSPC7DSAMESELLER | &quot;cosPc7dSameSeller&quot; |
| COSPC7DANYSELLER | &quot;cosPc7dAnySeller&quot; |
| COSPC30DSAMESELLER | &quot;cosPc30dSameSeller&quot; |
| COSPC30DANYSELLER | &quot;cosPc30dAnySeller&quot; |
| COSPC1DPV1DSAMESELLER | &quot;cosPc1dPv1dSameSeller&quot; |
| COSPC1DPV1DANYSELLER | &quot;cosPc1dPv1dAnySeller&quot; |
| COSPC1DPV7DSAMESELLER | &quot;cosPc1dPv7dSameSeller&quot; |
| COSPC1DPV7DANYSELLER | &quot;cosPc1dPv7dAnySeller&quot; |
| COSPC7DPV1DSAMESELLER | &quot;cosPc7dPv1dSameSeller&quot; |
| COSPC7DPV1DANYSELLER | &quot;cosPc7dPv1dAnySeller&quot; |
| COSPC7DPV7DSAMESELLER | &quot;cosPc7dPv7dSameSeller&quot; |
| COSPC7DPV7DANYSELLER | &quot;cosPc7dPv7dAnySeller&quot; |
| COSPC30DPV1DSAMESELLER | &quot;cosPc30dPv1dSameSeller&quot; |
| COSPC30DPV1DANYSELLER | &quot;cosPc30dPv1dAnySeller&quot; |
| COSPC30DPV7DSAMESELLER | &quot;cosPc30dPv7dSameSeller&quot; |
| COSPC30DPV7DANYSELLER | &quot;cosPc30dPv7dAnySeller&quot; |
| ROASPC1DSAMESELLER | &quot;roasPc1dSameSeller&quot; |
| ROASPC1DANYSELLER | &quot;roasPc1dAnySeller&quot; |
| ROASPC7DSAMESELLER | &quot;roasPc7dSameSeller&quot; |
| ROASPC7DANYSELLER | &quot;roasPc7dAnySeller&quot; |
| ROASPC30DSAMESELLER | &quot;roasPc30dSameSeller&quot; |
| ROASPC30DANYSELLER | &quot;roasPc30dAnySeller&quot; |
| ROASPC1DPV1DSAMESELLER | &quot;roasPc1dPv1dSameSeller&quot; |
| ROASPC1DPV1DANYSELLER | &quot;roasPc1dPv1dAnySeller&quot; |
| ROASPC1DPV7DSAMESELLER | &quot;roasPc1dPv7dSameSeller&quot; |
| ROASPC1DPV7DANYSELLER | &quot;roasPc1dPv7dAnySeller&quot; |
| ROASPC7DPV1DSAMESELLER | &quot;roasPc7dPv1dSameSeller&quot; |
| ROASPC7DPV1DANYSELLER | &quot;roasPc7dPv1dAnySeller&quot; |
| ROASPC7DPV7DSAMESELLER | &quot;roasPc7dPv7dSameSeller&quot; |
| ROASPC7DPV7DANYSELLER | &quot;roasPc7dPv7dAnySeller&quot; |
| ROASPC30DPV1DSAMESELLER | &quot;roasPc30dPv1dSameSeller&quot; |
| ROASPC30DPV1DANYSELLER | &quot;roasPc30dPv1dAnySeller&quot; |
| ROASPC30DPV7DSAMESELLER | &quot;roasPc30dPv7dSameSeller&quot; |
| ROASPC30DPV7DANYSELLER | &quot;roasPc30dPv7dAnySeller&quot; |



