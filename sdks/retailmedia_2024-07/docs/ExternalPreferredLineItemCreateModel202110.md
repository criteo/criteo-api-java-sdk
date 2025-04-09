

# ExternalPreferredLineItemCreateModel202110

Model used to create a preferred line item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**budget** | **Double** |  |  |
|**capping** | [**ExternalLineItemCapping202110**](ExternalLineItemCapping202110.md) |  |  [optional] |
|**creativeId** | **String** |  |  [optional] |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**name** | **String** |  |  |
|**pacing** | [**PacingEnum**](#PacingEnum) |  |  |
|**page** | [**ExternalLineItemPage202110**](ExternalLineItemPage202110.md) |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**targetRetailerId** | **String** |  |  |



## Enum: PacingEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| STANDARD | &quot;standard&quot; |
| ACCELERATED | &quot;accelerated&quot; |



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



