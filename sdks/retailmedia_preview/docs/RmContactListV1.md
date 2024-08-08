

# RmContactListV1

Settings to target users with your contact lists.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isReadOnly** | **Boolean** | Is the segment read-only |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates contact list type |  [optional] |
|**sharingStatus** | [**SharingStatusEnum**](#SharingStatusEnum) | Indicates if the contact list is shared with other accounts |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| EMAIL | &quot;Email&quot; |
| USERIDENTIFIER | &quot;UserIdentifier&quot; |
| IDENTITYLINK | &quot;IdentityLink&quot; |
| CUSTOMERID | &quot;CustomerId&quot; |



## Enum: SharingStatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| NOTSHARED | &quot;NotShared&quot; |
| SHAREDWITHALL | &quot;SharedWithAll&quot; |
| SHAREDWITHDEMANDACCOUNTS | &quot;SharedWithDemandAccounts&quot; |



