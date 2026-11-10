

# LineItemMinBidResponse

Represents the minimum bid guidance of a line item using Adaptive bidding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**biddingType** | [**BiddingTypeEnum**](#BiddingTypeEnum) | The type of bidding the guidance applies to. It matches the populated details:  Criteo.RetailMedia.LineItem.Bid.Contract.V1.Models.BiddingType.CpmBidding for CPM details and Criteo.RetailMedia.LineItem.Bid.Contract.V1.Models.BiddingType.CpcBidding for CPC details. |  |
|**cpcMinBidDetails** | [**CpcMinBidDetails**](CpcMinBidDetails.md) |  |  [optional] |
|**cpmMinBidDetails** | [**CpmMinBidDetails**](CpmMinBidDetails.md) |  |  [optional] |



## Enum: BiddingTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| CPMBIDDING | &quot;CpmBidding&quot; |
| CPCBIDDING | &quot;CpcBidding&quot; |



