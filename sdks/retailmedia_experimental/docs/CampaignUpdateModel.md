

# CampaignUpdateModel

Fields of a campaign that may be changed after creation.  Omitted fields remain unchanged; nullable wrappers distinguish omission from an explicit null.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionSettings** | [**AttributionSettingsUpdateModel**](AttributionSettingsUpdateModel.md) |  |  [optional] |
|**budgetDetails** | [**BudgetDetailsUpdateModel**](BudgetDetailsUpdateModel.md) |  |  [optional] |
|**companyName** | [**StringNillableV2**](StringNillableV2.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) |  |  [optional] |
|**onBehalfCompanyName** | [**StringNillableV2**](StringNillableV2.md) |  |  [optional] |
|**scheduleDetails** | [**ScheduleDetailsUpdateModel**](ScheduleDetailsUpdateModel.md) |  |  [optional] |



## Enum: ObjectiveEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;Manual&quot; |
| CLICKS | &quot;Clicks&quot; |
| CONVERSION | &quot;Conversion&quot; |
| REVENUE | &quot;Revenue&quot; |
| IMPRESSIONS | &quot;Impressions&quot; |



