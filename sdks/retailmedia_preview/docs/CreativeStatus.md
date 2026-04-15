

# CreativeStatus

Represents the review status of a creative within an auction display line item proposal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creativeId** | **String** | The identifier of the creative. |  |
|**retailerComment** | **String** | The retailer&#39;s comment on this creative. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The review status of the creative. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| DRAFT | &quot;draft&quot; |
| INREVIEW | &quot;inReview&quot; |
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |
| DELETED | &quot;deleted&quot; |



