

# ComputeOnsiteDisplayForecast

Parameters for computing an Onsite Display forecast.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | How the inventory is bought. |  [optional] |
|**creativeFormats** | [**List&lt;CreativeFormatsEnum&gt;**](#List&lt;CreativeFormatsEnum&gt;) | Restricts the forecast to these creative formats. Defaults to all formats. |  [optional] |
|**endDate** | **LocalDate** | Last day of the forecast period, inclusive, as &#x60;YYYY-MM-DD&#x60;. May equal  &#x60;startDate&#x60; for a single-day forecast. |  |
|**frequencyCapping** | [**ComputeOnsiteDisplayForecastFrequencyCapping**](ComputeOnsiteDisplayForecastFrequencyCapping.md) |  |  [optional] |
|**pageSettings** | [**List&lt;PageSetting&gt;**](PageSetting.md) | Page types to include, at least one, and at most one entry per page type. |  |
|**retailerId** | **String** | Identifies the retailer whose inventory is being forecast. |  |
|**startDate** | **LocalDate** | First day of the forecast period, as &#x60;YYYY-MM-DD&#x60;. |  |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERREDDEALS | &quot;preferredDeals&quot; |
| SPONSORSHIP | &quot;sponsorship&quot; |



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



