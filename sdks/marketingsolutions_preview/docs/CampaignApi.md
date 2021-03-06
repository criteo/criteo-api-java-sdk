# CampaignApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignApi.md#createCampaign) | **POST** /preview/marketing-solutions/campaigns | 
[**deleteAdvertiserBundleRules**](CampaignApi.md#deleteAdvertiserBundleRules) | **DELETE** /preview/advertisers/{advertiserId}/targeting/bundle-rules | 
[**deleteAdvertiserDomainRules**](CampaignApi.md#deleteAdvertiserDomainRules) | **DELETE** /preview/advertisers/{advertiserId}/targeting/domain-rules | 
[**deleteCampaignBundleRules**](CampaignApi.md#deleteCampaignBundleRules) | **DELETE** /preview/campaigns/{campaignId}/targeting/bundle-rules | 
[**deleteCampaignDomainRules**](CampaignApi.md#deleteCampaignDomainRules) | **DELETE** /preview/campaigns/{campaignId}/targeting/domain-rules | 
[**deleteOCIbrandSafetyRule**](CampaignApi.md#deleteOCIbrandSafetyRule) | **DELETE** /preview/brand-safety/oci | 
[**deleteOCItargetingRule**](CampaignApi.md#deleteOCItargetingRule) | **DELETE** /preview/targeting/oci | 
[**disableAdSetTargetingDealIds**](CampaignApi.md#disableAdSetTargetingDealIds) | **POST** /preview/marketing-solutions/ad-sets/{ad-set-id}/targeting/deal-ids/disable | 
[**disableAdSetTargetingVideoPositioning**](CampaignApi.md#disableAdSetTargetingVideoPositioning) | **POST** /preview/marketing-solutions/ad-sets/{ad-set-id}/targeting/video-positionings/disable | 
[**getAdSet**](CampaignApi.md#getAdSet) | **GET** /preview/marketing-solutions/ad-sets/{adSetId} | 
[**getAdSetTargetingDealIds**](CampaignApi.md#getAdSetTargetingDealIds) | **GET** /preview/marketing-solutions/ad-sets/{ad-set-id}/targeting/deal-ids | 
[**getAdSetTargetingVideoPositioning**](CampaignApi.md#getAdSetTargetingVideoPositioning) | **GET** /preview/marketing-solutions/ad-sets/{ad-set-id}/targeting/video-positioning | 
[**getAdvertiserBundleRules**](CampaignApi.md#getAdvertiserBundleRules) | **GET** /preview/advertisers/{advertiserId}/targeting/bundle-rules | 
[**getAdvertiserDomainRules**](CampaignApi.md#getAdvertiserDomainRules) | **GET** /preview/advertisers/{advertiserId}/targeting/domain-rules | 
[**getCampaign**](CampaignApi.md#getCampaign) | **GET** /preview/marketing-solutions/campaigns/{campaign-id} | 
[**getCampaignBundleRules**](CampaignApi.md#getCampaignBundleRules) | **GET** /preview/campaigns/{campaignId}/targeting/bundle-rules | 
[**getCampaignDomainRules**](CampaignApi.md#getCampaignDomainRules) | **GET** /preview/campaigns/{campaignId}/targeting/domain-rules | 
[**getCategoryBidList**](CampaignApi.md#getCategoryBidList) | **GET** /preview/marketing-solutions/ad-sets/{ad-set-id}/category-bids | 
[**getDisplayMultipliers**](CampaignApi.md#getDisplayMultipliers) | **GET** /preview/marketing-solutions/ad-sets/{ad-set-id}/display-multipliers | 
[**getOCIbrandSafetyRule**](CampaignApi.md#getOCIbrandSafetyRule) | **GET** /preview/brand-safety/oci | 
[**getOCItargetingRule**](CampaignApi.md#getOCItargetingRule) | **GET** /preview/targeting/oci | 
[**getSupplyVendorList**](CampaignApi.md#getSupplyVendorList) | **GET** /preview/marketing-solutions/ad-sets/targeting/supply-vendors | 
[**patchAdSets**](CampaignApi.md#patchAdSets) | **PATCH** /preview/marketing-solutions/ad-sets | 
[**patchCampaigns**](CampaignApi.md#patchCampaigns) | **PATCH** /preview/marketing-solutions/campaigns | 
[**patchCategoryBidList**](CampaignApi.md#patchCategoryBidList) | **PATCH** /preview/marketing-solutions/ad-sets/{ad-set-id}/category-bids | 
[**patchDisplayMultipliers**](CampaignApi.md#patchDisplayMultipliers) | **PATCH** /preview/marketing-solutions/ad-sets/{ad-set-id}/display-multipliers | 
[**postAdvertiserBundleRules**](CampaignApi.md#postAdvertiserBundleRules) | **POST** /preview/advertisers/{advertiserId}/targeting/bundle-rules | 
[**postAdvertiserDomainRules**](CampaignApi.md#postAdvertiserDomainRules) | **POST** /preview/advertisers/{advertiserId}/targeting/domain-rules | 
[**postCampaignBundleRules**](CampaignApi.md#postCampaignBundleRules) | **POST** /preview/campaigns/{campaignId}/targeting/bundle-rules | 
[**postCampaignDomainRules**](CampaignApi.md#postCampaignDomainRules) | **POST** /preview/campaigns/{campaignId}/targeting/domain-rules | 
[**putAdvertiserBundleRules**](CampaignApi.md#putAdvertiserBundleRules) | **PUT** /preview/advertisers/{advertiserId}/targeting/bundle-rules | 
[**putAdvertiserDomainRules**](CampaignApi.md#putAdvertiserDomainRules) | **PUT** /preview/advertisers/{advertiserId}/targeting/domain-rules | 
[**putCampaignBundleRules**](CampaignApi.md#putCampaignBundleRules) | **PUT** /preview/campaigns/{campaignId}/targeting/bundle-rules | 
[**putCampaignDomainRules**](CampaignApi.md#putCampaignDomainRules) | **PUT** /preview/campaigns/{campaignId}/targeting/domain-rules | 
[**searchAdSets**](CampaignApi.md#searchAdSets) | **POST** /preview/marketing-solutions/ad-sets/search | 
[**searchCampaigns**](CampaignApi.md#searchCampaigns) | **POST** /preview/marketing-solutions/campaigns/search | 
[**setAdSetTargetingDealIds**](CampaignApi.md#setAdSetTargetingDealIds) | **PUT** /preview/marketing-solutions/ad-sets/{ad-set-id}/targeting/deal-ids | 
[**setAdSetTargetingVideoPositioning**](CampaignApi.md#setAdSetTargetingVideoPositioning) | **PUT** /preview/marketing-solutions/ad-sets/{ad-set-id}/targeting/video-positioning | 
[**startAdSets**](CampaignApi.md#startAdSets) | **POST** /preview/marketing-solutions/ad-sets/start | 
[**stopAdSets**](CampaignApi.md#stopAdSets) | **POST** /preview/marketing-solutions/ad-sets/stop | 
[**updateAdSetAudience**](CampaignApi.md#updateAdSetAudience) | **PUT** /preview/marketing-solutions/ad-sets/{ad-set-id}/audience | 
[**upsertOCIbrandSafetyRule**](CampaignApi.md#upsertOCIbrandSafetyRule) | **POST** /preview/brand-safety/oci | 
[**upsertOCItargetingRule**](CampaignApi.md#upsertOCItargetingRule) | **POST** /preview/targeting/oci | 


<a name="createCampaign"></a>
# **createCampaign**
> CampaignResponse createCampaign(createCampaignRequest)



Create the specified campaign

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    CreateCampaignRequest createCampaignRequest = new CreateCampaignRequest(); // CreateCampaignRequest | the campaigns to create
    try {
      CampaignResponse result = apiInstance.createCampaign(createCampaignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#createCampaign");
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
 **createCampaignRequest** | [**CreateCampaignRequest**](CreateCampaignRequest.md)| the campaigns to create | [optional]

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The campaign that has been created and errors / warnings |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |

<a name="deleteAdvertiserBundleRules"></a>
# **deleteAdvertiserBundleRules**
> ApiResponseOfTargetingEntity deleteAdvertiserBundleRules(advertiserId, apiRequestOfTargetingEntity)



Removes some bundles from the current list of targeted bundles for a given advertiser.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to delete from the list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.deleteAdvertiserBundleRules(advertiserId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteAdvertiserBundleRules");
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
 **advertiserId** | **Integer**| The advertiser id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to delete from the list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteAdvertiserDomainRules"></a>
# **deleteAdvertiserDomainRules**
> ApiResponseOfTargetingEntity deleteAdvertiserDomainRules(advertiserId, apiRequestOfTargetingEntity)



Removes some domains from the current list of targeted domains for a given advertiser.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to delete from the list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.deleteAdvertiserDomainRules(advertiserId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteAdvertiserDomainRules");
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
 **advertiserId** | **Integer**| The advertiser id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to delete from the list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteCampaignBundleRules"></a>
# **deleteCampaignBundleRules**
> ApiResponseOfTargetingEntity deleteCampaignBundleRules(campaignId, apiRequestOfTargetingEntity)



Removes some bundles from the current list of targeted bundles for a given campaign.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to delete from the list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.deleteCampaignBundleRules(campaignId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteCampaignBundleRules");
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
 **campaignId** | **Integer**| The campaign id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to delete from the list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteCampaignDomainRules"></a>
# **deleteCampaignDomainRules**
> ApiResponseOfTargetingEntity deleteCampaignDomainRules(campaignId, apiRequestOfTargetingEntity)



Removes some domains from the current list of targeted domains for a given campaign.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to delete from the list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.deleteCampaignDomainRules(campaignId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteCampaignDomainRules");
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
 **campaignId** | **Integer**| The campaign id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to delete from the list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteOCIbrandSafetyRule"></a>
# **deleteOCIbrandSafetyRule**
> deleteOCIbrandSafetyRule(targetType, targetId)



Delete OCI brand-safety rule.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    TargetType targetType = TargetType.fromValue("Campaign"); // TargetType | Defines a target for a rule.
    Integer targetId = 56; // Integer | Unique target identifier.
    try {
      apiInstance.deleteOCIbrandSafetyRule(targetType, targetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteOCIbrandSafetyRule");
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
 **targetType** | [**TargetType**](.md)| Defines a target for a rule. | [enum: Campaign, Advertiser]
 **targetId** | **Integer**| Unique target identifier. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Rule deleted |  -  |
**400** | Invalid input |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal service error |  -  |

<a name="deleteOCItargetingRule"></a>
# **deleteOCItargetingRule**
> deleteOCItargetingRule(targetType, targetId)



Delete OCI targeting rule.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    TargetType targetType = TargetType.fromValue("Campaign"); // TargetType | Defines a target for a rule.
    Integer targetId = 56; // Integer | Unique target identifier.
    try {
      apiInstance.deleteOCItargetingRule(targetType, targetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteOCItargetingRule");
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
 **targetType** | [**TargetType**](.md)| Defines a target for a rule. | [enum: Campaign, Advertiser]
 **targetId** | **Integer**| Unique target identifier. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Rule deleted |  -  |
**400** | Invalid input |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal service error |  -  |

<a name="disableAdSetTargetingDealIds"></a>
# **disableAdSetTargetingDealIds**
> AdSetTargetingDealIdsDisableResultResponse disableAdSetTargetingDealIds(adSetId)



Disable the Deal Id Targeting configuration for the ad set whose id is specified

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    try {
      AdSetTargetingDealIdsDisableResultResponse result = apiInstance.disableAdSetTargetingDealIds(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#disableAdSetTargetingDealIds");
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
 **adSetId** | **String**| Id of the Ad Set |

### Return type

[**AdSetTargetingDealIdsDisableResultResponse**](AdSetTargetingDealIdsDisableResultResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the errors/warnings if any |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="disableAdSetTargetingVideoPositioning"></a>
# **disableAdSetTargetingVideoPositioning**
> AdSetTargetingVideoPositioningDisableResultResponse disableAdSetTargetingVideoPositioning(adSetId)



Disable the Video Positioning Targeting configuration for the ad set whose id is specified

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    try {
      AdSetTargetingVideoPositioningDisableResultResponse result = apiInstance.disableAdSetTargetingVideoPositioning(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#disableAdSetTargetingVideoPositioning");
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
 **adSetId** | **String**| Id of the Ad Set |

### Return type

[**AdSetTargetingVideoPositioningDisableResultResponse**](AdSetTargetingVideoPositioningDisableResultResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the errors/warnings if any |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getAdSet"></a>
# **getAdSet**
> ResponseReadAdSet getAdSet(adSetId)



Get the data for the specified ad set

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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

<a name="getAdSetTargetingDealIds"></a>
# **getAdSetTargetingDealIds**
> AdSetTargetingDealIdsResponse getAdSetTargetingDealIds(adSetId)



Get the Deal Id Targeting configuration for the ad set whose id is specified

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    try {
      AdSetTargetingDealIdsResponse result = apiInstance.getAdSetTargetingDealIds(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getAdSetTargetingDealIds");
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
 **adSetId** | **String**| Id of the Ad Set |

### Return type

[**AdSetTargetingDealIdsResponse**](AdSetTargetingDealIdsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Deal Id Targeting configuration |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getAdSetTargetingVideoPositioning"></a>
# **getAdSetTargetingVideoPositioning**
> AdSetTargetingVideoPositioningResponse getAdSetTargetingVideoPositioning(adSetId)



Get the Video Positioning Targeting configuration for the ad set whose id is specified

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    try {
      AdSetTargetingVideoPositioningResponse result = apiInstance.getAdSetTargetingVideoPositioning(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getAdSetTargetingVideoPositioning");
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
 **adSetId** | **String**| Id of the Ad Set |

### Return type

[**AdSetTargetingVideoPositioningResponse**](AdSetTargetingVideoPositioningResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Video Positioning Targeting configuration |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getAdvertiserBundleRules"></a>
# **getAdvertiserBundleRules**
> ApiResponseOfTargetingEntity getAdvertiserBundleRules(advertiserId)



Returns a list of all targeted bundles for an advertiser.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    try {
      ApiResponseOfTargetingEntity result = apiInstance.getAdvertiserBundleRules(advertiserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getAdvertiserBundleRules");
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
 **advertiserId** | **Integer**| The advertiser id |

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="getAdvertiserDomainRules"></a>
# **getAdvertiserDomainRules**
> ApiResponseOfTargetingEntity getAdvertiserDomainRules(advertiserId)



Returns a list of all targeted domains for an advertiser.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    try {
      ApiResponseOfTargetingEntity result = apiInstance.getAdvertiserDomainRules(advertiserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getAdvertiserDomainRules");
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
 **advertiserId** | **Integer**| The advertiser id |

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="getCampaign"></a>
# **getCampaign**
> CampaignResponse getCampaign(campaignId)



Get the data for the specified campaign

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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

<a name="getCampaignBundleRules"></a>
# **getCampaignBundleRules**
> ApiResponseOfTargetingEntity getCampaignBundleRules(campaignId)



Returns a list of all targeted bundles for a campaign.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    try {
      ApiResponseOfTargetingEntity result = apiInstance.getCampaignBundleRules(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCampaignBundleRules");
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
 **campaignId** | **Integer**| The campaign id |

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="getCampaignDomainRules"></a>
# **getCampaignDomainRules**
> ApiResponseOfTargetingEntity getCampaignDomainRules(campaignId)



Returns a list of all targeted domains for a campaign.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    try {
      ApiResponseOfTargetingEntity result = apiInstance.getCampaignDomainRules(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCampaignDomainRules");
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
 **campaignId** | **Integer**| The campaign id |

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="getCategoryBidList"></a>
# **getCategoryBidList**
> AdSetCategoryBidListResponse getCategoryBidList(adSetId)



Get the Category Bids for all valid Categories associated to an Ad Set

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    try {
      AdSetCategoryBidListResponse result = apiInstance.getCategoryBidList(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCategoryBidList");
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
 **adSetId** | **String**| Id of the Ad Set |

### Return type

[**AdSetCategoryBidListResponse**](AdSetCategoryBidListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Category Bids for all valid Categories associated to an Ad Set. |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getDisplayMultipliers"></a>
# **getDisplayMultipliers**
> AdSetDisplayMultiplierListResponse getDisplayMultipliers(adSetId)



Get the Display Multipliers for all valid Categories associated to an Ad Set

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    try {
      AdSetDisplayMultiplierListResponse result = apiInstance.getDisplayMultipliers(adSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getDisplayMultipliers");
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
 **adSetId** | **String**| Id of the Ad Set |

### Return type

[**AdSetDisplayMultiplierListResponse**](AdSetDisplayMultiplierListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Display Multipliers for all valid Categories associated to an Ad Set. |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="getOCIbrandSafetyRule"></a>
# **getOCIbrandSafetyRule**
> OciBrandSafetyResponse getOCIbrandSafetyRule(targetType, targetId)



Get OCI brand-safety rule for the specified target

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    TargetType targetType = TargetType.fromValue("Campaign"); // TargetType | Defines a target for a rule.
    Integer targetId = 56; // Integer | Unique target identifier.
    try {
      OciBrandSafetyResponse result = apiInstance.getOCIbrandSafetyRule(targetType, targetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getOCIbrandSafetyRule");
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
 **targetType** | [**TargetType**](.md)| Defines a target for a rule. | [enum: Campaign, Advertiser]
 **targetId** | **Integer**| Unique target identifier. |

### Return type

[**OciBrandSafetyResponse**](OciBrandSafetyResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rule found |  -  |
**400** | Invalid input |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal service error |  -  |

<a name="getOCItargetingRule"></a>
# **getOCItargetingRule**
> OciTargetingResponse getOCItargetingRule(targetType, targetId)



Get OCI targeting rule for specified target.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    TargetType targetType = TargetType.fromValue("Campaign"); // TargetType | Defines a target for a rule.
    Integer targetId = 56; // Integer | Unique target identifier.
    try {
      OciTargetingResponse result = apiInstance.getOCItargetingRule(targetType, targetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getOCItargetingRule");
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
 **targetType** | [**TargetType**](.md)| Defines a target for a rule. | [enum: Campaign, Advertiser]
 **targetId** | **Integer**| Unique target identifier. |

### Return type

[**OciTargetingResponse**](OciTargetingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rule found |  -  |
**400** | Invalid input |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal service error |  -  |

<a name="getSupplyVendorList"></a>
# **getSupplyVendorList**
> SupplyVendorListResponse getSupplyVendorList()



Fetch the list of available supply vendors for any Ad Set targetings

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    try {
      SupplyVendorListResponse result = apiInstance.getSupplyVendorList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getSupplyVendorList");
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

[**SupplyVendorListResponse**](SupplyVendorListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the errors/warnings if any |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="patchAdSets"></a>
# **patchAdSets**
> ResponseAdSetId patchAdSets(requestsPatchAdSet)



Patch a list of AdSets.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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

<a name="patchCategoryBidList"></a>
# **patchCategoryBidList**
> PatchAdSetCategoryBidResultListResponse patchCategoryBidList(adSetId, patchAdSetCategoryBidListRequest)



Patch Category Bids for one or more Categories in a single request. Partial success policy is followed.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    PatchAdSetCategoryBidListRequest patchAdSetCategoryBidListRequest = new PatchAdSetCategoryBidListRequest(); // PatchAdSetCategoryBidListRequest | 
    try {
      PatchAdSetCategoryBidResultListResponse result = apiInstance.patchCategoryBidList(adSetId, patchAdSetCategoryBidListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#patchCategoryBidList");
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
 **adSetId** | **String**| Id of the Ad Set |
 **patchAdSetCategoryBidListRequest** | [**PatchAdSetCategoryBidListRequest**](PatchAdSetCategoryBidListRequest.md)|  | [optional]

### Return type

[**PatchAdSetCategoryBidResultListResponse**](PatchAdSetCategoryBidResultListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of updated Category Bids for given Categories associated to an Ad Set. |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="patchDisplayMultipliers"></a>
# **patchDisplayMultipliers**
> PatchAdSetDisplayMultiplierResultListResponse patchDisplayMultipliers(adSetId, patchAdSetDisplayMultiplierListRequest)



Patch Display Multipliers for one or more Categories in a single request. Partial success policy is followed.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    PatchAdSetDisplayMultiplierListRequest patchAdSetDisplayMultiplierListRequest = new PatchAdSetDisplayMultiplierListRequest(); // PatchAdSetDisplayMultiplierListRequest | 
    try {
      PatchAdSetDisplayMultiplierResultListResponse result = apiInstance.patchDisplayMultipliers(adSetId, patchAdSetDisplayMultiplierListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#patchDisplayMultipliers");
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
 **adSetId** | **String**| Id of the Ad Set |
 **patchAdSetDisplayMultiplierListRequest** | [**PatchAdSetDisplayMultiplierListRequest**](PatchAdSetDisplayMultiplierListRequest.md)|  | [optional]

### Return type

[**PatchAdSetDisplayMultiplierResultListResponse**](PatchAdSetDisplayMultiplierResultListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of updated Display Multipliers for given Categories associated to an Ad Set. |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="postAdvertiserBundleRules"></a>
# **postAdvertiserBundleRules**
> ApiResponseOfTargetingEntity postAdvertiserBundleRules(advertiserId, apiRequestOfTargetingEntity)



Inserts a list of targeted bundles for an advertiser and sets the targeting mode : blocklisting or allowlisting.&lt;br /&gt;  It will replace the current list if any.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Description of the targeting rule to setup
    try {
      ApiResponseOfTargetingEntity result = apiInstance.postAdvertiserBundleRules(advertiserId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postAdvertiserBundleRules");
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
 **advertiserId** | **Integer**| The advertiser id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Description of the targeting rule to setup | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="postAdvertiserDomainRules"></a>
# **postAdvertiserDomainRules**
> ApiResponseOfTargetingEntity postAdvertiserDomainRules(advertiserId, apiRequestOfTargetingEntity)



Inserts a list of targeted domains for an advertiser and sets the targeting mode : blocklisting or allowlisting.&lt;br /&gt;  It will replace the current list if any.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Description of the targeting rule to setup
    try {
      ApiResponseOfTargetingEntity result = apiInstance.postAdvertiserDomainRules(advertiserId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postAdvertiserDomainRules");
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
 **advertiserId** | **Integer**| The advertiser id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Description of the targeting rule to setup | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="postCampaignBundleRules"></a>
# **postCampaignBundleRules**
> ApiResponseOfTargetingEntity postCampaignBundleRules(campaignId, apiRequestOfTargetingEntity)



Inserts a list of targeted bundles for a campaign and sets the targeting mode : blocklisting or allowlisting.&lt;br /&gt;  It will replace the current list if any.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Description of the targeting rule to setup
    try {
      ApiResponseOfTargetingEntity result = apiInstance.postCampaignBundleRules(campaignId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postCampaignBundleRules");
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
 **campaignId** | **Integer**| The campaign id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Description of the targeting rule to setup | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="postCampaignDomainRules"></a>
# **postCampaignDomainRules**
> ApiResponseOfTargetingEntity postCampaignDomainRules(campaignId, apiRequestOfTargetingEntity)



Inserts a list of targeted domains for a campaign and sets the targeting mode : blocklisting or allowlisting.&lt;br /&gt;  It will replace the current list if any.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Description of the targeting rule to setup
    try {
      ApiResponseOfTargetingEntity result = apiInstance.postCampaignDomainRules(campaignId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#postCampaignDomainRules");
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
 **campaignId** | **Integer**| The campaign id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Description of the targeting rule to setup | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="putAdvertiserBundleRules"></a>
# **putAdvertiserBundleRules**
> ApiResponseOfTargetingEntity putAdvertiserBundleRules(advertiserId, apiRequestOfTargetingEntity)



Updates the targeted bundles for an advertiser by adding a list of bundles to the current list.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to add to the existing list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.putAdvertiserBundleRules(advertiserId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putAdvertiserBundleRules");
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
 **advertiserId** | **Integer**| The advertiser id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to add to the existing list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="putAdvertiserDomainRules"></a>
# **putAdvertiserDomainRules**
> ApiResponseOfTargetingEntity putAdvertiserDomainRules(advertiserId, apiRequestOfTargetingEntity)



Updates the targeted domains for an advertiser by adding a list of domains to the current list.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer advertiserId = 56; // Integer | The advertiser id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to add to the existing list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.putAdvertiserDomainRules(advertiserId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putAdvertiserDomainRules");
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
 **advertiserId** | **Integer**| The advertiser id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to add to the existing list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="putCampaignBundleRules"></a>
# **putCampaignBundleRules**
> ApiResponseOfTargetingEntity putCampaignBundleRules(campaignId, apiRequestOfTargetingEntity)



Updates the targeted bundles for a campaign by adding a list of bundles to the current list.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to add to the existing list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.putCampaignBundleRules(campaignId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putCampaignBundleRules");
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
 **campaignId** | **Integer**| The campaign id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to add to the existing list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="putCampaignDomainRules"></a>
# **putCampaignDomainRules**
> ApiResponseOfTargetingEntity putCampaignDomainRules(campaignId, apiRequestOfTargetingEntity)



Updates the targeted domains for a campaign by adding a list of domains to the current list.&lt;br /&gt;  The mode of targeting (allowlist/blocklist) cannot be updated through this method.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer campaignId = 56; // Integer | The campaign id
    ApiRequestOfTargetingEntity apiRequestOfTargetingEntity = new ApiRequestOfTargetingEntity(); // ApiRequestOfTargetingEntity | Contains the list of items to add to the existing list
    try {
      ApiResponseOfTargetingEntity result = apiInstance.putCampaignDomainRules(campaignId, apiRequestOfTargetingEntity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#putCampaignDomainRules");
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
 **campaignId** | **Integer**| The campaign id |
 **apiRequestOfTargetingEntity** | [**ApiRequestOfTargetingEntity**](ApiRequestOfTargetingEntity.md)| Contains the list of items to add to the existing list | [optional]

### Return type

[**ApiResponseOfTargetingEntity**](ApiResponseOfTargetingEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="searchAdSets"></a>
# **searchAdSets**
> ResponsesReadAdSet searchAdSets(requestAdSetSearch)



Search for ad sets

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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

<a name="setAdSetTargetingDealIds"></a>
# **setAdSetTargetingDealIds**
> AdSetTargetingDealIdsSetResultResponse setAdSetTargetingDealIds(adSetId, setAdSetTargetingDealIdsRequest)



Set the Deal Id Targeting configuration for the ad set whose id is specified

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    SetAdSetTargetingDealIdsRequest setAdSetTargetingDealIdsRequest = new SetAdSetTargetingDealIdsRequest(); // SetAdSetTargetingDealIdsRequest | the new Deal Id Targeting configuration
    try {
      AdSetTargetingDealIdsSetResultResponse result = apiInstance.setAdSetTargetingDealIds(adSetId, setAdSetTargetingDealIdsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#setAdSetTargetingDealIds");
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
 **adSetId** | **String**| Id of the Ad Set |
 **setAdSetTargetingDealIdsRequest** | [**SetAdSetTargetingDealIdsRequest**](SetAdSetTargetingDealIdsRequest.md)| the new Deal Id Targeting configuration | [optional]

### Return type

[**AdSetTargetingDealIdsSetResultResponse**](AdSetTargetingDealIdsSetResultResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the errors/warnings if any |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="setAdSetTargetingVideoPositioning"></a>
# **setAdSetTargetingVideoPositioning**
> AdSetTargetingVideoPositioningSetResultResponse setAdSetTargetingVideoPositioning(adSetId, setAdSetTargetingVideoPositioningRequest)



Set the Video Positioning Targeting configuration for the ad set whose id is specified

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Id of the Ad Set
    SetAdSetTargetingVideoPositioningRequest setAdSetTargetingVideoPositioningRequest = new SetAdSetTargetingVideoPositioningRequest(); // SetAdSetTargetingVideoPositioningRequest | the new Video Positioning Targeting configuration
    try {
      AdSetTargetingVideoPositioningSetResultResponse result = apiInstance.setAdSetTargetingVideoPositioning(adSetId, setAdSetTargetingVideoPositioningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#setAdSetTargetingVideoPositioning");
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
 **adSetId** | **String**| Id of the Ad Set |
 **setAdSetTargetingVideoPositioningRequest** | [**SetAdSetTargetingVideoPositioningRequest**](SetAdSetTargetingVideoPositioningRequest.md)| the new Video Positioning Targeting configuration | [optional]

### Return type

[**AdSetTargetingVideoPositioningSetResultResponse**](AdSetTargetingVideoPositioningSetResultResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the errors/warnings if any |  -  |
**400** | Bad Request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource or the resource does not exist. |  -  |

<a name="startAdSets"></a>
# **startAdSets**
> ResponsesAdSetId startAdSets(requestsAdSetId)



Start the specified list of ad sets

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

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

<a name="updateAdSetAudience"></a>
# **updateAdSetAudience**
> AdSetAudienceLinkEntityV1Response updateAdSetAudience(adSetId, adSetAudienceLinkInputEntityV1)



Link or unlink an audience with an ad set

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String adSetId = "adSetId_example"; // String | Ad set id
    AdSetAudienceLinkInputEntityV1 adSetAudienceLinkInputEntityV1 = new AdSetAudienceLinkInputEntityV1(); // AdSetAudienceLinkInputEntityV1 | Audience and ad set to link
    try {
      AdSetAudienceLinkEntityV1Response result = apiInstance.updateAdSetAudience(adSetId, adSetAudienceLinkInputEntityV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#updateAdSetAudience");
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
 **adSetId** | **String**| Ad set id |
 **adSetAudienceLinkInputEntityV1** | [**AdSetAudienceLinkInputEntityV1**](AdSetAudienceLinkInputEntityV1.md)| Audience and ad set to link | [optional]

### Return type

[**AdSetAudienceLinkEntityV1Response**](AdSetAudienceLinkEntityV1Response.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request |  -  |
**401** | The API client is not properly authenticated. |  -  |
**403** | The API client is not authorized to access this resource. |  -  |

<a name="upsertOCIbrandSafetyRule"></a>
# **upsertOCIbrandSafetyRule**
> OciBrandSafetyResponse upsertOCIbrandSafetyRule(ociBrandSafetyRule)



Create or update a new or replace existing OCI brand-safety rule.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    OciBrandSafetyRule ociBrandSafetyRule = new OciBrandSafetyRule(); // OciBrandSafetyRule | OCI brand-safety rule input
    try {
      OciBrandSafetyResponse result = apiInstance.upsertOCIbrandSafetyRule(ociBrandSafetyRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#upsertOCIbrandSafetyRule");
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
 **ociBrandSafetyRule** | [**OciBrandSafetyRule**](OciBrandSafetyRule.md)| OCI brand-safety rule input |

### Return type

[**OciBrandSafetyResponse**](OciBrandSafetyResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rule created |  -  |
**400** | Invalid input |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal service error |  -  |

<a name="upsertOCItargetingRule"></a>
# **upsertOCItargetingRule**
> OciTargetingResponse upsertOCItargetingRule(ociTargetingRule)



Create or update new or update existing OCI targeting rule.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    OciTargetingRule ociTargetingRule = new OciTargetingRule(); // OciTargetingRule | OCI targeting rule input
    try {
      OciTargetingResponse result = apiInstance.upsertOCItargetingRule(ociTargetingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#upsertOCItargetingRule");
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
 **ociTargetingRule** | [**OciTargetingRule**](OciTargetingRule.md)| OCI targeting rule input |

### Return type

[**OciTargetingResponse**](OciTargetingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rule created |  -  |
**400** | Invalid input |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal service error |  -  |

