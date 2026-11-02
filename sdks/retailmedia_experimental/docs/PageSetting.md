

# PageSetting

One page type to include in the forecast, and how to filter its inventory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keywords** | **List&lt;String&gt;** | Keywords to filter inventory by, up to 100. Required when &#x60;pageType&#x60; is  &#x60;search&#x60; or &#x60;searchBar&#x60;. Recommended  keywords come from &#x60;POST /retail-media/retailers/{retailerId}/recommend-keywords&#x60;. |  [optional] |
|**pageCpm** | [**PageSettingPageCpm**](PageSettingPageCpm.md) |  |  [optional] |
|**pageType** | [**PageTypeEnum**](#PageTypeEnum) | Page type to forecast. |  |
|**taxonomyIds** | **List&lt;String&gt;** | Retail Media category IDs to filter inventory by, up to 100. Required when  &#x60;pageType&#x60; is &#x60;category&#x60;,  &#x60;productDetail&#x60;, &#x60;categoryMenu&#x60; or  &#x60;merchandising&#x60;. The ids come from the returned category &#x60;id&#x60;  of &#x60;POST /retail-media/retailers/{retailerId}/categories/search&#x60;. |  [optional] |



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



