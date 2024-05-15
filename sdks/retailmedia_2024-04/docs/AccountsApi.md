# AccountsApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBrands**](AccountsApi.md#addBrands) | **POST** /2024-04/retail-media/account-management/accounts/{accountId}/brands/add |  |
| [**createPrivateMarketDemandBrandAccount**](AccountsApi.md#createPrivateMarketDemandBrandAccount) | **POST** /2024-04/retail-media/account-management/accounts/{accountId}/create-brand-account |  |
| [**removeBrands**](AccountsApi.md#removeBrands) | **POST** /2024-04/retail-media/account-management/accounts/{accountId}/brands/remove |  |



## addBrands

> ValueResourceOfRetailMediaBrands addBrands(accountId, valueResourceInputOfRetailMediaBrands)



Add brands to an account

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | the account id to update
        ValueResourceInputOfRetailMediaBrands valueResourceInputOfRetailMediaBrands = new ValueResourceInputOfRetailMediaBrands(); // ValueResourceInputOfRetailMediaBrands | brands to associate to account
        try {
            ValueResourceOfRetailMediaBrands result = apiInstance.addBrands(accountId, valueResourceInputOfRetailMediaBrands);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#addBrands");
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
| **accountId** | **String**| the account id to update | |
| **valueResourceInputOfRetailMediaBrands** | [**ValueResourceInputOfRetailMediaBrands**](ValueResourceInputOfRetailMediaBrands.md)| brands to associate to account | [optional] |

### Return type

[**ValueResourceOfRetailMediaBrands**](ValueResourceOfRetailMediaBrands.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createPrivateMarketDemandBrandAccount

> ResourceOutcomeOfRetailMediaAccount createPrivateMarketDemandBrandAccount(accountId, valueResourceInputOfRetailMediaBrandAccountCreation)



Creates a new child Demand Brand Account for the provided parent private market account

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | Account Id for the parent private market account
        ValueResourceInputOfRetailMediaBrandAccountCreation valueResourceInputOfRetailMediaBrandAccountCreation = new ValueResourceInputOfRetailMediaBrandAccountCreation(); // ValueResourceInputOfRetailMediaBrandAccountCreation | Initial creation and configuration options for the new account
        try {
            ResourceOutcomeOfRetailMediaAccount result = apiInstance.createPrivateMarketDemandBrandAccount(accountId, valueResourceInputOfRetailMediaBrandAccountCreation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createPrivateMarketDemandBrandAccount");
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
| **accountId** | **String**| Account Id for the parent private market account | |
| **valueResourceInputOfRetailMediaBrandAccountCreation** | [**ValueResourceInputOfRetailMediaBrandAccountCreation**](ValueResourceInputOfRetailMediaBrandAccountCreation.md)| Initial creation and configuration options for the new account | [optional] |

### Return type

[**ResourceOutcomeOfRetailMediaAccount**](ResourceOutcomeOfRetailMediaAccount.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## removeBrands

> ValueResourceOfRetailMediaBrands removeBrands(accountId, valueResourceInputOfRetailMediaBrands)



Remove a brand from an account

### Example

```java
package com.criteo.api.retailmedia.v2024_04;

import com.criteo.api.retailmedia.v2024_04.ApiClient;
import com.criteo.api.retailmedia.v2024_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_04.ApiException;
import com.criteo.api.retailmedia.v2024_04.Configuration;
import com.criteo.api.retailmedia.v2024_04.auth.*;
import com.criteo.api.retailmedia.v2024_04.model.*;
import com.criteo.api.retailmedia.v2024_04.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | the account id to update
        ValueResourceInputOfRetailMediaBrands valueResourceInputOfRetailMediaBrands = new ValueResourceInputOfRetailMediaBrands(); // ValueResourceInputOfRetailMediaBrands | 
        try {
            ValueResourceOfRetailMediaBrands result = apiInstance.removeBrands(accountId, valueResourceInputOfRetailMediaBrands);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#removeBrands");
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
| **accountId** | **String**| the account id to update | |
| **valueResourceInputOfRetailMediaBrands** | [**ValueResourceInputOfRetailMediaBrands**](ValueResourceInputOfRetailMediaBrands.md)|  | [optional] |

### Return type

[**ValueResourceOfRetailMediaBrands**](ValueResourceOfRetailMediaBrands.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

