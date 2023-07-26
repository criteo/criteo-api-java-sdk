

# SkuSlimDataPreview

Slim  version of Sku Data model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A short product name. |  [optional] |
|**categoryId** | **String** | The category Id. |  [optional] |
|**globalCategoryId** | **String** | The global category Id. |  [optional] |
|**category** | **String** | The full category breadcrumb in the retailers catalog. |  [optional] |
|**globalBrandId** | **String** | The global brand id associated to the product. |  |
|**globalBrandName** | **String** | The name of the global brand. |  |
|**retailerBrandId** | **String** | The retailer brand id associated to the product. |  [optional] |
|**retailerBrandName** | **String** | The name of the retailer brand. |  [optional] |
|**price** | **Double** | The price of the product on the retailer site. Can be omitted in certain circumstances |  |
|**isInStock** | **Boolean** | An indication of if the retailer currently has the product in stock. |  |
|**gtin** | **String** | A GTIN identifier for the product if available. Covers variations such as EANs and UPCs. |  [optional] |
|**mpn** | **String** | The MPN for the product if available. |  [optional] |
|**imageUrl** | **String** | An http image resource provided by the retailer. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last time this product was updated in the Retail Media Catalog. Represented as a UTC ISO8601 string. |  |



