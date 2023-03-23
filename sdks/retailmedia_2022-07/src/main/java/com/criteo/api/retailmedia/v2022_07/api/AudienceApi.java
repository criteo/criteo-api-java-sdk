/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_07.api;

import com.criteo.api.retailmedia.v2022_07.ApiCallback;
import com.criteo.api.retailmedia.v2022_07.ApiClient;
import com.criteo.api.retailmedia.v2022_07.ApiException;
import com.criteo.api.retailmedia.v2022_07.ApiResponse;
import com.criteo.api.retailmedia.v2022_07.Configuration;
import com.criteo.api.retailmedia.v2022_07.Pair;
import com.criteo.api.retailmedia.v2022_07.ProgressRequestBody;
import com.criteo.api.retailmedia.v2022_07.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.retailmedia.v2022_07.model.CreateRetailMediaAudienceRequest;
import com.criteo.api.retailmedia.v2022_07.model.CreateRetailMediaAudienceResponse;
import com.criteo.api.retailmedia.v2022_07.model.GetPageOfAudiencesByAccountIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AudienceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AudienceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AudienceApi(ApiClient apiClient) {
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
     * Build call for createAudience
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param createRetailMediaAudienceRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The audience that was just created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. - OR - Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buy&#39;, &#39;view&#39;. - OR - The retailerTaxonomyIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackDays field.  Valid values are: 7, 14,  30, 45, 60, 90, 120, 150 or 180. - OR - Exactly one of retailerTaxonomyIds or globalBrandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - The globalBrandIds is not a valid list of IDs or may contain more than 100 elements. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. - OR - You do not have permission to access these global brands. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> An audience name should be unique per account. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAudienceCall(String accountId, CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createRetailMediaAudienceRequest;

        // create path and map variables
        String localVarPath = "/2022-07/retail-media/accounts/{accountId}/audiences"
            .replace("{" + "accountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAudienceValidateBeforeCall(String accountId, CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAudience(Async)");
        }

        // verify the required parameter 'createRetailMediaAudienceRequest' is set
        if (createRetailMediaAudienceRequest == null) {
            throw new ApiException("Missing the required parameter 'createRetailMediaAudienceRequest' when calling createAudience(Async)");
        }

        return createAudienceCall(accountId, createRetailMediaAudienceRequest, _callback);

    }

    /**
     * 
     * Create an audience for a given account ID
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param createRetailMediaAudienceRequest  (required)
     * @return CreateRetailMediaAudienceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The audience that was just created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. - OR - Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buy&#39;, &#39;view&#39;. - OR - The retailerTaxonomyIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackDays field.  Valid values are: 7, 14,  30, 45, 60, 90, 120, 150 or 180. - OR - Exactly one of retailerTaxonomyIds or globalBrandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - The globalBrandIds is not a valid list of IDs or may contain more than 100 elements. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. - OR - You do not have permission to access these global brands. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> An audience name should be unique per account. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public CreateRetailMediaAudienceResponse createAudience(String accountId, CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest) throws ApiException {
        ApiResponse<CreateRetailMediaAudienceResponse> localVarResp = createAudienceWithHttpInfo(accountId, createRetailMediaAudienceRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create an audience for a given account ID
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param createRetailMediaAudienceRequest  (required)
     * @return ApiResponse&lt;CreateRetailMediaAudienceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The audience that was just created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. - OR - Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buy&#39;, &#39;view&#39;. - OR - The retailerTaxonomyIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackDays field.  Valid values are: 7, 14,  30, 45, 60, 90, 120, 150 or 180. - OR - Exactly one of retailerTaxonomyIds or globalBrandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - The globalBrandIds is not a valid list of IDs or may contain more than 100 elements. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. - OR - You do not have permission to access these global brands. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> An audience name should be unique per account. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateRetailMediaAudienceResponse> createAudienceWithHttpInfo(String accountId, CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest) throws ApiException {
        okhttp3.Call localVarCall = createAudienceValidateBeforeCall(accountId, createRetailMediaAudienceRequest, null);
        Type localVarReturnType = new TypeToken<CreateRetailMediaAudienceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create an audience for a given account ID
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param createRetailMediaAudienceRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The audience that was just created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. - OR - Missing or invalid retailerID field. - OR - Missing or invalid name field. Name should be less than 255 characters. - OR - Missing or invalid userType field. Valid values are: &#39;buy&#39;, &#39;view&#39;. - OR - The retailerTaxonomyIds is not a valid list of IDs or may contain more than 100 elements. - OR - Missing or invalid lookbackDays field.  Valid values are: 7, 14,  30, 45, 60, 90, 120, 150 or 180. - OR - Exactly one of retailerTaxonomyIds or globalBrandIds must be specified, but not both. - OR - The retailer is invalid because it is not live - OR - The globalBrandIds is not a valid list of IDs or may contain more than 100 elements. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. - OR - You do not have permission to access these global brands. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> An audience name should be unique per account. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAudienceAsync(String accountId, CreateRetailMediaAudienceRequest createRetailMediaAudienceRequest, final ApiCallback<CreateRetailMediaAudienceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAudienceValidateBeforeCall(accountId, createRetailMediaAudienceRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateRetailMediaAudienceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAudiencesByAccountId
     * @param accountId External account ID which owns audience. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAudiencesByAccountIdCall(String accountId, List<String> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2022-07/retail-media/accounts/{accountId}/audiences"
            .replace("{" + "accountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limitToId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "limitToId", limitToId));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (pageIndex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageIndex", pageIndex));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAudiencesByAccountIdValidateBeforeCall(String accountId, List<String> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAudiencesByAccountId(Async)");
        }

        return getAudiencesByAccountIdCall(accountId, limitToId, pageSize, pageIndex, _callback);

    }

    /**
     * 
     * Get a page of audiences for a given account ID
     * @param accountId External account ID which owns audience. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed (optional)
     * @return GetPageOfAudiencesByAccountIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public GetPageOfAudiencesByAccountIdResponse getAudiencesByAccountId(String accountId, List<String> limitToId, Integer pageSize, Integer pageIndex) throws ApiException {
        ApiResponse<GetPageOfAudiencesByAccountIdResponse> localVarResp = getAudiencesByAccountIdWithHttpInfo(accountId, limitToId, pageSize, pageIndex);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a page of audiences for a given account ID
     * @param accountId External account ID which owns audience. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed (optional)
     * @return ApiResponse&lt;GetPageOfAudiencesByAccountIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetPageOfAudiencesByAccountIdResponse> getAudiencesByAccountIdWithHttpInfo(String accountId, List<String> limitToId, Integer pageSize, Integer pageIndex) throws ApiException {
        okhttp3.Call localVarCall = getAudiencesByAccountIdValidateBeforeCall(accountId, limitToId, pageSize, pageIndex, null);
        Type localVarReturnType = new TypeToken<GetPageOfAudiencesByAccountIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a page of audiences for a given account ID
     * @param accountId External account ID which owns audience. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Missing or invalid account ID. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The audience was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> The Accept header must contain application/json. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The Content-Type header must be application/json if present. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAudiencesByAccountIdAsync(String accountId, List<String> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback<GetPageOfAudiencesByAccountIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAudiencesByAccountIdValidateBeforeCall(accountId, limitToId, pageSize, pageIndex, _callback);
        Type localVarReturnType = new TypeToken<GetPageOfAudiencesByAccountIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
