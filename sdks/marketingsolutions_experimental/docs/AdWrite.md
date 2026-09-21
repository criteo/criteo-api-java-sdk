

# AdWrite

Entity to create an ad

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adClickTracking** | [**List&lt;ExamAdClickTracking&gt;**](ExamAdClickTracking.md) | Optional ad-level click tracking configuration. |  [optional] |
|**adImpressionTracking** | [**List&lt;ExamAdImpressionTracking&gt;**](ExamAdImpressionTracking.md) | Optional ad-level impression tracking configuration. |  [optional] |
|**adSetId** | **String** | The id of the Ad Set bound to this Ad |  |
|**creativeId** | **String** | The id of the Creative bound to this Ad |  |
|**description** | **String** | The description of the ad |  [optional] |
|**endDate** | **String** | The date when when we will stop to show this ad. If the end date is not specified (i.e. null) then the ad will go on forever  String must be in ISO8601 format |  [optional] |
|**id** | **String** |  |  [optional] |
|**inventoryType** | [**InventoryTypeEnum**](#InventoryTypeEnum) | The inventory the Ad to be created or updated belongs to. Possible values are \&quot;Display\&quot;, \&quot;Native\&quot;,  \&quot;Video\&quot; and \&quot;Meta\&quot;. This is optional since it doesn&#39;t make sense for every creative type: it is inferred  from the creative for a video creative, and an error is returned if it is not set for a dynamic creative.  \&quot;Meta\&quot; additionally requires the target ad set to be linked to Meta. |  [optional] |
|**name** | **String** | The name of the ad |  |
|**startDate** | **String** | The date when the ad will be launched  String must be in ISO8601 format |  |



## Enum: InventoryTypeEnum

| Name | Value |
|---- | -----|
| NATIVE | &quot;Native&quot; |
| DISPLAY | &quot;Display&quot; |
| VIDEO | &quot;Video&quot; |
| META | &quot;Meta&quot; |



