# CampaignApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdSet**](CampaignApi.md#getAdSet) | **GET** /2021-10/marketing-solutions/ad-sets/{adSetId} | 
[**getCampaign**](CampaignApi.md#getCampaign) | **GET** /2021-10/marketing-solutions/campaigns/{campaign-id} | 
[**patchAdSets**](CampaignApi.md#patchAdSets) | **PATCH** /2021-10/marketing-solutions/ad-sets | 
[**patchCampaigns**](CampaignApi.md#patchCampaigns) | **PATCH** /2021-10/marketing-solutions/campaigns | 
[**searchAdSets**](CampaignApi.md#searchAdSets) | **POST** /2021-10/marketing-solutions/ad-sets/search | 
[**searchCampaigns**](CampaignApi.md#searchCampaigns) | **POST** /2021-10/marketing-solutions/campaigns/search | 
[**startAdSets**](CampaignApi.md#startAdSets) | **POST** /2021-10/marketing-solutions/ad-sets/start | 
[**stopAdSets**](CampaignApi.md#stopAdSets) | **POST** /2021-10/marketing-solutions/ad-sets/stop | 


<a name="getAdSet"></a>
# **getAdSet**
> ResponseReadAdSet getAdSet(adSetId)



Get the data for the specified ad set

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the ad set
    try {
      ResponseReadAdSet result = apiInstance.getAdSet(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getAdSet");
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
 **adSetId** | **String**| Id of the ad set |

### Return type

[**ResponseReadAdSet**](ResponseReadAdSet.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | data for the ad set |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getCampaign"></a>
# **getCampaign**
> CampaignResponse getCampaign(campaignId)



Get the data for the specified campaign

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Id of the campaign
    try {
      CampaignResponse result = apiInstance.getCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCampaign");
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
 **campaignId** | **String**| Id of the campaign |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | data for the campaign |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="patchAdSets"></a>
# **patchAdSets**
> ResponseAdSetId patchAdSets(requestsPatchAdSet)



Patch a list of AdSets.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    RequestsPatchAdSet requestsPatchAdSet = new RequestsPatchAdSet(); // RequestsPatchAdSet | List of adsets to patch.
    try {
      ResponseAdSetId result = apiInstance.patchAdSets(requestsPatchAdSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#patchAdSets");
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
 **requestsPatchAdSet** | [**RequestsPatchAdSet**](RequestsPatchAdSet.md)| List of adsets to patch. | [optional]

### Return type

[**ResponseAdSetId**](ResponseAdSetId.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of patched adSets. |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="patchCampaigns"></a>
# **patchCampaigns**
> PatchResultCampaignListResponse patchCampaigns(patchCampaignListRequest)



Patch a list of Campaigns.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchCampaignListRequest** | [**PatchCampaignListRequest**](PatchCampaignListRequest.md)| List of campaigns to patch. | [optional]

### Return type

[**PatchResultCampaignListResponse**](PatchResultCampaignListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of patched campaigns. |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="searchAdSets"></a>
# **searchAdSets**
> ResponsesReadAdSet searchAdSets(requestAdSetSearch)



Search for ad sets

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    RequestAdSetSearch requestAdSetSearch = new RequestAdSetSearch(); // RequestAdSetSearch | 
    try {
      ResponsesReadAdSet result = apiInstance.searchAdSets(requestAdSetSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#searchAdSets");
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
 **requestAdSetSearch** | [**RequestAdSetSearch**](RequestAdSetSearch.md)|  | [optional]

### Return type

[**ResponsesReadAdSet**](ResponsesReadAdSet.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | data for the ad sets |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | Forbidden |  -  |

<a name="searchCampaigns"></a>
# **searchCampaigns**
> CampaignListResponse searchCampaigns(campaignSearchRequest)



Search for campaigns

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    CampaignSearchRequest campaignSearchRequest = new CampaignSearchRequest(); // CampaignSearchRequest | filters on campaigns
    try {
      CampaignListResponse result = apiInstance.searchCampaigns(campaignSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#searchCampaigns");
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
 **campaignSearchRequest** | [**CampaignSearchRequest**](CampaignSearchRequest.md)| filters on campaigns | [optional]

### Return type

[**CampaignListResponse**](CampaignListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | data for the campaigns |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | Forbidden |  -  |

<a name="startAdSets"></a>
# **startAdSets**
> ResponsesAdSetId startAdSets(requestsAdSetId)



Start the specified list of ad sets

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestsAdSetId** | [**RequestsAdSetId**](RequestsAdSetId.md)| All the ad sets to start | [optional]

### Return type

[**ResponsesAdSetId**](ResponsesAdSetId.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of ad sets that have been started and errors / warnings by ad set |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |

<a name="stopAdSets"></a>
# **stopAdSets**
> ResponsesAdSetId stopAdSets(requestsAdSetId)



Stop the specified list of ad sets

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.auth.*;
import com.criteo.api.marketingsolutions.v2020_10.models.*;
import com.criteo.api.marketingsolutions.v2020_10.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestsAdSetId** | [**RequestsAdSetId**](RequestsAdSetId.md)| All the ad sets to stop | [optional]

### Return type

[**ResponsesAdSetId**](ResponsesAdSetId.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of ad sets that have been stopped and errors / warnings by ad set |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |

