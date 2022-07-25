

# CommerceUpdateV1

Settings to target users based on high shopping intents and demographics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** |  |  [optional]
**buyingPower** | [**Set&lt;BuyingPowerEnum&gt;**](#Set&lt;BuyingPowerEnum&gt;) |  |  [optional]
**gender** | [**NillableGenderV1**](NillableGenderV1.md) |  |  [optional]
**interestIds** | **Set&lt;String&gt;** |  |  [optional]
**brandIds** | **Set&lt;String&gt;** |  |  [optional]
**priceRange** | [**Set&lt;PriceRangeEnum&gt;**](#Set&lt;PriceRangeEnum&gt;) |  |  [optional]



## Enum: Set&lt;BuyingPowerEnum&gt;

Name | Value
---- | -----
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;
VERYHIGH | &quot;VeryHigh&quot;



## Enum: Set&lt;PriceRangeEnum&gt;

Name | Value
---- | -----
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;



