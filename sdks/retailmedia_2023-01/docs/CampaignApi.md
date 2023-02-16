# CampaignApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAsset**](CampaignApi.md#createAsset) | **POST** /2023-01/retail-media/assets |  |
| [**getApi202110ExternalAccountBalancesByAccountId**](CampaignApi.md#getApi202110ExternalAccountBalancesByAccountId) | **GET** /2023-01/retail-media/accounts/{account-id}/balances |  |
| [**getApi202110ExternalAccountCreativesByAccountId**](CampaignApi.md#getApi202110ExternalAccountCreativesByAccountId) | **GET** /2023-01/retail-media/accounts/{account-id}/creatives |  |
| [**getApi202110ExternalAuctionLineItemTargetingKeywordsByLineItemId**](CampaignApi.md#getApi202110ExternalAuctionLineItemTargetingKeywordsByLineItemId) | **GET** /2023-01/retail-media/auction-line-items/{line-item-id}/targeting/keywords |  |
| [**getApi202110ExternalBalanceCampaignsByBalanceId**](CampaignApi.md#getApi202110ExternalBalanceCampaignsByBalanceId) | **GET** /2023-01/retail-media/balances/{balance-id}/campaigns |  |
| [**getApi202110ExternalCampaignPreferredLineItemsByCampaignId**](CampaignApi.md#getApi202110ExternalCampaignPreferredLineItemsByCampaignId) | **GET** /2023-01/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**getApi202110ExternalLineItemProductsByLineItemId**](CampaignApi.md#getApi202110ExternalLineItemProductsByLineItemId) | **GET** /2023-01/retail-media/line-items/{line-item-id}/products |  |
| [**getApi202110ExternalPreferredLineItemByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemByLineItemId) | **GET** /2023-01/retail-media/preferred-line-items/{line-item-id} |  |
| [**getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId) | **GET** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket |  |
| [**getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId) | **GET** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences |  |
| [**getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId**](CampaignApi.md#getApi202110ExternalPreferredLineItemTargetingStoresByLineItemId) | **GET** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores |  |
| [**getApi202110ExternalRetailerPagesByRetailerId**](CampaignApi.md#getApi202110ExternalRetailerPagesByRetailerId) | **GET** /2023-01/retail-media/retailers/{retailerId}/pages |  |
| [**getApi202204ExternalCategorieByCategoryId**](CampaignApi.md#getApi202204ExternalCategorieByCategoryId) | **GET** /2023-01/retail-media/categories/{categoryId} |  |
| [**getApi202204ExternalCategories**](CampaignApi.md#getApi202204ExternalCategories) | **GET** /2023-01/retail-media/categories |  |
| [**getApi202207ExternalAccountByAccountIdCreativescreativeId**](CampaignApi.md#getApi202207ExternalAccountByAccountIdCreativescreativeId) | **GET** /2023-01/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**getApi202207ExternalRetailerByRetailerIdTemplatestemplateId**](CampaignApi.md#getApi202207ExternalRetailerByRetailerIdTemplatestemplateId) | **GET** /2023-01/retail-media/retailers/{retailer-id}/templates/{template-id} |  |
| [**getApi202207ExternalRetailerTemplatesByRetailerId**](CampaignApi.md#getApi202207ExternalRetailerTemplatesByRetailerId) | **GET** /2023-01/retail-media/retailers/{retailer-id}/templates |  |
| [**getApi202301ExternalAccountCampaignsByAccountId**](CampaignApi.md#getApi202301ExternalAccountCampaignsByAccountId) | **GET** /2023-01/retail-media/accounts/{accountId}/campaigns |  |
| [**getApi202301ExternalCampaignByCampaignId**](CampaignApi.md#getApi202301ExternalCampaignByCampaignId) | **GET** /2023-01/retail-media/campaigns/{campaignId} |  |
| [**getApi202301ExternalLineItemBidMultipliersByLineItemId**](CampaignApi.md#getApi202301ExternalLineItemBidMultipliersByLineItemId) | **GET** /2023-01/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**getApiV1ExternalAccountBrandsByAccountId**](CampaignApi.md#getApiV1ExternalAccountBrandsByAccountId) | **GET** /2023-01/retail-media/accounts/{accountId}/brands |  |
| [**getApiV1ExternalAccountRetailersByAccountId**](CampaignApi.md#getApiV1ExternalAccountRetailersByAccountId) | **GET** /2023-01/retail-media/accounts/{accountId}/retailers |  |
| [**getApiV1ExternalAccounts**](CampaignApi.md#getApiV1ExternalAccounts) | **GET** /2023-01/retail-media/accounts |  |
| [**getApiV1ExternalCatalogOutputByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogOutputByCatalogId) | **GET** /2023-01/retail-media/catalogs/{catalogId}/output |  |
| [**getApiV1ExternalCatalogStatusByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogStatusByCatalogId) | **GET** /2023-01/retail-media/catalogs/{catalogId}/status |  |
| [**getApiV2ExternalAccountLineItemsByAccountId**](CampaignApi.md#getApiV2ExternalAccountLineItemsByAccountId) | **GET** /2023-01/retail-media/accounts/{account-id}/line-items |  |
| [**getApiV2ExternalAuctionLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalAuctionLineItemByLineItemId) | **GET** /2023-01/retail-media/auction-line-items/{line-item-id} |  |
| [**getApiV2ExternalCampaignAuctionLineItemsByCampaignId**](CampaignApi.md#getApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **GET** /2023-01/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**getApiV2ExternalLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalLineItemByLineItemId) | **GET** /2023-01/retail-media/line-items/{line-item-id} |  |
| [**postApi202110ExternalAuctionLineItemTargetingKeywordsAppendByLineItemId**](CampaignApi.md#postApi202110ExternalAuctionLineItemTargetingKeywordsAppendByLineItemId) | **POST** /2023-01/retail-media/auction-line-items/{line-item-id}/targeting/keywords/append |  |
| [**postApi202110ExternalAuctionLineItemTargetingKeywordsDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalAuctionLineItemTargetingKeywordsDeleteByLineItemId) | **POST** /2023-01/retail-media/auction-line-items/{line-item-id}/targeting/keywords/delete |  |
| [**postApi202110ExternalBalanceCampaignsAppendByBalanceId**](CampaignApi.md#postApi202110ExternalBalanceCampaignsAppendByBalanceId) | **POST** /2023-01/retail-media/balances/{balance-id}/campaigns/append |  |
| [**postApi202110ExternalBalanceCampaignsDeleteByBalanceId**](CampaignApi.md#postApi202110ExternalBalanceCampaignsDeleteByBalanceId) | **POST** /2023-01/retail-media/balances/{balance-id}/campaigns/delete |  |
| [**postApi202110ExternalCampaignPreferredLineItemsByCampaignId**](CampaignApi.md#postApi202110ExternalCampaignPreferredLineItemsByCampaignId) | **POST** /2023-01/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**postApi202110ExternalLineItemProductsAppendByLineItemId**](CampaignApi.md#postApi202110ExternalLineItemProductsAppendByLineItemId) | **POST** /2023-01/retail-media/line-items/{line-item-id}/products/append |  |
| [**postApi202110ExternalLineItemProductsDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalLineItemProductsDeleteByLineItemId) | **POST** /2023-01/retail-media/line-items/{line-item-id}/products/delete |  |
| [**postApi202110ExternalLineItemProductsPauseByLineItemId**](CampaignApi.md#postApi202110ExternalLineItemProductsPauseByLineItemId) | **POST** /2023-01/retail-media/line-items/{line-item-id}/products/pause |  |
| [**postApi202110ExternalLineItemProductsUnpauseByLineItemId**](CampaignApi.md#postApi202110ExternalLineItemProductsUnpauseByLineItemId) | **POST** /2023-01/retail-media/line-items/{line-item-id}/products/unpause |  |
| [**postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId) | **POST** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket/append |  |
| [**postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAddToBasketDeleteByLineItemId) | **POST** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket/delete |  |
| [**postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAudiencesAppendByLineItemId) | **POST** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences/append |  |
| [**postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingAudiencesDeleteByLineItemId) | **POST** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences/delete |  |
| [**postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingStoresAppendByLineItemId) | **POST** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores/append |  |
| [**postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId**](CampaignApi.md#postApi202110ExternalPreferredLineItemTargetingStoresDeleteByLineItemId) | **POST** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores/delete |  |
| [**postApi202207ExternalAccountCreativesByAccountId**](CampaignApi.md#postApi202207ExternalAccountCreativesByAccountId) | **POST** /2023-01/retail-media/accounts/{account-id}/creatives |  |
| [**postApi202301ExternalAccountCampaignsByAccountId**](CampaignApi.md#postApi202301ExternalAccountCampaignsByAccountId) | **POST** /2023-01/retail-media/accounts/{accountId}/campaigns |  |
| [**postApiV1ExternalAccountCatalogsByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsByAccountId) | **POST** /2023-01/retail-media/accounts/{accountId}/catalogs |  |
| [**postApiV2ExternalCampaignAuctionLineItemsByCampaignId**](CampaignApi.md#postApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **POST** /2023-01/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**putApi202110ExternalPreferredLineItemByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemByLineItemId) | **PUT** /2023-01/retail-media/preferred-line-items/{line-item-id} |  |
| [**putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId) | **PUT** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/add-to-basket |  |
| [**putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemTargetingAudiencesByLineItemId) | **PUT** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/audiences |  |
| [**putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemTargetingStoresByLineItemId) | **PUT** /2023-01/retail-media/preferred-line-items/{line-item-id}/targeting/stores |  |
| [**putApi202207ExternalAccountByAccountIdCreativescreativeId**](CampaignApi.md#putApi202207ExternalAccountByAccountIdCreativescreativeId) | **PUT** /2023-01/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**putApi202301ExternalCampaignByCampaignId**](CampaignApi.md#putApi202301ExternalCampaignByCampaignId) | **PUT** /2023-01/retail-media/campaigns/{campaignId} |  |
| [**putApi202301ExternalLineItemBidMultipliersByLineItemId**](CampaignApi.md#putApi202301ExternalLineItemBidMultipliersByLineItemId) | **PUT** /2023-01/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**putApiV2ExternalAuctionLineItemByLineItemId**](CampaignApi.md#putApiV2ExternalAuctionLineItemByLineItemId) | **PUT** /2023-01/retail-media/auction-line-items/{line-item-id} |  |



## createAsset

> AssetResponse createAsset(assetFile)



Creates an asset

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        File assetFile = new File("null"); // File | The asset binary content
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
| **assetFile** | [**File**](File.md)| The asset binary content | [default to null] |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## getApi202110ExternalAccountBalancesByAccountId

> Balance202110PagedListResponse getApi202110ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of balance objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to get balances for
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            Balance202110PagedListResponse result = apiInstance.getApi202110ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalAccountBalancesByAccountId");
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
| **accountId** | **String**| The account to get balances for | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**Balance202110PagedListResponse**](Balance202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202110ExternalAccountCreativesByAccountId

> Creative202110ListResponse getApi202110ExternalAccountCreativesByAccountId(accountId)



Get account creatives

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## getApi202110ExternalAuctionLineItemTargetingKeywordsByLineItemId

> KeywordTarget202110Response getApi202110ExternalAuctionLineItemTargetingKeywordsByLineItemId(lineItemId)



This endpoint gets the keyword target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        try {
            KeywordTarget202110Response result = apiInstance.getApi202110ExternalAuctionLineItemTargetingKeywordsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalAuctionLineItemTargetingKeywordsByLineItemId");
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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApi202110ExternalBalanceCampaignsByBalanceId

> BalanceCampaign202110PagedListResponse getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize)



Gets page of campaigns for the given balanceId

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String balanceId = "balanceId_example"; // String | The balance to get campaigns from
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            BalanceCampaign202110PagedListResponse result = apiInstance.getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalBalanceCampaignsByBalanceId");
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
| **balanceId** | **String**| The balance to get campaigns from | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**BalanceCampaign202110PagedListResponse**](BalanceCampaign202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202110ExternalCampaignPreferredLineItemsByCampaignId

> PreferredLineItem202110PagedListResponse getApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of preferred line item objects for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The given campaign id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            PreferredLineItem202110PagedListResponse result = apiInstance.getApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalCampaignPreferredLineItemsByCampaignId");
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

[**PreferredLineItem202110PagedListResponse**](PreferredLineItem202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApi202110ExternalLineItemProductsByLineItemId

> PromotedProduct202110PagedListResponse getApi202110ExternalLineItemProductsByLineItemId(lineItemId, limitToId, pageIndex, pageSize)



This endpoint gets the promoted products on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            PromotedProduct202110PagedListResponse result = apiInstance.getApi202110ExternalLineItemProductsByLineItemId(lineItemId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalLineItemProductsByLineItemId");
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
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**PromotedProduct202110PagedListResponse**](PromotedProduct202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202110ExternalPreferredLineItemByLineItemId

> PreferredLineItem202110Response getApi202110ExternalPreferredLineItemByLineItemId(lineItemId)



Gets the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        try {
            PreferredLineItem202110Response result = apiInstance.getApi202110ExternalPreferredLineItemByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202110ExternalPreferredLineItemByLineItemId");
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

[**PreferredLineItem202110Response**](PreferredLineItem202110Response.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId

> AddToBasketTarget202110Response getApi202110ExternalPreferredLineItemTargetingAddToBasketByLineItemId(lineItemId)



This endpoint gets the add to basket target on the specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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

> Category202204ListResponse getApi202204ExternalCategories(retailerId, textSubstring, pageIndex, pageSize)



Endpoint to search categories by text and retailer.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        Integer retailerId = 56; // Integer | The retailer id for which Categories fetched
        String textSubstring = "textSubstring_example"; // String | Query string to search across Categories
        Integer pageIndex = 0; // Integer | The start position in the overall list of matches. Must be zero or greater.
        Integer pageSize = 100; // Integer | The maximum number of results to return with each call. Must be greater than zero.
        try {
            Category202204ListResponse result = apiInstance.getApi202204ExternalCategories(retailerId, textSubstring, pageIndex, pageSize);
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
| **retailerId** | **Integer**| The retailer id for which Categories fetched | [optional] |
| **textSubstring** | **String**| Query string to search across Categories | [optional] |
| **pageIndex** | **Integer**| The start position in the overall list of matches. Must be zero or greater. | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of results to return with each call. Must be greater than zero. | [optional] [default to 100] |

### Return type

[**Category202204ListResponse**](Category202204ListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Categories found. |  -  |


## getApi202207ExternalAccountByAccountIdCreativescreativeId

> Creative202207Response getApi202207ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId)



Get the specified creative

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id to retrieve creatives for
        String creativeId = "creativeId_example"; // String | Creative to get
        try {
            Creative202207Response result = apiInstance.getApi202207ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202207ExternalAccountByAccountIdCreativescreativeId");
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

[**Creative202207Response**](Creative202207Response.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## getApi202207ExternalRetailerByRetailerIdTemplatestemplateId

> TemplateResponse getApi202207ExternalRetailerByRetailerIdTemplatestemplateId(retailerId, templateId)



Gets the template for the specified retailer id and template id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Template found for the retailer |  -  |


## getApi202207ExternalRetailerTemplatesByRetailerId

> TemplateListResponse getApi202207ExternalRetailerTemplatesByRetailerId(retailerId)



Get retailer creative templates

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Templates found |  -  |


## getApi202301ExternalAccountCampaignsByAccountId

> JsonApiPageResponseOfCampaignV202301 getApi202301ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize)



Get all the editable and creatable campaign attributes including all types of budgets for each campaigns in relation to the account id, limited by the campaign ids.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202301ExternalLineItemBidMultipliersByLineItemId

> JsonApiSingleResponseOfLineItemBidMultipliers getApi202301ExternalLineItemBidMultipliersByLineItemId(lineItemId)



Get bid multipliers by line item

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        try {
            JsonApiSingleResponseOfLineItemBidMultipliers result = apiInstance.getApi202301ExternalLineItemBidMultipliersByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202301ExternalLineItemBidMultipliersByLineItemId");
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
| **lineItemId** | **String**| Long external id of the associated line item | |

### Return type

[**JsonApiSingleResponseOfLineItemBidMultipliers**](JsonApiSingleResponseOfLineItemBidMultipliers.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccountBrandsByAccountId

> JsonApiPageResponseOfBrand getApiV1ExternalAccountBrandsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The given account id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
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
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**JsonApiPageResponseOfBrand**](JsonApiPageResponseOfBrand.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccountRetailersByAccountId

> JsonApiPageResponseOfRetailer getApiV1ExternalAccountRetailersByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The given account id
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
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
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**JsonApiPageResponseOfRetailer**](JsonApiPageResponseOfRetailer.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccounts

> JsonApiPageResponseOfAccount getApiV1ExternalAccounts(limitToId, pageIndex, pageSize)



Gets page of account objects that the current user can access

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            JsonApiPageResponseOfAccount result = apiInstance.getApiV1ExternalAccounts(limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccounts");
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
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**JsonApiPageResponseOfAccount**](JsonApiPageResponseOfAccount.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalCatalogOutputByCatalogId

> getApiV1ExternalCatalogOutputByCatalogId(catalogId)



Output the indicated catalog. Catalogs are only available for retrieval when their associated status request  is at a Success status.  Produces application/x-json-stream of v2021_07 CatalogProduct json objects.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String catalogId = "catalogId_example"; // String | A catalog ID returned from an account catalog request.
        try {
            apiInstance.getApiV1ExternalCatalogOutputByCatalogId(catalogId);
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

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/x-json-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog download initiated. |  -  |
| **400** | The indicated catalog is not available for retrieval, wait for a success status. |  -  |


## getApiV1ExternalCatalogStatusByCatalogId

> JsonApiSingleResponseOfCatalogStatus getApiV1ExternalCatalogStatusByCatalogId(catalogId)



Check the status of a catalog request.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request found. |  -  |


## getApiV2ExternalAccountLineItemsByAccountId

> CommonLineItemPagedListResponse getApiV2ExternalAccountLineItemsByAccountId(accountId, limitToCampaignId, limitToType, limitToId, pageIndex, pageSize)



Gets page of line item objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | The given account id
        List<String> limitToCampaignId = Arrays.asList(); // List<String> | The campaign ids that you would like to limit your result set to
        String limitToType = "limitToType_example"; // String | The campaign types that you would like to limit your result set to
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            CommonLineItemPagedListResponse result = apiInstance.getApiV2ExternalAccountLineItemsByAccountId(accountId, limitToCampaignId, limitToType, limitToId, pageIndex, pageSize);
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
| **limitToType** | **String**| The campaign types that you would like to limit your result set to | [optional] [enum: Unknown, Auction, Preferred] |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**CommonLineItemPagedListResponse**](CommonLineItemPagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## getApiV2ExternalLineItemByLineItemId

> CommonLineItemResponse getApiV2ExternalLineItemByLineItemId(lineItemId)



Gets the line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalAuctionLineItemTargetingKeywordsAppendByLineItemId

> KeywordTarget202110Response postApi202110ExternalAuctionLineItemTargetingKeywordsAppendByLineItemId(lineItemId, keywordTarget202110Request)



This endpoint appends one or more keywords to targeting on the specified line item.  The resulting state of the keyword target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        KeywordTarget202110Request keywordTarget202110Request = new KeywordTarget202110Request(); // KeywordTarget202110Request | 
        try {
            KeywordTarget202110Response result = apiInstance.postApi202110ExternalAuctionLineItemTargetingKeywordsAppendByLineItemId(lineItemId, keywordTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalAuctionLineItemTargetingKeywordsAppendByLineItemId");
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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalAuctionLineItemTargetingKeywordsDeleteByLineItemId

> KeywordTarget202110Response postApi202110ExternalAuctionLineItemTargetingKeywordsDeleteByLineItemId(lineItemId, keywordTarget202110Request)



This endpoint removes one or more keywords from targeting on the specified line item.  The resulting state of the keyword target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        KeywordTarget202110Request keywordTarget202110Request = new KeywordTarget202110Request(); // KeywordTarget202110Request | 
        try {
            KeywordTarget202110Response result = apiInstance.postApi202110ExternalAuctionLineItemTargetingKeywordsDeleteByLineItemId(lineItemId, keywordTarget202110Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalAuctionLineItemTargetingKeywordsDeleteByLineItemId");
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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalBalanceCampaignsAppendByBalanceId

> BalanceCampaign202110PagedListResponse postApi202110ExternalBalanceCampaignsAppendByBalanceId(balanceId, balanceCampaign202110ListRequest)



appends one or more campaigns to the specified balance

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalCampaignPreferredLineItemsByCampaignId

> PreferredLineItem202110Response postApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, preferredLineItemCreateModel202110Request)



Creates a new preferred line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | The given campaign id
        PreferredLineItemCreateModel202110Request preferredLineItemCreateModel202110Request = new PreferredLineItemCreateModel202110Request(); // PreferredLineItemCreateModel202110Request | The line item settings to create a line item with
        try {
            PreferredLineItem202110Response result = apiInstance.postApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, preferredLineItemCreateModel202110Request);
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
| **preferredLineItemCreateModel202110Request** | [**PreferredLineItemCreateModel202110Request**](PreferredLineItemCreateModel202110Request.md)| The line item settings to create a line item with | [optional] |

### Return type

[**PreferredLineItem202110Response**](PreferredLineItem202110Response.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202110ExternalLineItemProductsAppendByLineItemId

> PromotedProduct202110PagedListResponse postApi202110ExternalLineItemProductsAppendByLineItemId(lineItemId, promotedProduct202110ListRequest)



This endpoint appends one or more products to promote on the specified line item.  The resulting state of the line item is returned.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        PromotedProduct202110ListRequest promotedProduct202110ListRequest = new PromotedProduct202110ListRequest(); // PromotedProduct202110ListRequest | the products to append to this line item
        try {
            PromotedProduct202110PagedListResponse result = apiInstance.postApi202110ExternalLineItemProductsAppendByLineItemId(lineItemId, promotedProduct202110ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalLineItemProductsAppendByLineItemId");
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
| **promotedProduct202110ListRequest** | [**PromotedProduct202110ListRequest**](PromotedProduct202110ListRequest.md)| the products to append to this line item | [optional] |

### Return type

[**PromotedProduct202110PagedListResponse**](PromotedProduct202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalLineItemProductsDeleteByLineItemId

> PromotedProduct202110PagedListResponse postApi202110ExternalLineItemProductsDeleteByLineItemId(lineItemId, promotedProduct202110ListRequest)



This endpoint removes one or more products from promotion on the specified line item.  The resulting state of the line item is returned.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with
        PromotedProduct202110ListRequest promotedProduct202110ListRequest = new PromotedProduct202110ListRequest(); // PromotedProduct202110ListRequest | 
        try {
            PromotedProduct202110PagedListResponse result = apiInstance.postApi202110ExternalLineItemProductsDeleteByLineItemId(lineItemId, promotedProduct202110ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalLineItemProductsDeleteByLineItemId");
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
| **promotedProduct202110ListRequest** | [**PromotedProduct202110ListRequest**](PromotedProduct202110ListRequest.md)|  | [optional] |

### Return type

[**PromotedProduct202110PagedListResponse**](PromotedProduct202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalLineItemProductsPauseByLineItemId

> postApi202110ExternalLineItemProductsPauseByLineItemId(lineItemId, promotedProduct202110ListRequest)



This endpoint pauses one or more promoted products on a specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with.
        PromotedProduct202110ListRequest promotedProduct202110ListRequest = new PromotedProduct202110ListRequest(); // PromotedProduct202110ListRequest | The products from which their IDs will be used to pause.
        try {
            apiInstance.postApi202110ExternalLineItemProductsPauseByLineItemId(lineItemId, promotedProduct202110ListRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalLineItemProductsPauseByLineItemId");
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
| **lineItemId** | **String**| The line item to interact with. | |
| **promotedProduct202110ListRequest** | [**PromotedProduct202110ListRequest**](PromotedProduct202110ListRequest.md)| The products from which their IDs will be used to pause. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalLineItemProductsUnpauseByLineItemId

> postApi202110ExternalLineItemProductsUnpauseByLineItemId(lineItemId, promotedProduct202110ListRequest)



This endpoint unpauses one or more promoted products on a specified line item.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The line item to interact with.
        PromotedProduct202110ListRequest promotedProduct202110ListRequest = new PromotedProduct202110ListRequest(); // PromotedProduct202110ListRequest | The products from which their IDs will be used to unpause.
        try {
            apiInstance.postApi202110ExternalLineItemProductsUnpauseByLineItemId(lineItemId, promotedProduct202110ListRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202110ExternalLineItemProductsUnpauseByLineItemId");
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
| **lineItemId** | **String**| The line item to interact with. | |
| **promotedProduct202110ListRequest** | [**PromotedProduct202110ListRequest**](PromotedProduct202110ListRequest.md)| The products from which their IDs will be used to unpause. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId

> AddToBasketTarget202110Response postApi202110ExternalPreferredLineItemTargetingAddToBasketAppendByLineItemId(lineItemId, addToBasketIdsUpdateModel202110Request)



This endpoint appends one or more add to basket ids to targeting on the specified line item.  The resulting state of the add to basket target is returned.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## postApi202207ExternalAccountCreativesByAccountId

> Creative202207Response postApi202207ExternalAccountCreativesByAccountId(accountId, creativeCreateModel202207)



Create a creative for an account

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id to create a creative for
        CreativeCreateModel202207 creativeCreateModel202207 = new CreativeCreateModel202207(); // CreativeCreateModel202207 | The creative to create
        try {
            Creative202207Response result = apiInstance.postApi202207ExternalAccountCreativesByAccountId(accountId, creativeCreateModel202207);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202207ExternalAccountCreativesByAccountId");
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

[**Creative202207Response**](Creative202207Response.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creatives created |  -  |


## postApi202301ExternalAccountCampaignsByAccountId

> JsonApiSingleResponseOfCampaignV202301 postApi202301ExternalAccountCampaignsByAccountId(accountId, postCampaignV202301)



Create a campaign and assign budgets for the given account id with creatable campaign attributes given in request body constrained by business validation. The validation error includes details and source of errors. Pacing can be adjusted and affected by the status of the campaign and the days left on the campaign if auto daily pacing is enabled.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## postApiV1ExternalAccountCatalogsByAccountId

> JsonApiSingleResponseOfCatalogStatus postApiV1ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequest)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request successfully created |  -  |


## postApiV2ExternalCampaignAuctionLineItemsByCampaignId

> AuctionLineItemResponse postApiV2ExternalCampaignAuctionLineItemsByCampaignId(campaignId, auctionLineItemCreateModelRequest)



Creates new auction line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202110ExternalPreferredLineItemByLineItemId

> PreferredLineItem202110Response putApi202110ExternalPreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModel202110Request)



Updates the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | The given line item id
        PreferredLineItemUpdateModel202110Request preferredLineItemUpdateModel202110Request = new PreferredLineItemUpdateModel202110Request(); // PreferredLineItemUpdateModel202110Request | The line item settings to create a line item with
        try {
            PreferredLineItem202110Response result = apiInstance.putApi202110ExternalPreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModel202110Request);
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
| **preferredLineItemUpdateModel202110Request** | [**PreferredLineItemUpdateModel202110Request**](PreferredLineItemUpdateModel202110Request.md)| The line item settings to create a line item with | [optional] |

### Return type

[**PreferredLineItem202110Response**](PreferredLineItem202110Response.md)

### Authorization

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## putApi202207ExternalAccountByAccountIdCreativescreativeId

> Creative202207Response putApi202207ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId, creativeUpdateModel202207)



Update a creative

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String accountId = "accountId_example"; // String | External account id containing the creative
        String creativeId = "creativeId_example"; // String | Creative to update
        CreativeUpdateModel202207 creativeUpdateModel202207 = new CreativeUpdateModel202207(); // CreativeUpdateModel202207 | The creative to create
        try {
            Creative202207Response result = apiInstance.putApi202207ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId, creativeUpdateModel202207);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202207ExternalAccountByAccountIdCreativescreativeId");
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

[**Creative202207Response**](Creative202207Response.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | Creative updated |  -  |


## putApi202301ExternalCampaignByCampaignId

> JsonApiSingleResponseOfCampaignV202301 putApi202301ExternalCampaignByCampaignId(campaignId, putCampaignV202301)



Edit a campaign for the given campaign id with a given editable attributes. This will return updated creatable and editable attributes of the campaign as the result of the operation. Pacing can be adjusted and affected by the status of the campaign and the days left on the campaign if auto daily pacing is enabled.

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putApi202301ExternalLineItemBidMultipliersByLineItemId

> LineItemBidMultipliersResponse putApi202301ExternalLineItemBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersRequest)



Replace bid multipliers on a line item

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        LineItemBidMultipliersRequest lineItemBidMultipliersRequest = new LineItemBidMultipliersRequest(); // LineItemBidMultipliersRequest | 
        try {
            LineItemBidMultipliersResponse result = apiInstance.putApi202301ExternalLineItemBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202301ExternalLineItemBidMultipliersByLineItemId");
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
| **lineItemId** | **String**| Long external id of the associated line item | |
| **lineItemBidMultipliersRequest** | [**LineItemBidMultipliersRequest**](LineItemBidMultipliersRequest.md)|  | [optional] |

### Return type

[**LineItemBidMultipliersResponse**](LineItemBidMultipliersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putApiV2ExternalAuctionLineItemByLineItemId

> AuctionLineItemResponse putApiV2ExternalAuctionLineItemByLineItemId(lineItemId, auctionLineItemUpdateModelRequest)



Updates the auction line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.v2023_01;

import com.criteo.api.retailmedia.v2023_01.ApiClient;
import com.criteo.api.retailmedia.v2023_01.ApiException;
import com.criteo.api.retailmedia.v2023_01.Configuration;
import com.criteo.api.retailmedia.v2023_01.auth.*;
import com.criteo.api.retailmedia.v2023_01.model.*;
import com.criteo.api.retailmedia.v2023_01.api.CampaignApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.criteo.com");
        
        // Configure OAuth2, two options:
        // 1. Set your access token manually, refresh token mechanism IS NOT handled by the client
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        // 2. Set your credentials within the ApiClient, refresh token mechanism IS handled for you 💚
        defaultClient.setUsername("YOUR CLIENT ID");
        defaultClient.setPassword("YOUR CLIENT SECRET");

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

