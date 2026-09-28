

# ProductReportJob

This is the message defining the query for the MPO product report (async export).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adSetIds** | **List&lt;String&gt;** | The list of ad set ids. Maximum 10. |  [optional] |
|**advertiserIds** | **List&lt;String&gt;** | The list of advertiser account IDs. Maximum 5, numeric. |  |
|**campaignIds** | **List&lt;String&gt;** | The list of marketing campaign ids. Maximum 10. |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The dimensions of the report. If not included, the default list of dimensions will be used. |  [optional] |
|**endDate** | **OffsetDateTime** | End of the reporting interval. ISO 8601 date-time (UTC). Defaults to the last complete day. |  [optional] |
|**fileFormat** | **String** | The output file format. Supported: csv, json. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | The list of metrics to report. If not included, the default list of metrics will be used. |  [optional] |
|**startDate** | **OffsetDateTime** | Start of the reporting interval. ISO 8601 date-time (UTC). |  |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| ADVERTISERID | &quot;advertiserId&quot; |
| PARTNERID | &quot;partnerId&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| ADSETID | &quot;adSetId&quot; |
| SELLERID | &quot;sellerId&quot; |
| PRODUCTID | &quot;productId&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| CLICKS | &quot;clicks&quot; |
| IMPRESSIONS | &quot;impressions&quot; |
| COST | &quot;cost&quot; |



