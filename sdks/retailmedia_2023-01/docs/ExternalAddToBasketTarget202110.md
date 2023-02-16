

# ExternalAddToBasketTarget202110

Identifies add to basket targeting for a line item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the add to basket target | 
**productIds** | **List&lt;String&gt;** | Product ids that add to basket should target |  [optional]
**categoryIds** | **List&lt;String&gt;** | Category ids that add to basket should target |  [optional]



## Enum: ScopeEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;



