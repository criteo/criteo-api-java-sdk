

# ReportOkResponse

The report on a given operationToken is ready. The report is available for 4 days

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of the operation. The operation is completed when the status is one of (VALIDATED,VALIDATED_WITH_ERRORS,FAILED) |  |
|**importRequestTimestamp** | **String** | The date when the original batch request was sent. |  |
|**numberOfProductsInTheBatch** | **String** | The number of products present in the batch. |  |
|**numberOfProductsUpserted** | **String** | The number of products upserted. |  |
|**numberOfProductsDeleted** | **String** | The number of products deleted. |  |
|**numberOfProductsWithErrors** | **String** | The number of products with errors. |  |
|**errorDetails** | [**List&lt;ReportDetailErrors&gt;**](ReportDetailErrors.md) | The list of errors with details. |  |
|**numberOfProductsWithWarnings** | **String** | The number of products with Warnings. |  |
|**warningDetails** | [**List&lt;ReportDetailWarnings&gt;**](ReportDetailWarnings.md) | The list of Warnings with details. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;ACCEPTED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| VALIDATED | &quot;VALIDATED&quot; |
| VALIDATED_WITH_ERRORS | &quot;VALIDATED_WITH_ERRORS&quot; |
| FAILED | &quot;FAILED&quot; |



