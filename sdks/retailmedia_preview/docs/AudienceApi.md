# AudienceApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAudiencesByAccountId**](AudienceApi.md#getAudiencesByAccountId) | **GET** /preview/retail-media/accounts/{accountId}/audiences |  |
| [**getRetailMediaAudienceV2ListByAccountId**](AudienceApi.md#getRetailMediaAudienceV2ListByAccountId) | **GET** /preview/retail-media/v2/accounts/{accountId}/audiences |  |



## getAudiencesByAccountId

> GetPageOfAudiencesByAccountIdResponse getAudiencesByAccountId(accountId, limitToId, pageSize, pageIndex)



Get a page of audiences for a given account ID

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        String accountId = "accountId_example"; // String | External account ID which owns audience.
        List<String> limitToId = Arrays.asList(); // List<String> | Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId=1&limitToId=2
        Integer pageSize = 56; // Integer | Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page
        Integer pageIndex = 56; // Integer | Returns the specified page of results given a pageSize; pages are 0-indexed
        try {
            GetPageOfAudiencesByAccountIdResponse result = apiInstance.getAudiencesByAccountId(accountId, limitToId, pageSize, pageIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#getAudiencesByAccountId");
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
| **accountId** | **String**| External account ID which owns audience. | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 | [optional] |
| **pageSize** | **Integer**| Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page | [optional] |
| **pageIndex** | **Integer**| Returns the specified page of results given a pageSize; pages are 0-indexed | [optional] |

### Return type

[**GetPageOfAudiencesByAccountIdResponse**](GetPageOfAudiencesByAccountIdResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A page of audiences for the supplied account. |  -  |
| **400** | Missing or invalid account ID. |  -  |
| **404** | The audience was not found. |  -  |
| **406** | The Accept header must contain application/json. |  -  |
| **415** | The Content-Type header must be application/json if present. |  -  |


## getRetailMediaAudienceV2ListByAccountId

> RetailMediaAudienceV2ListResponse getRetailMediaAudienceV2ListByAccountId(accountId, limitToId, pageSize, pageIndex)



Get a page of audiences for a given account ID

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        Long accountId = 56L; // Long | External account ID which owns audience.
        List<Long> limitToId = Arrays.asList(); // List<Long> | Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId=1&limitToId=2
        Integer pageSize = 56; // Integer | Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page
        Integer pageIndex = 56; // Integer | Returns the specified page of results given a pageSize; pages are 0-indexed
        try {
            RetailMediaAudienceV2ListResponse result = apiInstance.getRetailMediaAudienceV2ListByAccountId(accountId, limitToId, pageSize, pageIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#getRetailMediaAudienceV2ListByAccountId");
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
| **accountId** | **Long**| External account ID which owns audience. | |
| **limitToId** | [**List&lt;Long&gt;**](Long.md)| Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 | [optional] |
| **pageSize** | **Integer**| Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page | [optional] |
| **pageIndex** | **Integer**| Returns the specified page of results given a pageSize; pages are 0-indexed | [optional] |

### Return type

[**RetailMediaAudienceV2ListResponse**](RetailMediaAudienceV2ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A page of audiences for the supplied account. |  -  |
| **403** | Missing or invalid account ID. - OR - You do not have permission to access this account. |  -  |
| **406** | The Accept header must contain application/json. |  -  |
| **415** | The Content-Type header must be application/json if present. |  -  |

