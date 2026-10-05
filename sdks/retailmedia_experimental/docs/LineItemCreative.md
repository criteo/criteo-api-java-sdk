

# LineItemCreative

The association between a line item and one of its creatives.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) |  |  |
|**creative** | [**Creative**](Creative.md) |  |  |
|**creativePreviewCode** | **String** |  |  [optional] |
|**creativeProductCollections** | [**List&lt;CreativeProductCollection&gt;**](CreativeProductCollection.md) |  |  |



## Enum: ApprovalStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| APPROVED | &quot;Approved&quot; |
| AUTOAPPROVED | &quot;AutoApproved&quot; |
| INREVIEW | &quot;InReview&quot; |
| REJECTED | &quot;Rejected&quot; |
| AUTOREJECTED | &quot;AutoRejected&quot; |
| UNSUBMITTED | &quot;Unsubmitted&quot; |



