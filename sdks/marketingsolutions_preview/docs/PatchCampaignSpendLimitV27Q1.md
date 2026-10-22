

# PatchCampaignSpendLimitV27Q1

Spend limit configuration for a marketing campaign (patch).  Only provided fields are updated; omitted fields are left unchanged.  When spendLimitType is \"capped\": spendLimitAmount and spendLimitRenewal are required.  When spendLimitType is \"uncapped\": spendLimitAmount is null and spendLimitRenewal is \"undefined\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimitAmount** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) |  |  [optional] |
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) |  |  [optional] |



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



