

# CampaignV23Q1

campaign read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** |  |  [optional] |
|**budgetAutomation** | [**CampaignBudgetAutomationV23Q1**](CampaignBudgetAutomationV23Q1.md) |  |  [optional] |
|**goal** | [**GoalEnum**](#GoalEnum) |  |  [optional] |
|**id** | **String** | Id of the entity (duplicate of the parent id). |  [optional] |
|**name** | **String** |  |  [optional] |
|**spendLimit** | [**CampaignSpendLimitV23Q1**](CampaignSpendLimitV23Q1.md) |  |  [optional] |



## Enum: GoalEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;unspecified&quot; |
| ACQUISITION | &quot;acquisition&quot; |
| RETENTION | &quot;retention&quot; |



