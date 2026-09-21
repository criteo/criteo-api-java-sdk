

# CreativeWrite

Entity to create or update a creative

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adaptiveWriteAttributes** | [**AdaptiveWriteAttributes**](AdaptiveWriteAttributes.md) |  |  [optional] |
|**datasetId** | **String** | Dataset linked to the Creative |  |
|**description** | **String** | The description of the creative |  [optional] |
|**dynamicWriteAttributes** | [**DynamicWriteAttributes**](DynamicWriteAttributes.md) |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | The format of the creative.  You can use \&quot;Image\&quot;, \&quot;HtmlTag\&quot;, \&quot;Dynamic\&quot;, \&quot;Adaptive\&quot;, \&quot;Showcase\&quot; or \&quot;VastTag\&quot; |  |
|**htmlTagWriteAttributes** | [**HtmlTagWriteAttributes**](HtmlTagWriteAttributes.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**imageWriteAttributes** | [**ImageWriteAttributes**](ImageWriteAttributes.md) |  |  [optional] |
|**name** | **String** | The name of the creative |  |
|**showcaseWriteAttributes** | [**ShowcaseWriteAttributes**](ShowcaseWriteAttributes.md) |  |  [optional] |
|**socialSettings** | [**SocialSettings**](SocialSettings.md) |  |  [optional] |
|**vastTagWriteAttributes** | [**VastTagWriteAttributes**](VastTagWriteAttributes.md) |  |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| DYNAMIC | &quot;Dynamic&quot; |
| HTMLTAG | &quot;HtmlTag&quot; |
| IMAGE | &quot;Image&quot; |
| ADAPTIVE | &quot;Adaptive&quot; |
| SHOWCASE | &quot;Showcase&quot; |
| VASTTAG | &quot;VastTag&quot; |



