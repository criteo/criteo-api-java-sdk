

# Product

Defines a product to be inserted or updated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the item. Aka Product ID. Don’t use casing to make IDs unique. |  |
|**offerId** | **String** | Not used by Criteo. |  [optional] |
|**title** | **String** | Title of the item. (500 UTF8 characters max). |  |
|**description** | **String** | Description of the item. RECOMMENDED. (5000 UTF8 characters max). |  [optional] |
|**link** | **String** | URL directly linking to your item&#39;s page on your website. (1000 UTF8 characters max). |  |
|**imageLink** | **String** | URL of an image of the item. Supported formats: PNG, JPEG, GIF. (2000 UTF8 characters max).  |  |
|**additionalImageLinks** | **List&lt;String&gt;** | Additional URLs of images of the item. |  [optional] |
|**contentLanguage** | **String** | The two-letter ISO 639-1 language code for the item. |  [optional] |
|**targetCountry** | **String** | The CLDR territory code for the item. |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | The item&#39;s channel (online only). |  |
|**expirationDate** | **String** | Date on which the item should expire, as specified upon insertion, in ISO 8601 format. |  [optional] |
|**adult** | **Boolean** | Set to true if the item is targeted towards adults. RECOMMENDED. |  [optional] |
|**kind** | **String** | Identifies what kind of resource this is. |  [optional] |
|**brand** | **String** | Brand of the item. RECOMMENDED. |  [optional] |
|**color** | **String** | Color of the item. |  [optional] |
|**googleProductCategory** | **String** | Google&#39;s category of the item (see Google product taxonomy). RECOMMENDED. |  [optional] |
|**gtin** | **String** | Global Trade Item Number (GTIN) of the item. RECOMMENDED. |  [optional] |
|**itemGroupId** | **String** | Shared identifier for all variants of the same product. RECOMMENDED. Don’t use casing to make IDs unique. (50 characters max) |  [optional] |
|**material** | **String** | The material of which the item is made. |  [optional] |
|**mpn** | **String** | Manufacturer Part Number (MPN) of the item. RECOMMENDED. |  [optional] |
|**pattern** | **String** | The item&#39;s pattern (e.g. polka dots). |  [optional] |
|**price** | [**Price**](Price.md) |  |  [optional] |
|**salePrice** | [**Price**](Price.md) |  |  [optional] |
|**salePriceEffectiveDate** | **String** | Date range during which the item is on sale. |  [optional] |
|**shipping** | [**List&lt;ProductShipping&gt;**](ProductShipping.md) | Shipping rules. |  [optional] |
|**shippingWeight** | [**ProductShippingWeight**](ProductShippingWeight.md) |  |  [optional] |
|**sizes** | **List&lt;String&gt;** | Size of the item. RECOMMENDED. Only one value is allowed. For variants with different sizes, insert a separate product for each size with the same itemGroupId value. |  [optional] |
|**taxes** | [**List&lt;ProductTax&gt;**](ProductTax.md) | Tax information. |  [optional] |
|**customAttributes** | [**List&lt;CustomAttribute&gt;**](CustomAttribute.md) | A list of custom (merchant-provided) attributes. This is useful for submitting attributes not explicitly exposed by the API. Declaring attributes explicitly exposed by the API using is forbidden |  [optional] |
|**identifierExists** | **Boolean** | False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the Unique Product Identifier Rules for all target countries except for Canada. |  [optional] |
|**installment** | [**Installment**](Installment.md) |  |  [optional] |
|**loyaltyPoints** | [**LoyaltyPoints**](LoyaltyPoints.md) |  |  [optional] |
|**multipack** | **Long** | The number of identical products in a merchant-defined multipack. To avoid any overflow issue, pass it as a string. |  [optional] |
|**customLabel0** | **String** | Custom label 0 for custom grouping of items in a Shopping campaign. |  [optional] |
|**customLabel1** | **String** | Custom label 1 for custom grouping of items in a Shopping campaign. |  [optional] |
|**customLabel2** | **String** | Custom label 2 for custom grouping of items in a Shopping campaign. |  [optional] |
|**customLabel3** | **String** | Custom label 3 for custom grouping of items in a Shopping campaign. |  [optional] |
|**customLabel4** | **String** | Custom label 4 for custom grouping of items in a Shopping campaign. |  [optional] |
|**isBundle** | **Boolean** | Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. |  [optional] |
|**mobileLink** | **String** | accounts.link to a mobile-optimized version of the landing page. |  [optional] |
|**availabilityDate** | **String** | The day a pre-ordered product becomes available for delivery, in ISO 8601 format. |  [optional] |
|**shippingLabel** | **String** | The shipping label of the product, used to group product in account-level shipping rules. |  [optional] |
|**unitPricingMeasure** | [**ProductUnitPricingMeasure**](ProductUnitPricingMeasure.md) |  |  [optional] |
|**unitPricingBaseMeasure** | [**ProductUnitPricingBaseMeasure**](ProductUnitPricingBaseMeasure.md) |  |  [optional] |
|**shippingLength** | [**ProductShippingDimension**](ProductShippingDimension.md) |  |  [optional] |
|**shippingWidth** | [**ProductShippingDimension**](ProductShippingDimension.md) |  |  [optional] |
|**shippingHeight** | [**ProductShippingDimension**](ProductShippingDimension.md) |  |  [optional] |
|**displayAdsId** | **String** | An identifier for an item for dynamic remarketing campaigns. |  [optional] |
|**displayAdsSimilarIds** | **List&lt;String&gt;** | Advertiser-specified recommendations. |  [optional] |
|**displayAdsTitle** | **String** | Title of an item for dynamic remarketing campaigns. |  [optional] |
|**displayAdsLink** | **String** | URL directly to your item&#39;s landing page for dynamic remarketing campaigns. |  [optional] |
|**displayAdsValue** | **Double** | Offer margin for dynamic remarketing campaigns. |  [optional] |
|**sellOnGoogleQuantity** | **Long** | The quantity of the product that is available for selling on Google. Supported only for online products. |  [optional] |
|**promotionIds** | **List&lt;String&gt;** | The unique ID of a promotion. |  [optional] |
|**maxHandlingTime** | **Long** | Maximal product handling time (in business days). |  [optional] |
|**minHandlingTime** | **Long** | Minimal product handling time (in business days). |  [optional] |
|**costOfGoodsSold** | [**Price**](Price.md) |  |  [optional] |
|**source** | **String** | The source of the offer, i.e., how the offer was created. |  [optional] |
|**includedDestinations** | **List&lt;String&gt;** | The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included unless provided in excludedDestinations. |  [optional] |
|**excludedDestinations** | **List&lt;String&gt;** | The list of destinations to exclude for this target (corresponds to unchecked check boxes in Merchant Center). |  [optional] |
|**adsGrouping** | **String** | Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. |  [optional] |
|**adsLabels** | **List&lt;String&gt;** | Similar to adsGrouping, but only works on CPC. |  [optional] |
|**adsRedirect** | **String** | Allows advertisers to override the item URL when the product is shown within the context of Product Ads. |  [optional] |
|**productTypes** | **List&lt;String&gt;** | Categories of the item (formatted as in products data specification). |  [optional] |
|**productTypeKeys** | **List&lt;String&gt;** | Category keys of the item (formatted as in productTypes). |  [optional] |
|**ageGroup** | **String** | Target age group of the item. |  [optional] |
|**availability** | **String** | Availability status of the item. RECOMMENDED. |  [optional] |
|**condition** | **String** | Condition or state of the item. |  [optional] |
|**gender** | **String** | Target gender of the item. |  [optional] |
|**sizeSystem** | **String** | System in which the size is specified. Recommended for apparel items. |  [optional] |
|**sizeType** | **String** | The cut of the item. Recommended for apparel items. |  [optional] |
|**energyEfficiencyClass** | **String** | The energy efficiency class as defined in EU directive 2010/30/EU. |  [optional] |
|**minEnergyEfficiencyClass** | **String** | The energy efficiency class as defined in EU directive 2010/30/EU. |  [optional] |
|**maxEnergyEfficiencyClass** | **String** | The energy efficiency class as defined in EU directive 2010/30/EU. |  [optional] |
|**taxCategory** | **String** | The tax category of the product, used to configure detailed tax nexus in account-level tax settings. |  [optional] |
|**transitTimeLabel** | **String** | The transit time label of the product, used to group product in account-level transit time tables. |  [optional] |
|**sellerId** | **String** | (Deprecated Field) The external ID of the seller (case sensitive and 50 UTF8 characters max). This information is required by the Criteo Offsite Ads. |  [optional] |
|**externalSellerId** | **String** | The external id of the seller (case sensitive and 50 UTF8 characters max). This information is required by the Criteo Offsite Ads. |  [optional] |
|**externalSellerName** | **String** | The external name of the seller (case sensitive and 50 UTF8 characters max). This information is required by the Criteo Offsite Ads. |  [optional] |
|**numberOfReviews** | **Integer** | The number of customer reviews for the product |  [optional] |
|**productRating** | **String** | The product rating for the product |  [optional] |
|**badge** | **String** | URL of a badge image to display on the product. |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;online&quot; |



