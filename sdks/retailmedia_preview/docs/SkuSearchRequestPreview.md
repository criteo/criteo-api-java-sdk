

# SkuSearchRequestPreview

A request for sku by sellers or brands.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queryString** | **String** | Query string to search for across SKU&#39;s properties (gtin, mpn, feed ID, Title, and Description) | 
**retailerId** | **String** | Retailer Id | 
**sellers** | **List&lt;String&gt;** | A list of seller names and/or seller Id&#39;s |  [optional]
**brandIds** | **List&lt;String&gt;** | A list of brand Id&#39;s |  [optional]
**skuType** | [**SkuTypeEnum**](#SkuTypeEnum) | Enum to set isSellerSku field |  [optional]



## Enum: SkuTypeEnum

Name | Value
---- | -----
BRAND | &quot;brand&quot;
SELLER | &quot;seller&quot;
ALL | &quot;all&quot;



