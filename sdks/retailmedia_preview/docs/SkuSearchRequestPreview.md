

# SkuSearchRequestPreview

A request for sku by sellers or brands.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandIds** | **List&lt;String&gt;** | A list of brand Id&#39;s |  [optional] |
|**brandType** | [**BrandTypeEnum**](#BrandTypeEnum) | Enum to set type of brand id&#39;s to filter by |  [optional] |
|**id** | **String** |  |  [optional] |
|**productIds** | **List&lt;String&gt;** | A list of product Id&#39;s, if not passed ignore and search by QueryString |  [optional] |
|**productIdType** | [**ProductIdTypeEnum**](#ProductIdTypeEnum) | Type of Product Ids to search for. |  [optional] |
|**queryString** | **String** | Query string to search for across SKU&#39;s properties (gtin, mpn, feed ID, Title, and Description) |  |
|**retailerId** | **String** | Retailer Id |  |
|**sellers** | **List&lt;String&gt;** | A list of seller names and/or seller Id&#39;s |  [optional] |
|**skuType** | [**SkuTypeEnum**](#SkuTypeEnum) | Enum to set isSellerSku field |  [optional] |



## Enum: BrandTypeEnum

| Name | Value |
|---- | -----|
| UC | &quot;uC&quot; |
| RETAILER | &quot;retailer&quot; |



## Enum: ProductIdTypeEnum

| Name | Value |
|---- | -----|
| SKUKEY | &quot;skuKey&quot; |
| GTIN | &quot;gtin&quot; |
| MPN | &quot;mpn&quot; |
| MODEL | &quot;model&quot; |
| SKUID | &quot;skuId&quot; |
| PARENTID | &quot;parentId&quot; |



## Enum: SkuTypeEnum

| Name | Value |
|---- | -----|
| BRAND | &quot;brand&quot; |
| SELLER | &quot;seller&quot; |
| ALL | &quot;all&quot; |



