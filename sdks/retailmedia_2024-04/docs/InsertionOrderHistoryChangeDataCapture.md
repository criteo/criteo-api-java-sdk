

# InsertionOrderHistoryChangeDataCapture

Data model represents the data change capture of insertion order history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeDetails** | [**ChangeDetails**](ChangeDetails.md) |  |  |
|**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) | Represent the type of change states of the history. |  |
|**dateOfModification** | **OffsetDateTime** | Date when data change has occured. |  |
|**memo** | **String** | Memo associate with the insertion order modification. |  [optional] |
|**modifiedByUser** | **String** | User name who modified the insertion order. |  |



## Enum: ChangeTypeEnum

| Name | Value |
|---- | -----|
| BALANCECREATED | &quot;BalanceCreated&quot; |
| BALANCEADDED | &quot;BalanceAdded&quot; |
| BALANCEREMOVED | &quot;BalanceRemoved&quot; |
| BALANCEUNCAPPED | &quot;BalanceUncapped&quot; |
| BALANCECAPPED | &quot;BalanceCapped&quot; |
| ENDDATE | &quot;EndDate&quot; |
| STARTDATE | &quot;StartDate&quot; |
| BALANCENAME | &quot;BalanceName&quot; |
| PONUMBER | &quot;PoNumber&quot; |
| VALUEADD | &quot;ValueAdd&quot; |
| SALESFORCEID | &quot;SalesforceId&quot; |



