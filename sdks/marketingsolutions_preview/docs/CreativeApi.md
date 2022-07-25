# CreativeApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAd**](CreativeApi.md#createAd) | **POST** /preview/advertisers/{advertiser-id}/ads | 
[**createCoupon**](CreativeApi.md#createCoupon) | **POST** /preview/advertisers/{advertiser-id}/coupons | 
[**createCreative**](CreativeApi.md#createCreative) | **POST** /preview/advertisers/{advertiser-id}/creatives | 
[**deleteAd**](CreativeApi.md#deleteAd) | **DELETE** /preview/ads/{id} | 
[**deleteCoupon**](CreativeApi.md#deleteCoupon) | **DELETE** /preview/advertisers/{advertiser-id}/coupons/{id} | 
[**deleteCreative**](CreativeApi.md#deleteCreative) | **DELETE** /preview/creatives/{id} | 
[**editCoupon**](CreativeApi.md#editCoupon) | **PUT** /preview/advertisers/{advertiser-id}/coupons/{id} | 
[**editCreative**](CreativeApi.md#editCreative) | **PUT** /preview/creatives/{id} | 
[**getAd**](CreativeApi.md#getAd) | **GET** /preview/ads/{id} | 
[**getAds**](CreativeApi.md#getAds) | **GET** /preview/advertisers/{advertiser-id}/ads | 
[**getCoupon**](CreativeApi.md#getCoupon) | **GET** /preview/advertisers/{advertiser-id}/coupons/{id} | 
[**getCouponPreview**](CreativeApi.md#getCouponPreview) | **GET** /preview/advertisers/{advertiser-id}/coupons/{id}/preview | 
[**getCouponSupportedSizes**](CreativeApi.md#getCouponSupportedSizes) | **GET** /preview/advertisers/{advertiser-id}/coupons-supported-sizes | 
[**getCoupons**](CreativeApi.md#getCoupons) | **GET** /preview/advertisers/{advertiser-id}/coupons | 
[**getCreative**](CreativeApi.md#getCreative) | **GET** /preview/creatives/{id} | 
[**getCreativePreview**](CreativeApi.md#getCreativePreview) | **GET** /preview/creatives/{id}/preview | 
[**getCreativePreviewPost**](CreativeApi.md#getCreativePreviewPost) | **POST** /preview/creatives/{id}/preview | 
[**getCreatives**](CreativeApi.md#getCreatives) | **GET** /preview/advertisers/{advertiser-id}/creatives | 


<a name="createAd"></a>
# **createAd**
> AdResponse createAd(advertiserId, adWriteRequest)



Create an Ad

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    AdWriteRequest adWriteRequest = new AdWriteRequest(); // AdWriteRequest | 
    try {
      AdResponse result = apiInstance.createAd(advertiserId, adWriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#createAd");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **adWriteRequest** | [**AdWriteRequest**](AdWriteRequest.md)|  | [optional]

### Return type

[**AdResponse**](AdResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The created Ad is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="createCoupon"></a>
# **createCoupon**
> CouponResponse createCoupon(advertiserId, createCouponRequest)



Create a Coupon

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    CreateCouponRequest createCouponRequest = new CreateCouponRequest(); // CreateCouponRequest | 
    try {
      CouponResponse result = apiInstance.createCoupon(advertiserId, createCouponRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#createCoupon");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **createCouponRequest** | [**CreateCouponRequest**](CreateCouponRequest.md)|  | [optional]

### Return type

[**CouponResponse**](CouponResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The created Coupon is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="createCreative"></a>
# **createCreative**
> CreativeResponse createCreative(advertiserId, creativeWriteRequest)



Create a Creative

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    CreativeWriteRequest creativeWriteRequest = new CreativeWriteRequest(); // CreativeWriteRequest | 
    try {
      CreativeResponse result = apiInstance.createCreative(advertiserId, creativeWriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#createCreative");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **creativeWriteRequest** | [**CreativeWriteRequest**](CreativeWriteRequest.md)|  | [optional]

### Return type

[**CreativeResponse**](CreativeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The created creative is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="deleteAd"></a>
# **deleteAd**
> deleteAd(id)



Delete an Ad

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ad identifier to delete. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The ad was deleted. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(advertiserId, id)



Delete a Coupon

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    String id = "id_example"; // String | The Coupon identifier to delete.
    try {
      apiInstance.deleteCoupon(advertiserId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#deleteCoupon");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **id** | **String**| The Coupon identifier to delete. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The Coupon was deleted. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="deleteCreative"></a>
# **deleteCreative**
> deleteCreative(id)



Delete a Creative if there are no ads binded to it

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The creative identifier to delete. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The creative was deleted. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="editCoupon"></a>
# **editCoupon**
> CouponResponse editCoupon(advertiserId, id, updateCouponRequest)



Edit a specific Coupon

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    String id = "id_example"; // String | The Coupon identifier to edit.
    UpdateCouponRequest updateCouponRequest = new UpdateCouponRequest(); // UpdateCouponRequest | 
    try {
      CouponResponse result = apiInstance.editCoupon(advertiserId, id, updateCouponRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#editCoupon");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **id** | **String**| The Coupon identifier to edit. |
 **updateCouponRequest** | [**UpdateCouponRequest**](UpdateCouponRequest.md)|  | [optional]

### Return type

[**CouponResponse**](CouponResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The edited Coupon is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="editCreative"></a>
# **editCreative**
> CreativeResponse editCreative(id, creativeWriteRequest)



Edit a specific Creative

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String id = "id_example"; // String | The creative identifier to edit.
    CreativeWriteRequest creativeWriteRequest = new CreativeWriteRequest(); // CreativeWriteRequest | 
    try {
      CreativeResponse result = apiInstance.editCreative(id, creativeWriteRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The creative identifier to edit. |
 **creativeWriteRequest** | [**CreativeWriteRequest**](CreativeWriteRequest.md)|  | [optional]

### Return type

[**CreativeResponse**](CreativeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The edited creative is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="getAd"></a>
# **getAd**
> AdResponse getAd(id)



Get an Ad with its id

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    Integer id = 56; // Integer | The ad identifier to retrieve.
    try {
      AdResponse result = apiInstance.getAd(id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ad identifier to retrieve. |

### Return type

[**AdResponse**](AdResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The found ad is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="getAds"></a>
# **getAds**
> AdListResponse getAds(advertiserId, limit, offset)



Get the list of self-services Ads for a given advertiser

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    Integer limit = 56; // Integer | The number of ads to be returned. The default is 50.
    Integer offset = 56; // Integer | The (zero-based) offset into the collection of ads. The default is 0.
    try {
      AdListResponse result = apiInstance.getAds(advertiserId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getAds");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **limit** | **Integer**| The number of ads to be returned. The default is 50. | [optional]
 **offset** | **Integer**| The (zero-based) offset into the collection of ads. The default is 0. | [optional]

### Return type

[**AdListResponse**](AdListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of self-services Ads is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="getCoupon"></a>
# **getCoupon**
> CouponResponse getCoupon(advertiserId, id)



Get a Coupon with its id

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    String id = "id_example"; // String | The Coupon identifier to retrieve.
    try {
      CouponResponse result = apiInstance.getCoupon(advertiserId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCoupon");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **id** | **String**| The Coupon identifier to retrieve. |

### Return type

[**CouponResponse**](CouponResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The found Coupon is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="getCouponPreview"></a>
# **getCouponPreview**
> String getCouponPreview(advertiserId, id, width, height)



Get the preview of a specific Coupon

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    String id = "id_example"; // String | The Coupon identifier to preview.
    Integer width = 56; // Integer | The width of the coupon to preview.
    Integer height = 56; // Integer | The height of the coupon to preview.
    try {
      String result = apiInstance.getCouponPreview(advertiserId, id, width, height);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCouponPreview");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **id** | **String**| The Coupon identifier to preview. |
 **width** | **Integer**| The width of the coupon to preview. | [optional]
 **height** | **Integer**| The height of the coupon to preview. | [optional]

### Return type

**String**

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The preview HTML of a specific Coupon is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="getCouponSupportedSizes"></a>
# **getCouponSupportedSizes**
> CouponSupportedSizesResponse getCouponSupportedSizes(advertiserId, adSetId)



Get the list of Coupon supported sizes

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    String adSetId = "adSetId_example"; // String | The ad set id on which you want to check the Coupon supported sizes.
    try {
      CouponSupportedSizesResponse result = apiInstance.getCouponSupportedSizes(advertiserId, adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCouponSupportedSizes");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **adSetId** | **String**| The ad set id on which you want to check the Coupon supported sizes. | [optional]

### Return type

[**CouponSupportedSizesResponse**](CouponSupportedSizesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of Coupon supported sizes is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="getCoupons"></a>
# **getCoupons**
> CouponListResponse getCoupons(advertiserId, limit, offset)



Get the list of self-services Coupons for a given advertiser

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    Integer limit = 56; // Integer | The number of coupons to be returned. The default is 50.
    Integer offset = 56; // Integer | The (zero-based) offset into the collection of coupons. The default is 0.
    try {
      CouponListResponse result = apiInstance.getCoupons(advertiserId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCoupons");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **limit** | **Integer**| The number of coupons to be returned. The default is 50. | [optional]
 **offset** | **Integer**| The (zero-based) offset into the collection of coupons. The default is 0. | [optional]

### Return type

[**CouponListResponse**](CouponListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of self-services Coupons is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="getCreative"></a>
# **getCreative**
> CreativeResponse getCreative(id)



Get a Creative with its id

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String id = "id_example"; // String | The creative identifier to retrieve.
    try {
      CreativeResponse result = apiInstance.getCreative(id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The creative identifier to retrieve. |

### Return type

[**CreativeResponse**](CreativeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The found creative is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

<a name="getCreativePreview"></a>
# **getCreativePreview**
> String getCreativePreview(id, width, height)



Get the preview of a specific Creative

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String id = "id_example"; // String | The Creative identifier to preview.
    Integer width = 56; // Integer | The width of the Creative to preview.
    Integer height = 56; // Integer | The height of the Creative to preview.
    try {
      String result = apiInstance.getCreativePreview(id, width, height);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCreativePreview");
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
 **id** | **String**| The Creative identifier to preview. |
 **width** | **Integer**| The width of the Creative to preview. | [optional]
 **height** | **Integer**| The height of the Creative to preview. | [optional]

### Return type

**String**

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The preview HTML of a specific Creative is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="getCreativePreviewPost"></a>
# **getCreativePreviewPost**
> String getCreativePreviewPost(id, width, height)



Get the preview of a specific Creative

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String id = "id_example"; // String | The Creative identifier to preview.
    Integer width = 56; // Integer | The width of the Creative to preview.
    Integer height = 56; // Integer | The height of the Creative to preview.
    try {
      String result = apiInstance.getCreativePreviewPost(id, width, height);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCreativePreviewPost");
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
 **id** | **String**| The Creative identifier to preview. |
 **width** | **Integer**| The width of the Creative to preview. | [optional]
 **height** | **Integer**| The height of the Creative to preview. | [optional]

### Return type

**String**

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The preview HTML of a specific Creative is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**403** | The request was not properly authorized. |  -  |

<a name="getCreatives"></a>
# **getCreatives**
> CreativeListResponse getCreatives(advertiserId, limit, offset)



Get the list of self-services Creatives for a given advertiser

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CreativeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CreativeApi apiInstance = new CreativeApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser identifier.
    Integer limit = 56; // Integer | The number of creatives to be returned. The default is 50.
    Integer offset = 56; // Integer | The (zero-based) offset into the collection of creatives. The default is 0.
    try {
      CreativeListResponse result = apiInstance.getCreatives(advertiserId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativeApi#getCreatives");
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
 **advertiserId** | **String**| The advertiser identifier. |
 **limit** | **Integer**| The number of creatives to be returned. The default is 50. | [optional]
 **offset** | **Integer**| The (zero-based) offset into the collection of creatives. The default is 0. | [optional]

### Return type

[**CreativeListResponse**](CreativeListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of self-services Creatives is returned. |  -  |
**400** | The request contained invalid parameters. |  -  |
**401** | The request was not properly authorized. |  -  |
**500** | A non-request based error occurred on the server. |  -  |

