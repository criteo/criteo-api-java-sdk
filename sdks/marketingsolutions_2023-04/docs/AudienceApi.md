# AudienceApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAudience**](AudienceApi.md#createAudience) | **POST** /2023-04/audiences |  |
| [**deleteIdentifiers**](AudienceApi.md#deleteIdentifiers) | **DELETE** /2023-04/audiences/{audience-id}/contactlist |  |
| [**getAudiences**](AudienceApi.md#getAudiences) | **GET** /2023-04/audiences |  |
| [**modifyAudience**](AudienceApi.md#modifyAudience) | **PATCH** /2023-04/audiences/{audience-id} |  |
| [**modifyAudienceUsers**](AudienceApi.md#modifyAudienceUsers) | **PATCH** /2023-04/audiences/{audience-id}/contactlist |  |
| [**removeAudience**](AudienceApi.md#removeAudience) | **DELETE** /2023-04/audiences/{audience-id} |  |



## createAudience

> NewAudienceResponse createAudience(newAudienceRequest)



Create an Audience for an Advertiser

### Example

```java
package com.criteo.api.marketingsolutions.v2023_04;

import com.criteo.api.marketingsolutions.v2023_04.ApiClient;
import com.criteo.api.marketingsolutions.v2023_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_04.ApiException;
import com.criteo.api.marketingsolutions.v2023_04.Configuration;
import com.criteo.api.marketingsolutions.v2023_04.auth.*;
import com.criteo.api.marketingsolutions.v2023_04.model.*;
import com.criteo.api.marketingsolutions.v2023_04.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        NewAudienceRequest newAudienceRequest = new NewAudienceRequest(); // NewAudienceRequest | 
        try {
            NewAudienceResponse result = apiInstance.createAudience(newAudienceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#createAudience");
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
| **newAudienceRequest** | [**NewAudienceRequest**](NewAudienceRequest.md)|  | |

### Return type

[**NewAudienceResponse**](NewAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The audience was created |  -  |
| **403** | Forbidden |  -  |


## deleteIdentifiers

> DeleteAudienceContactListResponse deleteIdentifiers(audienceId)



Delete all identifiers from a contact list audience-segment.

### Example

```java
package com.criteo.api.marketingsolutions.v2023_04;

import com.criteo.api.marketingsolutions.v2023_04.ApiClient;
import com.criteo.api.marketingsolutions.v2023_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_04.ApiException;
import com.criteo.api.marketingsolutions.v2023_04.Configuration;
import com.criteo.api.marketingsolutions.v2023_04.auth.*;
import com.criteo.api.marketingsolutions.v2023_04.model.*;
import com.criteo.api.marketingsolutions.v2023_04.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The id of the audience to amend
        try {
            DeleteAudienceContactListResponse result = apiInstance.deleteIdentifiers(audienceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#deleteIdentifiers");
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
| **audienceId** | **String**| The id of the audience to amend | |

### Return type

[**DeleteAudienceContactListResponse**](DeleteAudienceContactListResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The contactlist was deleted |  -  |
| **403** | Forbidden |  -  |


## getAudiences

> GetAudiencesResponse getAudiences(advertiserId)



Get a list of all the audiences for the user or for the given advertiser_id

### Example

```java
package com.criteo.api.marketingsolutions.v2023_04;

import com.criteo.api.marketingsolutions.v2023_04.ApiClient;
import com.criteo.api.marketingsolutions.v2023_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_04.ApiException;
import com.criteo.api.marketingsolutions.v2023_04.Configuration;
import com.criteo.api.marketingsolutions.v2023_04.auth.*;
import com.criteo.api.marketingsolutions.v2023_04.model.*;
import com.criteo.api.marketingsolutions.v2023_04.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        String advertiserId = "advertiserId_example"; // String | The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don't provide it, we will take into account the advertisers from your portfolio
        try {
            GetAudiencesResponse result = apiInstance.getAudiences(advertiserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#getAudiences");
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
| **advertiserId** | **String**| The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don&#39;t provide it, we will take into account the advertisers from your portfolio | [optional] |

### Return type

[**GetAudiencesResponse**](GetAudiencesResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list was retrieved. |  -  |
| **403** | Forbidden |  -  |


## modifyAudience

> ReplaceAudienceResponse modifyAudience(audienceId, replaceAudienceRequest)



Update user audience specified by the audience id

### Example

```java
package com.criteo.api.marketingsolutions.v2023_04;

import com.criteo.api.marketingsolutions.v2023_04.ApiClient;
import com.criteo.api.marketingsolutions.v2023_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_04.ApiException;
import com.criteo.api.marketingsolutions.v2023_04.Configuration;
import com.criteo.api.marketingsolutions.v2023_04.auth.*;
import com.criteo.api.marketingsolutions.v2023_04.model.*;
import com.criteo.api.marketingsolutions.v2023_04.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The id of the audience to amend
        ReplaceAudienceRequest replaceAudienceRequest = new ReplaceAudienceRequest(); // ReplaceAudienceRequest | 
        try {
            ReplaceAudienceResponse result = apiInstance.modifyAudience(audienceId, replaceAudienceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#modifyAudience");
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
| **audienceId** | **String**| The id of the audience to amend | |
| **replaceAudienceRequest** | [**ReplaceAudienceRequest**](ReplaceAudienceRequest.md)|  | |

### Return type

[**ReplaceAudienceResponse**](ReplaceAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The audience was updated |  -  |
| **403** | Forbidden |  -  |


## modifyAudienceUsers

> ModifyAudienceResponse modifyAudienceUsers(audienceId, contactlistAmendmentRequest)



Add/remove users to or from a contact list audience-segment.

### Example

```java
package com.criteo.api.marketingsolutions.v2023_04;

import com.criteo.api.marketingsolutions.v2023_04.ApiClient;
import com.criteo.api.marketingsolutions.v2023_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_04.ApiException;
import com.criteo.api.marketingsolutions.v2023_04.Configuration;
import com.criteo.api.marketingsolutions.v2023_04.auth.*;
import com.criteo.api.marketingsolutions.v2023_04.model.*;
import com.criteo.api.marketingsolutions.v2023_04.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The id of the audience to amend
        ContactlistAmendmentRequest contactlistAmendmentRequest = new ContactlistAmendmentRequest(); // ContactlistAmendmentRequest | 
        try {
            ModifyAudienceResponse result = apiInstance.modifyAudienceUsers(audienceId, contactlistAmendmentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#modifyAudienceUsers");
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
| **audienceId** | **String**| The id of the audience to amend | |
| **contactlistAmendmentRequest** | [**ContactlistAmendmentRequest**](ContactlistAmendmentRequest.md)|  | |

### Return type

[**ModifyAudienceResponse**](ModifyAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Summary of created request |  -  |
| **403** | Forbidden |  -  |
| **404** | Audience 123 not found |  -  |


## removeAudience

> DeleteAudienceResponse removeAudience(audienceId)



Delete an audience by id

### Example

```java
package com.criteo.api.marketingsolutions.v2023_04;

import com.criteo.api.marketingsolutions.v2023_04.ApiClient;
import com.criteo.api.marketingsolutions.v2023_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2023_04.ApiException;
import com.criteo.api.marketingsolutions.v2023_04.Configuration;
import com.criteo.api.marketingsolutions.v2023_04.auth.*;
import com.criteo.api.marketingsolutions.v2023_04.model.*;
import com.criteo.api.marketingsolutions.v2023_04.api.AudienceApi;

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

        AudienceApi apiInstance = new AudienceApi(defaultClient);
        String audienceId = "audienceId_example"; // String | The id of the audience to amend
        try {
            DeleteAudienceResponse result = apiInstance.removeAudience(audienceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudienceApi#removeAudience");
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
| **audienceId** | **String**| The id of the audience to amend | |

### Return type

[**DeleteAudienceResponse**](DeleteAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The audience was deleted |  -  |
| **403** | Forbidden |  -  |

