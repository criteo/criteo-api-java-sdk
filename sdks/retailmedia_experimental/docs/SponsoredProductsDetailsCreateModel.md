

# SponsoredProductsDetailsCreateModel

Settings that apply only to a SponsoredProducts campaign. Sending this node on a campaign of  another type is refused.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**budget** | [**SponsoredProductsBudgetCreateModel**](SponsoredProductsBudgetCreateModel.md) |  |  [optional] |
|**objective** | [**ObjectiveEnum**](#ObjectiveEnum) | Defaults to manual when omitted. |  [optional] |



## Enum: ObjectiveEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;Manual&quot; |
| CLICKS | &quot;Clicks&quot; |
| CONVERSION | &quot;Conversion&quot; |
| REVENUE | &quot;Revenue&quot; |



