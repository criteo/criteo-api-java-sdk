

# RmEventsUpdateV1

Settings to target users based on their behavior

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandIds** | **List&lt;String&gt;** | Choose the brands your segment might be interested in |  [optional] |
|**categoryIds** | **List&lt;String&gt;** | Choose the categories your segment might be interested in |  [optional] |
|**lookbackDays** | [**LookbackDaysEnum**](#LookbackDaysEnum) | Number of days of the lookback windows |  [optional] |
|**maxPrice** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |
|**minPrice** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |
|**shopperActivity** | [**ShopperActivityEnum**](#ShopperActivityEnum) | Types of shopper activity. |  [optional] |



## Enum: LookbackDaysEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| LAST7DAYS | &quot;Last7Days&quot; |
| LAST14DAYS | &quot;Last14Days&quot; |
| LAST30DAYS | &quot;Last30Days&quot; |
| LAST45DAYS | &quot;Last45Days&quot; |
| LAST60DAYS | &quot;Last60Days&quot; |
| LAST90DAYS | &quot;Last90Days&quot; |
| LAST120DAYS | &quot;Last120Days&quot; |
| LAST150DAYS | &quot;Last150Days&quot; |
| LAST180DAYS | &quot;Last180Days&quot; |



## Enum: ShopperActivityEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| VIEW | &quot;View&quot; |
| BUY | &quot;Buy&quot; |
| ADDTOCART | &quot;AddToCart&quot; |



