

# ExternalCatalogStatus

The status of an asynchronous request to generate a catalog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | An enumeration of the status of the catalog. | 
**currency** | **String** | An ISO4217 representation of the currency products are listed under in this catalog. | 
**rowCount** | **Integer** | An indication of the number of products contained in this catalog. Available when  this catalog reaches a success status. | 
**fileSizeBytes** | **Integer** | The size of this catalog in bytes. Available when this catalog reaches a success status. | 
**md5Checksum** | **String** | An MD5 checksum of the catalog for use in confirming complete and uncorrupted retrieval.  Available when this catalog reaches a success status. | 
**createdAt** | **OffsetDateTime** | The time this catalog was created. Represented as a UTC ISO8601 string. | 
**message** | **String** | An optional information message intended for developer consumption. | 



## Enum: StatusEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
PENDING | &quot;Pending&quot;
SUCCESS | &quot;Success&quot;
FAILURE | &quot;Failure&quot;
EXPIRED | &quot;Expired&quot;



