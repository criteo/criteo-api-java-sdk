

# RetailMediaContactlistAmendmentAttributes

Attributes of retail media contact list amendment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) | Whether to add or remove users |  |
|**identifierType** | [**IdentifierTypeEnum**](#IdentifierTypeEnum) | What type of identifiers are used |  [optional] |
|**identifiers** | **List&lt;String&gt;** | The users to add or remove, each in the schema specified |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |



## Enum: IdentifierTypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| MADID | &quot;madid&quot; |
| IDENTITYLINK | &quot;identityLink&quot; |
| GUM | &quot;gum&quot; |
| CUSTOMERID | &quot;customerid&quot; |
| PHONENUMBER | &quot;phoneNumber&quot; |



