

# ContactlistAmendmentAttributes

the name of the entity type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) | Operation to add or remove users |  |
|**identifierType** | [**IdentifierTypeEnum**](#IdentifierTypeEnum) | What type of identifiers are used |  [optional] |
|**identifiers** | **List&lt;String&gt;** | The users tos add or remove, each in the schema specified |  |
|**gumCallerId** | **Integer** | The Gum caller id of the advertiser patching identifiers of type Gum |  [optional] |
|**internalIdentifiers** | **Boolean** | The flag to indicate if identifiers are external or internal |  [optional] |



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



