

# SkuSearchResult

Data model for response resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The product name |  [optional] |
|**categoryId** | **String** | The cateogry Id |  [optional] |
|**category** | **String** | The full retailer category taken from the retailers catalog |  [optional] |
|**globalBrandId** | **String** | The global brand id associated to the product |  [optional] |
|**globalBrandName** | **String** | The name of the global brand |  [optional] |
|**retailerBrandId** | **String** | The retailer brand id associated to the product |  [optional] |
|**retailerBrandName** | **String** | The name of the retailer brand |  [optional] |
|**globalCategoryId** | **String** | the Global Category Id |  [optional] |
|**price** | **Double** | The product price pulled from the retailer&#39;s catalog |  [optional] |
|**modelNumber** | **String** | The model number for the product |  [optional] |
|**isInStock** | **Boolean** | Indicates if the retailer product is in stock |  [optional] |
|**gtin** | **String** | A GTIN identifier for the product if available.  TIt covers variations such as EANs and UPCs |  [optional] |
|**mpn** | **String** | The MPN identifier for the product if available |  [optional] |
|**imageUrl** | **String** | An http image resource provided by the retailer catalog |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last time this product was updated in the Retail Media Catalog.  The date value is represented as an UTC ISO8601 string |  [optional] |



