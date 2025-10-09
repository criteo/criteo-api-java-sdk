# AnalyticsApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdsetReport**](AnalyticsApi.md#getAdsetReport) | **POST** /2025-07/statistics/report |  |
| [**getPlacementsReport**](AnalyticsApi.md#getPlacementsReport) | **POST** /2025-07/placements/report |  |
| [**getTransactionsReport**](AnalyticsApi.md#getTransactionsReport) | **POST** /2025-07/transactions/report |  |
| [**getTransparencyReport**](AnalyticsApi.md#getTransparencyReport) | **POST** /2025-07/log-level/advertisers/{advertiser-id}/report |  |



## getAdsetReport

> File getAdsetReport(statisticsReportQueryMessage)



This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.

### Example

```java
package com.criteo.api.marketingsolutions.v2025_07;

import com.criteo.api.marketingsolutions.v2025_07.ApiClient;
import com.criteo.api.marketingsolutions.v2025_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2025_07.ApiException;
import com.criteo.api.marketingsolutions.v2025_07.Configuration;
import com.criteo.api.marketingsolutions.v2025_07.auth.*;
import com.criteo.api.marketingsolutions.v2025_07.model.*;
import com.criteo.api.marketingsolutions.v2025_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        StatisticsReportQueryMessage statisticsReportQueryMessage = new StatisticsReportQueryMessage(); // StatisticsReportQueryMessage | 
        try {
            File result = apiInstance.getAdsetReport(statisticsReportQueryMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getAdsetReport");
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
| **statisticsReportQueryMessage** | [**StatisticsReportQueryMessage**](StatisticsReportQueryMessage.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/csv, text/xml, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPlacementsReport

> File getPlacementsReport(placementsReportQueryMessageListRequest)



Your ads are placed in different domains (publishers) and environments (websites and apps). Thanks to the placements endpoint, you can analyse the performances for each publisher, comparing displays, clicks and sales generated.

### Example

```java
package com.criteo.api.marketingsolutions.v2025_07;

import com.criteo.api.marketingsolutions.v2025_07.ApiClient;
import com.criteo.api.marketingsolutions.v2025_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2025_07.ApiException;
import com.criteo.api.marketingsolutions.v2025_07.Configuration;
import com.criteo.api.marketingsolutions.v2025_07.auth.*;
import com.criteo.api.marketingsolutions.v2025_07.model.*;
import com.criteo.api.marketingsolutions.v2025_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        PlacementsReportQueryMessageListRequest placementsReportQueryMessageListRequest = new PlacementsReportQueryMessageListRequest(); // PlacementsReportQueryMessageListRequest | 
        try {
            File result = apiInstance.getPlacementsReport(placementsReportQueryMessageListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getPlacementsReport");
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
| **placementsReportQueryMessageListRequest** | [**PlacementsReportQueryMessageListRequest**](PlacementsReportQueryMessageListRequest.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, text/xml, application/*+xml
- **Accept**: application/json, text/csv, text/xml, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTransactionsReport

> File getTransactionsReport(transactionsReportQueryMessageListRequest)



This Transactions endpoint provides transactions id related data.

### Example

```java
package com.criteo.api.marketingsolutions.v2025_07;

import com.criteo.api.marketingsolutions.v2025_07.ApiClient;
import com.criteo.api.marketingsolutions.v2025_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2025_07.ApiException;
import com.criteo.api.marketingsolutions.v2025_07.Configuration;
import com.criteo.api.marketingsolutions.v2025_07.auth.*;
import com.criteo.api.marketingsolutions.v2025_07.model.*;
import com.criteo.api.marketingsolutions.v2025_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        TransactionsReportQueryMessageListRequest transactionsReportQueryMessageListRequest = new TransactionsReportQueryMessageListRequest(); // TransactionsReportQueryMessageListRequest | 
        try {
            File result = apiInstance.getTransactionsReport(transactionsReportQueryMessageListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getTransactionsReport");
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
| **transactionsReportQueryMessageListRequest** | [**TransactionsReportQueryMessageListRequest**](TransactionsReportQueryMessageListRequest.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, text/xml, application/*+xml
- **Accept**: application/json, text/csv, text/xml, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTransparencyReport

> TransparencyReportListResponse getTransparencyReport(advertiserId, transparencyQueryMessage)



This Statistics endpoint provides publisher data.

### Example

```java
package com.criteo.api.marketingsolutions.v2025_07;

import com.criteo.api.marketingsolutions.v2025_07.ApiClient;
import com.criteo.api.marketingsolutions.v2025_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2025_07.ApiException;
import com.criteo.api.marketingsolutions.v2025_07.Configuration;
import com.criteo.api.marketingsolutions.v2025_07.auth.*;
import com.criteo.api.marketingsolutions.v2025_07.model.*;
import com.criteo.api.marketingsolutions.v2025_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        Integer advertiserId = 56; // Integer | The advertiser id to fetch the transparency data.
        TransparencyQueryMessage transparencyQueryMessage = new TransparencyQueryMessage(); // TransparencyQueryMessage | The query message.
        try {
            TransparencyReportListResponse result = apiInstance.getTransparencyReport(advertiserId, transparencyQueryMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getTransparencyReport");
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
| **advertiserId** | **Integer**| The advertiser id to fetch the transparency data. | |
| **transparencyQueryMessage** | [**TransparencyQueryMessage**](TransparencyQueryMessage.md)| The query message. | [optional] |

### Return type

[**TransparencyReportListResponse**](TransparencyReportListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, text/xml, application/*+xml
- **Accept**: application/json, application/xml, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

