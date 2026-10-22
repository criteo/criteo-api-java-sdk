

# ChangedField

A single field change included in a change-history entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Name of the field that changed, in camelCase — for example &#x60;name&#x60;, &#x60;status&#x60;, &#x60;budget&#x60;, &#x60;bid&#x60;, &#x60;startDate&#x60;, or &#x60;endDate&#x60;.  |  |
|**newValue** | **String** | Display-safe value after the change, serialized as a string for consistent display across primitive field types. Null when the field was cleared or removed.  |  |
|**previousValue** | **String** | Display-safe value before the change, serialized as a string for consistent display across primitive field types. Null when the field did not exist previously.  |  |



