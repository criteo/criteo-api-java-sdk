

# Campaign

campaign read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**advertiserId** | **String** |  |  [optional] |
|**objective** | **String** |  |  [optional] |
|**spendLimit** | [**CampaignSpendLimit**](CampaignSpendLimit.md) |  |  [optional] |
|**goal** | [**GoalEnum**](#GoalEnum) |  |  [optional] |



## Enum: GoalEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;Unspecified&quot; |
| ACQUISITION | &quot;Acquisition&quot; |
| RETENTION | &quot;Retention&quot; |



