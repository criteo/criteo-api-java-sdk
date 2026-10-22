

# ChangeHistoryEntity

Entity associated with a change-history entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignId** | **String** | External opaque campaign identifier when the changed entity belongs to a campaign (for example a line item). Omitted otherwise; omission and &#x60;null&#x60; have the same meaning.  |  [optional] |
|**id** | **String** | External opaque identifier of the entity that changed. |  |
|**type** | **String** | Type of entity that changed, such as &#x60;campaign&#x60;, &#x60;lineItem&#x60;, &#x60;balance&#x60;, &#x60;audience&#x60;, &#x60;audienceSegment&#x60;, &#x60;creative&#x60;, or &#x60;targetingList&#x60;. Additional values may be returned.  |  |



