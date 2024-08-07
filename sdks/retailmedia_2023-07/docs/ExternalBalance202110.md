

# ExternalBalance202110

A Retail Media Balance used to determine the funds available for any or all campaigns in an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**poNumber** | **String** |  |  |
|**memo** | **String** |  |  |
|**deposited** | **BigDecimal** |  |  |
|**spent** | **BigDecimal** |  |  |
|**remaining** | **BigDecimal** |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**privateMarketBillingType** | [**PrivateMarketBillingTypeEnum**](#PrivateMarketBillingTypeEnum) | Billing type for Private Market. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| ACTIVE | &quot;active&quot; |
| ENDED | &quot;ended&quot; |



## Enum: PrivateMarketBillingTypeEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;NotApplicable&quot; |
| BILLBYRETAILER | &quot;BillByRetailer&quot; |
| BILLBYCRITEO | &quot;BillByCriteo&quot; |
| UNKNOWN | &quot;Unknown&quot; |



