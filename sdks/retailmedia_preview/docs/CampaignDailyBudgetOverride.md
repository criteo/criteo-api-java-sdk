

# CampaignDailyBudgetOverride

Campaign daily budget override.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | Daily budget override start date, format \&quot;yyyy-MM-dd\&quot;. If it is null, the StartDate would be the following date of the last item in the override sequence. |  [optional] |
|**duration** | **String** | Daily budget override duration, e.g. \&quot;1D\&quot;. Must be ending with D. |  |
|**maxDailySpend** | **Double** | Daily budget override maximum daily spend amount. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Daily budget override computed status. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| EXPIRED | &quot;Expired&quot; |
| ACTIVE | &quot;Active&quot; |
| UPCOMING | &quot;Upcoming&quot; |



