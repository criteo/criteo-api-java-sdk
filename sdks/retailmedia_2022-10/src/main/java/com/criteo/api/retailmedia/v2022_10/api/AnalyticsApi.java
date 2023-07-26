/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2022-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_10.api;

import com.criteo.api.retailmedia.v2022_10.ApiCallback;
import com.criteo.api.retailmedia.v2022_10.ApiClient;
import com.criteo.api.retailmedia.v2022_10.ApiException;
import com.criteo.api.retailmedia.v2022_10.ApiResponse;
import com.criteo.api.retailmedia.v2022_10.Configuration;
import com.criteo.api.retailmedia.v2022_10.Pair;
import com.criteo.api.retailmedia.v2022_10.ProgressRequestBody;
import com.criteo.api.retailmedia.v2022_10.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.retailmedia.v2022_10.model.BadRequest;
import com.criteo.api.retailmedia.v2022_10.model.EnvelopeReportRequest;
import com.criteo.api.retailmedia.v2022_10.model.EnvelopeReportStatus;

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
     * Build call for getReportOutput
     * @param reportId report id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportOutputCall(String reportId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2022-10/retail-media/reports/{reportId}/output"
            .replace("{" + "reportId" + "}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
    private okhttp3.Call getReportOutputValidateBeforeCall(String reportId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportOutput(Async)");
        }

        return getReportOutputCall(reportId, _callback);

    }

    /**
     * 
     * Request the report output
     * @param reportId report id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public String getReportOutput(String reportId) throws ApiException {
        ApiResponse<String> localVarResp = getReportOutputWithHttpInfo(reportId);
        return localVarResp.getData();
    }

    /**
     * 
     * Request the report output
     * @param reportId report id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getReportOutputWithHttpInfo(String reportId) throws ApiException {
        okhttp3.Call localVarCall = getReportOutputValidateBeforeCall(reportId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request the report output
     * @param reportId report id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportOutputAsync(String reportId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportOutputValidateBeforeCall(reportId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReportStatus
     * @param reportId report id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportStatusCall(String reportId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2022-10/retail-media/reports/{reportId}/status"
            .replace("{" + "reportId" + "}", localVarApiClient.escapeString(reportId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportStatusValidateBeforeCall(String reportId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportStatus(Async)");
        }

        return getReportStatusCall(reportId, _callback);

    }

    /**
     * 
     * Get the status of the report
     * @param reportId report id (required)
     * @return EnvelopeReportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeReportStatus getReportStatus(String reportId) throws ApiException {
        ApiResponse<EnvelopeReportStatus> localVarResp = getReportStatusWithHttpInfo(reportId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get the status of the report
     * @param reportId report id (required)
     * @return ApiResponse&lt;EnvelopeReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeReportStatus> getReportStatusWithHttpInfo(String reportId) throws ApiException {
        okhttp3.Call localVarCall = getReportStatusValidateBeforeCall(reportId, null);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the status of the report
     * @param reportId report id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportStatusAsync(String reportId, final ApiCallback<EnvelopeReportStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportStatusValidateBeforeCall(reportId, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for requestCampaignReport
     * @param envelopeReportRequest Envelope of the request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestCampaignReportCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = envelopeReportRequest;

        // create path and map variables
        String localVarPath = "/2022-10/retail-media/reports/campaigns";

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
    private okhttp3.Call requestCampaignReportValidateBeforeCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'envelopeReportRequest' is set
        if (envelopeReportRequest == null) {
            throw new ApiException("Missing the required parameter 'envelopeReportRequest' when calling requestCampaignReport(Async)");
        }

        return requestCampaignReportCall(envelopeReportRequest, _callback);

    }

    /**
     * 
     * Request a campaign report
     * @param envelopeReportRequest Envelope of the request (required)
     * @return EnvelopeReportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeReportStatus requestCampaignReport(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        ApiResponse<EnvelopeReportStatus> localVarResp = requestCampaignReportWithHttpInfo(envelopeReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Request a campaign report
     * @param envelopeReportRequest Envelope of the request (required)
     * @return ApiResponse&lt;EnvelopeReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeReportStatus> requestCampaignReportWithHttpInfo(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        okhttp3.Call localVarCall = requestCampaignReportValidateBeforeCall(envelopeReportRequest, null);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request a campaign report
     * @param envelopeReportRequest Envelope of the request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestCampaignReportAsync(EnvelopeReportRequest envelopeReportRequest, final ApiCallback<EnvelopeReportStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestCampaignReportValidateBeforeCall(envelopeReportRequest, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for requestLineItemReport
     * @param envelopeReportRequest Envelope of the request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestLineItemReportCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = envelopeReportRequest;

        // create path and map variables
        String localVarPath = "/2022-10/retail-media/reports/line-items";

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
    private okhttp3.Call requestLineItemReportValidateBeforeCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'envelopeReportRequest' is set
        if (envelopeReportRequest == null) {
            throw new ApiException("Missing the required parameter 'envelopeReportRequest' when calling requestLineItemReport(Async)");
        }

        return requestLineItemReportCall(envelopeReportRequest, _callback);

    }

    /**
     * 
     * Request a line item report
     * @param envelopeReportRequest Envelope of the request (required)
     * @return EnvelopeReportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeReportStatus requestLineItemReport(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        ApiResponse<EnvelopeReportStatus> localVarResp = requestLineItemReportWithHttpInfo(envelopeReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Request a line item report
     * @param envelopeReportRequest Envelope of the request (required)
     * @return ApiResponse&lt;EnvelopeReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeReportStatus> requestLineItemReportWithHttpInfo(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        okhttp3.Call localVarCall = requestLineItemReportValidateBeforeCall(envelopeReportRequest, null);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request a line item report
     * @param envelopeReportRequest Envelope of the request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestLineItemReportAsync(EnvelopeReportRequest envelopeReportRequest, final ApiCallback<EnvelopeReportStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestLineItemReportValidateBeforeCall(envelopeReportRequest, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
