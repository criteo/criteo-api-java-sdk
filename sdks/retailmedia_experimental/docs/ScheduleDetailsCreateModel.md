

# ScheduleDetailsCreateModel

Flight dates the campaign holds itself. A SponsoredProducts or OnsiteDisplay Auction campaign  owns its dates and requires this node; any other OnsiteDisplay campaign derives its dates from  its line items and rejects it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **OffsetDateTime** | Campaign end date. Pass exactly {9999-12-30T00:00:00Z} for a SponsoredProducts campaign that  runs indefinitely; any other value, including a neighbouring far-future date, is a real end date.  An OnsiteDisplay Auction campaign cannot run indefinitely and rejects that date. |  |
|**startDate** | **OffsetDateTime** | Campaign start date. |  |



