

# ChangeHistoryEntryResponse

A single configuration change.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorRole** | **ActorRole** |  |  |
|**changes** | [**List&lt;ChangedField&gt;**](ChangedField.md) | Old and new values for each field changed as part of this event. |  |
|**entity** | [**ChangeHistoryEntryResponseEntity**](ChangeHistoryEntryResponseEntity.md) |  |  |
|**eventType** | **String** | Semantic type of the configuration change, &#x60;&lt;entityType&gt;&lt;Action&gt;&#x60; style — for example &#x60;campaignCreated&#x60;, &#x60;lineItemUpdated&#x60;, &#x60;balanceUpdated&#x60;. Additional values may be returned.  |  |
|**occurredAt** | **OffsetDateTime** | UTC timestamp when the change occurred (ISO-8601). |  |



