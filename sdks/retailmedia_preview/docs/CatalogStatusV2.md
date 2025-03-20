

# CatalogStatusV2

The status of an asynchronous request to generate a catalog

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | An enumeration of the status of the catalog. |  |
|**rowCount** | **Integer** | An indication of the number of products contained in this catalog. Available when  this catalog reaches a success status. |  [optional] |
|**fileSizeBytes** | **Integer** | The size of this catalog in bytes. Available when this catalog reaches a success status. |  [optional] |
|**md5Checksum** | **String** | An MD5 checksum of the catalog for use in confirming complete and uncorrupted retrieval.  Available when this catalog reaches a success status. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time this catalog was created. Represented as a UTC ISO8601 string. |  |
|**message** | **String** | An optional information message intended for developer consumption. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |
| EXPIRED | &quot;expired&quot; |



