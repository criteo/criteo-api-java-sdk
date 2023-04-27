

# OnSiteRecoRequest

Recommendation request parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nbRequestedProducts** | **Integer** | Amount of products to recommend. |  |
|**userId** | **String** | Used to retrieve user events from Criteo trackers. Optional if UserEvents are passed. |  [optional] |
|**userEvents** | [**List&lt;UserEvent&gt;**](UserEvent.md) | Used to perform a recommendation without relying on events stored for a UserId. Optional if UserId is passed. |  [optional] |
|**adSetId** | **Integer** | Id of the AdSet. This field is optional and is resolved automatically for adsets previously configured. |  [optional] |
|**partnerId** | **Integer** | Id of the partner. |  |



