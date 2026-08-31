

# CreateTargetRequestModel

Target to configure on a line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidMultiplier** | **Double** |  |  [optional] |
|**categoryTargetDetails** | [**CategoryTargetDetails**](CategoryTargetDetails.md) |  |  [optional] |
|**manualKeywordTargetDetails** | [**ManualKeywordTargetDetails**](ManualKeywordTargetDetails.md) |  |  [optional] |
|**negative** | **Boolean** |  |  |
|**pageTypeTargetDetails** | [**PageTypeTargetDetails**](PageTypeTargetDetails.md) |  |  [optional] |
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) |  |  |



## Enum: TargetTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| MANUALKEYWORD | &quot;ManualKeyword&quot; |
| PAGETYPE | &quot;PageType&quot; |
| CATEGORY | &quot;Category&quot; |



