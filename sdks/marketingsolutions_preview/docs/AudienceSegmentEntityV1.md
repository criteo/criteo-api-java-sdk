

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
**commerce** | [**CommerceV1**](CommerceV1.md) |  |  [optional]
**similar** | **Object** | Settings to target similar users to website visitors. |  [optional]
**contactList** | [**ContactListV1**](ContactListV1.md) |  |  [optional]
**location** | [**LocationV1**](LocationV1.md) |  |  [optional]
**prebuilt** | [**PrebuiltV1**](PrebuiltV1.md) |  |  [optional]
**retargeting** | [**RetargetingV1**](RetargetingV1.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
COMMERCE | &quot;Commerce&quot;
SIMILAR | &quot;Similar&quot;
CONTACTLIST | &quot;ContactList&quot;
LOCATION | &quot;Location&quot;
PREBUILT | &quot;Prebuilt&quot;
RETARGETING | &quot;Retargeting&quot;



