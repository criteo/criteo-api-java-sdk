

# LineItemMinBids

Represents minimum bidding guidance calculated for a line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adaptiveMinBid** | **Double** | The lowest strictly positive page-type minimum in the line item&#39;s currency, or zero when no positive minimum exists. |  |
|**adaptiveRecommendedMinBid** | **Double** | The bid below which Adaptive bidding validation emits a low-bid warning in the line item&#39;s currency. |  [optional] |
|**pageTypeMinBids** | [**List&lt;PageTypeMinBid&gt;**](PageTypeMinBid.md) | The minimum bidding guidance for every page type configured on the line item. |  |



