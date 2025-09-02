

# OfferLoad

The state of a single offer which is being added for a SKU as part of a load operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) |  |  |
|**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  |  [optional] |
|**price** | **Double** |  |  |
|**sellerId** | **String** |  |  |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| OUTOFSTOCK | &quot;OutOfStock&quot; |
| PREORDER | &quot;PreOrder&quot; |
| INSTOCK | &quot;InStock&quot; |
| BACKORDER | &quot;BackOrder&quot; |



## Enum: OfferTypeEnum

| Name | Value |
|---- | -----|
| SELLER | &quot;Seller&quot; |
| RETAILER | &quot;Retailer&quot; |



