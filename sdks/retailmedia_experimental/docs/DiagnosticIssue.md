

# DiagnosticIssue

A rule-based issue that affects line item servability.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** |  |  |
|**format** | **String** |  |  |
|**id** | **Integer** |  |  [optional] |
|**message** | **String** |  |  |
|**outputParameters** | **Map&lt;String, String&gt;** |  |  |
|**parentId** | **Integer** |  |  [optional] |
|**ruleId** | **String** |  |  |
|**ruleName** | **String** |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**tags** | **List&lt;String&gt;** |  |  |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| ERROR | &quot;Error&quot; |
| WARNING | &quot;Warning&quot; |
| INFO | &quot;Info&quot; |



