

# Target

A specific Target configured on the line item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) |  |  [optional] |
|**bidMultiplier** | **Double** |  |  [optional] |
|**categoryTargetDetails** | [**CategoryTargetDetails**](CategoryTargetDetails.md) |  |  [optional] |
|**manualKeywordTargetDetails** | [**ManualKeywordTargetDetails**](ManualKeywordTargetDetails.md) |  |  [optional] |
|**negative** | **Boolean** |  |  [optional] |
|**pageTypeTargetDetails** | [**PageTypeTargetDetails**](PageTypeTargetDetails.md) |  |  [optional] |
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) |  |  [optional] |



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



## Enum: TargetTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| MANUALKEYWORD | &quot;ManualKeyword&quot; |
| PAGETYPE | &quot;PageType&quot; |
| CATEGORY | &quot;Category&quot; |



