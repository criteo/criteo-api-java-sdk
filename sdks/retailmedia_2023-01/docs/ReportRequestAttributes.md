

# ReportRequestAttributes

Report Request Attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Defaults to value from campaign or one of \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;. If specified, viewAttributionWindow must also be specified |  [optional] |
|**endDate** | **LocalDate** | YYYY-MM-DD, must not be before startDate and not more than 100 days later |  |
|**format** | [**FormatEnum**](#FormatEnum) | One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; |  [optional] |
|**id** | **String** | The id of the campaign or line item.  Either &#39;id&#39; or &#39;ids&#39; must be specified, but not both |  [optional] |
|**ids** | **List&lt;String&gt;** | The ids of the campaigns or line items.  Either &#39;id&#39; or &#39;ids&#39; must be specified, but not both |  [optional] |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | One of \&quot;summary\&quot;, \&quot;keyword\&quot;, \&quot;pageType\&quot;, \&quot;productCategory\&quot;, \&quot;product\&quot;, or \&quot;attributedTransactions\&quot; |  |
|**revenueType** | **String** |  |  [optional] |
|**startDate** | **LocalDate** | YYYY-MM-DD |  |
|**timeZone** | **String** |  |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | Defaults to value from campaign or one of \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;. If specified, must be less than clickAttributionWindow, which must also be specified. |  [optional] |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;csv&quot; |
| JSON | &quot;json&quot; |
| JSON_COMPACT | &quot;json-compact&quot; |
| JSON_NEWLINE | &quot;json-newline&quot; |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SUMMARY | &quot;summary&quot; |
| KEYWORD | &quot;keyword&quot; |
| PAGETYPE | &quot;pageType&quot; |
| PRODUCTCATEGORY | &quot;productCategory&quot; |
| PRODUCT | &quot;product&quot; |
| ATTRIBUTEDTRANSACTIONS | &quot;attributedTransactions&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _1D | &quot;1D&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



