# CampaignApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteApiV1ExternalBalanceCampaignsByBalanceId**](CampaignApi.md#deleteApiV1ExternalBalanceCampaignsByBalanceId) | **DELETE** /preview/retail-media/balances/{balanceId}/campaigns | 
[**deleteApiV1ExternalLineItemProductsByLineItemId**](CampaignApi.md#deleteApiV1ExternalLineItemProductsByLineItemId) | **DELETE** /preview/retail-media/line-items/{lineItemId}/products | 
[**getApiV0ExternalCatalogOutputByCatalogId**](CampaignApi.md#getApiV0ExternalCatalogOutputByCatalogId) | **GET** /preview/retail-media/catalogs/{catalogId}/output | 
[**getApiV0ExternalCatalogStatusByCatalogId**](CampaignApi.md#getApiV0ExternalCatalogStatusByCatalogId) | **GET** /preview/retail-media/catalogs/{catalogId}/status | 
[**getApiV1ExternalAccountBalancesByAccountId**](CampaignApi.md#getApiV1ExternalAccountBalancesByAccountId) | **GET** /preview/retail-media/accounts/{accountId}/balances | 
[**getApiV1ExternalAccountBrandsByAccountId**](CampaignApi.md#getApiV1ExternalAccountBrandsByAccountId) | **GET** /preview/retail-media/accounts/{accountId}/brands | 
[**getApiV1ExternalAccountCampaignsByAccountId**](CampaignApi.md#getApiV1ExternalAccountCampaignsByAccountId) | **GET** /preview/retail-media/accounts/{accountId}/campaigns | 
[**getApiV1ExternalAccountRetailersByAccountId**](CampaignApi.md#getApiV1ExternalAccountRetailersByAccountId) | **GET** /preview/retail-media/accounts/{accountId}/retailers | 
[**getApiV1ExternalAccounts**](CampaignApi.md#getApiV1ExternalAccounts) | **GET** /preview/retail-media/accounts | 
[**getApiV1ExternalBalanceCampaignsByBalanceId**](CampaignApi.md#getApiV1ExternalBalanceCampaignsByBalanceId) | **GET** /preview/retail-media/balances/{balanceId}/campaigns | 
[**getApiV1ExternalCampaignByCampaignId**](CampaignApi.md#getApiV1ExternalCampaignByCampaignId) | **GET** /preview/retail-media/campaigns/{campaignId} | 
[**getApiV1ExternalCampaignLineItemsByCampaignId**](CampaignApi.md#getApiV1ExternalCampaignLineItemsByCampaignId) | **GET** /preview/retail-media/campaigns/{campaignId}/line-items | 
[**getApiV1ExternalLineItemByLineItemId**](CampaignApi.md#getApiV1ExternalLineItemByLineItemId) | **GET** /preview/retail-media/line-items/{lineItemId} | 
[**getApiV1ExternalLineItemProductsByLineItemId**](CampaignApi.md#getApiV1ExternalLineItemProductsByLineItemId) | **GET** /preview/retail-media/line-items/{lineItemId}/products | 
[**getApiV1ExternalRetailerBrandsByRetailerId**](CampaignApi.md#getApiV1ExternalRetailerBrandsByRetailerId) | **GET** /preview/retail-media/retailers/{retailerId}/brands | 
[**getApiV1ExternalRetailerByRetailerIdSellerBySeller**](CampaignApi.md#getApiV1ExternalRetailerByRetailerIdSellerBySeller) | **GET** /preview/retail-media/retailers/{retailerId}/sellers/{seller} | 
[**postApiV0ExternalAccountCatalogsByAccountId**](CampaignApi.md#postApiV0ExternalAccountCatalogsByAccountId) | **POST** /preview/retail-media/accounts/{accountId}/catalogs | 
[**postApiV1ExternalAccountCampaignsByAccountId**](CampaignApi.md#postApiV1ExternalAccountCampaignsByAccountId) | **POST** /preview/retail-media/accounts/{accountId}/campaigns | 
[**postApiV1ExternalCampaignLineItemsByCampaignId**](CampaignApi.md#postApiV1ExternalCampaignLineItemsByCampaignId) | **POST** /preview/retail-media/campaigns/{campaignId}/line-items | 
[**postApiV1ExternalCatalogsSkuRetrieval**](CampaignApi.md#postApiV1ExternalCatalogsSkuRetrieval) | **POST** /preview/retail-media/catalogs/sku-retrieval | 
[**postApiV1ExternalCatalogsSkuSearch**](CampaignApi.md#postApiV1ExternalCatalogsSkuSearch) | **POST** /preview/retail-media/catalogs/sku-search | 
[**putApiV1ExternalBalanceCampaignsByBalanceId**](CampaignApi.md#putApiV1ExternalBalanceCampaignsByBalanceId) | **PUT** /preview/retail-media/balances/{balanceId}/campaigns | 
[**putApiV1ExternalCampaignByCampaignId**](CampaignApi.md#putApiV1ExternalCampaignByCampaignId) | **PUT** /preview/retail-media/campaigns/{campaignId} | 
[**putApiV1ExternalLineItemByLineItemId**](CampaignApi.md#putApiV1ExternalLineItemByLineItemId) | **PUT** /preview/retail-media/line-items/{lineItemId} | 
[**putApiV1ExternalLineItemProductsByLineItemId**](CampaignApi.md#putApiV1ExternalLineItemProductsByLineItemId) | **PUT** /preview/retail-media/line-items/{lineItemId}/products | 


<a name="deleteApiV1ExternalBalanceCampaignsByBalanceId"></a>
# **deleteApiV1ExternalBalanceCampaignsByBalanceId**
> PageOfBalanceCampaign deleteApiV1ExternalBalanceCampaignsByBalanceId(balanceId, jsonApiDataRequestOfDeleteBalanceCampaign)



Removes one or more campaigns on the specified balance

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String balanceId = "balanceId_example"; // String | The balance to remove campaigns from
    JsonApiDataRequestOfDeleteBalanceCampaign jsonApiDataRequestOfDeleteBalanceCampaign = new JsonApiDataRequestOfDeleteBalanceCampaign(); // JsonApiDataRequestOfDeleteBalanceCampaign | The campaigns to append
    try {
      PageOfBalanceCampaign result = apiInstance.deleteApiV1ExternalBalanceCampaignsByBalanceId(balanceId, jsonApiDataRequestOfDeleteBalanceCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteApiV1ExternalBalanceCampaignsByBalanceId");
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
 **balanceId** | **String**| The balance to remove campaigns from |
 **jsonApiDataRequestOfDeleteBalanceCampaign** | [**JsonApiDataRequestOfDeleteBalanceCampaign**](JsonApiDataRequestOfDeleteBalanceCampaign.md)| The campaigns to append | [optional]

### Return type

[**PageOfBalanceCampaign**](PageOfBalanceCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="deleteApiV1ExternalLineItemProductsByLineItemId"></a>
# **deleteApiV1ExternalLineItemProductsByLineItemId**
> JsonApiPageResponseOfStringAndPromotedProduct deleteApiV1ExternalLineItemProductsByLineItemId(lineItemId, jsonApiDataRequestWithIdOfStringAndPromotedProduct)



This endpoint removes one or more products from promotion on the specified line item.  The resulting state of the line item is returned.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String lineItemId = "lineItemId_example"; // String | The line item to interact with
    JsonApiDataRequestWithIdOfStringAndPromotedProduct jsonApiDataRequestWithIdOfStringAndPromotedProduct = new JsonApiDataRequestWithIdOfStringAndPromotedProduct(); // JsonApiDataRequestWithIdOfStringAndPromotedProduct | 
    try {
      JsonApiPageResponseOfStringAndPromotedProduct result = apiInstance.deleteApiV1ExternalLineItemProductsByLineItemId(lineItemId, jsonApiDataRequestWithIdOfStringAndPromotedProduct);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteApiV1ExternalLineItemProductsByLineItemId");
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
 **lineItemId** | **String**| The line item to interact with |
 **jsonApiDataRequestWithIdOfStringAndPromotedProduct** | [**JsonApiDataRequestWithIdOfStringAndPromotedProduct**](JsonApiDataRequestWithIdOfStringAndPromotedProduct.md)|  | [optional]

### Return type

[**JsonApiPageResponseOfStringAndPromotedProduct**](JsonApiPageResponseOfStringAndPromotedProduct.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV0ExternalCatalogOutputByCatalogId"></a>
# **getApiV0ExternalCatalogOutputByCatalogId**
> getApiV0ExternalCatalogOutputByCatalogId(catalogId)



Output the indicated catalog. Catalogs are only available for retrieval when their associated status request  is at a Success status.  Produces application/x-json-stream of CatalogProduct json objects.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String catalogId = "catalogId_example"; // String | A catalog ID returned from an account catalog request.
    try {
      apiInstance.getApiV0ExternalCatalogOutputByCatalogId(catalogId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV0ExternalCatalogOutputByCatalogId");
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
 **catalogId** | **String**| A catalog ID returned from an account catalog request. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-json-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Catalog download initiated. |  -  |
**400** | The indicated catalog is not available for retrieval, wait for a success status. |  -  |

<a name="getApiV0ExternalCatalogStatusByCatalogId"></a>
# **getApiV0ExternalCatalogStatusByCatalogId**
> JsonApiSingleResponseOfCatalogStatus getApiV0ExternalCatalogStatusByCatalogId(catalogId)



Check the status of a catalog request.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String catalogId = "catalogId_example"; // String | A catalog ID returned from an account catalog request.
    try {
      JsonApiSingleResponseOfCatalogStatus result = apiInstance.getApiV0ExternalCatalogStatusByCatalogId(catalogId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV0ExternalCatalogStatusByCatalogId");
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
 **catalogId** | **String**| A catalog ID returned from an account catalog request. |

### Return type

[**JsonApiSingleResponseOfCatalogStatus**](JsonApiSingleResponseOfCatalogStatus.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Catalog request found. |  -  |

<a name="getApiV1ExternalAccountBalancesByAccountId"></a>
# **getApiV1ExternalAccountBalancesByAccountId**
> JsonApiPageResponseOfBalance getApiV1ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of balance objects for the given account id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String accountId = "accountId_example"; // String | The account to get balances for
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfBalance result = apiInstance.getApiV1ExternalAccountBalancesByAccountId(accountId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountBalancesByAccountId");
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
 **accountId** | **String**| The account to get balances for |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfBalance**](JsonApiPageResponseOfBalance.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalAccountBrandsByAccountId"></a>
# **getApiV1ExternalAccountBrandsByAccountId**
> JsonApiPageResponseOfBrand getApiV1ExternalAccountBrandsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String accountId = "accountId_example"; // String | The given account id
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfBrand result = apiInstance.getApiV1ExternalAccountBrandsByAccountId(accountId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountBrandsByAccountId");
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
 **accountId** | **String**| The given account id |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfBrand**](JsonApiPageResponseOfBrand.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalAccountCampaignsByAccountId"></a>
# **getApiV1ExternalAccountCampaignsByAccountId**
> JsonApiPageResponseOfCampaign getApiV1ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of campaign objects for the given account id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String accountId = "accountId_example"; // String | The given account id
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfCampaign result = apiInstance.getApiV1ExternalAccountCampaignsByAccountId(accountId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountCampaignsByAccountId");
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
 **accountId** | **String**| The given account id |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfCampaign**](JsonApiPageResponseOfCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalAccountRetailersByAccountId"></a>
# **getApiV1ExternalAccountRetailersByAccountId**
> JsonApiPageResponseOfRetailer getApiV1ExternalAccountRetailersByAccountId(accountId, limitToId, pageIndex, pageSize)



Gets page of retailer objects that are associated with the given account

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String accountId = "accountId_example"; // String | The given account id
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfRetailer result = apiInstance.getApiV1ExternalAccountRetailersByAccountId(accountId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccountRetailersByAccountId");
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
 **accountId** | **String**| The given account id |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfRetailer**](JsonApiPageResponseOfRetailer.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalAccounts"></a>
# **getApiV1ExternalAccounts**
> JsonApiPageResponseOfAccount getApiV1ExternalAccounts(limitToId, pageIndex, pageSize)



Gets page of account objects that the current user can access

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfAccount result = apiInstance.getApiV1ExternalAccounts(limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalAccounts");
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
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfAccount**](JsonApiPageResponseOfAccount.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalBalanceCampaignsByBalanceId"></a>
# **getApiV1ExternalBalanceCampaignsByBalanceId**
> PageOfBalanceCampaign getApiV1ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize)



Gets page of campaigns for the given balanceId

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String balanceId = "balanceId_example"; // String | The balance to get campaigns from
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      PageOfBalanceCampaign result = apiInstance.getApiV1ExternalBalanceCampaignsByBalanceId(balanceId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalBalanceCampaignsByBalanceId");
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
 **balanceId** | **String**| The balance to get campaigns from |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**PageOfBalanceCampaign**](PageOfBalanceCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalCampaignByCampaignId"></a>
# **getApiV1ExternalCampaignByCampaignId**
> JsonApiSingleResponseOfCampaign getApiV1ExternalCampaignByCampaignId(campaignId)



Gets the campaign for the given campaign id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The given campaign id
    try {
      JsonApiSingleResponseOfCampaign result = apiInstance.getApiV1ExternalCampaignByCampaignId(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalCampaignByCampaignId");
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
 **campaignId** | **String**| The given campaign id |

### Return type

[**JsonApiSingleResponseOfCampaign**](JsonApiSingleResponseOfCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalCampaignLineItemsByCampaignId"></a>
# **getApiV1ExternalCampaignLineItemsByCampaignId**
> JsonApiPageResponseOfLineItem getApiV1ExternalCampaignLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize)



Gets page of line item objects for the given campaign id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The given campaign id
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfLineItem result = apiInstance.getApiV1ExternalCampaignLineItemsByCampaignId(campaignId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalCampaignLineItemsByCampaignId");
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
 **campaignId** | **String**| The given campaign id |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfLineItem**](JsonApiPageResponseOfLineItem.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalLineItemByLineItemId"></a>
# **getApiV1ExternalLineItemByLineItemId**
> JsonApiSingleResponseOfLineItem getApiV1ExternalLineItemByLineItemId(lineItemId)



Gets the line item for the given line item id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String lineItemId = "lineItemId_example"; // String | The given line item id
    try {
      JsonApiSingleResponseOfLineItem result = apiInstance.getApiV1ExternalLineItemByLineItemId(lineItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalLineItemByLineItemId");
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
 **lineItemId** | **String**| The given line item id |

### Return type

[**JsonApiSingleResponseOfLineItem**](JsonApiSingleResponseOfLineItem.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalLineItemProductsByLineItemId"></a>
# **getApiV1ExternalLineItemProductsByLineItemId**
> JsonApiPageResponseOfStringAndPromotedProduct getApiV1ExternalLineItemProductsByLineItemId(lineItemId, limitToId, pageIndex, pageSize)



This endpoint gets the promoted products on the specified line item.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String lineItemId = "lineItemId_example"; // String | The line item to interact with
    List<String> limitToId = Arrays.asList(); // List<String> | The ids that you would like to limit your result set to
    Integer pageIndex = 56; // Integer | The 0 indexed page index you would like to receive given the page size
    Integer pageSize = 56; // Integer | The maximum number of items you would like to receive in this request
    try {
      JsonApiPageResponseOfStringAndPromotedProduct result = apiInstance.getApiV1ExternalLineItemProductsByLineItemId(lineItemId, limitToId, pageIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalLineItemProductsByLineItemId");
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
 **lineItemId** | **String**| The line item to interact with |
 **limitToId** | [**List&lt;String&gt;**](String.md)| The ids that you would like to limit your result set to | [optional]
 **pageIndex** | **Integer**| The 0 indexed page index you would like to receive given the page size | [optional]
 **pageSize** | **Integer**| The maximum number of items you would like to receive in this request | [optional]

### Return type

[**JsonApiPageResponseOfStringAndPromotedProduct**](JsonApiPageResponseOfStringAndPromotedProduct.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getApiV1ExternalRetailerBrandsByRetailerId"></a>
# **getApiV1ExternalRetailerBrandsByRetailerId**
> BrandPreviewListResponse getApiV1ExternalRetailerBrandsByRetailerId(retailerId)



Gets the brands for the given retailer

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer retailerId = 56; // Integer | The retailer id for which brands should be fetched.
    try {
      BrandPreviewListResponse result = apiInstance.getApiV1ExternalRetailerBrandsByRetailerId(retailerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalRetailerBrandsByRetailerId");
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
 **retailerId** | **Integer**| The retailer id for which brands should be fetched. |

### Return type

[**BrandPreviewListResponse**](BrandPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Brands found. |  -  |

<a name="getApiV1ExternalRetailerByRetailerIdSellerBySeller"></a>
# **getApiV1ExternalRetailerByRetailerIdSellerBySeller**
> SellerPreviewResponse getApiV1ExternalRetailerByRetailerIdSellerBySeller(retailerId, seller)



Endpoint to get market place seller id and name

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer retailerId = 56; // Integer | The retailer id for which seller should be fetched.
    String seller = "seller_example"; // String | The seller id or seller name which should be validated.
    try {
      SellerPreviewResponse result = apiInstance.getApiV1ExternalRetailerByRetailerIdSellerBySeller(retailerId, seller);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getApiV1ExternalRetailerByRetailerIdSellerBySeller");
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
 **retailerId** | **Integer**| The retailer id for which seller should be fetched. |
 **seller** | **String**| The seller id or seller name which should be validated. |

### Return type

[**SellerPreviewResponse**](SellerPreviewResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Seller found. |  -  |

<a name="postApiV0ExternalAccountCatalogsByAccountId"></a>
# **postApiV0ExternalAccountCatalogsByAccountId**
> JsonApiSingleResponseOfCatalogStatus postApiV0ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequestPreview)



Create a request for a Catalog available to the indicated account.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String accountId = "accountId_example"; // String | The account to request the catalog for.
    JsonApiRequestOfCatalogRequestPreview jsonApiRequestOfCatalogRequestPreview = new JsonApiRequestOfCatalogRequestPreview(); // JsonApiRequestOfCatalogRequestPreview | 
    try {
      JsonApiSingleResponseOfCatalogStatus result = apiInstance.postApiV0ExternalAccountCatalogsByAccountId(accountId, jsonApiRequestOfCatalogRequestPreview);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postApiV0ExternalAccountCatalogsByAccountId");
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
 **accountId** | **String**| The account to request the catalog for. |
 **jsonApiRequestOfCatalogRequestPreview** | [**JsonApiRequestOfCatalogRequestPreview**](JsonApiRequestOfCatalogRequestPreview.md)|  | [optional]

### Return type

[**JsonApiSingleResponseOfCatalogStatus**](JsonApiSingleResponseOfCatalogStatus.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Catalog request successfully created |  -  |

<a name="postApiV1ExternalAccountCampaignsByAccountId"></a>
# **postApiV1ExternalAccountCampaignsByAccountId**
> JsonApiSingleResponseOfCampaign postApiV1ExternalAccountCampaignsByAccountId(accountId, externalPostCampaign)



Creates a new campaign with the specified settings

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String accountId = "accountId_example"; // String | The given account id
    ExternalPostCampaign externalPostCampaign = new ExternalPostCampaign(); // ExternalPostCampaign | The campaign settings to create a campaign with
    try {
      JsonApiSingleResponseOfCampaign result = apiInstance.postApiV1ExternalAccountCampaignsByAccountId(accountId, externalPostCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postApiV1ExternalAccountCampaignsByAccountId");
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
 **accountId** | **String**| The given account id |
 **externalPostCampaign** | [**ExternalPostCampaign**](ExternalPostCampaign.md)| The campaign settings to create a campaign with | [optional]

### Return type

[**JsonApiSingleResponseOfCampaign**](JsonApiSingleResponseOfCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Success |  -  |

<a name="postApiV1ExternalCampaignLineItemsByCampaignId"></a>
# **postApiV1ExternalCampaignLineItemsByCampaignId**
> JsonApiSingleResponseOfLineItem postApiV1ExternalCampaignLineItemsByCampaignId(campaignId, externalPostLineItem)



Creates a new line item with the specified settings

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The given campaign id
    ExternalPostLineItem externalPostLineItem = new ExternalPostLineItem(); // ExternalPostLineItem | The line item settings to create a line item with
    try {
      JsonApiSingleResponseOfLineItem result = apiInstance.postApiV1ExternalCampaignLineItemsByCampaignId(campaignId, externalPostLineItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postApiV1ExternalCampaignLineItemsByCampaignId");
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
 **campaignId** | **String**| The given campaign id |
 **externalPostLineItem** | [**ExternalPostLineItem**](ExternalPostLineItem.md)| The line item settings to create a line item with | [optional]

### Return type

[**JsonApiSingleResponseOfLineItem**](JsonApiSingleResponseOfLineItem.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Success |  -  |

<a name="postApiV1ExternalCatalogsSkuRetrieval"></a>
# **postApiV1ExternalCatalogsSkuRetrieval**
> SkuDataPreviewListResponse postApiV1ExternalCatalogsSkuRetrieval(pageIndex, pageSize, requestBody)



Endpoint to search skus by text, retailer and sellers/brands.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer pageIndex = 0; // Integer | The start position in the overall list of matches. Must be zero or greater.
    Integer pageSize = 100; // Integer | The maximum number of results to return with each call. Must be greater than zero.
    List<String> requestBody = Arrays.asList(); // List<String> | The list of SKU keys to retrieve sku information
    try {
      SkuDataPreviewListResponse result = apiInstance.postApiV1ExternalCatalogsSkuRetrieval(pageIndex, pageSize, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postApiV1ExternalCatalogsSkuRetrieval");
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
 **pageIndex** | **Integer**| The start position in the overall list of matches. Must be zero or greater. | [optional] [default to 0]
 **pageSize** | **Integer**| The maximum number of results to return with each call. Must be greater than zero. | [optional] [default to 100]
 **requestBody** | [**List&lt;String&gt;**](String.md)| The list of SKU keys to retrieve sku information | [optional]

### Return type

[**SkuDataPreviewListResponse**](SkuDataPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Skus found. |  -  |

<a name="postApiV1ExternalCatalogsSkuSearch"></a>
# **postApiV1ExternalCatalogsSkuSearch**
> SkuDataPreviewListResponse postApiV1ExternalCatalogsSkuSearch(pageIndex, pageSize, skuSearchRequestPreviewRequest)



Endpoint to search skus by text, retailer and sellers/brands.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer pageIndex = 0; // Integer | The start position in the overall list of matches. Must be zero or greater.
    Integer pageSize = 100; // Integer | The maximum number of results to return with each call. Must be greater than zero.
    SkuSearchRequestPreviewRequest skuSearchRequestPreviewRequest = new SkuSearchRequestPreviewRequest(); // SkuSearchRequestPreviewRequest | 
    try {
      SkuDataPreviewListResponse result = apiInstance.postApiV1ExternalCatalogsSkuSearch(pageIndex, pageSize, skuSearchRequestPreviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postApiV1ExternalCatalogsSkuSearch");
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
 **pageIndex** | **Integer**| The start position in the overall list of matches. Must be zero or greater. | [optional] [default to 0]
 **pageSize** | **Integer**| The maximum number of results to return with each call. Must be greater than zero. | [optional] [default to 100]
 **skuSearchRequestPreviewRequest** | [**SkuSearchRequestPreviewRequest**](SkuSearchRequestPreviewRequest.md)|  | [optional]

### Return type

[**SkuDataPreviewListResponse**](SkuDataPreviewListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Skus found. |  -  |

<a name="putApiV1ExternalBalanceCampaignsByBalanceId"></a>
# **putApiV1ExternalBalanceCampaignsByBalanceId**
> PageOfBalanceCampaign putApiV1ExternalBalanceCampaignsByBalanceId(balanceId, jsonApiDataRequestOfPutBalanceCampaign)



appends one or more campaigns to the specified balance

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String balanceId = "balanceId_example"; // String | The balance to add campaigns from
    JsonApiDataRequestOfPutBalanceCampaign jsonApiDataRequestOfPutBalanceCampaign = new JsonApiDataRequestOfPutBalanceCampaign(); // JsonApiDataRequestOfPutBalanceCampaign | The campaigns to append
    try {
      PageOfBalanceCampaign result = apiInstance.putApiV1ExternalBalanceCampaignsByBalanceId(balanceId, jsonApiDataRequestOfPutBalanceCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putApiV1ExternalBalanceCampaignsByBalanceId");
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
 **balanceId** | **String**| The balance to add campaigns from |
 **jsonApiDataRequestOfPutBalanceCampaign** | [**JsonApiDataRequestOfPutBalanceCampaign**](JsonApiDataRequestOfPutBalanceCampaign.md)| The campaigns to append | [optional]

### Return type

[**PageOfBalanceCampaign**](PageOfBalanceCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="putApiV1ExternalCampaignByCampaignId"></a>
# **putApiV1ExternalCampaignByCampaignId**
> JsonApiSingleResponseOfCampaign putApiV1ExternalCampaignByCampaignId(campaignId, externalPutCampaign)



Updates the campaign for the given campaign id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The given campaign id
    ExternalPutCampaign externalPutCampaign = new ExternalPutCampaign(); // ExternalPutCampaign | The campaign settings to update that campaign with
    try {
      JsonApiSingleResponseOfCampaign result = apiInstance.putApiV1ExternalCampaignByCampaignId(campaignId, externalPutCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putApiV1ExternalCampaignByCampaignId");
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
 **campaignId** | **String**| The given campaign id |
 **externalPutCampaign** | [**ExternalPutCampaign**](ExternalPutCampaign.md)| The campaign settings to update that campaign with | [optional]

### Return type

[**JsonApiSingleResponseOfCampaign**](JsonApiSingleResponseOfCampaign.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="putApiV1ExternalLineItemByLineItemId"></a>
# **putApiV1ExternalLineItemByLineItemId**
> JsonApiSingleResponseOfLineItem putApiV1ExternalLineItemByLineItemId(lineItemId, externalPutLineItem)



Updates the line item for the given line item id

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String lineItemId = "lineItemId_example"; // String | The given line item id
    ExternalPutLineItem externalPutLineItem = new ExternalPutLineItem(); // ExternalPutLineItem | The line item settings to create a line item with
    try {
      JsonApiSingleResponseOfLineItem result = apiInstance.putApiV1ExternalLineItemByLineItemId(lineItemId, externalPutLineItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putApiV1ExternalLineItemByLineItemId");
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
 **lineItemId** | **String**| The given line item id |
 **externalPutLineItem** | [**ExternalPutLineItem**](ExternalPutLineItem.md)| The line item settings to create a line item with | [optional]

### Return type

[**JsonApiSingleResponseOfLineItem**](JsonApiSingleResponseOfLineItem.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="putApiV1ExternalLineItemProductsByLineItemId"></a>
# **putApiV1ExternalLineItemProductsByLineItemId**
> JsonApiPageResponseOfStringAndPromotedProduct putApiV1ExternalLineItemProductsByLineItemId(lineItemId, jsonApiDataRequestWithIdOfStringAndPromotedProduct)



This endpoint appends one or more products to promote on the specified line item.  The resulting state of the line item is returned.

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String lineItemId = "lineItemId_example"; // String | The line item to interact with
    JsonApiDataRequestWithIdOfStringAndPromotedProduct jsonApiDataRequestWithIdOfStringAndPromotedProduct = new JsonApiDataRequestWithIdOfStringAndPromotedProduct(); // JsonApiDataRequestWithIdOfStringAndPromotedProduct | the products to append to this line item
    try {
      JsonApiPageResponseOfStringAndPromotedProduct result = apiInstance.putApiV1ExternalLineItemProductsByLineItemId(lineItemId, jsonApiDataRequestWithIdOfStringAndPromotedProduct);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putApiV1ExternalLineItemProductsByLineItemId");
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
 **lineItemId** | **String**| The line item to interact with |
 **jsonApiDataRequestWithIdOfStringAndPromotedProduct** | [**JsonApiDataRequestWithIdOfStringAndPromotedProduct**](JsonApiDataRequestWithIdOfStringAndPromotedProduct.md)| the products to append to this line item | [optional]

### Return type

[**JsonApiPageResponseOfStringAndPromotedProduct**](JsonApiPageResponseOfStringAndPromotedProduct.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

