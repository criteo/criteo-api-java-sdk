

# Coupon

Coupons are static images applied on ad set which can be displayed within an ad and link to a landing page.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the Coupon |  [optional]
**description** | **String** | The description of the Coupon |  [optional]
**author** | **String** | The login of the person who created this Coupon |  [optional]
**advertiserId** | **String** | Advertiser linked to the Coupon |  [optional]
**adSetId** | **String** | The id of the Ad Set on which the Coupon is applied to |  [optional]
**landingPageUrl** | **String** | Web redirection of the landing page url |  [optional]
**startDate** | **String** | The date when the Coupon will be launched  String must be in ISO8601 format |  [optional]
**endDate** | **String** | The date when when we will stop to show this Coupon. If the end date is not specified (i.e. null) then the Coupon will go on forever  String must be in ISO8601 format |  [optional]
**format** | **String** | Format of the Coupon, it can have two values: \&quot;FullFrame\&quot; or \&quot;LogoZone\&quot; |  [optional]
**status** | **String** | The status of the Coupon |  [optional]
**images** | [**List&lt;ImageSlide&gt;**](ImageSlide.md) | List of slides containing the image URLs |  [optional]
**showEvery** | **Integer** | Show the Coupon every N seconds (between 1 and 10) |  [optional]
**showDuration** | **Integer** | Show Coupon for a duration of N seconds (between 1 and 5) |  [optional]
**rotationsNumber** | **Integer** | Number of rotations for the Coupons (from 1 to 10 times) |  [optional]



