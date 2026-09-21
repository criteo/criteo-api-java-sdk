

# ShowcaseWriteAttributes

The attributes specific to create or update a Showcase creative (write).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**androidDeeplinkUrl** | **URI** | Android deep-link URL. |  [optional] |
|**appLinkUrl** | **URI** | App link URL (Android fallback). |  [optional] |
|**brandingImageBase64Strings** | [**List&lt;BrandingImageInput&gt;**](BrandingImageInput.md) | Branding images as base-64 encoded strings with their shape. |  [optional] |
|**brandingImageClickUrl** | **URI** | Click URL associated with the branding images. |  [optional] |
|**callsToAction** | **List&lt;String&gt;** | A Call-to-Action (CTA) is an action-driven instruction to your audience intended to provoke an immediate  response, such as \&quot;Buy now\&quot; or \&quot;Go!\&quot;. |  |
|**colors** | [**ShowcaseColors**](ShowcaseColors.md) |  |  |
|**iosDeeplinkUrl** | **URI** | iOS deep-link URL. |  [optional] |
|**landingPageUrl** | **URI** | Web redirection of the landing page URL. |  [optional] |
|**layouts** | [**List&lt;LayoutsEnum&gt;**](#List&lt;LayoutsEnum&gt;) | The layouts to enable for this Showcase creative.  Possible values include \&quot;Showcase\&quot;. |  |
|**logoBase64Strings** | [**List&lt;LogoInput&gt;**](LogoInput.md) | Logo images as base-64 encoded strings with their shape.  At least one logo is required. |  |
|**metaSetting** | [**ShowcaseMetaSetting**](ShowcaseMetaSetting.md) |  |  [optional] |
|**priceSettings** | [**ShowcasePriceSettings**](ShowcasePriceSettings.md) |  |  [optional] |
|**primaryFont** | **String** | Font of the primary font.  Valid supported font like \&quot;Arial\&quot; |  [optional] |
|**productImageDisplay** | [**ProductImageDisplayEnum**](#ProductImageDisplayEnum) | Value can be \&quot;ShowFullImage\&quot; or \&quot;ZoomOnImage\&quot;. Choose whether your product catalog images should fit inside the allocated  space (\&quot;ShowFullImage\&quot;) or whether they should fill that space (\&quot;ZoomOnImage\&quot;). If you choose ZoomOnImage, there may be some  image cropping. |  |
|**secondaryFont** | **String** | Font of the secondary font.  Valid supported font like \&quot;Arial\&quot; |  [optional] |
|**universalLinkUrl** | **URI** | Universal link URL (iOS fallback). |  [optional] |



## Enum: List&lt;LayoutsEnum&gt;

| Name | Value |
|---- | -----|
| SHOWCASE | &quot;Showcase&quot; |



## Enum: ProductImageDisplayEnum

| Name | Value |
|---- | -----|
| SHOWFULLIMAGE | &quot;ShowFullImage&quot; |
| ZOOMONIMAGE | &quot;ZoomOnImage&quot; |



