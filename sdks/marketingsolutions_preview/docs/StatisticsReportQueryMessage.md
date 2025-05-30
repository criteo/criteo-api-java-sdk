

# StatisticsReportQueryMessage

This is the message defining the query for Adset report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adSetIds** | **List&lt;String&gt;** | list of adSets ids. If empty, all the adSets will be fetched |  [optional] |
|**adSetNames** | **List&lt;String&gt;** | list of adSets names. If empty, all the adSets will be fetched |  [optional] |
|**adSetStatus** | **List&lt;String&gt;** | list of adSets status. If empty, all the adSets will be fetched |  [optional] |
|**advertiserIds** | **String** | The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used |  [optional] |
|**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). |  |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The dimensions for the report. |  |
|**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**format** | **String** | The file format of the generated report: csv, xml, excel or json. |  |
|**metrics** | **List&lt;String&gt;** | The list of metrics to report. |  |
|**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional] |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| ADSETID | &quot;AdsetId&quot; |
| ADSET | &quot;Adset&quot; |
| ADVERTISERID | &quot;AdvertiserId&quot; |
| ADVERTISER | &quot;Advertiser&quot; |
| CATEGORYID | &quot;CategoryId&quot; |
| CATEGORY | &quot;Category&quot; |
| HOUR | &quot;Hour&quot; |
| DAY | &quot;Day&quot; |
| WEEK | &quot;Week&quot; |
| MONTH | &quot;Month&quot; |
| YEAR | &quot;Year&quot; |
| OS | &quot;Os&quot; |
| DEVICE | &quot;Device&quot; |
| CAMPAIGNID | &quot;CampaignId&quot; |
| CAMPAIGN | &quot;Campaign&quot; |
| ADID | &quot;AdId&quot; |
| AD | &quot;Ad&quot; |
| COUPONID | &quot;CouponId&quot; |
| COUPON | &quot;Coupon&quot; |
| MARKETINGOBJECTIVEID | &quot;MarketingObjectiveId&quot; |
| MARKETINGOBJECTIVE | &quot;MarketingObjective&quot; |
| CHANNELID | &quot;ChannelId&quot; |
| CHANNEL | &quot;Channel&quot; |
| GOAL | &quot;Goal&quot; |
| ADCHANNEL | &quot;AdChannel&quot; |
| SOCIALPLATFORM | &quot;SocialPlatform&quot; |



