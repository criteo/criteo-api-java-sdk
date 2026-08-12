

# PatchCampaignScheduledSpendLimitCreation

Scheduled spend-limit creation.  The startDate is an advertiser-local calendar date, for example 2026-09-01.  When spendLimitType is \"capped\": spendLimitAmount and spendLimitRenewal are required.  When spendLimitType is \"uncapped\": spendLimitAmount.value is null and spendLimitRenewal is \"undefined\".  All scheduled spend limits for the campaign must use the same spendLimitRenewal as the active spend limit.  When spendLimitRenewal is \"monthly\", startDate must be the first day of the month.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimitAmount** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) | The period over which the campaign spend limit is applied.  When spendLimitType is \&quot;capped\&quot;, this is \&quot;daily\&quot;, \&quot;monthly\&quot;, or \&quot;lifetime\&quot;.  When spendLimitType is \&quot;uncapped\&quot;, this is \&quot;undefined\&quot;. |  [optional] |
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) | Controls whether the campaign has a spend limit.  \&quot;capped\&quot; returns a non-null spendLimitAmount.value and a spendLimitRenewal of \&quot;daily\&quot;, \&quot;monthly\&quot;, or \&quot;lifetime\&quot;.  \&quot;uncapped\&quot; returns spendLimitAmount.value as null and spendLimitRenewal as \&quot;undefined\&quot;. |  |
|**startDate** | **LocalDate** | Advertiser-local calendar date when the scheduled spend limit becomes active, for example \&quot;2026-09-01\&quot;. |  |



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



