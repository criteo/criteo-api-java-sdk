

# CreateCoupon

Entity to create a Coupon

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the Coupon |  |
|**description** | **String** | The description of the Coupon |  [optional] |
|**adSetId** | **String** | The id of the Ad Set on which the Coupon is applied to |  |
|**landingPageUrl** | **String** | Web redirection of the landing page url |  |
|**startDate** | **String** | The date when the coupon will be launched  String must be in ISO8601 format |  |
|**endDate** | **String** | The date when when we will stop to show this Coupon. If the end date is not specified (i.e. null) then the Coupon will go on forever  String must be in ISO8601 format |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Format of the Coupon, it can have two values: \&quot;FullFrame\&quot; or \&quot;LogoZone\&quot; |  |
|**images** | [**List&lt;CreateImageSlide&gt;**](CreateImageSlide.md) | List of slides containing the images as a base-64 encoded string |  |
|**showEvery** | **Integer** | Show the Coupon every N seconds (between 1 and 10) |  |
|**showDuration** | **Integer** | Show Coupon for a duration of N seconds (between 1 and 5) |  |
|**rotationsNumber** | **Integer** | Number of rotations for the Coupons (from 1 to 10 times) |  |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| FULLFRAME | &quot;FullFrame&quot; |
| LOGOZONE | &quot;LogoZone&quot; |



