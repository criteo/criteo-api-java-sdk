

# Creative202210

A creative entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name |  |
|**status** | [**StatusEnum**](#StatusEnum) | Creative Status |  |
|**brandId** | **Long** | Brand Id |  [optional] |
|**retailerId** | **Integer** | Retailer Id |  |
|**templateId** | **Integer** | Template Id |  |
|**templateName** | **String** | Template Name |  |
|**formatId** | **Integer** | Format Id |  |
|**associatedLineItemIds** | **List&lt;String&gt;** | Associated Line Item Ids |  [optional] |
|**updatedAt** | **OffsetDateTime** | Updated at time |  [optional] |
|**creativeFormatType** | [**CreativeFormatTypeEnum**](#CreativeFormatTypeEnum) | Creative format type |  |
|**environments** | [**List&lt;PageTypeEnvironment202210&gt;**](PageTypeEnvironment202210.md) | Environment type (e.g. mobile, web, app) |  |
|**templateVariableValues** | [**List&lt;TemplateVariableValue&gt;**](TemplateVariableValue.md) | The template chosen values |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;Ready&quot; |
| IN_USE | &quot;In_Use&quot; |
| ARCHIVED | &quot;Archived&quot; |
| DELETED | &quot;Deleted&quot; |



## Enum: CreativeFormatTypeEnum

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



