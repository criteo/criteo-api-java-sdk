

# DisplayCampaign

Represents a display campaign response model with campaign details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account identifier associated with the campaign. |  |
|**attribution** | [**CampaignAttribution**](CampaignAttribution.md) |  |  |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | The buy type of the campaign. |  |
|**companyName** | **String** | The name of the company that owns the campaign. |  [optional] |
|**drawableBalanceIds** | **List&lt;String&gt;** | The balance ids that the campaign will be mapped to. |  [optional] |
|**frequencyCapping** | [**CampaignCappingTarget**](CampaignCappingTarget.md) |  |  [optional] |
|**name** | **String** | The name of the campaign. |  |
|**onBehalfCompanyName** | **String** | The name of the company on whose behalf the campaign is running. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the campaign. |  |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| AUCTION | &quot;auction&quot; |
| PREFERRED | &quot;preferred&quot; |
| LOCKOUT | &quot;lockout&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| ACTIVE | &quot;active&quot; |
| PAUSED | &quot;paused&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| ENDED | &quot;ended&quot; |
| ARCHIVED | &quot;archived&quot; |



