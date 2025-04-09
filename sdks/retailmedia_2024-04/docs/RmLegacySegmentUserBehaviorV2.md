

# RmLegacySegmentUserBehaviorV2

Audience definition of people based on what they visited

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandIds** | **Set&lt;Long&gt;** | The brands to target |  [optional] |
|**categoryIds** | **Set&lt;Integer&gt;** | The categories to target |  [optional] |
|**lookbackWindow** | [**LookbackWindowEnum**](#LookbackWindowEnum) | Length of lookback window |  |
|**maxPrice** | **Double** | The max price of targeted skus. |  [optional] |
|**minPrice** | **Double** | The min price of targeted skus. |  [optional] |
|**userAction** | [**UserActionEnum**](#UserActionEnum) | Type of shopper activity used to generate the audience. |  |



## Enum: LookbackWindowEnum

| Name | Value |
|---- | -----|
| P7D | &quot;P7D&quot; |
| P14D | &quot;P14D&quot; |
| P30D | &quot;P30D&quot; |
| P45D | &quot;P45D&quot; |
| P60D | &quot;P60D&quot; |
| P90D | &quot;P90D&quot; |
| P120D | &quot;P120D&quot; |
| P150D | &quot;P150D&quot; |
| P180D | &quot;P180D&quot; |



## Enum: UserActionEnum

| Name | Value |
|---- | -----|
| BUY | &quot;buy&quot; |
| VIEW | &quot;view&quot; |
| ADDTOCART | &quot;addToCart&quot; |



