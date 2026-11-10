

# RecommendSegmentsRequestAttributes

Brief and options of a segment recommendation request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** | [Optional] AdvertiserId this requestor has access to. |  [optional] |
|**brief** | **String** | A freeform audience description. |  |
|**country** | **String** | [Optional] Country code. Must be a supported country. When &#x60;advertiserId&#x60; is set, it must also match the country of the advertiser. |  [optional] |
|**nbSegments** | **Integer** | Number of segments to recommend, between 1 and 20 (default to 5). |  [optional] |
|**segmentStatusToRecommend** | [**SegmentStatusToRecommendEnum**](#SegmentStatusToRecommendEnum) | [Optional] Recommend only existing segments or suggest the new ones. Default to new. |  [optional] |
|**segmentTypesToRecommend** | [**List&lt;SegmentTypesToRecommendEnum&gt;**](#List&lt;SegmentTypesToRecommendEnum&gt;) | [Optional] Restrict the recommended segment types. |  [optional] |



## Enum: SegmentStatusToRecommendEnum

| Name | Value |
|---- | -----|
| NEW | &quot;new&quot; |
| EXISTING | &quot;existing&quot; |



## Enum: List&lt;SegmentTypesToRecommendEnum&gt;

| Name | Value |
|---- | -----|
| AFFINITYALLLEVELS | &quot;affinityAllLevels&quot; |
| AFFINITYTOPLEVEL | &quot;affinityTopLevel&quot; |
| AFFINITYCHILDREN | &quot;affinityChildren&quot; |
| INMARKETCATEGORYALLLEVELS | &quot;inMarketCategoryAllLevels&quot; |
| INMARKETCATEGORYLEVEL1 | &quot;inMarketCategoryLevel1&quot; |
| INMARKETCATEGORYLEVEL2 | &quot;inMarketCategoryLevel2&quot; |
| INMARKETCATEGORYLEVEL3 | &quot;inMarketCategoryLevel3&quot; |
| BEHAVIORAL | &quot;behavioral&quot; |
| WEBSITEVISITOR | &quot;websiteVisitor&quot; |
| PREDICTIVECLV | &quot;predictiveCLV&quot; |
| LOCATION | &quot;location&quot; |
| LOOKALIKE | &quot;lookalike&quot; |
| FILTERBASED | &quot;filterBased&quot; |



