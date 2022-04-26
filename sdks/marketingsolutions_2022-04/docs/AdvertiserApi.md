# AdvertiserApi

All URIs are relative to *https://api.criteo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPortfolioGet**](AdvertiserApi.md#apiPortfolioGet) | **GET** /2022-04/advertisers/me | 


<a name="apiPortfolioGet"></a>
# **apiPortfolioGet**
> GetPortfolioResponse apiPortfolioGet()



Fetch the portfolio of Advertisers for this account

### Example
```java
// Import classes:
import com.criteo.api.marketingsolutions.v2022_04.ApiClient;
import com.criteo.api.marketingsolutions.v2022_04.ApiException;
import com.criteo.api.marketingsolutions.v2022_04.Configuration;
import com.criteo.api.marketingsolutions.v2022_04.auth.*;
import com.criteo.api.marketingsolutions.v2022_04.models.*;
import com.criteo.api.marketingsolutions.v2022_04.api.AdvertiserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.criteo.com");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

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

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized |  -  |

