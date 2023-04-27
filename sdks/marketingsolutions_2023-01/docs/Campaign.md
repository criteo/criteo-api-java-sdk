

# Campaign

campaign read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the campaign |  [optional] |
|**advertiserId** | **String** | Advertiser id of the campaign |  [optional] |
|**objective** | **String** | Campaign&#39;s marketing objective |  [optional] |
|**spendLimit** | [**CampaignSpendLimit**](CampaignSpendLimit.md) |  |  [optional] |
|**goal** | [**GoalEnum**](#GoalEnum) | Goal of the campaign |  [optional] |



## Enum: GoalEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;Unspecified&quot; |
| ACQUISITION | &quot;Acquisition&quot; |
| RETENTION | &quot;Retention&quot; |



