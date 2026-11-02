

# CampaignV27Q1

Campaign read model                The {id} field is the campaign identifier (string-encoded integer).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** | Advertiser id of the campaign (string-encoded integer) |  [optional] |
|**budgetAutomation** | [**CampaignBudgetAutomationV27Q1**](CampaignBudgetAutomationV27Q1.md) |  |  [optional] |
|**goal** | [**GoalEnum**](#GoalEnum) | Goal of the campaign                Serialized values are {unspecified}, {acquisition} and {retention}.                Acquisition and retention are defined as follows:  - Acquisition: campaign with the goal of acquiring new customers. The success of an acquisition campaign is measured by the number of new customers it brings.  - Retention: campaign with the goal of retaining existing customers. The success of a retention campaign is measured by the number of existing customers it retains. |  [optional] |
|**name** | **String** | Name of the campaign |  [optional] |
|**scheduledSpendLimits** | [**List&lt;CampaignScheduledSpendLimitV27Q1&gt;**](CampaignScheduledSpendLimitV27Q1.md) | Spend limits scheduled to become active in the future. Empty when the campaign has no scheduled spend limits. |  [optional] |
|**sellerId** | **String** | Optional marketplace seller id of the campaign (string-encoded long) |  [optional] |
|**spendLimit** | [**CampaignSpendLimitV27Q1**](CampaignSpendLimitV27Q1.md) |  |  [optional] |



## Enum: GoalEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;unspecified&quot; |
| ACQUISITION | &quot;acquisition&quot; |
| RETENTION | &quot;retention&quot; |



