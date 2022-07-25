

# ExternalPreferredLineItem202110

A Retail Media Preferred Line Item used to hold bid settings for one or many promoted products on a single retailer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD | 
**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**pacing** | [**PacingEnum**](#PacingEnum) |  | 
**capping** | [**ExternalLineItemCapping202110**](ExternalLineItemCapping202110.md) |  |  [optional]
**page** | [**ExternalLineItemPage202110**](ExternalLineItemPage202110.md) |  | 
**targetRetailerId** | **String** |  | 
**budget** | **Double** |  | 
**campaignId** | **String** |  | 
**budgetSpent** | **Double** |  |  [optional]
**budgetRemaining** | **Double** |  |  [optional]
**createdAt** | **OffsetDateTime** |  | 
**updatedAt** | **OffsetDateTime** |  | 
**creativeId** | **String** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ACTIVE | &quot;active&quot;
SCHEDULED | &quot;scheduled&quot;
DRAFT | &quot;draft&quot;
PAUSED | &quot;paused&quot;
BUDGETHIT | &quot;budgetHit&quot;
ENDED | &quot;ended&quot;
ARCHIVED | &quot;archived&quot;
NOFUNDS | &quot;noFunds&quot;



## Enum: PacingEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
STANDARD | &quot;standard&quot;
ACCELERATED | &quot;accelerated&quot;



