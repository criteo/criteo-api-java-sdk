

# ProductStatus

Represents the review status of a product within an auction display line item proposal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productId** | **String** | The identifier of the product. |  |
|**retailerComment** | **String** | The retailer&#39;s comment on this product. One comment applies to all products in the line item. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The review status of the product. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| DRAFT | &quot;draft&quot; |
| INREVIEW | &quot;inReview&quot; |
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |
| DELETED | &quot;deleted&quot; |



