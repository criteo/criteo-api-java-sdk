

# SegmentConfigurationV1

A recommended audience segment and its configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserId** | **String** |  |  [optional] |
|**affinityConfiguration** | [**AffinityRecommendationV1**](AffinityRecommendationV1.md) |  |  [optional] |
|**alreadyCreated** | **Boolean** |  |  |
|**behavioralConfiguration** | [**BehavioralRecommendationV1**](BehavioralRecommendationV1.md) |  |  [optional] |
|**dataProviderId** | **String** |  |  [optional] |
|**description** | **String** |  |  |
|**inMarketConfiguration** | [**InMarketRecommendationV1**](InMarketRecommendationV1.md) |  |  [optional] |
|**locationConfiguration** | [**LocationRecommendationV1**](LocationRecommendationV1.md) |  |  [optional] |
|**lookalikeConfiguration** | [**LookalikeRecommendationV1**](LookalikeRecommendationV1.md) |  |  [optional] |
|**segmentId** | **String** |  |  [optional] |
|**segmentName** | **String** |  |  [optional] |
|**segmentType** | [**SegmentTypeEnum**](#SegmentTypeEnum) |  |  |
|**size** | **Long** |  |  [optional] |



## Enum: SegmentTypeEnum

| Name | Value |
|---- | -----|
| AFFINITY | &quot;affinity&quot; |
| INMARKET | &quot;inMarket&quot; |
| WEBSITEVISITOR | &quot;websiteVisitor&quot; |
| PREDICTIVECLV | &quot;predictiveCLV&quot; |
| LOCATION | &quot;location&quot; |
| LOOKALIKE | &quot;lookalike&quot; |
| FILTERBASED | &quot;filterBased&quot; |
| BEHAVIORAL | &quot;behavioral&quot; |



