

# SkuSearchRequestBody

defines the type product Id to search and list of ids to be searched for

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productIdType** | [**ProductIdTypeEnum**](#ProductIdTypeEnum) | sets which product id the QueryIds will be compared to |  |
|**queryIds** | **List&lt;String&gt;** | list of product ids to search for |  |



## Enum: ProductIdTypeEnum

| Name | Value |
|---- | -----|
| SKUKEY | &quot;SkuKey&quot; |
| GTIN | &quot;Gtin&quot; |
| MPN | &quot;Mpn&quot; |
| MODEL | &quot;Model&quot; |
| SKUID | &quot;SkuId&quot; |
| PARENTID | &quot;ParentId&quot; |



