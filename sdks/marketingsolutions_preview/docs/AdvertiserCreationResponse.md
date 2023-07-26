

# AdvertiserCreationResponse

Advertiser Creation Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**EntityV2OfObject**](EntityV2OfObject.md) |  |  [optional] |
|**errors** | [**List&lt;CommonProblem&gt;**](CommonProblem.md) | Error list returned by the Criteo API  For successful requests it is empty |  [optional] |
|**warnings** | [**List&lt;CriteoApiWarningV2&gt;**](CriteoApiWarningV2.md) | Warnings list returned by the Criteo API  In some situations the operations are successful but it may be useful to issue warnings to the API consumer.  For example the endpoint, entity or field is deprecated. Warnings are like compiler warnings, they indicate that problems may occur in the future. |  [optional] |



