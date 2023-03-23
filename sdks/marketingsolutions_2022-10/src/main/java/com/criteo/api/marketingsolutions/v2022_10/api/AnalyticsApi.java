/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_10.api;

import com.criteo.api.marketingsolutions.v2022_10.ApiCallback;
import com.criteo.api.marketingsolutions.v2022_10.ApiClient;
import com.criteo.api.marketingsolutions.v2022_10.ApiException;
import com.criteo.api.marketingsolutions.v2022_10.ApiResponse;
import com.criteo.api.marketingsolutions.v2022_10.Configuration;
import com.criteo.api.marketingsolutions.v2022_10.Pair;
import com.criteo.api.marketingsolutions.v2022_10.ProgressRequestBody;
import com.criteo.api.marketingsolutions.v2022_10.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.marketingsolutions.v2022_10.model.ErrorMessage;
import com.criteo.api.marketingsolutions.v2022_10.model.PlacementsReportQueryDataMessage;
import com.criteo.api.marketingsolutions.v2022_10.model.StatisticsReportQueryMessage;
import com.criteo.api.marketingsolutions.v2022_10.model.TransactionsReportQueryDataMessage;
import com.criteo.api.marketingsolutions.v2022_10.model.TransparencyQueryMessage;
import com.criteo.api.marketingsolutions.v2022_10.model.TransparencyReportDataMessage;

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
     * Build call for getAdsetReport
     * @param statisticsReportQueryMessage  (optional)
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
    public okhttp3.Call getAdsetReportCall(StatisticsReportQueryMessage statisticsReportQueryMessage, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = statisticsReportQueryMessage;

        // create path and map variables
        String localVarPath = "/2022-10/statistics/report";

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

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAdsetReportValidateBeforeCall(StatisticsReportQueryMessage statisticsReportQueryMessage, final ApiCallback _callback) throws ApiException {
        return getAdsetReportCall(statisticsReportQueryMessage, _callback);

    }

    /**
     * 
     * This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.
     * @param statisticsReportQueryMessage  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getAdsetReport(StatisticsReportQueryMessage statisticsReportQueryMessage) throws ApiException {
        ApiResponse<byte[]> localVarResp = getAdsetReportWithHttpInfo(statisticsReportQueryMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.
     * @param statisticsReportQueryMessage  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getAdsetReportWithHttpInfo(StatisticsReportQueryMessage statisticsReportQueryMessage) throws ApiException {
        okhttp3.Call localVarCall = getAdsetReportValidateBeforeCall(statisticsReportQueryMessage, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.
     * @param statisticsReportQueryMessage  (optional)
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
    public okhttp3.Call getAdsetReportAsync(StatisticsReportQueryMessage statisticsReportQueryMessage, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAdsetReportValidateBeforeCall(statisticsReportQueryMessage, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlacementsReport
     * @param placementsReportQueryDataMessage  (optional)
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
    public okhttp3.Call getPlacementsReportCall(PlacementsReportQueryDataMessage placementsReportQueryDataMessage, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = placementsReportQueryDataMessage;

        // create path and map variables
        String localVarPath = "/2022-10/placements/report";

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

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPlacementsReportValidateBeforeCall(PlacementsReportQueryDataMessage placementsReportQueryDataMessage, final ApiCallback _callback) throws ApiException {
        return getPlacementsReportCall(placementsReportQueryDataMessage, _callback);

    }

    /**
     * 
     * Your ads are placed in different domains (publishers) and environments (websites and apps). Thanks to the placements endpoint, you can analyse the performances for each publisher, comparing displays, clicks and sales generated.
     * @param placementsReportQueryDataMessage  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getPlacementsReport(PlacementsReportQueryDataMessage placementsReportQueryDataMessage) throws ApiException {
        ApiResponse<byte[]> localVarResp = getPlacementsReportWithHttpInfo(placementsReportQueryDataMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * Your ads are placed in different domains (publishers) and environments (websites and apps). Thanks to the placements endpoint, you can analyse the performances for each publisher, comparing displays, clicks and sales generated.
     * @param placementsReportQueryDataMessage  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getPlacementsReportWithHttpInfo(PlacementsReportQueryDataMessage placementsReportQueryDataMessage) throws ApiException {
        okhttp3.Call localVarCall = getPlacementsReportValidateBeforeCall(placementsReportQueryDataMessage, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Your ads are placed in different domains (publishers) and environments (websites and apps). Thanks to the placements endpoint, you can analyse the performances for each publisher, comparing displays, clicks and sales generated.
     * @param placementsReportQueryDataMessage  (optional)
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
    public okhttp3.Call getPlacementsReportAsync(PlacementsReportQueryDataMessage placementsReportQueryDataMessage, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlacementsReportValidateBeforeCall(placementsReportQueryDataMessage, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactionsReport
     * @param transactionsReportQueryDataMessage  (optional)
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
    public okhttp3.Call getTransactionsReportCall(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transactionsReportQueryDataMessage;

        // create path and map variables
        String localVarPath = "/2022-10/transactions/report";

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

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsReportValidateBeforeCall(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage, final ApiCallback _callback) throws ApiException {
        return getTransactionsReportCall(transactionsReportQueryDataMessage, _callback);

    }

    /**
     * 
     * This Transactions endpoint provides transactions id related data.
     * @param transactionsReportQueryDataMessage  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getTransactionsReport(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage) throws ApiException {
        ApiResponse<byte[]> localVarResp = getTransactionsReportWithHttpInfo(transactionsReportQueryDataMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * This Transactions endpoint provides transactions id related data.
     * @param transactionsReportQueryDataMessage  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getTransactionsReportWithHttpInfo(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsReportValidateBeforeCall(transactionsReportQueryDataMessage, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This Transactions endpoint provides transactions id related data.
     * @param transactionsReportQueryDataMessage  (optional)
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
    public okhttp3.Call getTransactionsReportAsync(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionsReportValidateBeforeCall(transactionsReportQueryDataMessage, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransparencyReport
     * @param advertiserId The advertiser id to fetch the transparency data. (required)
     * @param transparencyQueryMessage  (optional)
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
    public okhttp3.Call getTransparencyReportCall(Integer advertiserId, TransparencyQueryMessage transparencyQueryMessage, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transparencyQueryMessage;

        // create path and map variables
        String localVarPath = "/2022-10/log-level/advertisers/{advertiser-id}/report"
            .replace("{" + "advertiser-id" + "}", localVarApiClient.escapeString(advertiserId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain",
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

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransparencyReportValidateBeforeCall(Integer advertiserId, TransparencyQueryMessage transparencyQueryMessage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling getTransparencyReport(Async)");
        }

        return getTransparencyReportCall(advertiserId, transparencyQueryMessage, _callback);

    }

    /**
     * 
     * This Statistics endpoint provides publisher data.
     * @param advertiserId The advertiser id to fetch the transparency data. (required)
     * @param transparencyQueryMessage  (optional)
     * @return TransparencyReportDataMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public TransparencyReportDataMessage getTransparencyReport(Integer advertiserId, TransparencyQueryMessage transparencyQueryMessage) throws ApiException {
        ApiResponse<TransparencyReportDataMessage> localVarResp = getTransparencyReportWithHttpInfo(advertiserId, transparencyQueryMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * This Statistics endpoint provides publisher data.
     * @param advertiserId The advertiser id to fetch the transparency data. (required)
     * @param transparencyQueryMessage  (optional)
     * @return ApiResponse&lt;TransparencyReportDataMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransparencyReportDataMessage> getTransparencyReportWithHttpInfo(Integer advertiserId, TransparencyQueryMessage transparencyQueryMessage) throws ApiException {
        okhttp3.Call localVarCall = getTransparencyReportValidateBeforeCall(advertiserId, transparencyQueryMessage, null);
        Type localVarReturnType = new TypeToken<TransparencyReportDataMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This Statistics endpoint provides publisher data.
     * @param advertiserId The advertiser id to fetch the transparency data. (required)
     * @param transparencyQueryMessage  (optional)
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
    public okhttp3.Call getTransparencyReportAsync(Integer advertiserId, TransparencyQueryMessage transparencyQueryMessage, final ApiCallback<TransparencyReportDataMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransparencyReportValidateBeforeCall(advertiserId, transparencyQueryMessage, _callback);
        Type localVarReturnType = new TypeToken<TransparencyReportDataMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
