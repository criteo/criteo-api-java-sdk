

# EditableCampaignAttributesV202301

An object that represents the available options to set when editing a Retail Media Campaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**budget** | **BigDecimal** |  |  [optional]
**monthlyPacing** | **BigDecimal** |  |  [optional]
**dailyPacing** | **BigDecimal** |  |  [optional]
**isAutoDailyPacing** | **Boolean** |  | 
**startDate** | **OffsetDateTime** |  | 
**endDate** | **OffsetDateTime** |  | 
**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) |  | 
**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) |  | 
**clickAttributionScope** | [**ClickAttributionScopeEnum**](#ClickAttributionScopeEnum) |  |  [optional]
**viewAttributionScope** | [**ViewAttributionScopeEnum**](#ViewAttributionScopeEnum) |  |  [optional]



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



