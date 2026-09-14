

# MultiSourceImpact

Number of products evaluated, matched, enriched, modified and left unmatched by the Multi-Source enrichment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productsEnriched** | **Long** | Products where at least one missing attribute was filled. Not exclusive with productsModified: a product can be both enriched and modified. |  [optional] |
|**productsEvaluated** | **Long** | Total products considered for Multi-Source enrichment. |  [optional] |
|**productsMatched** | **Long** | Products matched with at least one additional source using the matching keys. |  [optional] |
|**productsModified** | **Long** | Products where an existing value was overridden. |  [optional] |
|**productsUnmatched** | **Long** | Products not matched with any additional source. |  [optional] |



