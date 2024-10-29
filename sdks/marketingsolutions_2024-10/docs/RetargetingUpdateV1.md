

# RetargetingUpdateV1

Settings to target users based on its type and days since last visit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**visitorsType** | [**VisitorsTypeEnum**](#VisitorsTypeEnum) | Types of visitors. |  [optional] |
|**daysSinceLastVisitMin** | **Integer** | Minimum number of days since last visit to partner. |  [optional] |
|**daysSinceLastVisitMax** | **Integer** | Maximum number of days since last visit to partner. |  [optional] |



## Enum: VisitorsTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;All&quot; |
| BUYERS | &quot;Buyers&quot; |
| NONBUYERS | &quot;NonBuyers&quot; |



