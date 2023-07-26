# AnalyticsApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCampaignReports**](AnalyticsApi.md#generateCampaignReports) | **POST** /2023-07/retail-media/reports/campaigns |  |
| [**generateLineItemsReports**](AnalyticsApi.md#generateLineItemsReports) | **POST** /2023-07/retail-media/reports/line-items |  |
| [**getAsyncExportOutput**](AnalyticsApi.md#getAsyncExportOutput) | **GET** /2023-07/retail-media/reports/{reportId}/output |  |
| [**getAsyncExportStatus**](AnalyticsApi.md#getAsyncExportStatus) | **GET** /2023-07/retail-media/reports/{reportId}/status |  |



## generateCampaignReports

> ReportResponse generateCampaignReports(campaignReportRequest)



Return a Campaign Report

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AnalyticsApi;

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
        CampaignReportRequest campaignReportRequest = new CampaignReportRequest(); // CampaignReportRequest | 
        try {
            ReportResponse result = apiInstance.generateCampaignReports(campaignReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#generateCampaignReports");
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
| **campaignReportRequest** | [**CampaignReportRequest**](CampaignReportRequest.md)|  | |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## generateLineItemsReports

> ReportResponse generateLineItemsReports(lineItemReportRequest)



Return a Line Item Report

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AnalyticsApi;

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
        LineItemReportRequest lineItemReportRequest = new LineItemReportRequest(); // LineItemReportRequest | 
        try {
            ReportResponse result = apiInstance.generateLineItemsReports(lineItemReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#generateLineItemsReports");
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
| **lineItemReportRequest** | [**LineItemReportRequest**](LineItemReportRequest.md)|  | |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## getAsyncExportOutput

> String getAsyncExportOutput(reportId)



Return the output of an async report

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AnalyticsApi;

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
        String reportId = "reportId_example"; // String | The ID of the report to retrieve
        try {
            String result = apiInstance.getAsyncExportOutput(reportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getAsyncExportOutput");
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
| **reportId** | **String**| The ID of the report to retrieve | |

### Return type

**String**

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## getAsyncExportStatus

> AsyncReportResponse getAsyncExportStatus(reportId)



Return the status of an async report

### Example

```java
package com.criteo.api.retailmedia.v2023_07;

import com.criteo.api.retailmedia.v2023_07.ApiClient;
import com.criteo.api.retailmedia.v2023_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2023_07.ApiException;
import com.criteo.api.retailmedia.v2023_07.Configuration;
import com.criteo.api.retailmedia.v2023_07.auth.*;
import com.criteo.api.retailmedia.v2023_07.model.*;
import com.criteo.api.retailmedia.v2023_07.api.AnalyticsApi;

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
        String reportId = "reportId_example"; // String | The ID of the report to retrieve
        try {
            AsyncReportResponse result = apiInstance.getAsyncExportStatus(reportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsApi#getAsyncExportStatus");
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
| **reportId** | **String**| The ID of the report to retrieve | |

### Return type

[**AsyncReportResponse**](AsyncReportResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

