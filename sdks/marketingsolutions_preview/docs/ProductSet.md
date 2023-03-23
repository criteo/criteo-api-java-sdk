

# ProductSet

Encapsulate a group of product

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datasetId** | **String** | The dataset to which the product set belong |  [optional] |
|**name** | **String** | The name of the product set |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the product set |  [optional] |
|**isEnabled** | **Boolean** | True if the product set is active |  [optional] |
|**numberOfProducts** | **Integer** | The number of product matching the product set |  [optional] |
|**creationDate** | **String** | Optional: The creation date of the product set (UTC time in ISO8601 format). Example: \&quot;02/25/2022 14:51:26\&quot;  Can be null if the value doesn&#39;t exist. |  [optional] |
|**rules** | [**List&lt;ProductSetRule&gt;**](ProductSetRule.md) | The rules identifying the product belonging to the set |  [optional] |
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



