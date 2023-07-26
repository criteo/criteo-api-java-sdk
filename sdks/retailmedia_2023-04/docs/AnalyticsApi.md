# AnalyticsApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReportOutput**](AnalyticsApi.md#getReportOutput) | **GET** /2023-04/retail-media/reports/{reportId}/output |  |
| [**getReportStatus**](AnalyticsApi.md#getReportStatus) | **GET** /2023-04/retail-media/reports/{reportId}/status |  |
| [**requestCampaignReport**](AnalyticsApi.md#requestCampaignReport) | **POST** /2023-04/retail-media/reports/campaigns |  |
| [**requestLineItemReport**](AnalyticsApi.md#requestLineItemReport) | **POST** /2023-04/retail-media/reports/line-items |  |



## getReportOutput

> String getReportOutput(reportId)



Request the report output

### Example

```java
package com.criteo.api.retailmedia.v2023_04;

import com.criteo.api.retailmedia.v2023_04.ApiClient;
import com.criteo.api.retailmedia.v2023_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_04.ApiException;
import com.criteo.api.retailmedia.v2023_04.Configuration;
import com.criteo.api.retailmedia.v2023_04.auth.*;
import com.criteo.api.retailmedia.v2023_04.model.*;
import com.criteo.api.retailmedia.v2023_04.api.AnalyticsApi;

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
        String reportId = "reportId_example"; // String | report id
        try {
            String result = apiInstance.getReportOutput(reportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getReportOutput");
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
| **reportId** | **String**| report id | |

### Return type

**String**

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The output |  * Content-Disposition - Returns a filename for the output <br>  |
| **401** | Missing Authorization or token invalid |  -  |
| **403** | Must have access to RetailMedia accounts |  -  |
| **404** | ReportId not found |  -  |


## getReportStatus

> EnvelopeReportStatus getReportStatus(reportId)



Get the status of the report

### Example

```java
package com.criteo.api.retailmedia.v2023_04;

import com.criteo.api.retailmedia.v2023_04.ApiClient;
import com.criteo.api.retailmedia.v2023_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_04.ApiException;
import com.criteo.api.retailmedia.v2023_04.Configuration;
import com.criteo.api.retailmedia.v2023_04.auth.*;
import com.criteo.api.retailmedia.v2023_04.model.*;
import com.criteo.api.retailmedia.v2023_04.api.AnalyticsApi;

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
        String reportId = "reportId_example"; // String | report id
        try {
            EnvelopeReportStatus result = apiInstance.getReportStatus(reportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getReportStatus");
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
| **reportId** | **String**| report id | |

### Return type

[**EnvelopeReportStatus**](EnvelopeReportStatus.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status of the report |  -  |
| **401** | Missing Authorization or token invalid |  -  |
| **403** | Must have access to RetailMedia accounts |  -  |
| **404** | ReportId not found |  -  |


## requestCampaignReport

> EnvelopeReportStatus requestCampaignReport(envelopeReportRequest)



Request a campaign report

### Example

```java
package com.criteo.api.retailmedia.v2023_04;

import com.criteo.api.retailmedia.v2023_04.ApiClient;
import com.criteo.api.retailmedia.v2023_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_04.ApiException;
import com.criteo.api.retailmedia.v2023_04.Configuration;
import com.criteo.api.retailmedia.v2023_04.auth.*;
import com.criteo.api.retailmedia.v2023_04.model.*;
import com.criteo.api.retailmedia.v2023_04.api.AnalyticsApi;

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
        EnvelopeReportRequest envelopeReportRequest = new EnvelopeReportRequest(); // EnvelopeReportRequest | Envelope of the request
        try {
            EnvelopeReportStatus result = apiInstance.requestCampaignReport(envelopeReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#requestCampaignReport");
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
| **envelopeReportRequest** | [**EnvelopeReportRequest**](EnvelopeReportRequest.md)| Envelope of the request | |

### Return type

[**EnvelopeReportStatus**](EnvelopeReportStatus.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status of the report |  -  |
| **400** | Bad request |  -  |
| **401** | Missing Authorization or token invalid |  -  |
| **403** | Must have access to RetailMedia accounts |  -  |


## requestLineItemReport

> EnvelopeReportStatus requestLineItemReport(envelopeReportRequest)



Request a line item report

### Example

```java
package com.criteo.api.retailmedia.v2023_04;

import com.criteo.api.retailmedia.v2023_04.ApiClient;
import com.criteo.api.retailmedia.v2023_04.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_04.ApiException;
import com.criteo.api.retailmedia.v2023_04.Configuration;
import com.criteo.api.retailmedia.v2023_04.auth.*;
import com.criteo.api.retailmedia.v2023_04.model.*;
import com.criteo.api.retailmedia.v2023_04.api.AnalyticsApi;

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
        EnvelopeReportRequest envelopeReportRequest = new EnvelopeReportRequest(); // EnvelopeReportRequest | Envelope of the request
        try {
            EnvelopeReportStatus result = apiInstance.requestLineItemReport(envelopeReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#requestLineItemReport");
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
| **envelopeReportRequest** | [**EnvelopeReportRequest**](EnvelopeReportRequest.md)| Envelope of the request | |

### Return type

[**EnvelopeReportStatus**](EnvelopeReportStatus.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status of the report |  -  |
| **400** | Bad request |  -  |
| **401** | Missing Authorization or token invalid |  -  |
| **403** | Must have access to RetailMedia accounts |  -  |

