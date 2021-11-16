# CampaignApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdSet**](CampaignApi.md#getAdSet) | **GET** /2021-04/marketing-solutions/ad-sets/{adSetId} | 
[**getBids**](CampaignApi.md#getBids) | **GET** /legacy/marketing/v1/campaigns/bids | Gets a the bids for campaigns and their categories
[**getCategories**](CampaignApi.md#getCategories) | **GET** /legacy/marketing/v1/campaigns/{campaignId}/categories | Gets categories
[**getCategory**](CampaignApi.md#getCategory) | **GET** /legacy/marketing/v1/campaigns/{campaignId}/categories/{categoryHashCode} | Gets a specific category
[**patchAdSets**](CampaignApi.md#patchAdSets) | **PATCH** /2021-04/marketing-solutions/ad-sets | 
[**searchAdSets**](CampaignApi.md#searchAdSets) | **POST** /2021-04/marketing-solutions/ad-sets/search | 
[**startAdSets**](CampaignApi.md#startAdSets) | **POST** /2021-04/marketing-solutions/ad-sets/start | 
[**stopAdSets**](CampaignApi.md#stopAdSets) | **POST** /2021-04/marketing-solutions/ad-sets/stop | 
[**updateBids**](CampaignApi.md#updateBids) | **PUT** /legacy/marketing/v1/campaigns/bids | Update bids for campaigns and their categories


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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | data for the ad set |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getBids"></a>
# **getBids**
> List&lt;CampaignBidMessage&gt; getBids(campaignIds, advertiserIds, categoryHashCodes, bidType, campaignStatus, pendingChanges)

Gets a the bids for campaigns and their categories

Get the campaigns&#39; bids, as well as the bids of their categories

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignIds = "campaignIds_example"; // String | Optional. The ids of the campaigns we want to get the bids on. If not specified, advertiserIds will be used.
    String advertiserIds = "advertiserIds_example"; // String | Optional. The ids of the advertisers' campaigns we want to get the bids on. If campaignIds not specified, and neither is advertiserIds, all the advertisers in the user's portfolio are used.
    String categoryHashCodes = "categoryHashCodes_example"; // String | Optional. Filters only specified categories. By default no filtering is applied.
    String bidType = "bidType_example"; // String | Optional. Filters by bid type. By default no filtering is applied.
    String campaignStatus = "campaignStatus_example"; // String | Optional. Filters by campaign status. By default no filtering is applied.
    Boolean pendingChanges = true; // Boolean | Optional. Filters only pending changes or settled ones. By default no filtering is applied.
    try {
      List<CampaignBidMessage> result = apiInstance.getBids(campaignIds, advertiserIds, categoryHashCodes, bidType, campaignStatus, pendingChanges);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getBids");
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
 **campaignIds** | **String**| Optional. The ids of the campaigns we want to get the bids on. If not specified, advertiserIds will be used. | [optional]
 **advertiserIds** | **String**| Optional. The ids of the advertisers&#39; campaigns we want to get the bids on. If campaignIds not specified, and neither is advertiserIds, all the advertisers in the user&#39;s portfolio are used. | [optional]
 **categoryHashCodes** | **String**| Optional. Filters only specified categories. By default no filtering is applied. | [optional]
 **bidType** | **String**| Optional. Filters by bid type. By default no filtering is applied. | [optional] [enum: Unknown, CPC, COS, CPO]
 **campaignStatus** | **String**| Optional. Filters by campaign status. By default no filtering is applied. | [optional] [enum: Running, Archived, NotRunning]
 **pendingChanges** | **Boolean**| Optional. Filters only pending changes or settled ones. By default no filtering is applied. | [optional]

### Return type

[**List&lt;CampaignBidMessage&gt;**](CampaignBidMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bids returned OK. |  -  |
**401** | Authentication failed. |  -  |
**403** | There is not even one valid advertiserId or campaignId requested. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getCategories"></a>
# **getCategories**
> CategoryMessage getCategories(campaignId, enabledOnly)

Gets categories

Get the list of categories linked to the requested campaign.

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | Mandatory. The id of the campaign the categories are linked to.
    Boolean enabledOnly = true; // Boolean | Optional. Returns only categories you can bid on. Defaults to false.
    try {
      CategoryMessage result = apiInstance.getCategories(campaignId, enabledOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCategories");
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
 **campaignId** | **Integer**| Mandatory. The id of the campaign the categories are linked to. |
 **enabledOnly** | **Boolean**| Optional. Returns only categories you can bid on. Defaults to false. | [optional]

### Return type

[**CategoryMessage**](CategoryMessage.md)

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
**403** | One of the requested campaigns doesn&#39;t belong to the API user&#39;s portfolio which prevents from accessing its data. |  -  |
**404** | The requested campaign was not found. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

<a name="getCategory"></a>
# **getCategory**
> CategoryMessage getCategory(campaignId, categoryHashCode)

Gets a specific category

Get a specific category linked to the requested campaign.

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | Mandatory. The id of the campaign the categories are linked to.
    Integer categoryHashCode = 56; // Integer | Mandatory. The id of the category to return.
    try {
      CategoryMessage result = apiInstance.getCategory(campaignId, categoryHashCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCategory");
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
 **campaignId** | **Integer**| Mandatory. The id of the campaign the categories are linked to. |
 **categoryHashCode** | **Integer**| Mandatory. The id of the category to return. |

### Return type

[**CategoryMessage**](CategoryMessage.md)

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
**403** | One of the requested campaigns doesn&#39;t belong to the API user&#39;s portfolio which prevents from accessing its data. |  -  |
**404** | The requested category was not found for the campaign. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of patched adSets. |  -  |
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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

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

[Authorization](../README.md#Authorization)

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of ad sets that have been stopped and errors / warnings by ad set |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |

<a name="updateBids"></a>
# **updateBids**
> List&lt;CampaignMessage&gt; updateBids(bidChanges)

Update bids for campaigns and their categories

If a campaign bid is updated, all (if any) category bids for this campaign will be updated with the new value if they are initially equal to the campaign bid.  If the category bid is not wanted to be cascaded to the categories with the same bid value, new change bids must be added in the request for the categories where the value should be kept (with the initial value).

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
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    List<CampaignBidChangeRequest> bidChanges = Arrays.asList(); // List<CampaignBidChangeRequest> | Specifies the list of bid changes to be applied.
    try {
      List<CampaignMessage> result = apiInstance.updateBids(bidChanges);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#updateBids");
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
 **bidChanges** | [**List&lt;CampaignBidChangeRequest&gt;**](CampaignBidChangeRequest.md)| Specifies the list of bid changes to be applied. |

### Return type

[**List&lt;CampaignMessage&gt;**](CampaignMessage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, text/html
 - **Accept**: application/json, text/json, application/xml, text/xml, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Campaign bids updated OK. |  -  |
**400** | Invalid input. Please check returned message for details. |  -  |
**401** | Authentication failed. |  -  |
**429** | Throttling failure. Maximum sending rate exceeded. |  -  |
**500** | Unknown error. |  -  |

