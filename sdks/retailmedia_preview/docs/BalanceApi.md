# BalanceApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBalanceByAccountId**](BalanceApi.md#createBalanceByAccountId) | **POST** /preview/retail-media/accounts/{account-id}/balances |  |
| [**getBalanceHistory**](BalanceApi.md#getBalanceHistory) | **GET** /preview/retail-media/balances/{balanceId}/history |  |
| [**getBalancesByAccountId**](BalanceApi.md#getBalancesByAccountId) | **GET** /preview/retail-media/accounts/{account-id}/balances |  |
| [**getCampaignsByBalanceId**](BalanceApi.md#getCampaignsByBalanceId) | **GET** /preview/retail-media/balances/{balance-id}/campaigns |  |
| [**updateBalanceV2**](BalanceApi.md#updateBalanceV2) | **PATCH** /preview/retail-media/accounts/{account-id}/balances/{balance-id} |  |



## createBalanceByAccountId

> createBalanceByAccountId(accountId, valueResourceInputOfCreateBalanceV1)



Create balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to create balances for
        ValueResourceInputOfCreateBalanceV1 valueResourceInputOfCreateBalanceV1 = new ValueResourceInputOfCreateBalanceV1(); // ValueResourceInputOfCreateBalanceV1 | An object that represents the available options to set when creating a Retail Media Balance
        try {
            apiInstance.createBalanceByAccountId(accountId, valueResourceInputOfCreateBalanceV1);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#createBalanceByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to create balances for | |
| **valueResourceInputOfCreateBalanceV1** | [**ValueResourceInputOfCreateBalanceV1**](ValueResourceInputOfCreateBalanceV1.md)| An object that represents the available options to set when creating a Retail Media Balance | |

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
| **201** | Success |  -  |


## getBalanceHistory

> PageOfBalanceHistoryChangeDataCaptureV1 getBalanceHistory(balanceId, limit, limitToChangeTypes, offset)



Gets the balance&#39;s historical change data.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String balanceId = "balanceId_example"; // String | Balance id.
        Integer limit = 25; // Integer | The number of elements to be returned.
        String limitToChangeTypes = "limitToChangeTypes_example"; // String | Comma separated change types string that will be queried.
        Integer offset = 0; // Integer | The (zero-based) starting offset in the collection.
        try {
            PageOfBalanceHistoryChangeDataCaptureV1 result = apiInstance.getBalanceHistory(balanceId, limit, limitToChangeTypes, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getBalanceHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **balanceId** | **String**| Balance id. | |
| **limit** | **Integer**| The number of elements to be returned. | [optional] [default to 25] |
| **limitToChangeTypes** | **String**| Comma separated change types string that will be queried. | [optional] |
| **offset** | **Integer**| The (zero-based) starting offset in the collection. | [optional] [default to 0] |

### Return type

[**PageOfBalanceHistoryChangeDataCaptureV1**](PageOfBalanceHistoryChangeDataCaptureV1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getBalancesByAccountId

> EntityResourceCollectionOutcomeOfBalanceResponseV1AndPageMeta getBalancesByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of balance objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to get balances for
        List<Long> limitToId = Arrays.asList(); // List<Long> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            EntityResourceCollectionOutcomeOfBalanceResponseV1AndPageMeta result = apiInstance.getBalancesByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getBalancesByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **limitToId** | [**List&lt;Long&gt;**](Long.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**EntityResourceCollectionOutcomeOfBalanceResponseV1AndPageMeta**](EntityResourceCollectionOutcomeOfBalanceResponseV1AndPageMeta.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCampaignsByBalanceId

> EntityResourceCollectionOutcomeOfBalanceCampaignV1AndPageMeta getCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize)



Gets page of campaigns for the given balanceId

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String balanceId = "balanceId_example"; // String | The balance to get campaigns from
        List<Long> limitToId = Arrays.asList(); // List<Long> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            EntityResourceCollectionOutcomeOfBalanceCampaignV1AndPageMeta result = apiInstance.getCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getCampaignsByBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **limitToId** | [**List&lt;Long&gt;**](Long.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**EntityResourceCollectionOutcomeOfBalanceCampaignV1AndPageMeta**](EntityResourceCollectionOutcomeOfBalanceCampaignV1AndPageMeta.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateBalanceV2

> updateBalanceV2(accountId, balanceId, valueResourceInputOfUpdateBalanceModelV1)



Modify a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account of the balance
        String balanceId = "balanceId_example"; // String | The balance to change the dates
        ValueResourceInputOfUpdateBalanceModelV1 valueResourceInputOfUpdateBalanceModelV1 = new ValueResourceInputOfUpdateBalanceModelV1(); // ValueResourceInputOfUpdateBalanceModelV1 | An object that represents the available options to modify a balance.
        try {
            apiInstance.updateBalanceV2(accountId, balanceId, valueResourceInputOfUpdateBalanceModelV1);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#updateBalanceV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account of the balance | |
| **balanceId** | **String**| The balance to change the dates | |
| **valueResourceInputOfUpdateBalanceModelV1** | [**ValueResourceInputOfUpdateBalanceModelV1**](ValueResourceInputOfUpdateBalanceModelV1.md)| An object that represents the available options to modify a balance. | |

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
| **200** | Success |  -  |

