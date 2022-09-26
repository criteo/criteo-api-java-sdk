# AnalyticsApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReportOutput**](AnalyticsApi.md#getReportOutput) | **GET** /2022-07/retail-media/reports/{reportId}/output |  |
| [**getReportStatus**](AnalyticsApi.md#getReportStatus) | **GET** /2022-07/retail-media/reports/{reportId}/status |  |
| [**requestCampaignReport**](AnalyticsApi.md#requestCampaignReport) | **POST** /2022-07/retail-media/reports/campaigns |  |
| [**requestLineItemReport**](AnalyticsApi.md#requestLineItemReport) | **POST** /2022-07/retail-media/reports/line-items |  |



## getReportOutput

> Integer getReportOutput(reportId)



Request the report output

### Example

```java
package com.criteo.api.retailmedia.v2022_07;

import com.criteo.api.retailmedia.v2022_07.ApiClient;
import com.criteo.api.retailmedia.v2022_07.ApiException;
import com.criteo.api.retailmedia.v2022_07.Configuration;
import com.criteo.api.retailmedia.v2022_07.auth.*;
import com.criteo.api.retailmedia.v2022_07.model.*;
import com.criteo.api.retailmedia.v2022_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        String reportId = "ee439121-13e3-4734-9f67-c504dd921a41"; // String | report id
        try {
            Integer result = apiInstance.getReportOutput(reportId);
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

**Integer**

### Authorization

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2022_07;

import com.criteo.api.retailmedia.v2022_07.ApiClient;
import com.criteo.api.retailmedia.v2022_07.ApiException;
import com.criteo.api.retailmedia.v2022_07.Configuration;
import com.criteo.api.retailmedia.v2022_07.auth.*;
import com.criteo.api.retailmedia.v2022_07.model.*;
import com.criteo.api.retailmedia.v2022_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        String reportId = "ee439121-13e3-4734-9f67-c504dd921a41"; // String | report id
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

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2022_07;

import com.criteo.api.retailmedia.v2022_07.ApiClient;
import com.criteo.api.retailmedia.v2022_07.ApiException;
import com.criteo.api.retailmedia.v2022_07.Configuration;
import com.criteo.api.retailmedia.v2022_07.auth.*;
import com.criteo.api.retailmedia.v2022_07.model.*;
import com.criteo.api.retailmedia.v2022_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        EnvelopeReportRequest envelopeReportRequest = new EnvelopeReportRequest(); // EnvelopeReportRequest | // Body of the request {   \"data\": {     \"type\": \"RetailMediaReportRequest\",     \"attributes\": {       \"reportType\": string, // the name of the report being requested       //only one of \"id\" or \"ids\" can be provided for a request       \"id\": string, // the campaign id to select       \"ids\": Array[string], //the campaign ids to select       \"startDate\": string, // YYYY-MM-DD format       \"endDate\": string, // YYYY-MM-DD format       \"timeZone\": string, // examples: 'Europe/London', 'Asia/Tokyo', 'America/New_York'       // both attribution windows must be specified when one is specified       \"clickAttributionWindow\": \"7D\", \"14D\", or \"30D\"  // optional. defaults to campaign's click attribution window       \"viewAttributionWindow\": \"none\", \"1D\", \"7D\", \"14D\", \"30D\" // optional. defaults to campaign's view attribution window       \"format\": One of \"json\" (default),\"json-compact\",\"json-newline\" or \"csv\" // output format, defaults to json-compact     }   } }
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
| **envelopeReportRequest** | [**EnvelopeReportRequest**](EnvelopeReportRequest.md)| // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the campaign id to select       \&quot;ids\&quot;: Array[string], //the campaign ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } | |

### Return type

[**EnvelopeReportStatus**](EnvelopeReportStatus.md)

### Authorization

[oauth](../README.md#oauth)

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
package com.criteo.api.retailmedia.v2022_07;

import com.criteo.api.retailmedia.v2022_07.ApiClient;
import com.criteo.api.retailmedia.v2022_07.ApiException;
import com.criteo.api.retailmedia.v2022_07.Configuration;
import com.criteo.api.retailmedia.v2022_07.auth.*;
import com.criteo.api.retailmedia.v2022_07.model.*;
import com.criteo.api.retailmedia.v2022_07.api.AnalyticsApi;

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

        AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
        EnvelopeReportRequest envelopeReportRequest = new EnvelopeReportRequest(); // EnvelopeReportRequest | // Body of the request {   \"data\": {     \"type\": \"RetailMediaReportRequest\",     \"attributes\": {       \"reportType\": string, // the name of the report being requested       //only one of \"id\" or \"ids\" can be provided for a request       \"id\": string, // the line item id to select       \"ids: Array[string] // the line item ids to select       \"startDate\": string, // YYYY-MM-DD format       \"endDate\": string, // YYYY-MM-DD format       \"timeZone\": string, // examples: 'Europe/London', 'Asia/Tokyo', 'America/New_York'       // both attribution windows must be specified when one is specified       \"clickAttributionWindow\": \"7D\", \"14D\", or \"30D\"  // optional. defaults to campaign's click attribution window       \"viewAttributionWindow\": \"none\", \"1D\", \"7D\", \"14D\", \"30D\" // optional. defaults to campaign's view attribution window       \"format\": One of \"json\" (default),\"json-compact\",\"json-newline\" or \"csv\" // output format, defaults to json-compact     }   } }
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
| **envelopeReportRequest** | [**EnvelopeReportRequest**](EnvelopeReportRequest.md)| // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the line item id to select       \&quot;ids: Array[string] // the line item ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } | |

### Return type

[**EnvelopeReportStatus**](EnvelopeReportStatus.md)

### Authorization

[oauth](../README.md#oauth)

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

