

# PatchCampaignV27Q1

Campaign patch model.  The campaign identifier is provided in the resource {id} field (string-encoded integer) and is required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**budgetAutomation** | [**PatchMarketingCampaignBudgetAutomationV27Q1**](PatchMarketingCampaignBudgetAutomationV27Q1.md) |  |  [optional] |
|**name** | **String** | New name of the campaign. Omit to leave unchanged. Must not be empty when provided. |  [optional] |
|**scheduledSpendLimit** | [**PatchCampaignScheduledSpendLimitV27Q1**](PatchCampaignScheduledSpendLimitV27Q1.md) |  |  [optional] |
|**spendLimit** | [**PatchCampaignSpendLimitV27Q1**](PatchCampaignSpendLimitV27Q1.md) |  |  [optional] |



