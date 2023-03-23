

# GenerateCreativesReportRequestAttributes

This is the message defining the query for Creatives report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**advertiserIds** | **List&lt;String&gt;** | The list of client ids. |  |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | The list of metrics to report. |  |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The list of dimensions to report. |  |
|**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional] |
|**adFormats** | **List&lt;String&gt;** | The list of adFormats. |  [optional] |
|**displaySizes** | **List&lt;String&gt;** | The list of displaySizes. |  [optional] |
|**couponNames** | **List&lt;String&gt;** | The list of coupon names. |  [optional] |
|**couponIds** | **List&lt;String&gt;** | The list of coupon ids. |  [optional] |
|**adNames** | **List&lt;String&gt;** | The list of ad names. |  [optional] |
|**adIds** | **List&lt;String&gt;** | The list of ad ids. |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | The list of campaign ids (marketing campaign ids). |  [optional] |
|**adSetIds** | **List&lt;String&gt;** | The list of adSet ids (campaign ids). |  [optional] |
|**adSetStatus** | **List&lt;String&gt;** | The list of adSet status (ex: &#39;Active&#39;,&#39;NotRunning&#39;). |  [optional] |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| CLICKS | &quot;Clicks&quot; |
| CTR | &quot;Ctr&quot; |
| DISPLAYS | &quot;Displays&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| ADFORMAT | &quot;AdFormat&quot; |
| COUPON | &quot;Coupon&quot; |
| COUPONID | &quot;CouponId&quot; |
| DISPLAYSIZE | &quot;DisplaySize&quot; |
| SIZECATEGORY | &quot;SizeCategory&quot; |
| AD | &quot;Ad&quot; |
| ADID | &quot;AdId&quot; |
| DAY | &quot;Day&quot; |
| HOUR | &quot;Hour&quot; |



