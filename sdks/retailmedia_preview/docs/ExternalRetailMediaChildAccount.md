

# ExternalRetailMediaChildAccount

A Retail Media account entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**subType** | [**SubTypeEnum**](#SubTypeEnum) |  |  |
|**countryIds** | **List&lt;String&gt;** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**timeZone** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SUPPLY | &quot;Supply&quot; |
| DEMAND | &quot;Demand&quot; |



## Enum: SubTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| BRAND | &quot;Brand&quot; |
| SELLER | &quot;Seller&quot; |



