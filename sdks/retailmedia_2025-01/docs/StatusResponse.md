

# StatusResponse

Status of an async report request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**rowCount** | **Integer** |  |  [optional] |
|**fileSizeBytes** | **Long** |  |  [optional] |
|**md5CheckSum** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**expiresAt** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| EXPIRED | &quot;expired&quot; |



