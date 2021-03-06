# AudienceApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAudience**](AudienceApi.md#createAudience) | **POST** /2022-01/retail-media/accounts/{accountId}/audiences | 
[**getAudiencesByAccountId**](AudienceApi.md#getAudiencesByAccountId) | **GET** /2022-01/retail-media/accounts/{accountId}/audiences | 


<a name="createAudience"></a>
# **createAudience**
> CreateRetailMediaAudienceResponse createAudience(accountId, createRetailMediaAudienceRequest)



Create an audience for a given account ID

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.v2022_01.ApiClient;
import com.criteo.api.retailmedia.v2022_01.ApiException;
import com.criteo.api.retailmedia.v2022_01.Configuration;
import com.criteo.api.retailmedia.v2022_01.auth.*;
import com.criteo.api.retailmedia.v2022_01.models.*;
import com.criteo.api.retailmedia.v2022_01.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the account to which this audience belongs.
    CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest = new CreateRetailMediaAudienceRequest(); // CreateRetailMediaAudienceRequest | 
    try {
      CreateRetailMediaAudienceResponse result = apiInstance.createAudience(accountId, createRetailMediaAudienceRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to which this audience belongs. |
 **createRetailMediaAudienceRequest** | [**CreateRetailMediaAudienceRequest**](CreateRetailMediaAudienceRequest.md)|  |

### Return type

[**CreateRetailMediaAudienceResponse**](CreateRetailMediaAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The audience that was just created. |  -  |
**400** | Missing or invalid account ID. - OR - Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buy&#39;, &#39;view&#39;. - OR - The retailerTaxonomyIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackDays field.?? Valid values are:??7, 14,?? 30, 45, 60, 90, 120, 150 or 180. - OR - Exactly one of retailerTaxonomyIds or globalBrandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - The globalBrandIds is not a valid list of IDs or may contain more than 100 elements. |  -  |
**404** | The audience was not found. - OR - You do not have permission to access these global brands. |  -  |
**406** | The Accept header must contain application/json. |  -  |
**409** | An audience name should be unique per account. |  -  |
**415** | The Content-Type header must be application/json if present. |  -  |

<a name="getAudiencesByAccountId"></a>
# **getAudiencesByAccountId**
> GetPageOfAudiencesByAccountIdResponse getAudiencesByAccountId(accountId, limitToId, pageSize, pageIndex)



Get a page of audiences for a given account ID

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.v2022_01.ApiClient;
import com.criteo.api.retailmedia.v2022_01.ApiException;
import com.criteo.api.retailmedia.v2022_01.Configuration;
import com.criteo.api.retailmedia.v2022_01.auth.*;
import com.criteo.api.retailmedia.v2022_01.models.*;
import com.criteo.api.retailmedia.v2022_01.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String accountId = "accountId_example"; // String | External account ID which owns audience.
    List<String> limitToId = Arrays.asList(); // List<String> | Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId=1&limitToId=2
    Integer pageSize = 56; // Integer | Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page
    Integer pageIndex = 56; // Integer | Returns the specified page of results given a pageSize; pages are 0-indexed
    try {
      GetPageOfAudiencesByAccountIdResponse result = apiInstance.getAudiencesByAccountId(accountId, limitToId, pageSize, pageIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#getAudiencesByAccountId");
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
 **accountId** | **String**| External account ID which owns audience. |
 **limitToId** | [**List&lt;String&gt;**](String.md)| Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 | [optional]
 **pageSize** | **Integer**| Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page | [optional]
 **pageIndex** | **Integer**| Returns the specified page of results given a pageSize; pages are 0-indexed | [optional]

### Return type

[**GetPageOfAudiencesByAccountIdResponse**](GetPageOfAudiencesByAccountIdResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A page of audiences for the supplied account. |  -  |
**400** | Missing or invalid account ID. |  -  |
**404** | The audience was not found. |  -  |
**406** | The Accept header must contain application/json. |  -  |
**415** | The Content-Type header must be application/json if present. |  -  |

