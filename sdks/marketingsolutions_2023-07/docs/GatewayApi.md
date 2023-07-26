# GatewayApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentApplication**](GatewayApi.md#getCurrentApplication) | **GET** /2023-07/marketing-solutions/me |  |



## getCurrentApplication

> ApplicationSummaryModelResponse getCurrentApplication()



Get information about the currently logged application

### Example

```java
package com.criteo.api.marketingsolutions.v2023_07;

import com.criteo.api.marketingsolutions.v2023_07.ApiClient;
import com.criteo.api.marketingsolutions.v2023_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_07.ApiException;
import com.criteo.api.marketingsolutions.v2023_07.Configuration;
import com.criteo.api.marketingsolutions.v2023_07.auth.*;
import com.criteo.api.marketingsolutions.v2023_07.model.*;
import com.criteo.api.marketingsolutions.v2023_07.api.GatewayApi;

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

        GatewayApi apiInstance = new GatewayApi(defaultClient);
        try {
            ApplicationSummaryModelResponse result = apiInstance.getCurrentApplication();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GatewayApi#getCurrentApplication");
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

[**ApplicationSummaryModelResponse**](ApplicationSummaryModelResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

