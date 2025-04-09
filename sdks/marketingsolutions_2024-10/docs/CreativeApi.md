# CreativeApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAdvertiserAd**](CreativeApi.md#createAdvertiserAd) | **POST** /2024-10/marketing-solutions/advertisers/{advertiser-id}/ads |  |
| [**createAdvertiserCoupon**](CreativeApi.md#createAdvertiserCoupon) | **POST** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons |  |
| [**createAdvertiserCreative**](CreativeApi.md#createAdvertiserCreative) | **POST** /2024-10/marketing-solutions/advertisers/{advertiser-id}/creatives |  |
| [**deleteAd**](CreativeApi.md#deleteAd) | **DELETE** /2024-10/marketing-solutions/ads/{id} |  |
| [**deleteAdvertiserCoupon**](CreativeApi.md#deleteAdvertiserCoupon) | **DELETE** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons/{id} |  |
| [**deleteCreative**](CreativeApi.md#deleteCreative) | **DELETE** /2024-10/marketing-solutions/creatives/{id} |  |
| [**editAdvertiserCoupon**](CreativeApi.md#editAdvertiserCoupon) | **PUT** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons/{id} |  |
| [**editCreative**](CreativeApi.md#editCreative) | **PUT** /2024-10/marketing-solutions/creatives/{id} |  |
| [**generateCreativePreview**](CreativeApi.md#generateCreativePreview) | **POST** /2024-10/marketing-solutions/creatives/{id}/preview |  |
| [**getAd**](CreativeApi.md#getAd) | **GET** /2024-10/marketing-solutions/ads/{id} |  |
| [**getAdvertiserAds**](CreativeApi.md#getAdvertiserAds) | **GET** /2024-10/marketing-solutions/advertisers/{advertiser-id}/ads |  |
| [**getAdvertiserCoupon**](CreativeApi.md#getAdvertiserCoupon) | **GET** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons/{id} |  |
| [**getAdvertiserCouponPreview**](CreativeApi.md#getAdvertiserCouponPreview) | **GET** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons/{id}/preview |  |
| [**getAdvertiserCouponSupportedSizes**](CreativeApi.md#getAdvertiserCouponSupportedSizes) | **GET** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons-supported-sizes |  |
| [**getAdvertiserCoupons**](CreativeApi.md#getAdvertiserCoupons) | **GET** /2024-10/marketing-solutions/advertisers/{advertiser-id}/coupons |  |
| [**getAdvertiserCreatives**](CreativeApi.md#getAdvertiserCreatives) | **GET** /2024-10/marketing-solutions/advertisers/{advertiser-id}/creatives |  |
| [**getCreative**](CreativeApi.md#getCreative) | **GET** /2024-10/marketing-solutions/creatives/{id} |  |



## createAdvertiserAd

> ResourceOutcomeOfAd createAdvertiserAd(advertiserId, resourceInputOfAdWrite)



Create an Ad

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        ResourceInputOfAdWrite resourceInputOfAdWrite = new ResourceInputOfAdWrite(); // ResourceInputOfAdWrite | 
        try {
            ResourceOutcomeOfAd result = apiInstance.createAdvertiserAd(advertiserId, resourceInputOfAdWrite);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#createAdvertiserAd");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **resourceInputOfAdWrite** | [**ResourceInputOfAdWrite**](ResourceInputOfAdWrite.md)|  | |

### Return type

[**ResourceOutcomeOfAd**](ResourceOutcomeOfAd.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Ad is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## createAdvertiserCoupon

> ResourceOutcomeOfCoupon createAdvertiserCoupon(advertiserId, resourceInputOfCreateCoupon)



Create a Coupon

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        ResourceInputOfCreateCoupon resourceInputOfCreateCoupon = new ResourceInputOfCreateCoupon(); // ResourceInputOfCreateCoupon | 
        try {
            ResourceOutcomeOfCoupon result = apiInstance.createAdvertiserCoupon(advertiserId, resourceInputOfCreateCoupon);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#createAdvertiserCoupon");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **resourceInputOfCreateCoupon** | [**ResourceInputOfCreateCoupon**](ResourceInputOfCreateCoupon.md)|  | |

### Return type

[**ResourceOutcomeOfCoupon**](ResourceOutcomeOfCoupon.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Coupon is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## createAdvertiserCreative

> ResourceOutcomeOfCreative createAdvertiserCreative(advertiserId, resourceInputOfCreativeWrite)



Create a Creative

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        ResourceInputOfCreativeWrite resourceInputOfCreativeWrite = new ResourceInputOfCreativeWrite(); // ResourceInputOfCreativeWrite | 
        try {
            ResourceOutcomeOfCreative result = apiInstance.createAdvertiserCreative(advertiserId, resourceInputOfCreativeWrite);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#createAdvertiserCreative");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **resourceInputOfCreativeWrite** | [**ResourceInputOfCreativeWrite**](ResourceInputOfCreativeWrite.md)|  | |

### Return type

[**ResourceOutcomeOfCreative**](ResourceOutcomeOfCreative.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created creative is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## deleteAd

> deleteAd(id)



Delete an Ad

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        Integer id = 56; // Integer | The ad identifier to delete.
        try {
            apiInstance.deleteAd(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#deleteAd");
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
| **id** | **Integer**| The ad identifier to delete. | |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The ad was deleted. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## deleteAdvertiserCoupon

> deleteAdvertiserCoupon(advertiserId, id)



Delete a Coupon

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        String id = "id_example"; // String | The Coupon identifier to delete.
        try {
            apiInstance.deleteAdvertiserCoupon(advertiserId, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#deleteAdvertiserCoupon");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **id** | **String**| The Coupon identifier to delete. | |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The Coupon was deleted. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## deleteCreative

> deleteCreative(id)



Delete a Creative if there are no ads binded to it

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String id = "id_example"; // String | The creative identifier to delete.
        try {
            apiInstance.deleteCreative(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#deleteCreative");
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
| **id** | **String**| The creative identifier to delete. | |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The creative was deleted. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## editAdvertiserCoupon

> ResourceOutcomeOfCoupon editAdvertiserCoupon(advertiserId, id, resourceInputOfUpdateCoupon)



Edit a specific Coupon

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        String id = "id_example"; // String | The Coupon identifier to edit.
        ResourceInputOfUpdateCoupon resourceInputOfUpdateCoupon = new ResourceInputOfUpdateCoupon(); // ResourceInputOfUpdateCoupon | 
        try {
            ResourceOutcomeOfCoupon result = apiInstance.editAdvertiserCoupon(advertiserId, id, resourceInputOfUpdateCoupon);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#editAdvertiserCoupon");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **id** | **String**| The Coupon identifier to edit. | |
| **resourceInputOfUpdateCoupon** | [**ResourceInputOfUpdateCoupon**](ResourceInputOfUpdateCoupon.md)|  | |

### Return type

[**ResourceOutcomeOfCoupon**](ResourceOutcomeOfCoupon.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The edited Coupon is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## editCreative

> ResourceOutcomeOfCreative editCreative(id, resourceInputOfCreativeWrite)



Edit a specific Creative

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String id = "id_example"; // String | The creative identifier to edit.
        ResourceInputOfCreativeWrite resourceInputOfCreativeWrite = new ResourceInputOfCreativeWrite(); // ResourceInputOfCreativeWrite | 
        try {
            ResourceOutcomeOfCreative result = apiInstance.editCreative(id, resourceInputOfCreativeWrite);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#editCreative");
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
| **id** | **String**| The creative identifier to edit. | |
| **resourceInputOfCreativeWrite** | [**ResourceInputOfCreativeWrite**](ResourceInputOfCreativeWrite.md)|  | |

### Return type

[**ResourceOutcomeOfCreative**](ResourceOutcomeOfCreative.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The edited creative is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## generateCreativePreview

> String generateCreativePreview(id, height, width)



Get the preview of a specific Creative

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String id = "id_example"; // String | The Creative identifier to preview.
        Integer height = 56; // Integer | The height of the Creative to preview.
        Integer width = 56; // Integer | The width of the Creative to preview.
        try {
            String result = apiInstance.generateCreativePreview(id, height, width);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#generateCreativePreview");
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
| **id** | **String**| The Creative identifier to preview. | |
| **height** | **Integer**| The height of the Creative to preview. | [optional] |
| **width** | **Integer**| The width of the Creative to preview. | [optional] |

### Return type

**String**

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The preview HTML of a specific Creative is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## getAd

> ResourceOutcomeOfAd getAd(id)



Get an Ad with its id

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        Integer id = 56; // Integer | The ad identifier to retrieve.
        try {
            ResourceOutcomeOfAd result = apiInstance.getAd(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAd");
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
| **id** | **Integer**| The ad identifier to retrieve. | |

### Return type

[**ResourceOutcomeOfAd**](ResourceOutcomeOfAd.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The found ad is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## getAdvertiserAds

> ResourceCollectionOutcomeOfAd getAdvertiserAds(advertiserId, limit, offset)



Get the list of self-services Ads for a given advertiser

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        Integer limit = 56; // Integer | The number of ads to be returned. The default is 50.
        Integer offset = 56; // Integer | The (zero-based) offset into the collection of ads. The default is 0.
        try {
            ResourceCollectionOutcomeOfAd result = apiInstance.getAdvertiserAds(advertiserId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAdvertiserAds");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **limit** | **Integer**| The number of ads to be returned. The default is 50. | [optional] |
| **offset** | **Integer**| The (zero-based) offset into the collection of ads. The default is 0. | [optional] |

### Return type

[**ResourceCollectionOutcomeOfAd**](ResourceCollectionOutcomeOfAd.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of self-services Ads is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## getAdvertiserCoupon

> ResourceOutcomeOfCoupon getAdvertiserCoupon(advertiserId, id)



Get a Coupon with its id

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        String id = "id_example"; // String | The Coupon identifier to retrieve.
        try {
            ResourceOutcomeOfCoupon result = apiInstance.getAdvertiserCoupon(advertiserId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAdvertiserCoupon");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **id** | **String**| The Coupon identifier to retrieve. | |

### Return type

[**ResourceOutcomeOfCoupon**](ResourceOutcomeOfCoupon.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The found Coupon is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## getAdvertiserCouponPreview

> String getAdvertiserCouponPreview(advertiserId, id, height, width)



Get the preview of a specific Coupon

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        String id = "id_example"; // String | The Coupon identifier to preview.
        Integer height = 56; // Integer | The height of the coupon to preview.
        Integer width = 56; // Integer | The width of the coupon to preview.
        try {
            String result = apiInstance.getAdvertiserCouponPreview(advertiserId, id, height, width);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAdvertiserCouponPreview");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **id** | **String**| The Coupon identifier to preview. | |
| **height** | **Integer**| The height of the coupon to preview. | [optional] |
| **width** | **Integer**| The width of the coupon to preview. | [optional] |

### Return type

**String**

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The preview HTML of a specific Coupon is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## getAdvertiserCouponSupportedSizes

> ResourceOutcomeOfCouponSupportedSizes getAdvertiserCouponSupportedSizes(advertiserId, adSetId)



Get the list of Coupon supported sizes

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        String adSetId = "adSetId_example"; // String | The ad set id on which you want to check the Coupon supported sizes.
        try {
            ResourceOutcomeOfCouponSupportedSizes result = apiInstance.getAdvertiserCouponSupportedSizes(advertiserId, adSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAdvertiserCouponSupportedSizes");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **adSetId** | **String**| The ad set id on which you want to check the Coupon supported sizes. | [optional] |

### Return type

[**ResourceOutcomeOfCouponSupportedSizes**](ResourceOutcomeOfCouponSupportedSizes.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of Coupon supported sizes is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## getAdvertiserCoupons

> ResourceCollectionOutcomeOfCoupon getAdvertiserCoupons(advertiserId, limit, offset)



Get the list of self-services Coupons for a given advertiser

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        Integer limit = 56; // Integer | The number of coupons to be returned. The default is 50.
        Integer offset = 56; // Integer | The (zero-based) offset into the collection of coupons. The default is 0.
        try {
            ResourceCollectionOutcomeOfCoupon result = apiInstance.getAdvertiserCoupons(advertiserId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAdvertiserCoupons");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **limit** | **Integer**| The number of coupons to be returned. The default is 50. | [optional] |
| **offset** | **Integer**| The (zero-based) offset into the collection of coupons. The default is 0. | [optional] |

### Return type

[**ResourceCollectionOutcomeOfCoupon**](ResourceCollectionOutcomeOfCoupon.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of self-services Coupons is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **403** | The request was not properly authorized. |  -  |


## getAdvertiserCreatives

> ResourceCollectionOutcomeOfCreative getAdvertiserCreatives(advertiserId, limit, offset)



Get the list of self-services Creatives for a given advertiser

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
        Integer limit = 56; // Integer | The number of creatives to be returned. The default is 50.
        Integer offset = 56; // Integer | The (zero-based) offset into the collection of creatives. The default is 0.
        try {
            ResourceCollectionOutcomeOfCreative result = apiInstance.getAdvertiserCreatives(advertiserId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getAdvertiserCreatives");
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
| **advertiserId** | **String**| The advertiser identifier. | |
| **limit** | **Integer**| The number of creatives to be returned. The default is 50. | [optional] |
| **offset** | **Integer**| The (zero-based) offset into the collection of creatives. The default is 0. | [optional] |

### Return type

[**ResourceCollectionOutcomeOfCreative**](ResourceCollectionOutcomeOfCreative.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of self-services Creatives is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |


## getCreative

> ResourceOutcomeOfCreative getCreative(id)



Get a Creative with its id

### Example

```java
package com.criteo.api.marketingsolutions.v2024_10;

import com.criteo.api.marketingsolutions.v2024_10.ApiClient;
import com.criteo.api.marketingsolutions.v2024_10.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_10.ApiException;
import com.criteo.api.marketingsolutions.v2024_10.Configuration;
import com.criteo.api.marketingsolutions.v2024_10.auth.*;
import com.criteo.api.marketingsolutions.v2024_10.model.*;
import com.criteo.api.marketingsolutions.v2024_10.api.CreativeApi;

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

        CreativeApi apiInstance = new CreativeApi(defaultClient);
        String id = "id_example"; // String | The creative identifier to retrieve.
        try {
            ResourceOutcomeOfCreative result = apiInstance.getCreative(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreativeApi#getCreative");
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
| **id** | **String**| The creative identifier to retrieve. | |

### Return type

[**ResourceOutcomeOfCreative**](ResourceOutcomeOfCreative.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The found creative is returned. |  -  |
| **400** | The request contained invalid parameters. |  -  |
| **401** | The request was not properly authorized. |  -  |
| **500** | A non-request based error occurred on the server. |  -  |

