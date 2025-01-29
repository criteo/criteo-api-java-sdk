

# ExternalPreferredLineItemV2

A Retail Media Preferred Line Item used to hold bid settings for one or many promoted products on a single retailer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**status** | [**StatusEnum**](#StatusEnum) | Line Item Status Enum |  |
|**pacing** | [**PacingEnum**](#PacingEnum) |  |  [optional] |
|**capping** | [**ExternalLineItemCappingV2**](ExternalLineItemCappingV2.md) |  |  [optional] |
|**page** | [**ExternalLineItemPageV2**](ExternalLineItemPageV2.md) |  |  [optional] |
|**targetRetailerId** | **String** |  |  |
|**budget** | **BigDecimal** |  |  [optional] |
|**campaignId** | **String** |  |  |
|**budgetSpent** | **BigDecimal** |  |  [optional] |
|**budgetRemaining** | **BigDecimal** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**creativeId** | **String** | External creative Id |  [optional] |



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



