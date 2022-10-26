

# Template

A template for creating creatives.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creativeFormat** | [**CreativeFormatEnum**](#CreativeFormatEnum) | The kind of creative this template can be used to build. | 
**name** | **String** | The name of the template | 
**retailerId** | **Integer** | The retailer associated to the template | 
**skuCollectionMin** | **Integer** | TODO: what is it ? | 
**skuCollectionMax** | **Integer** | TODO: what is it ? |  [optional]
**skuPerCollectionMin** | **Integer** | TODO: what is it ? | 
**skuPerCollectionMax** | **Integer** | TODO: what is it ? |  [optional]
**displayableSkusMax** | **Integer** | TODO: what is it ? |  [optional]
**allCollectionsMandatory** | **Boolean** | TODO: what is it ? | 
**createdAt** | **OffsetDateTime** | The time at which the template was created | 
**updatedAt** | **OffsetDateTime** | The time at which the template was updated | 
**sections** | [**List&lt;Section&gt;**](Section.md) | The sections holding various template variables | 



## Enum: CreativeFormatEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
FLAGSHIP | &quot;FlagShip&quot;
SHOWCASE | &quot;Showcase&quot;
SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot;
BUTTERFLY | &quot;Butterfly&quot;
BUNDLEBOOST | &quot;BundleBoost&quot;
IAB | &quot;IAB&quot;
CUSTOM | &quot;CUSTOM&quot;
DISPLAYPANEL | &quot;DisplayPanel&quot;
DIGITALSHELFTALKER | &quot;DigitalShelfTalker&quot;



