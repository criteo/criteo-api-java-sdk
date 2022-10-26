

# ExternalCampaign

A Retail Media Campaign used to represent an advertiser's marketing objective

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** |  | 
**promotedBrandIds** | **List&lt;String&gt;** |  | 
**budgetSpent** | **BigDecimal** |  | 
**budgetRemaining** | **BigDecimal** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | **OffsetDateTime** |  | 
**updatedAt** | **OffsetDateTime** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional]
**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) |  |  [optional]
**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) |  |  [optional]
**name** | **String** |  | 
**budget** | **BigDecimal** |  |  [optional]
**clickAttributionScope** | [**ClickAttributionScopeEnum**](#ClickAttributionScopeEnum) |  |  [optional]
**viewAttributionScope** | [**ViewAttributionScopeEnum**](#ViewAttributionScopeEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;



## Enum: TypeEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
AUCTION | &quot;auction&quot;
PREFERRED | &quot;preferred&quot;



## Enum: ClickAttributionWindowEnum

Name | Value
---- | -----
_7D | &quot;7D&quot;
_14D | &quot;14D&quot;
_30D | &quot;30D&quot;
UNKNOWN | &quot;unknown&quot;



## Enum: ViewAttributionWindowEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
_1D | &quot;1D&quot;
_7D | &quot;7D&quot;
_14D | &quot;14D&quot;
_30D | &quot;30D&quot;
UNKNOWN | &quot;unknown&quot;



## Enum: ClickAttributionScopeEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
SAMESKU | &quot;sameSku&quot;
SAMESKUCATEGORY | &quot;sameSkuCategory&quot;
SAMESKUCATEGORYBRAND | &quot;sameSkuCategoryBrand&quot;



## Enum: ViewAttributionScopeEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
SAMESKU | &quot;sameSku&quot;
SAMESKUCATEGORY | &quot;sameSkuCategory&quot;
SAMESKUCATEGORYBRAND | &quot;sameSkuCategoryBrand&quot;



