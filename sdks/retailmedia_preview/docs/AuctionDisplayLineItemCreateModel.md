

# AuctionDisplayLineItemCreateModel

Model for creating an auction display line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidding** | [**BiddingRequest**](BiddingRequest.md) |  |  |
|**budget** | **Double** | The budget for the line item |  |
|**creativeIds** | **List&lt;String&gt;** | The list of creative ids associated with the line item. |  |
|**endDate** | **OffsetDateTime** | The end date of the line item. |  [optional] |
|**frequencyCapping** | [**LineItemCappingTargetRequest**](LineItemCappingTargetRequest.md) |  |  [optional] |
|**isActive** | **Boolean** | Indicates whether the line item is active. |  |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The media type of the line item. |  |
|**name** | **String** | The name of the line item. |  |
|**pacing** | [**LineItemPacingRequest**](LineItemPacingRequest.md) |  |  |
|**pageTypes** | [**List&lt;PageTypesEnum&gt;**](#List&lt;PageTypesEnum&gt;) | The list of page types configured for the line item. |  |
|**productIds** | **List&lt;String&gt;** | The list of product ids associated with the line item. |  |
|**retailerId** | **String** | The retailer id of the associated retailer. |  |
|**startDate** | **OffsetDateTime** | The start date of the line item. |  |
|**targets** | [**TargetsRequest**](TargetsRequest.md) |  |  [optional] |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| DISPLAY | &quot;display&quot; |
| VIDEO | &quot;video&quot; |



## Enum: List&lt;PageTypesEnum&gt;

| Name | Value |
|---- | -----|
| SEARCH | &quot;search&quot; |
| HOME | &quot;home&quot; |
| CHECKOUT | &quot;checkout&quot; |
| CATEGORY | &quot;category&quot; |
| PRODUCTDETAIL | &quot;productDetail&quot; |
| CONFIRMATION | &quot;confirmation&quot; |
| MERCHANDISING | &quot;merchandising&quot; |
| DEALS | &quot;deals&quot; |
| FAVORITES | &quot;favorites&quot; |
| SEARCHBAR | &quot;searchBar&quot; |
| CATEGORYMENU | &quot;categoryMenu&quot; |



