

# BalanceResponseV2

A Retail Media Balance used to determine the funds available for any or all campaigns in an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  [optional] |
|**memo** | **String** | Memo. |  [optional] |
|**deposited** | **BigDecimal** | Amount of billable funds allotted to the balance. |  [optional] |
|**spent** | **BigDecimal** | Amount of spent funds of the balance. |  [optional] |
|**remaining** | **BigDecimal** | Amount of remaining funds of the balance. |  [optional] |
|**startDate** | **String** | Start date of the balance in the format YYYY-MM-DD. |  |
|**endDate** | **String** | End date of the balance in the format YYYY-MM-DD. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the balance. |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation time of the balance. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Update time of the balance. |  [optional] |
|**balanceType** | [**BalanceTypeEnum**](#BalanceTypeEnum) | Type of the balance. |  |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Spend Type of the balance. |  |
|**privateMarketBillingType** | [**PrivateMarketBillingTypeEnum**](#PrivateMarketBillingTypeEnum) | Billing type for Private Market of the balance. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| ACTIVE | &quot;active&quot; |
| ENDED | &quot;ended&quot; |



## Enum: BalanceTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| CAPPED | &quot;capped&quot; |
| UNCAPPED | &quot;uncapped&quot; |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| ONSITE | &quot;Onsite&quot; |
| OFFSITE | &quot;Offsite&quot; |
| OFFSITEAWARENESS | &quot;OffsiteAwareness&quot; |



## Enum: PrivateMarketBillingTypeEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| BILLBYRETAILER | &quot;billByRetailer&quot; |
| BILLBYCRITEO | &quot;billByCriteo&quot; |
| UNKNOWN | &quot;unknown&quot; |



