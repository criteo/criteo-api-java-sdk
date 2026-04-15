

# DisplayCampaignCreateModel

Represents a model for creating a new display campaign with the required properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attribution** | [**CampaignAttributionRequest**](CampaignAttributionRequest.md) |  |  |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | The buy type of the campaign. |  |
|**companyName** | **String** | The name of the company that owns the campaign. |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** | The balance ids that the campaign will be mapped to. |  [optional] |
|**frequencyCapping** | [**CampaignCappingTargetRequest**](CampaignCappingTargetRequest.md) |  |  [optional] |
|**name** | **String** | The name of the campaign. |  |
|**onBehalfCompanyName** | **String** | The name of the company on whose behalf the campaign is running. |  [optional] |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERRED | &quot;preferred&quot; |



