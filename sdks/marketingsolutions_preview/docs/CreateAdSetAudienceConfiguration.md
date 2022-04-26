

# CreateAdSetAudienceConfiguration

ad set audience create model

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minDaysSinceLastVisit** | **Integer** | The minimum days since last visit on the advertiser web site for being part of this audience, if not null |  [optional]
**maxDaysSinceLastVisit** | **Integer** | The maximum days since last visit on the advertiser web site for being part of this audience, if not null |  [optional]
**excludedAudienceIds** | **List&lt;String&gt;** | The list of audience ids that define who CANNOT be targeted by the ad set. So far, only contact list are supported here |  [optional]
**audienceWebsiteVisitor** | [**AudienceWebsiteVisitor**](AudienceWebsiteVisitor.md) |  |  [optional]
**audienceCustom** | [**AudienceCustom**](AudienceCustom.md) |  |  [optional]



