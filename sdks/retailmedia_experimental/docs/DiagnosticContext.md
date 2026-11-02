

# DiagnosticContext

Identifiers and targeting context used to evaluate a line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) |  |  |
|**campaignId** | **String** |  |  |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) |  |  |
|**lineItemId** | **String** |  |  |
|**retailerId** | **String** |  |  |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| AUCTION | &quot;Auction&quot; |
| PREFERREDDEALS | &quot;PreferredDeals&quot; |
| SPONSORSHIP | &quot;Sponsorship&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



