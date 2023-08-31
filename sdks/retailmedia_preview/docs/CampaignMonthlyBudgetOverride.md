

# CampaignMonthlyBudgetOverride

Campaign monthly budget override.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startMonth** | **OffsetDateTime** | Monthly budget override start month, format \&quot;yyyy-MM\&quot;. If it is null, the StartMonth would be the following month of the last item in the override sequence. |  [optional] |
|**duration** | **String** | Monthly budget override duration, e.g. \&quot;1M\&quot;. Must be ending with \&quot;M\&quot;. |  |
|**maxMonthlySpend** | **Double** | Monthly budget override maximum monthly spend amount. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Monthly budget override computed status. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| EXPIRED | &quot;Expired&quot; |
| ACTIVE | &quot;Active&quot; |
| UPCOMING | &quot;Upcoming&quot; |



