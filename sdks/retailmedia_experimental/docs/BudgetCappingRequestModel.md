

# BudgetCappingRequestModel

A ceiling on what a campaign may spend within one period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Ceiling for the period. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Period the ceiling applies to. Each period may appear at most once on a budget. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;Daily&quot; |
| MONTHLY | &quot;Monthly&quot; |



