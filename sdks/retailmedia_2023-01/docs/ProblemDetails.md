

# ProblemDetails

Data model for common error or warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**traceId** | **String** | The request correlation ID this problem comes from. |  [optional]
**traceIdentifier** | **String** | The request correlation ID this problem comes from. (deprecated, use traceId instead) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The problem&#39;s category. |  [optional]
**code** | **String** | A machine-readable  error code, expressed as a string value. |  [optional]
**instance** | **String** | A URI that identifies the specific occurrence of the problem. |  [optional]
**title** | **String** | A short human-readable description of the problem type |  [optional]
**detail** | **String** | A human-readable explanation specific to this occurrence of the problem |  [optional]
**source** | **Map&lt;String, String&gt;** | A machine-readable structure to reference to the exact location(s) causing the error(s) |  [optional]
**stackTrace** | **String** | Technical information, only used in non-prod environments |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ACCESS_CONTROL | &quot;access-control&quot;
AUTHENTICATION | &quot;authentication&quot;
AUTHORIZATION | &quot;authorization&quot;
AVAILABILITY | &quot;availability&quot;
DEPRECATION | &quot;deprecation&quot;
QUOTA | &quot;quota&quot;
VALIDATION | &quot;validation&quot;



