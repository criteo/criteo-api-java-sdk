

# CreateCampaignSpendLimit

campaign spend limit create model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) | Whether your spend limit is capped or not |  |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) | The pace of the spend limit renewal |  [optional] |
|**spendLimitAmount** | **Double** | The amount of the spend limit. null if spendLimitType is uncapped. |  [optional] |



## Enum: SpendLimitTypeEnum

| Name | Value |
|---- | -----|
| CAPPED | &quot;capped&quot; |
| UNCAPPED | &quot;uncapped&quot; |



## Enum: SpendLimitRenewalEnum

| Name | Value |
|---- | -----|
| UNDEFINED | &quot;undefined&quot; |
| DAILY | &quot;daily&quot; |
| MONTHLY | &quot;monthly&quot; |
| LIFETIME | &quot;lifetime&quot; |



