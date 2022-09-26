# GatewayApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentApplication**](GatewayApi.md#getCurrentApplication) | **GET** /me |  |



## getCurrentApplication

> ApplicationSummaryModelResponse getCurrentApplication()



Get information about the currently logged application

### Example

```java
package com.criteo.api.marketingsolutions.v2022_04;

import com.criteo.api.marketingsolutions.v2022_04.ApiClient;
import com.criteo.api.marketingsolutions.v2022_04.ApiException;
import com.criteo.api.marketingsolutions.v2022_04.Configuration;
import com.criteo.api.marketingsolutions.v2022_04.auth.*;
import com.criteo.api.marketingsolutions.v2022_04.model.*;
import com.criteo.api.marketingsolutions.v2022_04.api.GatewayApi;

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

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

