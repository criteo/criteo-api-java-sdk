

# AudienceCustom

custom audience configuration of the ad set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audienceName** | **String** | the name of the custom audience that will be created for this ad set |  [optional]
**includedAudienceIds** | **List&lt;String&gt;** | The list of audience ids that define who can be targeted by the ad set |  [optional]
**visitorTypes** | [**List&lt;VisitorTypesEnum&gt;**](#List&lt;VisitorTypesEnum&gt;) | the interaction required on the advertiser web site during the interval defined by daysSinceLastVistXXX fields for being part of the audience |  [optional]



## Enum: List&lt;VisitorTypesEnum&gt;

Name | Value
---- | -----
NONVISITOR | &quot;nonVisitor&quot;
HOMEPAGEVISITOR | &quot;homePageVisitor&quot;
VISITOR | &quot;visitor&quot;
CUSTOMER | &quot;customer&quot;



