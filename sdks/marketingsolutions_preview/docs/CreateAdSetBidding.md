

# CreateAdSetBidding

ad set bidding create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidAmount** | **Double** | Decimal value target relating to the &#x60;bidStrategy&#x60; specified. May be &#x60;null&#x60; for strategies that do not require a target value. At most 4 decimals are supported. Additional decimals are rounded. |  [optional] |
|**bidStrategy** | [**BidStrategyEnum**](#BidStrategyEnum) |  |  [optional] |
|**costController** | [**CostControllerEnum**](#CostControllerEnum) |  |  [optional] |



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



