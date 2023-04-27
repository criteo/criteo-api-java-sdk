

# ReadAdSetBidding

ad set bidding read model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidAmount** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) | The intended optimization for the Ad Set |  [optional] |
|**costController** | [**CostControllerEnum**](#CostControllerEnum) | How spend is controlled |  [optional] |



## Enum: BidStrategyEnum

| Name | Value |
|---- | -----|
| ACTIONS | &quot;actions&quot; |
| CLICKS | &quot;clicks&quot; |
| CONVERSIONS | &quot;conversions&quot; |
| DISPLAYS | &quot;displays&quot; |
| INSTALLS | &quot;installs&quot; |
| REVENUE | &quot;revenue&quot; |
| STORECONVERSIONS | &quot;storeConversions&quot; |
| VALUE | &quot;value&quot; |
| VIEWEDIMPRESSIONS | &quot;viewedImpressions&quot; |
| VISITS | &quot;Visits&quot; |
| COMPLETEDVIDEOVIEWS | &quot;completedVideoViews&quot; |



## Enum: CostControllerEnum

| Name | Value |
|---- | -----|
| COS | &quot;COS&quot; |
| CPC | &quot;CPC&quot; |
| CPI | &quot;CPI&quot; |
| CPM | &quot;CPM&quot; |
| CPO | &quot;CPO&quot; |
| CPSV | &quot;CPSV&quot; |
| CPV | &quot;CPV&quot; |
| DAILYBUDGET | &quot;dailyBudget&quot; |



