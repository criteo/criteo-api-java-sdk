

# CampaignSpendLimitV23Q1

campaign spend limit model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) | Whether your spend limit is capped or not |  [optional] |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) | The pace of the spend limit renewal |  [optional] |
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



