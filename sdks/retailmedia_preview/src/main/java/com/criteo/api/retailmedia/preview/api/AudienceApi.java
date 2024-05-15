/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.api;

import com.criteo.api.retailmedia.preview.ApiCallback;
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.ApiResponse;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.Pair;
import com.criteo.api.retailmedia.preview.ProgressRequestBody;
import com.criteo.api.retailmedia.preview.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.retailmedia.preview.model.ErrorCodeResponse;
import com.criteo.api.retailmedia.preview.model.RetailMediaContactlistAmendmentRequest;
import com.criteo.api.retailmedia.preview.model.RetailMediaContactlistOperation;
import com.criteo.api.retailmedia.preview.model.RmLegacyAudienceGetEntityV1ListResponse;
import com.criteo.api.retailmedia.preview.model.RmLegacyAudienceGetEntityV2ListResponse;

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
     * Build call for deleteContactListIdentifiers
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The Contact List identifiers were deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteContactListIdentifiersCall(Long audienceSegmentId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/preview/retail-media/audience-segments/{audience-segment-id}/contact-list/clear"
            .replace("{" + "audience-segment-id" + "}", localVarApiClient.escapeString(audienceSegmentId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteContactListIdentifiersValidateBeforeCall(Long audienceSegmentId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'audienceSegmentId' is set
        if (audienceSegmentId == null) {
            throw new ApiException("Missing the required parameter 'audienceSegmentId' when calling deleteContactListIdentifiers(Async)");
        }

        return deleteContactListIdentifiersCall(audienceSegmentId, _callback);

    }

    /**
     * 
     * Delete all identifiers from a retail-media contact list audience-segment, with external audience segment id.
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The Contact List identifiers were deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public void deleteContactListIdentifiers(Long audienceSegmentId) throws ApiException {
        deleteContactListIdentifiersWithHttpInfo(audienceSegmentId);
    }

    /**
     * 
     * Delete all identifiers from a retail-media contact list audience-segment, with external audience segment id.
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The Contact List identifiers were deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteContactListIdentifiersWithHttpInfo(Long audienceSegmentId) throws ApiException {
        okhttp3.Call localVarCall = deleteContactListIdentifiersValidateBeforeCall(audienceSegmentId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Delete all identifiers from a retail-media contact list audience-segment, with external audience segment id.
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The Contact List identifiers were deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteContactListIdentifiersAsync(Long audienceSegmentId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteContactListIdentifiersValidateBeforeCall(audienceSegmentId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for legacyGetAudienceV1
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call legacyGetAudienceV1Call(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/preview/retail-media/accounts/{accountId}/audiences"
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
            "text/plain",
            "application/json",
            "text/json"
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

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call legacyGetAudienceV1ValidateBeforeCall(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling legacyGetAudienceV1(Async)");
        }

        return legacyGetAudienceV1Call(accountId, limitToId, pageSize, pageIndex, _callback);

    }

    /**
     * 
     * Get a page of Audiences. (deprecated Public API)
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @return RmLegacyAudienceGetEntityV1ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public RmLegacyAudienceGetEntityV1ListResponse legacyGetAudienceV1(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex) throws ApiException {
        ApiResponse<RmLegacyAudienceGetEntityV1ListResponse> localVarResp = legacyGetAudienceV1WithHttpInfo(accountId, limitToId, pageSize, pageIndex);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a page of Audiences. (deprecated Public API)
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @return ApiResponse&lt;RmLegacyAudienceGetEntityV1ListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RmLegacyAudienceGetEntityV1ListResponse> legacyGetAudienceV1WithHttpInfo(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex) throws ApiException {
        okhttp3.Call localVarCall = legacyGetAudienceV1ValidateBeforeCall(accountId, limitToId, pageSize, pageIndex, null);
        Type localVarReturnType = new TypeToken<RmLegacyAudienceGetEntityV1ListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a page of Audiences. (deprecated Public API)
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call legacyGetAudienceV1Async(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback<RmLegacyAudienceGetEntityV1ListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = legacyGetAudienceV1ValidateBeforeCall(accountId, limitToId, pageSize, pageIndex, _callback);
        Type localVarReturnType = new TypeToken<RmLegacyAudienceGetEntityV1ListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for legacyGetAudienceV2
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call legacyGetAudienceV2Call(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/preview/retail-media/v2/accounts/{accountId}/audiences"
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
            "text/plain",
            "application/json",
            "text/json"
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

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call legacyGetAudienceV2ValidateBeforeCall(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling legacyGetAudienceV2(Async)");
        }

        return legacyGetAudienceV2Call(accountId, limitToId, pageSize, pageIndex, _callback);

    }

    /**
     * 
     * Get a page of Audiences. (deprecated Public API)
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @return RmLegacyAudienceGetEntityV2ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public RmLegacyAudienceGetEntityV2ListResponse legacyGetAudienceV2(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex) throws ApiException {
        ApiResponse<RmLegacyAudienceGetEntityV2ListResponse> localVarResp = legacyGetAudienceV2WithHttpInfo(accountId, limitToId, pageSize, pageIndex);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a page of Audiences. (deprecated Public API)
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @return ApiResponse&lt;RmLegacyAudienceGetEntityV2ListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RmLegacyAudienceGetEntityV2ListResponse> legacyGetAudienceV2WithHttpInfo(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex) throws ApiException {
        okhttp3.Call localVarCall = legacyGetAudienceV2ValidateBeforeCall(accountId, limitToId, pageSize, pageIndex, null);
        Type localVarReturnType = new TypeToken<RmLegacyAudienceGetEntityV2ListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a page of Audiences. (deprecated Public API)
     * @param accountId ID of the account to which this audience belongs. (required)
     * @param limitToId Limits results to the entity IDs specified; parameter key is repeated, eg. limitToId&#x3D;1&amp;limitToId&#x3D;2 (optional)
     * @param pageSize Specifies the maximum number of entities returned in a single page; defaults to 25 entities per page. (optional)
     * @param pageIndex Returns the specified page of results given a pageSize; pages are 0-indexed. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A page of audiences for the supplied account or shared by related retailers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The API client is not properly authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The API client is not authorized to access this resource. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call legacyGetAudienceV2Async(Long accountId, List<Integer> limitToId, Integer pageSize, Integer pageIndex, final ApiCallback<RmLegacyAudienceGetEntityV2ListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = legacyGetAudienceV2ValidateBeforeCall(accountId, limitToId, pageSize, pageIndex, _callback);
        Type localVarReturnType = new TypeToken<RmLegacyAudienceGetEntityV2ListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateContactListIdentifiers
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @param retailMediaContactlistAmendmentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateContactListIdentifiersCall(Long audienceSegmentId, RetailMediaContactlistAmendmentRequest retailMediaContactlistAmendmentRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = retailMediaContactlistAmendmentRequest;

        // create path and map variables
        String localVarPath = "/preview/retail-media/audience-segments/{audience-segment-id}/contact-list/add-remove"
            .replace("{" + "audience-segment-id" + "}", localVarApiClient.escapeString(audienceSegmentId.toString()));

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

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateContactListIdentifiersValidateBeforeCall(Long audienceSegmentId, RetailMediaContactlistAmendmentRequest retailMediaContactlistAmendmentRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'audienceSegmentId' is set
        if (audienceSegmentId == null) {
            throw new ApiException("Missing the required parameter 'audienceSegmentId' when calling updateContactListIdentifiers(Async)");
        }

        // verify the required parameter 'retailMediaContactlistAmendmentRequest' is set
        if (retailMediaContactlistAmendmentRequest == null) {
            throw new ApiException("Missing the required parameter 'retailMediaContactlistAmendmentRequest' when calling updateContactListIdentifiers(Async)");
        }

        return updateContactListIdentifiersCall(audienceSegmentId, retailMediaContactlistAmendmentRequest, _callback);

    }

    /**
     * 
     * Add/remove identifiers to or from a retail-media contact list audience-segment, with external audience segment id.
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @param retailMediaContactlistAmendmentRequest  (required)
     * @return RetailMediaContactlistOperation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public RetailMediaContactlistOperation updateContactListIdentifiers(Long audienceSegmentId, RetailMediaContactlistAmendmentRequest retailMediaContactlistAmendmentRequest) throws ApiException {
        ApiResponse<RetailMediaContactlistOperation> localVarResp = updateContactListIdentifiersWithHttpInfo(audienceSegmentId, retailMediaContactlistAmendmentRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Add/remove identifiers to or from a retail-media contact list audience-segment, with external audience segment id.
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @param retailMediaContactlistAmendmentRequest  (required)
     * @return ApiResponse&lt;RetailMediaContactlistOperation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RetailMediaContactlistOperation> updateContactListIdentifiersWithHttpInfo(Long audienceSegmentId, RetailMediaContactlistAmendmentRequest retailMediaContactlistAmendmentRequest) throws ApiException {
        okhttp3.Call localVarCall = updateContactListIdentifiersValidateBeforeCall(audienceSegmentId, retailMediaContactlistAmendmentRequest, null);
        Type localVarReturnType = new TypeToken<RetailMediaContactlistOperation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add/remove identifiers to or from a retail-media contact list audience-segment, with external audience segment id.
     * @param audienceSegmentId The id of the contact list audience-segment to amend, we only accept external Id here (required)
     * @param retailMediaContactlistAmendmentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateContactListIdentifiersAsync(Long audienceSegmentId, RetailMediaContactlistAmendmentRequest retailMediaContactlistAmendmentRequest, final ApiCallback<RetailMediaContactlistOperation> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateContactListIdentifiersValidateBeforeCall(audienceSegmentId, retailMediaContactlistAmendmentRequest, _callback);
        Type localVarReturnType = new TypeToken<RetailMediaContactlistOperation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
