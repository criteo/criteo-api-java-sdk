

# CreateBalanceV1

An object that represents the available options to set when creating a Retail Media Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deposited** | **Double** | Amount of billable funds allotted to the balance. |  |
|**endDate** | **String** | End date of the balance in the format YYYY-MM-DD. |  |
|**memo** | **String** | Memo |  |
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  [optional] |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Type of the balance spend. |  |
|**startDate** | **String** | Start date of the balance in the format YYYY-MM-DD. |  |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ONSITE | &quot;onsite&quot; |
| OFFSITE | &quot;offsite&quot; |
| OFFSITEAWARENESS | &quot;offsiteAwareness&quot; |



