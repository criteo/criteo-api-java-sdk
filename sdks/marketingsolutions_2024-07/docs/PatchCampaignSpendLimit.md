

# PatchCampaignSpendLimit

campaign spend limit model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) |  |  [optional] |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) |  |  [optional] |
|**spendLimitAmount** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |



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



