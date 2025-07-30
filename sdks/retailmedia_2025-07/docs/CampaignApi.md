# CampaignApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRemoveKeywords**](CampaignApi.md#addRemoveKeywords) | **POST** /2025-07/retail-media/line-items/{id}/keywords/add-remove |  |
| [**appendPromotedProducts**](CampaignApi.md#appendPromotedProducts) | **POST** /2025-07/retail-media/line-items/{line-item-id}/products/append |  |
| [**createAsset**](CampaignApi.md#createAsset) | **POST** /2025-07/retail-media/assets |  |
| [**deletePromotedProducts**](CampaignApi.md#deletePromotedProducts) | **POST** /2025-07/retail-media/line-items/{line-item-id}/products/delete |  |
| [**fetchKeywords**](CampaignApi.md#fetchKeywords) | **GET** /2025-07/retail-media/line-items/{id}/keywords |  |
| [**fetchPromotedProducts**](CampaignApi.md#fetchPromotedProducts) | **GET** /2025-07/retail-media/line-items/{line-item-id}/products |  |
| [**getApi202110ExternalAccountCreativesByAccountId**](CampaignApi.md#getApi202110ExternalAccountCreativesByAccountId) | **GET** /2025-07/retail-media/accounts/{account-id}/creatives |  |
| [**getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId) | **GET** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket |  |
| [**getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId) | **GET** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/audiences |  |
| [**getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId) | **GET** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/stores |  |
| [**getApi202110ExternalRetailerPagesByRetailerId**](CampaignApi.md#getApi202110ExternalRetailerPagesByRetailerId) | **GET** /2025-07/retail-media/retailers/{retailerId}/pages |  |
| [**getApi202204ExternalCategorieByCategoryId**](CampaignApi.md#getApi202204ExternalCategorieByCategoryId) | **GET** /2025-07/retail-media/categories/{categoryId} |  |
| [**getApi202204ExternalCategories**](CampaignApi.md#getApi202204ExternalCategories) | **GET** /2025-07/retail-media/categories |  |
| [**getApi202207ExternalRetailerByRetailerIdTemplatestemplateId**](CampaignApi.md#getApi202207ExternalRetailerByRetailerIdTemplatestemplateId) | **GET** /2025-07/retail-media/retailers/{retailer-id}/templates/{template-id} |  |
| [**getApi202207ExternalRetailerTemplatesByRetailerId**](CampaignApi.md#getApi202207ExternalRetailerTemplatesByRetailerId) | **GET** /2025-07/retail-media/retailers/{retailer-id}/templates |  |
| [**getApi202301ExternalAccountCampaignsByAccountId**](CampaignApi.md#getApi202301ExternalAccountCampaignsByAccountId) | **GET** /2025-07/retail-media/accounts/{account-id}/campaigns |  |
| [**getApi202301ExternalCampaignByCampaignId**](CampaignApi.md#getApi202301ExternalCampaignByCampaignId) | **GET** /2025-07/retail-media/campaigns/{campaignId} |  |
| [**getApiV1ExternalAccountBrandsByAccountId**](CampaignApi.md#getApiV1ExternalAccountBrandsByAccountId) | **GET** /2025-07/retail-media/accounts/{accountId}/brands |  |
| [**getApiV1ExternalAccountRetailersByAccountId**](CampaignApi.md#getApiV1ExternalAccountRetailersByAccountId) | **GET** /2025-07/retail-media/accounts/{accountId}/retailers |  |
| [**getApiV1ExternalCatalogOutputByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogOutputByCatalogId) | **GET** /2025-07/retail-media/catalogs/{catalogId}/output |  |
| [**getApiV1ExternalCatalogStatusByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogStatusByCatalogId) | **GET** /2025-07/retail-media/catalogs/{catalogId}/status |  |
| [**getApiV2ExternalAccountByAccountIdCreativescreativeId**](CampaignApi.md#getApiV2ExternalAccountByAccountIdCreativescreativeId) | **GET** /2025-07/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**getApiV2ExternalAccountLineItemsByAccountId**](CampaignApi.md#getApiV2ExternalAccountLineItemsByAccountId) | **GET** /2025-07/retail-media/accounts/{account-id}/line-items |  |
| [**getApiV2ExternalAuctionLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalAuctionLineItemByLineItemId) | **GET** /2025-07/retail-media/auction-line-items/{line-item-id} |  |
| [**getApiV2ExternalCampaignAuctionLineItemsByCampaignId**](CampaignApi.md#getApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **GET** /2025-07/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**getApiV2ExternalCampaignPreferredLineItemsByCampaignId**](CampaignApi.md#getApiV2ExternalCampaignPreferredLineItemsByCampaignId) | **GET** /2025-07/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**getApiV2ExternalLineItemBidMultipliersByLineItemId**](CampaignApi.md#getApiV2ExternalLineItemBidMultipliersByLineItemId) | **GET** /2025-07/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**getApiV2ExternalLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalLineItemByLineItemId) | **GET** /2025-07/retail-media/line-items/{line-item-id} |  |
| [**getApiV2ExternalPreferredLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalPreferredLineItemByLineItemId) | **GET** /2025-07/retail-media/preferred-line-items/{line-item-id} |  |
| [**getCampaignBudgetOverrides**](CampaignApi.md#getCampaignBudgetOverrides) | **GET** /2025-07/retail-media/campaigns/{campaignId}/campaign-budget-overrides |  |
| [**getCpcMinBidsBySkuIdsV1**](CampaignApi.md#getCpcMinBidsBySkuIdsV1) | **POST** /2025-07/retail-media/retailers/{retailerId}/cpc-min-bids |  |
| [**getLineItemBudgetOverrides**](CampaignApi.md#getLineItemBudgetOverrides) | **GET** /2025-07/retail-media/line-items/{lineItemId}/line-item-budget-overrides |  |
| [**getRecommendedKeywords**](CampaignApi.md#getRecommendedKeywords) | **GET** /2025-07/retail-media/line-items/{externalLineItemId}/keywords/recommended |  |
| [**inReviewReportV1**](CampaignApi.md#inReviewReportV1) | **GET** /2025-07/retail-media/accounts/{account-id}/keywords/in-review-report |  |
| [**pausePromotedProducts**](CampaignApi.md#pausePromotedProducts) | **POST** /2025-07/retail-media/line-items/{line-item-id}/products/pause |  |
| [**postApi202110ExternalBalanceCampaignsAppendByBalanceId**](CampaignApi.md#postApi202110ExternalBalanceCampaignsAppendByBalanceId) | **POST** /2025-07/retail-media/balances/{balance-id}/campaigns/append |  |
| [**postApi202110ExternalBalanceCampaignsDeleteByBalanceId**](CampaignApi.md#postApi202110ExternalBalanceCampaignsDeleteByBalanceId) | **POST** /2025-07/retail-media/balances/{balance-id}/campaigns/delete |  |
| [**postApi202110ExternalCampaignPreferredLineItemsByCampaignId**](CampaignApi.md#postApi202110ExternalCampaignPreferredLineItemsByCampaignId) | **POST** /2025-07/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId) | **POST** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket/append |  |
| [**postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId) | **POST** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket/delete |  |
| [**postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId) | **POST** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/audiences/append |  |
| [**postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId) | **POST** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/audiences/delete |  |
| [**postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId) | **POST** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/stores/append |  |
| [**postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId) | **POST** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/stores/delete |  |
| [**postApi202210ExternalAccountCreativesByAccountId**](CampaignApi.md#postApi202210ExternalAccountCreativesByAccountId) | **POST** /2025-07/retail-media/accounts/{account-id}/creatives |  |
| [**postApi202301ExternalAccountCampaignsByAccountId**](CampaignApi.md#postApi202301ExternalAccountCampaignsByAccountId) | **POST** /2025-07/retail-media/accounts/{account-id}/campaigns |  |
| [**postApiExternalV2AccountBrandCatalogExportByAccountId**](CampaignApi.md#postApiExternalV2AccountBrandCatalogExportByAccountId) | **POST** /2025-07/retail-media/accounts/{accountId}/brand-catalog-export |  |
| [**postApiExternalV2AccountSellerCatalogExportByAccountId**](CampaignApi.md#postApiExternalV2AccountSellerCatalogExportByAccountId) | **POST** /2025-07/retail-media/accounts/{accountId}/seller-catalog-export |  |
| [**postApiV1ExternalAccountCatalogsByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsByAccountId) | **POST** /2025-07/retail-media/accounts/{accountId}/catalogs |  |
| [**postApiV1ExternalAccountCatalogsSellersByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsSellersByAccountId) | **POST** /2025-07/retail-media/accounts/{accountId}/catalogs/sellers |  |
| [**postApiV2ExternalAccountCreativesSearchByAccountId**](CampaignApi.md#postApiV2ExternalAccountCreativesSearchByAccountId) | **POST** /2025-07/retail-media/accounts/{account-id}/creatives/search |  |
| [**postApiV2ExternalCampaignAuctionLineItemsByCampaignId**](CampaignApi.md#postApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **POST** /2025-07/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**putApi202110ExternalPreferredLineItemByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemByLineItemId) | **PUT** /2025-07/retail-media/preferred-line-items/{line-item-id} |  |
| [**putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId) | **PUT** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket |  |
| [**putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId) | **PUT** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/audiences |  |
| [**putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId) | **PUT** /2025-07/retail-media/preferred-line-items/{line-item-id}/targeting/stores |  |
| [**putApi202210ExternalAccountByAccountIdCreativescreativeId**](CampaignApi.md#putApi202210ExternalAccountByAccountIdCreativescreativeId) | **PUT** /2025-07/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**putApi202301ExternalCampaignByCampaignId**](CampaignApi.md#putApi202301ExternalCampaignByCampaignId) | **PUT** /2025-07/retail-media/campaigns/{campaignId} |  |
| [**putApiV2ExternalAuctionLineItemByLineItemId**](CampaignApi.md#putApiV2ExternalAuctionLineItemByLineItemId) | **PUT** /2025-07/retail-media/auction-line-items/{line-item-id} |  |
| [**putApiV2ExternalLineItemBidMultipliersByLineItemId**](CampaignApi.md#putApiV2ExternalLineItemBidMultipliersByLineItemId) | **PUT** /2025-07/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**searchBrandsByNameAsyncV1**](CampaignApi.md#searchBrandsByNameAsyncV1) | **POST** /2025-07/retail-media/brands/search |  |
| [**setKeywordBids**](CampaignApi.md#setKeywordBids) | **POST** /2025-07/retail-media/line-items/{id}/keywords/set-bid |  |
| [**unpausePromotedProducts**](CampaignApi.md#unpausePromotedProducts) | **POST** /2025-07/retail-media/line-items/{line-item-id}/products/unpause |  |
| [**updateCampaignBudgetOverrides**](CampaignApi.md#updateCampaignBudgetOverrides) | **PUT** /2025-07/retail-media/campaigns/{campaignId}/campaign-budget-overrides |  |
| [**updateKeywordReviewsV1**](CampaignApi.md#updateKeywordReviewsV1) | **POST** /2025-07/retail-media/line-items/{line-item-id}/keywords/review |  |
| [**updateLineItemBudgetOverrides**](CampaignApi.md#updateLineItemBudgetOverrides) | **PUT** /2025-07/retail-media/line-items/{lineItemId}/line-item-budget-overrides |  |



## addRemoveKeywords

> ResourceOutcome addRemoveKeywords(id, addRemoveKeywordsModelRequest)



Add or Remove keywords from the line item in bulk

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String id = "id_example"; // String | ID of the line item
        AddRemoveKeywordsModelRequest addRemoveKeywordsModelRequest = new AddRemoveKeywordsModelRequest(); // AddRemoveKeywordsModelRequest | 
        try {
            ResourceOutcome result = apiInstance.addRemoveKeywords(id, addRemoveKeywordsModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#addRemoveKeywords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the line item | |
| **addRemoveKeywordsModelRequest** | [**AddRemoveKeywordsModelRequest**](AddRemoveKeywordsModelRequest.md)|  | [optional] |

### Return type

[**ResourceOutcome**](ResourceOutcome.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## appendPromotedProducts

> ProductResourceOutcome appendPromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Append a collection of promoted products to a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | ID of the line item
        PromotedProductResourceCollectionInput promotedProductResourceCollectionInput = new PromotedProductResourceCollectionInput(); // PromotedProductResourceCollectionInput | Request body whose {data} contains an array of promoted products.
        try {
            ProductResourceOutcome result = apiInstance.appendPromotedProducts(lineItemId, promotedProductResourceCollectionInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#appendPromotedProducts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| ID of the line item | |
| **promotedProductResourceCollectionInput** | [**PromotedProductResourceCollectionInput**](PromotedProductResourceCollectionInput.md)| Request body whose {data} contains an array of promoted products. | [optional] |

### Return type

[**ProductResourceOutcome**](ProductResourceOutcome.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Promoted products appended to the line item with warnings |  -  |
| **204** | Promoted products appended to the line item |  -  |
| **400** | Invalid request body |  -  |
| **403** | Invalid external line item ID |  -  |


## createAsset

> AssetResponse createAsset(assetFile)



Creates an asset

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        File assetFile = new File("/path/to/file"); // File | The asset binary content
        try {
            AssetResponse result = apiInstance.createAsset(assetFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createAsset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetFile** | **File**| The asset binary content | |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## deletePromotedProducts

> deletePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Remove a collection of promoted products from a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | ID of the line item
        PromotedProductResourceCollectionInput promotedProductResourceCollectionInput = new PromotedProductResourceCollectionInput(); // PromotedProductResourceCollectionInput | Request body whose {data} contains an array of promoted products.
        try {
            apiInstance.deletePromotedProducts(lineItemId, promotedProductResourceCollectionInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deletePromotedProducts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| ID of the line item | |
| **promotedProductResourceCollectionInput** | [**PromotedProductResourceCollectionInput**](PromotedProductResourceCollectionInput.md)| Request body whose {data} contains an array of promoted products. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promoted products removed from the line item |  -  |
| **400** | Invalid request body |  -  |
| **403** | Invalid external line item ID |  -  |


## fetchKeywords

> KeywordsModelResponse fetchKeywords(id)



Fetch keywords associated with the specified line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String id = "id_example"; // String | ID of the line item
        try {
            KeywordsModelResponse result = apiInstance.fetchKeywords(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#fetchKeywords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the line item | |

### Return type

[**KeywordsModelResponse**](KeywordsModelResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## fetchPromotedProducts

> PromotedProductResourceCollectionOutcome fetchPromotedProducts(lineItemId, fields, limit, offset)



Retrieve a page of promoted products for a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | ID of the line item.
        String fields = "fields_example"; // String | A comma separated list of attribute names from the response model to compute and return.              Valid values are `status` and `bidOverride` in any order. Defaults to `status`.
        Integer limit = 56; // Integer | Maximum page size to fetch. Defaults to 500.
        Integer offset = 56; // Integer | Offset of the first item to fetch. Defaults to zero.
        try {
            PromotedProductResourceCollectionOutcome result = apiInstance.fetchPromotedProducts(lineItemId, fields, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#fetchPromotedProducts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| ID of the line item. | |
| **fields** | **String**| A comma separated list of attribute names from the response model to compute and return.              Valid values are &#x60;status&#x60; and &#x60;bidOverride&#x60; in any order. Defaults to &#x60;status&#x60;. | [optional] |
| **limit** | **Integer**| Maximum page size to fetch. Defaults to 500. | [optional] |
| **offset** | **Integer**| Offset of the first item to fetch. Defaults to zero. | [optional] |

### Return type

[**PromotedProductResourceCollectionOutcome**](PromotedProductResourceCollectionOutcome.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Promoted products associated with the line item |  -  |
| **403** | Invalid external line item ID |  -  |


## getApi202110ExternalAccountCreativesByAccountId

> Creative202110ListResponse getApi202110ExternalAccountCreativesByAccountId(accountId)



Get account creatives

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id to retrieve creatives for
        try {
            Creative202110ListResponse result = apiInstance.getApi202110ExternalAccountCreativesByAccountId(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalAccountCreativesByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| External account id to retrieve creatives for | |

### Return type

[**Creative202110ListResponse**](Creative202110ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId

> AddToBasketTarget202110Response getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId(lineItemId)



This endpoint gets the add to basket target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        try {
            AddToBasketTarget202110Response result = apiInstance.getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |

### Return type

[**AddToBasketTarget202110Response**](AddToBasketTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId

> AudienceTarget202110Response getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId(lineItemId)



This endpoint gets the audience target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        try {
            AudienceTarget202110Response result = apiInstance.getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |

### Return type

[**AudienceTarget202110Response**](AudienceTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId

> StoreTarget202110Response getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId(lineItemId)



This endpoint gets the store target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        try {
            StoreTarget202110Response result = apiInstance.getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |

### Return type

[**StoreTarget202110Response**](StoreTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApi202110ExternalRetailerPagesByRetailerId

> ExternalRetailerPages202110 getApi202110ExternalRetailerPagesByRetailerId(retailerId)



Get the page types available for the given retailer

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer retailerId = 56; // Integer | The retailers to fetch pages for
        try {
            ExternalRetailerPages202110 result = apiInstance.getApi202110ExternalRetailerPagesByRetailerId(retailerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalRetailerPagesByRetailerId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retailerId** | **Integer**| The retailers to fetch pages for | |

### Return type

[**ExternalRetailerPages202110**](ExternalRetailerPages202110.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages fetched successfully |  -  |


## getApi202204ExternalCategorieByCategoryId

> Category202204 getApi202204ExternalCategorieByCategoryId(categoryId)



Endpoint to search for a specific category by categoryId.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer categoryId = 56; // Integer | ID of the desired category
        try {
            Category202204 result = apiInstance.getApi202204ExternalCategorieByCategoryId(categoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202204ExternalCategorieByCategoryId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **categoryId** | **Integer**| ID of the desired category | |

### Return type

[**Category202204**](Category202204.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieval completed and category is returned. |  -  |
| **400** | No IDs were passed in. |  -  |
| **500** | A non-request input based error occurred in the server. |  -  |


## getApi202204ExternalCategories

> Category202204ListResponse getApi202204ExternalCategories(pageIndex, pageSize, retailerId, textSubstring)



Endpoint to search categories by text and retailer.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer pageIndex = 0; // Integer | The start position in the overall list of matches. Must be zero or greater.
        Integer pageSize = 100; // Integer | The maximum number of results to return with each call. Must be greater than zero.
        Integer retailerId = 56; // Integer | The retailer id for which Categories fetched
        String textSubstring = "textSubstring_example"; // String | Query string to search across Categories
        try {
            Category202204ListResponse result = apiInstance.getApi202204ExternalCategories(pageIndex, pageSize, retailerId, textSubstring);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202204ExternalCategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageIndex** | **Integer**| The start position in the overall list of matches. Must be zero or greater. | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of results to return with each call. Must be greater than zero. | [optional] [default to 100] |
| **retailerId** | **Integer**| The retailer id for which Categories fetched | [optional] |
| **textSubstring** | **String**| Query string to search across Categories | [optional] |

### Return type

[**Category202204ListResponse**](Category202204ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Categories found. |  -  |


## getApi202207ExternalRetailerByRetailerIdTemplatestemplateId

> TemplateResponse getApi202207ExternalRetailerByRetailerIdTemplatestemplateId(retailerId, templateId)



Gets the template for the specified retailer id and template id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer retailerId = 56; // Integer | Retailer Id
        Integer templateId = 56; // Integer | Template Id
        try {
            TemplateResponse result = apiInstance.getApi202207ExternalRetailerByRetailerIdTemplatestemplateId(retailerId, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202207ExternalRetailerByRetailerIdTemplatestemplateId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retailerId** | **Integer**| Retailer Id | |
| **templateId** | **Integer**| Template Id | |

### Return type

[**TemplateResponse**](TemplateResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Template found for the retailer |  -  |


## getApi202207ExternalRetailerTemplatesByRetailerId

> TemplateListResponse getApi202207ExternalRetailerTemplatesByRetailerId(retailerId)



Get retailer creative templates

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer retailerId = 56; // Integer | External retailer id to retrieve creative templates for
        try {
            TemplateListResponse result = apiInstance.getApi202207ExternalRetailerTemplatesByRetailerId(retailerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202207ExternalRetailerTemplatesByRetailerId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retailerId** | **Integer**| External retailer id to retrieve creative templates for | |

### Return type

[**TemplateListResponse**](TemplateListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Templates found |  -  |


## getApi202301ExternalAccountCampaignsByAccountId

> JsonApiPageResponseOfCampaignV202301 getApi202301ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize)



Get all the editable and creatable campaign attributes including all types of budgets for each campaigns in relation to the account id, limited by the campaign ids.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to request the campaign for.
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            JsonApiPageResponseOfCampaignV202301 result = apiInstance.getApi202301ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202301ExternalAccountCampaignsByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to request the campaign for. | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**JsonApiPageResponseOfCampaignV202301**](JsonApiPageResponseOfCampaignV202301.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202301ExternalCampaignByCampaignId

> JsonApiSingleResponseOfCampaignV202301 getApi202301ExternalCampaignByCampaignId(campaignId)



Get all the editable and creatable campaign attributes including all types of budgets given the campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | Campaign Id of the campaign detail
        try {
            JsonApiSingleResponseOfCampaignV202301 result = apiInstance.getApi202301ExternalCampaignByCampaignId(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202301ExternalCampaignByCampaignId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| Campaign Id of the campaign detail | |

### Return type

[**JsonApiSingleResponseOfCampaignV202301**](JsonApiSingleResponseOfCampaignV202301.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccountBrandsByAccountId

> JsonApiPageResponseOfBrand getApiV1ExternalAccountBrandsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The given account id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            JsonApiPageResponseOfBrand result = apiInstance.getApiV1ExternalAccountBrandsByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountBrandsByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The given account id | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**JsonApiPageResponseOfBrand**](JsonApiPageResponseOfBrand.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccountRetailersByAccountId

> JsonApiPageResponseOfRetailer getApiV1ExternalAccountRetailersByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The given account id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            JsonApiPageResponseOfRetailer result = apiInstance.getApiV1ExternalAccountRetailersByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountRetailersByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The given account id | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**JsonApiPageResponseOfRetailer**](JsonApiPageResponseOfRetailer.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalCatalogOutputByCatalogId

> File getApiV1ExternalCatalogOutputByCatalogId(catalogId)



Output the indicated catalog. Catalogs are only available for retrieval when their associated status request  is at a Success status.  Produces application/x-json-stream of v2021_07 CatalogProduct json objects.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String catalogId = "catalogId_example"; // String | A catalog ID returned from an account catalog request.
        try {
            File result = apiInstance.getApiV1ExternalCatalogOutputByCatalogId(catalogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalCatalogOutputByCatalogId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **String**| A catalog ID returned from an account catalog request. | |

### Return type

[**File**](File.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/x-json-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog download initiated. |  -  |
| **204** | Catalog has expired. |  -  |
| **400** | The indicated catalog is not available for retrieval, wait for a success status. |  -  |


## getApiV1ExternalCatalogStatusByCatalogId

> JsonApiSingleResponseOfCatalogStatus getApiV1ExternalCatalogStatusByCatalogId(catalogId)



Check the status of a catalog request.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String catalogId = "catalogId_example"; // String | A catalog ID returned from an account catalog request.
        try {
            JsonApiSingleResponseOfCatalogStatus result = apiInstance.getApiV1ExternalCatalogStatusByCatalogId(catalogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalCatalogStatusByCatalogId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **String**| A catalog ID returned from an account catalog request. | |

### Return type

[**JsonApiSingleResponseOfCatalogStatus**](JsonApiSingleResponseOfCatalogStatus.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request found. |  -  |


## getApiV2ExternalAccountByAccountIdCreativescreativeId

> Creative2Response getApiV2ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId)



Get the specified creative

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id to retrieve creatives for
        String creativeId = "creativeId_example"; // String | Creative to get
        try {
            Creative2Response result = apiInstance.getApiV2ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalAccountByAccountIdCreativescreativeId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| External account id to retrieve creatives for | |
| **creativeId** | **String**| Creative to get | |

### Return type

[**Creative2Response**](Creative2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## getApiV2ExternalAccountLineItemsByAccountId

> CommonLineItemPagedListResponse getApiV2ExternalAccountLineItemsByAccountId(accountId, limitToCampaignId, limitToId, limitToType, pageIndex, pageSize)



Gets page of line item objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The given account id
        List<String> limitToCampaignId = Arrays.asList(); // List<String> | The campaign ids that you would like to limit your result set to
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        String limitToType = "Unknown"; // String | The campaign types that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            CommonLineItemPagedListResponse result = apiInstance.getApiV2ExternalAccountLineItemsByAccountId(accountId, limitToCampaignId, limitToId, limitToType, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalAccountLineItemsByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The given account id | |
| **limitToCampaignId** | [**List&lt;String&gt;**](String.md)| The campaign ids that you would like to limit your result set to | [optional] |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **limitToType** | **String**| The campaign types that you would like to limit your result set to | [optional] [enum: Unknown, Auction, Preferred] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**CommonLineItemPagedListResponse**](CommonLineItemPagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV2ExternalAuctionLineItemByLineItemId

> AuctionLineItemResponse getApiV2ExternalAuctionLineItemByLineItemId(lineItemId)



Gets the auction line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        try {
            AuctionLineItemResponse result = apiInstance.getApiV2ExternalAuctionLineItemByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalAuctionLineItemByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The given line item id | |

### Return type

[**AuctionLineItemResponse**](AuctionLineItemResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApiV2ExternalCampaignAuctionLineItemsByCampaignId

> AuctionLineItemPagedListResponse getApiV2ExternalCampaignAuctionLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of auction line item objects for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The given campaign id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            AuctionLineItemPagedListResponse result = apiInstance.getApiV2ExternalCampaignAuctionLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalCampaignAuctionLineItemsByCampaignId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| The given campaign id | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**AuctionLineItemPagedListResponse**](AuctionLineItemPagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApiV2ExternalCampaignPreferredLineItemsByCampaignId

> PreferredLineItemV2PagedListResponse getApiV2ExternalCampaignPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of preferred line item objects for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The given campaign id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            PreferredLineItemV2PagedListResponse result = apiInstance.getApiV2ExternalCampaignPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalCampaignPreferredLineItemsByCampaignId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| The given campaign id | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**PreferredLineItemV2PagedListResponse**](PreferredLineItemV2PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApiV2ExternalLineItemBidMultipliersByLineItemId

> JsonApiSingleResponseOfLineItemBidMultipliersV2 getApiV2ExternalLineItemBidMultipliersByLineItemId(lineItemId)



Fetch all bid multipliers for a given line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | External LineItemId for bid multiplier retrieval
        try {
            JsonApiSingleResponseOfLineItemBidMultipliersV2 result = apiInstance.getApiV2ExternalLineItemBidMultipliersByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalLineItemBidMultipliersByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| External LineItemId for bid multiplier retrieval | |

### Return type

[**JsonApiSingleResponseOfLineItemBidMultipliersV2**](JsonApiSingleResponseOfLineItemBidMultipliersV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BidMultipliers Found |  -  |


## getApiV2ExternalLineItemByLineItemId

> CommonLineItemResponse getApiV2ExternalLineItemByLineItemId(lineItemId)



Gets the line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        try {
            CommonLineItemResponse result = apiInstance.getApiV2ExternalLineItemByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalLineItemByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The given line item id | |

### Return type

[**CommonLineItemResponse**](CommonLineItemResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV2ExternalPreferredLineItemByLineItemId

> PreferredLineItemV2Response getApiV2ExternalPreferredLineItemByLineItemId(lineItemId)



Gets the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        try {
            PreferredLineItemV2Response result = apiInstance.getApiV2ExternalPreferredLineItemByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV2ExternalPreferredLineItemByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The given line item id | |

### Return type

[**PreferredLineItemV2Response**](PreferredLineItemV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getCampaignBudgetOverrides

> ValueResourceOutcomeOfCampaignBudgetOverrides getCampaignBudgetOverrides(campaignId)



Get current campaign budget overrides by given campaign id.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Long campaignId = 56L; // Long | Campaign id.
        try {
            ValueResourceOutcomeOfCampaignBudgetOverrides result = apiInstance.getCampaignBudgetOverrides(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCampaignBudgetOverrides");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Campaign id. | |

### Return type

[**ValueResourceOutcomeOfCampaignBudgetOverrides**](ValueResourceOutcomeOfCampaignBudgetOverrides.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCpcMinBidsBySkuIdsV1

> ValueResourceOutcomeCpcMinBidsResponse getCpcMinBidsBySkuIdsV1(retailerId, valueResourceInputCpcMinBidsRequest)



Get overall and individual minimum bid amount for given retailer id and sku id list.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer retailerId = 56; // Integer | Retailer Id.
        ValueResourceInputCpcMinBidsRequest valueResourceInputCpcMinBidsRequest = new ValueResourceInputCpcMinBidsRequest(); // ValueResourceInputCpcMinBidsRequest | Cpc minimum bid amount request object.
        try {
            ValueResourceOutcomeCpcMinBidsResponse result = apiInstance.getCpcMinBidsBySkuIdsV1(retailerId, valueResourceInputCpcMinBidsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCpcMinBidsBySkuIdsV1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retailerId** | **Integer**| Retailer Id. | |
| **valueResourceInputCpcMinBidsRequest** | [**ValueResourceInputCpcMinBidsRequest**](ValueResourceInputCpcMinBidsRequest.md)| Cpc minimum bid amount request object. | [optional] |

### Return type

[**ValueResourceOutcomeCpcMinBidsResponse**](ValueResourceOutcomeCpcMinBidsResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getLineItemBudgetOverrides

> ValueResourceOutcomeOfLineItemBudgetOverrides getLineItemBudgetOverrides(lineItemId)



Gets a collection of monthly and daily budget overrides for the provided line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item id to get budget overrides for.
        try {
            ValueResourceOutcomeOfLineItemBudgetOverrides result = apiInstance.getLineItemBudgetOverrides(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getLineItemBudgetOverrides");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item id to get budget overrides for. | |

### Return type

[**ValueResourceOutcomeOfLineItemBudgetOverrides**](ValueResourceOutcomeOfLineItemBudgetOverrides.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getRecommendedKeywords

> ValueResourceOutcomeOfRecommendedKeywordsResult getRecommendedKeywords(externalLineItemId)



Retrieves a collection of recommended keywords for a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String externalLineItemId = "externalLineItemId_example"; // String | The line item identifier
        try {
            ValueResourceOutcomeOfRecommendedKeywordsResult result = apiInstance.getRecommendedKeywords(externalLineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getRecommendedKeywords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalLineItemId** | **String**| The line item identifier | |

### Return type

[**ValueResourceOutcomeOfRecommendedKeywordsResult**](ValueResourceOutcomeOfRecommendedKeywordsResult.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## inReviewReportV1

> EntityResourceCollectionOutcomeLineItemKeywordReviewReportAndMetadata inReviewReportV1(accountId, limit, offset)



Generate a list of reports for line items which contain one or more actionable keyword reviews

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Long accountId = 56L; // Long | The account to generate a report for
        Integer limit = 25; // Integer | Number of items per page
        Integer offset = 0; // Integer | Offset for pagination
        try {
            EntityResourceCollectionOutcomeLineItemKeywordReviewReportAndMetadata result = apiInstance.inReviewReportV1(accountId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#inReviewReportV1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Long**| The account to generate a report for | |
| **limit** | **Integer**| Number of items per page | [optional] [default to 25] |
| **offset** | **Integer**| Offset for pagination | [optional] [default to 0] |

### Return type

[**EntityResourceCollectionOutcomeLineItemKeywordReviewReportAndMetadata**](EntityResourceCollectionOutcomeLineItemKeywordReviewReportAndMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## pausePromotedProducts

> pausePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Pause a collection of promoted products associated with a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | ID of the line item
        PromotedProductResourceCollectionInput promotedProductResourceCollectionInput = new PromotedProductResourceCollectionInput(); // PromotedProductResourceCollectionInput | Request body whose {data} contains an array of promoted products.
        try {
            apiInstance.pausePromotedProducts(lineItemId, promotedProductResourceCollectionInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#pausePromotedProducts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| ID of the line item | |
| **promotedProductResourceCollectionInput** | [**PromotedProductResourceCollectionInput**](PromotedProductResourceCollectionInput.md)| Request body whose {data} contains an array of promoted products. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promoted products paused |  -  |
| **400** | Invalid request body |  -  |
| **403** | Invalid external line item ID |  -  |


## postApi202110ExternalBalanceCampaignsAppendByBalanceId

> BalanceCampaign202110PagedListResponse postApi202110ExternalBalanceCampaignsAppendByBalanceId(balanceId, balanceCampaign202110ListRequest)



appends one or more campaigns to the specified balance

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String balanceId = "balanceId_example"; // String | The balance to add campaigns from
        BalanceCampaign202110ListRequest balanceCampaign202110ListRequest = new BalanceCampaign202110ListRequest(); // BalanceCampaign202110ListRequest | The campaigns to append
        try {
            BalanceCampaign202110PagedListResponse result = apiInstance.postApi202110ExternalBalanceCampaignsAppendByBalanceId(balanceId, balanceCampaign202110ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalBalanceCampaignsAppendByBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **balanceId** | **String**| The balance to add campaigns from | |
| **balanceCampaign202110ListRequest** | [**BalanceCampaign202110ListRequest**](BalanceCampaign202110ListRequest.md)| The campaigns to append | [optional] |

### Return type

[**BalanceCampaign202110PagedListResponse**](BalanceCampaign202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalBalanceCampaignsDeleteByBalanceId

> BalanceCampaign202110PagedListResponse postApi202110ExternalBalanceCampaignsDeleteByBalanceId(balanceId, balanceCampaign202110ListRequest)



Removes one or more campaigns on the specified balance

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String balanceId = "balanceId_example"; // String | The balance to remove campaigns from
        BalanceCampaign202110ListRequest balanceCampaign202110ListRequest = new BalanceCampaign202110ListRequest(); // BalanceCampaign202110ListRequest | The campaigns to append
        try {
            BalanceCampaign202110PagedListResponse result = apiInstance.postApi202110ExternalBalanceCampaignsDeleteByBalanceId(balanceId, balanceCampaign202110ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalBalanceCampaignsDeleteByBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **balanceId** | **String**| The balance to remove campaigns from | |
| **balanceCampaign202110ListRequest** | [**BalanceCampaign202110ListRequest**](BalanceCampaign202110ListRequest.md)| The campaigns to append | [optional] |

### Return type

[**BalanceCampaign202110PagedListResponse**](BalanceCampaign202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalCampaignPreferredLineItemsByCampaignId

> PreferredLineItemV2Response postApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, preferredLineItemCreateModelV2Request)



Creates a new preferred line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The given campaign id
        PreferredLineItemCreateModelV2Request preferredLineItemCreateModelV2Request = new PreferredLineItemCreateModelV2Request(); // PreferredLineItemCreateModelV2Request | The line item settings to create a line item with
        try {
            PreferredLineItemV2Response result = apiInstance.postApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, preferredLineItemCreateModelV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalCampaignPreferredLineItemsByCampaignId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| The given campaign id | |
| **preferredLineItemCreateModelV2Request** | [**PreferredLineItemCreateModelV2Request**](PreferredLineItemCreateModelV2Request.md)| The line item settings to create a line item with | |

### Return type

[**PreferredLineItemV2Response**](PreferredLineItemV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId

> AddToBasketTarget202110Response postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request)



This endpoint appends one or more add to basket ids to targeting on the specified line item.  The resulting state of the add to basket target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        AddToBasketIdsUpdateModel202110Request addToBasketIdsUpdateModel202110Request = new AddToBasketIdsUpdateModel202110Request(); // AddToBasketIdsUpdateModel202110Request | Ids to append to the target
        try {
            AddToBasketTarget202110Response result = apiInstance.postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **addToBasketIdsUpdateModel202110Request** | [**AddToBasketIdsUpdateModel202110Request**](AddToBasketIdsUpdateModel202110Request.md)| Ids to append to the target | [optional] |

### Return type

[**AddToBasketTarget202110Response**](AddToBasketTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId

> AddToBasketTarget202110Response postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request)



This endpoint removes one or more add to basket ids from targeting on the specified line item.  The resulting state of the add to basket target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        AddToBasketIdsUpdateModel202110Request addToBasketIdsUpdateModel202110Request = new AddToBasketIdsUpdateModel202110Request(); // AddToBasketIdsUpdateModel202110Request | Ids to remove from the target
        try {
            AddToBasketTarget202110Response result = apiInstance.postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **addToBasketIdsUpdateModel202110Request** | [**AddToBasketIdsUpdateModel202110Request**](AddToBasketIdsUpdateModel202110Request.md)| Ids to remove from the target | [optional] |

### Return type

[**AddToBasketTarget202110Response**](AddToBasketTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId

> AudienceTarget202110Response postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId(lineItemId, audienceIdsUpdateModel202110Request)



This endpoint appends one or more audiences ids to targeting on the specified line item.  The resulting state of the audience target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        AudienceIdsUpdateModel202110Request audienceIdsUpdateModel202110Request = new AudienceIdsUpdateModel202110Request(); // AudienceIdsUpdateModel202110Request | Audience ids to append to the target
        try {
            AudienceTarget202110Response result = apiInstance.postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId(lineItemId, audienceIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **audienceIdsUpdateModel202110Request** | [**AudienceIdsUpdateModel202110Request**](AudienceIdsUpdateModel202110Request.md)| Audience ids to append to the target | [optional] |

### Return type

[**AudienceTarget202110Response**](AudienceTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId

> AudienceTarget202110Response postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId(lineItemId, audienceIdsUpdateModel202110Request)



This endpoint removes one or more audiences ids from targeting on the specified line item.  The resulting state of the audience target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        AudienceIdsUpdateModel202110Request audienceIdsUpdateModel202110Request = new AudienceIdsUpdateModel202110Request(); // AudienceIdsUpdateModel202110Request | Audience ids to remove from the target
        try {
            AudienceTarget202110Response result = apiInstance.postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId(lineItemId, audienceIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **audienceIdsUpdateModel202110Request** | [**AudienceIdsUpdateModel202110Request**](AudienceIdsUpdateModel202110Request.md)| Audience ids to remove from the target | [optional] |

### Return type

[**AudienceTarget202110Response**](AudienceTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId

> StoreTarget202110Response postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId(lineItemId, storeIdsUpdateModel202110Request)



This endpoint appends one or more store ids to targeting on the specified line item.  The resulting state of the store target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        StoreIdsUpdateModel202110Request storeIdsUpdateModel202110Request = new StoreIdsUpdateModel202110Request(); // StoreIdsUpdateModel202110Request | Store ids to append to the target
        try {
            StoreTarget202110Response result = apiInstance.postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId(lineItemId, storeIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **storeIdsUpdateModel202110Request** | [**StoreIdsUpdateModel202110Request**](StoreIdsUpdateModel202110Request.md)| Store ids to append to the target | [optional] |

### Return type

[**StoreTarget202110Response**](StoreTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId

> StoreTarget202110Response postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId(lineItemId, storeIdsUpdateModel202110Request)



This endpoint removes one or more store ids from targeting on the specified line item.  The resulting state of the store target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        StoreIdsUpdateModel202110Request storeIdsUpdateModel202110Request = new StoreIdsUpdateModel202110Request(); // StoreIdsUpdateModel202110Request | Store ids to remove from the target
        try {
            StoreTarget202110Response result = apiInstance.postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId(lineItemId, storeIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **storeIdsUpdateModel202110Request** | [**StoreIdsUpdateModel202110Request**](StoreIdsUpdateModel202110Request.md)| Store ids to remove from the target | [optional] |

### Return type

[**StoreTarget202110Response**](StoreTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202210ExternalAccountCreativesByAccountId

> Creative202210Response postApi202210ExternalAccountCreativesByAccountId(accountId, creativeCreateModel202207)



Create a creative for an account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id to create a creative for
        CreativeCreateModel202207 creativeCreateModel202207 = new CreativeCreateModel202207(); // CreativeCreateModel202207 | The creative to create
        try {
            Creative202210Response result = apiInstance.postApi202210ExternalAccountCreativesByAccountId(accountId, creativeCreateModel202207);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202210ExternalAccountCreativesByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| External account id to create a creative for | |
| **creativeCreateModel202207** | [**CreativeCreateModel202207**](CreativeCreateModel202207.md)| The creative to create | [optional] |

### Return type

[**Creative202210Response**](Creative202210Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creatives created |  -  |


## postApi202301ExternalAccountCampaignsByAccountId

> JsonApiSingleResponseOfCampaignV202301 postApi202301ExternalAccountCampaignsByAccountId(accountId, postCampaignV202301)



Create a campaign and assign budgets for the given account id with creatable campaign attributes given in request body constrained by business validation. The validation error includes details and source of errors. Pacing can be adjusted and affected by the status of the campaign and the days left on the campaign if auto daily pacing is enabled.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to request the campaign for.
        PostCampaignV202301 postCampaignV202301 = new PostCampaignV202301(); // PostCampaignV202301 | Creatable campaign attributes
        try {
            JsonApiSingleResponseOfCampaignV202301 result = apiInstance.postApi202301ExternalAccountCampaignsByAccountId(accountId, postCampaignV202301);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202301ExternalAccountCampaignsByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to request the campaign for. | |
| **postCampaignV202301** | [**PostCampaignV202301**](PostCampaignV202301.md)| Creatable campaign attributes | [optional] |

### Return type

[**JsonApiSingleResponseOfCampaignV202301**](JsonApiSingleResponseOfCampaignV202301.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## postApiExternalV2AccountBrandCatalogExportByAccountId

> EntityResourceOutcomeOfCatalogStatusV2 postApiExternalV2AccountBrandCatalogExportByAccountId(accountId, valueResourceInputOfBrandCatalogRequestV2)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to request the catalog for.
        ValueResourceInputOfBrandCatalogRequestV2 valueResourceInputOfBrandCatalogRequestV2 = new ValueResourceInputOfBrandCatalogRequestV2(); // ValueResourceInputOfBrandCatalogRequestV2 | 
        try {
            EntityResourceOutcomeOfCatalogStatusV2 result = apiInstance.postApiExternalV2AccountBrandCatalogExportByAccountId(accountId, valueResourceInputOfBrandCatalogRequestV2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiExternalV2AccountBrandCatalogExportByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to request the catalog for. | |
| **valueResourceInputOfBrandCatalogRequestV2** | [**ValueResourceInputOfBrandCatalogRequestV2**](ValueResourceInputOfBrandCatalogRequestV2.md)|  | [optional] |

### Return type

[**EntityResourceOutcomeOfCatalogStatusV2**](EntityResourceOutcomeOfCatalogStatusV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## postApiExternalV2AccountSellerCatalogExportByAccountId

> EntityResourceOutcomeOfCatalogStatusV2 postApiExternalV2AccountSellerCatalogExportByAccountId(accountId, valueResourceInputOfSellerCatalogRequestV2)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to request the catalog for.
        ValueResourceInputOfSellerCatalogRequestV2 valueResourceInputOfSellerCatalogRequestV2 = new ValueResourceInputOfSellerCatalogRequestV2(); // ValueResourceInputOfSellerCatalogRequestV2 | 
        try {
            EntityResourceOutcomeOfCatalogStatusV2 result = apiInstance.postApiExternalV2AccountSellerCatalogExportByAccountId(accountId, valueResourceInputOfSellerCatalogRequestV2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiExternalV2AccountSellerCatalogExportByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to request the catalog for. | |
| **valueResourceInputOfSellerCatalogRequestV2** | [**ValueResourceInputOfSellerCatalogRequestV2**](ValueResourceInputOfSellerCatalogRequestV2.md)|  | [optional] |

### Return type

[**EntityResourceOutcomeOfCatalogStatusV2**](EntityResourceOutcomeOfCatalogStatusV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## postApiV1ExternalAccountCatalogsByAccountId

> JsonApiSingleResponseOfCatalogStatus postApiV1ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequest)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to request the catalog for.
        JsonApiRequestOfCatalogRequest jsonApiRequestOfCatalogRequest = new JsonApiRequestOfCatalogRequest(); // JsonApiRequestOfCatalogRequest | 
        try {
            JsonApiSingleResponseOfCatalogStatus result = apiInstance.postApiV1ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalAccountCatalogsByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to request the catalog for. | |
| **jsonApiRequestOfCatalogRequest** | [**JsonApiRequestOfCatalogRequest**](JsonApiRequestOfCatalogRequest.md)|  | [optional] |

### Return type

[**JsonApiSingleResponseOfCatalogStatus**](JsonApiSingleResponseOfCatalogStatus.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request successfully created |  -  |


## postApiV1ExternalAccountCatalogsSellersByAccountId

> JsonApiSingleResponseOfCatalogStatus postApiV1ExternalAccountCatalogsSellersByAccountId(accountId, jsonApiRequestOfSellerCatalogRequest)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to request the catalog for.
        JsonApiRequestOfSellerCatalogRequest jsonApiRequestOfSellerCatalogRequest = new JsonApiRequestOfSellerCatalogRequest(); // JsonApiRequestOfSellerCatalogRequest | 
        try {
            JsonApiSingleResponseOfCatalogStatus result = apiInstance.postApiV1ExternalAccountCatalogsSellersByAccountId(accountId, jsonApiRequestOfSellerCatalogRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalAccountCatalogsSellersByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to request the catalog for. | |
| **jsonApiRequestOfSellerCatalogRequest** | [**JsonApiRequestOfSellerCatalogRequest**](JsonApiRequestOfSellerCatalogRequest.md)|  | [optional] |

### Return type

[**JsonApiSingleResponseOfCatalogStatus**](JsonApiSingleResponseOfCatalogStatus.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request successfully created |  -  |
| **400** | Bad Request |  -  |


## postApiV2ExternalAccountCreativesSearchByAccountId

> Creative2ListResponse postApiV2ExternalAccountCreativesSearchByAccountId(accountId, creativeIds)



Get account creatives

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id to retrieve creatives for
        List<String> creativeIds = Arrays.asList(); // List<String> | Creatives to filter by
        try {
            Creative2ListResponse result = apiInstance.postApiV2ExternalAccountCreativesSearchByAccountId(accountId, creativeIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV2ExternalAccountCreativesSearchByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| External account id to retrieve creatives for | |
| **creativeIds** | [**List&lt;String&gt;**](String.md)| Creatives to filter by | [optional] |

### Return type

[**Creative2ListResponse**](Creative2ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## postApiV2ExternalCampaignAuctionLineItemsByCampaignId

> AuctionLineItemResponse postApiV2ExternalCampaignAuctionLineItemsByCampaignId(campaignId, auctionLineItemCreateModelRequest)



Creates new auction line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The given campaign id
        AuctionLineItemCreateModelRequest auctionLineItemCreateModelRequest = new AuctionLineItemCreateModelRequest(); // AuctionLineItemCreateModelRequest | The line item settings to create a line item with
        try {
            AuctionLineItemResponse result = apiInstance.postApiV2ExternalCampaignAuctionLineItemsByCampaignId(campaignId, auctionLineItemCreateModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV2ExternalCampaignAuctionLineItemsByCampaignId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| The given campaign id | |
| **auctionLineItemCreateModelRequest** | [**AuctionLineItemCreateModelRequest**](AuctionLineItemCreateModelRequest.md)| The line item settings to create a line item with | [optional] |

### Return type

[**AuctionLineItemResponse**](AuctionLineItemResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202110ExternalPreferredLineItemByLineItemId

> PreferredLineItemV2Response putApi202110ExternalPreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModelV2Request)



Updates the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        PreferredLineItemUpdateModelV2Request preferredLineItemUpdateModelV2Request = new PreferredLineItemUpdateModelV2Request(); // PreferredLineItemUpdateModelV2Request | The line item settings to create a line item with
        try {
            PreferredLineItemV2Response result = apiInstance.putApi202110ExternalPreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModelV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202110ExternalPreferredLineItemByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The given line item id | |
| **preferredLineItemUpdateModelV2Request** | [**PreferredLineItemUpdateModelV2Request**](PreferredLineItemUpdateModelV2Request.md)| The line item settings to create a line item with | |

### Return type

[**PreferredLineItemV2Response**](PreferredLineItemV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId

> AddToBasketTarget202110Response putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId(lineItemId, addToBasketTarget202110Request)



This endpoint sets the scope of the add to basket target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        AddToBasketTarget202110Request addToBasketTarget202110Request = new AddToBasketTarget202110Request(); // AddToBasketTarget202110Request | The add to basket target to set the scope for
        try {
            AddToBasketTarget202110Response result = apiInstance.putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId(lineItemId, addToBasketTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **addToBasketTarget202110Request** | [**AddToBasketTarget202110Request**](AddToBasketTarget202110Request.md)| The add to basket target to set the scope for | [optional] |

### Return type

[**AddToBasketTarget202110Response**](AddToBasketTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId

> AudienceTarget202110Response putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId(lineItemId, audienceTarget202110Request)



This endpoint sets the scope of the audience target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        AudienceTarget202110Request audienceTarget202110Request = new AudienceTarget202110Request(); // AudienceTarget202110Request | The audience target to set the scope for
        try {
            AudienceTarget202110Response result = apiInstance.putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId(lineItemId, audienceTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **audienceTarget202110Request** | [**AudienceTarget202110Request**](AudienceTarget202110Request.md)| The audience target to set the scope for | [optional] |

### Return type

[**AudienceTarget202110Response**](AudienceTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId

> StoreTarget202110Response putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId(lineItemId, storeTarget202110Request)



This endpoint sets the scope of the store target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        StoreTarget202110Request storeTarget202110Request = new StoreTarget202110Request(); // StoreTarget202110Request | The store target to set the scope for
        try {
            StoreTarget202110Response result = apiInstance.putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId(lineItemId, storeTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The line item to interact with | |
| **storeTarget202110Request** | [**StoreTarget202110Request**](StoreTarget202110Request.md)| The store target to set the scope for | [optional] |

### Return type

[**StoreTarget202110Response**](StoreTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202210ExternalAccountByAccountIdCreativescreativeId

> Creative202210Response putApi202210ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId, creativeUpdateModel202207)



Update a creative

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id containing the creative
        String creativeId = "creativeId_example"; // String | Creative to update
        CreativeUpdateModel202207 creativeUpdateModel202207 = new CreativeUpdateModel202207(); // CreativeUpdateModel202207 | The creative to create
        try {
            Creative202210Response result = apiInstance.putApi202210ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId, creativeUpdateModel202207);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202210ExternalAccountByAccountIdCreativescreativeId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| External account id containing the creative | |
| **creativeId** | **String**| Creative to update | |
| **creativeUpdateModel202207** | [**CreativeUpdateModel202207**](CreativeUpdateModel202207.md)| The creative to create | [optional] |

### Return type

[**Creative202210Response**](Creative202210Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creative updated |  -  |


## putApi202301ExternalCampaignByCampaignId

> JsonApiSingleResponseOfCampaignV202301 putApi202301ExternalCampaignByCampaignId(campaignId, putCampaignV202301)



Edit a campaign for the given campaign id with a given editable attributes. This will return updated creatable and editable attributes of the campaign as the result of the operation. Pacing can be adjusted and affected by the status of the campaign and the days left on the campaign if auto daily pacing is enabled.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | Campaign Id of the updating campaign
        PutCampaignV202301 putCampaignV202301 = new PutCampaignV202301(); // PutCampaignV202301 | Editable campaign attributes
        try {
            JsonApiSingleResponseOfCampaignV202301 result = apiInstance.putApi202301ExternalCampaignByCampaignId(campaignId, putCampaignV202301);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202301ExternalCampaignByCampaignId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| Campaign Id of the updating campaign | |
| **putCampaignV202301** | [**PutCampaignV202301**](PutCampaignV202301.md)| Editable campaign attributes | [optional] |

### Return type

[**JsonApiSingleResponseOfCampaignV202301**](JsonApiSingleResponseOfCampaignV202301.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putApiV2ExternalAuctionLineItemByLineItemId

> AuctionLineItemResponse putApiV2ExternalAuctionLineItemByLineItemId(lineItemId, auctionLineItemUpdateModelRequest)



Updates the auction line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        AuctionLineItemUpdateModelRequest auctionLineItemUpdateModelRequest = new AuctionLineItemUpdateModelRequest(); // AuctionLineItemUpdateModelRequest | The line item settings to create a line item with
        try {
            AuctionLineItemResponse result = apiInstance.putApiV2ExternalAuctionLineItemByLineItemId(lineItemId, auctionLineItemUpdateModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApiV2ExternalAuctionLineItemByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| The given line item id | |
| **auctionLineItemUpdateModelRequest** | [**AuctionLineItemUpdateModelRequest**](AuctionLineItemUpdateModelRequest.md)| The line item settings to create a line item with | [optional] |

### Return type

[**AuctionLineItemResponse**](AuctionLineItemResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## putApiV2ExternalLineItemBidMultipliersByLineItemId

> LineItemBidMultipliersV2Response putApiV2ExternalLineItemBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersV2Request)



Updates the bid multipliers for a given line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | External LineItemId for bid multiplier retrieval
        LineItemBidMultipliersV2Request lineItemBidMultipliersV2Request = new LineItemBidMultipliersV2Request(); // LineItemBidMultipliersV2Request | New Bid Multipliers to be set
        try {
            LineItemBidMultipliersV2Response result = apiInstance.putApiV2ExternalLineItemBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApiV2ExternalLineItemBidMultipliersByLineItemId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| External LineItemId for bid multiplier retrieval | |
| **lineItemBidMultipliersV2Request** | [**LineItemBidMultipliersV2Request**](LineItemBidMultipliersV2Request.md)| New Bid Multipliers to be set | [optional] |

### Return type

[**LineItemBidMultipliersV2Response**](LineItemBidMultipliersV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BidMultipliers Updated |  -  |


## searchBrandsByNameAsyncV1

> EntityResourceCollectionOutcomeBrandIdSearchResultPagingOffsetLimitMetadata searchBrandsByNameAsyncV1(limit, offset, valueResourceInputBrandIdSearchRequest)



Search for brands given a retailer ID and search term.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer limit = 25; // Integer | the number of brands to return
        Integer offset = 0; // Integer | offset of paginated results
        ValueResourceInputBrandIdSearchRequest valueResourceInputBrandIdSearchRequest = new ValueResourceInputBrandIdSearchRequest(); // ValueResourceInputBrandIdSearchRequest | BrandIdSearchRequest which contains the request parameters
        try {
            EntityResourceCollectionOutcomeBrandIdSearchResultPagingOffsetLimitMetadata result = apiInstance.searchBrandsByNameAsyncV1(limit, offset, valueResourceInputBrandIdSearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#searchBrandsByNameAsyncV1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| the number of brands to return | [optional] [default to 25] |
| **offset** | **Integer**| offset of paginated results | [optional] [default to 0] |
| **valueResourceInputBrandIdSearchRequest** | [**ValueResourceInputBrandIdSearchRequest**](ValueResourceInputBrandIdSearchRequest.md)| BrandIdSearchRequest which contains the request parameters | [optional] |

### Return type

[**EntityResourceCollectionOutcomeBrandIdSearchResultPagingOffsetLimitMetadata**](EntityResourceCollectionOutcomeBrandIdSearchResultPagingOffsetLimitMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## setKeywordBids

> ResourceOutcome setKeywordBids(id, setBidsModelRequest)



Set bid overrides for associated keywords to the given line item in bulk

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String id = "id_example"; // String | ID of the line item
        SetBidsModelRequest setBidsModelRequest = new SetBidsModelRequest(); // SetBidsModelRequest | 
        try {
            ResourceOutcome result = apiInstance.setKeywordBids(id, setBidsModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#setKeywordBids");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the line item | |
| **setBidsModelRequest** | [**SetBidsModelRequest**](SetBidsModelRequest.md)|  | [optional] |

### Return type

[**ResourceOutcome**](ResourceOutcome.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## unpausePromotedProducts

> unpausePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Un-pause a collection of promoted products associated with a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | ID of the line item
        PromotedProductResourceCollectionInput promotedProductResourceCollectionInput = new PromotedProductResourceCollectionInput(); // PromotedProductResourceCollectionInput | Request body whose {data} contains an array of promoted products.
        try {
            apiInstance.unpausePromotedProducts(lineItemId, promotedProductResourceCollectionInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#unpausePromotedProducts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| ID of the line item | |
| **promotedProductResourceCollectionInput** | [**PromotedProductResourceCollectionInput**](PromotedProductResourceCollectionInput.md)| Request body whose {data} contains an array of promoted products. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promoted products un-paused |  -  |
| **400** | Invalid request body |  -  |
| **403** | Invalid external line item ID |  -  |


## updateCampaignBudgetOverrides

> ValueResourceOutcomeOfCampaignBudgetOverrides updateCampaignBudgetOverrides(campaignId, valueResourceInputOfCampaignBudgetOverrides)



Update campaign budget overrides by given campaign id and new campaign budget overrides settings.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Long campaignId = 56L; // Long | Campaign id.
        ValueResourceInputOfCampaignBudgetOverrides valueResourceInputOfCampaignBudgetOverrides = new ValueResourceInputOfCampaignBudgetOverrides(); // ValueResourceInputOfCampaignBudgetOverrides | New campaign budget overrides settings value resource input.
        try {
            ValueResourceOutcomeOfCampaignBudgetOverrides result = apiInstance.updateCampaignBudgetOverrides(campaignId, valueResourceInputOfCampaignBudgetOverrides);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateCampaignBudgetOverrides");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Campaign id. | |
| **valueResourceInputOfCampaignBudgetOverrides** | [**ValueResourceInputOfCampaignBudgetOverrides**](ValueResourceInputOfCampaignBudgetOverrides.md)| New campaign budget overrides settings value resource input. | [optional] |

### Return type

[**ValueResourceOutcomeOfCampaignBudgetOverrides**](ValueResourceOutcomeOfCampaignBudgetOverrides.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## updateKeywordReviewsV1

> ValueResourceOutcomeRetailMediaKeywordsReviewResult updateKeywordReviewsV1(lineItemId, valueResourceInputRetailMediaKeywordsReview)



Update the status of keyword reviews under a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Long lineItemId = 56L; // Long | The line item to update keyword review statuses for
        ValueResourceInputRetailMediaKeywordsReview valueResourceInputRetailMediaKeywordsReview = new ValueResourceInputRetailMediaKeywordsReview(); // ValueResourceInputRetailMediaKeywordsReview | Request object containing a list of Phrase-ReviewState pairs to update
        try {
            ValueResourceOutcomeRetailMediaKeywordsReviewResult result = apiInstance.updateKeywordReviewsV1(lineItemId, valueResourceInputRetailMediaKeywordsReview);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateKeywordReviewsV1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **Long**| The line item to update keyword review statuses for | |
| **valueResourceInputRetailMediaKeywordsReview** | [**ValueResourceInputRetailMediaKeywordsReview**](ValueResourceInputRetailMediaKeywordsReview.md)| Request object containing a list of Phrase-ReviewState pairs to update | [optional] |

### Return type

[**ValueResourceOutcomeRetailMediaKeywordsReviewResult**](ValueResourceOutcomeRetailMediaKeywordsReviewResult.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateLineItemBudgetOverrides

> ValueResourceOutcomeOfLineItemBudgetOverrides updateLineItemBudgetOverrides(lineItemId, valueResourceInputOfLineItemBudgetOverrides)



Update line item budget overrides by given line item id and new line item budget overrides settings.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.CampaignApi;

public class Example {
    public static void main(String[] args) {

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2, two options:
        // 1. Use ApiClientBuilder to create the ApiClient with the credentials you want, refresh token mechanism IS handled for you 💚
        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        ApiClient defaultClient = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);
        
        // 2. Set your access token manually, refresh token mechanism IS NOT handled by the client
        // ApiClient defaultClient = Configuration.getDefaultApiClient();
        // OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // oauth.setAccessToken("YOUR ACCESS TOKEN");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | Line item id.
        ValueResourceInputOfLineItemBudgetOverrides valueResourceInputOfLineItemBudgetOverrides = new ValueResourceInputOfLineItemBudgetOverrides(); // ValueResourceInputOfLineItemBudgetOverrides | New line item budget overrides settings value resource input.
        try {
            ValueResourceOutcomeOfLineItemBudgetOverrides result = apiInstance.updateLineItemBudgetOverrides(lineItemId, valueResourceInputOfLineItemBudgetOverrides);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateLineItemBudgetOverrides");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lineItemId** | **String**| Line item id. | |
| **valueResourceInputOfLineItemBudgetOverrides** | [**ValueResourceInputOfLineItemBudgetOverrides**](ValueResourceInputOfLineItemBudgetOverrides.md)| New line item budget overrides settings value resource input. | [optional] |

### Return type

[**ValueResourceOutcomeOfLineItemBudgetOverrides**](ValueResourceOutcomeOfLineItemBudgetOverrides.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

