

# VastTagAttributes

The attributes specific to VastTag creatives (read model).  Most fields are derived by parsing the VAST tag and are read-only.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasVpaid** | **Boolean** | Whether the tag contains a VPAID unit (vpaid y/n). Derived from the tag. VPAID is a deprecated  interactivity standard; this flag is recorded for information but interactive playback is not guaranteed. |  [optional] |
|**isSkippable** | **Boolean** | Whether the video is skippable. Derived from the tag. |  [optional] |
|**mimeTypes** | **List&lt;String&gt;** | The supported media-file mime types (e.g. \&quot;video/mp4\&quot;). Derived from the tag. |  [optional] |
|**vastTagUrl** | **String** | The VAST tag URL (a hosted VAST XML endpoint). |  [optional] |
|**vastVersion** | **String** | The VAST version declared by the tag (e.g. \&quot;4.2\&quot;). Derived from the tag. |  [optional] |
|**videoDurationMs** | **Double** | The video duration in milliseconds. Derived from the tag. |  [optional] |



