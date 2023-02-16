

# ExportColumn

Description of a column from an async report request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**relatedTo** | [**RelatedToEnum**](#RelatedToEnum) |  |  [optional]
**timezone** | **String** |  |  [optional]
**duration** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**deprecated** | **Boolean** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BOOLEAN | &quot;Boolean&quot;
NUMBER | &quot;Number&quot;
MONEY | &quot;Money&quot;
STRING | &quot;String&quot;
DATE | &quot;Date&quot;
DATETIME | &quot;DateTime&quot;
INTERVAL | &quot;Interval&quot;
DURATION | &quot;Duration&quot;



## Enum: RoleEnum

Name | Value
---- | -----
DIMENSION | &quot;Dimension&quot;
PROPERTY | &quot;Property&quot;
INTERVAL | &quot;Interval&quot;
METRIC | &quot;Metric&quot;



## Enum: RelatedToEnum

Name | Value
---- | -----
ADSETID | &quot;AdSetId&quot;
ADSET | &quot;AdSet&quot;
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
CAMPAIGNID | &quot;CampaignId&quot;
CAMPAIGN | &quot;Campaign&quot;
ADID | &quot;AdId&quot;
AD | &quot;Ad&quot;
COUPONID | &quot;CouponId&quot;
COUPON | &quot;Coupon&quot;
CHANNELID | &quot;ChannelId&quot;
CHANNEL | &quot;Channel&quot;
VIDEOPLACEMENT | &quot;VideoPlacement&quot;
MARKETINGCAMPAIGNGOAL | &quot;MarketingCampaignGoal&quot;
MARKETINGOBJECTIVE | &quot;MarketingObjective&quot;
MARKETINGOBJECTIVEID | &quot;MarketingObjectiveId&quot;
VIDEOPLAYERSIZE | &quot;VideoPlayerSize&quot;
VIDEOPLAYBACKMETHOD | &quot;VideoPlaybackMethod&quot;
SSP | &quot;SSP&quot;
VIDEODURATIONINSECONDS | &quot;VideoDurationInSeconds&quot;
MEDIATYPE | &quot;MediaType&quot;
ADFORMAT | &quot;AdFormat&quot;
DISPLAYSIZE | &quot;DisplaySize&quot;
VIDEOPLAYERRATIO | &quot;VideoPlayerRatio&quot;



