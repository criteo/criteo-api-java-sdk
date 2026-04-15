

# CampaignAttributionRequest

Represents the attribution configuration for a campaign, defining how conversions are attributed to ad interactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clickAttributionScope** | [**ClickAttributionScopeEnum**](#ClickAttributionScopeEnum) | The attribution scope for clicks, defining the level at which click attributions are tracked. |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | The attribution window for clicks, defining how long after a click a conversion can be attributed to it. |  [optional] |
|**viewAttributionScope** | [**ViewAttributionScopeEnum**](#ViewAttributionScopeEnum) | The attribution scope for views, defining the level at which view attributions are tracked. |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | The attribution window for views, defining how long after an ad view a conversion can be attributed to it. |  [optional] |



## Enum: ClickAttributionScopeEnum

| Name | Value |
|---- | -----|
| SAMESKU | &quot;sameSku&quot; |
| SAMESKUCATEGORY | &quot;sameSkuCategory&quot; |
| SAMESKUCATEGORYBRAND | &quot;sameSkuCategoryBrand&quot; |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| _7D | &quot;7d&quot; |
| _14D | &quot;14d&quot; |
| _30D | &quot;30d&quot; |



## Enum: ViewAttributionScopeEnum

| Name | Value |
|---- | -----|
| SAMESKU | &quot;sameSku&quot; |
| SAMESKUCATEGORY | &quot;sameSkuCategory&quot; |
| SAMESKUCATEGORYBRAND | &quot;sameSkuCategoryBrand&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _1D | &quot;1d&quot; |
| _7D | &quot;7d&quot; |
| _14D | &quot;14d&quot; |
| _30D | &quot;30d&quot; |



