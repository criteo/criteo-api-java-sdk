

# RmAudienceSegmentSearchEntityV1

Available filters to perform a search on audience segments. If present, the filters are AND'ed together when applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audienceSegmentIds** | **List&lt;String&gt;** | List of segment ids |  [optional] |
|**retailerIds** | **List&lt;String&gt;** | List of retailer ids |  [optional] |
|**audienceSegmentTypes** | [**List&lt;AudienceSegmentTypesEnum&gt;**](#List&lt;AudienceSegmentTypesEnum&gt;) | List of segment types |  [optional] |



## Enum: List&lt;AudienceSegmentTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| CONTACTLIST | &quot;ContactList&quot; |
| USERBEHAVIOR | &quot;UserBehavior&quot; |



