# AccountsApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBrands**](AccountsApi.md#addBrands) | **POST** /2025-07/retail-media/account-management/accounts/{accountId}/brands/add |  |
| [**createPrivateMarketDemandBrandAccount**](AccountsApi.md#createPrivateMarketDemandBrandAccount) | **POST** /2025-07/retail-media/account-management/accounts/{accountId}/create-brand-account |  |
| [**createPrivateMarketDemandSellerAccount**](AccountsApi.md#createPrivateMarketDemandSellerAccount) | **POST** /2025-07/retail-media/account-management/accounts/{accountId}/create-seller-account |  |
| [**getAccounts**](AccountsApi.md#getAccounts) | **GET** /2025-07/retail-media/accounts |  |
| [**getPrivateMarketChildAccountsByAccountId**](AccountsApi.md#getPrivateMarketChildAccountsByAccountId) | **GET** /2025-07/retail-media/account-management/accounts/{accountId}/private-market-child-accounts |  |
| [**grantConsent**](AccountsApi.md#grantConsent) | **POST** /2025-07/retail-media/accounts/{accountId}/grant-consent |  |
| [**removeBrands**](AccountsApi.md#removeBrands) | **POST** /2025-07/retail-media/account-management/accounts/{accountId}/brands/remove |  |
| [**searchSellers**](AccountsApi.md#searchSellers) | **POST** /2025-07/retail-media/accounts/sellers/search |  |
| [**updateSellers**](AccountsApi.md#updateSellers) | **PUT** /2025-07/retail-media/account-management/accounts/{accountId}/sellers |  |



## addBrands

> ValueResourceOutcomeOfRetailMediaBrands addBrands(accountId, valueResourceInputOfRetailMediaBrands)



Add brands to an account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
            ValueResourceOutcomeOfRetailMediaBrands result = apiInstance.addBrands(accountId, valueResourceInputOfRetailMediaBrands);
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
| **valueResourceInputOfRetailMediaBrands** | [**ValueResourceInputOfRetailMediaBrands**](ValueResourceInputOfRetailMediaBrands.md)|  | [optional] |

### Return type

[**ValueResourceOutcomeOfRetailMediaBrands**](ValueResourceOutcomeOfRetailMediaBrands.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createPrivateMarketDemandBrandAccount

> EntityResourceOutcomeOfRetailMediaAccount createPrivateMarketDemandBrandAccount(accountId, valueResourceInputOfRetailMediaBrandAccountCreation)



Creates a new child Demand Brand Account for the provided parent private market account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | The given account id
        ValueResourceInputOfRetailMediaBrandAccountCreation valueResourceInputOfRetailMediaBrandAccountCreation = new ValueResourceInputOfRetailMediaBrandAccountCreation(); // ValueResourceInputOfRetailMediaBrandAccountCreation | 
        try {
            EntityResourceOutcomeOfRetailMediaAccount result = apiInstance.createPrivateMarketDemandBrandAccount(accountId, valueResourceInputOfRetailMediaBrandAccountCreation);
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
| **accountId** | **String**| The given account id | |
| **valueResourceInputOfRetailMediaBrandAccountCreation** | [**ValueResourceInputOfRetailMediaBrandAccountCreation**](ValueResourceInputOfRetailMediaBrandAccountCreation.md)|  | [optional] |

### Return type

[**EntityResourceOutcomeOfRetailMediaAccount**](EntityResourceOutcomeOfRetailMediaAccount.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## createPrivateMarketDemandSellerAccount

> EntityResourceOutcomeOfRetailMediaAccount createPrivateMarketDemandSellerAccount(accountId, valueResourceInputOfRetailMediaSellerAccountCreation)



Creates a new child Demand Seller Account for the provided parent private market account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | The given account id
        ValueResourceInputOfRetailMediaSellerAccountCreation valueResourceInputOfRetailMediaSellerAccountCreation = new ValueResourceInputOfRetailMediaSellerAccountCreation(); // ValueResourceInputOfRetailMediaSellerAccountCreation | 
        try {
            EntityResourceOutcomeOfRetailMediaAccount result = apiInstance.createPrivateMarketDemandSellerAccount(accountId, valueResourceInputOfRetailMediaSellerAccountCreation);
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
| **accountId** | **String**| The given account id | |
| **valueResourceInputOfRetailMediaSellerAccountCreation** | [**ValueResourceInputOfRetailMediaSellerAccountCreation**](ValueResourceInputOfRetailMediaSellerAccountCreation.md)|  | [optional] |

### Return type

[**EntityResourceOutcomeOfRetailMediaAccount**](EntityResourceOutcomeOfRetailMediaAccount.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## getAccounts

> JsonApiPageResponseOfAccount getAccounts(limitToId, pageIndex, pageSize)



Gets page of account objects that the current user can access

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
            JsonApiPageResponseOfAccount result = apiInstance.getAccounts(limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccounts");
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
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPrivateMarketChildAccountsByAccountId

> EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata getPrivateMarketChildAccountsByAccountId(accountId, limit, offset)



Gets page of private market child accounts that are associated with the given account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | Account Id
        Integer limit = 25; // Integer | The number of accounts to be returned. The default is 25.
        Integer offset = 0; // Integer | The (zero-based) offset into the collection of accounts. The default is 0.
        try {
            EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata result = apiInstance.getPrivateMarketChildAccountsByAccountId(accountId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getPrivateMarketChildAccountsByAccountId");
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
| **accountId** | **String**| Account Id | |
| **limit** | **Integer**| The number of accounts to be returned. The default is 25. | [optional] [default to 25] |
| **offset** | **Integer**| The (zero-based) offset into the collection of accounts. The default is 0. | [optional] [default to 0] |

### Return type

[**EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata**](EntityResourceCollectionOutcomeOfRetailMediaChildAccountAndMetadata.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## grantConsent

> grantConsent(accountId, grantConsentInput)



Grant consent to a business application on behalf of a Private Market demand account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | The demand account ID on which to grant consent
        GrantConsentInput grantConsentInput = new GrantConsentInput(); // GrantConsentInput | 
        try {
            apiInstance.grantConsent(accountId, grantConsentInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#grantConsent");
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
| **accountId** | **String**| The demand account ID on which to grant consent | |
| **grantConsentInput** | [**GrantConsentInput**](GrantConsentInput.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |


## removeBrands

> ValueResourceOutcomeOfRetailMediaBrands removeBrands(accountId, valueResourceInputOfRetailMediaBrands)



Remove brands from an account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
            ValueResourceOutcomeOfRetailMediaBrands result = apiInstance.removeBrands(accountId, valueResourceInputOfRetailMediaBrands);
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

[**ValueResourceOutcomeOfRetailMediaBrands**](ValueResourceOutcomeOfRetailMediaBrands.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## searchSellers

> ValueResourceCollectionOutcomeOfSellerSearchResult searchSellers(valueResourceInputOfSellerSearch)



Get the sellers mapped to provided accounts

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
        ValueResourceInputOfSellerSearch valueResourceInputOfSellerSearch = new ValueResourceInputOfSellerSearch(); // ValueResourceInputOfSellerSearch | 
        try {
            ValueResourceCollectionOutcomeOfSellerSearchResult result = apiInstance.searchSellers(valueResourceInputOfSellerSearch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#searchSellers");
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
| **valueResourceInputOfSellerSearch** | [**ValueResourceInputOfSellerSearch**](ValueResourceInputOfSellerSearch.md)|  | [optional] |

### Return type

[**ValueResourceCollectionOutcomeOfSellerSearchResult**](ValueResourceCollectionOutcomeOfSellerSearchResult.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateSellers

> ValueResourceCollectionOutcomeOfRetailMediaSeller updateSellers(accountId, valueResourceCollectionInputOfRetailMediaSeller)



Replace the sellers associated with an account

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.AccountsApi;

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
        String accountId = "accountId_example"; // String | The given account id
        ValueResourceCollectionInputOfRetailMediaSeller valueResourceCollectionInputOfRetailMediaSeller = new ValueResourceCollectionInputOfRetailMediaSeller(); // ValueResourceCollectionInputOfRetailMediaSeller | 
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
| **accountId** | **String**| The given account id | |
| **valueResourceCollectionInputOfRetailMediaSeller** | [**ValueResourceCollectionInputOfRetailMediaSeller**](ValueResourceCollectionInputOfRetailMediaSeller.md)|  | [optional] |

### Return type

[**ValueResourceCollectionOutcomeOfRetailMediaSeller**](ValueResourceCollectionOutcomeOfRetailMediaSeller.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

