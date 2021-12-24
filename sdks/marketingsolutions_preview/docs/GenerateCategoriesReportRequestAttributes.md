

# GenerateCategoriesReportRequestAttributes

This is the message defining the query for Categories report

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **List&lt;String&gt;** | List of Advertiser ids. | 
**campaignId** | **String** | Report only on the specified Campaign id. |  [optional]
**adsetId** | **String** | Report only on the specified AdSet id. |  [optional]
**domain** | **String** | Report only on the specified domain. |  [optional]
**category** | **String** | Report only on the specified category. |  [optional]
**shouldDisplayDomainDimension** | **Boolean** | Specify if the domain dimension is displayed in the report. |  [optional]
**format** | **String** | The file format of the generated report: csv, xml, excel or json. | 
**timezone** | **String** | The timezone used for the report. Timezone Database format (Tz). |  [optional]
**startDate** | **OffsetDateTime** | Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. | 
**endDate** | **OffsetDateTime** | End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored. | 



