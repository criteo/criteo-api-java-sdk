

# CreateCampaign

Campaign create model

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the campaign |  [optional]
**advertiserId** | **String** | Advertiser id this campaign belongs to |  [optional]
**objective** | **String** | Campaign&#39;s marketing objective |  [optional]
**goal** | [**GoalEnum**](#GoalEnum) | Goal for the marketing campaign |  [optional]
**spendLimit** | [**CreateCampaignSpendLimit**](CreateCampaignSpendLimit.md) |  |  [optional]



## Enum: GoalEnum

Name | Value
---- | -----
UNSPECIFIED | &quot;Unspecified&quot;
ACQUISITION | &quot;Acquisition&quot;
RETENTION | &quot;Retention&quot;



