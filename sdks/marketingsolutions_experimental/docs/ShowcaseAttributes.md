

# ShowcaseAttributes

The attributes specific to Showcase creatives (read).  On read, URLs are returned instead of base64.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**androidDeeplinkUrl** | **URI** | Android deep-link URL. |  [optional] |
|**appLinkUrl** | **URI** | App link URL (Android fallback). |  [optional] |
|**brandingImageClickUrl** | **URI** | Click URL associated with the branding images. |  [optional] |
|**brandingImages** | [**List&lt;ShowcaseBrandingImage&gt;**](ShowcaseBrandingImage.md) | Branding images per shape (horizontal, vertical, square) displayed in the creative. |  [optional] |
|**callsToAction** | **List&lt;String&gt;** | A Call-to-Action (CTA) is an action-driven instruction to your audience intended to provoke an immediate  response, such as \&quot;Buy now\&quot; or \&quot;Go!\&quot;. |  [optional] |
|**colors** | [**ShowcaseColors**](ShowcaseColors.md) |  |  [optional] |
|**iosDeeplinkUrl** | **URI** | iOS deep-link URL. |  [optional] |
|**landingPageUrl** | **URI** | Web redirection of the landing page URL. |  [optional] |
|**layouts** | **List&lt;String&gt;** | The layouts enabled for this Showcase creative.  Possible values include \&quot;Showcase\&quot;. |  [optional] |
|**logos** | [**List&lt;ShowcaseLogo&gt;**](ShowcaseLogo.md) | Logo images with their shape and URL. |  [optional] |
|**metaSetting** | [**ShowcaseMetaSetting**](ShowcaseMetaSetting.md) |  |  [optional] |
|**priceSettings** | [**ShowcasePriceSettings**](ShowcasePriceSettings.md) |  |  [optional] |
|**primaryFont** | **String** | Font of the primary font.  Valid supported font like \&quot;Arial\&quot; |  [optional] |
|**productImageDisplay** | **String** | Value can be \&quot;ShowFullImage\&quot; or \&quot;ZoomOnImage\&quot;. Choose whether your product catalog images should fit inside the allocated  space (\&quot;ShowFullImage\&quot;) or whether they should fill that space (\&quot;ZoomOnImage\&quot;). If you choose ZoomOnImage, there may be some  image cropping. |  [optional] |
|**secondaryFont** | **String** | Font of the secondary font.  Valid supported font like \&quot;Arial\&quot; |  [optional] |
|**universalLinkUrl** | **URI** | Universal link URL (iOS fallback). |  [optional] |



