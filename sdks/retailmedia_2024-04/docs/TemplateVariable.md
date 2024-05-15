

# TemplateVariable

A variable in a creative template

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the variable |  |
|**required** | **Boolean** | Whether the variable is required |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the variable |  |
|**choiceVariableSpecification** | [**ChoiceVariableSpecification**](ChoiceVariableSpecification.md) |  |  [optional] |
|**textVariableSpecification** | [**TextVariableSpecification**](TextVariableSpecification.md) |  |  [optional] |
|**filesVariablesSpecification** | [**FilesVariablesSpecification**](FilesVariablesSpecification.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;Text&quot; |
| CHOICE | &quot;Choice&quot; |
| COLOR | &quot;Color&quot; |
| FILES | &quot;Files&quot; |
| HYPERLINK | &quot;Hyperlink&quot; |



