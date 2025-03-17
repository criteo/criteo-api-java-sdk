

# PartnerBillingReportStatusV1

Status info of a Partner Billing Report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Status of the report. |  |
|**errorMessage** | **String** | Possible error message along with the status. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date when the report request is created. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| SUCCESS | &quot;Success&quot; |
| FAILED | &quot;Failed&quot; |
| EXPIRED | &quot;Expired&quot; |



