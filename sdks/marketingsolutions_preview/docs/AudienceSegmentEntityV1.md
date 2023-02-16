

# AudienceSegmentEntityV1

Set of rules that defines specific people to target.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the segment |  [optional]
**description** | **String** | Description of the segment |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of segment (read-only) |  [optional]
**createdAt** | **OffsetDateTime** | ISO-8601 timestamp in UTC of segment creation (read-only) |  [optional]
**updatedAt** | **OffsetDateTime** | ISO-8601 timestamp in UTC of segment update (read-only) |  [optional]
**advertiserId** | **String** | Advertiser associated to the segment |  [optional]
**inMarket** | [**InMarketV1**](InMarketV1.md) |  |  [optional]
**prospecting** | **Object** | Settings to target prospecting users to website visitors. |  [optional]
**contactList** | [**ContactListV1**](ContactListV1.md) |  |  [optional]
**location** | [**LocationV1**](LocationV1.md) |  |  [optional]
**behavioral** | [**BehavioralV1**](BehavioralV1.md) |  |  [optional]
**retargeting** | [**RetargetingV1**](RetargetingV1.md) |  |  [optional]
**lookalike** | [**LookalikeV1**](LookalikeV1.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
INMARKET | &quot;InMarket&quot;
PROSPECTING | &quot;Prospecting&quot;
CONTACTLIST | &quot;ContactList&quot;
LOCATION | &quot;Location&quot;
BEHAVIORAL | &quot;Behavioral&quot;
RETARGETING | &quot;Retargeting&quot;
LOOKALIKE | &quot;Lookalike&quot;



