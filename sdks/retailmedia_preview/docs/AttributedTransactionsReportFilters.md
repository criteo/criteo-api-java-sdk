

# AttributedTransactionsReportFilters

Array-valued constraints for attributed-transactions reporting. At least one of accountIds, campaignIds, or lineItemIds is required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;String&gt;** | Optional scope filter. Allows up to 5 account IDs per request. |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | Optional scope filter. Allows up to 50 campaign IDs per request. |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** | Optional scope filter. Allows up to 50 line-item IDs per request. |  [optional] |
|**mediaTypes** | [**List&lt;MediaTypesEnum&gt;**](#List&lt;MediaTypesEnum&gt;) | Optional media type filter. |  [optional] |



## Enum: List&lt;MediaTypesEnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| DISPLAY | &quot;display&quot; |



