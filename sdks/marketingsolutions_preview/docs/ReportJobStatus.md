

# ReportJobStatus

Status of a report export job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportId** | **String** | ID of the report job |  [optional] |
|**message** | **String** | Optional informational message (e.g. rows_count&#x3D;1232) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the report job |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| DONE | &quot;Done&quot; |
| FAILURE | &quot;Failure&quot; |
| EXPIRED | &quot;Expired&quot; |



