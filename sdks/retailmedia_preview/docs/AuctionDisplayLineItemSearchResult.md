

# AuctionDisplayLineItemSearchResult

Represents the response model for a searched auction display line item, including proposal review status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bidding** | [**Bidding**](Bidding.md) |  |  |
|**budget** | **Double** | The budget for the line item |  |
|**campaignId** | **String** | The identifier of the campaign to which the line item belongs. |  |
|**creativeIds** | **List&lt;String&gt;** | The list of creative IDs associated with the line item. |  |
|**endDate** | **OffsetDateTime** | The end date of the line item. |  [optional] |
|**frequencyCapping** | [**LineItemCappingTarget**](LineItemCappingTarget.md) |  |  [optional] |
|**isProposal** | **Boolean** | Indicates whether the line item is a proposal. |  |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The media type of the line item (e.g., display or video). |  |
|**name** | **String** | The name of the line item. |  |
|**pacing** | [**LineItemPacing**](LineItemPacing.md) |  |  |
|**pageTypes** | [**List&lt;PageTypesEnum&gt;**](#List&lt;PageTypesEnum&gt;) | The list of page types where the line item can be displayed. |  |
|**productIds** | **List&lt;String&gt;** | The list of product IDs targeted by the line item. |  |
|**proposalStatus** | [**ProposalStatus**](ProposalStatus.md) |  |  [optional] |
|**retailerId** | **String** | The identifier of the retailer associated with the line item. |  |
|**startDate** | **OffsetDateTime** | The start date of the line item. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the line item. |  |
|**targets** | [**Targets**](Targets.md) |  |  [optional] |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| DISPLAY | &quot;display&quot; |
| VIDEO | &quot;video&quot; |



## Enum: List&lt;PageTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ACTIVE | &quot;active&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| DRAFT | &quot;draft&quot; |
| PAUSED | &quot;paused&quot; |
| BUDGETHIT | &quot;budgetHit&quot; |
| ENDED | &quot;ended&quot; |
| ARCHIVED | &quot;archived&quot; |
| NOFUNDS | &quot;noFunds&quot; |



