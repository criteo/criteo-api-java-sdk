# OAuthApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](OAuthApi.md#getToken) | **POST** /oauth2/token | Creates a token based either on supplied client credentials or on single use authorization code |



## getToken

> AccessTokenModel getToken(grantType, clientId, clientSecret, redirectUri, code, refreshToken)

Creates a token based either on supplied client credentials or on single use authorization code

Creates a token when the supplied client credentials are valid

### Example

```java
package com.criteo.api.marketingsolutions.v2022_01;

import com.criteo.api.marketingsolutions.v2022_01.ApiClient;
import com.criteo.api.marketingsolutions.v2022_01.ApiException;
import com.criteo.api.marketingsolutions.v2022_01.Configuration;
import com.criteo.api.marketingsolutions.v2022_01.auth.*;
import com.criteo.api.marketingsolutions.v2022_01.model.*;
import com.criteo.api.marketingsolutions.v2022_01.api.OAuthApi;

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

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String grantType = "grantType_example"; // String | 
        String clientId = "clientId_example"; // String | 
        String clientSecret = "clientSecret_example"; // String | 
        String redirectUri = "redirectUri_example"; // String | 
        String code = "code_example"; // String | 
        String refreshToken = "refreshToken_example"; // String | 
        try {
            AccessTokenModel result = apiInstance.getToken(grantType, clientId, clientSecret, redirectUri, code, refreshToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#getToken");
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
| **grantType** | **String**|  | |
| **clientId** | **String**|  | |
| **clientSecret** | **String**|  | |
| **redirectUri** | **String**|  | [optional] |
| **code** | **String**|  | [optional] |
| **refreshToken** | **String**|  | [optional] |

### Return type

[**AccessTokenModel**](AccessTokenModel.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

