

# AsyncInsightResponse

Response returned by the asynchronous insight endpoints, carrying the insight report status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**InsightStatusResponseResource**](InsightStatusResponseResource.md) |  |  [optional] |
|**errors** | [**List&lt;CommonProblem&gt;**](CommonProblem.md) | Errors that occured during this call. |  [optional] [readonly] |
|**warnings** | [**List&lt;CommonProblem&gt;**](CommonProblem.md) | Warnings that occured during this call. |  [optional] [readonly] |



