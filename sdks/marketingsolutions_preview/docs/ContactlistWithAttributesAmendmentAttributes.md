

# ContactlistWithAttributesAmendmentAttributes

the name of the entity type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) | Whether to add or remove users |  |
|**identifierType** | [**IdentifierTypeEnum**](#IdentifierTypeEnum) | What type of identifiers are used |  |
|**identifiers** | [**List&lt;UserDef&gt;**](UserDef.md) | The users to add or remove, each in the schema specified, defined with attributes |  |
|**gumCallerId** | **Object** | The Gum caller id of the advertiser patching identifiers of type Gum |  [optional] [readonly] |



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



