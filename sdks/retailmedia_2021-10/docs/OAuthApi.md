# OAuthApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](OAuthApi.md#createToken) | **POST** /oauth2/token | 


<a name="createToken"></a>
# **createToken**
> JwtModel createToken(clientId, clientSecret, grantType)



Creates a token when the supplied client credentials are valid

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.v2021_10.ApiClient;
import com.criteo.api.retailmedia.v2021_10.ApiException;
import com.criteo.api.retailmedia.v2021_10.Configuration;
import com.criteo.api.retailmedia.v2021_10.auth.*;
import com.criteo.api.retailmedia.v2021_10.models.*;
import com.criteo.api.retailmedia.v2021_10.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    String clientId = "clientId_example"; // String | API Client-Id or Username
    String clientSecret = "clientSecret_example"; // String | API Client secret or password
    String grantType = "\"client_credentials\""; // String | Other grant types are not available
    try {
      JwtModel result = apiInstance.createToken(clientId, clientSecret, grantType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#createToken");
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
 **clientId** | **String**| API Client-Id or Username | [optional]
 **clientSecret** | **String**| API Client secret or password | [optional]
 **grantType** | **String**| Other grant types are not available | [optional] [default to &quot;client_credentials&quot;]

### Return type

[**JwtModel**](JwtModel.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request |  -  |

