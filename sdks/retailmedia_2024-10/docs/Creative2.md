

# Creative2

A creative entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name |  |
|**status** | [**StatusEnum**](#StatusEnum) | Creative Status |  |
|**brandId** | **Long** | Brand Id |  |
|**retailerId** | **Integer** | Retailer Id |  |
|**templateId** | **Integer** | Template Id |  |
|**templateName** | **String** | Template Name |  |
|**formatId** | **Integer** | Format Id |  |
|**associatedLineItemIds** | **List&lt;String&gt;** | Associated Line Item Ids |  |
|**updatedAt** | **OffsetDateTime** | Updated at time |  |
|**creativeFormatV2Type** | [**CreativeFormatV2TypeEnum**](#CreativeFormatV2TypeEnum) | Creative format type |  |
|**environments** | [**List&lt;PageTypeEnvironment2&gt;**](PageTypeEnvironment2.md) | Environment type (e.g. mobile, web, app) |  |
|**templateVariableValues** | [**List&lt;TemplateVariableValue&gt;**](TemplateVariableValue.md) | The template chosen values |  |
|**id** | **String** | Id of the entity |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;Ready&quot; |
| INUSE | &quot;InUse&quot; |
| ARCHIVED | &quot;Archived&quot; |
| DELETED | &quot;Deleted&quot; |



## Enum: CreativeFormatV2TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| FLAGSHIP | &quot;FlagShip&quot; |
| SHOWCASE | &quot;Showcase&quot; |
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| BUTTERFLY | &quot;Butterfly&quot; |
| BUNDLEBOOST | &quot;BundleBoost&quot; |
| IAB | &quot;IAB&quot; |
| CUSTOM | &quot;Custom&quot; |
| DISPLAYPANEL | &quot;DisplayPanel&quot; |
| DIGITALSHELFTALKER | &quot;DigitalShelfTalker&quot; |



