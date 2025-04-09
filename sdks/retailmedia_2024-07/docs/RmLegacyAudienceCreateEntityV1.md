

# RmLegacyAudienceCreateEntityV1

Audience definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandIds** | **Set&lt;Long&gt;** | The brands to target |  [optional] |
|**categoryIds** | **Set&lt;Integer&gt;** | The categories to target |  [optional] |
|**lookbackWindow** | [**LookbackWindowEnum**](#LookbackWindowEnum) | Length of lookback window |  |
|**name** | **String** | Name of the audience |  |
|**retailerId** | **Long** | ID of the retailer associated with this audience |  |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) | Type of the user |  |



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



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| VIEWER | &quot;viewer&quot; |
| BUYER | &quot;buyer&quot; |
| ADDTOCARTER | &quot;addToCarter&quot; |



