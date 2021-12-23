# OAuthApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientCredentials**](OAuthApi.md#clientCredentials) | **POST** /oauth2/token | Creates a token when the supplied client credentials are valid


<a name="clientCredentials"></a>
# **clientCredentials**
> AccessTokenModel clientCredentials()

Creates a token when the supplied client credentials are valid

Creates a token when the supplied client credentials are valid

### Example
```java
// Import classes:
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.auth.*;
import com.criteo.api.retailmedia.preview.models.*;
import com.criteo.api.retailmedia.preview.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    OAuthApi apiInstance = new OAuthApi(defaultClient);
    try {
      AccessTokenModel result = apiInstance.clientCredentials();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#clientCredentials");
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

[**AccessTokenModel**](AccessTokenModel.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |

