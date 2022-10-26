# AdvertiserApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPortfolioGet**](AdvertiserApi.md#apiPortfolioGet) | **GET** /2022-10/advertisers/me |  |



## apiPortfolioGet

> GetPortfolioResponse apiPortfolioGet()



Fetch the portfolio of Advertisers for this account

### Example

```java
package com.criteo.api.marketingsolutions.v2022_10;

import com.criteo.api.marketingsolutions.v2022_10.ApiClient;
import com.criteo.api.marketingsolutions.v2022_10.ApiException;
import com.criteo.api.marketingsolutions.v2022_10.Configuration;
import com.criteo.api.marketingsolutions.v2022_10.auth.*;
import com.criteo.api.marketingsolutions.v2022_10.model.*;
import com.criteo.api.marketingsolutions.v2022_10.api.AdvertiserApi;

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

