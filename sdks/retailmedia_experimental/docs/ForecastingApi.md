# ForecastingApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**computeOnsiteDisplayForecast**](ForecastingApi.md#computeOnsiteDisplayForecast) | **POST** /experimental/retail-media/accounts/{account-id}/compute-onsite-display-forecast | /experimental/retail-media/accounts/{account-id}/compute-onsite-display-forecast |



## computeOnsiteDisplayForecast

> OnsiteDisplayForecastListResponse computeOnsiteDisplayForecast(accountId, computeOnsiteDisplayForecastRequest)

/experimental/retail-media/accounts/{account-id}/compute-onsite-display-forecast

Computes a forecast of available impressions and budget for a retailer account. &lt;br /&gt; This endpoint is subject to specific rate limits.

### Example

```java
package com.criteo.api.retailmedia.experimental;

import com.criteo.api.retailmedia.experimental.ApiClient;
import com.criteo.api.retailmedia.experimental.ApiClientBuilder;
import com.criteo.api.retailmedia.experimental.ApiException;
import com.criteo.api.retailmedia.experimental.Configuration;
import com.criteo.api.retailmedia.experimental.auth.*;
import com.criteo.api.retailmedia.experimental.model.*;
import com.criteo.api.retailmedia.experimental.api.ForecastingApi;

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

        ForecastingApi apiInstance = new ForecastingApi(defaultClient);
        String accountId = "accountId_example"; // String | ID of the retailer account for which to compute the onsite display forecast.
        ComputeOnsiteDisplayForecastRequest computeOnsiteDisplayForecastRequest = new ComputeOnsiteDisplayForecastRequest(); // ComputeOnsiteDisplayForecastRequest | Forecast computation parameters.
        try {
            OnsiteDisplayForecastListResponse result = apiInstance.computeOnsiteDisplayForecast(accountId, computeOnsiteDisplayForecastRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ForecastingApi#computeOnsiteDisplayForecast");
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
| **accountId** | **String**| ID of the retailer account for which to compute the onsite display forecast. | |
| **computeOnsiteDisplayForecastRequest** | [**ComputeOnsiteDisplayForecastRequest**](ComputeOnsiteDisplayForecastRequest.md)| Forecast computation parameters. | |

### Return type

[**OnsiteDisplayForecastListResponse**](OnsiteDisplayForecastListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

