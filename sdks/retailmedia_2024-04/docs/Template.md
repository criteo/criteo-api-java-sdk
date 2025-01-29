

# Template

A template for creating creatives.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creativeFormat** | [**CreativeFormatEnum**](#CreativeFormatEnum) | The kind of creative this template can be used to build. |  |
|**name** | **String** | The name of the template |  |
|**skuCollectionMin** | **Integer** | Minimum number of skus in the collection |  |
|**skuCollectionMax** | **Integer** | Maximum number of skus in the collection |  [optional] |
|**skuPerCollectionMin** | **Integer** | Minimum number of skus per collection |  |
|**skuPerCollectionMax** | **Integer** | Maximum number of skus per collection |  [optional] |
|**displayableSkusMax** | **Integer** | Maximum number of displayable skus |  [optional] |
|**allCollectionsMandatory** | **Boolean** | Marks whether or not all collections are mandatory |  |
|**createdAt** | **OffsetDateTime** | The time at which the template was created |  |
|**updatedAt** | **OffsetDateTime** | The time at which the template was updated |  |
|**sections** | [**List&lt;Section&gt;**](Section.md) | The sections holding various template variables |  |



## Enum: CreativeFormatEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| FLAGSHIP | &quot;FlagShip&quot; |
| SHOWCASE | &quot;Showcase&quot; |
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| BUTTERFLY | &quot;Butterfly&quot; |
| BUNDLEBOOST | &quot;BundleBoost&quot; |
| IAB | &quot;IAB&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| DISPLAYPANEL | &quot;DisplayPanel&quot; |
| DIGITALSHELFTALKER | &quot;DigitalShelfTalker&quot; |



