

# CreateCampaign

Campaign create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** | Advertiser id this campaign belongs to |  |
|**budgetAutomation** | [**BudgetAutomation**](BudgetAutomation.md) |  |  [optional] |
|**goal** | [**GoalEnum**](#GoalEnum) | Goal for the marketing campaign |  |
|**name** | **String** | Name of the campaign |  |
|**spendLimit** | [**CreateCampaignSpendLimit**](CreateCampaignSpendLimit.md) |  |  |



## Enum: GoalEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;Unspecified&quot; |
| ACQUISITION | &quot;Acquisition&quot; |
| RETENTION | &quot;Retention&quot; |



