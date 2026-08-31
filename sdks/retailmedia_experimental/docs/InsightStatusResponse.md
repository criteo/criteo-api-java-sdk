

# InsightStatusResponse

Status of an asynchronous insight report request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **String** | When the insight report was created. |  [optional] |
|**expiresAt** | **String** | When the insight report expires and can no longer be downloaded. |  [optional] |
|**fileSizeBytes** | **Long** | Size of the generated report file in bytes, when available. |  [optional] |
|**md5CheckSum** | **String** | MD5 checksum of the generated report file, when available. |  [optional] |
|**message** | **String** | Additional information about the report status, when available. |  [optional] |
|**rowCount** | **Integer** | Number of rows in the generated report, when available. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the insight report. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| PENDING | &quot;Pending&quot; |
| SUCCESS | &quot;Success&quot; |
| FAILURE | &quot;Failure&quot; |
| EXPIRED | &quot;Expired&quot; |
| INVALIDATED | &quot;Invalidated&quot; |



