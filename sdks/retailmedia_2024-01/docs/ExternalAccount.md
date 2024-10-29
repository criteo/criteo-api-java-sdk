

# ExternalAccount

A Retail Media Account used to launch campaigns and line items

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**subtype** | [**SubtypeEnum**](#SubtypeEnum) |  |  [optional] |
|**countries** | **List&lt;String&gt;** |  |  |
|**currency** | **String** |  |  |
|**parentAccountLabel** | **String** |  |  |
|**timeZone** | **String** |  |  |
|**companyName** | **String** |  |  [optional] |
|**onBehalfCompanyName** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| SUPPLY | &quot;supply&quot; |
| DEMAND | &quot;demand&quot; |



## Enum: SubtypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| BRAND | &quot;brand&quot; |
| SELLER | &quot;seller&quot; |



