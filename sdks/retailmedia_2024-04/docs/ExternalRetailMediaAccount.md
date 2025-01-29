

# ExternalRetailMediaAccount

The details for a newly created account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**onBehalfCompanyName** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**subType** | [**SubTypeEnum**](#SubTypeEnum) |  |  [optional] |
|**countryIds** | **List&lt;String&gt;** |  |  [optional] |
|**currencyId** | **String** |  |  [optional] |
|**parentAccountLabel** | **String** |  |  [optional] |
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



