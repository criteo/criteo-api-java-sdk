

# ProductSet

Encapsulate a group of product

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datasetId** | **String** | The dataset to which the product set belong |  |
|**name** | **String** | The name of the product set |  |
|**minimumNumberOfProducts** | **Integer** | Minimum amount of products that should match the product set to consider it valid.  Greater or equal than one. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the product set |  |
|**numberOfProducts** | **Integer** | The number of product matching the product set.  Can be null for newly created product set. |  |
|**creationDate** | **String** | The creation date of the product set (UTC time in ISO8601 format). Example: \&quot;02/25/2022 14:51:26\&quot;.  Can be null if the value isn&#39;t available. |  |
|**rules** | [**List&lt;ProductSetRule&gt;**](ProductSetRule.md) | The rules identifying the product belonging to the set |  |
|**clientType** | [**ClientTypeEnum**](#ClientTypeEnum) | The client type of the product set |  |
|**keepVariantProducts** | **Boolean** |  |  |
|**id** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| DRAFT | &quot;Draft&quot; |
| PENDING | &quot;Pending&quot; |
| VALID | &quot;Valid&quot; |
| INVALID | &quot;Invalid&quot; |
| DELETED | &quot;Deleted&quot; |



## Enum: ClientTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| CGROWTH | &quot;CGrowth&quot; |
| CMAX | &quot;CMax&quot; |



