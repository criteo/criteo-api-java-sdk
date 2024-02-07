# AudienceApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**legacyGetAudienceV1**](AudienceApi.md#legacyGetAudienceV1) | **GET** /preview/retail-media/accounts/{accountId}/audiences |  |
| [**legacyGetAudienceV2**](AudienceApi.md#legacyGetAudienceV2) | **GET** /preview/retail-media/v2/accounts/{accountId}/audiences |  |



## legacyGetAudienceV1

> RmLegacyAudienceGetEntityV1ListResponse legacyGetAudienceV1(accountId, limitToId, pageSize, pageIndex)



Get a page of Audiences. (deprecated Public API)

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
        Long accountId = 56L; // Long | ID of the account to which this audience belongs.
        List<Integer> limitToId = Arrays.asList(); // List<Integer> | Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId=1&limitToId=2
        Integer pageSize = 56; // Integer | Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page.
        Integer pageIndex = 56; // Integer | Returns the specified page of results given a pageSize; pages are 0-indexed.
        try {
            RmLegacyAudienceGetEntityV1ListResponse result = apiInstance.legacyGetAudienceV1(accountId, limitToId, pageSize, pageIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#legacyGetAudienceV1");
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
| **accountId** | **Long**| ID of the account to which this audience belongs. | |
| **limitToId** | [**List&lt;Integer&gt;**](Integer.md)| Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 | [optional] |
| **pageSize** | **Integer**| Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. | [optional] |
| **pageIndex** | **Integer**| Returns the specified page of results given a pageSize; pages are 0-indexed. | [optional] |

### Return type

[**RmLegacyAudienceGetEntityV1ListResponse**](RmLegacyAudienceGetEntityV1ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A page of audiences for the supplied account or shared by related retailers. |  -  |
| **400** | Bad request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource. |  -  |


## legacyGetAudienceV2

> RmLegacyAudienceGetEntityV2ListResponse legacyGetAudienceV2(accountId, limitToId, pageSize, pageIndex)



Get a page of Audiences. (deprecated Public API)

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
        Long accountId = 56L; // Long | ID of the account to which this audience belongs.
        List<Integer> limitToId = Arrays.asList(); // List<Integer> | Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId=1&limitToId=2
        Integer pageSize = 56; // Integer | Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page.
        Integer pageIndex = 56; // Integer | Returns the specified page of results given a pageSize; pages are 0-indexed.
        try {
            RmLegacyAudienceGetEntityV2ListResponse result = apiInstance.legacyGetAudienceV2(accountId, limitToId, pageSize, pageIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#legacyGetAudienceV2");
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
| **accountId** | **Long**| ID of the account to which this audience belongs. | |
| **limitToId** | [**List&lt;Integer&gt;**](Integer.md)| Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 | [optional] |
| **pageSize** | **Integer**| Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. | [optional] |
| **pageIndex** | **Integer**| Returns the specified page of results given a pageSize; pages are 0-indexed. | [optional] |

### Return type

[**RmLegacyAudienceGetEntityV2ListResponse**](RmLegacyAudienceGetEntityV2ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A page of audiences for the supplied account or shared by related retailers. |  -  |
| **400** | Bad request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource. |  -  |

