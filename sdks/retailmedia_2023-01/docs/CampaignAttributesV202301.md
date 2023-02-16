

# CampaignAttributesV202301

An object that represents the available options to set when creating a Retail Media Campaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**drawableBalanceIds** | **List&lt;String&gt;** |  |  [optional]
**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) |  |  [optional]
**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) |  |  [optional]
**name** | **String** |  | 
**budget** | **BigDecimal** |  |  [optional]
**monthlyPacing** | **BigDecimal** |  |  [optional]
**dailyPacing** | **BigDecimal** |  |  [optional]
**isAutoDailyPacing** | **Boolean** |  | 
**startDate** | **OffsetDateTime** |  | 
**endDate** | **OffsetDateTime** |  | 
**clickAttributionScope** | [**ClickAttributionScopeEnum**](#ClickAttributionScopeEnum) |  |  [optional]
**viewAttributionScope** | [**ViewAttributionScopeEnum**](#ViewAttributionScopeEnum) |  |  [optional]



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
NONE | &quot;None&quot;
UNKNOWN | &quot;Unknown&quot;
ONEDAY | &quot;OneDay&quot;
SEVENDAYS | &quot;SevenDays&quot;
FOURTEENDAYS | &quot;FourteenDays&quot;
THIRTYDAYS | &quot;ThirtyDays&quot;



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



