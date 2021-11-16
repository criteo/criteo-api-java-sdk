# AnalyticsApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdsetReport**](AnalyticsApi.md#getAdsetReport) | **POST** /2021-04/statistics/report | 
[**getTransactionsReport**](AnalyticsApi.md#getTransactionsReport) | **POST** /2021-04/transactions/report | 


<a name="getAdsetReport"></a>
# **getAdsetReport**
> byte[] getAdsetReport(statisticsReportQueryMessage)



This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    StatisticsReportQueryMessage statisticsReportQueryMessage = new StatisticsReportQueryMessage(); // StatisticsReportQueryMessage | 
    try {
      byte[] result = apiInstance.getAdsetReport(statisticsReportQueryMessage);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statisticsReportQueryMessage** | [**StatisticsReportQueryMessage**](StatisticsReportQueryMessage.md)|  | [optional]

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |

<a name="getTransactionsReport"></a>
# **getTransactionsReport**
> byte[] getTransactionsReport(transactionsReportQueryDataMessage)



This Transactions endpoint provides transactions id related data.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    TransactionsReportQueryDataMessage transactionsReportQueryDataMessage = new TransactionsReportQueryDataMessage(); // TransactionsReportQueryDataMessage | 
    try {
      byte[] result = apiInstance.getTransactionsReport(transactionsReportQueryDataMessage);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionsReportQueryDataMessage** | [**TransactionsReportQueryDataMessage**](TransactionsReportQueryDataMessage.md)|  | [optional]

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |

