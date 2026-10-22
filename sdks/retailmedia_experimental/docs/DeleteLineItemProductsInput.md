

# DeleteLineItemProductsInput

The products to soft delete from a line item's product pool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productIds** | **List&lt;String&gt;** | The product ids to soft delete from the line item. |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The type of the products being deleted. |  |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DISPLAYPRODUCT | &quot;DisplayProduct&quot; |
| SPONSOREDPRODUCT | &quot;SponsoredProduct&quot; |



