

# PlacementsReportQueryMessage

This is the message defining the query for Placements report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adsetIds** | **String** | The comma-separated list of adSet ids. |  [optional] |
|**advertiserIds** | **String** | The comma-separated list of advertiser ids. |  |
|**campaignIds** | **String** | The comma-separated list of campaign ids. |  [optional] |
|**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). |  |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The dimensions for the report. |  |
|**disclosed** | **Boolean** | Returns disclosed or undisclosed placements. |  [optional] |
|**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**environment** | **String** | Type of environment: Web, Android or iOS. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | The file format of the generated report |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | The list of metrics to report. |  |
|**placement** | **String** | Filter the value of the placement |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional] |



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



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;csv&quot; |
| EXCEL | &quot;excel&quot; |
| XML | &quot;xml&quot; |
| JSON | &quot;json&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| CLICKS | &quot;Clicks&quot; |
| DISPLAYS | &quot;Displays&quot; |
| COST | &quot;Cost&quot; |
| SALESPC30D | &quot;SalesPc30d&quot; |
| REVENUEPC30D | &quot;RevenuePc30d&quot; |
| COSPC30D | &quot;CosPc30d&quot; |
| ROASPC30D | &quot;RoasPc30d&quot; |
| CPOPC30D | &quot;CpoPc30d&quot; |
| CVRPC30D | &quot;CvrPc30d&quot; |
| SALESPV1D | &quot;SalesPv1d&quot; |
| REVENUEPV1D | &quot;RevenuePv1d&quot; |
| COSPV1D | &quot;CosPv1d&quot; |
| ROASPV1D | &quot;RoasPv1d&quot; |
| CPOPV1D | &quot;CpoPv1d&quot; |
| CVRPV1D | &quot;CvrPv1d&quot; |



