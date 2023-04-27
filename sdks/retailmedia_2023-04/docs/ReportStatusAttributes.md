

# ReportStatusAttributes

Report Status Attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | Timestamp when the report started to execute |  [optional] |
|**expiresAt** | **OffsetDateTime** | Timestamp when the cached report will expire |  [optional] |
|**fileSizeBytes** | **Long** | Total size of file, only populated on success |  [optional] |
|**md5Checksum** | **String** | The MD5 checksum of the content, only populated on success |  [optional] |
|**message** | **String** | Failure message, only populated on failure |  [optional] |
|**rowCount** | **Long** | Rows of data in report, only populated on success |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | One of \&quot;pending\&quot;, \&quot;success\&quot;, \&quot;failure\&quot;, or \&quot;expired\&quot; |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| EXPIRED | &quot;expired&quot; |



