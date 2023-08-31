

# Keywords

Data associated with a normalized keyword phrase

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewState** | [**ReviewStateEnum**](#ReviewStateEnum) | Review status of the keyword |  [optional] |
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | The matching algorthim to be use when comparing this keyword with the shopper search phrase |  [optional] |
|**bid** | **Double** | The bid to use when a positive keyword matches the shopper search phrase |  [optional] |
|**inputKeywords** | [**InputKeywords**](InputKeywords.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which this keyword was created in UTC |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time at which the keyword was last modified in UTC |  [optional] |



## Enum: ReviewStateEnum

| Name | Value |
|---- | -----|
| INREVIEW | &quot;InReview&quot; |
| RECOMMENDED | &quot;Recommended&quot; |
| APPROVED | &quot;Approved&quot; |
| AUTOAPPROVED | &quot;AutoApproved&quot; |
| REJECTED | &quot;Rejected&quot; |
| AUTOREJECTED | &quot;AutoRejected&quot; |
| UNKOWN | &quot;Unkown&quot; |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| POSITIVEEXACTMATCH | &quot;PositiveExactMatch&quot; |
| NEGATIVEEXACTMATCH | &quot;NegativeExactMatch&quot; |
| NEGATIVEBROADMATCH | &quot;NegativeBroadMatch&quot; |
| UNKNOWN | &quot;Unknown&quot; |



