/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_04.api;

import com.criteo.api.retailmedia.v2022_04.ApiCallback;
import com.criteo.api.retailmedia.v2022_04.ApiClient;
import com.criteo.api.retailmedia.v2022_04.ApiException;
import com.criteo.api.retailmedia.v2022_04.ApiResponse;
import com.criteo.api.retailmedia.v2022_04.Configuration;
import com.criteo.api.retailmedia.v2022_04.Pair;
import com.criteo.api.retailmedia.v2022_04.ProgressRequestBody;
import com.criteo.api.retailmedia.v2022_04.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.retailmedia.v2022_04.model.AccessTokenModel;
import com.criteo.api.retailmedia.v2022_04.model.OAuthErrorModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OAuthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OAuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OAuthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getToken
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param redirectUri  (optional)
     * @param code  (optional)
     * @param refreshToken  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTokenCall(String grantType, String clientId, String clientSecret, String redirectUri, String code, String refreshToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth2/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (clientSecret != null) {
            localVarFormParams.put("client_secret", clientSecret);
        }

        if (redirectUri != null) {
            localVarFormParams.put("redirect_uri", redirectUri);
        }

        if (code != null) {
            localVarFormParams.put("code", code);
        }

        if (refreshToken != null) {
            localVarFormParams.put("refresh_token", refreshToken);
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTokenValidateBeforeCall(String grantType, String clientId, String clientSecret, String redirectUri, String code, String refreshToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling getToken(Async)");
        }

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getToken(Async)");
        }

        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling getToken(Async)");
        }

        return getTokenCall(grantType, clientId, clientSecret, redirectUri, code, refreshToken, _callback);

    }

    /**
     * Creates a token based either on supplied client credentials or on single use authorization code
     * Creates a token when the supplied client credentials are valid
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param redirectUri  (optional)
     * @param code  (optional)
     * @param refreshToken  (optional)
     * @return AccessTokenModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public AccessTokenModel getToken(String grantType, String clientId, String clientSecret, String redirectUri, String code, String refreshToken) throws ApiException {
        ApiResponse<AccessTokenModel> localVarResp = getTokenWithHttpInfo(grantType, clientId, clientSecret, redirectUri, code, refreshToken);
        return localVarResp.getData();
    }

    /**
     * Creates a token based either on supplied client credentials or on single use authorization code
     * Creates a token when the supplied client credentials are valid
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param redirectUri  (optional)
     * @param code  (optional)
     * @param refreshToken  (optional)
     * @return ApiResponse&lt;AccessTokenModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessTokenModel> getTokenWithHttpInfo(String grantType, String clientId, String clientSecret, String redirectUri, String code, String refreshToken) throws ApiException {
        okhttp3.Call localVarCall = getTokenValidateBeforeCall(grantType, clientId, clientSecret, redirectUri, code, refreshToken, null);
        Type localVarReturnType = new TypeToken<AccessTokenModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a token based either on supplied client credentials or on single use authorization code (asynchronously)
     * Creates a token when the supplied client credentials are valid
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param redirectUri  (optional)
     * @param code  (optional)
     * @param refreshToken  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTokenAsync(String grantType, String clientId, String clientSecret, String redirectUri, String code, String refreshToken, final ApiCallback<AccessTokenModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTokenValidateBeforeCall(grantType, clientId, clientSecret, redirectUri, code, refreshToken, _callback);
        Type localVarReturnType = new TypeToken<AccessTokenModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
