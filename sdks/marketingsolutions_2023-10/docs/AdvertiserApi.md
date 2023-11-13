# AdvertiserApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPortfolioGet**](AdvertiserApi.md#apiPortfolioGet) | **GET** /2023-10/advertisers/me |  |



## apiPortfolioGet

> GetPortfolioResponse apiPortfolioGet()



Fetch the portfolio of Advertisers for this account

### Example

```java
package com.criteo.api.marketingsolutions.v2023_10;

import com.criteo.api.marketingsolutions.v2023_10.ApiClient;
import com.criteo.api.marketingsolutions.v2023_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_10.ApiException;
import com.criteo.api.marketingsolutions.v2023_10.Configuration;
import com.criteo.api.marketingsolutions.v2023_10.auth.*;
import com.criteo.api.marketingsolutions.v2023_10.model.*;
import com.criteo.api.marketingsolutions.v2023_10.api.AdvertiserApi;

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

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

