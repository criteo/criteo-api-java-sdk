

# MultiSourceReporting

The Multi-Source Catalog enrichment of one ingestion, as reported under multiSource in the ingestion summary: the configuration that was applied, its impact on the products, and the per-attribute details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeDetails** | [**Map&lt;String, MultiSourceAttributeDetails&gt;**](MultiSourceAttributeDetails.md) | Attribute-level reporting keyed by catalog attribute name (e.g. brand, color, gtin). |  [optional] |
|**_configuration** | [**MultiSourceConfiguration**](MultiSourceConfiguration.md) |  |  [optional] |
|**impact** | [**MultiSourceImpact**](MultiSourceImpact.md) |  |  [optional] |



