

# CreativeWrite

Entity to create or update a creative

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the creative |  |
|**description** | **String** | The description of the creative |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | The format of the creative  You can use \&quot;Image\&quot;, \&quot; HtmlTag\&quot;, \&quot;Dynamic\&quot; or \&quot;Adaptive\&quot; |  |
|**datasetId** | **String** | Dataset linked to the Creative |  |
|**imageWriteAttributes** | [**ImageWriteAttributes**](ImageWriteAttributes.md) |  |  [optional] |
|**htmlTagWriteAttributes** | [**HtmlTagWriteAttributes**](HtmlTagWriteAttributes.md) |  |  [optional] |
|**dynamicWriteAttributes** | [**DynamicWriteAttributes**](DynamicWriteAttributes.md) |  |  [optional] |
|**adaptiveWriteAttributes** | [**AdaptiveWriteAttributes**](AdaptiveWriteAttributes.md) |  |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;Image&quot; |
| HTMLTAG | &quot;HtmlTag&quot; |
| DYNAMIC | &quot;Dynamic&quot; |
| ADAPTIVE | &quot;Adaptive&quot; |



