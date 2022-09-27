# CampaignApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1ExternalAccountBrandsByAccountId**](CampaignApi.md#getApiV1ExternalAccountBrandsByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/brands |  |
| [**getApiV1ExternalAccountCampaignsByAccountId**](CampaignApi.md#getApiV1ExternalAccountCampaignsByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/campaigns |  |
| [**getApiV1ExternalAccountRetailersByAccountId**](CampaignApi.md#getApiV1ExternalAccountRetailersByAccountId) | **GET** /2021-07/retail-media/accounts/{accountId}/retailers |  |
| [**getApiV1ExternalAccounts**](CampaignApi.md#getApiV1ExternalAccounts) | **GET** /2021-07/retail-media/accounts |  |
| [**getApiV1ExternalCampaignByCampaignId**](CampaignApi.md#getApiV1ExternalCampaignByCampaignId) | **GET** /2021-07/retail-media/campaigns/{campaignId} |  |
| [**getApiV1ExternalCatalogOutputByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogOutputByCatalogId) | **GET** /2021-07/retail-media/catalogs/{catalogId}/output |  |
| [**getApiV1ExternalCatalogStatusByCatalogId**](CampaignApi.md#getApiV1ExternalCatalogStatusByCatalogId) | **GET** /2021-07/retail-media/catalogs/{catalogId}/status |  |
| [**getApiV2ExternalAccountLineItemsByAccountId**](CampaignApi.md#getApiV2ExternalAccountLineItemsByAccountId) | **GET** /2021-07/retail-media/accounts/{account-id}/line-items |  |
| [**getApiV2ExternalAuctionLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalAuctionLineItemByLineItemId) | **GET** /2021-07/retail-media/auction-line-items/{line-item-id} |  |
| [**getApiV2ExternalCampaignAuctionLineItemsByCampaignId**](CampaignApi.md#getApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **GET** /2021-07/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**getApiV2ExternalLineItemByLineItemId**](CampaignApi.md#getApiV2ExternalLineItemByLineItemId) | **GET** /2021-07/retail-media/line-items/{line-item-id} |  |
| [**postApiV1ExternalAccountCampaignsByAccountId**](CampaignApi.md#postApiV1ExternalAccountCampaignsByAccountId) | **POST** /2021-07/retail-media/accounts/{accountId}/campaigns |  |
| [**postApiV1ExternalAccountCatalogsByAccountId**](CampaignApi.md#postApiV1ExternalAccountCatalogsByAccountId) | **POST** /2021-07/retail-media/accounts/{accountId}/catalogs |  |
| [**postApiV2ExternalCampaignAuctionLineItemsByCampaignId**](CampaignApi.md#postApiV2ExternalCampaignAuctionLineItemsByCampaignId) | **POST** /2021-07/retail-media/campaigns/{campaign-id}/auction-line-items |  |
| [**putApiV1ExternalCampaignByCampaignId**](CampaignApi.md#putApiV1ExternalCampaignByCampaignId) | **PUT** /2021-07/retail-media/campaigns/{campaignId} |  |
| [**putApiV2ExternalAuctionLineItemByLineItemId**](CampaignApi.md#putApiV2ExternalAuctionLineItemByLineItemId) | **PUT** /2021-07/retail-media/auction-line-items/{line-item-id} |  |



## getApiV1ExternalAccountBrandsByAccountId

> JsonApiPageResponseOfBrand getApiV1ExternalAccountBrandsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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


## getApiV1ExternalAccountCampaignsByAccountId

> JsonApiPageResponseOfCampaign getApiV1ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of campaign objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
            JsonApiPageResponseOfCampaign result = apiInstance.getApiV1ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountCampaignsByAccountId");
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

[**JsonApiPageResponseOfCampaign**](JsonApiPageResponseOfCampaign.md)

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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


## getApiV1ExternalCampaignByCampaignId

> JsonApiSingleResponseOfCampaign getApiV1ExternalCampaignByCampaignId(campaignId)



Gets the campaign for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
        try {
            JsonApiSingleResponseOfCampaign result = apiInstance.getApiV1ExternalCampaignByCampaignId(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getApiV1ExternalCampaignByCampaignId");
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

[**JsonApiSingleResponseOfCampaign**](JsonApiSingleResponseOfCampaign.md)

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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


## postApiV1ExternalAccountCampaignsByAccountId

> JsonApiSingleResponseOfCampaign postApiV1ExternalAccountCampaignsByAccountId(accountId, externalPostCampaign)



Creates a new campaign with the specified settings

### Example

```java
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
        ExternalPostCampaign externalPostCampaign = new ExternalPostCampaign(); // ExternalPostCampaign | The campaign settings to create a campaign with
        try {
            JsonApiSingleResponseOfCampaign result = apiInstance.postApiV1ExternalAccountCampaignsByAccountId(accountId, externalPostCampaign);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#postApiV1ExternalAccountCampaignsByAccountId");
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
| **externalPostCampaign** | [**ExternalPostCampaign**](ExternalPostCampaign.md)| The campaign settings to create a campaign with | [optional] |

### Return type

[**JsonApiSingleResponseOfCampaign**](JsonApiSingleResponseOfCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Success |  -  |


## postApiV1ExternalAccountCatalogsByAccountId

> JsonApiSingleResponseOfCatalogStatus postApiV1ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequest)



Create a request for a Catalog available to the indicated account.

### Example

```java
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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


## putApiV1ExternalCampaignByCampaignId

> JsonApiSingleResponseOfCampaign putApiV1ExternalCampaignByCampaignId(campaignId, externalPutCampaign)



Updates the campaign for the given campaign id

### Example

```java
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
        ExternalPutCampaign externalPutCampaign = new ExternalPutCampaign(); // ExternalPutCampaign | The campaign settings to update that campaign with
        try {
            JsonApiSingleResponseOfCampaign result = apiInstance.putApiV1ExternalCampaignByCampaignId(campaignId, externalPutCampaign);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#putApiV1ExternalCampaignByCampaignId");
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
| **externalPutCampaign** | [**ExternalPutCampaign**](ExternalPutCampaign.md)| The campaign settings to update that campaign with | [optional] |

### Return type

[**JsonApiSingleResponseOfCampaign**](JsonApiSingleResponseOfCampaign.md)

### Authorization

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2021_07;

import com.criteo.api.retailmedia.v2021_07.ApiClient;
import com.criteo.api.retailmedia.v2021_07.ApiException;
import com.criteo.api.retailmedia.v2021_07.Configuration;
import com.criteo.api.retailmedia.v2021_07.auth.*;
import com.criteo.api.retailmedia.v2021_07.model.*;
import com.criteo.api.retailmedia.v2021_07.api.CampaignApi;

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
