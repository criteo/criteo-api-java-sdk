

# OnSiteRecoRequest

Recommendation request parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nbRequestedProducts** | **Integer** | Amount of products to recommend. |  |
|**userId** | **String** | Used to retrieve user events from Criteo trackers. Optional if UserEvents are passed. |  [optional] |
|**identityType** | [**IdentityTypeEnum**](#IdentityTypeEnum) | Type of the user identifier (cto_bundle, Idfa, Gaid...)  Optional if UserId is not set or if its type is cto_bundle |  [optional] |
|**userEvents** | [**List&lt;UserEvent&gt;**](UserEvent.md) | Used to perform a recommendation without relying on events stored for a UserId. Optional if UserId is passed. |  [optional] |
|**adSetId** | **Integer** | Id of the AdSet. This field is optional and is resolved automatically for adsets previously configured. |  [optional] |
|**adId** | **Integer** | Id of the Ad. This field is optional, it allows to setup Reco controls at Ad level. |  [optional] |
|**partnerId** | **Integer** | Id of the partner. |  |



## Enum: IdentityTypeEnum

| Name | Value |
|---- | -----|
| CTOBUNDLE | &quot;CtoBundle&quot; |
| IDFA | &quot;Idfa&quot; |
| GAID | &quot;Gaid&quot; |



