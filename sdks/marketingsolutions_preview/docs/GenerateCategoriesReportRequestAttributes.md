

# GenerateCategoriesReportRequestAttributes

This is the message defining the query for Categories report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adsetId** | **String** | Report only on the specified AdSet id. |  [optional] |
|**advertiserIds** | **List&lt;String&gt;** | List of Advertiser ids. |  |
|**campaignId** | **String** | Report only on the specified Campaign id. |  [optional] |
|**category** | **String** | Report only on the specified category. |  [optional] |
|**domain** | **String** | Report only on the specified domain. |  [optional] |
|**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**format** | **String** | The file format of the generated report: csv, xml, excel or json. |  |
|**shouldDisplayDomainDimension** | **Boolean** | Specify if the domain dimension is displayed in the report. |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. |  |
|**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional] |



