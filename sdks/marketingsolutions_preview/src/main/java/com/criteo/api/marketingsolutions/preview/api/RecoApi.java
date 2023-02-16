/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.api;

import com.criteo.api.marketingsolutions.preview.ApiCallback;
import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.ApiResponse;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.Pair;
import com.criteo.api.marketingsolutions.preview.ProgressRequestBody;
import com.criteo.api.marketingsolutions.preview.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.marketingsolutions.preview.model.OkResponse;
import com.criteo.api.marketingsolutions.preview.model.Outcome;
import com.criteo.api.marketingsolutions.preview.model.PreviewFailResponse;
import com.criteo.api.marketingsolutions.preview.model.ProductSetStatisticsQuery;
import com.criteo.api.marketingsolutions.preview.model.ResourceCollectionOutcomeOfProductSet;
import com.criteo.api.marketingsolutions.preview.model.ResourceOutcomeOfProductSet;
import com.criteo.api.marketingsolutions.preview.model.ValueResourceInputOfCreateProductSetRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecoApi {
    private ApiClient localVarApiClient;

    public RecoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecoApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createProductSet
     * @param valueResourceInputOfCreateProductSetRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Cannot process entity content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProductSetCall(ValueResourceInputOfCreateProductSetRequest valueResourceInputOfCreateProductSetRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = valueResourceInputOfCreateProductSetRequest;

        // create path and map variables
        String localVarPath = "/preview/product-sets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createProductSetValidateBeforeCall(ValueResourceInputOfCreateProductSetRequest valueResourceInputOfCreateProductSetRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createProductSetCall(valueResourceInputOfCreateProductSetRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create a new product set
     * @param valueResourceInputOfCreateProductSetRequest  (optional)
     * @return ResourceOutcomeOfProductSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Cannot process entity content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ResourceOutcomeOfProductSet createProductSet(ValueResourceInputOfCreateProductSetRequest valueResourceInputOfCreateProductSetRequest) throws ApiException {
        ApiResponse<ResourceOutcomeOfProductSet> localVarResp = createProductSetWithHttpInfo(valueResourceInputOfCreateProductSetRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a new product set
     * @param valueResourceInputOfCreateProductSetRequest  (optional)
     * @return ApiResponse&lt;ResourceOutcomeOfProductSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Cannot process entity content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceOutcomeOfProductSet> createProductSetWithHttpInfo(ValueResourceInputOfCreateProductSetRequest valueResourceInputOfCreateProductSetRequest) throws ApiException {
        okhttp3.Call localVarCall = createProductSetValidateBeforeCall(valueResourceInputOfCreateProductSetRequest, null);
        Type localVarReturnType = new TypeToken<ResourceOutcomeOfProductSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a new product set
     * @param valueResourceInputOfCreateProductSetRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Cannot process entity content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProductSetAsync(ValueResourceInputOfCreateProductSetRequest valueResourceInputOfCreateProductSetRequest, final ApiCallback<ResourceOutcomeOfProductSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = createProductSetValidateBeforeCall(valueResourceInputOfCreateProductSetRequest, _callback);
        Type localVarReturnType = new TypeToken<ResourceOutcomeOfProductSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchProductSet
     * @param productSetId ID of the product set (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchProductSetCall(String productSetId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/preview/product-sets/{product-set-id}"
            .replaceAll("\\{" + "product-set-id" + "\\}", localVarApiClient.escapeString(productSetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchProductSetValidateBeforeCall(String productSetId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productSetId' is set
        if (productSetId == null) {
            throw new ApiException("Missing the required parameter 'productSetId' when calling fetchProductSet(Async)");
        }
        

        okhttp3.Call localVarCall = fetchProductSetCall(productSetId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Fetch an existing product set
     * @param productSetId ID of the product set (required)
     * @return ResourceOutcomeOfProductSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ResourceOutcomeOfProductSet fetchProductSet(String productSetId) throws ApiException {
        ApiResponse<ResourceOutcomeOfProductSet> localVarResp = fetchProductSetWithHttpInfo(productSetId);
        return localVarResp.getData();
    }

    /**
     * 
     * Fetch an existing product set
     * @param productSetId ID of the product set (required)
     * @return ApiResponse&lt;ResourceOutcomeOfProductSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceOutcomeOfProductSet> fetchProductSetWithHttpInfo(String productSetId) throws ApiException {
        okhttp3.Call localVarCall = fetchProductSetValidateBeforeCall(productSetId, null);
        Type localVarReturnType = new TypeToken<ResourceOutcomeOfProductSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Fetch an existing product set
     * @param productSetId ID of the product set (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Product set fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchProductSetAsync(String productSetId, final ApiCallback<ResourceOutcomeOfProductSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchProductSetValidateBeforeCall(productSetId, _callback);
        Type localVarReturnType = new TypeToken<ResourceOutcomeOfProductSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchProductSets
     * @param datasetId The ID of the dataset that should be used for product set retrieval (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Products sets fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchProductSetsCall(String datasetId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/preview/product-sets/dataset/{dataset-id}"
            .replaceAll("\\{" + "dataset-id" + "\\}", localVarApiClient.escapeString(datasetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchProductSetsValidateBeforeCall(String datasetId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'datasetId' is set
        if (datasetId == null) {
            throw new ApiException("Missing the required parameter 'datasetId' when calling fetchProductSets(Async)");
        }
        

        okhttp3.Call localVarCall = fetchProductSetsCall(datasetId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Fetch product sets of a given dataset
     * @param datasetId The ID of the dataset that should be used for product set retrieval (required)
     * @return ResourceCollectionOutcomeOfProductSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Products sets fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ResourceCollectionOutcomeOfProductSet fetchProductSets(String datasetId) throws ApiException {
        ApiResponse<ResourceCollectionOutcomeOfProductSet> localVarResp = fetchProductSetsWithHttpInfo(datasetId);
        return localVarResp.getData();
    }

    /**
     * 
     * Fetch product sets of a given dataset
     * @param datasetId The ID of the dataset that should be used for product set retrieval (required)
     * @return ApiResponse&lt;ResourceCollectionOutcomeOfProductSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Products sets fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceCollectionOutcomeOfProductSet> fetchProductSetsWithHttpInfo(String datasetId) throws ApiException {
        okhttp3.Call localVarCall = fetchProductSetsValidateBeforeCall(datasetId, null);
        Type localVarReturnType = new TypeToken<ResourceCollectionOutcomeOfProductSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Fetch product sets of a given dataset
     * @param datasetId The ID of the dataset that should be used for product set retrieval (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Products sets fetched successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Unable to parse the request parameters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchProductSetsAsync(String datasetId, final ApiCallback<ResourceCollectionOutcomeOfProductSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchProductSetsValidateBeforeCall(datasetId, _callback);
        Type localVarReturnType = new TypeToken<ResourceCollectionOutcomeOfProductSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for previewProductSetsPreviewPost
     * @param productSetStatisticsQuery  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call previewProductSetsPreviewPostCall(ProductSetStatisticsQuery productSetStatisticsQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = productSetStatisticsQuery;

        // create path and map variables
        String localVarPath = "/preview/product-sets/preview";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call previewProductSetsPreviewPostValidateBeforeCall(ProductSetStatisticsQuery productSetStatisticsQuery, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productSetStatisticsQuery' is set
        if (productSetStatisticsQuery == null) {
            throw new ApiException("Missing the required parameter 'productSetStatisticsQuery' when calling previewProductSetsPreviewPost(Async)");
        }
        

        okhttp3.Call localVarCall = previewProductSetsPreviewPostCall(productSetStatisticsQuery, _callback);
        return localVarCall;

    }

    /**
     * 
     * Display a preview of product set rules
     * @param productSetStatisticsQuery  (required)
     * @return OkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public OkResponse previewProductSetsPreviewPost(ProductSetStatisticsQuery productSetStatisticsQuery) throws ApiException {
        ApiResponse<OkResponse> localVarResp = previewProductSetsPreviewPostWithHttpInfo(productSetStatisticsQuery);
        return localVarResp.getData();
    }

    /**
     * 
     * Display a preview of product set rules
     * @param productSetStatisticsQuery  (required)
     * @return ApiResponse&lt;OkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OkResponse> previewProductSetsPreviewPostWithHttpInfo(ProductSetStatisticsQuery productSetStatisticsQuery) throws ApiException {
        okhttp3.Call localVarCall = previewProductSetsPreviewPostValidateBeforeCall(productSetStatisticsQuery, null);
        Type localVarReturnType = new TypeToken<OkResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Display a preview of product set rules
     * @param productSetStatisticsQuery  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call previewProductSetsPreviewPostAsync(ProductSetStatisticsQuery productSetStatisticsQuery, final ApiCallback<OkResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = previewProductSetsPreviewPostValidateBeforeCall(productSetStatisticsQuery, _callback);
        Type localVarReturnType = new TypeToken<OkResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeProductSet
     * @param productSetId ID of the product set to remove (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> ProductSet removed successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request was not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeProductSetCall(String productSetId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/preview/product-sets/{product-set-id}"
            .replaceAll("\\{" + "product-set-id" + "\\}", localVarApiClient.escapeString(productSetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeProductSetValidateBeforeCall(String productSetId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productSetId' is set
        if (productSetId == null) {
            throw new ApiException("Missing the required parameter 'productSetId' when calling removeProductSet(Async)");
        }
        

        okhttp3.Call localVarCall = removeProductSetCall(productSetId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Remove a product set
     * @param productSetId ID of the product set to remove (required)
     * @return Outcome
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> ProductSet removed successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request was not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public Outcome removeProductSet(String productSetId) throws ApiException {
        ApiResponse<Outcome> localVarResp = removeProductSetWithHttpInfo(productSetId);
        return localVarResp.getData();
    }

    /**
     * 
     * Remove a product set
     * @param productSetId ID of the product set to remove (required)
     * @return ApiResponse&lt;Outcome&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> ProductSet removed successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request was not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Outcome> removeProductSetWithHttpInfo(String productSetId) throws ApiException {
        okhttp3.Call localVarCall = removeProductSetValidateBeforeCall(productSetId, null);
        Type localVarReturnType = new TypeToken<Outcome>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Remove a product set
     * @param productSetId ID of the product set to remove (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> ProductSet removed successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request was not valid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeProductSetAsync(String productSetId, final ApiCallback<Outcome> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeProductSetValidateBeforeCall(productSetId, _callback);
        Type localVarReturnType = new TypeToken<Outcome>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
