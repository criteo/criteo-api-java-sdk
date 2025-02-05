

# Ad

An ad is the binding that connects a creative with an ad set

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the ad |  [optional] |
|**description** | **String** | The description of the ad |  [optional] |
|**creativeId** | **String** | The id of the Creative binded to this Ad |  [optional] |
|**adSetId** | **String** | The id of the Ad Set binded to this Ad |  [optional] |
|**inventoryType** | [**InventoryTypeEnum**](#InventoryTypeEnum) | The inventory the Ad belongs to. Possible values are \&quot;Display\&quot; and \&quot;Native\&quot;. This is optional since this doesn&#39;t make sense for every creative type but will throw an error if not set for a dynamic creative. |  [optional] |
|**startDate** | **String** | The date when the ad will be launched  String must be in ISO8601 format |  [optional] |
|**endDate** | **String** | The date when when we will stop to show this ad. If the end date is not specified (i.e. null) then the ad will go on forever  String must be in ISO8601 format |  [optional] |
|**id** | **String** | Unique identifier (duplicate of the parent id). |  [optional] |



## Enum: InventoryTypeEnum

| Name | Value |
|---- | -----|
| NATIVE | &quot;Native&quot; |
| DISPLAY | &quot;Display&quot; |
| VIDEO | &quot;Video&quot; |



