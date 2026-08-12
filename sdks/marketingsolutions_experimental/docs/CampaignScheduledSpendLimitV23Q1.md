

# CampaignScheduledSpendLimitV23Q1

A campaign spend limit scheduled to become active on the specified \"startDate\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the scheduled spend limit, for example \&quot;12345\&quot;. |  [optional] |
|**spendLimitAmount** | [**NillableDecimal**](NillableDecimal.md) |  |  [optional] |
|**spendLimitRenewal** | [**SpendLimitRenewalEnum**](#SpendLimitRenewalEnum) | The period over which the campaign spend limit is applied.  - \&quot;daily\&quot;, \&quot;monthly\&quot;, and \&quot;lifetime\&quot; are valid when spendLimitType is \&quot;capped\&quot;.  - \&quot;undefined\&quot; is returned when spendLimitType is \&quot;uncapped\&quot;. |  [optional] |
|**spendLimitType** | [**SpendLimitTypeEnum**](#SpendLimitTypeEnum) | Controls whether the campaign has a spend limit.  - \&quot;capped\&quot;: a spend limit applies, spendLimitAmount.value is non-null, and spendLimitRenewal is \&quot;daily\&quot;, \&quot;monthly\&quot;, or \&quot;lifetime\&quot;.  - \&quot;uncapped\&quot;: no spend limit applies, spendLimitAmount.value is null, and spendLimitRenewal is \&quot;undefined\&quot;. |  [optional] |
|**startDate** | **LocalDate** | Advertiser-local calendar date when the scheduled spend limit becomes active, for example \&quot;2026-08-01\&quot;. |  [optional] |



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



