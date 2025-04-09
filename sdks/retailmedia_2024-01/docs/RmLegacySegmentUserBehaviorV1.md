

# RmLegacySegmentUserBehaviorV1

Audience definition of people based on what they visited

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lookbackWindow** | [**LookbackWindowEnum**](#LookbackWindowEnum) | Length of lookback window |  |
|**targetIds** | **Set&lt;String&gt;** | The categories to target |  [optional] |
|**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) | Type of target |  [optional] |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) | Type of shopper activity used to generate the audience. |  |



## Enum: LookbackWindowEnum

| Name | Value |
|---- | -----|
| P7D | &quot;P7D&quot; |
| P14D | &quot;P14D&quot; |
| P30D | &quot;P30D&quot; |
| P45D | &quot;P45D&quot; |
| P60D | &quot;P60D&quot; |
| P90D | &quot;P90D&quot; |
| P120D | &quot;P120D&quot; |
| P150D | &quot;P150D&quot; |
| P180D | &quot;P180D&quot; |



## Enum: TargetTypeEnum

| Name | Value |
|---- | -----|
| BRAND | &quot;brand&quot; |
| CATEGORY | &quot;category&quot; |



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| VIEWER | &quot;viewer&quot; |
| BUYER | &quot;buyer&quot; |
| ADDTOCARTER | &quot;addToCarter&quot; |



