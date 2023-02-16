

# RetailMediaExternalv1KeywordDataModel

Details for a specific keyword

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reviewState** | [**ReviewStateEnum**](#ReviewStateEnum) |  |  [optional]
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) |  |  [optional]
**bid** | **Double** |  |  [optional]
**inputKeywords** | [**RetailMediaExternalv1InputKeywordsModel**](RetailMediaExternalv1InputKeywordsModel.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]



## Enum: ReviewStateEnum

Name | Value
---- | -----
INREVIEW | &quot;InReview&quot;
RECOMMENDED | &quot;Recommended&quot;
APPROVED | &quot;Approved&quot;
AUTOAPPROVED | &quot;AutoApproved&quot;
REJECTED | &quot;Rejected&quot;
AUTOREJECTED | &quot;AutoRejected&quot;



## Enum: MatchTypeEnum

Name | Value
---- | -----
POSITIVEEXACTMATCH | &quot;PositiveExactMatch&quot;
NEGATIVEEXACTMATCH | &quot;NegativeExactMatch&quot;
NEGATIVEBROADMATCH | &quot;NegativeBroadMatch&quot;



