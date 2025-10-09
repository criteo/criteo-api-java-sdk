# CampaignApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRemoveKeywords**](CampaignApi.md#addRemoveKeywords) | **POST** /2025-01/retail-media/line-items/{id}/keywords/add-remove |  |
| [**appendAddToBasketTargetsByLineItemId**](CampaignApi.md#appendAddToBasketTargetsByLineItemId) | **POST** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket/append |  |
| [**appendAudienceTargetsByLineItemId**](CampaignApi.md#appendAudienceTargetsByLineItemId) | **POST** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences/append |  |
| [**appendCampaignsByBalanceId**](CampaignApi.md#appendCampaignsByBalanceId) | **POST** /2025-01/retail-media/balances/{balance-id}/campaigns/append |  |
| [**appendKeywordTargetsByLineItemId**](CampaignApi.md#appendKeywordTargetsByLineItemId) | **POST** /2025-01/retail-media/auction-line-items/{line-item-id}/targeting/keywords/append |  |
| [**appendPromotedProducts**](CampaignApi.md#appendPromotedProducts) | **POST** /2025-01/retail-media/line-items/{line-item-id}/products/append |  |
| [**appendStoreTargetsByLineItemId**](CampaignApi.md#appendStoreTargetsByLineItemId) | **POST** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores/append |  |
| [**createAsset**](CampaignApi.md#createAsset) | **POST** /2025-01/retail-media/assets |  |
| [**createCampaignsByAccountId**](CampaignApi.md#createCampaignsByAccountId) | **POST** /2025-01/retail-media/accounts/{account-id}/campaigns |  |
| [**createCreative**](CampaignApi.md#createCreative) | **POST** /2025-01/retail-media/accounts/{account-id}/creatives |  |
| [**createPreferredLineItemByCampaignId**](CampaignApi.md#createPreferredLineItemByCampaignId) | **POST** /2025-01/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**deleteAddToBasketTargetsByLineItemId**](CampaignApi.md#deleteAddToBasketTargetsByLineItemId) | **POST** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket/delete |  |
| [**deleteAudienceTargetsByLineItemId**](CampaignApi.md#deleteAudienceTargetsByLineItemId) | **POST** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences/delete |  |
| [**deleteCampaignsByBalanceId**](CampaignApi.md#deleteCampaignsByBalanceId) | **POST** /2025-01/retail-media/balances/{balance-id}/campaigns/delete |  |
| [**deleteKeywordTargetsByLineItemId**](CampaignApi.md#deleteKeywordTargetsByLineItemId) | **POST** /2025-01/retail-media/auction-line-items/{line-item-id}/targeting/keywords/delete |  |
| [**deletePromotedProducts**](CampaignApi.md#deletePromotedProducts) | **POST** /2025-01/retail-media/line-items/{line-item-id}/products/delete |  |
| [**deleteStoreTargetByLineItemId**](CampaignApi.md#deleteStoreTargetByLineItemId) | **POST** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores/delete |  |
| [**fetchKeywords**](CampaignApi.md#fetchKeywords) | **GET** /2025-01/retail-media/line-items/{id}/keywords |  |
| [**fetchPromotedProducts**](CampaignApi.md#fetchPromotedProducts) | **GET** /2025-01/retail-media/line-items/{line-item-id}/products |  |
| [**getAccountCreatives**](CampaignApi.md#getAccountCreatives) | **GET** /2025-01/retail-media/accounts/{account-id}/creatives |  |
| [**getAddToBasketTargetsByLineItemId**](CampaignApi.md#getAddToBasketTargetsByLineItemId) | **GET** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket |  |
| [**getApi202110ExternalRetailerPagesByRetailerId**](CampaignApi.md#getApi202110ExternalRetailerPagesByRetailerId) | **GET** /2025-01/retail-media/retailers/{retailerId}/pages |  |
| [**getApi202204ExternalCategorieByCategoryId**](CampaignApi.md#getApi202204ExternalCategorieByCategoryId) | **GET** /2025-01/retail-media/categories/{categoryId} |  |
| [**getApi202204ExternalCategories**](CampaignApi.md#getApi202204ExternalCategories) | **GET** /2025-01/retail-media/categories |  |
| [**getApiV1ExternalCatalogOutputByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogOutputByCatalogId) | **GET** /2025-01/retail-media/catalogs/{catalogId}/output |  |
| [**getApiV1ExternalCatalogStatusByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogStatusByCatalogId) | **GET** /2025-01/retail-media/catalogs/{catalogId}/status |  |
| [**getAuctionLineItemsByCampaignId**](CampaignApi.md#getAuctionLineItemsByCampaignId) | **GET** /2025-01/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**getAuctionLineItemsByLineItemId**](CampaignApi.md#getAuctionLineItemsByLineItemId) | **GET** /2025-01/retail-media/auction-line-items/{line-item-id} |  |
| [**getAudienceTargetsByLineItemId**](CampaignApi.md#getAudienceTargetsByLineItemId) | **GET** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences |  |
| [**getBidMultipliersByLineItemId**](CampaignApi.md#getBidMultipliersByLineItemId) | **GET** /2025-01/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**getBrandsByAccountId**](CampaignApi.md#getBrandsByAccountId) | **GET** /2025-01/retail-media/accounts/{accountId}/brands |  |
| [**getCampaignBudgetOverrides**](CampaignApi.md#getCampaignBudgetOverrides) | **GET** /2025-01/retail-media/campaigns/{campaignId}/campaign-budget-overrides |  |
| [**getCampaignByCampaignId**](CampaignApi.md#getCampaignByCampaignId) | **GET** /2025-01/retail-media/campaigns/{campaignId} |  |
| [**getCampaignsByAccountId**](CampaignApi.md#getCampaignsByAccountId) | **GET** /2025-01/retail-media/accounts/{account-id}/campaigns |  |
| [**getCreative**](CampaignApi.md#getCreative) | **GET** /2025-01/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**getCreativeTemplate**](CampaignApi.md#getCreativeTemplate) | **GET** /2025-01/retail-media/retailers/{retailer-id}/templates/{template-id} |  |
| [**getKeywordTargetsByLineItemId**](CampaignApi.md#getKeywordTargetsByLineItemId) | **GET** /2025-01/retail-media/auction-line-items/{line-item-id}/targeting/keywords |  |
| [**getLineItemBudgetOverrides**](CampaignApi.md#getLineItemBudgetOverrides) | **GET** /2025-01/retail-media/line-items/{lineItemId}/line-item-budget-overrides |  |
| [**getLineItemsByAccountId**](CampaignApi.md#getLineItemsByAccountId) | **GET** /2025-01/retail-media/accounts/{account-id}/line-items |  |
| [**getLineItemsByCampaignId**](CampaignApi.md#getLineItemsByCampaignId) | **GET** /2025-01/retail-media/line-items/{line-item-id} |  |
| [**getPreferredLineItemsByCampaignId**](CampaignApi.md#getPreferredLineItemsByCampaignId) | **GET** /2025-01/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**getPreferredLineItemsByLineItemId**](CampaignApi.md#getPreferredLineItemsByLineItemId) | **GET** /2025-01/retail-media/preferred-line-items/{line-item-id} |  |
| [**getRecommendedKeywords**](CampaignApi.md#getRecommendedKeywords) | **GET** /2025-01/retail-media/line-items/{externalLineItemId}/keywords/recommended |  |
| [**getRetailerCreativeTemplates**](CampaignApi.md#getRetailerCreativeTemplates) | **GET** /2025-01/retail-media/retailers/{retailer-id}/templates |  |
| [**getRetailersByAccountId**](CampaignApi.md#getRetailersByAccountId) | **GET** /2025-01/retail-media/accounts/{accountId}/retailers |  |
| [**getStoreTargetsByLineItemId**](CampaignApi.md#getStoreTargetsByLineItemId) | **GET** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores |  |
| [**modifyAuctionLineItemsByCampaignId**](CampaignApi.md#modifyAuctionLineItemsByCampaignId) | **POST** /2025-01/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**pausePromotedProducts**](CampaignApi.md#pausePromotedProducts) | **POST** /2025-01/retail-media/line-items/{line-item-id}/products/pause |  |
| [**postApiV1ExternalAccountCatalogsByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsByAccountId) | **POST** /2025-01/retail-media/accounts/{accountId}/catalogs |  |
| [**postApiV1ExternalAccountCatalogsSellersByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsSellersByAccountId) | **POST** /2025-01/retail-media/accounts/{accountId}/catalogs/sellers |  |
| [**putAddToBasketTargetByLineItemId**](CampaignApi.md#putAddToBasketTargetByLineItemId) | **PUT** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket |  |
| [**putAudienceTargetsByLineItemId**](CampaignApi.md#putAudienceTargetsByLineItemId) | **PUT** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences |  |
| [**putStoreTargetByLineItemId**](CampaignApi.md#putStoreTargetByLineItemId) | **PUT** /2025-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores |  |
| [**searchAccountCreatives**](CampaignApi.md#searchAccountCreatives) | **POST** /2025-01/retail-media/accounts/{account-id}/creatives/search |  |
| [**setKeywordBids**](CampaignApi.md#setKeywordBids) | **POST** /2025-01/retail-media/line-items/{id}/keywords/set-bid |  |
| [**unpausePromotedProducts**](CampaignApi.md#unpausePromotedProducts) | **POST** /2025-01/retail-media/line-items/{line-item-id}/products/unpause |  |
| [**updateAuctionLineItemByLineItemId**](CampaignApi.md#updateAuctionLineItemByLineItemId) | **PUT** /2025-01/retail-media/auction-line-items/{line-item-id} |  |
| [**updateBidMultipliersByLineItemId**](CampaignApi.md#updateBidMultipliersByLineItemId) | **PUT** /2025-01/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**updateCampaignBudgetOverrides**](CampaignApi.md#updateCampaignBudgetOverrides) | **PUT** /2025-01/retail-media/campaigns/{campaignId}/campaign-budget-overrides |  |
| [**updateCampaignByCampaignId**](CampaignApi.md#updateCampaignByCampaignId) | **PUT** /2025-01/retail-media/campaigns/{campaignId} |  |
| [**updateCreative**](CampaignApi.md#updateCreative) | **PUT** /2025-01/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**updateLineItemBudgetOverrides**](CampaignApi.md#updateLineItemBudgetOverrides) | **PUT** /2025-01/retail-media/line-items/{lineItemId}/line-item-budget-overrides |  |
| [**updatePreferredLineItemByLineItemId**](CampaignApi.md#updatePreferredLineItemByLineItemId) | **PUT** /2025-01/retail-media/preferred-line-items/{line-item-id} |  |



## addRemoveKeywords

> ResourceOutcome addRemoveKeywords(id, addRemoveKeywordsModelRequest)



Add or Remove keywords from the line item in bulk

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## appendAddToBasketTargetsByLineItemId

> AddToBasketTarget202110Response appendAddToBasketTargetsByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request)



This endpoint appends one or more add to basket ids to targeting on the specified line item.  The resulting state of the add to basket target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AddToBasketTarget202110Response result = apiInstance.appendAddToBasketTargetsByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#appendAddToBasketTargetsByLineItemId");
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


## appendAudienceTargetsByLineItemId

> AudienceTarget202110Response appendAudienceTargetsByLineItemId(lineItemId, audienceIdsUpdateModel202110Request)



This endpoint appends one or more audiences ids to targeting on the specified line item.  The resulting state of the audience target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AudienceTarget202110Response result = apiInstance.appendAudienceTargetsByLineItemId(lineItemId, audienceIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#appendAudienceTargetsByLineItemId");
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


## appendCampaignsByBalanceId

> BalanceCampaign202110PagedListResponse appendCampaignsByBalanceId(balanceId, balanceCampaign202110ListRequest)



appends one or more campaigns to the specified balance

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            BalanceCampaign202110PagedListResponse result = apiInstance.appendCampaignsByBalanceId(balanceId, balanceCampaign202110ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#appendCampaignsByBalanceId");
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


## appendKeywordTargetsByLineItemId

> KeywordTarget202110Response appendKeywordTargetsByLineItemId(lineItemId, keywordTarget202110Request)



This endpoint appends one or more keywords to targeting on the specified line item.  The resulting state of the keyword target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        KeywordTarget202110Request keywordTarget202110Request = new KeywordTarget202110Request(); // KeywordTarget202110Request | 
        try {
            KeywordTarget202110Response result = apiInstance.appendKeywordTargetsByLineItemId(lineItemId, keywordTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#appendKeywordTargetsByLineItemId");
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
| **keywordTarget202110Request** | [**KeywordTarget202110Request**](KeywordTarget202110Request.md)|  | [optional] |

### Return type

[**KeywordTarget202110Response**](KeywordTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## appendPromotedProducts

> ProductResourceOutcome appendPromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Append a collection of promoted products to a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## appendStoreTargetsByLineItemId

> StoreTarget202110Response appendStoreTargetsByLineItemId(lineItemId, storeIdsUpdateModel202110Request)



This endpoint appends one or more store ids to targeting on the specified line item.  The resulting state of the store target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            StoreTarget202110Response result = apiInstance.appendStoreTargetsByLineItemId(lineItemId, storeIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#appendStoreTargetsByLineItemId");
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


## createAsset

> AssetResponse createAsset(assetFile)



Creates an asset

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## createCampaignsByAccountId

> JsonApiSingleResponseOfCampaignV202301 createCampaignsByAccountId(accountId, postCampaignV202301)



Creates a new campaign with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        PostCampaignV202301 postCampaignV202301 = new PostCampaignV202301(); // PostCampaignV202301 | The campaign settings to create a campaign with
        try {
            JsonApiSingleResponseOfCampaignV202301 result = apiInstance.createCampaignsByAccountId(accountId, postCampaignV202301);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createCampaignsByAccountId");
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
| **postCampaignV202301** | [**PostCampaignV202301**](PostCampaignV202301.md)| The campaign settings to create a campaign with | [optional] |

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


## createCreative

> Creative202210Response createCreative(accountId, creativeCreateModel202207)



Create a creative for an account

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            Creative202210Response result = apiInstance.createCreative(accountId, creativeCreateModel202207);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createCreative");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creatives created |  -  |


## createPreferredLineItemByCampaignId

> PreferredLineItemV2Response createPreferredLineItemByCampaignId(campaignId, preferredLineItemCreateModelV2Request)



Creates a new preferred line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            PreferredLineItemV2Response result = apiInstance.createPreferredLineItemByCampaignId(campaignId, preferredLineItemCreateModelV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createPreferredLineItemByCampaignId");
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
| **preferredLineItemCreateModelV2Request** | [**PreferredLineItemCreateModelV2Request**](PreferredLineItemCreateModelV2Request.md)| The line item settings to create a line item with | [optional] |

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


## deleteAddToBasketTargetsByLineItemId

> AddToBasketTarget202110Response deleteAddToBasketTargetsByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request)



This endpoint removes one or more add to basket ids from targeting on the specified line item.  The resulting state of the add to basket target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AddToBasketTarget202110Response result = apiInstance.deleteAddToBasketTargetsByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteAddToBasketTargetsByLineItemId");
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


## deleteAudienceTargetsByLineItemId

> AudienceTarget202110Response deleteAudienceTargetsByLineItemId(lineItemId, audienceIdsUpdateModel202110Request)



This endpoint removes one or more audiences ids from targeting on the specified line item.  The resulting state of the audience target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AudienceTarget202110Response result = apiInstance.deleteAudienceTargetsByLineItemId(lineItemId, audienceIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteAudienceTargetsByLineItemId");
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


## deleteCampaignsByBalanceId

> BalanceCampaign202110PagedListResponse deleteCampaignsByBalanceId(balanceId, balanceCampaign202110ListRequest)



Removes one or more campaigns on the specified balance

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            BalanceCampaign202110PagedListResponse result = apiInstance.deleteCampaignsByBalanceId(balanceId, balanceCampaign202110ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteCampaignsByBalanceId");
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


## deleteKeywordTargetsByLineItemId

> KeywordTarget202110Response deleteKeywordTargetsByLineItemId(lineItemId, keywordTarget202110Request)



This endpoint removes one or more keywords from targeting on the specified line item.  The resulting state of the keyword target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        KeywordTarget202110Request keywordTarget202110Request = new KeywordTarget202110Request(); // KeywordTarget202110Request | 
        try {
            KeywordTarget202110Response result = apiInstance.deleteKeywordTargetsByLineItemId(lineItemId, keywordTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteKeywordTargetsByLineItemId");
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
| **keywordTarget202110Request** | [**KeywordTarget202110Request**](KeywordTarget202110Request.md)|  | [optional] |

### Return type

[**KeywordTarget202110Response**](KeywordTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deletePromotedProducts

> deletePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Remove a collection of promoted products from a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promoted products removed from the line item |  -  |


## deleteStoreTargetByLineItemId

> StoreTarget202110Response deleteStoreTargetByLineItemId(lineItemId, storeIdsUpdateModel202110Request)



This endpoint removes one or more store ids from targeting on the specified line item.  The resulting state of the store target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            StoreTarget202110Response result = apiInstance.deleteStoreTargetByLineItemId(lineItemId, storeIdsUpdateModel202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteStoreTargetByLineItemId");
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


## fetchKeywords

> KeywordsModelResponse fetchKeywords(id)



Fetch keywords associated with the specified line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## fetchPromotedProducts

> PromotedProductResourceCollectionOutcome fetchPromotedProducts(lineItemId, fields, limit, offset)



Retrieve a page of promoted products for a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getAccountCreatives

> Creative202110ListResponse getAccountCreatives(accountId)



Get account creatives

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            Creative202110ListResponse result = apiInstance.getAccountCreatives(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getAccountCreatives");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## getAddToBasketTargetsByLineItemId

> AddToBasketTarget202110Response getAddToBasketTargetsByLineItemId(lineItemId)



This endpoint gets the add to basket target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AddToBasketTarget202110Response result = apiInstance.getAddToBasketTargetsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getAddToBasketTargetsByLineItemId");
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


## getApi202110ExternalRetailerPagesByRetailerId

> ExternalRetailerPages202110 getApi202110ExternalRetailerPagesByRetailerId(retailerId)



Get the page types available for the given retailer

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getApi202204ExternalCategories

> Category202204ListResponse getApi202204ExternalCategories(pageIndex, pageSize, retailerId, textSubstring)



Endpoint to search categories by text and retailer.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getApiV1ExternalCatalogOutputByCatalogId

> File getApiV1ExternalCatalogOutputByCatalogId(catalogId)



Output the indicated catalog. Catalogs are only available for retrieval when their associated status request  is at a Success status.  Produces application/x-json-stream of v2021_07 CatalogProduct json objects.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getApiV1ExternalCatalogStatusByCatalogId

> JsonApiSingleResponseOfCatalogStatus getApiV1ExternalCatalogStatusByCatalogId(catalogId)



Check the status of a catalog request.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getAuctionLineItemsByCampaignId

> AuctionLineItemPagedListResponse getAuctionLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of auction line item objects for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            AuctionLineItemPagedListResponse result = apiInstance.getAuctionLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getAuctionLineItemsByCampaignId");
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
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

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


## getAuctionLineItemsByLineItemId

> AuctionLineItemResponse getAuctionLineItemsByLineItemId(lineItemId)



Gets the auction line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AuctionLineItemResponse result = apiInstance.getAuctionLineItemsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getAuctionLineItemsByLineItemId");
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


## getAudienceTargetsByLineItemId

> AudienceTarget202110Response getAudienceTargetsByLineItemId(lineItemId)



This endpoint gets the audience target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AudienceTarget202110Response result = apiInstance.getAudienceTargetsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getAudienceTargetsByLineItemId");
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


## getBidMultipliersByLineItemId

> JsonApiSingleResponseOfLineItemBidMultipliersV2 getBidMultipliersByLineItemId(lineItemId)



Fetch all bid multipliers for a given line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | LineItemId for bid multiplier retrieval
        try {
            JsonApiSingleResponseOfLineItemBidMultipliersV2 result = apiInstance.getBidMultipliersByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getBidMultipliersByLineItemId");
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
| **lineItemId** | **String**| LineItemId for bid multiplier retrieval | |

### Return type

[**JsonApiSingleResponseOfLineItemBidMultipliersV2**](JsonApiSingleResponseOfLineItemBidMultipliersV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BidMultipliers Found |  -  |


## getBrandsByAccountId

> JsonApiPageResponseOfBrand getBrandsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            JsonApiPageResponseOfBrand result = apiInstance.getBrandsByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getBrandsByAccountId");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCampaignBudgetOverrides

> ValueResourceOutcomeOfCampaignBudgetOverrides getCampaignBudgetOverrides(campaignId)



Get current campaign budget overrides by given campaign id.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getCampaignByCampaignId

> JsonApiSingleResponseOfCampaignV202301 getCampaignByCampaignId(campaignId)



Gets the campaign for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        try {
            JsonApiSingleResponseOfCampaignV202301 result = apiInstance.getCampaignByCampaignId(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCampaignByCampaignId");
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


## getCampaignsByAccountId

> JsonApiPageResponseOfCampaignV202301 getCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of campaign objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            JsonApiPageResponseOfCampaignV202301 result = apiInstance.getCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCampaignsByAccountId");
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


## getCreative

> Creative2Response getCreative(accountId, creativeId)



Get the specified creative

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            Creative2Response result = apiInstance.getCreative(accountId, creativeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCreative");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## getCreativeTemplate

> TemplateResponse getCreativeTemplate(retailerId, templateId)



Gets the template for the specified retailer id and template id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            TemplateResponse result = apiInstance.getCreativeTemplate(retailerId, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCreativeTemplate");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Template found for the retailer |  -  |


## getKeywordTargetsByLineItemId

> KeywordTarget202110Response getKeywordTargetsByLineItemId(lineItemId)



This endpoint gets the keyword target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            KeywordTarget202110Response result = apiInstance.getKeywordTargetsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getKeywordTargetsByLineItemId");
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

[**KeywordTarget202110Response**](KeywordTarget202110Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getLineItemBudgetOverrides

> ValueResourceOutcomeOfLineItemBudgetOverrides getLineItemBudgetOverrides(lineItemId)



Gets a collection of monthly and daily budget overrides for the provided line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getLineItemsByAccountId

> CommonLineItemPagedListResponse getLineItemsByAccountId(accountId, limitToCampaignId, limitToId, limitToType, pageIndex, pageSize)



Gets page of line item objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            CommonLineItemPagedListResponse result = apiInstance.getLineItemsByAccountId(accountId, limitToCampaignId, limitToId, limitToType, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getLineItemsByAccountId");
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
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

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


## getLineItemsByCampaignId

> CommonLineItemResponse getLineItemsByCampaignId(lineItemId)



Gets the line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            CommonLineItemResponse result = apiInstance.getLineItemsByCampaignId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getLineItemsByCampaignId");
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


## getPreferredLineItemsByCampaignId

> PreferredLineItemV2PagedListResponse getPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of preferred line item objects for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            PreferredLineItemV2PagedListResponse result = apiInstance.getPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getPreferredLineItemsByCampaignId");
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
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

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


## getPreferredLineItemsByLineItemId

> PreferredLineItemV2Response getPreferredLineItemsByLineItemId(lineItemId)



Gets the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            PreferredLineItemV2Response result = apiInstance.getPreferredLineItemsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getPreferredLineItemsByLineItemId");
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


## getRecommendedKeywords

> ValueResourceOutcomeOfRecommendedKeywordsResult getRecommendedKeywords(externalLineItemId)



Retrieves a collection of recommended keywords for a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## getRetailerCreativeTemplates

> TemplateListResponse getRetailerCreativeTemplates(retailerId)



Get retailer creative templates

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            TemplateListResponse result = apiInstance.getRetailerCreativeTemplates(retailerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getRetailerCreativeTemplates");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Templates found |  -  |


## getRetailersByAccountId

> JsonApiPageResponseOfRetailer getRetailersByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            JsonApiPageResponseOfRetailer result = apiInstance.getRetailersByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getRetailersByAccountId");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getStoreTargetsByLineItemId

> StoreTarget202110Response getStoreTargetsByLineItemId(lineItemId)



This endpoint gets the store target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            StoreTarget202110Response result = apiInstance.getStoreTargetsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getStoreTargetsByLineItemId");
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


## modifyAuctionLineItemsByCampaignId

> AuctionLineItemResponse modifyAuctionLineItemsByCampaignId(campaignId, auctionLineItemCreateModelRequest)



Creates new auction line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AuctionLineItemResponse result = apiInstance.modifyAuctionLineItemsByCampaignId(campaignId, auctionLineItemCreateModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#modifyAuctionLineItemsByCampaignId");
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


## pausePromotedProducts

> pausePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Pause a collection of promoted products associated with a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promoted products paused |  -  |


## postApiV1ExternalAccountCatalogsByAccountId

> JsonApiSingleResponseOfCatalogStatus postApiV1ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequest)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request successfully created |  -  |


## putAddToBasketTargetByLineItemId

> AddToBasketTarget202110Response putAddToBasketTargetByLineItemId(lineItemId, addToBasketTarget202110Request)



This endpoint sets the scope of the add to basket target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AddToBasketTarget202110Response result = apiInstance.putAddToBasketTargetByLineItemId(lineItemId, addToBasketTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putAddToBasketTargetByLineItemId");
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


## putAudienceTargetsByLineItemId

> AudienceTarget202110Response putAudienceTargetsByLineItemId(lineItemId, audienceTarget202110Request)



This endpoint sets the scope of the audience target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AudienceTarget202110Response result = apiInstance.putAudienceTargetsByLineItemId(lineItemId, audienceTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putAudienceTargetsByLineItemId");
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


## putStoreTargetByLineItemId

> StoreTarget202110Response putStoreTargetByLineItemId(lineItemId, storeTarget202110Request)



This endpoint sets the scope of the store target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            StoreTarget202110Response result = apiInstance.putStoreTargetByLineItemId(lineItemId, storeTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putStoreTargetByLineItemId");
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


## searchAccountCreatives

> Creative2ListResponse searchAccountCreatives(accountId, creativeIds)



Get account creatives

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            Creative2ListResponse result = apiInstance.searchAccountCreatives(accountId, creativeIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#searchAccountCreatives");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## setKeywordBids

> ResourceOutcome setKeywordBids(id, setBidsModelRequest)



Set bid overrides for associated keywords to the given line item in bulk

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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


## unpausePromotedProducts

> unpausePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Un-pause a collection of promoted products associated with a line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promoted products un-paused |  -  |


## updateAuctionLineItemByLineItemId

> AuctionLineItemResponse updateAuctionLineItemByLineItemId(lineItemId, auctionLineItemUpdateModelRequest)



Updates the auction line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            AuctionLineItemResponse result = apiInstance.updateAuctionLineItemByLineItemId(lineItemId, auctionLineItemUpdateModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateAuctionLineItemByLineItemId");
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


## updateBidMultipliersByLineItemId

> LineItemBidMultipliersV2Response updateBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersV2Request)



Updates the bid multipliers for a given line item

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | LineItemId for bid multiplier retrieval
        LineItemBidMultipliersV2Request lineItemBidMultipliersV2Request = new LineItemBidMultipliersV2Request(); // LineItemBidMultipliersV2Request | New Bid Multipliers to be set
        try {
            LineItemBidMultipliersV2Response result = apiInstance.updateBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateBidMultipliersByLineItemId");
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
| **lineItemId** | **String**| LineItemId for bid multiplier retrieval | |
| **lineItemBidMultipliersV2Request** | [**LineItemBidMultipliersV2Request**](LineItemBidMultipliersV2Request.md)| New Bid Multipliers to be set | [optional] |

### Return type

[**LineItemBidMultipliersV2Response**](LineItemBidMultipliersV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BidMultipliers Updated |  -  |


## updateCampaignBudgetOverrides

> ValueResourceOutcomeOfCampaignBudgetOverrides updateCampaignBudgetOverrides(campaignId, valueResourceInputOfCampaignBudgetOverrides)



Update campaign budget overrides by given campaign id and new campaign budget overrides settings.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## updateCampaignByCampaignId

> JsonApiSingleResponseOfCampaignV202301 updateCampaignByCampaignId(campaignId, putCampaignV202301)



Updates the campaign for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        PutCampaignV202301 putCampaignV202301 = new PutCampaignV202301(); // PutCampaignV202301 | The campaign settings to update that campaign with
        try {
            JsonApiSingleResponseOfCampaignV202301 result = apiInstance.updateCampaignByCampaignId(campaignId, putCampaignV202301);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateCampaignByCampaignId");
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
| **putCampaignV202301** | [**PutCampaignV202301**](PutCampaignV202301.md)| The campaign settings to update that campaign with | [optional] |

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


## updateCreative

> Creative202210Response updateCreative(accountId, creativeId, creativeUpdateModel202207)



Update a creative

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            Creative202210Response result = apiInstance.updateCreative(accountId, creativeId, creativeUpdateModel202207);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateCreative");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creative updated |  -  |


## updateLineItemBudgetOverrides

> ValueResourceOutcomeOfLineItemBudgetOverrides updateLineItemBudgetOverrides(lineItemId, valueResourceInputOfLineItemBudgetOverrides)



Update line item budget overrides by given external line item id and new line item budget overrides settings.

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Line item external id.
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
| **lineItemId** | **String**| Line item external id. | |
| **valueResourceInputOfLineItemBudgetOverrides** | [**ValueResourceInputOfLineItemBudgetOverrides**](ValueResourceInputOfLineItemBudgetOverrides.md)| New line item budget overrides settings value resource input. | [optional] |

### Return type

[**ValueResourceOutcomeOfLineItemBudgetOverrides**](ValueResourceOutcomeOfLineItemBudgetOverrides.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## updatePreferredLineItemByLineItemId

> PreferredLineItemV2Response updatePreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModelV2Request)



Updates the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2025_01;

import com.criteo.api.retailmedia.v2025_01.ApiClient;
import com.criteo.api.retailmedia.v2025_01.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_01.ApiException;
import com.criteo.api.retailmedia.v2025_01.Configuration;
import com.criteo.api.retailmedia.v2025_01.auth.*;
import com.criteo.api.retailmedia.v2025_01.model.*;
import com.criteo.api.retailmedia.v2025_01.api.CampaignApi;

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
            PreferredLineItemV2Response result = apiInstance.updatePreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModelV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updatePreferredLineItemByLineItemId");
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
| **preferredLineItemUpdateModelV2Request** | [**PreferredLineItemUpdateModelV2Request**](PreferredLineItemUpdateModelV2Request.md)| The line item settings to create a line item with | [optional] |

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

