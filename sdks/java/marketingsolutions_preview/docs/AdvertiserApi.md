# AdvertiserApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPortfolioGet**](AdvertiserApi.md#apiPortfolioGet) | **GET** /2021-04/advertisers/me | 
[**getCategories**](AdvertiserApi.md#getCategories) | **GET** /legacy/marketing/v1/advertisers/{advertiserId}/categories | Gets all advertiser&#39;s categories
[**getCategory**](AdvertiserApi.md#getCategory) | **GET** /legacy/marketing/v1/advertisers/{advertiserId}/categories/{categoryHashCode} | Gets a specific advertiser&#39;s category


<a name="apiPortfolioGet"></a>
# **apiPortfolioGet**
> GetPortfolioResponse apiPortfolioGet()



Use this call to fetch a list of all advertisers in your account.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
    try {
      GetPortfolioResponse result = apiInstance.apiPortfolioGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertiserApi#apiPortfolioGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPortfolioResponse**](GetPortfolioResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized |  -  |

<a name="getCategories"></a>
# **getCategories**
> List&lt;CategoryMessage&gt; getCategories(advertiserId, enabledOnly)

Gets all advertiser&#39;s categories

Get the list of all the categories linked to the requested advertiser.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
    Integer advertiserId = 56; // Integer | Mandatory. The id of the advertiser to return.
    Boolean enabledOnly = true; // Boolean | Optional. Returns only categories you can bid on. Defaults to false.
    try {
      List<CategoryMessage> result = apiInstance.getCategories(advertiserId, enabledOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertiserApi#getCategories");
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
 **advertiserId** | **Integer**| Mandatory. The id of the advertiser to return. |
 **enabledOnly** | **Boolean**| Optional. Returns only categories you can bid on. Defaults to false. | [optional]

### Return type

[**List&lt;CategoryMessage&gt;**](CategoryMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Categories returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user’s portfolio. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getCategory"></a>
# **getCategory**
> List&lt;CategoryMessage&gt; getCategory(advertiserId, categoryHashCode)

Gets a specific advertiser&#39;s category

Get a specific category linked to the requested advertiser.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AdvertiserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    AdvertiserApi apiInstance = new AdvertiserApi(defaultClient);
    Integer advertiserId = 56; // Integer | Mandatory. The id of the advertiser to return.
    Integer categoryHashCode = 56; // Integer | Mandatory. The id of the category to return.
    try {
      List<CategoryMessage> result = apiInstance.getCategory(advertiserId, categoryHashCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvertiserApi#getCategory");
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
 **advertiserId** | **Integer**| Mandatory. The id of the advertiser to return. |
 **categoryHashCode** | **Integer**| Mandatory. The id of the category to return. |

### Return type

[**List&lt;CategoryMessage&gt;**](CategoryMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Category returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | The requested advertiser is missing from current user’s portfolio. |  -  |
**404** | The requested category was not found for the advertiser. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

