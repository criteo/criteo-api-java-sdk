# AccountsApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBrands**](AccountsApi.md#addBrands) | **POST** /2024-07/retail-media/account-management/accounts/{accountId}/brands/add |  |
| [**createPrivateMarketDemandBrandAccount**](AccountsApi.md#createPrivateMarketDemandBrandAccount) | **POST** /2024-07/retail-media/account-management/accounts/{accountId}/create-brand-account |  |
| [**createPrivateMarketDemandSellerAccount**](AccountsApi.md#createPrivateMarketDemandSellerAccount) | **POST** /2024-07/retail-media/account-management/accounts/{accountId}/create-seller-account |  |
| [**getApiV1ExternalAccounts**](AccountsApi.md#getApiV1ExternalAccounts) | **GET** /2024-07/retail-media/accounts |  |
| [**removeBrands**](AccountsApi.md#removeBrands) | **POST** /2024-07/retail-media/account-management/accounts/{accountId}/brands/remove |  |
| [**updateSellers**](AccountsApi.md#updateSellers) | **PUT** /2024-07/retail-media/account-management/accounts/{accountId}/sellers |  |



## addBrands

> ValueResourceOfRetailMediaBrands addBrands(accountId, valueResourceInputOfRetailMediaBrands)



Add brands to an account

### Example

```java
package com.criteo.api.retailmedia.v2024_07;

import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.auth.*;
import com.criteo.api.retailmedia.v2024_07.model.*;
import com.criteo.api.retailmedia.v2024_07.api.AccountsApi;

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
package com.criteo.api.retailmedia.v2024_07;

import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.auth.*;
import com.criteo.api.retailmedia.v2024_07.model.*;
import com.criteo.api.retailmedia.v2024_07.api.AccountsApi;

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


## createPrivateMarketDemandSellerAccount

> ResourceOutcomeOfRetailMediaAccount createPrivateMarketDemandSellerAccount(accountId, valueResourceInputOfRetailMediaSellerAccountCreation)



Creates a new child Demand Seller Account for the provided parent private market account

### Example

```java
package com.criteo.api.retailmedia.v2024_07;

import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.auth.*;
import com.criteo.api.retailmedia.v2024_07.model.*;
import com.criteo.api.retailmedia.v2024_07.api.AccountsApi;

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
        ValueResourceInputOfRetailMediaSellerAccountCreation valueResourceInputOfRetailMediaSellerAccountCreation = new ValueResourceInputOfRetailMediaSellerAccountCreation(); // ValueResourceInputOfRetailMediaSellerAccountCreation | Initial creation and configuration options for the new account
        try {
            ResourceOutcomeOfRetailMediaAccount result = apiInstance.createPrivateMarketDemandSellerAccount(accountId, valueResourceInputOfRetailMediaSellerAccountCreation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createPrivateMarketDemandSellerAccount");
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
| **valueResourceInputOfRetailMediaSellerAccountCreation** | [**ValueResourceInputOfRetailMediaSellerAccountCreation**](ValueResourceInputOfRetailMediaSellerAccountCreation.md)| Initial creation and configuration options for the new account | [optional] |

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


## getApiV1ExternalAccounts

> JsonApiPageResponseOfAccount getApiV1ExternalAccounts(limitToId, pageIndex, pageSize)



Gets page of account objects that the current user can access

### Example

```java
package com.criteo.api.retailmedia.v2024_07;

import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.auth.*;
import com.criteo.api.retailmedia.v2024_07.model.*;
import com.criteo.api.retailmedia.v2024_07.api.AccountsApi;

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
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            JsonApiPageResponseOfAccount result = apiInstance.getApiV1ExternalAccounts(limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getApiV1ExternalAccounts");
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
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**JsonApiPageResponseOfAccount**](JsonApiPageResponseOfAccount.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## removeBrands

> ValueResourceOfRetailMediaBrands removeBrands(accountId, valueResourceInputOfRetailMediaBrands)



Remove a brand from an account

### Example

```java
package com.criteo.api.retailmedia.v2024_07;

import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.auth.*;
import com.criteo.api.retailmedia.v2024_07.model.*;
import com.criteo.api.retailmedia.v2024_07.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | The account id to update
        ValueResourceInputOfRetailMediaBrands valueResourceInputOfRetailMediaBrands = new ValueResourceInputOfRetailMediaBrands(); // ValueResourceInputOfRetailMediaBrands | Brands to remove from account
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
| **accountId** | **String**| The account id to update | |
| **valueResourceInputOfRetailMediaBrands** | [**ValueResourceInputOfRetailMediaBrands**](ValueResourceInputOfRetailMediaBrands.md)| Brands to remove from account | [optional] |

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


## updateSellers

> ValueResourceCollectionOutcomeOfRetailMediaSeller updateSellers(accountId, valueResourceCollectionInputOfRetailMediaSeller)



replace the sellers assoiated with an account

### Example

```java
package com.criteo.api.retailmedia.v2024_07;

import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.auth.*;
import com.criteo.api.retailmedia.v2024_07.model.*;
import com.criteo.api.retailmedia.v2024_07.api.AccountsApi;

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
        ValueResourceCollectionInputOfRetailMediaSeller valueResourceCollectionInputOfRetailMediaSeller = new ValueResourceCollectionInputOfRetailMediaSeller(); // ValueResourceCollectionInputOfRetailMediaSeller | sellers to associate
        try {
            ValueResourceCollectionOutcomeOfRetailMediaSeller result = apiInstance.updateSellers(accountId, valueResourceCollectionInputOfRetailMediaSeller);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#updateSellers");
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
| **valueResourceCollectionInputOfRetailMediaSeller** | [**ValueResourceCollectionInputOfRetailMediaSeller**](ValueResourceCollectionInputOfRetailMediaSeller.md)| sellers to associate | [optional] |

### Return type

[**ValueResourceCollectionOutcomeOfRetailMediaSeller**](ValueResourceCollectionOutcomeOfRetailMediaSeller.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

