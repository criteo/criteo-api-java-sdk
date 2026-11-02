

# InventoryForecastDetail

One row of a page type's daily breakdown.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableImpressions** | **Long** | Estimated available impressions for this day. |  |
|**averageCpm** | [**InventoryForecastDetailAverageCpm**](InventoryForecastDetailAverageCpm.md) |  |  |
|**budget** | [**InventoryForecastDetailBudget**](InventoryForecastDetailBudget.md) |  |  |
|**creativeFormats** | [**List&lt;CreativeFormatsEnum&gt;**](#List&lt;CreativeFormatsEnum&gt;) | Every creative format available on this placement configuration, restricted to the formats  the request asked for. The row aggregates them - impressions are not split per format. |  |
|**date** | **LocalDate** | The forecast day, as &#x60;YYYY-MM-DD&#x60;. |  |
|**keyword** | **String** | The keyword this row is for. Present only for search and search bar pages. |  [optional] |
|**placementConfigId** | **String** | Placement configuration this row is for. |  |
|**taxonomyId** | **String** | The taxonomy id this row is for. Present only for category, product detail, category menu  and merchandising pages. |  [optional] |



## Enum: List&lt;CreativeFormatsEnum&gt;

| Name | Value |
|---- | -----|
| FLAGSHIP | &quot;flagShip&quot; |
| SHOWCASE | &quot;showcase&quot; |
| BUTTERFLY | &quot;butterfly&quot; |
| BUNDLEBOOST | &quot;bundleBoost&quot; |
| IAB | &quot;iab&quot; |
| CUSTOM | &quot;custom&quot; |
| DISPLAYPANEL | &quot;displayPanel&quot; |
| DIGITALSHELFTALKER | &quot;digitalShelfTalker&quot; |
| COMMERCEVIDEOSPOTLIGHT | &quot;commerceVideoSpotlight&quot; |
| BRANDINGVIDEOSTANDOUT | &quot;brandingVideoStandout&quot; |
| UNKNOWN | &quot;unknown&quot; |



