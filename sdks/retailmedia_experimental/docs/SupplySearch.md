

# SupplySearch

Request attributes for a Supply Account Line Item search

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignIds** | **List&lt;String&gt;** | Campaign ids to filter line items by. |  [optional] |
|**limit** | **Integer** | Optional result limit. Defaults to the maximum allowed page size when omitted. |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** | Line item ids to filter line items by. |  [optional] |
|**offset** | **Integer** | Optional result offset. |  [optional] |
|**relationship** | [**RelationshipEnum**](#RelationshipEnum) | Relationship to filter line items by. When omitted, all relationships are returned. |  [optional] |
|**retailerIds** | **List&lt;String&gt;** | Retailer ids to search from. |  [optional] |
|**supplyAccountId** | **String** | Supply account id to search from. |  [optional] |



## Enum: RelationshipEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;Direct&quot; |
| PRIVATEMARKET | &quot;PrivateMarket&quot; |
| NETWORK | &quot;Network&quot; |
| ANYINDIRECT | &quot;AnyIndirect&quot; |



