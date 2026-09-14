

# CampaignSearchModel

Optional filters and pagination applied when searching campaigns under an account.  Values within one filter are ORed; distinct filters are ANDed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buyTypeFilter** | [**List&lt;BuyTypeFilterEnum&gt;**](#List&lt;BuyTypeFilterEnum&gt;) |  |  [optional] |
|**campaignIdFilter** | **List&lt;String&gt;** |  |  [optional] |
|**campaignStatusFilter** | [**List&lt;CampaignStatusFilterEnum&gt;**](#List&lt;CampaignStatusFilterEnum&gt;) |  |  [optional] |
|**campaignTypeFilter** | [**List&lt;CampaignTypeFilterEnum&gt;**](#List&lt;CampaignTypeFilterEnum&gt;) |  |  [optional] |
|**limit** | **Integer** | The maximum number of campaigns to return. |  [optional] |
|**offset** | **Integer** | The number of matching campaigns to skip. |  [optional] |



## Enum: List&lt;BuyTypeFilterEnum&gt;

| Name | Value |
|---- | -----|
| AUCTION | &quot;Auction&quot; |
| PREFERREDDEALS | &quot;PreferredDeals&quot; |
| SPONSORSHIP | &quot;Sponsorship&quot; |



## Enum: List&lt;CampaignStatusFilterEnum&gt;

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |



## Enum: List&lt;CampaignTypeFilterEnum&gt;

| Name | Value |
|---- | -----|
| SPONSOREDPRODUCTS | &quot;SponsoredProducts&quot; |
| ONSITEDISPLAY | &quot;OnsiteDisplay&quot; |



