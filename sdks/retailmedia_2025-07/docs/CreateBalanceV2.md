

# CreateBalanceV2

An object that represents the available options to set when creating a Retail Media Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deposited** | **BigDecimal** | Amount of billable funds allotted to the balance. |  [optional] |
|**endDate** | **LocalDate** | End date of the balance in the format YYYY-MM-DD. |  [optional] |
|**memo** | **String** | Memo |  [optional] |
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  [optional] |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Type of the balance spend. |  |
|**startDate** | **LocalDate** | Start date of the balance in the format YYYY-MM-DD. |  |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| ONSITE | &quot;Onsite&quot; |
| OFFSITE | &quot;Offsite&quot; |
| OFFSITEAWARENESS | &quot;OffsiteAwareness&quot; |



