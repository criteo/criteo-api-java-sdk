

# SkuSlimDataV2

Slim  version of Sku Data model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A short product name. |  [optional] |
|**description** | **String** | A short description of the product. |  [optional] |
|**category** | [**Category**](Category.md) |  |  [optional] |
|**brand** | [**Brand**](Brand.md) |  |  [optional] |
|**price** | **Double** | The price of the product on the retailer site. Can be omitted in certain circumstances |  |
|**isInStock** | **Boolean** | An indication of if the retailer currently has the product in stock. |  |
|**gtin** | **String** | A GTIN identifier for the product if available. Covers variations such as EANs and UPCs. |  [optional] |
|**mpn** | **String** | The MPN for the product if available. |  [optional] |
|**imageUrl** | **String** | An http image resource provided by the retailer. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last time this product was updated in the Retail Media Catalog. Represented as a UTC ISO8601 string. |  |



