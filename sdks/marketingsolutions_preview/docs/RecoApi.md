# RecoApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProductSet**](RecoApi.md#createProductSet) | **POST** /preview/product-sets |  |
| [**fetchProductSet**](RecoApi.md#fetchProductSet) | **GET** /preview/product-sets/{product-set-id} |  |
| [**fetchProductSets**](RecoApi.md#fetchProductSets) | **GET** /preview/product-sets/dataset/{dataset-id} |  |
| [**previewProductSetsPreviewPost**](RecoApi.md#previewProductSetsPreviewPost) | **POST** /preview/product-sets/preview |  |
| [**removeProductSet**](RecoApi.md#removeProductSet) | **DELETE** /preview/product-sets/{product-set-id} |  |



## createProductSet

> ResourceOutcomeOfProductSet createProductSet(valueResourceInputOfCreateProductSetRequest)



Create a new product set

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.RecoApi;

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

        RecoApi apiInstance = new RecoApi(defaultClient);
        ValueResourceInputOfCreateProductSetRequest valueResourceInputOfCreateProductSetRequest = new ValueResourceInputOfCreateProductSetRequest(); // ValueResourceInputOfCreateProductSetRequest | 
        try {
            ResourceOutcomeOfProductSet result = apiInstance.createProductSet(valueResourceInputOfCreateProductSetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecoApi#createProductSet");
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
| **valueResourceInputOfCreateProductSetRequest** | [**ValueResourceInputOfCreateProductSetRequest**](ValueResourceInputOfCreateProductSetRequest.md)|  | [optional] |

### Return type

[**ResourceOutcomeOfProductSet**](ResourceOutcomeOfProductSet.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product set created successfully |  -  |
| **400** | Unable to parse the request parameters |  -  |
| **422** | Cannot process entity content |  -  |
| **403** | Operation forbidden |  -  |
| **500** | Internal Error |  -  |


## fetchProductSet

> ResourceOutcomeOfProductSet fetchProductSet(productSetId)



Fetch an existing product set

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.RecoApi;

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

        RecoApi apiInstance = new RecoApi(defaultClient);
        String productSetId = "productSetId_example"; // String | ID of the product set
        try {
            ResourceOutcomeOfProductSet result = apiInstance.fetchProductSet(productSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecoApi#fetchProductSet");
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
| **productSetId** | **String**| ID of the product set | |

### Return type

[**ResourceOutcomeOfProductSet**](ResourceOutcomeOfProductSet.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product set fetched successfully |  -  |
| **400** | Unable to parse the request parameters |  -  |
| **403** | Operation forbidden |  -  |
| **500** | Internal Error |  -  |


## fetchProductSets

> ResourceCollectionOutcomeOfProductSet fetchProductSets(datasetId)



Fetch product sets of a given dataset

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.RecoApi;

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

        RecoApi apiInstance = new RecoApi(defaultClient);
        String datasetId = "datasetId_example"; // String | The ID of the dataset that should be used for product set retrieval
        try {
            ResourceCollectionOutcomeOfProductSet result = apiInstance.fetchProductSets(datasetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecoApi#fetchProductSets");
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
| **datasetId** | **String**| The ID of the dataset that should be used for product set retrieval | |

### Return type

[**ResourceCollectionOutcomeOfProductSet**](ResourceCollectionOutcomeOfProductSet.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Products sets fetched successfully |  -  |
| **400** | Unable to parse the request parameters |  -  |
| **403** | Operation forbidden |  -  |
| **500** | Internal Error |  -  |


## previewProductSetsPreviewPost

> OkResponse previewProductSetsPreviewPost(productSetStatisticsQuery)



Display a preview of product set rules

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.RecoApi;

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

        RecoApi apiInstance = new RecoApi(defaultClient);
        ProductSetStatisticsQuery productSetStatisticsQuery = new ProductSetStatisticsQuery(); // ProductSetStatisticsQuery | 
        try {
            OkResponse result = apiInstance.previewProductSetsPreviewPost(productSetStatisticsQuery);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecoApi#previewProductSetsPreviewPost");
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
| **productSetStatisticsQuery** | [**ProductSetStatisticsQuery**](ProductSetStatisticsQuery.md)|  | |

### Return type

[**OkResponse**](OkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Authorization Error |  -  |
| **500** | Internal Error |  -  |


## removeProductSet

> Outcome removeProductSet(productSetId)



Remove a product set

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.RecoApi;

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

        RecoApi apiInstance = new RecoApi(defaultClient);
        String productSetId = "productSetId_example"; // String | ID of the product set to remove
        try {
            Outcome result = apiInstance.removeProductSet(productSetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecoApi#removeProductSet");
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
| **productSetId** | **String**| ID of the product set to remove | |

### Return type

[**Outcome**](Outcome.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | ProductSet removed successfully |  -  |
| **400** | Request was not valid |  -  |
| **403** | Operation forbidden |  -  |
| **500** | Internal Error |  -  |

