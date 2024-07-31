# AccountsApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1ExternalAccounts**](AccountsApi.md#getApiV1ExternalAccounts) | **GET** /2023-07/retail-media/accounts |  |



## getApiV1ExternalAccounts

> JsonApiPageResponseOfAccount getApiV1ExternalAccounts(limitToId, pageIndex, pageSize)



Gets page of account objects that the current user can access

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AccountsApi;

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

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            JsonApiPageResponseOfAccount result = apiInstance.getApiV1ExternalAccounts(limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getApiV1ExternalAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**JsonApiPageResponseOfAccount**](JsonApiPageResponseOfAccount.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

