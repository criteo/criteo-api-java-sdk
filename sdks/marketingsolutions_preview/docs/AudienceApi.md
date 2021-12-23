# AudienceApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAudience**](AudienceApi.md#createAudience) | **POST** /preview/audiences | 
[**deleteIdentifiers**](AudienceApi.md#deleteIdentifiers) | **DELETE** /preview/audiences/{audience-id}/contactlist | 
[**getAudiences**](AudienceApi.md#getAudiences) | **GET** /preview/audiences | 
[**modifyAudience**](AudienceApi.md#modifyAudience) | **PATCH** /preview/audiences/{audience-id} | 
[**modifyAudienceUsers**](AudienceApi.md#modifyAudienceUsers) | **PATCH** /preview/audiences/{audience-id}/contactlist | 
[**modifyAudienceUsersWithAttributes**](AudienceApi.md#modifyAudienceUsersWithAttributes) | **PATCH** /preview/audiences/{audience-id}/contactlist-attributes | 
[**removeAudience**](AudienceApi.md#removeAudience) | **DELETE** /preview/audiences/{audience-id} | 


<a name="createAudience"></a>
# **createAudience**
> NewAudienceResponse createAudience(newAudienceRequest)



Create an Audience for an Advertiser

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    NewAudienceRequest newAudienceRequest = new NewAudienceRequest(); // NewAudienceRequest | 
    try {
      NewAudienceResponse result = apiInstance.createAudience(newAudienceRequest);
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
 **newAudienceRequest** | [**NewAudienceRequest**](NewAudienceRequest.md)|  |

### Return type

[**NewAudienceResponse**](NewAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The audience was created |  -  |
**403** | Forbidden |  -  |

<a name="deleteIdentifiers"></a>
# **deleteIdentifiers**
> DeleteAudienceContactListResponse deleteIdentifiers(audienceId)



delete all identifiers from an Audience

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String audienceId = "audienceId_example"; // String | The id of the audience to amend
    try {
      DeleteAudienceContactListResponse result = apiInstance.deleteIdentifiers(audienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#deleteIdentifiers");
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
 **audienceId** | **String**| The id of the audience to amend |

### Return type

[**DeleteAudienceContactListResponse**](DeleteAudienceContactListResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The contactlist was deleted |  -  |
**403** | Forbidden |  -  |

<a name="getAudiences"></a>
# **getAudiences**
> GetAudiencesResponse getAudiences(advertiserId)



Get a list of all the audiences for the user or for the given advertiser_id

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String advertiserId = "advertiserId_example"; // String | The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don't provide it, we will take into account the advertisers from your portfolio
    try {
      GetAudiencesResponse result = apiInstance.getAudiences(advertiserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#getAudiences");
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
 **advertiserId** | **String**| The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don&#39;t provide it, we will take into account the advertisers from your portfolio | [optional]

### Return type

[**GetAudiencesResponse**](GetAudiencesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list was retrieved. |  -  |
**403** | Forbidden |  -  |

<a name="modifyAudience"></a>
# **modifyAudience**
> ReplaceAudienceResponse modifyAudience(audienceId, replaceAudienceRequest)



Update user audience specified by the audience id

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String audienceId = "audienceId_example"; // String | The id of the audience to amend
    ReplaceAudienceRequest replaceAudienceRequest = new ReplaceAudienceRequest(); // ReplaceAudienceRequest | 
    try {
      ReplaceAudienceResponse result = apiInstance.modifyAudience(audienceId, replaceAudienceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#modifyAudience");
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
 **audienceId** | **String**| The id of the audience to amend |
 **replaceAudienceRequest** | [**ReplaceAudienceRequest**](ReplaceAudienceRequest.md)|  |

### Return type

[**ReplaceAudienceResponse**](ReplaceAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The audience was updated |  -  |
**403** | Forbidden |  -  |

<a name="modifyAudienceUsers"></a>
# **modifyAudienceUsers**
> ModifyAudienceResponse modifyAudienceUsers(audienceId, contactlistAmendmentRequest)



Add/remove users to or from an audience

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String audienceId = "audienceId_example"; // String | The id of the audience to amend
    ContactlistAmendmentRequest contactlistAmendmentRequest = new ContactlistAmendmentRequest(); // ContactlistAmendmentRequest | 
    try {
      ModifyAudienceResponse result = apiInstance.modifyAudienceUsers(audienceId, contactlistAmendmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#modifyAudienceUsers");
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
 **audienceId** | **String**| The id of the audience to amend |
 **contactlistAmendmentRequest** | [**ContactlistAmendmentRequest**](ContactlistAmendmentRequest.md)|  |

### Return type

[**ModifyAudienceResponse**](ModifyAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Summary of created request |  -  |
**403** | Forbidden |  -  |
**404** | Audience 123 not found |  -  |

<a name="modifyAudienceUsersWithAttributes"></a>
# **modifyAudienceUsersWithAttributes**
> ModifyAudienceResponse modifyAudienceUsersWithAttributes(audienceId, contactlistWithAttributesAmendmentRequest)



Add/remove users to or from an audience

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    Integer audienceId = 56; // Integer | The id of the audience to amend
    ContactlistWithAttributesAmendmentRequest contactlistWithAttributesAmendmentRequest = new ContactlistWithAttributesAmendmentRequest(); // ContactlistWithAttributesAmendmentRequest | 
    try {
      ModifyAudienceResponse result = apiInstance.modifyAudienceUsersWithAttributes(audienceId, contactlistWithAttributesAmendmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#modifyAudienceUsersWithAttributes");
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
 **audienceId** | **Integer**| The id of the audience to amend |
 **contactlistWithAttributesAmendmentRequest** | [**ContactlistWithAttributesAmendmentRequest**](ContactlistWithAttributesAmendmentRequest.md)|  |

### Return type

[**ModifyAudienceResponse**](ModifyAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Summary of created request |  -  |
**401** | Not authorized |  -  |

<a name="removeAudience"></a>
# **removeAudience**
> DeleteAudienceResponse removeAudience(audienceId)



Delete an audience by id

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.AudienceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    AudienceApi apiInstance = new AudienceApi(defaultClient);
    String audienceId = "audienceId_example"; // String | The id of the audience to amend
    try {
      DeleteAudienceResponse result = apiInstance.removeAudience(audienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceApi#removeAudience");
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
 **audienceId** | **String**| The id of the audience to amend |

### Return type

[**DeleteAudienceResponse**](DeleteAudienceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The audience was deleted |  -  |
**403** | Forbidden |  -  |

