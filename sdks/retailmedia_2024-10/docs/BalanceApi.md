# BalanceApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApi202110ExternalBalanceCampaignsByBalanceId**](BalanceApi.md#getApi202110ExternalBalanceCampaignsByBalanceId) | **GET** /2024-10/retail-media/balances/{balance-id}/campaigns |  |
| [**getApiV2ExternalAccountBalancesByAccountId**](BalanceApi.md#getApiV2ExternalAccountBalancesByAccountId) | **GET** /2024-10/retail-media/accounts/{account-id}/balances |  |
| [**getApiV2ExternalAccountByAccountIdBalancesbalanceId**](BalanceApi.md#getApiV2ExternalAccountByAccountIdBalancesbalanceId) | **GET** /2024-10/retail-media/accounts/{account-id}/balances/{balance-id} |  |
| [**getBalanceHistory**](BalanceApi.md#getBalanceHistory) | **GET** /2024-10/retail-media/balances/{balanceId}/history |  |
| [**patchApiV2ExternalAccountByAccountIdBalancesbalanceId**](BalanceApi.md#patchApiV2ExternalAccountByAccountIdBalancesbalanceId) | **PATCH** /2024-10/retail-media/accounts/{account-id}/balances/{balance-id} |  |
| [**postApiV2ExternalAccountAddFundsByAccountIdBalancesbalanceId**](BalanceApi.md#postApiV2ExternalAccountAddFundsByAccountIdBalancesbalanceId) | **POST** /2024-10/retail-media/accounts/{account-id}/balances/{balance-id}/add-funds |  |
| [**postApiV2ExternalAccountBalancesByAccountId**](BalanceApi.md#postApiV2ExternalAccountBalancesByAccountId) | **POST** /2024-10/retail-media/accounts/{account-id}/balances |  |
| [**postApiV2ExternalAccountChangeDatesByAccountIdBalancesbalanceId**](BalanceApi.md#postApiV2ExternalAccountChangeDatesByAccountIdBalancesbalanceId) | **POST** /2024-10/retail-media/accounts/{account-id}/balances/{balance-id}/change-dates |  |



## getApi202110ExternalBalanceCampaignsByBalanceId

> BalanceCampaign202110PagedListResponse getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize)



Gets page of campaigns for the given balanceId

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String balanceId = "balanceId_example"; // String | The balance to get campaigns from
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
        try {
            BalanceCampaign202110PagedListResponse result = apiInstance.getApi202110ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApi202110ExternalBalanceCampaignsByBalanceId");
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
| **balanceId** | **String**| The balance to get campaigns from | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] |

### Return type

[**BalanceCampaign202110PagedListResponse**](BalanceCampaign202110PagedListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV2ExternalAccountBalancesByAccountId

> PagedResourceCollectionOutcomeOfBalanceResponseV2 getApiV2ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of balance objects for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to get balances for
        List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
        Integer pageIndex = 0; // Integer | The 0 indexed page index you would like to receive given the page size
        Integer pageSize = 25; // Integer | The maximum number of items you would like to receive in this request
        try {
            PagedResourceCollectionOutcomeOfBalanceResponseV2 result = apiInstance.getApiV2ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApiV2ExternalAccountBalancesByAccountId");
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
| **accountId** | **String**| The account to get balances for | |
| **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional] |
| **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional] [default to 0] |
| **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional] [default to 25] |

### Return type

[**PagedResourceCollectionOutcomeOfBalanceResponseV2**](PagedResourceCollectionOutcomeOfBalanceResponseV2.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getApiV2ExternalAccountByAccountIdBalancesbalanceId

> BalanceResponseV2Response getApiV2ExternalAccountByAccountIdBalancesbalanceId(accountId, balanceId)



Get a balance for the given account id and balance id

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account of the balance
        String balanceId = "balanceId_example"; // String | The balance id
        try {
            BalanceResponseV2Response result = apiInstance.getApiV2ExternalAccountByAccountIdBalancesbalanceId(accountId, balanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getApiV2ExternalAccountByAccountIdBalancesbalanceId");
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
| **accountId** | **String**| The account of the balance | |
| **balanceId** | **String**| The balance id | |

### Return type

[**BalanceResponseV2Response**](BalanceResponseV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getBalanceHistory

> PageOfBalanceHistoryChangeDataCaptureV1 getBalanceHistory(balanceId, offset, limit, limitToChangeTypes)



Gets the balance&#39;s historical change data.

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String balanceId = "balanceId_example"; // String | Balance id.
        Integer offset = 0; // Integer | The (zero-based) starting offset in the collection.
        Integer limit = 25; // Integer | The number of elements to be returned.
        String limitToChangeTypes = "limitToChangeTypes_example"; // String | Comma separated change types string that will be queried.
        try {
            PageOfBalanceHistoryChangeDataCaptureV1 result = apiInstance.getBalanceHistory(balanceId, offset, limit, limitToChangeTypes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getBalanceHistory");
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
| **balanceId** | **String**| Balance id. | |
| **offset** | **Integer**| The (zero-based) starting offset in the collection. | [optional] [default to 0] |
| **limit** | **Integer**| The number of elements to be returned. | [optional] [default to 25] |
| **limitToChangeTypes** | **String**| Comma separated change types string that will be queried. | [optional] |

### Return type

[**PageOfBalanceHistoryChangeDataCaptureV1**](PageOfBalanceHistoryChangeDataCaptureV1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## patchApiV2ExternalAccountByAccountIdBalancesbalanceId

> BalanceResponseV2Response patchApiV2ExternalAccountByAccountIdBalancesbalanceId(accountId, balanceId, updateBalanceModelV2Request)



Modify a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account of the balance
        String balanceId = "balanceId_example"; // String | The balance to change the dates
        UpdateBalanceModelV2Request updateBalanceModelV2Request = new UpdateBalanceModelV2Request(); // UpdateBalanceModelV2Request | An object that represents the available options to modify a balance.
        try {
            BalanceResponseV2Response result = apiInstance.patchApiV2ExternalAccountByAccountIdBalancesbalanceId(accountId, balanceId, updateBalanceModelV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#patchApiV2ExternalAccountByAccountIdBalancesbalanceId");
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
| **accountId** | **String**| The account of the balance | |
| **balanceId** | **String**| The balance to change the dates | |
| **updateBalanceModelV2Request** | [**UpdateBalanceModelV2Request**](UpdateBalanceModelV2Request.md)| An object that represents the available options to modify a balance. | |

### Return type

[**BalanceResponseV2Response**](BalanceResponseV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApiV2ExternalAccountAddFundsByAccountIdBalancesbalanceId

> BalanceResponseV2Response postApiV2ExternalAccountAddFundsByAccountIdBalancesbalanceId(accountId, balanceId, addFundsToBalanceV2Request)



Add funds to a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account of the balance
        String balanceId = "balanceId_example"; // String | The balance to add funds to
        AddFundsToBalanceV2Request addFundsToBalanceV2Request = new AddFundsToBalanceV2Request(); // AddFundsToBalanceV2Request | An object that represents the available options of adding funds to a balance.
        try {
            BalanceResponseV2Response result = apiInstance.postApiV2ExternalAccountAddFundsByAccountIdBalancesbalanceId(accountId, balanceId, addFundsToBalanceV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#postApiV2ExternalAccountAddFundsByAccountIdBalancesbalanceId");
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
| **accountId** | **String**| The account of the balance | |
| **balanceId** | **String**| The balance to add funds to | |
| **addFundsToBalanceV2Request** | [**AddFundsToBalanceV2Request**](AddFundsToBalanceV2Request.md)| An object that represents the available options of adding funds to a balance. | |

### Return type

[**BalanceResponseV2Response**](BalanceResponseV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postApiV2ExternalAccountBalancesByAccountId

> BalanceResponseV2Response postApiV2ExternalAccountBalancesByAccountId(accountId, createBalanceV2Request)



Create balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account to create balances for
        CreateBalanceV2Request createBalanceV2Request = new CreateBalanceV2Request(); // CreateBalanceV2Request | An object that represents the available options to set when creating a Retail Media Balance
        try {
            BalanceResponseV2Response result = apiInstance.postApiV2ExternalAccountBalancesByAccountId(accountId, createBalanceV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#postApiV2ExternalAccountBalancesByAccountId");
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
| **accountId** | **String**| The account to create balances for | |
| **createBalanceV2Request** | [**CreateBalanceV2Request**](CreateBalanceV2Request.md)| An object that represents the available options to set when creating a Retail Media Balance | |

### Return type

[**BalanceResponseV2Response**](BalanceResponseV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## postApiV2ExternalAccountChangeDatesByAccountIdBalancesbalanceId

> BalanceResponseV2Response postApiV2ExternalAccountChangeDatesByAccountIdBalancesbalanceId(accountId, balanceId, changeDatesOfBalanceV2Request)



Change dates of a balance for the given account id

### Example

```java
package com.criteo.api.retailmedia.v2024_10;

import com.criteo.api.retailmedia.v2024_10.ApiClient;
import com.criteo.api.retailmedia.v2024_10.ApiClientBuilder;
import com.criteo.api.retailmedia.v2024_10.ApiException;
import com.criteo.api.retailmedia.v2024_10.Configuration;
import com.criteo.api.retailmedia.v2024_10.auth.*;
import com.criteo.api.retailmedia.v2024_10.model.*;
import com.criteo.api.retailmedia.v2024_10.api.BalanceApi;

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

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String accountId = "accountId_example"; // String | The account of the balance
        String balanceId = "balanceId_example"; // String | The balance to change the dates
        ChangeDatesOfBalanceV2Request changeDatesOfBalanceV2Request = new ChangeDatesOfBalanceV2Request(); // ChangeDatesOfBalanceV2Request | An object that represents the available options to modify schedule of a balance.
        try {
            BalanceResponseV2Response result = apiInstance.postApiV2ExternalAccountChangeDatesByAccountIdBalancesbalanceId(accountId, balanceId, changeDatesOfBalanceV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#postApiV2ExternalAccountChangeDatesByAccountIdBalancesbalanceId");
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
| **accountId** | **String**| The account of the balance | |
| **balanceId** | **String**| The balance to change the dates | |
| **changeDatesOfBalanceV2Request** | [**ChangeDatesOfBalanceV2Request**](ChangeDatesOfBalanceV2Request.md)| An object that represents the available options to modify schedule of a balance. | |

### Return type

[**BalanceResponseV2Response**](BalanceResponseV2Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

