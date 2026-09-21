

# ExamAdClickTracking

An ad-level click tracking rule. A rule wraps the landing url of the clicks it covers with a prefix and a  suffix. It applies either to the whole ad (neither clickZone nor a display size set), to one banner zone  (clickZone set), or to one display size (displayWidth and displayHeight both set).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bindingId** | **String** | Unique ID of the ad the rule belongs to. It always names the ad of the request path, so it can be left  out of a write; when it is sent it must match that ad, and a rule naming another one is refused. |  [optional] |
|**clickZone** | [**ClickZoneEnum**](#ClickZoneEnum) | The banner zone this rule applies to. Leave it out for a rule that is not specific to a zone.  Possible values are \&quot;AppInstall\&quot;, \&quot;Coupon\&quot;, \&quot;Logo\&quot;, \&quot;Main\&quot;, \&quot;Product\&quot;, \&quot;Store\&quot;, \&quot;Video\&quot; and  \&quot;BrandingImage\&quot;. |  [optional] |
|**disableForCoupons** | **Boolean** | Whether this rule is skipped for clicks on coupons. |  [optional] |
|**disableLandingUrlEncode** | **Boolean** | Whether the landing url is left unencoded when it is substituted into the tracking url. |  [optional] |
|**disableMacroUrlEncode** | **Boolean** | Whether url macros are left unencoded when they are substituted into the tracking url. |  [optional] |
|**displayHeight** | **Integer** | The height in pixels of the display size this rule applies to. Set it together with displayWidth, and  leave both out for a rule that is not specific to a display size. |  [optional] |
|**displayWidth** | **Integer** | The width in pixels of the display size this rule applies to. Set it together with displayHeight, and  leave both out for a rule that is not specific to a display size. |  [optional] |
|**id** | **String** | Unique ID of the click tracking rule. Leave it out to create a rule; send back the ID of an existing  rule to update it. Rules of the ad that are absent from a write request are deleted. |  [optional] |
|**urlPrefix** | **String** | The url prepended to the landing url of the clicks this rule covers. |  [optional] |
|**urlSuffix** | **String** | The url appended to the landing url of the clicks this rule covers. |  [optional] |



## Enum: ClickZoneEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| APPINSTALL | &quot;AppInstall&quot; |
| COUPON | &quot;Coupon&quot; |
| LOGO | &quot;Logo&quot; |
| MAIN | &quot;Main&quot; |
| PRODUCT | &quot;Product&quot; |
| STORE | &quot;Store&quot; |
| VIDEO | &quot;Video&quot; |
| BRANDINGIMAGE | &quot;BrandingImage&quot; |



