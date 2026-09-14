

# ScheduleDetailsCreateModel

Flight dates of the campaign. Applies to SponsoredProducts only; OnsiteDisplay campaigns  derive their dates from their line items and reject this node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **OffsetDateTime** | Campaign end date. Pass exactly {9999-12-30T00:00:00Z} for a SponsoredProducts campaign that  runs indefinitely; any other value, including a neighbouring far-future date, is a real end date. |  |
|**startDate** | **OffsetDateTime** | Campaign start date. |  |



