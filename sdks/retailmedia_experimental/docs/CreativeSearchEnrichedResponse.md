

# CreativeSearchEnrichedResponse

Creative search-enriched response model. Same attributes as Criteo.RetailMedia.Creatives.Api.ExternalApi.Models.Creatives.V3.CreativeSearchResponse  plus the product collection constraints of the creative's template (retailer overrides applied).  The resource id is the first parent external id of the creative.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | Time search is created |  [optional] |
|**creativeType** | [**CreativeTypeEnum**](#CreativeTypeEnum) | Creative type |  [optional] |
|**displayableProductsMax** | **Integer** | Maximum number of displayable products allowed by the template |  [optional] |
|**modifiedAt** | **OffsetDateTime** | Time it&#39;s modified |  [optional] |
|**name** | **String** | Name of the creative |  [optional] |
|**pageType** | [**List&lt;PageTypeEnum&gt;**](#List&lt;PageTypeEnum&gt;) | Page type |  [optional] |
|**preview** | **String** | Preview url of the creative |  [optional] |
|**productCollectionsHaveImages** | **Boolean** | Whether the template&#39;s product collections carry an image |  [optional] |
|**productCollectionsHaveText** | **Boolean** | Whether the template&#39;s product collections carry a text |  [optional] |
|**productCollectionsMax** | **Integer** | Maximum number of product collections allowed by the template |  [optional] |
|**productCollectionsMin** | **Integer** | Minimum number of product collections required by the template |  [optional] |
|**productsPerCollectionMax** | **Integer** | Maximum number of products per collection allowed by the template |  [optional] |
|**productsPerCollectionMin** | **Integer** | Minimum number of products per collection required by the template |  [optional] |
|**retailerId** | **String** | RetailerId of the search filter |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The search status |  [optional] |
|**templateId** | **String** | Template Id |  [optional] |



## Enum: CreativeTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| COMMERCEDISPLAY | &quot;CommerceDisplay&quot; |
| COMMERCEVIDEO | &quot;CommerceVideo&quot; |
| STANDARDVIDEO | &quot;StandardVideo&quot; |
| STANDARDDISPLAY | &quot;StandardDisplay&quot; |



## Enum: List&lt;PageTypeEnum&gt;

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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;Ready&quot; |
| IN_USE | &quot;In Use&quot; |
| ARCHIVED | &quot;Archived&quot; |



