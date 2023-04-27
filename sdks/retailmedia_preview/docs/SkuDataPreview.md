

# SkuDataPreview

Metadata and usage info of a sku search

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**skuKey** | **String** | The product SKU Key. |  |
|**name** | **String** | A short product name. |  [optional] |
|**description** | **String** | A product description. |  [optional] |
|**categoryId** | **String** | The category Id. |  [optional] |
|**category** | **String** | The full category breadcrumb in the retailers catalog. |  [optional] |
|**isSellerSku** | **Boolean** | An indication of if the sku is seller sku. |  [optional] |
|**isBuybox** | **Boolean** | Whether the Sku is a Buybox Winner. |  [optional] |
|**sellerId** | **String** | The id of the seller. |  [optional] |
|**sellerName** | **String** | The name of the seller. |  [optional] |
|**brandId** | **String** | The global brand id associated to the product. |  |
|**brandName** | **String** | The name of the global brand. |  |
|**retailerId** | **String** | The identifier for the retailer the product is listed by. |  |
|**retailerName** | **String** | The retailer name. |  |
|**price** | **Double** | The price of the product on the retailer site. |  |
|**isInStock** | **Boolean** | An indication of if the retailer currently has the product in stock. |  |
|**gtin** | **String** | A GTIN identifier for the product if available. Covers variations such as EANs and UPCs. |  [optional] |
|**mpn** | **String** | The MPN for the product if available. |  [optional] |
|**modelNumber** | **String** | The Model Number for the product if available. |  [optional] |
|**parentId** | **String** | The ParentId for the product if available. |  [optional] |
|**imageUrl** | **String** | An http image resource provided by the retailer. |  [optional] |
|**productPage** | **String** | An The product page URL |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last time this product was updated in the Retail Media Catalog. Represented as a UTC ISO8601 string. |  |



