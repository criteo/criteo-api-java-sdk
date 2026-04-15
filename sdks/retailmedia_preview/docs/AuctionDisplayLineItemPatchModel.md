

# AuctionDisplayLineItemPatchModel

Represents a patch model for updating an auction display line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidding** | [**BiddingRequest**](BiddingRequest.md) |  |  [optional] |
|**budget** | **Double** | The budget for the line item |  [optional] |
|**campaignId** | **String** | The identifier of the campaign to which the line item belongs. |  [optional] |
|**creativeIds** | **List&lt;String&gt;** | The list of creative IDs associated with the line item. |  [optional] |
|**endDate** | **OffsetDateTime** | The end date of the line item. |  [optional] |
|**frequencyCapping** | [**NillableOfLineItemCappingTargetRequest**](NillableOfLineItemCappingTargetRequest.md) |  |  [optional] |
|**isActive** | **Boolean** | Indicates whether the line item is active. |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The media type of the line item (e.g., display or video). |  [optional] |
|**name** | **String** | The name of the line item. |  [optional] |
|**pacing** | [**LineItemPacingRequest**](LineItemPacingRequest.md) |  |  [optional] |
|**pageTypes** | [**List&lt;PageTypesEnum&gt;**](#List&lt;PageTypesEnum&gt;) | The list of page types configured for the line item. |  [optional] |
|**productIds** | **List&lt;String&gt;** | The list of product IDs targeted by the line item. |  [optional] |
|**retailerId** | **String** | The identifier of the retailer associated with the line item. |  [optional] |
|**startDate** | **OffsetDateTime** | The start date of the line item. |  [optional] |
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



