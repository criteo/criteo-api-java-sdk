

# MultiSourceAttributeCoverage

Number of products whose attribute was filled from the source, and number of products whose attribute was overridden.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filledFromSource** | **Long** | Products that kept this attribute from the primary catalog: the number of products in the ingestion, less the products where the attribute was overridden. The same value as valueOrigin.primaryComponent. Products whose attribute is absent from every source are counted here too. |  [optional] |
|**overridden** | **Long** | Products where an existing value was replaced. |  [optional] |



