# JAVA SDK for Criteo API retailmedia for 2021_07 version

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
    <artifactId>criteo-api-retailmedia-sdk</artifactId>
    <version>2021.07.0.220725</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.criteo:criteo-api-retailmedia-sdk:2021.07.0.220725"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/criteo-api-retailmedia-sdk-2021.07.0.220725.jar`
* `target/lib/*.jar`

## Example
Please see [src/examples/java/com/criteo/marketing/](src/examples/java/com/criteo/marketing/) for full examples to get a valid token and make a call to the API.

## Documentation for API Endpoints

All URIs are relative to *https://api.criteo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsApi* | [**getReportOutput**](docs/AnalyticsApi.md#getReportOutput) | **GET** /2021-07/retail-media/reports/{reportId}/output | 
*AnalyticsApi* | [**getReportStatus**](docs/AnalyticsApi.md#getReportStatus) | **GET** /2021-07/retail-media/reports/{reportId}/status | 
*AnalyticsApi* | [**requestCampaignReport**](docs/AnalyticsApi.md#requestCampaignReport) | **POST** /2021-07/retail-media/reports/campaigns | 
*AnalyticsApi* | [**requestLineItemReport**](docs/AnalyticsApi.md#requestLineItemReport) | **POST** /2021-07/retail-media/reports/line-items | 
*CampaignApi* | [**deleteApiV1ExternalBalanceCampaignsByBalanceId**](docs/CampaignApi.md#deleteApiV1ExternalBalanceCampaignsByBalanceId) | **DELETE** /2021-07/retail-media/balances/{balanceId}/campaigns | 
*CampaignApi* | [**deleteApiV1ExternalLineItemProductsByLineItemId**](docs/CampaignApi.md#deleteApiV1ExternalLineItemProductsByLineItemId) | **DELETE** /2021-07/retail-media/line-items/{lineItemId}/products | 
*CampaignApi* | [**deleteApiV2ExternalLineItemTargetingKeywordsByLineItemId**](docs/CampaignApi.md#deleteApiV2ExternalLineItemTargetingKeywordsByLineItemId) | **DELETE** /2021-07/retail-media/line-items/{line-item-id}/targeting/keywords | 
*CampaignApi* | [**getApiV1ExternalAccountBalancesByAccountId**](docs/CampaignApi.md#getApiV1ExternalAccountBalancesByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/balances | 
*CampaignApi* | [**getApiV1ExternalAccountBrandsByAccountId**](docs/CampaignApi.md#getApiV1ExternalAccountBrandsByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/brands | 
*CampaignApi* | [**getApiV1ExternalAccountCampaignsByAccountId**](docs/CampaignApi.md#getApiV1ExternalAccountCampaignsByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/campaigns | 
*CampaignApi* | [**getApiV1ExternalAccountRetailersByAccountId**](docs/CampaignApi.md#getApiV1ExternalAccountRetailersByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/retailers | 
*CampaignApi* | [**getApiV1ExternalAccounts**](docs/CampaignApi.md#getApiV1ExternalAccounts) | **GET** /2021-07/retail-media/accounts | 
*CampaignApi* | [**getApiV1ExternalBalanceCampaignsByBalanceId**](docs/CampaignApi.md#getApiV1ExternalBalanceCampaignsByBalanceId) | **GET** /2021-07/retail-media/balances/{balanceId}/campaigns | 
*CampaignApi* | [**getApiV1ExternalCampaignByCampaignId**](docs/CampaignApi.md#getApiV1ExternalCampaignByCampaignId) | **GET** /2021-07/retail-media/campaigns/{campaignId} | 
*CampaignApi* | [**getApiV1ExternalCatalogOutputByCatalogId**](docs/CampaignApi.md#getApiV1ExternalCatalogOutputByCatalogId) | **GET** /2021-07/retail-media/catalogs/{catalogId}/output | 
*CampaignApi* | [**getApiV1ExternalCatalogStatusByCatalogId**](docs/CampaignApi.md#getApiV1ExternalCatalogStatusByCatalogId) | **GET** /2021-07/retail-media/catalogs/{catalogId}/status | 
*CampaignApi* | [**getApiV1ExternalLineItemProductsByLineItemId**](docs/CampaignApi.md#getApiV1ExternalLineItemProductsByLineItemId) | **GET** /2021-07/retail-media/line-items/{lineItemId}/products | 
*CampaignApi* | [**getApiV2ExternalAccountLineItemsByAccountId**](docs/CampaignApi.md#getApiV2ExternalAccountLineItemsByAccountId) | **GET** /2021-07/retail-media/accounts/{account-id}/line-items | 
*CampaignApi* | [**getApiV2ExternalAuctionLineItemByLineItemId**](docs/CampaignApi.md#getApiV2ExternalAuctionLineItemByLineItemId) | **GET** /2021-07/retail-media/auction-line-items/{line-item-id} | 
*CampaignApi* | [**getApiV2ExternalCampaignAuctionLineItemsByCampaignId**](docs/CampaignApi.md#getApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **GET** /2021-07/retail-media/campaigns/{campaign-id}/auction-line-items | 
*CampaignApi* | [**getApiV2ExternalCampaignPreferredLineItemsByCampaignId**](docs/CampaignApi.md#getApiV2ExternalCampaignPreferredLineItemsByCampaignId) | **GET** /2021-07/retail-media/campaigns/{campaign-id}/preferred-line-items | 
*CampaignApi* | [**getApiV2ExternalLineItemByLineItemId**](docs/CampaignApi.md#getApiV2ExternalLineItemByLineItemId) | **GET** /2021-07/retail-media/line-items/{line-item-id} | 
*CampaignApi* | [**getApiV2ExternalLineItemTargetingKeywordsByLineItemId**](docs/CampaignApi.md#getApiV2ExternalLineItemTargetingKeywordsByLineItemId) | **GET** /2021-07/retail-media/line-items/{line-item-id}/targeting/keywords | 
*CampaignApi* | [**getApiV2ExternalPreferredLineItemByLineItemId**](docs/CampaignApi.md#getApiV2ExternalPreferredLineItemByLineItemId) | **GET** /2021-07/retail-media/preferred-line-items/{line-item-id} | 
*CampaignApi* | [**postApiV1ExternalAccountCampaignsByAccountId**](docs/CampaignApi.md#postApiV1ExternalAccountCampaignsByAccountId) | **POST** /2021-07/retail-media/accounts/{accountId}/campaigns | 
*CampaignApi* | [**postApiV1ExternalAccountCatalogsByAccountId**](docs/CampaignApi.md#postApiV1ExternalAccountCatalogsByAccountId) | **POST** /2021-07/retail-media/accounts/{accountId}/catalogs | 
*CampaignApi* | [**postApiV2ExternalCampaignAuctionLineItemsByCampaignId**](docs/CampaignApi.md#postApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **POST** /2021-07/retail-media/campaigns/{campaign-id}/auction-line-items | 
*CampaignApi* | [**postApiV2ExternalCampaignPreferredLineItemsByCampaignId**](docs/CampaignApi.md#postApiV2ExternalCampaignPreferredLineItemsByCampaignId) | **POST** /2021-07/retail-media/campaigns/{campaign-id}/preferred-line-items | 
*CampaignApi* | [**putApiV1ExternalBalanceCampaignsByBalanceId**](docs/CampaignApi.md#putApiV1ExternalBalanceCampaignsByBalanceId) | **PUT** /2021-07/retail-media/balances/{balanceId}/campaigns | 
*CampaignApi* | [**putApiV1ExternalCampaignByCampaignId**](docs/CampaignApi.md#putApiV1ExternalCampaignByCampaignId) | **PUT** /2021-07/retail-media/campaigns/{campaignId} | 
*CampaignApi* | [**putApiV1ExternalLineItemProductsByLineItemId**](docs/CampaignApi.md#putApiV1ExternalLineItemProductsByLineItemId) | **PUT** /2021-07/retail-media/line-items/{lineItemId}/products | 
*CampaignApi* | [**putApiV2ExternalAuctionLineItemByLineItemId**](docs/CampaignApi.md#putApiV2ExternalAuctionLineItemByLineItemId) | **PUT** /2021-07/retail-media/auction-line-items/{line-item-id} | 
*CampaignApi* | [**putApiV2ExternalLineItemTargetingKeywordsByLineItemId**](docs/CampaignApi.md#putApiV2ExternalLineItemTargetingKeywordsByLineItemId) | **PUT** /2021-07/retail-media/line-items/{line-item-id}/targeting/keywords | 
*CampaignApi* | [**putApiV2ExternalPreferredLineItemByLineItemId**](docs/CampaignApi.md#putApiV2ExternalPreferredLineItemByLineItemId) | **PUT** /2021-07/retail-media/preferred-line-items/{line-item-id} | 
*GatewayApi* | [**getCurrentApplication**](docs/GatewayApi.md#getCurrentApplication) | **GET** /me | 
*OAuthApi* | [**getToken**](docs/OAuthApi.md#getToken) | **POST** /oauth2/token | Creates a token based either on supplied client credentials or on single use authorization code


## Documentation for Models

 - [AccessTokenModel](docs/AccessTokenModel.md)
 - [ApplicationSummaryModel](docs/ApplicationSummaryModel.md)
 - [ApplicationSummaryModelResource](docs/ApplicationSummaryModelResource.md)
 - [ApplicationSummaryModelResponse](docs/ApplicationSummaryModelResponse.md)
 - [AuctionLineItemCreateModelRequest](docs/AuctionLineItemCreateModelRequest.md)
 - [AuctionLineItemPagedListResponse](docs/AuctionLineItemPagedListResponse.md)
 - [AuctionLineItemResponse](docs/AuctionLineItemResponse.md)
 - [AuctionLineItemUpdateModelRequest](docs/AuctionLineItemUpdateModelRequest.md)
 - [BadRequest](docs/BadRequest.md)
 - [CommonError](docs/CommonError.md)
 - [CommonLineItemPagedListResponse](docs/CommonLineItemPagedListResponse.md)
 - [CommonLineItemResponse](docs/CommonLineItemResponse.md)
 - [CommonProblem](docs/CommonProblem.md)
 - [CommonWarning](docs/CommonWarning.md)
 - [EnvelopeReportRequest](docs/EnvelopeReportRequest.md)
 - [EnvelopeReportStatus](docs/EnvelopeReportStatus.md)
 - [Error](docs/Error.md)
 - [ExternalAccount](docs/ExternalAccount.md)
 - [ExternalAuctionLineItem](docs/ExternalAuctionLineItem.md)
 - [ExternalAuctionLineItemCreateModel](docs/ExternalAuctionLineItemCreateModel.md)
 - [ExternalAuctionLineItemUpdateModel](docs/ExternalAuctionLineItemUpdateModel.md)
 - [ExternalBalance](docs/ExternalBalance.md)
 - [ExternalBalanceCampaign](docs/ExternalBalanceCampaign.md)
 - [ExternalBrand](docs/ExternalBrand.md)
 - [ExternalCampaign](docs/ExternalCampaign.md)
 - [ExternalCampaignAttributes](docs/ExternalCampaignAttributes.md)
 - [ExternalCatalogRequest](docs/ExternalCatalogRequest.md)
 - [ExternalCatalogStatus](docs/ExternalCatalogStatus.md)
 - [ExternalCommonLineItem](docs/ExternalCommonLineItem.md)
 - [ExternalDeleteBalanceCampaign](docs/ExternalDeleteBalanceCampaign.md)
 - [ExternalEditableCampaignAttributes](docs/ExternalEditableCampaignAttributes.md)
 - [ExternalKeywordTarget](docs/ExternalKeywordTarget.md)
 - [ExternalLineItemCapping](docs/ExternalLineItemCapping.md)
 - [ExternalPostCampaign](docs/ExternalPostCampaign.md)
 - [ExternalPreferredLineItem](docs/ExternalPreferredLineItem.md)
 - [ExternalPreferredLineItemCreateModel](docs/ExternalPreferredLineItemCreateModel.md)
 - [ExternalPreferredLineItemUpdateModel](docs/ExternalPreferredLineItemUpdateModel.md)
 - [ExternalPromotedProduct](docs/ExternalPromotedProduct.md)
 - [ExternalPutBalanceCampaign](docs/ExternalPutBalanceCampaign.md)
 - [ExternalPutCampaign](docs/ExternalPutCampaign.md)
 - [ExternalRetailer](docs/ExternalRetailer.md)
 - [InputResourceOfAuctionLineItemCreateModel](docs/InputResourceOfAuctionLineItemCreateModel.md)
 - [InputResourceOfPreferredLineItemCreateModel](docs/InputResourceOfPreferredLineItemCreateModel.md)
 - [JsonApiBodyWithExternalIdOfEditableCampaignAttributesAndCampaign](docs/JsonApiBodyWithExternalIdOfEditableCampaignAttributesAndCampaign.md)
 - [JsonApiBodyWithIdOfInt64AndAccountAndAccount](docs/JsonApiBodyWithIdOfInt64AndAccountAndAccount.md)
 - [JsonApiBodyWithIdOfInt64AndBalanceAndBalance](docs/JsonApiBodyWithIdOfInt64AndBalanceAndBalance.md)
 - [JsonApiBodyWithIdOfInt64AndBrandAndBrand](docs/JsonApiBodyWithIdOfInt64AndBrandAndBrand.md)
 - [JsonApiBodyWithIdOfInt64AndCampaignAndCampaign](docs/JsonApiBodyWithIdOfInt64AndCampaignAndCampaign.md)
 - [JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus](docs/JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus.md)
 - [JsonApiBodyWithIdOfInt64AndRetailerAndRetailer](docs/JsonApiBodyWithIdOfInt64AndRetailerAndRetailer.md)
 - [JsonApiBodyWithIdOfStringAndPromotedProductAndPromotedProduct](docs/JsonApiBodyWithIdOfStringAndPromotedProductAndPromotedProduct.md)
 - [JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign](docs/JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign.md)
 - [JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest](docs/JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest.md)
 - [JsonApiDataRequestOfDeleteBalanceCampaign](docs/JsonApiDataRequestOfDeleteBalanceCampaign.md)
 - [JsonApiDataRequestOfPutBalanceCampaign](docs/JsonApiDataRequestOfPutBalanceCampaign.md)
 - [JsonApiDataRequestWithIdOfStringAndPromotedProduct](docs/JsonApiDataRequestWithIdOfStringAndPromotedProduct.md)
 - [JsonApiPageResponseOfAccount](docs/JsonApiPageResponseOfAccount.md)
 - [JsonApiPageResponseOfBalance](docs/JsonApiPageResponseOfBalance.md)
 - [JsonApiPageResponseOfBrand](docs/JsonApiPageResponseOfBrand.md)
 - [JsonApiPageResponseOfCampaign](docs/JsonApiPageResponseOfCampaign.md)
 - [JsonApiPageResponseOfRetailer](docs/JsonApiPageResponseOfRetailer.md)
 - [JsonApiPageResponseOfStringAndPromotedProduct](docs/JsonApiPageResponseOfStringAndPromotedProduct.md)
 - [JsonApiRequestOfCatalogRequest](docs/JsonApiRequestOfCatalogRequest.md)
 - [JsonApiSingleResponseOfCampaign](docs/JsonApiSingleResponseOfCampaign.md)
 - [JsonApiSingleResponseOfCatalogStatus](docs/JsonApiSingleResponseOfCatalogStatus.md)
 - [KeywordTargetRequest](docs/KeywordTargetRequest.md)
 - [KeywordTargetResponse](docs/KeywordTargetResponse.md)
 - [OAuthErrorModel](docs/OAuthErrorModel.md)
 - [PageMetadata](docs/PageMetadata.md)
 - [PageOfBalanceCampaign](docs/PageOfBalanceCampaign.md)
 - [PreferredLineItemCreateModelRequest](docs/PreferredLineItemCreateModelRequest.md)
 - [PreferredLineItemPagedListResponse](docs/PreferredLineItemPagedListResponse.md)
 - [PreferredLineItemResponse](docs/PreferredLineItemResponse.md)
 - [PreferredLineItemUpdateModelRequest](docs/PreferredLineItemUpdateModelRequest.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ReportRequest](docs/ReportRequest.md)
 - [ReportRequestAttributes](docs/ReportRequestAttributes.md)
 - [ReportStatus](docs/ReportStatus.md)
 - [ReportStatusAttributes](docs/ReportStatusAttributes.md)
 - [ResourceOfAuctionLineItem](docs/ResourceOfAuctionLineItem.md)
 - [ResourceOfAuctionLineItemUpdateModel](docs/ResourceOfAuctionLineItemUpdateModel.md)
 - [ResourceOfCommonLineItem](docs/ResourceOfCommonLineItem.md)
 - [ResourceOfKeywordTarget](docs/ResourceOfKeywordTarget.md)
 - [ResourceOfPreferredLineItem](docs/ResourceOfPreferredLineItem.md)
 - [ResourceOfPreferredLineItemUpdateModel](docs/ResourceOfPreferredLineItemUpdateModel.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Disclaimer

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.