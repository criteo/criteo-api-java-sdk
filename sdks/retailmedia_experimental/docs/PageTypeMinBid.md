

# PageTypeMinBid

Represents minimum bidding guidance for one page type configured on a line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minBid** | **Double** | The inclusive minimum valid bid in the line item&#39;s currency. |  |
|**pageType** | [**PageTypeEnum**](#PageTypeEnum) | The page type to which the bidding guidance applies. |  |
|**recommendedMinBid** | **Double** | The bid below which validation emits a low-bid warning in the line item&#39;s currency. |  [optional] |



## Enum: PageTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SEARCH | &quot;Search&quot; |
| HOME | &quot;Home&quot; |
| BROWSE | &quot;Browse&quot; |
| CHECKOUT | &quot;Checkout&quot; |
| CATEGORY | &quot;Category&quot; |
| PRODUCTDETAIL | &quot;ProductDetail&quot; |
| CONFIRMATION | &quot;Confirmation&quot; |
| MERCHANDISING | &quot;Merchandising&quot; |
| DEALS | &quot;Deals&quot; |
| FAVORITES | &quot;Favorites&quot; |
| SEARCHBAR | &quot;SearchBar&quot; |
| CATEGORYMENU | &quot;CategoryMenu&quot; |
| AIASSISTANT | &quot;AiAssistant&quot; |



