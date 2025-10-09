# AccountsApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountFeesSearch**](AccountsApi.md#accountFeesSearch) | **POST** /preview/retail-media/accounts/fees/search |  |
| [**getPrivateMarketChildAccountsByAccountId**](AccountsApi.md#getPrivateMarketChildAccountsByAccountId) | **GET** /preview/retail-media/account-management/accounts/{accountId}/private-market-child-accounts |  |
| [**updateAccountFees**](AccountsApi.md#updateAccountFees) | **POST** /preview/retail-media/accounts/fees/update |  |



## accountFeesSearch

> ValueResourceCollectionOutcomePrivateMarketAccountFeesAndMetadata accountFeesSearch(limit, offset, valueResourceInputAccountFeesSearchRequest)



Get fees for provided accounts

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.AccountsApi;

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
        Integer limit = 50; // Integer | used for paging, number of results returned per request, Maximum of 500
        Integer offset = 0; // Integer | used for paging, number of records to skip
        ValueResourceInputAccountFeesSearchRequest valueResourceInputAccountFeesSearchRequest = new ValueResourceInputAccountFeesSearchRequest(); // ValueResourceInputAccountFeesSearchRequest | 
        try {
            ValueResourceCollectionOutcomePrivateMarketAccountFeesAndMetadata result = apiInstance.accountFeesSearch(limit, offset, valueResourceInputAccountFeesSearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#accountFeesSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| used for paging, number of results returned per request, Maximum of 500 | [optional] [default to 50] |
| **offset** | **Integer**| used for paging, number of records to skip | [optional] [default to 0] |
| **valueResourceInputAccountFeesSearchRequest** | [**ValueResourceInputAccountFeesSearchRequest**](ValueResourceInputAccountFeesSearchRequest.md)|  | [optional] |

### Return type

[**ValueResourceCollectionOutcomePrivateMarketAccountFeesAndMetadata**](ValueResourceCollectionOutcomePrivateMarketAccountFeesAndMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPrivateMarketChildAccountsByAccountId

> EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata getPrivateMarketChildAccountsByAccountId(accountId, limit, offset)



Gets page of private market child accounts that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | Account Id
        Integer limit = 25; // Integer | The number of accounts to be returned. The default is 25.
        Integer offset = 0; // Integer | The (zero-based) offset into the collection of accounts. The default is 0.
        try {
            EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata result = apiInstance.getPrivateMarketChildAccountsByAccountId(accountId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getPrivateMarketChildAccountsByAccountId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Account Id | |
| **limit** | **Integer**| The number of accounts to be returned. The default is 25. | [optional] [default to 25] |
| **offset** | **Integer**| The (zero-based) offset into the collection of accounts. The default is 0. | [optional] [default to 0] |

### Return type

[**EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata**](EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateAccountFees

> updateAccountFees(valueResourceInputAccountFeesUpdateRequest)



Set fees for provided accounts

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.AccountsApi;

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
        ValueResourceInputAccountFeesUpdateRequest valueResourceInputAccountFeesUpdateRequest = new ValueResourceInputAccountFeesUpdateRequest(); // ValueResourceInputAccountFeesUpdateRequest | 
        try {
            apiInstance.updateAccountFees(valueResourceInputAccountFeesUpdateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#updateAccountFees");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **valueResourceInputAccountFeesUpdateRequest** | [**ValueResourceInputAccountFeesUpdateRequest**](ValueResourceInputAccountFeesUpdateRequest.md)|  | [optional] |

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

