/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_04.auth;

/**
 * OAuth flows that are supported by this client
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public enum OAuthFlow {
    ACCESS_CODE, //called authorizationCode  in OpenAPI 3.0
    IMPLICIT,
    PASSWORD,
    APPLICATION //called clientCredentials in OpenAPI 3.0
}
