

# OnsiteDisplayForecast

The forecast for one page type, returned as an item of the response `data` array.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableImpressions** | **Long** | Estimated available impressions over the whole forecast period. |  |
|**averageCpm** | [**OnsiteDisplayForecastAverageCpm**](OnsiteDisplayForecastAverageCpm.md) |  |  [optional] |
|**budget** | [**OnsiteDisplayForecastBudget**](OnsiteDisplayForecastBudget.md) |  |  |
|**details** | [**List&lt;InventoryForecastDetail&gt;**](InventoryForecastDetail.md) | Daily breakdown, one entry per row of the grain described on  &#x60;InventoryForecastDetail&#x60;. |  |
|**pageType** | [**PageTypeEnum**](#PageTypeEnum) | Page type this forecast applies to. |  |
|**reservationRate** | **Double** | Proportion of inventory already reserved, from 0.0 to 1.0. |  |



## Enum: PageTypeEnum

| Name | Value |
|---- | -----|
| SEARCH | &quot;search&quot; |
| HOME | &quot;home&quot; |
| BROWSE | &quot;browse&quot; |
| CHECKOUT | &quot;checkout&quot; |
| CATEGORY | &quot;category&quot; |
| PRODUCTDETAIL | &quot;productDetail&quot; |
| CONFIRMATION | &quot;confirmation&quot; |
| MERCHANDISING | &quot;merchandising&quot; |
| DEALS | &quot;deals&quot; |
| FAVORITES | &quot;favorites&quot; |
| SEARCHBAR | &quot;searchBar&quot; |
| CATEGORYMENU | &quot;categoryMenu&quot; |
| UNKNOWN | &quot;unknown&quot; |



