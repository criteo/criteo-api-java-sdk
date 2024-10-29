# BalanceApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApi202110ExternalBalanceCampaignsByBalanceId**](BalanceApi.md#getApi202110ExternalBalanceCampaignsByBalanceId) | **GET** /2024-04/retail-media/balances/{balance-id}/campaigns |  |
| [**getApiV1ExternalAccountBalancesByAccountId**](BalanceApi.md#getApiV1ExternalAccountBalancesByAccountId) | **GET** /2024-04/retail-media/accounts/{account-id}/balances |  |
| [**getApiV1ExternalAccountByAccountIdAndBalanceId**](BalanceApi.md#getApiV1ExternalAccountByAccountIdAndBalanceId) | **GET** /2024-04/retail-media/accounts/{account-id}/balances/{balanceId} |  |
| [**patchApiV1ExternalAccountByAccountIdAndBalanceId**](BalanceApi.md#patchApiV1ExternalAccountByAccountIdAndBalanceId) | **PATCH** /2024-04/retail-media/accounts/{account-id}/balances/{balanceId} |  |
| [**postApiV1ExternalAccountAddFundsByAccountIdAndBalanceId**](BalanceApi.md#postApiV1ExternalAccountAddFundsByAccountIdAndBalanceId) | **POST** /2024-04/retail-media/accounts/{account-id}/balances/{balanceId}/add-funds |  |
| [**postApiV1ExternalAccountBalancesByAccountId**](BalanceApi.md#postApiV1ExternalAccountBalancesByAccountId) | **POST** /2024-04/retail-media/accounts/{account-id}/balances |  |
| [**postApiV1ExternalAccountChangeDatesByAccountIdAndBalanceId**](BalanceApi.md#postApiV1ExternalAccountChangeDatesByAccountIdAndBalanceId) | **POST** /2024-04/retail-media/accounts/{account-id}/balances/{balanceId}/change-dates |  |



## getApi202110ExternalBalanceCampaignsByBalanceId

> BalanceCampaign202110PagedListResponse getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize)



Gets page of campaigns for the given balanceId

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            BalanceCampaign202110PagedListResponse result = apiInstance.getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApi202110ExternalBalanceCampaignsByBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccountBalancesByAccountId

> BalanceResponsePagedListResponse getApiV1ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize)



Get page of balances for the given accountId.

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        String accountId = "accountId_example"; // String | The account to get page of balances for
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            BalanceResponsePagedListResponse result = apiInstance.getApiV1ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApiV1ExternalAccountBalancesByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account to get page of balances for | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**BalanceResponsePagedListResponse**](BalanceResponsePagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV1ExternalAccountByAccountIdAndBalanceId

> BalanceResponse getApiV1ExternalAccountByAccountIdAndBalanceId(accountId, balanceId)



Get a balance for the given account id and balance id

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        String balanceId = "balanceId_example"; // String | The balance id
        try {
            BalanceResponse result = apiInstance.getApiV1ExternalAccountByAccountIdAndBalanceId(accountId, balanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApiV1ExternalAccountByAccountIdAndBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **balanceId** | **String**| The balance id | |

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## patchApiV1ExternalAccountByAccountIdAndBalanceId

> BalanceResponse patchApiV1ExternalAccountByAccountIdAndBalanceId(accountId, balanceId, updateBalanceModelRequest)



Modify a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        UpdateBalanceModelRequest updateBalanceModelRequest = new UpdateBalanceModelRequest(); // UpdateBalanceModelRequest | 
        try {
            BalanceResponse result = apiInstance.patchApiV1ExternalAccountByAccountIdAndBalanceId(accountId, balanceId, updateBalanceModelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#patchApiV1ExternalAccountByAccountIdAndBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **updateBalanceModelRequest** | [**UpdateBalanceModelRequest**](UpdateBalanceModelRequest.md)|  | [optional] |

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApiV1ExternalAccountAddFundsByAccountIdAndBalanceId

> BalanceResponse postApiV1ExternalAccountAddFundsByAccountIdAndBalanceId(accountId, balanceId, addFundsToBalanceRequest)



Add funds to a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        String balanceId = "balanceId_example"; // String | The balance to add funds to
        AddFundsToBalanceRequest addFundsToBalanceRequest = new AddFundsToBalanceRequest(); // AddFundsToBalanceRequest | 
        try {
            BalanceResponse result = apiInstance.postApiV1ExternalAccountAddFundsByAccountIdAndBalanceId(accountId, balanceId, addFundsToBalanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#postApiV1ExternalAccountAddFundsByAccountIdAndBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **balanceId** | **String**| The balance to add funds to | |
| **addFundsToBalanceRequest** | [**AddFundsToBalanceRequest**](AddFundsToBalanceRequest.md)|  | [optional] |

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApiV1ExternalAccountBalancesByAccountId

> BalanceResponse postApiV1ExternalAccountBalancesByAccountId(accountId, createBalanceRequest)



Create balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        CreateBalanceRequest createBalanceRequest = new CreateBalanceRequest(); // CreateBalanceRequest | 
        try {
            BalanceResponse result = apiInstance.postApiV1ExternalAccountBalancesByAccountId(accountId, createBalanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#postApiV1ExternalAccountBalancesByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **createBalanceRequest** | [**CreateBalanceRequest**](CreateBalanceRequest.md)|  | [optional] |

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## postApiV1ExternalAccountChangeDatesByAccountIdAndBalanceId

> BalanceResponse postApiV1ExternalAccountChangeDatesByAccountIdAndBalanceId(accountId, balanceId, changeDatesOfBalanceRequest)



Change dates of a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.BalanceApi;

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
        ChangeDatesOfBalanceRequest changeDatesOfBalanceRequest = new ChangeDatesOfBalanceRequest(); // ChangeDatesOfBalanceRequest | 
        try {
            BalanceResponse result = apiInstance.postApiV1ExternalAccountChangeDatesByAccountIdAndBalanceId(accountId, balanceId, changeDatesOfBalanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#postApiV1ExternalAccountChangeDatesByAccountIdAndBalanceId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **changeDatesOfBalanceRequest** | [**ChangeDatesOfBalanceRequest**](ChangeDatesOfBalanceRequest.md)|  | [optional] |

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

