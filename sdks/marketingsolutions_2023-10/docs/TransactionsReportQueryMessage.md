

# TransactionsReportQueryMessage

This is the message defining the query for Transaction report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advertiserIds** | **String** | The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used |  [optional] |
|**eventType** | **String** | Apply a filter on Event type . |  [optional] |
|**currency** | **String** | The currency used for the report. ISO 4217 code (three-letter capitals). |  |
|**format** | **String** | The file format of the generated report: csv, xml, excel or json. |  |
|**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |



