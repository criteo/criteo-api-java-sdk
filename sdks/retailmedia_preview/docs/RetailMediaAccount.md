

# RetailMediaAccount

The details for a newly created account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | account name |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type for the account |  [optional] |
|**subType** | [**SubTypeEnum**](#SubTypeEnum) | subtype for the account |  [optional] |
|**countryIds** | **List&lt;Integer&gt;** | list of countries associated with the account |  [optional] |
|**currencyId** | **Integer** | the currency for the account |  [optional] |
|**parentAccountLabel** | **String** | parent account label for the account |  [optional] |
|**timeZone** | **String** | the timezone for the account |  [optional] |



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



