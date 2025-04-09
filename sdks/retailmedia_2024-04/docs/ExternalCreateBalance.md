

# ExternalCreateBalance

An object that represents the available options to set when creating a Retail Media Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deposited** | **BigDecimal** | Amount of billable funds allotted to the balance. |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**memo** | **String** | Memo |  |
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  [optional] |
|**salesForceId** | **String** | SalesForceId the balance is linked to. |  |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Type of the balance spend. |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| ONSITE | &quot;Onsite&quot; |
| OFFSITE | &quot;Offsite&quot; |
| OFFSITEAWARENESS | &quot;OffsiteAwareness&quot; |



