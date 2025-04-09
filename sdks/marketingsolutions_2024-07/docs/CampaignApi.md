# CampaignApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAdSetV24Q1**](CampaignApi.md#createAdSetV24Q1) | **POST** /2024-07/marketing-solutions/ad-sets |  |
| [**createCampaign**](CampaignApi.md#createCampaign) | **POST** /2024-07/marketing-solutions/campaigns |  |
| [**getAdSetV24Q1**](CampaignApi.md#getAdSetV24Q1) | **GET** /2024-07/marketing-solutions/ad-sets/{ad-set-id} |  |
| [**getCampaignV23Q1**](CampaignApi.md#getCampaignV23Q1) | **GET** /2024-07/marketing-solutions/campaigns/{campaign-id} |  |
| [**getCategoryBidList**](CampaignApi.md#getCategoryBidList) | **GET** /2024-07/marketing-solutions/ad-sets/{ad-set-id}/category-bids |  |
| [**getDisplayMultipliers**](CampaignApi.md#getDisplayMultipliers) | **GET** /2024-07/marketing-solutions/ad-sets/{ad-set-id}/display-multipliers |  |
| [**patchAdSetsV24Q1**](CampaignApi.md#patchAdSetsV24Q1) | **PATCH** /2024-07/marketing-solutions/ad-sets |  |
| [**patchCampaigns**](CampaignApi.md#patchCampaigns) | **PATCH** /2024-07/marketing-solutions/campaigns |  |
| [**patchCategoryBidList**](CampaignApi.md#patchCategoryBidList) | **PATCH** /2024-07/marketing-solutions/ad-sets/{ad-set-id}/category-bids |  |
| [**patchDisplayMultipliers**](CampaignApi.md#patchDisplayMultipliers) | **PATCH** /2024-07/marketing-solutions/ad-sets/{ad-set-id}/display-multipliers |  |
| [**searchAdSetsV24Q1**](CampaignApi.md#searchAdSetsV24Q1) | **POST** /2024-07/marketing-solutions/ad-sets/search |  |
| [**searchCampaignsV23Q1**](CampaignApi.md#searchCampaignsV23Q1) | **POST** /2024-07/marketing-solutions/campaigns/search |  |
| [**startAdSets**](CampaignApi.md#startAdSets) | **POST** /2024-07/marketing-solutions/ad-sets/start |  |
| [**stopAdSets**](CampaignApi.md#stopAdSets) | **POST** /2024-07/marketing-solutions/ad-sets/stop |  |
| [**updateAdSetAudience**](CampaignApi.md#updateAdSetAudience) | **PUT** /2024-07/marketing-solutions/ad-sets/{ad-set-id}/audience |  |



## createAdSetV24Q1

> ResponseReadAdSetV24Q1 createAdSetV24Q1(createAdSetV24Q1Request)



Create the specified ad set

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        CreateAdSetV24Q1Request createAdSetV24Q1Request = new CreateAdSetV24Q1Request(); // CreateAdSetV24Q1Request | the ad sets to create
        try {
            ResponseReadAdSetV24Q1 result = apiInstance.createAdSetV24Q1(createAdSetV24Q1Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createAdSetV24Q1");
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
| **createAdSetV24Q1Request** | [**CreateAdSetV24Q1Request**](CreateAdSetV24Q1Request.md)| the ad sets to create | |

### Return type

[**ResponseReadAdSetV24Q1**](ResponseReadAdSetV24Q1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The ad set that has been created and errors / warnings |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |


## createCampaign

> CampaignV23Q1Response createCampaign(createCampaignRequest)



Create the specified campaign

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        CreateCampaignRequest createCampaignRequest = new CreateCampaignRequest(); // CreateCampaignRequest | the campaigns to create
        try {
            CampaignV23Q1Response result = apiInstance.createCampaign(createCampaignRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#createCampaign");
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
| **createCampaignRequest** | [**CreateCampaignRequest**](CreateCampaignRequest.md)| the campaigns to create | |

### Return type

[**CampaignV23Q1Response**](CampaignV23Q1Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The campaign that has been created and errors / warnings |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |


## getAdSetV24Q1

> ResponseReadAdSetV24Q1 getAdSetV24Q1(adSetId)



Get the data for the specified ad set

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String adSetId = "adSetId_example"; // String | Id of the ad set
        try {
            ResponseReadAdSetV24Q1 result = apiInstance.getAdSetV24Q1(adSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getAdSetV24Q1");
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
| **adSetId** | **String**| Id of the ad set | |

### Return type

[**ResponseReadAdSetV24Q1**](ResponseReadAdSetV24Q1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | data for the ad set |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## getCampaignV23Q1

> CampaignV23Q1Response getCampaignV23Q1(campaignId)



Get the data for the specified campaign

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String campaignId = "campaignId_example"; // String | Id of the campaign
        try {
            CampaignV23Q1Response result = apiInstance.getCampaignV23Q1(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCampaignV23Q1");
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
| **campaignId** | **String**| Id of the campaign | |

### Return type

[**CampaignV23Q1Response**](CampaignV23Q1Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | data for the campaign |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## getCategoryBidList

> AdSetCategoryBidListResponse getCategoryBidList(adSetId)



Get the Category Bids for all valid Categories associated to an Ad Set

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String adSetId = "adSetId_example"; // String | Id of the Ad Set
        try {
            AdSetCategoryBidListResponse result = apiInstance.getCategoryBidList(adSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getCategoryBidList");
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
| **adSetId** | **String**| Id of the Ad Set | |

### Return type

[**AdSetCategoryBidListResponse**](AdSetCategoryBidListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Category Bids for all valid Categories associated to an Ad Set. |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## getDisplayMultipliers

> AdSetDisplayMultiplierListResponse getDisplayMultipliers(adSetId)



Get the Display Multipliers for all valid Categories associated to an Ad Set

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String adSetId = "adSetId_example"; // String | Id of the Ad Set
        try {
            AdSetDisplayMultiplierListResponse result = apiInstance.getDisplayMultipliers(adSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getDisplayMultipliers");
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
| **adSetId** | **String**| Id of the Ad Set | |

### Return type

[**AdSetDisplayMultiplierListResponse**](AdSetDisplayMultiplierListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Display Multipliers for all valid Categories associated to an Ad Set. |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## patchAdSetsV24Q1

> ResponsesAdSetIdV24Q1 patchAdSetsV24Q1(requestsPatchAdSetV24Q1)



Patch a list of AdSets.

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        RequestsPatchAdSetV24Q1 requestsPatchAdSetV24Q1 = new RequestsPatchAdSetV24Q1(); // RequestsPatchAdSetV24Q1 | List of adsets to patch.
        try {
            ResponsesAdSetIdV24Q1 result = apiInstance.patchAdSetsV24Q1(requestsPatchAdSetV24Q1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#patchAdSetsV24Q1");
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
| **requestsPatchAdSetV24Q1** | [**RequestsPatchAdSetV24Q1**](RequestsPatchAdSetV24Q1.md)| List of adsets to patch. | [optional] |

### Return type

[**ResponsesAdSetIdV24Q1**](ResponsesAdSetIdV24Q1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of patched adSets. |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## patchCampaigns

> PatchResultCampaignListResponse patchCampaigns(patchCampaignListRequest)



Patch a list of Campaigns.

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        PatchCampaignListRequest patchCampaignListRequest = new PatchCampaignListRequest(); // PatchCampaignListRequest | List of campaigns to patch.
        try {
            PatchResultCampaignListResponse result = apiInstance.patchCampaigns(patchCampaignListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#patchCampaigns");
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
| **patchCampaignListRequest** | [**PatchCampaignListRequest**](PatchCampaignListRequest.md)| List of campaigns to patch. | [optional] |

### Return type

[**PatchResultCampaignListResponse**](PatchResultCampaignListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of patched campaigns. |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## patchCategoryBidList

> PatchAdSetCategoryBidResultListResponse patchCategoryBidList(adSetId, patchAdSetCategoryBidListRequest)



Patch Category Bids for one or more Categories in a single request. Partial success policy is followed.

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String adSetId = "adSetId_example"; // String | Id of the Ad Set
        PatchAdSetCategoryBidListRequest patchAdSetCategoryBidListRequest = new PatchAdSetCategoryBidListRequest(); // PatchAdSetCategoryBidListRequest | 
        try {
            PatchAdSetCategoryBidResultListResponse result = apiInstance.patchCategoryBidList(adSetId, patchAdSetCategoryBidListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#patchCategoryBidList");
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
| **adSetId** | **String**| Id of the Ad Set | |
| **patchAdSetCategoryBidListRequest** | [**PatchAdSetCategoryBidListRequest**](PatchAdSetCategoryBidListRequest.md)|  | [optional] |

### Return type

[**PatchAdSetCategoryBidResultListResponse**](PatchAdSetCategoryBidResultListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of updated Category Bids for given Categories associated to an Ad Set. |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## patchDisplayMultipliers

> PatchAdSetDisplayMultiplierResultListResponse patchDisplayMultipliers(adSetId, patchAdSetDisplayMultiplierListRequest)



Patch Display Multipliers for one or more Categories in a single request. Partial success policy is followed.

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String adSetId = "adSetId_example"; // String | Id of the Ad Set
        PatchAdSetDisplayMultiplierListRequest patchAdSetDisplayMultiplierListRequest = new PatchAdSetDisplayMultiplierListRequest(); // PatchAdSetDisplayMultiplierListRequest | 
        try {
            PatchAdSetDisplayMultiplierResultListResponse result = apiInstance.patchDisplayMultipliers(adSetId, patchAdSetDisplayMultiplierListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#patchDisplayMultipliers");
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
| **adSetId** | **String**| Id of the Ad Set | |
| **patchAdSetDisplayMultiplierListRequest** | [**PatchAdSetDisplayMultiplierListRequest**](PatchAdSetDisplayMultiplierListRequest.md)|  | [optional] |

### Return type

[**PatchAdSetDisplayMultiplierResultListResponse**](PatchAdSetDisplayMultiplierResultListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of updated Display Multipliers for given Categories associated to an Ad Set. |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## searchAdSetsV24Q1

> ResponsesReadAdSetV24Q1 searchAdSetsV24Q1(adSetSearchRequestV24Q1)



Search for ad sets

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        AdSetSearchRequestV24Q1 adSetSearchRequestV24Q1 = new AdSetSearchRequestV24Q1(); // AdSetSearchRequestV24Q1 | 
        try {
            ResponsesReadAdSetV24Q1 result = apiInstance.searchAdSetsV24Q1(adSetSearchRequestV24Q1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#searchAdSetsV24Q1");
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
| **adSetSearchRequestV24Q1** | [**AdSetSearchRequestV24Q1**](AdSetSearchRequestV24Q1.md)|  | [optional] |

### Return type

[**ResponsesReadAdSetV24Q1**](ResponsesReadAdSetV24Q1.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | data for the ad sets |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |


## searchCampaignsV23Q1

> CampaignV23Q1ListResponse searchCampaignsV23Q1(campaignSearchRequestV23Q1)



Search for campaigns

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        CampaignSearchRequestV23Q1 campaignSearchRequestV23Q1 = new CampaignSearchRequestV23Q1(); // CampaignSearchRequestV23Q1 | filters on campaigns
        try {
            CampaignV23Q1ListResponse result = apiInstance.searchCampaignsV23Q1(campaignSearchRequestV23Q1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#searchCampaignsV23Q1");
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
| **campaignSearchRequestV23Q1** | [**CampaignSearchRequestV23Q1**](CampaignSearchRequestV23Q1.md)| filters on campaigns | [optional] |

### Return type

[**CampaignV23Q1ListResponse**](CampaignV23Q1ListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | data for the campaigns |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | Forbidden |  -  |


## startAdSets

> ResponsesAdSetId startAdSets(requestsAdSetId)



Start the specified list of ad sets

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        RequestsAdSetId requestsAdSetId = new RequestsAdSetId(); // RequestsAdSetId | All the ad sets to start
        try {
            ResponsesAdSetId result = apiInstance.startAdSets(requestsAdSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#startAdSets");
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
| **requestsAdSetId** | [**RequestsAdSetId**](RequestsAdSetId.md)| All the ad sets to start | [optional] |

### Return type

[**ResponsesAdSetId**](ResponsesAdSetId.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of ad sets that have been started and errors / warnings by ad set |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |


## stopAdSets

> ResponsesAdSetId stopAdSets(requestsAdSetId)



Stop the specified list of ad sets

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        RequestsAdSetId requestsAdSetId = new RequestsAdSetId(); // RequestsAdSetId | All the ad sets to stop
        try {
            ResponsesAdSetId result = apiInstance.stopAdSets(requestsAdSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#stopAdSets");
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
| **requestsAdSetId** | [**RequestsAdSetId**](RequestsAdSetId.md)| All the ad sets to stop | [optional] |

### Return type

[**ResponsesAdSetId**](ResponsesAdSetId.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of ad sets that have been stopped and errors / warnings by ad set |  -  |
| **400** | Bad Request |  -  |
| **401** | The API client is not properly authenticated. |  -  |


## updateAdSetAudience

> AdSetAudienceLinkEntityV1Response updateAdSetAudience(adSetId, adSetAudienceLinkInputEntityV1)



Link or unlink an audience with an ad set

### Example

```java
package com.criteo.api.marketingsolutions.v2024_07;

import com.criteo.api.marketingsolutions.v2024_07.ApiClient;
import com.criteo.api.marketingsolutions.v2024_07.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2024_07.ApiException;
import com.criteo.api.marketingsolutions.v2024_07.Configuration;
import com.criteo.api.marketingsolutions.v2024_07.auth.*;
import com.criteo.api.marketingsolutions.v2024_07.model.*;
import com.criteo.api.marketingsolutions.v2024_07.api.CampaignApi;

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

        CampaignApi apiInstance = new CampaignApi(defaultClient);
        String adSetId = "adSetId_example"; // String | The ad set ID.
        AdSetAudienceLinkInputEntityV1 adSetAudienceLinkInputEntityV1 = new AdSetAudienceLinkInputEntityV1(); // AdSetAudienceLinkInputEntityV1 | Ad set-Audience update request.
        try {
            AdSetAudienceLinkEntityV1Response result = apiInstance.updateAdSetAudience(adSetId, adSetAudienceLinkInputEntityV1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#updateAdSetAudience");
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
| **adSetId** | **String**| The ad set ID. | |
| **adSetAudienceLinkInputEntityV1** | [**AdSetAudienceLinkInputEntityV1**](AdSetAudienceLinkInputEntityV1.md)| Ad set-Audience update request. | |

### Return type

[**AdSetAudienceLinkEntityV1Response**](AdSetAudienceLinkEntityV1Response.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | The API client is not properly authenticated. |  -  |
| **403** | The API client is not authorized to access this resource. |  -  |

