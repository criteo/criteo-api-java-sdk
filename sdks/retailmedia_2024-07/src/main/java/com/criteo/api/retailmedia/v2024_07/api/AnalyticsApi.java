/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_07.api;

import com.criteo.api.retailmedia.v2024_07.ApiCallback;
import com.criteo.api.retailmedia.v2024_07.ApiClient;
import com.criteo.api.retailmedia.v2024_07.ApiException;
import com.criteo.api.retailmedia.v2024_07.ApiResponse;
import com.criteo.api.retailmedia.v2024_07.Configuration;
import com.criteo.api.retailmedia.v2024_07.Pair;
import com.criteo.api.retailmedia.v2024_07.ProgressRequestBody;
import com.criteo.api.retailmedia.v2024_07.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.retailmedia.v2024_07.model.AsyncCampaignsReportRequest;
import com.criteo.api.retailmedia.v2024_07.model.AsyncLineItemsReportRequest;
import com.criteo.api.retailmedia.v2024_07.model.AsyncReportResponse;
import com.criteo.api.retailmedia.v2024_07.model.AsyncRevenueReportRequest;
import com.criteo.api.retailmedia.v2024_07.model.ReportOutcome;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AnalyticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AnalyticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnalyticsApi(ApiClient apiClient) {
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
     * Build call for generateAsyncCampaignsReport
     * @param asyncCampaignsReportRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAsyncCampaignsReportCall(AsyncCampaignsReportRequest asyncCampaignsReportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = asyncCampaignsReportRequest;

        // create path and map variables
        String localVarPath = "/2024-07/retail-media/reports/campaigns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateAsyncCampaignsReportValidateBeforeCall(AsyncCampaignsReportRequest asyncCampaignsReportRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'asyncCampaignsReportRequest' is set
        if (asyncCampaignsReportRequest == null) {
            throw new ApiException("Missing the required parameter 'asyncCampaignsReportRequest' when calling generateAsyncCampaignsReport(Async)");
        }

        return generateAsyncCampaignsReportCall(asyncCampaignsReportRequest, _callback);

    }

    /**
     * 
     * Return an asynchronous Campaigns Report This endpoint is subject to specific rate limits.
     * @param asyncCampaignsReportRequest  (required)
     * @return AsyncReportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public AsyncReportResponse generateAsyncCampaignsReport(AsyncCampaignsReportRequest asyncCampaignsReportRequest) throws ApiException {
        ApiResponse<AsyncReportResponse> localVarResp = generateAsyncCampaignsReportWithHttpInfo(asyncCampaignsReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Return an asynchronous Campaigns Report This endpoint is subject to specific rate limits.
     * @param asyncCampaignsReportRequest  (required)
     * @return ApiResponse&lt;AsyncReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AsyncReportResponse> generateAsyncCampaignsReportWithHttpInfo(AsyncCampaignsReportRequest asyncCampaignsReportRequest) throws ApiException {
        okhttp3.Call localVarCall = generateAsyncCampaignsReportValidateBeforeCall(asyncCampaignsReportRequest, null);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Return an asynchronous Campaigns Report This endpoint is subject to specific rate limits.
     * @param asyncCampaignsReportRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAsyncCampaignsReportAsync(AsyncCampaignsReportRequest asyncCampaignsReportRequest, final ApiCallback<AsyncReportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateAsyncCampaignsReportValidateBeforeCall(asyncCampaignsReportRequest, _callback);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for generateAsyncLineItemsReport
     * @param asyncLineItemsReportRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAsyncLineItemsReportCall(AsyncLineItemsReportRequest asyncLineItemsReportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = asyncLineItemsReportRequest;

        // create path and map variables
        String localVarPath = "/2024-07/retail-media/reports/line-items";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateAsyncLineItemsReportValidateBeforeCall(AsyncLineItemsReportRequest asyncLineItemsReportRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'asyncLineItemsReportRequest' is set
        if (asyncLineItemsReportRequest == null) {
            throw new ApiException("Missing the required parameter 'asyncLineItemsReportRequest' when calling generateAsyncLineItemsReport(Async)");
        }

        return generateAsyncLineItemsReportCall(asyncLineItemsReportRequest, _callback);

    }

    /**
     * 
     * Returns an asynchronous Line Items Report This endpoint is subject to specific rate limits.
     * @param asyncLineItemsReportRequest  (required)
     * @return AsyncReportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public AsyncReportResponse generateAsyncLineItemsReport(AsyncLineItemsReportRequest asyncLineItemsReportRequest) throws ApiException {
        ApiResponse<AsyncReportResponse> localVarResp = generateAsyncLineItemsReportWithHttpInfo(asyncLineItemsReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an asynchronous Line Items Report This endpoint is subject to specific rate limits.
     * @param asyncLineItemsReportRequest  (required)
     * @return ApiResponse&lt;AsyncReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AsyncReportResponse> generateAsyncLineItemsReportWithHttpInfo(AsyncLineItemsReportRequest asyncLineItemsReportRequest) throws ApiException {
        okhttp3.Call localVarCall = generateAsyncLineItemsReportValidateBeforeCall(asyncLineItemsReportRequest, null);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an asynchronous Line Items Report This endpoint is subject to specific rate limits.
     * @param asyncLineItemsReportRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAsyncLineItemsReportAsync(AsyncLineItemsReportRequest asyncLineItemsReportRequest, final ApiCallback<AsyncReportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateAsyncLineItemsReportValidateBeforeCall(asyncLineItemsReportRequest, _callback);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for generateAsyncRevenueReport
     * @param asyncRevenueReportRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAsyncRevenueReportCall(AsyncRevenueReportRequest asyncRevenueReportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = asyncRevenueReportRequest;

        // create path and map variables
        String localVarPath = "/2024-07/retail-media/reports/revenue";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth", "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateAsyncRevenueReportValidateBeforeCall(AsyncRevenueReportRequest asyncRevenueReportRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'asyncRevenueReportRequest' is set
        if (asyncRevenueReportRequest == null) {
            throw new ApiException("Missing the required parameter 'asyncRevenueReportRequest' when calling generateAsyncRevenueReport(Async)");
        }

        return generateAsyncRevenueReportCall(asyncRevenueReportRequest, _callback);

    }

    /**
     * 
     * Returns an asynchronous Revenue Report This endpoint is subject to specific rate limits.
     * @param asyncRevenueReportRequest  (required)
     * @return AsyncReportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public AsyncReportResponse generateAsyncRevenueReport(AsyncRevenueReportRequest asyncRevenueReportRequest) throws ApiException {
        ApiResponse<AsyncReportResponse> localVarResp = generateAsyncRevenueReportWithHttpInfo(asyncRevenueReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an asynchronous Revenue Report This endpoint is subject to specific rate limits.
     * @param asyncRevenueReportRequest  (required)
     * @return ApiResponse&lt;AsyncReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AsyncReportResponse> generateAsyncRevenueReportWithHttpInfo(AsyncRevenueReportRequest asyncRevenueReportRequest) throws ApiException {
        okhttp3.Call localVarCall = generateAsyncRevenueReportValidateBeforeCall(asyncRevenueReportRequest, null);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an asynchronous Revenue Report This endpoint is subject to specific rate limits.
     * @param asyncRevenueReportRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateAsyncRevenueReportAsync(AsyncRevenueReportRequest asyncRevenueReportRequest, final ApiCallback<AsyncReportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateAsyncRevenueReportValidateBeforeCall(asyncRevenueReportRequest, _callback);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAsyncExportOutput
     * @param reportId The ID of the report to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsyncExportOutputCall(String reportId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2024-07/retail-media/reports/{reportId}/output"
            .replace("{" + "reportId" + "}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getAsyncExportOutputValidateBeforeCall(String reportId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getAsyncExportOutput(Async)");
        }

        return getAsyncExportOutputCall(reportId, _callback);

    }

    /**
     * 
     * Returns the output of an async report
     * @param reportId The ID of the report to retrieve (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public String getAsyncExportOutput(String reportId) throws ApiException {
        ApiResponse<String> localVarResp = getAsyncExportOutputWithHttpInfo(reportId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns the output of an async report
     * @param reportId The ID of the report to retrieve (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getAsyncExportOutputWithHttpInfo(String reportId) throws ApiException {
        okhttp3.Call localVarCall = getAsyncExportOutputValidateBeforeCall(reportId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the output of an async report
     * @param reportId The ID of the report to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsyncExportOutputAsync(String reportId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAsyncExportOutputValidateBeforeCall(reportId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAsyncExportStatus
     * @param reportId The ID of the report to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsyncExportStatusCall(String reportId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2024-07/retail-media/reports/{reportId}/status"
            .replace("{" + "reportId" + "}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getAsyncExportStatusValidateBeforeCall(String reportId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getAsyncExportStatus(Async)");
        }

        return getAsyncExportStatusCall(reportId, _callback);

    }

    /**
     * 
     * Returns the status of an async report
     * @param reportId The ID of the report to retrieve (required)
     * @return AsyncReportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public AsyncReportResponse getAsyncExportStatus(String reportId) throws ApiException {
        ApiResponse<AsyncReportResponse> localVarResp = getAsyncExportStatusWithHttpInfo(reportId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns the status of an async report
     * @param reportId The ID of the report to retrieve (required)
     * @return ApiResponse&lt;AsyncReportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AsyncReportResponse> getAsyncExportStatusWithHttpInfo(String reportId) throws ApiException {
        okhttp3.Call localVarCall = getAsyncExportStatusValidateBeforeCall(reportId, null);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the status of an async report
     * @param reportId The ID of the report to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsyncExportStatusAsync(String reportId, final ApiCallback<AsyncReportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAsyncExportStatusValidateBeforeCall(reportId, _callback);
        Type localVarReturnType = new TypeToken<AsyncReportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
