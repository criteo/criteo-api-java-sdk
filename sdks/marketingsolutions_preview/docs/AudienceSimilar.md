

# AudienceSimilar

similar audience configuration of the ad set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audienceName** | **String** | the name of the similar audience that will be created for this ad set |  [optional]
**visitorTypes** | [**List&lt;VisitorTypesEnum&gt;**](#List&lt;VisitorTypesEnum&gt;) | the interaction required on the advertiser web site during the interval defined by daysSinceLastVistXXX fields for being part of the audience. AdSetVisitorType.NonVisitor is automatically included for this audience configuration |  [optional]



## Enum: List&lt;VisitorTypesEnum&gt;

Name | Value
---- | -----
NONVISITOR | &quot;nonVisitor&quot;
HOMEPAGEVISITOR | &quot;homePageVisitor&quot;
VISITOR | &quot;visitor&quot;
CUSTOMER | &quot;customer&quot;



