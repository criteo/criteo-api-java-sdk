

# ExportReportColumn

Description of a column from an async report request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the exported column |  |
|**title** | **String** | Title of the exported column |  [optional] |
|**description** | **String** | Description of the exported column |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the column |  |
|**role** | [**RoleEnum**](#RoleEnum) | Role of the colummn |  |
|**timezone** | **String** | Timezone of the column |  [optional] |
|**duration** | **String** | Duration of the column |  [optional] |
|**currency** | **String** | Currency of the column |  [optional] |
|**deprecated** | **Boolean** | Flag for deprecated column |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BOOLEAN | &quot;Boolean&quot; |
| NUMBER | &quot;Number&quot; |
| MONEY | &quot;Money&quot; |
| STRING | &quot;String&quot; |
| DATE | &quot;Date&quot; |
| DATETIME | &quot;DateTime&quot; |
| INTERVAL | &quot;Interval&quot; |
| DURATION | &quot;Duration&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| DIMENSION | &quot;Dimension&quot; |
| PROPERTY | &quot;Property&quot; |
| INTERVAL | &quot;Interval&quot; |
| METRIC | &quot;Metric&quot; |



