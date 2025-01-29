# CatalogApi

All URIs are relative to *https://api.criteo.com*. Please check the detailed instructions about this API at [https://developers.criteo.com/](https://developers.criteo.com/).

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**previewRetailMediaCatalogProductsBatchPost**](CatalogApi.md#previewRetailMediaCatalogProductsBatchPost) | **POST** /preview/retail-media/catalog/products/batch |  |
| [**previewRetailMediaCatalogProductsBatchReportOperationTokenGet**](CatalogApi.md#previewRetailMediaCatalogProductsBatchReportOperationTokenGet) | **GET** /preview/retail-media/catalog/products/batch/report/{operation-token} |  |
| [**searchBrandsByNameAsyncV1**](CatalogApi.md#searchBrandsByNameAsyncV1) | **POST** /preview/retail-media/brands/search |  |



## previewRetailMediaCatalogProductsBatchPost

> BatchAcceptedResponse previewRetailMediaCatalogProductsBatchPost(productsCustomBatchRequest)



Used to publish a batch of operations to insert, update and deletes products.  The batch is processed asynchronously.The response provides an operationToken which can be used to track  the status of the report of the operation.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CatalogApi;

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

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        ProductsCustomBatchRequest productsCustomBatchRequest = new ProductsCustomBatchRequest(); // ProductsCustomBatchRequest | 
        try {
            BatchAcceptedResponse result = apiInstance.previewRetailMediaCatalogProductsBatchPost(productsCustomBatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#previewRetailMediaCatalogProductsBatchPost");
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
| **productsCustomBatchRequest** | [**ProductsCustomBatchRequest**](ProductsCustomBatchRequest.md)|  | |

### Return type

[**BatchAcceptedResponse**](BatchAcceptedResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch accepted. The status of the operation can be tracked using the report endpoint and the operationToken. |  -  |
| **400** | Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;json-format\&quot;)] |  -  |
| **401** | Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] |  -  |
| **403** | Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] |  -  |
| **413** | Request too large. By default, payload up to 16 MB is rejected. |  -  |
| **429** | Too Many Requests. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;too-many-requests\&quot;)] |  -  |
| **500** | Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] |  -  |
| **503** | Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] |  -  |


## previewRetailMediaCatalogProductsBatchReportOperationTokenGet

> ReportOkResponse previewRetailMediaCatalogProductsBatchReportOperationTokenGet(operationToken)



Get the report of an asynchronous batch operation previously requested

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CatalogApi;

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

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        String operationToken = "operationToken_example"; // String | The token returned by the batch endpoint.
        try {
            ReportOkResponse result = apiInstance.previewRetailMediaCatalogProductsBatchReportOperationTokenGet(operationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#previewRetailMediaCatalogProductsBatchReportOperationTokenGet");
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
| **operationToken** | **String**| The token returned by the batch endpoint. | |

### Return type

[**ReportOkResponse**](ReportOkResponse.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The report object |  -  |
| **400** | Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-token-is-malformed\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-report-is-expired\&quot;)] |  -  |
| **401** | Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] |  -  |
| **403** | Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] |  -  |
| **404** | Not Found. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-not-found\&quot;)] |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] |  -  |
| **503** | Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] |  -  |


## searchBrandsByNameAsyncV1

> EntityResourceCollectionOutcomeBrandIdSearchResult searchBrandsByNameAsyncV1(offset, limit, valueResourceInputBrandIdSearchRequest)



Search for brands given a retailer ID and search term.

### Example

```java
package com.criteo.api.retailmedia.preview;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.model.*;
import com.criteo.api.retailmedia.preview.api.CatalogApi;

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

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        Integer offset = 0; // Integer | offset of paginated results
        Integer limit = 25; // Integer | the number of brands to return
        ValueResourceInputBrandIdSearchRequest valueResourceInputBrandIdSearchRequest = new ValueResourceInputBrandIdSearchRequest(); // ValueResourceInputBrandIdSearchRequest | BrandIdSearchRequest which contains the request parameters
        try {
            EntityResourceCollectionOutcomeBrandIdSearchResult result = apiInstance.searchBrandsByNameAsyncV1(offset, limit, valueResourceInputBrandIdSearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#searchBrandsByNameAsyncV1");
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
| **offset** | **Integer**| offset of paginated results | [optional] [default to 0] |
| **limit** | **Integer**| the number of brands to return | [optional] [default to 25] |
| **valueResourceInputBrandIdSearchRequest** | [**ValueResourceInputBrandIdSearchRequest**](ValueResourceInputBrandIdSearchRequest.md)| BrandIdSearchRequest which contains the request parameters | [optional] |

### Return type

[**EntityResourceCollectionOutcomeBrandIdSearchResult**](EntityResourceCollectionOutcomeBrandIdSearchResult.md)

### Authorization

[oauth](../README.md#oauth), [oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

