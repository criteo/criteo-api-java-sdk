

# EntityOfPortfolioMessage

Generic Criteo API successful data model

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | A string containing the entity type |  [optional]
**id** | **String** | A opaque string containing the unique Id of the entity |  [optional]
**attributes** | [**PortfolioMessage**](PortfolioMessage.md) |  |  [optional]
**meta** | **Object** | A meta object that contains application-specific metadata |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CAMPAIGN | &quot;campaign&quot;
ADSET | &quot;adset&quot;
AD | &quot;ad&quot;
ADVERTISER | &quot;advertiser&quot;
AGENCY | &quot;agency&quot;
PUBLISHER | &quot;publisher&quot;
ADDRESS | &quot;address&quot;
CLIENT | &quot;client&quot;
CONTACT | &quot;contact&quot;
INDUSTRY | &quot;industry&quot;



