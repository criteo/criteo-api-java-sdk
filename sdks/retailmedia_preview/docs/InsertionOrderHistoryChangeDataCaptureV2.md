

# InsertionOrderHistoryChangeDataCaptureV2

Data model represents the data change capture of insertion order history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateOfModification** | **OffsetDateTime** | Date when data change has occured. |  |
|**modifiedByUser** | **String** | Username who modified the insertion order. |  |
|**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) | Represent the type of change states of the history. |  |
|**changeDetails** | [**ChangeDetailsV2**](ChangeDetailsV2.md) |  |  |
|**memo** | **String** | Memo associate with the insertion order modification. |  [optional] |



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
| UNKNOWN | &quot;Unknown&quot; |



