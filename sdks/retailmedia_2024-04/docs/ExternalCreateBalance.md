

# ExternalCreateBalance

An object that represents the available options to set when creating a Retail Media Balance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the balance. |  |
|**poNumber** | **String** | Purchase Order number. |  [optional] |
|**deposited** | **BigDecimal** | Amount of billable funds allotted to the balance. |  |
|**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD |  |
|**spendType** | [**SpendTypeEnum**](#SpendTypeEnum) | Type of the balance spend. |  |
|**memo** | **String** | Memo |  |
|**salesForceId** | **String** | SalesForceId the balance is linked to. |  |



## Enum: SpendTypeEnum

| Name | Value |
|---- | -----|
| ONSITE | &quot;Onsite&quot; |
| OFFSITE | &quot;Offsite&quot; |
| OFFSITEAWARENESS | &quot;OffsiteAwareness&quot; |



