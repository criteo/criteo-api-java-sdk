

# LocationUpdateV1

Settings to target users based on their location.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pointsOfInterest** | [**List&lt;PointOfInterestV1&gt;**](PointOfInterestV1.md) |  |  [optional]
**geoDivisions** | [**List&lt;GeoDivisionV1&gt;**](GeoDivisionV1.md) |  |  [optional]
**radiusInKm** | **Integer** | Radius in kilometers |  [optional]
**registryType** | [**RegistryTypeEnum**](#RegistryTypeEnum) |  |  [optional]



## Enum: RegistryTypeEnum

Name | Value
---- | -----
CATALOG | &quot;Catalog&quot;
STORE | &quot;Store&quot;
POINTOFINTEREST | &quot;PointOfInterest&quot;
GEODIVISION | &quot;GeoDivision&quot;



