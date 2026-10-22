

# LineItemProductInput

One product to add to a line item's product pool. The product identifier is the resource id;  type-specific fields are grouped under the detail object selected by Criteo.RetailMedia.LineItem.AdContent.Contract.V2.Models.Products.LineItemProductInputModel.ProductType.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayProductDetails** | **Object** | Onsite Display-specific product details supplied when adding a product. A display product is  identified entirely by its resource id, so this object carries no fields of its own today; it  exists so display can gain request-only fields without reshaping the request. |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The type of the product, selecting which detail object is read. |  |
|**sponsoredProductDetails** | [**SponsoredProductDetails**](SponsoredProductDetails.md) |  |  [optional] |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DISPLAYPRODUCT | &quot;DisplayProduct&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |



