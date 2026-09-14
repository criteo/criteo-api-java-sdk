

# MultiSourceConfiguration

Multi-Source Catalog configuration applied to the ingestion: main component, number of sources, matching keys and attribute mappings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeMappings** | [**List&lt;MultiSourceAttributeMapping&gt;**](MultiSourceAttributeMapping.md) | Attribute-level mapping rules applied during enrichment. |  [optional] |
|**enabled** | **Boolean** | Whether Multi-Source Catalog was enabled for this ingestion. |  [optional] |
|**mainComponentId** | **Integer** | Identifier of the primary catalog component. |  [optional] |
|**matchingKeys** | **List&lt;String&gt;** | Keys used to match products between the primary catalog and the additional sources. |  [optional] |
|**sourcesCount** | **Integer** | Number of additional sources configured, excluding the primary catalog. |  [optional] |



