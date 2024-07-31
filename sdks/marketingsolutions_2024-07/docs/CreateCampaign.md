

# CreateCampaign

Campaign create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the campaign |  |
|**advertiserId** | **String** | Advertiser id this campaign belongs to |  |
|**goal** | [**GoalEnum**](#GoalEnum) | Goal for the marketing campaign |  |
|**spendLimit** | [**CreateCampaignSpendLimit**](CreateCampaignSpendLimit.md) |  |  |



## Enum: GoalEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;Unspecified&quot; |
| ACQUISITION | &quot;Acquisition&quot; |
| RETENTION | &quot;Retention&quot; |



