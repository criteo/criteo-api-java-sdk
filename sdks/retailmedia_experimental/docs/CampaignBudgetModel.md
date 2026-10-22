

# CampaignBudgetModel

Financial intent of a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Total the campaign may spend over its flight. Null when the campaign is uncapped. |  [optional] |
|**cappings** | [**List&lt;BudgetCappingModel&gt;**](BudgetCappingModel.md) | Per-period ceilings. Only capped periods are reported. |  [optional] |
|**memo** | **String** | Note recorded with the latest budget change. |  [optional] |
|**pacing** | [**PacingModel**](PacingModel.md) |  |  [optional] |
|**remaining** | **Double** | Amount left under the cap. Null when the campaign is uncapped. |  [optional] |
|**spent** | **Double** | Amount spent so far. |  [optional] |



