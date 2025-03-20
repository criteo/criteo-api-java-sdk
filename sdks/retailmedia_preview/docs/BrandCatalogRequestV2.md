

# BrandCatalogRequestV2

A request for a catalog under the specified format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandIdFilter** | **List&lt;String&gt;** | The brand ids to filter the catalog by. |  [optional] |
|**retailerIdFilter** | **List&lt;Integer&gt;** | The retailer ids to filter the catalog by. |  [optional] |
|**modifiedAfter** | **OffsetDateTime** | Only products modified after this time will be returned. |  [optional] |
|**includeFields** | [**List&lt;IncludeFieldsEnum&gt;**](#List&lt;IncludeFieldsEnum&gt;) | Out of the optional fields, only the ones specified will be included in the catalog generated. |  [optional] |



## Enum: List&lt;IncludeFieldsEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DESCRIPTION | &quot;Description&quot; |
| IMAGEURL | &quot;ImageUrl&quot; |
| GLOBALCATEGORYID | &quot;GlobalCategoryId&quot; |
| RETAILERNAME | &quot;RetailerName&quot; |
| CATEGORY | &quot;Category&quot; |
| BRANDNAME | &quot;BrandName&quot; |



