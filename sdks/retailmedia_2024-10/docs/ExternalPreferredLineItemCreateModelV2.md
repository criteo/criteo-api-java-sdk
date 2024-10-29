

# ExternalPreferredLineItemCreateModelV2

Model used to create a preferred line item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**status** | [**StatusEnum**](#StatusEnum) | Line Item Status Enum |  [optional] |
|**pacing** | [**PacingEnum**](#PacingEnum) | Line Item Pacing Enum |  |
|**capping** | [**ExternalLineItemCappingV2**](ExternalLineItemCappingV2.md) |  |  [optional] |
|**page** | [**ExternalLineItemPageV2**](ExternalLineItemPageV2.md) |  |  |
|**targetRetailerId** | **String** |  |  |
|**budget** | **Double** |  |  |
|**creativeId** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ACTIVE | &quot;active&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| DRAFT | &quot;draft&quot; |
| PAUSED | &quot;paused&quot; |
| BUDGETHIT | &quot;budgetHit&quot; |
| ENDED | &quot;ended&quot; |
| ARCHIVED | &quot;archived&quot; |
| NOFUNDS | &quot;noFunds&quot; |



## Enum: PacingEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| STANDARD | &quot;standard&quot; |
| ACCELERATED | &quot;accelerated&quot; |



