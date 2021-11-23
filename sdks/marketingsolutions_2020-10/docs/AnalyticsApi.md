# AnalyticsApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdsetReport**](AnalyticsApi.md#getAdsetReport) | **POST** /2021-10/statistics/report | 
[**getTransactionsReport**](AnalyticsApi.md#getTransactionsReport) | **POST** /2021-10/transactions/report | 
[**getTransparencyReport**](AnalyticsApi.md#getTransparencyReport) | **POST** /2021-10/log-level/advertisers/{advertiser-id}/report | 


<a name="getAdsetReport"></a>
# **getAdsetReport**
> byte[] getAdsetReport(statisticsReportQueryMessage)



This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[oauth](../README.md#oauth)

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
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |

<a name="getTransparencyReport"></a>
# **getTransparencyReport**
> TransparencyReportDataMessage getTransparencyReport(advertiserId, transparencyQueryMessage)



This Statistics endpoint provides publisher data.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id to fetch the transparency data.
    TransparencyQueryMessage transparencyQueryMessage = new TransparencyQueryMessage(); // TransparencyQueryMessage | 
    try {
      TransparencyReportDataMessage result = apiInstance.getTransparencyReport(advertiserId, transparencyQueryMessage);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **Integer**| The advertiser id to fetch the transparency data. |
 **transparencyQueryMessage** | [**TransparencyQueryMessage**](TransparencyQueryMessage.md)|  | [optional]

### Return type

[**TransparencyReportDataMessage**](TransparencyReportDataMessage.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |

