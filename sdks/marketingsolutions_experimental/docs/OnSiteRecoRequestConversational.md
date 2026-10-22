

# OnSiteRecoRequestConversational

Conversational recommendation request parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adId** | **Integer** | Id of the Ad. This field is optional, it allows to setup Reco controls at Ad level. |  [optional] |
|**adSetId** | **Integer** | Id of the AdSet. This field is optional and is resolved automatically for adsets previously configured. |  |
|**conversation** | [**List&lt;OnSiteRecoChatMessage&gt;**](OnSiteRecoChatMessage.md) | Conversation between the user and the agent. |  |
|**identityType** | [**IdentityTypeEnum**](#IdentityTypeEnum) | Type of the user identifier (CtoBundle, Idfa, Gaid, AgenticUserId...) Optional if its type is CtoBundle |  [optional] |
|**nbRequestedProducts** | **Integer** | Amount of products to recommend. |  |
|**partnerId** | **Integer** | Id of the partner. |  |
|**product** | [**ProductContext**](ProductContext.md) |  |  [optional] |
|**userId** | **String** | One user identifier: a Criteo bundle, GAID, IDFA, internal user id, or an agentic partner user id. |  |
|**userIdOrigin** | **String** | When IdentityType is AgenticUserId, the issuer should recognize themselves with their organization name issued by Criteo. |  [optional] |



## Enum: IdentityTypeEnum

| Name | Value |
|---- | -----|
| CTOBUNDLE | &quot;CtoBundle&quot; |
| IDFA | &quot;Idfa&quot; |
| GAID | &quot;Gaid&quot; |
| INTERNALUSERID | &quot;InternalUserId&quot; |
| AGENTICUSERID | &quot;AgenticUserId&quot; |



