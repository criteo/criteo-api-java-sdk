# CatalogApi

All URIs are relative to *https://api.criteo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**previewCatalogProductsBatchPost**](CatalogApi.md#previewCatalogProductsBatchPost) | **POST** /preview/catalog/products/batch |  |
| [**previewCatalogProductsBatchReportOperationTokenGet**](CatalogApi.md#previewCatalogProductsBatchReportOperationTokenGet) | **GET** /preview/catalog/products/batch/report/{operation-token} |  |



## previewCatalogProductsBatchPost

> BatchAcceptedResponse previewCatalogProductsBatchPost(productsCustomBatchRequest)



Used to publish a batch of operations to insert, update and deletes products.  The batch is processed asynchronously.The response provides an operationToken which can be used to track  the status of the report of the operation.

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.CatalogApi;

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

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        ProductsCustomBatchRequest productsCustomBatchRequest = new ProductsCustomBatchRequest(); // ProductsCustomBatchRequest | 
        try {
            BatchAcceptedResponse result = apiInstance.previewCatalogProductsBatchPost(productsCustomBatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#previewCatalogProductsBatchPost");
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

[oauth](../README.md#oauth)

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


## previewCatalogProductsBatchReportOperationTokenGet

> ReportOkResponse previewCatalogProductsBatchReportOperationTokenGet(operationToken)



Get the report of an asynchronous batch operation previously requested

### Example

```java
package com.criteo.api.marketingsolutions.preview;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.model.*;
import com.criteo.api.marketingsolutions.preview.api.CatalogApi;

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

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        String operationToken = "operationToken_example"; // String | The token returned by the batch endpoint.
        try {
            ReportOkResponse result = apiInstance.previewCatalogProductsBatchReportOperationTokenGet(operationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#previewCatalogProductsBatchReportOperationTokenGet");
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

[oauth](../README.md#oauth)

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

