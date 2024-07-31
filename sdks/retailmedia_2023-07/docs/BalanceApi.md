# BalanceApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApi202110ExternalAccountBalancesByAccountId**](BalanceApi.md#getApi202110ExternalAccountBalancesByAccountId) | **GET** /2023-07/retail-media/accounts/{account-id}/balances |  |
| [**getApi202110ExternalBalanceCampaignsByBalanceId**](BalanceApi.md#getApi202110ExternalBalanceCampaignsByBalanceId) | **GET** /2023-07/retail-media/balances/{balance-id}/campaigns |  |



## getApi202110ExternalAccountBalancesByAccountId

> Balance202110PagedListResponse getApi202110ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of balance objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.BalanceApi;

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
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            Balance202110PagedListResponse result = apiInstance.getApi202110ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApi202110ExternalAccountBalancesByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApi202110ExternalBalanceCampaignsByBalanceId

> BalanceCampaign202110PagedListResponse getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize)



Gets page of campaigns for the given balanceId

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.BalanceApi;

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

