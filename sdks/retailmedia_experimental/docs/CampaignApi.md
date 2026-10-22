# CampaignApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProducts**](CampaignApi.md#addProducts) | **POST** /experimental/retail-media/line-items/{line-item-id}/products/add | /experimental/retail-media/line-items/{line-item-id}/products/add |
| [**createAuctionLineItem**](CampaignApi.md#createAuctionLineItem) | **POST** /experimental/retail-media/campaigns/{campaignId}/auction-line-items | /experimental/retail-media/campaigns/{campaignId}/auction-line-items |
| [**createCampaign**](CampaignApi.md#createCampaign) | **POST** /experimental/retail-media/accounts/{account-id}/campaigns | /experimental/retail-media/accounts/{account-id}/campaigns |
| [**createCreative**](CampaignApi.md#createCreative) | **POST** /experimental/retail-media/accounts/{account-id}/creatives | /experimental/retail-media/accounts/{account-id}/creatives |
| [**createLineItem**](CampaignApi.md#createLineItem) | **POST** /experimental/retail-media/line-items | /experimental/retail-media/line-items |
| [**createPreferredLineItemByCampaignId**](CampaignApi.md#createPreferredLineItemByCampaignId) | **POST** /experimental/retail-media/campaigns/{campaign-id}/preferred-line-items | /experimental/retail-media/campaigns/{campaign-id}/preferred-line-items |
| [**createTargetsByLineItemId**](CampaignApi.md#createTargetsByLineItemId) | **POST** /experimental/retail-media/line-items/{line-item-id}/targets/create | /experimental/retail-media/line-items/{line-item-id}/targets/create |
| [**deleteCreatives**](CampaignApi.md#deleteCreatives) | **POST** /experimental/retail-media/line-items/{line-item-id}/creatives/delete | /experimental/retail-media/line-items/{line-item-id}/creatives/delete |
| [**deleteProducts**](CampaignApi.md#deleteProducts) | **POST** /experimental/retail-media/line-items/{line-item-id}/products/delete | /experimental/retail-media/line-items/{line-item-id}/products/delete |
| [**fetchCreatives**](CampaignApi.md#fetchCreatives) | **GET** /experimental/retail-media/line-items/{line-item-id}/creatives | /experimental/retail-media/line-items/{line-item-id}/creatives |
| [**fetchProducts**](CampaignApi.md#fetchProducts) | **GET** /experimental/retail-media/line-items/{line-item-id}/products | /experimental/retail-media/line-items/{line-item-id}/products |
| [**getBiddingStrategyByLineItemId**](CampaignApi.md#getBiddingStrategyByLineItemId) | **GET** /experimental/retail-media/line-items/{line-item-id}/bidding-strategy | /experimental/retail-media/line-items/{line-item-id}/bidding-strategy |
| [**getCampaign**](CampaignApi.md#getCampaign) | **GET** /experimental/retail-media/campaigns/{campaign-id} | /experimental/retail-media/campaigns/{campaign-id} |
| [**getCapoutHistory**](CampaignApi.md#getCapoutHistory) | **POST** /experimental/retail-media/accounts/{account-id}/line-items/cap-out-history | /experimental/retail-media/accounts/{account-id}/line-items/cap-out-history |
| [**getCatalogStatus**](CampaignApi.md#getCatalogStatus) | **GET** /experimental/retail-media/catalogs/{catalogId}/status | /experimental/retail-media/catalogs/{catalogId}/status |
| [**getCreative**](CampaignApi.md#getCreative) | **GET** /experimental/retail-media/accounts/{account-id}/creatives/{creative-id} | /experimental/retail-media/accounts/{account-id}/creatives/{creative-id} |
| [**getLineItem**](CampaignApi.md#getLineItem) | **GET** /experimental/retail-media/line-items/{line-item-id} | /experimental/retail-media/line-items/{line-item-id} |
| [**getMinBidsByLineItemId**](CampaignApi.md#getMinBidsByLineItemId) | **GET** /experimental/retail-media/line-items/{line-item-id}/min-bids | /experimental/retail-media/line-items/{line-item-id}/min-bids |
| [**getTargetsByLineItemId**](CampaignApi.md#getTargetsByLineItemId) | **GET** /experimental/retail-media/line-items/{line-item-id}/targets | /experimental/retail-media/line-items/{line-item-id}/targets |
| [**lineItemsDemandSearch**](CampaignApi.md#lineItemsDemandSearch) | **POST** /experimental/retail-media/line-items/demand-search | /experimental/retail-media/line-items/demand-search |
| [**lineItemsSupplySearch**](CampaignApi.md#lineItemsSupplySearch) | **POST** /experimental/retail-media/line-items/supply-search | /experimental/retail-media/line-items/supply-search |
| [**listAccountChangeHistoryEntries**](CampaignApi.md#listAccountChangeHistoryEntries) | **GET** /experimental/retail-media/accounts/{account-id}/change-history-entries | /experimental/retail-media/accounts/{account-id}/change-history-entries |
| [**listRetailerChangeHistoryEntries**](CampaignApi.md#listRetailerChangeHistoryEntries) | **GET** /experimental/retail-media/retailers/{retailer-id}/change-history-entries | /experimental/retail-media/retailers/{retailer-id}/change-history-entries |
| [**searchAccountCreatives**](CampaignApi.md#searchAccountCreatives) | **POST** /experimental/retail-media/accounts/{account-id}/creatives/search | /experimental/retail-media/accounts/{account-id}/creatives/search |
| [**searchAccountCreativesEnriched**](CampaignApi.md#searchAccountCreativesEnriched) | **POST** /experimental/retail-media/accounts/{account-id}/creatives/search-enriched | /experimental/retail-media/accounts/{account-id}/creatives/search-enriched |
| [**searchCampaigns**](CampaignApi.md#searchCampaigns) | **POST** /experimental/retail-media/accounts/{account-id}/campaigns/search | /experimental/retail-media/accounts/{account-id}/campaigns/search |
| [**setBiddingStrategyByLineItemId**](CampaignApi.md#setBiddingStrategyByLineItemId) | **POST** /experimental/retail-media/line-items/{line-item-id}/set-bidding-strategy | /experimental/retail-media/line-items/{line-item-id}/set-bidding-strategy |
| [**submitLineItem**](CampaignApi.md#submitLineItem) | **POST** /experimental/retail-media/line-items/{line-item-id}/submit | /experimental/retail-media/line-items/{line-item-id}/submit |
| [**updateAuctionLineItem**](CampaignApi.md#updateAuctionLineItem) | **PUT** /experimental/retail-media/auction-line-items/{lineItemId} | /experimental/retail-media/auction-line-items/{lineItemId} |
| [**updateCampaign**](CampaignApi.md#updateCampaign) | **PATCH** /experimental/retail-media/campaigns/{campaign-id} | /experimental/retail-media/campaigns/{campaign-id} |
| [**updateCreative**](CampaignApi.md#updateCreative) | **PUT** /experimental/retail-media/accounts/{account-id}/creatives/{creative-id} | /experimental/retail-media/accounts/{account-id}/creatives/{creative-id} |
| [**updateLineItem**](CampaignApi.md#updateLineItem) | **PATCH** /experimental/retail-media/line-items/{line-item-id} | /experimental/retail-media/line-items/{line-item-id} |
| [**updatePreferredLineItemByLineItemId**](CampaignApi.md#updatePreferredLineItemByLineItemId) | **PUT** /experimental/retail-media/preferred-line-items/{line-item-id} | /experimental/retail-media/preferred-line-items/{line-item-id} |
| [**updateTargetsByLineItemId**](CampaignApi.md#updateTargetsByLineItemId) | **POST** /experimental/retail-media/line-items/{line-item-id}/targets/update | /experimental/retail-media/line-items/{line-item-id}/targets/update |
| [**upsertCreatives**](CampaignApi.md#upsertCreatives) | **POST** /experimental/retail-media/line-items/{line-item-id}/creatives/upsert | /experimental/retail-media/line-items/{line-item-id}/creatives/upsert |



## addProducts

> AddLineItemProductsListResponse addProducts(lineItemId, addLineItemProductsListRequest)

/experimental/retail-media/line-items/{line-item-id}/products/add

Add products to a line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The line item id.
        AddLineItemProductsListRequest addLineItemProductsListRequest = new AddLineItemProductsListRequest(); // AddLineItemProductsListRequest | The products to add.
        try {
            AddLineItemProductsListResponse result = apiInstance.addProducts(lineItemId, addLineItemProductsListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#addProducts");
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
| **lineItemId** | **String**| The line item id. | |
| **addLineItemProductsListRequest** | [**AddLineItemProductsListRequest**](AddLineItemProductsListRequest.md)| The products to add. | |

### Return type

[**AddLineItemProductsListResponse**](AddLineItemProductsListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createAuctionLineItem

> EntityResourceOutcomeOfSponsoredProductsLineItem createAuctionLineItem(campaignId, valueResourceInputOfSponsoredProductsLineItemCreateRequestModel)

/experimental/retail-media/campaigns/{campaignId}/auction-line-items

Creates new auction line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel valueResourceInputOfSponsoredProductsLineItemCreateRequestModel = new ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel(); // ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel | The line item settings to create a line item with
        try {
            EntityResourceOutcomeOfSponsoredProductsLineItem result = apiInstance.createAuctionLineItem(campaignId, valueResourceInputOfSponsoredProductsLineItemCreateRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createAuctionLineItem");
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
| **valueResourceInputOfSponsoredProductsLineItemCreateRequestModel** | [**ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel**](ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.md)| The line item settings to create a line item with | |

### Return type

[**EntityResourceOutcomeOfSponsoredProductsLineItem**](EntityResourceOutcomeOfSponsoredProductsLineItem.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## createCampaign

> CampaignResponseModelResponse createCampaign(accountId, campaignCreateModelRequest)

/experimental/retail-media/accounts/{account-id}/campaigns

Creates a campaign under the specified account.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String accountId = "accountId_example"; // String | The external id of the account.
        CampaignCreateModelRequest campaignCreateModelRequest = new CampaignCreateModelRequest(); // CampaignCreateModelRequest | The campaign to create.
        try {
            CampaignResponseModelResponse result = apiInstance.createCampaign(accountId, campaignCreateModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createCampaign");
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
| **accountId** | **String**| The external id of the account. | |
| **campaignCreateModelRequest** | [**CampaignCreateModelRequest**](CampaignCreateModelRequest.md)| The campaign to create. | |

### Return type

[**CampaignResponseModelResponse**](CampaignResponseModelResponse.md)

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

> Creative2Response createCreative(accountId, creativeCreateModel2)

/experimental/retail-media/accounts/{account-id}/creatives

Create a creative for an account

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        CreativeCreateModel2 creativeCreateModel2 = new CreativeCreateModel2(); // CreativeCreateModel2 | The creative to create
        try {
            Creative2Response result = apiInstance.createCreative(accountId, creativeCreateModel2);
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
| **creativeCreateModel2** | [**CreativeCreateModel2**](CreativeCreateModel2.md)| The creative to create | |

### Return type

[**Creative2Response**](Creative2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creatives created |  -  |


## createLineItem

> LineItemResponseV2 createLineItem(externalCreateLineItemModelRequest)

/experimental/retail-media/line-items

Create a new line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        ExternalCreateLineItemModelRequest externalCreateLineItemModelRequest = new ExternalCreateLineItemModelRequest(); // ExternalCreateLineItemModelRequest | Line item details
        try {
            LineItemResponseV2 result = apiInstance.createLineItem(externalCreateLineItemModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createLineItem");
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
| **externalCreateLineItemModelRequest** | [**ExternalCreateLineItemModelRequest**](ExternalCreateLineItemModelRequest.md)| Line item details | |

### Return type

[**LineItemResponseV2**](LineItemResponseV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createPreferredLineItemByCampaignId

> PreferredLineItemV2Response createPreferredLineItemByCampaignId(campaignId, preferredLineItemCreateModelV2Request)

/experimental/retail-media/campaigns/{campaign-id}/preferred-line-items

Creates a new preferred line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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


## createTargetsByLineItemId

> TargetListResponse createTargetsByLineItemId(lineItemId, createTargetRequestModelListRequest)

/experimental/retail-media/line-items/{line-item-id}/targets/create

Creates a given target

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Unique identifier for the line item
        CreateTargetRequestModelListRequest createTargetRequestModelListRequest = new CreateTargetRequestModelListRequest(); // CreateTargetRequestModelListRequest | Target to configure on the line item
        try {
            TargetListResponse result = apiInstance.createTargetsByLineItemId(lineItemId, createTargetRequestModelListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createTargetsByLineItemId");
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
| **lineItemId** | **String**| Unique identifier for the line item | |
| **createTargetRequestModelListRequest** | [**CreateTargetRequestModelListRequest**](CreateTargetRequestModelListRequest.md)| Target to configure on the line item | [optional] |

### Return type

[**TargetListResponse**](TargetListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteCreatives

> Outcome deleteCreatives(lineItemId, deleteLineItemCreativesRequest)

/experimental/retail-media/line-items/{line-item-id}/creatives/delete

Delete creatives and their product collections from a line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The external line item id.
        DeleteLineItemCreativesRequest deleteLineItemCreativesRequest = new DeleteLineItemCreativesRequest(); // DeleteLineItemCreativesRequest | The stable creative identifiers to delete.
        try {
            Outcome result = apiInstance.deleteCreatives(lineItemId, deleteLineItemCreativesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteCreatives");
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
| **lineItemId** | **String**| The external line item id. | |
| **deleteLineItemCreativesRequest** | [**DeleteLineItemCreativesRequest**](DeleteLineItemCreativesRequest.md)| The stable creative identifiers to delete. | |

### Return type

[**Outcome**](Outcome.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteProducts

> DeleteLineItemProductsListResponse deleteProducts(lineItemId, deleteLineItemProductsListRequest)

/experimental/retail-media/line-items/{line-item-id}/products/delete

Delete products from a line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The line item id.
        DeleteLineItemProductsListRequest deleteLineItemProductsListRequest = new DeleteLineItemProductsListRequest(); // DeleteLineItemProductsListRequest | The products to delete.
        try {
            DeleteLineItemProductsListResponse result = apiInstance.deleteProducts(lineItemId, deleteLineItemProductsListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteProducts");
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
| **lineItemId** | **String**| The line item id. | |
| **deleteLineItemProductsListRequest** | [**DeleteLineItemProductsListRequest**](DeleteLineItemProductsListRequest.md)| The products to delete. | |

### Return type

[**DeleteLineItemProductsListResponse**](DeleteLineItemProductsListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## fetchCreatives

> LineItemCreativesResponse fetchCreatives(lineItemId)

/experimental/retail-media/line-items/{line-item-id}/creatives

Retrieve the creatives and product collections associated with a line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The external line item id.
        try {
            LineItemCreativesResponse result = apiInstance.fetchCreatives(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#fetchCreatives");
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
| **lineItemId** | **String**| The external line item id. | |

### Return type

[**LineItemCreativesResponse**](LineItemCreativesResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## fetchProducts

> LineItemProductListResponseV2WithPaginationMeta fetchProducts(lineItemId, limit, offset)

/experimental/retail-media/line-items/{line-item-id}/products

Retrieve a page of products configured on a line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The line item id.
        Integer limit = 500; // Integer | The maximum number of products to return.
        Integer offset = 0; // Integer | The zero-based offset into the line item's product pool.
        try {
            LineItemProductListResponseV2WithPaginationMeta result = apiInstance.fetchProducts(lineItemId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#fetchProducts");
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
| **lineItemId** | **String**| The line item id. | |
| **limit** | **Integer**| The maximum number of products to return. | [optional] [default to 500] |
| **offset** | **Integer**| The zero-based offset into the line item&#39;s product pool. | [optional] [default to 0] |

### Return type

[**LineItemProductListResponseV2WithPaginationMeta**](LineItemProductListResponseV2WithPaginationMeta.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getBiddingStrategyByLineItemId

> BiddingSettingsResponse getBiddingStrategyByLineItemId(lineItemId)

/experimental/retail-media/line-items/{line-item-id}/bidding-strategy

Returns the current bidding configuration for a Display auction line item, including the active  bidding strategy and any preserved Standard and Adaptive strategy settings. Other line item types are  not currently supported by this endpoint.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The identifier of the line item whose bidding settings are requested.
        try {
            BiddingSettingsResponse result = apiInstance.getBiddingStrategyByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getBiddingStrategyByLineItemId");
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
| **lineItemId** | **String**| The identifier of the line item whose bidding settings are requested. | |

### Return type

[**BiddingSettingsResponse**](BiddingSettingsResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCampaign

> CampaignResponseModelResponse getCampaign(campaignId)

/experimental/retail-media/campaigns/{campaign-id}

Gets a campaign by its external id.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String campaignId = "campaignId_example"; // String | The external id of the campaign.
        try {
            CampaignResponseModelResponse result = apiInstance.getCampaign(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCampaign");
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
| **campaignId** | **String**| The external id of the campaign. | |

### Return type

[**CampaignResponseModelResponse**](CampaignResponseModelResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCapoutHistory

> ValueResourceOutcomeLineItemBudgetCapOutHistoryResponse getCapoutHistory(accountId, valueResourceInputLineItemBudgetCapOutHistoryRequest)

/experimental/retail-media/accounts/{account-id}/line-items/cap-out-history

Get the cap out history for line items

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String accountId = "accountId_example"; // String | account id that own the lineitem
        ValueResourceInputLineItemBudgetCapOutHistoryRequest valueResourceInputLineItemBudgetCapOutHistoryRequest = new ValueResourceInputLineItemBudgetCapOutHistoryRequest(); // ValueResourceInputLineItemBudgetCapOutHistoryRequest | lineitem budgetcapout history  object
        try {
            ValueResourceOutcomeLineItemBudgetCapOutHistoryResponse result = apiInstance.getCapoutHistory(accountId, valueResourceInputLineItemBudgetCapOutHistoryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCapoutHistory");
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
| **accountId** | **String**| account id that own the lineitem | |
| **valueResourceInputLineItemBudgetCapOutHistoryRequest** | [**ValueResourceInputLineItemBudgetCapOutHistoryRequest**](ValueResourceInputLineItemBudgetCapOutHistoryRequest.md)| lineitem budgetcapout history  object | |

### Return type

[**ValueResourceOutcomeLineItemBudgetCapOutHistoryResponse**](ValueResourceOutcomeLineItemBudgetCapOutHistoryResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCatalogStatus

> EntityResourceOutcomeOfCatalogStatusV2 getCatalogStatus(catalogId)

/experimental/retail-media/catalogs/{catalogId}/status

Check the status of a catalog request.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
            EntityResourceOutcomeOfCatalogStatusV2 result = apiInstance.getCatalogStatus(catalogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCatalogStatus");
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

[**EntityResourceOutcomeOfCatalogStatusV2**](EntityResourceOutcomeOfCatalogStatusV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Catalog request found. |  -  |


## getCreative

> Creative2Response getCreative(accountId, creativeId)

/experimental/retail-media/accounts/{account-id}/creatives/{creative-id}

Get the specified creative

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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


## getLineItem

> LineItemDetailsResponse getLineItem(lineItemId)

/experimental/retail-media/line-items/{line-item-id}

Retrieves a consolidated line item view from the line item domain services.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The line item identifier.
        try {
            LineItemDetailsResponse result = apiInstance.getLineItem(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getLineItem");
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
| **lineItemId** | **String**| The line item identifier. | |

### Return type

[**LineItemDetailsResponse**](LineItemDetailsResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getMinBidsByLineItemId

> LineItemMinBidsResponse getMinBidsByLineItemId(lineItemId)

/experimental/retail-media/line-items/{line-item-id}/min-bids

Returns page-type minimum bids and derived bidding thresholds for a Display auction line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The identifier of the line item whose minimum bids are requested.
        try {
            LineItemMinBidsResponse result = apiInstance.getMinBidsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getMinBidsByLineItemId");
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
| **lineItemId** | **String**| The identifier of the line item whose minimum bids are requested. | |

### Return type

[**LineItemMinBidsResponse**](LineItemMinBidsResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTargetsByLineItemId

> TargetListResponseWithPageMetadata getTargetsByLineItemId(lineItemId, limit, offset)

/experimental/retail-media/line-items/{line-item-id}/targets

Returns a list of targets for a given line item id

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Unique identifier of the Line Item for which targets will be fetched
        Integer limit = 500; // Integer | The number of elements to be returned. Defaults to 500.
        Integer offset = 0; // Integer | The (zero-based) starting offset in the collection. Defaults to 0.
        try {
            TargetListResponseWithPageMetadata result = apiInstance.getTargetsByLineItemId(lineItemId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getTargetsByLineItemId");
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
| **lineItemId** | **String**| Unique identifier of the Line Item for which targets will be fetched | |
| **limit** | **Integer**| The number of elements to be returned. Defaults to 500. | [optional] [default to 500] |
| **offset** | **Integer**| The (zero-based) starting offset in the collection. Defaults to 0. | [optional] [default to 0] |

### Return type

[**TargetListResponseWithPageMetadata**](TargetListResponseWithPageMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## lineItemsDemandSearch

> LineItemListResponseWithPagination lineItemsDemandSearch(demandSearchRequest)

/experimental/retail-media/line-items/demand-search

Search line items accessible from demand accounts.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        DemandSearchRequest demandSearchRequest = new DemandSearchRequest(); // DemandSearchRequest | Search criteria and pagination.
        try {
            LineItemListResponseWithPagination result = apiInstance.lineItemsDemandSearch(demandSearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#lineItemsDemandSearch");
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
| **demandSearchRequest** | [**DemandSearchRequest**](DemandSearchRequest.md)| Search criteria and pagination. | |

### Return type

[**LineItemListResponseWithPagination**](LineItemListResponseWithPagination.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## lineItemsSupplySearch

> LineItemListResponseWithPagination lineItemsSupplySearch(supplySearchRequest)

/experimental/retail-media/line-items/supply-search

Search line items accessible from a supply account and its retailers.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        SupplySearchRequest supplySearchRequest = new SupplySearchRequest(); // SupplySearchRequest | Search criteria and pagination.
        try {
            LineItemListResponseWithPagination result = apiInstance.lineItemsSupplySearch(supplySearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#lineItemsSupplySearch");
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
| **supplySearchRequest** | [**SupplySearchRequest**](SupplySearchRequest.md)| Search criteria and pagination. | |

### Return type

[**LineItemListResponseWithPagination**](LineItemListResponseWithPagination.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listAccountChangeHistoryEntries

> EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata listAccountChangeHistoryEntries(accountId, campaignIds, endTime, entityTypes, eventTypes, limit, lineItemIds, offset, startTime)

/experimental/retail-media/accounts/{account-id}/change-history-entries

Returns a paginated collection of changes to Retail Media objects under the requested account. Use &#x60;event-types&#x60; and &#x60;entity-types&#x60; to narrow the results.  Requests for inaccessible or unknown accounts return &#x60;403&#x60;. Changes outside the caller&#39;s access are omitted. Actor information is limited to role labels; user identifiers are not returned.  Results are returned in descending order by &#x60;occurredAt&#x60;. The relative order of entries with identical &#x60;occurredAt&#x60; values is unspecified.  Additional &#x60;eventType&#x60;, entity &#x60;type&#x60;, and change &#x60;field&#x60; values may be returned. Clients must tolerate values they do not recognize. 

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String accountId = "accountId_example"; // String | External opaque identifier of the advertiser account whose change history is requested.
        List<String> campaignIds = Arrays.asList(); // List<String> | When provided, only changes for these external opaque campaign identifiers are returned. Entries for campaigns outside the caller's account access are excluded without revealing whether the campaign exists. Omission is equivalent to an empty array. 
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Inclusive upper bound on change time, in UTC (ISO-8601 date-time). Defaults to the request time when omitted.
        List<String> entityTypes = Arrays.asList(); // List<String> | Restrict results to changes on the given entity types (see the entity `type` field). Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array. 
        List<String> eventTypes = Arrays.asList(); // List<String> | Restrict results to specific change-event types (see `eventType`). When omitted, all supported event types may be returned. Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array. 
        Integer limit = 25; // Integer | Maximum number of change-history entries to return in a single page.
        List<String> lineItemIds = Arrays.asList(); // List<String> | When provided, only changes for these external opaque line-item identifiers are returned. Entries for line items outside the caller's account access are excluded without revealing whether the line item exists. Omission is equivalent to an empty array. 
        Integer offset = 0; // Integer | Zero-based index of the first change-history entry to return.
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Inclusive lower bound on change time, in UTC (ISO-8601 date-time). Defaults to 7 days before the request time when omitted.
        try {
            EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata result = apiInstance.listAccountChangeHistoryEntries(accountId, campaignIds, endTime, entityTypes, eventTypes, limit, lineItemIds, offset, startTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#listAccountChangeHistoryEntries");
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
| **accountId** | **String**| External opaque identifier of the advertiser account whose change history is requested. | |
| **campaignIds** | [**List&lt;String&gt;**](String.md)| When provided, only changes for these external opaque campaign identifiers are returned. Entries for campaigns outside the caller&#39;s account access are excluded without revealing whether the campaign exists. Omission is equivalent to an empty array.  | [optional] |
| **endTime** | **OffsetDateTime**| Inclusive upper bound on change time, in UTC (ISO-8601 date-time). Defaults to the request time when omitted. | [optional] |
| **entityTypes** | [**List&lt;String&gt;**](String.md)| Restrict results to changes on the given entity types (see the entity &#x60;type&#x60; field). Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array.  | [optional] |
| **eventTypes** | [**List&lt;String&gt;**](String.md)| Restrict results to specific change-event types (see &#x60;eventType&#x60;). When omitted, all supported event types may be returned. Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array.  | [optional] |
| **limit** | **Integer**| Maximum number of change-history entries to return in a single page. | [optional] [default to 25] |
| **lineItemIds** | [**List&lt;String&gt;**](String.md)| When provided, only changes for these external opaque line-item identifiers are returned. Entries for line items outside the caller&#39;s account access are excluded without revealing whether the line item exists. Omission is equivalent to an empty array.  | [optional] |
| **offset** | **Integer**| Zero-based index of the first change-history entry to return. | [optional] [default to 0] |
| **startTime** | **OffsetDateTime**| Inclusive lower bound on change time, in UTC (ISO-8601 date-time). Defaults to 7 days before the request time when omitted. | [optional] |

### Return type

[**EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata**](EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change history entries retrieved. |  -  |


## listRetailerChangeHistoryEntries

> EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata listRetailerChangeHistoryEntries(retailerId, campaignIds, endTime, entityTypes, eventTypes, limit, lineItemIds, offset, startTime)

/experimental/retail-media/retailers/{retailer-id}/change-history-entries

Returns a paginated collection of changes to Retail Media objects under the requested retailer. Use &#x60;event-types&#x60; and &#x60;entity-types&#x60; to narrow the results.  Requests for inaccessible or unknown retailers return &#x60;403&#x60;. Changes outside the caller&#39;s access are omitted. Offsite campaign-level changes are not returned; offsite line-item changes are included. Actor information is limited to role labels; user identifiers are not returned.  Results are returned in descending order by &#x60;occurredAt&#x60;. The relative order of entries with identical &#x60;occurredAt&#x60; values is unspecified.  Additional &#x60;eventType&#x60;, entity &#x60;type&#x60;, and change &#x60;field&#x60; values may be returned. Clients must tolerate values they do not recognize. 

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String retailerId = "retailerId_example"; // String | External opaque identifier of the retailer whose change history is requested.
        List<String> campaignIds = Arrays.asList(); // List<String> | When provided, only changes for these external opaque campaign identifiers are returned. Entries for campaigns outside the caller's retailer access are excluded without revealing whether the campaign exists. Omission is equivalent to an empty array. 
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Inclusive upper bound on change time, in UTC (ISO-8601 date-time). Defaults to the request time when omitted.
        List<String> entityTypes = Arrays.asList(); // List<String> | Restrict results to changes on the given entity types (see the entity `type` field). Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array. 
        List<String> eventTypes = Arrays.asList(); // List<String> | Restrict results to specific change-event types (see `eventType`). When omitted, all supported event types may be returned. Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array. 
        Integer limit = 25; // Integer | Maximum number of change-history entries to return in a single page.
        List<String> lineItemIds = Arrays.asList(); // List<String> | When provided, only changes for these external opaque line-item identifiers are returned. Entries for line items outside the caller's retailer access are excluded without revealing whether the line item exists. Omission is equivalent to an empty array. 
        Integer offset = 0; // Integer | Zero-based index of the first change-history entry to return.
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Inclusive lower bound on change time, in UTC (ISO-8601 date-time). Defaults to 7 days before the request time when omitted.
        try {
            EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata result = apiInstance.listRetailerChangeHistoryEntries(retailerId, campaignIds, endTime, entityTypes, eventTypes, limit, lineItemIds, offset, startTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#listRetailerChangeHistoryEntries");
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
| **retailerId** | **String**| External opaque identifier of the retailer whose change history is requested. | |
| **campaignIds** | [**List&lt;String&gt;**](String.md)| When provided, only changes for these external opaque campaign identifiers are returned. Entries for campaigns outside the caller&#39;s retailer access are excluded without revealing whether the campaign exists. Omission is equivalent to an empty array.  | [optional] |
| **endTime** | **OffsetDateTime**| Inclusive upper bound on change time, in UTC (ISO-8601 date-time). Defaults to the request time when omitted. | [optional] |
| **entityTypes** | [**List&lt;String&gt;**](String.md)| Restrict results to changes on the given entity types (see the entity &#x60;type&#x60; field). Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array.  | [optional] |
| **eventTypes** | [**List&lt;String&gt;**](String.md)| Restrict results to specific change-event types (see &#x60;eventType&#x60;). When omitted, all supported event types may be returned. Unknown values are not errors; they simply match no entries. Omission is equivalent to an empty array.  | [optional] |
| **limit** | **Integer**| Maximum number of change-history entries to return in a single page. | [optional] [default to 25] |
| **lineItemIds** | [**List&lt;String&gt;**](String.md)| When provided, only changes for these external opaque line-item identifiers are returned. Entries for line items outside the caller&#39;s retailer access are excluded without revealing whether the line item exists. Omission is equivalent to an empty array.  | [optional] |
| **offset** | **Integer**| Zero-based index of the first change-history entry to return. | [optional] [default to 0] |
| **startTime** | **OffsetDateTime**| Inclusive lower bound on change time, in UTC (ISO-8601 date-time). Defaults to 7 days before the request time when omitted. | [optional] |

### Return type

[**EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata**](EntityResourceCollectionOutcomeV2OfChangeHistoryEntryResponseAndSdkPageMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change history entries retrieved. |  -  |


## searchAccountCreatives

> EntityResourceCollectionOutcomeCreativeSearchResponseAndMetadata searchAccountCreatives(accountId, entityResourceInputCreativeSearchRequest, limit, offset)

/experimental/retail-media/accounts/{account-id}/creatives/search

Get account creatives

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        EntityResourceInputCreativeSearchRequest entityResourceInputCreativeSearchRequest = new EntityResourceInputCreativeSearchRequest(); // EntityResourceInputCreativeSearchRequest | search request filter
        Integer limit = 50; // Integer | limit to paginated result
        Integer offset = 0; // Integer | offset to paginated result
        try {
            EntityResourceCollectionOutcomeCreativeSearchResponseAndMetadata result = apiInstance.searchAccountCreatives(accountId, entityResourceInputCreativeSearchRequest, limit, offset);
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
| **entityResourceInputCreativeSearchRequest** | [**EntityResourceInputCreativeSearchRequest**](EntityResourceInputCreativeSearchRequest.md)| search request filter | |
| **limit** | **Integer**| limit to paginated result | [optional] [default to 50] |
| **offset** | **Integer**| offset to paginated result | [optional] [default to 0] |

### Return type

[**EntityResourceCollectionOutcomeCreativeSearchResponseAndMetadata**](EntityResourceCollectionOutcomeCreativeSearchResponseAndMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## searchAccountCreativesEnriched

> EntityResourceCollectionOutcomeCreativeSearchEnrichedResponseAndMetadata searchAccountCreativesEnriched(accountId, entityResourceInputCreativeSearchEnrichedRequest, limit, offset)

/experimental/retail-media/accounts/{account-id}/creatives/search-enriched

Get account creatives enriched with the product collection constraints of their template.              The returned id is the first parent external id of the creative (stable across versions).

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        EntityResourceInputCreativeSearchEnrichedRequest entityResourceInputCreativeSearchEnrichedRequest = new EntityResourceInputCreativeSearchEnrichedRequest(); // EntityResourceInputCreativeSearchEnrichedRequest | search request filter
        Integer limit = 50; // Integer | limit to paginated result
        Integer offset = 0; // Integer | offset to paginated result
        try {
            EntityResourceCollectionOutcomeCreativeSearchEnrichedResponseAndMetadata result = apiInstance.searchAccountCreativesEnriched(accountId, entityResourceInputCreativeSearchEnrichedRequest, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#searchAccountCreativesEnriched");
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
| **entityResourceInputCreativeSearchEnrichedRequest** | [**EntityResourceInputCreativeSearchEnrichedRequest**](EntityResourceInputCreativeSearchEnrichedRequest.md)| search request filter | |
| **limit** | **Integer**| limit to paginated result | [optional] [default to 50] |
| **offset** | **Integer**| offset to paginated result | [optional] [default to 0] |

### Return type

[**EntityResourceCollectionOutcomeCreativeSearchEnrichedResponseAndMetadata**](EntityResourceCollectionOutcomeCreativeSearchEnrichedResponseAndMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creatives found |  -  |


## searchCampaigns

> CampaignResponseModelListResponseWithCampaignSearchMetadataModel searchCampaigns(accountId, campaignSearchModelRequest)

/experimental/retail-media/accounts/{account-id}/campaigns/search

Searches campaigns under an account using optional filters and pagination.  Budgets are sourced from the search index, so they lag a campaign that has just changed.  Search does not perform Kobalos enrichment, so drawable balance ids are not included.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String accountId = "accountId_example"; // String | The external id of the account.
        CampaignSearchModelRequest campaignSearchModelRequest = new CampaignSearchModelRequest(); // CampaignSearchModelRequest | Optional search filters and pagination.
        try {
            CampaignResponseModelListResponseWithCampaignSearchMetadataModel result = apiInstance.searchCampaigns(accountId, campaignSearchModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#searchCampaigns");
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
| **accountId** | **String**| The external id of the account. | |
| **campaignSearchModelRequest** | [**CampaignSearchModelRequest**](CampaignSearchModelRequest.md)| Optional search filters and pagination. | [optional] |

### Return type

[**CampaignResponseModelListResponseWithCampaignSearchMetadataModel**](CampaignResponseModelListResponseWithCampaignSearchMetadataModel.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## setBiddingStrategyByLineItemId

> BiddingSettingsResponse setBiddingStrategyByLineItemId(lineItemId, biddingSettingsRequest)

/experimental/retail-media/line-items/{line-item-id}/set-bidding-strategy

Replaces the submitted Standard page-type bids and updates the supplied strategy settings. Omitted  settings are preserved. Other line item types are not currently supported by this endpoint.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The identifier of the line item whose bidding settings are being updated.
        BiddingSettingsRequest biddingSettingsRequest = new BiddingSettingsRequest(); // BiddingSettingsRequest | The bidding settings to apply.
        try {
            BiddingSettingsResponse result = apiInstance.setBiddingStrategyByLineItemId(lineItemId, biddingSettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#setBiddingStrategyByLineItemId");
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
| **lineItemId** | **String**| The identifier of the line item whose bidding settings are being updated. | |
| **biddingSettingsRequest** | [**BiddingSettingsRequest**](BiddingSettingsRequest.md)| The bidding settings to apply. | [optional] |

### Return type

[**BiddingSettingsResponse**](BiddingSettingsResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## submitLineItem

> submitLineItem(lineItemId, submitLineItemRequestModelRequest)

/experimental/retail-media/line-items/{line-item-id}/submit

Submits a Commerce Display line item for retailer review, transitioning its eligible reviewable  properties to In Review. A successful submission responds with 204 No Content and an empty body.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The external id of the line item to submit.
        SubmitLineItemRequestModelRequest submitLineItemRequestModelRequest = new SubmitLineItemRequestModelRequest(); // SubmitLineItemRequestModelRequest | The submission details, including an optional comment for the reviewer.
        try {
            apiInstance.submitLineItem(lineItemId, submitLineItemRequestModelRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#submitLineItem");
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
| **lineItemId** | **String**| The external id of the line item to submit. | |
| **submitLineItemRequestModelRequest** | [**SubmitLineItemRequestModelRequest**](SubmitLineItemRequestModelRequest.md)| The submission details, including an optional comment for the reviewer. | [optional] |

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
| **204** | Success |  -  |


## updateAuctionLineItem

> EntityResourceOutcomeOfSponsoredProductsLineItem updateAuctionLineItem(lineItemId, valueResourceInputOfSponsoredProductsLineItemUpdateRequestModel)

/experimental/retail-media/auction-line-items/{lineItemId}

Updates a Sponsored Products Line Item given a line item id and a request.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The external line item ID of the sponsored products line item.
        ValueResourceInputOfSponsoredProductsLineItemUpdateRequestModel valueResourceInputOfSponsoredProductsLineItemUpdateRequestModel = new ValueResourceInputOfSponsoredProductsLineItemUpdateRequestModel(); // ValueResourceInputOfSponsoredProductsLineItemUpdateRequestModel | An update request containing all details of the requested update.
        try {
            EntityResourceOutcomeOfSponsoredProductsLineItem result = apiInstance.updateAuctionLineItem(lineItemId, valueResourceInputOfSponsoredProductsLineItemUpdateRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateAuctionLineItem");
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
| **lineItemId** | **String**| The external line item ID of the sponsored products line item. | |
| **valueResourceInputOfSponsoredProductsLineItemUpdateRequestModel** | [**ValueResourceInputOfSponsoredProductsLineItemUpdateRequestModel**](ValueResourceInputOfSponsoredProductsLineItemUpdateRequestModel.md)| An update request containing all details of the requested update. | |

### Return type

[**EntityResourceOutcomeOfSponsoredProductsLineItem**](EntityResourceOutcomeOfSponsoredProductsLineItem.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateCampaign

> CampaignModelResponse updateCampaign(campaignId, campaignUpdateModelRequest)

/experimental/retail-media/campaigns/{campaign-id}

Selectively updates a campaign. Omitted properties remain unchanged.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String campaignId = "campaignId_example"; // String | The external id of the campaign.
        CampaignUpdateModelRequest campaignUpdateModelRequest = new CampaignUpdateModelRequest(); // CampaignUpdateModelRequest | The campaign fields to update.
        try {
            CampaignModelResponse result = apiInstance.updateCampaign(campaignId, campaignUpdateModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateCampaign");
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
| **campaignId** | **String**| The external id of the campaign. | |
| **campaignUpdateModelRequest** | [**CampaignUpdateModelRequest**](CampaignUpdateModelRequest.md)| The campaign fields to update. | |

### Return type

[**CampaignModelResponse**](CampaignModelResponse.md)

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

> Creative2Response updateCreative(accountId, creativeId, creativeUpdateModel2)

/experimental/retail-media/accounts/{account-id}/creatives/{creative-id}

Update a creative

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        CreativeUpdateModel2 creativeUpdateModel2 = new CreativeUpdateModel2(); // CreativeUpdateModel2 | The creative to create
        try {
            Creative2Response result = apiInstance.updateCreative(accountId, creativeId, creativeUpdateModel2);
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
| **creativeUpdateModel2** | [**CreativeUpdateModel2**](CreativeUpdateModel2.md)| The creative to create | |

### Return type

[**Creative2Response**](Creative2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | Creative updated |  -  |


## updateLineItem

> LineItemResponseV2 updateLineItem(lineItemId, externalPatchLineItemModelRequest)

/experimental/retail-media/line-items/{line-item-id}

Update an existing line item.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The line item id
        ExternalPatchLineItemModelRequest externalPatchLineItemModelRequest = new ExternalPatchLineItemModelRequest(); // ExternalPatchLineItemModelRequest | Line item details
        try {
            LineItemResponseV2 result = apiInstance.updateLineItem(lineItemId, externalPatchLineItemModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateLineItem");
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
| **lineItemId** | **String**| The line item id | |
| **externalPatchLineItemModelRequest** | [**ExternalPatchLineItemModelRequest**](ExternalPatchLineItemModelRequest.md)| Line item details | |

### Return type

[**LineItemResponseV2**](LineItemResponseV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updatePreferredLineItemByLineItemId

> PreferredLineItemV2Response updatePreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModelV2Request)

/experimental/retail-media/preferred-line-items/{line-item-id}

Updates the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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


## updateTargetsByLineItemId

> TargetListResponse updateTargetsByLineItemId(lineItemId, targetListRequest)

/experimental/retail-media/line-items/{line-item-id}/targets/update

Updates targets in bulk. The request has PATCH-like semantics: immutable target details identify  each target, while mutable fields supplied in the request are updated.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Unique identifier for the line item.
        TargetListRequest targetListRequest = new TargetListRequest(); // TargetListRequest | Targets to update.
        try {
            TargetListResponse result = apiInstance.updateTargetsByLineItemId(lineItemId, targetListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateTargetsByLineItemId");
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
| **lineItemId** | **String**| Unique identifier for the line item. | |
| **targetListRequest** | [**TargetListRequest**](TargetListRequest.md)| Targets to update. | [optional] |

### Return type

[**TargetListResponse**](TargetListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## upsertCreatives

> UpsertLineItemCreativesResponse upsertCreatives(lineItemId, upsertLineItemCreativesRequest)

/experimental/retail-media/line-items/{line-item-id}/creatives/upsert

Resolves each supplied stable creative identifier to its latest revision and  associates those revisions with the line item&#39;s proposal.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | The line item id.
        UpsertLineItemCreativesRequest upsertLineItemCreativesRequest = new UpsertLineItemCreativesRequest(); // UpsertLineItemCreativesRequest | The creatives to upsert.
        try {
            UpsertLineItemCreativesResponse result = apiInstance.upsertCreatives(lineItemId, upsertLineItemCreativesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#upsertCreatives");
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
| **lineItemId** | **String**| The line item id. | |
| **upsertLineItemCreativesRequest** | [**UpsertLineItemCreativesRequest**](UpsertLineItemCreativesRequest.md)| The creatives to upsert. | |

### Return type

[**UpsertLineItemCreativesResponse**](UpsertLineItemCreativesResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

