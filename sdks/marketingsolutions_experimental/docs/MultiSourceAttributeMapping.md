

# MultiSourceAttributeMapping

Mapping of one catalog attribute to the source component field it is filled from.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeName** | **String** | Target attribute in the catalog schema. |  [optional] |
|**sourceComponentId** | **Integer** | Identifies the additional source component this attribute is overridden from. Several mappings share it when one component overrides more than one attribute, which is why sourcesCount counts only the distinct ones. |  [optional] |
|**sourceField** | **String** | Field name from the additional source mapped to this attribute. |  [optional] |
|**sourcePriority** | **Integer** | Priority of this source for this attribute: lower wins (1 overrides 2). |  [optional] |



