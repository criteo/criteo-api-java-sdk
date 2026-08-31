

# ProductCategoryFilterV1

Filter that matches when a product category (identified by its id and level) is among the provided values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Comparison operator for the product category filter |  [optional] |
|**values** | [**List&lt;ProductCategoryV1&gt;**](ProductCategoryV1.md) | Product categories to compare against |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| EQUALS | &quot;Equals&quot; |
| IN | &quot;In&quot; |



