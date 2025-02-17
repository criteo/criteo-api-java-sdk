

# BrandIdSearchRequest

An object that represents the request of BrandIdSearch endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**retailerIds** | **List&lt;Integer&gt;** | IDs of the retailers we want to limit the search to |  |
|**name** | **String** | The name of the brand(s) to be searched |  [optional] |
|**brandType** | [**BrandTypeEnum**](#BrandTypeEnum) | The type of brand, primarily where this brand belongs: UC, Retailer or All (both) |  [optional] |



## Enum: BrandTypeEnum

| Name | Value |
|---- | -----|
| UC | &quot;uc&quot; |
| RETAILER | &quot;retailer&quot; |
| ALL | &quot;all&quot; |



