

# LineItemPacing

Represents the pacing configuration for a line item in an auction display.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pacingAmount** | **Double** | The daily budget cap amount. Only present when PacingType is DailyBudgetCap. |  [optional] |
|**pacingType** | [**PacingTypeEnum**](#PacingTypeEnum) | The pacing type. |  |



## Enum: PacingTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| EVEN | &quot;even&quot; |
| AHEAD | &quot;ahead&quot; |
| ASSOONASPOSSIBLE | &quot;asSoonAsPossible&quot; |
| DAILYBUDGETCAP | &quot;dailyBudgetCap&quot; |



