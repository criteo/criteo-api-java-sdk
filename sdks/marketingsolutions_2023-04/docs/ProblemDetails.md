

# ProblemDetails

Data model for common error or warning

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**traceId** | **String** | The request correlation ID this problem comes from. |  [optional] |
|**traceIdentifier** | **String** | The request correlation ID this problem comes from. (deprecated, use traceId instead) |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**instance** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**detail** | **String** |  |  [optional] |
|**source** | **Map&lt;String, String&gt;** |  |  [optional] |
|**stackTrace** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ACCESS_CONTROL | &quot;access-control&quot; |
| AUTHENTICATION | &quot;authentication&quot; |
| AUTHORIZATION | &quot;authorization&quot; |
| AVAILABILITY | &quot;availability&quot; |
| DEPRECATION | &quot;deprecation&quot; |
| QUOTA | &quot;quota&quot; |
| VALIDATION | &quot;validation&quot; |



