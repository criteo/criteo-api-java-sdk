# OnSiteRecommendationApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1RecoPost**](OnSiteRecommendationApi.md#apiV1RecoPost) | **POST** /preview/recommendation/search | 


<a name="apiV1RecoPost"></a>
# **apiV1RecoPost**
> OnSiteRecoResponse apiV1RecoPost(onSiteRecoRequest)



Retrieves a list of products recommended for the given user. This end point can either rely on a Criteo UserId, or a list of user events to perform the recommendation.

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.auth.*;
import com.criteo.api.marketingsolutions.preview.models.*;
import com.criteo.api.marketingsolutions.preview.api.OnSiteRecommendationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    OnSiteRecommendationApi apiInstance = new OnSiteRecommendationApi(defaultClient);
    OnSiteRecoRequest onSiteRecoRequest = new OnSiteRecoRequest(); // OnSiteRecoRequest | 
    try {
      OnSiteRecoResponse result = apiInstance.apiV1RecoPost(onSiteRecoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnSiteRecommendationApi#apiV1RecoPost");
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
 **onSiteRecoRequest** | [**OnSiteRecoRequest**](OnSiteRecoRequest.md)|  | [optional]

### Return type

[**OnSiteRecoResponse**](OnSiteRecoResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | Success |  -  |
**401** | Unauthorized |  -  |

