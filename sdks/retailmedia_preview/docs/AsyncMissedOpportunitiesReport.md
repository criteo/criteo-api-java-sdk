

# AsyncMissedOpportunitiesReport

Create payload attributes for a missed-opportunities async report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | Required output grouping fields. Empty array means no grouping fields. At least one of dimensions or metrics must be non-empty. |  |
|**endDate** | **LocalDate** | Required inclusive report end date in YYYY-MM-DD format. Must be greater than or equal to startDate. |  |
|**filters** | [**MissedOpportunitiesReportFilters**](MissedOpportunitiesReportFilters.md) |  |  |
|**format** | [**FormatEnum**](#FormatEnum) | Output format. If omitted, json-compact is used. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | Required output measure fields. Empty array means no measure fields. At least one of dimensions or metrics must be non-empty. |  |
|**startDate** | **LocalDate** | Required inclusive report start date in YYYY-MM-DD format. |  |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| LINEITEMID | &quot;lineItemId&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| RETAILERID | &quot;retailerId&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| BUYTYPE | &quot;buyType&quot; |
| BIDSTRATEGY | &quot;bidStrategy&quot; |



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
| DAYPARTINGSCHEDULED | &quot;daypartingScheduled&quot; |
| TOTALSPEND | &quot;totalSpend&quot; |
| ROAS | &quot;roas&quot; |
| CAPOUTHOUR | &quot;capoutHour&quot; |
| ATTRIBUTEDSALES | &quot;attributedSales&quot; |
| IMPRESSIONS | &quot;impressions&quot; |
| CLICKS | &quot;clicks&quot; |
| CPC | &quot;cpc&quot; |
| CPM | &quot;cpm&quot; |
| CTR | &quot;ctr&quot; |
| MISSEDTRAFFIC | &quot;missedTraffic&quot; |
| MISSEDSPEND | &quot;missedSpend&quot; |
| MISSEDCLICKS | &quot;missedClicks&quot; |
| MISSEDIMPRESSIONS | &quot;missedImpressions&quot; |
| MISSEDSALES | &quot;missedSales&quot; |



