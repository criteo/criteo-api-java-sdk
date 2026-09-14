

# MultiSourceAttributeDetails

Multi-Source enrichment details of a single attribute: source field, source priority, coverage and resolution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coverage** | [**MultiSourceAttributeCoverage**](MultiSourceAttributeCoverage.md) |  |  [optional] |
|**resolution** | [**MultiSourceAttributeResolution**](MultiSourceAttributeResolution.md) |  |  [optional] |
|**sourceField** | **String** | Source field used for this attribute. |  [optional] |
|**sourcePriority** | **Integer** | Priority of the additional source that wins for this attribute, which is the lowest priority configured for it. Zero when no additional source overrides the attribute, and also when the winning source is itself configured with priority zero; the two cases cannot be told apart. |  [optional] |



