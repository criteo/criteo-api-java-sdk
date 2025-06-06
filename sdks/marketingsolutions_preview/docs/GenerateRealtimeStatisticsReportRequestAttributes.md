

# GenerateRealtimeStatisticsReportRequestAttributes

This is the message defining the query for Realtime report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adsetIds** | **List&lt;String&gt;** | List of adset ids to filter. |  [optional] |
|**advertiserIds** | **List&lt;String&gt;** | List of advertiser ids to report on. |  |
|**campaignIds** | **List&lt;String&gt;** | List of campaign ids to filter. |  [optional] |
|**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions for the report. |  [optional] |
|**lookbackWindow** | **Integer** | The number of hours to consider in the past. |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of metrics for the report. |  [optional] |
|**timezone** | **String** | The timezone used for the report. |  [optional] |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| ADVERTISER | &quot;Advertiser&quot; |
| ADVERTISERID | &quot;AdvertiserId&quot; |
| CAMPAIGN | &quot;Campaign&quot; |
| CAMPAIGNID | &quot;CampaignId&quot; |
| ADSET | &quot;Adset&quot; |
| ADSETID | &quot;AdsetId&quot; |
| YEAR | &quot;Year&quot; |
| MONTH | &quot;Month&quot; |
| WEEK | &quot;Week&quot; |
| DAY | &quot;Day&quot; |
| HOUR | &quot;Hour&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| CLICKS | &quot;Clicks&quot; |
| COST | &quot;Cost&quot; |
| DISPLAYS | &quot;Displays&quot; |



