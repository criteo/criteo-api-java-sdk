# AudienceApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAudience**](AudienceApi.md#createAudience) | **POST** /2023-07/retail-media/accounts/{accountId}/audiences |  |
| [**createRetailMediaAudienceV2**](AudienceApi.md#createRetailMediaAudienceV2) | **POST** /2023-07/retail-media/v2/accounts/{accountId}/audiences |  |
| [**getAudiencesByAccountId**](AudienceApi.md#getAudiencesByAccountId) | **GET** /2023-07/retail-media/accounts/{accountId}/audiences |  |
| [**getRetailMediaAudienceV2ListByAccountId**](AudienceApi.md#getRetailMediaAudienceV2ListByAccountId) | **GET** /2023-07/retail-media/v2/accounts/{accountId}/audiences |  |



## createAudience

> CreateRetailMediaAudienceResponse createAudience(accountId, createRetailMediaAudienceRequest)



Create an audience for a given account ID

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AudienceApi;

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
        CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest = new CreateRetailMediaAudienceRequest(); // CreateRetailMediaAudienceRequest | 
        try {
            CreateRetailMediaAudienceResponse result = apiInstance.createAudience(accountId, createRetailMediaAudienceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#createAudience");
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
| **createRetailMediaAudienceRequest** | [**CreateRetailMediaAudienceRequest**](CreateRetailMediaAudienceRequest.md)|  | |

### Return type

[**CreateRetailMediaAudienceResponse**](CreateRetailMediaAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The audience that was just created. |  -  |
| **400** | Missing or invalid account ID. - OR - Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buy&#39;, &#39;view&#39;. - OR - The retailerTaxonomyIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackDays field.  Valid values are: 7, 14,  30, 45, 60, 90, 120, 150 or 180. - OR - Exactly one of retailerTaxonomyIds or globalBrandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - The globalBrandIds is not a valid list of IDs or may contain more than 100 elements. |  -  |
| **404** | The audience was not found. - OR - You do not have permission to access these global brands. |  -  |
| **406** | The Accept header must contain application/json. |  -  |
| **409** | An audience name should be unique per account. |  -  |
| **415** | The Content-Type header must be application/json if present. |  -  |


## createRetailMediaAudienceV2

> RetailMediaAudienceV2Response createRetailMediaAudienceV2(accountId, createRetailMediaAudienceV2Request)



Create an audience for a given account ID

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AudienceApi;

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
        CreateRetailMediaAudienceV2Request createRetailMediaAudienceV2Request = new CreateRetailMediaAudienceV2Request(); // CreateRetailMediaAudienceV2Request | 
        try {
            RetailMediaAudienceV2Response result = apiInstance.createRetailMediaAudienceV2(accountId, createRetailMediaAudienceV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#createRetailMediaAudienceV2");
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
| **createRetailMediaAudienceV2Request** | [**CreateRetailMediaAudienceV2Request**](CreateRetailMediaAudienceV2Request.md)|  | |

### Return type

[**RetailMediaAudienceV2Response**](RetailMediaAudienceV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The audience that was just created. |  -  |
| **400** | Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buyer&#39;, &#39;viewer&#39;. - OR - The brandIds is not a valid list of IDs or may contain more than 100 elements. - OR - The categoryIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackWindow field. Valid values are: P7D, P14D, P30D, P45D, P60D, P90D, P120D, P150D or P180D. - OR - Exactly one of categoryIds or brandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - Missing or invalid userAction field. Valid values are: &#39;buy&#39;, &#39;view&#39;, &#39;addToCart&#39;. |  -  |
| **403** | Missing or invalid account ID. |  -  |
| **406** | The Accept header must contain application/json. |  -  |
| **409** | An audience name should be unique per account. |  -  |
| **415** | The Content-Type header must be application/json if present. |  -  |


## getAudiencesByAccountId

> GetPageOfAudiencesByAccountIdResponse getAudiencesByAccountId(accountId, limitToId, pageSize, pageIndex)



Get a page of audiences for a given account ID

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AudienceApi;

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
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AudienceApi;

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

