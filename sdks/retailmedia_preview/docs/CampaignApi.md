# CampaignApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRemoveKeywords**](CampaignApi.md#addRemoveKeywords) | **POST** /preview/retail-media/line-items/{id}/keywords/add-remove |  |
| [**appendPromotedProducts**](CampaignApi.md#appendPromotedProducts) | **POST** /preview/retail-media/line-items/{line-item-id}/products/append |  |
| [**deleteApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId**](CampaignApi.md#deleteApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId) | **DELETE** /preview/retail-media/line-items/{line-item-id}/product-buttons/{product-button-id} |  |
| [**deletePromotedProducts**](CampaignApi.md#deletePromotedProducts) | **POST** /preview/retail-media/line-items/{line-item-id}/products/delete |  |
| [**fetchKeywords**](CampaignApi.md#fetchKeywords) | **GET** /preview/retail-media/line-items/{id}/keywords |  |
| [**fetchPromotedProducts**](CampaignApi.md#fetchPromotedProducts) | **GET** /preview/retail-media/line-items/{line-item-id}/products |  |
| [**getApi202210ExternalLineItemProductButtonsByLineItemId**](CampaignApi.md#getApi202210ExternalLineItemProductButtonsByLineItemId) | **GET** /preview/retail-media/line-items/{line-item-id}/product-buttons |  |
| [**getApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId**](CampaignApi.md#getApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId) | **GET** /preview/retail-media/line-items/{line-item-id}/product-buttons/{product-button-id} |  |
| [**getApiV1ExternalRetailerBrandsByRetailerId**](CampaignApi.md#getApiV1ExternalRetailerBrandsByRetailerId) | **GET** /preview/retail-media/retailers/{retailerId}/brands |  |
| [**getApiV1ExternalRetailerByRetailerIdSellerBySeller**](CampaignApi.md#getApiV1ExternalRetailerByRetailerIdSellerBySeller) | **GET** /preview/retail-media/retailers/{retailerId}/sellers/{seller} |  |
| [**getApiV1ExternalRetailerCategoryCpcRatesByRetailerId**](CampaignApi.md#getApiV1ExternalRetailerCategoryCpcRatesByRetailerId) | **GET** /preview/retail-media/retailers/{retailer-id}/cpc-rates |  |
| [**getApiV1ExternalRetailerPlacementsByRetailerId**](CampaignApi.md#getApiV1ExternalRetailerPlacementsByRetailerId) | **GET** /preview/retail-media/retailers/{retailer-id}/placements |  |
| [**getApiV2ExternalAccountByAccountIdCreativescreativeId**](CampaignApi.md#getApiV2ExternalAccountByAccountIdCreativescreativeId) | **GET** /preview/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**getApiV2ExternalCampaignPreferredLineItemsByCampaignId**](CampaignApi.md#getApiV2ExternalCampaignPreferredLineItemsByCampaignId) | **GET** /preview/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**getApiV2ExternalLineItemBidMultipliersByLineItemId**](CampaignApi.md#getApiV2ExternalLineItemBidMultipliersByLineItemId) | **GET** /preview/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**getApiV2ExternalPreferredLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalPreferredLineItemByLineItemId) | **GET** /preview/retail-media/preferred-line-items/{line-item-id} |  |
| [**getCpcMinBidsBySkuIdsV1**](CampaignApi.md#getCpcMinBidsBySkuIdsV1) | **POST** /preview/retail-media/retailers/{retailerId}/cpc-min-bids |  |
| [**getRecommendedKeywords**](CampaignApi.md#getRecommendedKeywords) | **GET** /preview/retail-media/line-items/{externalLineItemId}/keywords/recommended |  |
| [**pausePromotedProducts**](CampaignApi.md#pausePromotedProducts) | **POST** /preview/retail-media/line-items/{line-item-id}/products/pause |  |
| [**postApi202110ExternalCampaignPreferredLineItemsByCampaignId**](CampaignApi.md#postApi202110ExternalCampaignPreferredLineItemsByCampaignId) | **POST** /preview/retail-media/campaigns/{campaign-id}/preferred-line-items |  |
| [**postApi202210ExternalLineItemProductButtonsCreateByLineItemId**](CampaignApi.md#postApi202210ExternalLineItemProductButtonsCreateByLineItemId) | **POST** /preview/retail-media/line-items/{line-item-id}/product-buttons/create |  |
| [**postApiV1ExternalAccountCatalogsSellersByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsSellersByAccountId) | **POST** /preview/retail-media/accounts/{accountId}/catalogs/sellers |  |
| [**postApiV1ExternalCatalogsSkuRetrieval**](CampaignApi.md#postApiV1ExternalCatalogsSkuRetrieval) | **POST** /preview/retail-media/catalogs/sku-retrieval |  |
| [**postApiV1ExternalCatalogsSkuSearch**](CampaignApi.md#postApiV1ExternalCatalogsSkuSearch) | **POST** /preview/retail-media/catalogs/sku-search |  |
| [**postApiV1ExternalCatalogsSkuSearchAccountIdAndRetailerId**](CampaignApi.md#postApiV1ExternalCatalogsSkuSearchAccountIdAndRetailerId) | **POST** /preview/retail-media/catalogs/sku-search/accounts/{account-id}/retailers/{retailer-id} |  |
| [**postApiV1ExternalCatalogsSkuSearchRetailerByRetailerId**](CampaignApi.md#postApiV1ExternalCatalogsSkuSearchRetailerByRetailerId) | **POST** /preview/retail-media/catalogs/sku/search/retailers/{retailer-id} |  |
| [**postApiV2ExternalAccountCreativesByAccountId**](CampaignApi.md#postApiV2ExternalAccountCreativesByAccountId) | **POST** /preview/retail-media/accounts/{account-id}/creatives |  |
| [**postApiV2ExternalAccountCreativesSearchByAccountId**](CampaignApi.md#postApiV2ExternalAccountCreativesSearchByAccountId) | **POST** /preview/retail-media/accounts/{account-id}/creatives/search |  |
| [**putApi202110ExternalPreferredLineItemByLineItemId**](CampaignApi.md#putApi202110ExternalPreferredLineItemByLineItemId) | **PUT** /preview/retail-media/preferred-line-items/{line-item-id} |  |
| [**putApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId**](CampaignApi.md#putApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId) | **PUT** /preview/retail-media/line-items/{line-item-id}/product-buttons/{product-button-id} |  |
| [**putApiV2ExternalAccountByAccountIdCreativescreativeId**](CampaignApi.md#putApiV2ExternalAccountByAccountIdCreativescreativeId) | **PUT** /preview/retail-media/accounts/{account-id}/creatives/{creative-id} |  |
| [**putApiV2ExternalLineItemBidMultipliersByLineItemId**](CampaignApi.md#putApiV2ExternalLineItemBidMultipliersByLineItemId) | **PUT** /preview/retail-media/line-items/{line-item-id}/bid-multipliers |  |
| [**searchBrandsByNameAsyncV1**](CampaignApi.md#searchBrandsByNameAsyncV1) | **POST** /preview/retail-media/brands/search |  |
| [**setKeywordBids**](CampaignApi.md#setKeywordBids) | **POST** /preview/retail-media/line-items/{id}/keywords/set-bid |  |
| [**unpausePromotedProducts**](CampaignApi.md#unpausePromotedProducts) | **POST** /preview/retail-media/line-items/{line-item-id}/products/unpause |  |



## addRemoveKeywords

> ResourceOutcome addRemoveKeywords(id, addRemoveKeywordsModelRequest)



Add or Remove keywords from the line item in bulk

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
| **204** | Promoted products appended to the line item |  -  |
| **200** | Promoted products appended to the line item with warnings |  -  |
| **400** | Invalid request body |  -  |
| **403** | Invalid external line item ID |  -  |


## deleteApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId

> deleteApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId(lineItemId, productButtonId)



Delete a product button

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        String productButtonId = "productButtonId_example"; // String | Sequential id of the product button
        try {
            apiInstance.deleteApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId(lineItemId, productButtonId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#deleteApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId");
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
| **productButtonId** | **String**| Sequential id of the product button | |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deletePromotedProducts

> deletePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Remove a collection of promoted products from a line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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

> PromotedProductResourceCollectionOutcome fetchPromotedProducts(lineItemId, offset, limit, fields)



Retrieve a page of promoted products for a line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        Integer offset = 56; // Integer | Offset of the first item to fetch. Defaults to zero.
        Integer limit = 56; // Integer | Maximum page size to fetch. Defaults to 500.
        String fields = "fields_example"; // String | A comma separated list of attribute names from the response model to compute and return.              Valid values are `status` and `bidOverride` in any order. Defaults to `status`.
        try {
            PromotedProductResourceCollectionOutcome result = apiInstance.fetchPromotedProducts(lineItemId, offset, limit, fields);
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
| **offset** | **Integer**| Offset of the first item to fetch. Defaults to zero. | [optional] |
| **limit** | **Integer**| Maximum page size to fetch. Defaults to 500. | [optional] |
| **fields** | **String**| A comma separated list of attribute names from the response model to compute and return.              Valid values are &#x60;status&#x60; and &#x60;bidOverride&#x60; in any order. Defaults to &#x60;status&#x60;. | [optional] |

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


## getApi202210ExternalLineItemProductButtonsByLineItemId

> ProductButtonListResponse getApi202210ExternalLineItemProductButtonsByLineItemId(lineItemId)



Get all the product buttons associated with a line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        try {
            ProductButtonListResponse result = apiInstance.getApi202210ExternalLineItemProductButtonsByLineItemId(lineItemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202210ExternalLineItemProductButtonsByLineItemId");
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

[**ProductButtonListResponse**](ProductButtonListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId

> ProductButtonListResponse getApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId(lineItemId, productButtonId)



Get a single product button

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        String productButtonId = "productButtonId_example"; // String | Sequential id of the product button
        try {
            ProductButtonListResponse result = apiInstance.getApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId(lineItemId, productButtonId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId");
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
| **productButtonId** | **String**| Sequential id of the product button | |

### Return type

[**ProductButtonListResponse**](ProductButtonListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalRetailerBrandsByRetailerId

> BrandPreviewListResponse getApiV1ExternalRetailerBrandsByRetailerId(retailerId, skuStockTypeFilter, brandType)



Gets the brands for the given retailer

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        Integer retailerId = 56; // Integer | The retailer id for which brands should be fetched.
        String skuStockTypeFilter = "first-party"; // String | Filter to narrow down brands [first-party|third-party|first-and-third-party]. Defaults to first-and-third-party
        String brandType = "all"; // String |  Filter to narrow down brands [all|uc|retailer]. Defaults to uc
        try {
            BrandPreviewListResponse result = apiInstance.getApiV1ExternalRetailerBrandsByRetailerId(retailerId, skuStockTypeFilter, brandType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalRetailerBrandsByRetailerId");
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
| **retailerId** | **Integer**| The retailer id for which brands should be fetched. | |
| **skuStockTypeFilter** | **String**| Filter to narrow down brands [first-party|third-party|first-and-third-party]. Defaults to first-and-third-party | [optional] [enum: first-party, third-party, first-and-third-party] |
| **brandType** | **String**|  Filter to narrow down brands [all|uc|retailer]. Defaults to uc | [optional] [enum: all, uc, retailer] |

### Return type

[**BrandPreviewListResponse**](BrandPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Brands found. |  -  |


## getApiV1ExternalRetailerByRetailerIdSellerBySeller

> SellerPreviewResponse getApiV1ExternalRetailerByRetailerIdSellerBySeller(retailerId, seller)



Endpoint to get market place seller id and name

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        Integer retailerId = 56; // Integer | The retailer id for which seller should be fetched.
        String seller = "seller_example"; // String | The seller id or seller name which should be validated.
        try {
            SellerPreviewResponse result = apiInstance.getApiV1ExternalRetailerByRetailerIdSellerBySeller(retailerId, seller);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalRetailerByRetailerIdSellerBySeller");
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
| **retailerId** | **Integer**| The retailer id for which seller should be fetched. | |
| **seller** | **String**| The seller id or seller name which should be validated. | |

### Return type

[**SellerPreviewResponse**](SellerPreviewResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Seller found. |  -  |


## getApiV1ExternalRetailerCategoryCpcRatesByRetailerId

> CpcRateCardPreviewResponse getApiV1ExternalRetailerCategoryCpcRatesByRetailerId(retailerId, fields)



Gets the minimum cpc bid for the retailer, and optionally the categories under the retailer

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String retailerId = "retailerId_example"; // String | The retailer id
        List<String> fields = Arrays.asList(); // List<String> | The fields in the response that is to be included
        try {
            CpcRateCardPreviewResponse result = apiInstance.getApiV1ExternalRetailerCategoryCpcRatesByRetailerId(retailerId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalRetailerCategoryCpcRatesByRetailerId");
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
| **retailerId** | **String**| The retailer id | |
| **fields** | [**List&lt;String&gt;**](String.md)| The fields in the response that is to be included | [optional] |

### Return type

[**CpcRateCardPreviewResponse**](CpcRateCardPreviewResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | bids found |  -  |
| **403** | forbidden |  -  |


## getApiV1ExternalRetailerPlacementsByRetailerId

> PlacementPreviewListResponse getApiV1ExternalRetailerPlacementsByRetailerId(retailerId)



Gets all placement information for the given retailer

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String retailerId = "retailerId_example"; // String | The retailer id for which placements should be fetched.
        try {
            PlacementPreviewListResponse result = apiInstance.getApiV1ExternalRetailerPlacementsByRetailerId(retailerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalRetailerPlacementsByRetailerId");
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
| **retailerId** | **String**| The retailer id for which placements should be fetched. | |

### Return type

[**PlacementPreviewListResponse**](PlacementPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | placements records. |  -  |
| **403** | Forbidden |  -  |


## getApiV2ExternalAccountByAccountIdCreativescreativeId

> Creative2Response getApiV2ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId)



Get the specified creative

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## getApiV2ExternalCampaignPreferredLineItemsByCampaignId

> PreferredLineItemV2PagedListResponse getApiV2ExternalCampaignPreferredLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of preferred line item objects for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## getApiV2ExternalPreferredLineItemByLineItemId

> PreferredLineItemV2Response getApiV2ExternalPreferredLineItemByLineItemId(lineItemId)



Gets the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## getCpcMinBidsBySkuIdsV1

> ValueResourceOutcomeCpcMinBidsResponse getCpcMinBidsBySkuIdsV1(retailerId, valueResourceInputCpcMinBidsRequest)



Get overall and individual minimum bid amount for given retailer id and sku id list.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## getRecommendedKeywords

> ValueResourceOutcomeOfRecommendedKeywordsResult getRecommendedKeywords(externalLineItemId)



Retrieves a collection of recommended keywords for a line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String externalLineItemId = "externalLineItemId_example"; // String | The external line item identifier
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
| **externalLineItemId** | **String**| The external line item identifier | |

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


## pausePromotedProducts

> pausePromotedProducts(lineItemId, promotedProductResourceCollectionInput)



Pause a collection of promoted products associated with a line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## postApi202110ExternalCampaignPreferredLineItemsByCampaignId

> PreferredLineItemV2Response postApi202110ExternalCampaignPreferredLineItemsByCampaignId(campaignId, preferredLineItemCreateModelV2Request)



Creates a new preferred line item with the specified settings

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## postApi202210ExternalLineItemProductButtonsCreateByLineItemId

> ProductButtonListResponse postApi202210ExternalLineItemProductButtonsCreateByLineItemId(lineItemId, productButtonListRequest)



Append new product buttons to a line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        ProductButtonListRequest productButtonListRequest = new ProductButtonListRequest(); // ProductButtonListRequest | List of product buttons to append to the specified line item
        try {
            ProductButtonListResponse result = apiInstance.postApi202210ExternalLineItemProductButtonsCreateByLineItemId(lineItemId, productButtonListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApi202210ExternalLineItemProductButtonsCreateByLineItemId");
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
| **productButtonListRequest** | [**ProductButtonListRequest**](ProductButtonListRequest.md)| List of product buttons to append to the specified line item | [optional] |

### Return type

[**ProductButtonListResponse**](ProductButtonListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApiV1ExternalAccountCatalogsSellersByAccountId

> JsonApiSingleResponseOfCatalogStatus postApiV1ExternalAccountCatalogsSellersByAccountId(accountId, jsonApiRequestOfSellerCatalogRequest)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## postApiV1ExternalCatalogsSkuRetrieval

> SkuDataPreviewListResponse postApiV1ExternalCatalogsSkuRetrieval(pageIndex, pageSize, requestBody)



Endpoint to search skus by text, retailer and sellers/brands.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        List<String> requestBody = Arrays.asList(); // List<String> | The list of SKU keys to retrieve sku information
        try {
            SkuDataPreviewListResponse result = apiInstance.postApiV1ExternalCatalogsSkuRetrieval(pageIndex, pageSize, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalCatalogsSkuRetrieval");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| The list of SKU keys to retrieve sku information | [optional] |

### Return type

[**SkuDataPreviewListResponse**](SkuDataPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Skus found. |  -  |


## postApiV1ExternalCatalogsSkuSearch

> SkuDataPreviewListResponse postApiV1ExternalCatalogsSkuSearch(pageIndex, pageSize, skuSearchRequestPreviewRequest)



Endpoint to search skus by text, retailer and sellers/brands.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        SkuSearchRequestPreviewRequest skuSearchRequestPreviewRequest = new SkuSearchRequestPreviewRequest(); // SkuSearchRequestPreviewRequest | 
        try {
            SkuDataPreviewListResponse result = apiInstance.postApiV1ExternalCatalogsSkuSearch(pageIndex, pageSize, skuSearchRequestPreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalCatalogsSkuSearch");
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
| **skuSearchRequestPreviewRequest** | [**SkuSearchRequestPreviewRequest**](SkuSearchRequestPreviewRequest.md)|  | [optional] |

### Return type

[**SkuDataPreviewListResponse**](SkuDataPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Skus found. |  -  |


## postApiV1ExternalCatalogsSkuSearchAccountIdAndRetailerId

> SkuSlimDataPreviewListResponse postApiV1ExternalCatalogsSkuSearchAccountIdAndRetailerId(accountId, retailerId, offset, limit, skuSearchRequestSlimPreviewRequest)



Endpoint to search skus by text, account and retailer with an option to filter by brands id&#39;s.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String accountId = "accountId_example"; // String | The account for which skus should be searched for.
        String retailerId = "retailerId_example"; // String | The client id/retailer id for which skus should be searched for.
        Integer offset = 0; // Integer | The start position in the overall list of matches. Must be zero or greater.
        Integer limit = 100; // Integer | The maximum number of results to return with each call. Must be greater than zero.
        SkuSearchRequestSlimPreviewRequest skuSearchRequestSlimPreviewRequest = new SkuSearchRequestSlimPreviewRequest(); // SkuSearchRequestSlimPreviewRequest | 
        try {
            SkuSlimDataPreviewListResponse result = apiInstance.postApiV1ExternalCatalogsSkuSearchAccountIdAndRetailerId(accountId, retailerId, offset, limit, skuSearchRequestSlimPreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalCatalogsSkuSearchAccountIdAndRetailerId");
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
| **accountId** | **String**| The account for which skus should be searched for. | |
| **retailerId** | **String**| The client id/retailer id for which skus should be searched for. | |
| **offset** | **Integer**| The start position in the overall list of matches. Must be zero or greater. | [optional] [default to 0] |
| **limit** | **Integer**| The maximum number of results to return with each call. Must be greater than zero. | [optional] [default to 100] |
| **skuSearchRequestSlimPreviewRequest** | [**SkuSearchRequestSlimPreviewRequest**](SkuSearchRequestSlimPreviewRequest.md)|  | [optional] |

### Return type

[**SkuSlimDataPreviewListResponse**](SkuSlimDataPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Skus found. |  -  |


## postApiV1ExternalCatalogsSkuSearchRetailerByRetailerId

> SkuSlimDataV2ListResponse postApiV1ExternalCatalogsSkuSearchRetailerByRetailerId(retailerId, xOriginAccount, offset, limit, skuSearchRequestSlimV2PreviewRequest)



Endpoint to search skus by text for a retailer with an option to filter by brands id&#39;s.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String retailerId = "retailerId_example"; // String | The client id/retailer id for which skus should be searched for.
        String xOriginAccount = "xOriginAccount_example"; // String | The account id of the initiator of the call.
        Integer offset = 0; // Integer | The start position in the overall list of matches. Must be zero or greater.
        Integer limit = 100; // Integer | The maximum number of results to return with each call. Must be greater than zero and less than 1500. 10,000 records deep is the max limit.
        SkuSearchRequestSlimV2PreviewRequest skuSearchRequestSlimV2PreviewRequest = new SkuSearchRequestSlimV2PreviewRequest(); // SkuSearchRequestSlimV2PreviewRequest | 
        try {
            SkuSlimDataV2ListResponse result = apiInstance.postApiV1ExternalCatalogsSkuSearchRetailerByRetailerId(retailerId, xOriginAccount, offset, limit, skuSearchRequestSlimV2PreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalCatalogsSkuSearchRetailerByRetailerId");
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
| **retailerId** | **String**| The client id/retailer id for which skus should be searched for. | |
| **xOriginAccount** | **String**| The account id of the initiator of the call. | [optional] |
| **offset** | **Integer**| The start position in the overall list of matches. Must be zero or greater. | [optional] [default to 0] |
| **limit** | **Integer**| The maximum number of results to return with each call. Must be greater than zero and less than 1500. 10,000 records deep is the max limit. | [optional] [default to 100] |
| **skuSearchRequestSlimV2PreviewRequest** | [**SkuSearchRequestSlimV2PreviewRequest**](SkuSearchRequestSlimV2PreviewRequest.md)|  | [optional] |

### Return type

[**SkuSlimDataV2ListResponse**](SkuSlimDataV2ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Skus found. |  -  |


## postApiV2ExternalAccountCreativesByAccountId

> Creative2Response postApiV2ExternalAccountCreativesByAccountId(accountId, creativeCreateModel2)



Create a creative for an account

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
            Creative2Response result = apiInstance.postApiV2ExternalAccountCreativesByAccountId(accountId, creativeCreateModel2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV2ExternalAccountCreativesByAccountId");
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
| **creativeCreateModel2** | [**CreativeCreateModel2**](CreativeCreateModel2.md)| The creative to create | [optional] |

### Return type

[**Creative2Response**](Creative2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creatives created |  -  |


## postApiV2ExternalAccountCreativesSearchByAccountId

> Creative2ListResponse postApiV2ExternalAccountCreativesSearchByAccountId(accountId, creativeIds)



Get account creatives

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## putApi202110ExternalPreferredLineItemByLineItemId

> PreferredLineItemV2Response putApi202110ExternalPreferredLineItemByLineItemId(lineItemId, preferredLineItemUpdateModelV2Request)



Updates the preferred line item for the given line item id

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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


## putApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId

> ProductButtonListResponse putApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId(lineItemId, productButtonId, productButtonRequest)



Update a product button

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        String lineItemId = "lineItemId_example"; // String | Long external id of the associated line item
        String productButtonId = "productButtonId_example"; // String | Sequential id of the product button
        ProductButtonRequest productButtonRequest = new ProductButtonRequest(); // ProductButtonRequest | Details of the updated product button
        try {
            ProductButtonListResponse result = apiInstance.putApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId(lineItemId, productButtonId, productButtonRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApi202210ExternalLineItemProductButtonsByLineItemIdProductButtonId");
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
| **productButtonId** | **String**| Sequential id of the product button | |
| **productButtonRequest** | [**ProductButtonRequest**](ProductButtonRequest.md)| Details of the updated product button | [optional] |

### Return type

[**ProductButtonListResponse**](ProductButtonListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putApiV2ExternalAccountByAccountIdCreativescreativeId

> Creative2Response putApiV2ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId, creativeUpdateModel2)



Update a creative

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
            Creative2Response result = apiInstance.putApiV2ExternalAccountByAccountIdCreativescreativeId(accountId, creativeId, creativeUpdateModel2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApiV2ExternalAccountByAccountIdCreativescreativeId");
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
| **creativeUpdateModel2** | [**CreativeUpdateModel2**](CreativeUpdateModel2.md)| The creative to create | [optional] |

### Return type

[**Creative2Response**](Creative2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | Creative updated |  -  |


## putApiV2ExternalLineItemBidMultipliersByLineItemId

> LineItemBidMultipliersV2Response putApiV2ExternalLineItemBidMultipliersByLineItemId(lineItemId, lineItemBidMultipliersV2Request)



Updates the bid multipliers for a given line item

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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

> EntityResourceCollectionOutcomeBrandIdSearchResultPagingOffsetLimitMetadata searchBrandsByNameAsyncV1(offset, limit, valueResourceInputBrandIdSearchRequest)



Search for brands given a retailer ID and search term.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
        Integer offset = 0; // Integer | offset of paginated results
        Integer limit = 25; // Integer | the number of brands to return
        ValueResourceInputBrandIdSearchRequest valueResourceInputBrandIdSearchRequest = new ValueResourceInputBrandIdSearchRequest(); // ValueResourceInputBrandIdSearchRequest | BrandIdSearchRequest which contains the request parameters
        try {
            EntityResourceCollectionOutcomeBrandIdSearchResultPagingOffsetLimitMetadata result = apiInstance.searchBrandsByNameAsyncV1(offset, limit, valueResourceInputBrandIdSearchRequest);
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
| **offset** | **Integer**| offset of paginated results | [optional] [default to 0] |
| **limit** | **Integer**| the number of brands to return | [optional] [default to 25] |
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
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

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

