# JAVA SDK for Criteo API marketingsolutions for 2021_07 version

## Introduction
API Client Libraries can facilitate your use of the Criteo API allowing you to build unique and customized solutions to serve your businesses and clients.
These libraries can reduce the amount of code you need to write in order to start accessing Criteo programmatically. They also can help expedite troubleshooting, should you encounter any issues.

More information: [https://developers.criteo.com/marketing-solutions/docs/java-api-client-library](https://developers.criteo.com/marketing-solutions/docs/java-api-client-library)

Criteo API

- Package version: 2021.07.0.220725


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

or

```shell
gradle install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.criteo</groupId>
    <artifactId>criteo-api-marketingsolutions-sdk</artifactId>
    <version>2021.07.0.220725</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.criteo:criteo-api-marketingsolutions-sdk:2021.07.0.220725"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/criteo-api-marketingsolutions-sdk-2021.07.0.220725.jar`
* `target/lib/*.jar`

## Example
Please see [src/examples/java/com/criteo/marketing/](src/examples/java/com/criteo/marketing/) for full examples to get a valid token and make a call to the API.

## Documentation for API Endpoints

All URIs are relative to *https://api.criteo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertiserApi* | [**apiPortfolioGet**](docs/AdvertiserApi.md#apiPortfolioGet) | **GET** /2021-07/advertisers/me | 
*AnalyticsApi* | [**getAdsetReport**](docs/AnalyticsApi.md#getAdsetReport) | **POST** /2021-07/statistics/report | 
*AnalyticsApi* | [**getTransactionsReport**](docs/AnalyticsApi.md#getTransactionsReport) | **POST** /2021-07/transactions/report | 
*AnalyticsApi* | [**getTransparencyReport**](docs/AnalyticsApi.md#getTransparencyReport) | **POST** /2021-07/log-level/advertisers/{advertiser-id}/report | 
*AudienceApi* | [**createAudience**](docs/AudienceApi.md#createAudience) | **POST** /2021-07/audiences | 
*AudienceApi* | [**deleteIdentifiers**](docs/AudienceApi.md#deleteIdentifiers) | **DELETE** /2021-07/audiences/{audience-id}/contactlist | 
*AudienceApi* | [**getAudiences**](docs/AudienceApi.md#getAudiences) | **GET** /2021-07/audiences | 
*AudienceApi* | [**modifyAudience**](docs/AudienceApi.md#modifyAudience) | **PATCH** /2021-07/audiences/{audience-id} | 
*AudienceApi* | [**modifyAudienceUsers**](docs/AudienceApi.md#modifyAudienceUsers) | **PATCH** /2021-07/audiences/{audience-id}/contactlist | 
*AudienceApi* | [**removeAudience**](docs/AudienceApi.md#removeAudience) | **DELETE** /2021-07/audiences/{audience-id} | 
*CampaignApi* | [**getAdSet**](docs/CampaignApi.md#getAdSet) | **GET** /2021-07/marketing-solutions/ad-sets/{adSetId} | 
*CampaignApi* | [**getCampaign**](docs/CampaignApi.md#getCampaign) | **GET** /2021-07/marketing-solutions/campaigns/{campaign-id} | 
*CampaignApi* | [**patchAdSets**](docs/CampaignApi.md#patchAdSets) | **PATCH** /2021-07/marketing-solutions/ad-sets | 
*CampaignApi* | [**patchCampaigns**](docs/CampaignApi.md#patchCampaigns) | **PATCH** /2021-07/marketing-solutions/campaigns | 
*CampaignApi* | [**searchAdSets**](docs/CampaignApi.md#searchAdSets) | **POST** /2021-07/marketing-solutions/ad-sets/search | 
*CampaignApi* | [**searchCampaigns**](docs/CampaignApi.md#searchCampaigns) | **POST** /2021-07/marketing-solutions/campaigns/search | 
*CampaignApi* | [**startAdSets**](docs/CampaignApi.md#startAdSets) | **POST** /2021-07/marketing-solutions/ad-sets/start | 
*CampaignApi* | [**stopAdSets**](docs/CampaignApi.md#stopAdSets) | **POST** /2021-07/marketing-solutions/ad-sets/stop | 
*GatewayApi* | [**getCurrentApplication**](docs/GatewayApi.md#getCurrentApplication) | **GET** /me | 
*OAuthApi* | [**getToken**](docs/OAuthApi.md#getToken) | **POST** /oauth2/token | Creates a token based either on supplied client credentials or on single use authorization code


## Documentation for Models

 - [AccessTokenModel](docs/AccessTokenModel.md)
 - [AdSetDeliveryLimitations](docs/AdSetDeliveryLimitations.md)
 - [AdSetFrequencyCapping](docs/AdSetFrequencyCapping.md)
 - [AdSetGeoLocation](docs/AdSetGeoLocation.md)
 - [AdSetSearchFilter](docs/AdSetSearchFilter.md)
 - [AdSetTargeting](docs/AdSetTargeting.md)
 - [AdSetTargetingRule](docs/AdSetTargetingRule.md)
 - [ApplicationSummaryModel](docs/ApplicationSummaryModel.md)
 - [ApplicationSummaryModelResource](docs/ApplicationSummaryModelResource.md)
 - [ApplicationSummaryModelResponse](docs/ApplicationSummaryModelResponse.md)
 - [Audience](docs/Audience.md)
 - [AudienceAttributes](docs/AudienceAttributes.md)
 - [AudienceError](docs/AudienceError.md)
 - [AudienceNameDescription](docs/AudienceNameDescription.md)
 - [AudienceWarning](docs/AudienceWarning.md)
 - [BasicAudienceDefinition](docs/BasicAudienceDefinition.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignListResponse](docs/CampaignListResponse.md)
 - [CampaignReadResource](docs/CampaignReadResource.md)
 - [CampaignResponse](docs/CampaignResponse.md)
 - [CampaignSearchFilters](docs/CampaignSearchFilters.md)
 - [CampaignSearchRequest](docs/CampaignSearchRequest.md)
 - [CampaignSpendLimit](docs/CampaignSpendLimit.md)
 - [CommonProblem](docs/CommonProblem.md)
 - [ContactlistAmendment](docs/ContactlistAmendment.md)
 - [ContactlistAmendmentAttributes](docs/ContactlistAmendmentAttributes.md)
 - [ContactlistAmendmentRequest](docs/ContactlistAmendmentRequest.md)
 - [ContactlistOperation](docs/ContactlistOperation.md)
 - [ContactlistOperationAttributes](docs/ContactlistOperationAttributes.md)
 - [CriteoApiError](docs/CriteoApiError.md)
 - [CriteoApiWarning](docs/CriteoApiWarning.md)
 - [DeleteAudienceContactListResponse](docs/DeleteAudienceContactListResponse.md)
 - [DeleteAudienceResponse](docs/DeleteAudienceResponse.md)
 - [EntityOfPortfolioMessage](docs/EntityOfPortfolioMessage.md)
 - [ErrorCodeResponse](docs/ErrorCodeResponse.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [GetAudiencesResponse](docs/GetAudiencesResponse.md)
 - [GetPortfolioResponse](docs/GetPortfolioResponse.md)
 - [ModifyAudienceResponse](docs/ModifyAudienceResponse.md)
 - [NewAudience](docs/NewAudience.md)
 - [NewAudienceAttributes](docs/NewAudienceAttributes.md)
 - [NewAudienceRequest](docs/NewAudienceRequest.md)
 - [NewAudienceResponse](docs/NewAudienceResponse.md)
 - [NillableAdSetTargetingRule](docs/NillableAdSetTargetingRule.md)
 - [NillableDateTime](docs/NillableDateTime.md)
 - [NillableDecimal](docs/NillableDecimal.md)
 - [OAuthErrorModel](docs/OAuthErrorModel.md)
 - [PatchAdSet](docs/PatchAdSet.md)
 - [PatchAdSetBidding](docs/PatchAdSetBidding.md)
 - [PatchAdSetBudget](docs/PatchAdSetBudget.md)
 - [PatchAdSetScheduling](docs/PatchAdSetScheduling.md)
 - [PatchCampaign](docs/PatchCampaign.md)
 - [PatchCampaignListRequest](docs/PatchCampaignListRequest.md)
 - [PatchCampaignSpendLimit](docs/PatchCampaignSpendLimit.md)
 - [PatchCampaignWriteResource](docs/PatchCampaignWriteResource.md)
 - [PatchResultCampaignListResponse](docs/PatchResultCampaignListResponse.md)
 - [PatchResultCampaignReadResource](docs/PatchResultCampaignReadResource.md)
 - [PortfolioMessage](docs/PortfolioMessage.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ReadAdSet](docs/ReadAdSet.md)
 - [ReadAdSetBidding](docs/ReadAdSetBidding.md)
 - [ReadAdSetBudget](docs/ReadAdSetBudget.md)
 - [ReadAdSetSchedule](docs/ReadAdSetSchedule.md)
 - [ReadModelAdSetId](docs/ReadModelAdSetId.md)
 - [ReadModelReadAdSet](docs/ReadModelReadAdSet.md)
 - [ReplaceAudience](docs/ReplaceAudience.md)
 - [ReplaceAudienceRequest](docs/ReplaceAudienceRequest.md)
 - [ReplaceAudienceResponse](docs/ReplaceAudienceResponse.md)
 - [RequestAdSetSearch](docs/RequestAdSetSearch.md)
 - [RequestsAdSetId](docs/RequestsAdSetId.md)
 - [RequestsPatchAdSet](docs/RequestsPatchAdSet.md)
 - [ResponseAdSetId](docs/ResponseAdSetId.md)
 - [ResponseReadAdSet](docs/ResponseReadAdSet.md)
 - [ResponsesAdSetId](docs/ResponsesAdSetId.md)
 - [ResponsesReadAdSet](docs/ResponsesReadAdSet.md)
 - [StatisticsReportQueryMessage](docs/StatisticsReportQueryMessage.md)
 - [TransactionsReportQueryDataMessage](docs/TransactionsReportQueryDataMessage.md)
 - [TransactionsReportQueryEntityMessage](docs/TransactionsReportQueryEntityMessage.md)
 - [TransactionsReportQueryMessage](docs/TransactionsReportQueryMessage.md)
 - [TransparencyQueryMessage](docs/TransparencyQueryMessage.md)
 - [TransparencyReportAttributes](docs/TransparencyReportAttributes.md)
 - [TransparencyReportDataMessage](docs/TransparencyReportDataMessage.md)
 - [TransparencyReportEntityMessage](docs/TransparencyReportEntityMessage.md)
 - [TransparencyReportFile](docs/TransparencyReportFile.md)
 - [WriteModelAdSetId](docs/WriteModelAdSetId.md)
 - [WriteModelPatchAdSet](docs/WriteModelPatchAdSet.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Disclaimer

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.