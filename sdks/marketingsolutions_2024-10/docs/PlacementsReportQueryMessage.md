

# PlacementsReportQueryMessage

This is the message defining the query for Placements report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserIds** | **String** | The comma-separated list of advertiser ids. |  |
|**campaignIds** | **String** | The comma-separated list of campaign ids. |  [optional] |
|**adsetIds** | **String** | The comma-separated list of adSet ids. |  [optional] |
|**environment** | **String** | Type of environment: Web, Android or iOS. |  [optional] |
|**placement** | **String** | Filter the value of the placement |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The dimensions for the report. |  |
|**metrics** | **List&lt;String&gt;** | The list of metrics to report. |  |
|**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). |  |
|**disclosed** | **Boolean** | Returns disclosed or undisclosed placements. |  [optional] |
|**format** | **String** | The file format of the generated report: csv, xml, excel or json. |  |
|**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| ADSETID | &quot;AdsetId&quot; |
| ADVERTISERID | &quot;AdvertiserId&quot; |
| PLACEMENT | &quot;Placement&quot; |
| ENVIRONMENT | &quot;Environment&quot; |
| ADSETNAME | &quot;AdsetName&quot; |
| ADVERTISERNAME | &quot;AdvertiserName&quot; |
| CAMPAIGNID | &quot;CampaignId&quot; |
| CAMPAIGNNAME | &quot;CampaignName&quot; |
| ADCHANNEL | &quot;AdChannel&quot; |
| SOCIALPLATFORM | &quot;SocialPlatform&quot; |
| CATEGORYID | &quot;CategoryId&quot; |
| CATEGORYNAME | &quot;CategoryName&quot; |



