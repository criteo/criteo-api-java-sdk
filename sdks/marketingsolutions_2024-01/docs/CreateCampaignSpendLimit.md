

# CreateCampaignSpendLimit

campaign spend limit create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimitAmount** | **Double** | The amount of the spend limit. null if spendLimitType is uncapped. |  [optional] |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) | The pace of the spend limit renewal |  [optional] |
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) | Whether your spend limit is capped or not |  |



## Enum: SpendLimitRenewalEnum

| Name | Value |
|---- | -----|
| UNDEFINED | &quot;undefined&quot; |
| DAILY | &quot;daily&quot; |
| MONTHLY | &quot;monthly&quot; |
| LIFETIME | &quot;lifetime&quot; |



## Enum: SpendLimitTypeEnum

| Name | Value |
|---- | -----|
| CAPPED | &quot;capped&quot; |
| UNCAPPED | &quot;uncapped&quot; |



