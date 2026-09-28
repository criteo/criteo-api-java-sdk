

# LineItemProduct

One product in a line item's product pool. The product identifier is the resource id;  type-specific fields are grouped under the detail object selected by Criteo.RetailMedia.LineItem.AdContent.Contract.V2.Models.Products.ProductAttributesModel.ProductType.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayProductDetails** | [**DisplayProductDetails**](DisplayProductDetails.md) |  |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The type of the product, selecting which detail object is populated. |  [optional] |
|**sponsoredProductDetails** | [**SponsoredProductDetails**](SponsoredProductDetails.md) |  |  [optional] |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DISPLAYPRODUCT | &quot;DisplayProduct&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |



