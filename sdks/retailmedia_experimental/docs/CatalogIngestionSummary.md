

# CatalogIngestionSummary

Summary report of a catalog ingestion: identification, timing, status, volume, delta and data quality.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**componentId** | **String** |  |  [optional] |
|**dataQuality** | [**CatalogIngestionReportingDataQuality**](CatalogIngestionReportingDataQuality.md) |  |  [optional] |
|**delta** | [**CatalogIngestionReportingDelta**](CatalogIngestionReportingDelta.md) |  |  [optional] |
|**duration** | **String** | Total ingestion processing time as an ISO 8601 duration. |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**error** | [**CatalogIngestionReportingError**](CatalogIngestionReportingError.md) |  |  [optional] |
|**ingestionStatus** | **IngestionStatus** |  |  [optional] |
|**ingestionType** | **IngestionType** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**merchantName** | **String** |  |  [optional] |
|**multiSource** | [**MultiSourceReporting**](MultiSourceReporting.md) |  |  [optional] |
|**multiSourceReportingStatus** | **MultiSourceReportingStatus** |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**trigger** | [**CatalogIngestionReportingTrigger**](CatalogIngestionReportingTrigger.md) |  |  [optional] |
|**volume** | [**CatalogIngestionReportingVolume**](CatalogIngestionReportingVolume.md) |  |  [optional] |



