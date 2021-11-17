

# StatisticsReportQueryMessage

This is the message defining the query for Adset report

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **String** | The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used |  [optional]
**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The dimensions for the report. | 
**metrics** | **List&lt;String&gt;** | The list of metrics to report. | 
**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). | 
**format** | **String** | The file format of the generated report: csv, xml, excel or json. | 
**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional]
**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. | 
**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. | 



## Enum: List&lt;DimensionsEnum&gt;

Name | Value
---- | -----
ADSETID | &quot;AdsetId&quot;
ADSET | &quot;Adset&quot;
ADVERTISERID | &quot;AdvertiserId&quot;
ADVERTISER | &quot;Advertiser&quot;
CATEGORYID | &quot;CategoryId&quot;
CATEGORY | &quot;Category&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
WEEK | &quot;Week&quot;
MONTH | &quot;Month&quot;
YEAR | &quot;Year&quot;
OS | &quot;Os&quot;
DEVICE | &quot;Device&quot;



