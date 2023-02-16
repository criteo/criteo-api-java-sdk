# AdvertiserApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPortfolioGet**](AdvertiserApi.md#apiPortfolioGet) | **GET** /preview/advertisers/me |  |
| [**createAdvertiser**](AdvertiserApi.md#createAdvertiser) | **POST** /preview/advertisers |  |
| [**getDatasetList**](AdvertiserApi.md#getDatasetList) | **GET** /preview/advertisers/{advertiser-id}/datasets |  |
| [**listIndustries**](AdvertiserApi.md#listIndustries) | **GET** /preview/industries |  |



## apiPortfolioGet

> GetPortfolioResponse apiPortfolioGet()



Fetch the portfolio of Advertisers for this account

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

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

        AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
        try {
            GetPortfolioResponse result = apiInstance.apiPortfolioGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertiserApi#apiPortfolioGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetPortfolioResponse**](GetPortfolioResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |


## createAdvertiser

> AdvertiserCreationResponse createAdvertiser(advertiserCreationRequest)



Create a new advertiser based on provided parameters. This could take up to 30 seconds.

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

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

        AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
        AdvertiserCreationRequest advertiserCreationRequest = new AdvertiserCreationRequest(); // AdvertiserCreationRequest | 
        try {
            AdvertiserCreationResponse result = apiInstance.createAdvertiser(advertiserCreationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertiserApi#createAdvertiser");
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
| **advertiserCreationRequest** | [**AdvertiserCreationRequest**](AdvertiserCreationRequest.md)|  | |

### Return type

[**AdvertiserCreationResponse**](AdvertiserCreationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json, text/plain, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Server Error |  -  |


## getDatasetList

> AdvertiserDatasetListResponse getDatasetList(advertiserId)



Retrieves corresponding Datasets for a given Advertiser. Only those Datasets are included for which the given Advertiser is marked a primary.

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

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

        AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The id of the Advertiser for which Datasets are being retrieved.
        try {
            AdvertiserDatasetListResponse result = apiInstance.getDatasetList(advertiserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertiserApi#getDatasetList");
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
| **advertiserId** | **String**| The id of the Advertiser for which Datasets are being retrieved. | |

### Return type

[**AdvertiserDatasetListResponse**](AdvertiserDatasetListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |


## listIndustries

> ListAvailableIndustriesResponse listIndustries()



Returns the list of available industries for new advertisers.

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

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

        AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
        try {
            ListAvailableIndustriesResponse result = apiInstance.listIndustries();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertiserApi#listIndustries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListAvailableIndustriesResponse**](ListAvailableIndustriesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

