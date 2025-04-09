

# ExternalBalanceResponse

A Retail Media Balance used to determine the funds available for any or all campaigns in an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balanceType** | [**BalanceTypeEnum**](#BalanceTypeEnum) | Type of the balance |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**deposited** | **BigDecimal** | Amount of billable funds allotted to the balance. |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**memo** | **String** | Memo |  |
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  |
|**privateMarketBillingType** | [**PrivateMarketBillingTypeEnum**](#PrivateMarketBillingTypeEnum) | Billing type for Private Market. |  |
|**remaining** | **BigDecimal** |  |  |
|**salesForceId** | **String** | SalesForceId the balance is linked to. |  |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Spend Type of the balance. |  |
|**spent** | **BigDecimal** |  |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: BalanceTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| CAPPED | &quot;capped&quot; |
| UNCAPPED | &quot;uncapped&quot; |



## Enum: PrivateMarketBillingTypeEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| BILLBYRETAILER | &quot;billByRetailer&quot; |
| BILLBYCRITEO | &quot;billByCriteo&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| ONSITE | &quot;Onsite&quot; |
| OFFSITE | &quot;Offsite&quot; |
| OFFSITEAWARENESS | &quot;OffsiteAwareness&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| ACTIVE | &quot;active&quot; |
| ENDED | &quot;ended&quot; |



