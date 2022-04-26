

# GenerateTopProductsReportRequestAttributes

This is the message defining the query for TopProducts report

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional]
**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. | 
**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. | 
**advertiserId** | **String** | The client id. | 
**limit** | **Integer** | The maximum number of top products returned. |  [optional]
**rankProductsBy** | [**RankProductsByEnum**](#RankProductsByEnum) | The metric used to filter the top products. | 
**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | The dimensions for the report. |  [optional]
**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | The list of metrics to report. |  [optional]
**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). |  [optional]
**brands** | **List&lt;String&gt;** | The list of brands names. |  [optional]
**categoryIds** | **List&lt;String&gt;** | The list of category ids. |  [optional]
**campaignIds** | **List&lt;String&gt;** | The list of campaign ids. |  [optional]
**adSetIds** | **List&lt;String&gt;** | The list of adSet ids. |  [optional]
**adSetStatus** | **List&lt;String&gt;** | The list of adSet status (ex: &#39;Active&#39;,&#39;NotRunning&#39;). |  [optional]



## Enum: RankProductsByEnum

Name | Value
---- | -----
CLICKS | &quot;Clicks&quot;
DISPLAYS | &quot;Displays&quot;
SALES | &quot;Sales&quot;



## Enum: List&lt;DimensionsEnum&gt;

Name | Value
---- | -----
CAMPAIGN | &quot;Campaign&quot;
CAMPAIGNID | &quot;CampaignId&quot;
ADSET | &quot;AdSet&quot;
ADSETID | &quot;AdSetId&quot;
PRODUCT | &quot;Product&quot;
PRODUCTID | &quot;ProductId&quot;
CATEGORY | &quot;Category&quot;
CATEGORYID | &quot;CategoryId&quot;
ADVERTISER | &quot;Advertiser&quot;
ADVERTISERID | &quot;AdvertiserId&quot;
PRODUCTURL | &quot;ProductUrl&quot;
BRAND | &quot;Brand&quot;



## Enum: List&lt;MetricsEnum&gt;

Name | Value
---- | -----
CLICKS | &quot;Clicks&quot;
CTR | &quot;Ctr&quot;
VISITS | &quot;Visits&quot;
SALES | &quot;Sales&quot;
COST | &quot;Cost&quot;
REVENUE | &quot;Revenue&quot;
DISPLAYS | &quot;Displays&quot;



