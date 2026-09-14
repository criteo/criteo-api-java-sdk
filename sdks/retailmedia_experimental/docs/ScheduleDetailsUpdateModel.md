

# ScheduleDetailsUpdateModel

New flight dates for a SponsoredProducts campaign. Omit the whole node to leave the schedule  unchanged; when present, both dates are required together.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **OffsetDateTime** | New campaign end date. Pass exactly {9999-12-30T00:00:00Z} to make the campaign run  indefinitely; any other value is a real end date. |  |
|**startDate** | **OffsetDateTime** | New campaign start date. |  |



