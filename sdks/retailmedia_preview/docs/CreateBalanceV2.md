

# CreateBalanceV2

An object that represents the available options to set when creating a Retail Media Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  [optional] |
|**deposited** | **BigDecimal** | Amount of billable funds allotted to the balance. |  [optional] |
|**startDate** | **String** | Start date of the balance in the format YYYY-MM-DD. |  |
|**endDate** | **String** | End date of the balance in the format YYYY-MM-DD. |  [optional] |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Type of the balance spend. |  |
|**memo** | **String** | Memo |  [optional] |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| ONSITE | &quot;Onsite&quot; |
| OFFSITE | &quot;Offsite&quot; |
| OFFSITEAWARENESS | &quot;OffsiteAwareness&quot; |



