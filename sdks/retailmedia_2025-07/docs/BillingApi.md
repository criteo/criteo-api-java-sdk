# BillingApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call07retailMediaBillingPartnerReportPost**](BillingApi.md#call07retailMediaBillingPartnerReportPost) | **POST** /2025-07/retail-media/billing/partner-report |  |
| [**call07retailMediaBillingPartnerReportRequestIdOutputGet**](BillingApi.md#call07retailMediaBillingPartnerReportRequestIdOutputGet) | **GET** /2025-07/retail-media/billing/partner-report/{requestId}/output |  |
| [**call07retailMediaBillingPartnerReportRequestIdStatusGet**](BillingApi.md#call07retailMediaBillingPartnerReportRequestIdStatusGet) | **GET** /2025-07/retail-media/billing/partner-report/{requestId}/status |  |



## call07retailMediaBillingPartnerReportPost

> EntityResourceOutcomePartnerBillingReportStatusV1 call07retailMediaBillingPartnerReportPost(valueResourceInputPartnerBillingReportRequestV1)



Create a Partner Billing Report request.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.BillingApi;

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

        BillingApi apiInstance = new BillingApi(defaultClient);
        ValueResourceInputPartnerBillingReportRequestV1 valueResourceInputPartnerBillingReportRequestV1 = new ValueResourceInputPartnerBillingReportRequestV1(); // ValueResourceInputPartnerBillingReportRequestV1 | Partner Billing Report request object.
        try {
            EntityResourceOutcomePartnerBillingReportStatusV1 result = apiInstance.call07retailMediaBillingPartnerReportPost(valueResourceInputPartnerBillingReportRequestV1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingApi#call07retailMediaBillingPartnerReportPost");
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
| **valueResourceInputPartnerBillingReportRequestV1** | [**ValueResourceInputPartnerBillingReportRequestV1**](ValueResourceInputPartnerBillingReportRequestV1.md)| Partner Billing Report request object. | [optional] |

### Return type

[**EntityResourceOutcomePartnerBillingReportStatusV1**](EntityResourceOutcomePartnerBillingReportStatusV1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |


## call07retailMediaBillingPartnerReportRequestIdOutputGet

> File call07retailMediaBillingPartnerReportRequestIdOutputGet(requestId)



Get the output of an existing Partner Billing Report.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.BillingApi;

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

        BillingApi apiInstance = new BillingApi(defaultClient);
        String requestId = "requestId_example"; // String | The id of a Partner Billing Report request.
        try {
            File result = apiInstance.call07retailMediaBillingPartnerReportRequestIdOutputGet(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingApi#call07retailMediaBillingPartnerReportRequestIdOutputGet");
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
| **requestId** | **String**| The id of a Partner Billing Report request. | |

### Return type

[**File**](File.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/csv, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |


## call07retailMediaBillingPartnerReportRequestIdStatusGet

> EntityResourceOutcomePartnerBillingReportStatusV1 call07retailMediaBillingPartnerReportRequestIdStatusGet(requestId)



Get the status of an existing Partner Billing Report.

### Example

```java
package com.criteo.api.retailmedia.v2025_07;

import com.criteo.api.retailmedia.v2025_07.ApiClient;
import com.criteo.api.retailmedia.v2025_07.ApiClientBuilder;
import com.criteo.api.retailmedia.v2025_07.ApiException;
import com.criteo.api.retailmedia.v2025_07.Configuration;
import com.criteo.api.retailmedia.v2025_07.auth.*;
import com.criteo.api.retailmedia.v2025_07.model.*;
import com.criteo.api.retailmedia.v2025_07.api.BillingApi;

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

        BillingApi apiInstance = new BillingApi(defaultClient);
        String requestId = "requestId_example"; // String | The id of a Partner Billing Report request.
        try {
            EntityResourceOutcomePartnerBillingReportStatusV1 result = apiInstance.call07retailMediaBillingPartnerReportRequestIdStatusGet(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingApi#call07retailMediaBillingPartnerReportRequestIdStatusGet");
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
| **requestId** | **String**| The id of a Partner Billing Report request. | |

### Return type

[**EntityResourceOutcomePartnerBillingReportStatusV1**](EntityResourceOutcomePartnerBillingReportStatusV1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

