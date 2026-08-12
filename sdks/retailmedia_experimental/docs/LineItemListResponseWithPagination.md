

# LineItemListResponseWithPagination

A top-level object that encapsulates a Criteo API response for several entities and metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;LineItemResource&gt;**](LineItemResource.md) |  |  [optional] |
|**errors** | [**List&lt;CommonProblem&gt;**](CommonProblem.md) | Errors that occured during this call. |  [optional] [readonly] |
|**metadata** | [**Pagination**](Pagination.md) |  |  [optional] |
|**warnings** | [**List&lt;CommonProblem&gt;**](CommonProblem.md) | Warnings that occured during this call. |  [optional] [readonly] |



