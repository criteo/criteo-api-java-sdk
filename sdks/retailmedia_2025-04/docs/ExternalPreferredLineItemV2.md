

# ExternalPreferredLineItemV2

A Retail Media Preferred Line Item used to hold bid settings for one or many promoted products on a single retailer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**budget** | **BigDecimal** |  |  [optional] |
|**budgetRemaining** | **BigDecimal** |  |  [optional] |
|**budgetSpent** | **BigDecimal** |  |  [optional] |
|**campaignId** | **String** |  |  |
|**capping** | [**ExternalLineItemCappingV2**](ExternalLineItemCappingV2.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**creativeId** | **String** | External creative Id |  [optional] |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**id** | **String** | Id of the entity |  [optional] |
|**name** | **String** |  |  |
|**pacing** | [**PacingEnum**](#PacingEnum) |  |  [optional] |
|**page** | [**ExternalLineItemPageV2**](ExternalLineItemPageV2.md) |  |  [optional] |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**status** | [**StatusEnum**](#StatusEnum) | Line Item Status Enum |  |
|**targetRetailerId** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



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



