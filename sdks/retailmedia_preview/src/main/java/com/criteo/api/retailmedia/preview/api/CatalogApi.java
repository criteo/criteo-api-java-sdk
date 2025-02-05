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


import com.criteo.api.retailmedia.preview.model.BatchAcceptedResponse;
import com.criteo.api.retailmedia.preview.model.FailResponse;
import com.criteo.api.retailmedia.preview.model.ProductsCustomBatchRequest;
import com.criteo.api.retailmedia.preview.model.ReportOkResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CatalogApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CatalogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CatalogApi(ApiClient apiClient) {
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
     * Build call for previewRetailMediaCatalogProductsBatchPost
     * @param productsCustomBatchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch accepted. The status of the operation can be tracked using the report endpoint and the operationToken. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;json-format\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 413 </td><td> Request too large. By default, payload up to 16 MB is rejected. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;too-many-requests\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call previewRetailMediaCatalogProductsBatchPostCall(ProductsCustomBatchRequest productsCustomBatchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = productsCustomBatchRequest;

        // create path and map variables
        String localVarPath = "/preview/retail-media/catalog/products/batch";

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
    private okhttp3.Call previewRetailMediaCatalogProductsBatchPostValidateBeforeCall(ProductsCustomBatchRequest productsCustomBatchRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'productsCustomBatchRequest' is set
        if (productsCustomBatchRequest == null) {
            throw new ApiException("Missing the required parameter 'productsCustomBatchRequest' when calling previewRetailMediaCatalogProductsBatchPost(Async)");
        }

        return previewRetailMediaCatalogProductsBatchPostCall(productsCustomBatchRequest, _callback);

    }

    /**
     * 
     * Used to publish a batch of operations to insert, update and deletes products.  The batch is processed asynchronously.The response provides an operationToken which can be used to track  the status of the report of the operation.
     * @param productsCustomBatchRequest  (required)
     * @return BatchAcceptedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch accepted. The status of the operation can be tracked using the report endpoint and the operationToken. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;json-format\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 413 </td><td> Request too large. By default, payload up to 16 MB is rejected. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;too-many-requests\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public BatchAcceptedResponse previewRetailMediaCatalogProductsBatchPost(ProductsCustomBatchRequest productsCustomBatchRequest) throws ApiException {
        ApiResponse<BatchAcceptedResponse> localVarResp = previewRetailMediaCatalogProductsBatchPostWithHttpInfo(productsCustomBatchRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Used to publish a batch of operations to insert, update and deletes products.  The batch is processed asynchronously.The response provides an operationToken which can be used to track  the status of the report of the operation.
     * @param productsCustomBatchRequest  (required)
     * @return ApiResponse&lt;BatchAcceptedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch accepted. The status of the operation can be tracked using the report endpoint and the operationToken. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;json-format\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 413 </td><td> Request too large. By default, payload up to 16 MB is rejected. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;too-many-requests\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchAcceptedResponse> previewRetailMediaCatalogProductsBatchPostWithHttpInfo(ProductsCustomBatchRequest productsCustomBatchRequest) throws ApiException {
        okhttp3.Call localVarCall = previewRetailMediaCatalogProductsBatchPostValidateBeforeCall(productsCustomBatchRequest, null);
        Type localVarReturnType = new TypeToken<BatchAcceptedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Used to publish a batch of operations to insert, update and deletes products.  The batch is processed asynchronously.The response provides an operationToken which can be used to track  the status of the report of the operation.
     * @param productsCustomBatchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch accepted. The status of the operation can be tracked using the report endpoint and the operationToken. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;required-field\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;json-format\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 413 </td><td> Request too large. By default, payload up to 16 MB is rejected. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;too-many-requests\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call previewRetailMediaCatalogProductsBatchPostAsync(ProductsCustomBatchRequest productsCustomBatchRequest, final ApiCallback<BatchAcceptedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = previewRetailMediaCatalogProductsBatchPostValidateBeforeCall(productsCustomBatchRequest, _callback);
        Type localVarReturnType = new TypeToken<BatchAcceptedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for previewRetailMediaCatalogProductsBatchReportOperationTokenGet
     * @param operationToken The token returned by the batch endpoint. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The report object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-token-is-malformed\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-report-is-expired\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-not-found\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call previewRetailMediaCatalogProductsBatchReportOperationTokenGetCall(String operationToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/preview/retail-media/catalog/products/batch/report/{operation-token}"
            .replace("{" + "operation-token" + "}", localVarApiClient.escapeString(operationToken.toString()));

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
    private okhttp3.Call previewRetailMediaCatalogProductsBatchReportOperationTokenGetValidateBeforeCall(String operationToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'operationToken' is set
        if (operationToken == null) {
            throw new ApiException("Missing the required parameter 'operationToken' when calling previewRetailMediaCatalogProductsBatchReportOperationTokenGet(Async)");
        }

        return previewRetailMediaCatalogProductsBatchReportOperationTokenGetCall(operationToken, _callback);

    }

    /**
     * 
     * Get the report of an asynchronous batch operation previously requested
     * @param operationToken The token returned by the batch endpoint. (required)
     * @return ReportOkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The report object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-token-is-malformed\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-report-is-expired\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-not-found\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public ReportOkResponse previewRetailMediaCatalogProductsBatchReportOperationTokenGet(String operationToken) throws ApiException {
        ApiResponse<ReportOkResponse> localVarResp = previewRetailMediaCatalogProductsBatchReportOperationTokenGetWithHttpInfo(operationToken);
        return localVarResp.getData();
    }

    /**
     * 
     * Get the report of an asynchronous batch operation previously requested
     * @param operationToken The token returned by the batch endpoint. (required)
     * @return ApiResponse&lt;ReportOkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The report object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-token-is-malformed\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-report-is-expired\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-not-found\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportOkResponse> previewRetailMediaCatalogProductsBatchReportOperationTokenGetWithHttpInfo(String operationToken) throws ApiException {
        okhttp3.Call localVarCall = previewRetailMediaCatalogProductsBatchReportOperationTokenGetValidateBeforeCall(operationToken, null);
        Type localVarReturnType = new TypeToken<ReportOkResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the report of an asynchronous batch operation previously requested
     * @param operationToken The token returned by the batch endpoint. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The report object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-token-is-malformed\&quot;),(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-report-is-expired\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Allowed error types and errors: [(type&#x3D;\&quot;authentication\&quot;, code&#x3D;\&quot;not-authenticated\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. Allowed error types and errors: [(type&#x3D;\&quot;authorization\&quot;, code&#x3D;\&quot;not-authorized\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found. Allowed error types and errors: [(type&#x3D;\&quot;validation\&quot;, code&#x3D;\&quot;catalog-operation-not-found\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;internal-error\&quot;)] </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable. Allowed error types and errors: [(type&#x3D;\&quot;availability\&quot;, code&#x3D;\&quot;service-unavailable\&quot;)] </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call previewRetailMediaCatalogProductsBatchReportOperationTokenGetAsync(String operationToken, final ApiCallback<ReportOkResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = previewRetailMediaCatalogProductsBatchReportOperationTokenGetValidateBeforeCall(operationToken, _callback);
        Type localVarReturnType = new TypeToken<ReportOkResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
