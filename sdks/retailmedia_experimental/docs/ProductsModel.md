

# ProductsModel

Products associated with a line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayProductDetails** | [**List&lt;DisplayProductDetailModel&gt;**](DisplayProductDetailModel.md) | The display product details. |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The type of products. |  [optional] |
|**sponsoredProductDetails** | [**List&lt;SponsoredProductDetailModel&gt;**](SponsoredProductDetailModel.md) | The sponsored product details. |  [optional] |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DISPLAYPRODUCT | &quot;DisplayProduct&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |



