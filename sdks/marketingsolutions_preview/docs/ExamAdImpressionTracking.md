

# ExamAdImpressionTracking

An ad-level impression tracking rule. The rule calls its url when an impression it covers is served. It  applies either to the whole ad (no display size set) or to one display size (displayWidth and displayHeight  both set).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindingId** | **String** | Unique ID of the ad the rule belongs to. It always names the ad of the request path, so it can be left  out of a write; when it is sent it must match that ad, and a rule naming another one is refused. |  [optional] |
|**displayHeight** | **Integer** | The height in pixels of the display size this rule applies to. Set it together with displayWidth, and  leave both out for a rule that is not specific to a display size. |  [optional] |
|**displayWidth** | **Integer** | The width in pixels of the display size this rule applies to. Set it together with displayHeight, and  leave both out for a rule that is not specific to a display size. |  [optional] |
|**id** | **String** | Unique ID of the impression tracking rule. Leave it out to create a rule; send back the ID of an  existing rule to update it. Rules of the ad that are absent from a write request are deleted. |  [optional] |
|**url** | **String** | The url called when an impression covered by this rule is served. |  [optional] |
|**vendorId** | **String** | Unique ID of the third party vendor the tracking url belongs to. |  [optional] |



