

# ScheduleDetailsModel

Flight dates of the campaign. Always complete: both dates are present on every read.  A SponsoredProducts campaign that runs indefinitely reports the documented indefinite end date  rather than omitting it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **OffsetDateTime** | Campaign end date. A SponsoredProducts campaign that runs indefinitely reports  {9999-12-30T00:00:00Z}. |  [optional] |
|**startDate** | **OffsetDateTime** | Campaign start date. Defaults to the creation timestamp. |  [optional] |



