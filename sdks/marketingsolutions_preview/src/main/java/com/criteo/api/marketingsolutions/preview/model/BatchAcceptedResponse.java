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


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A batch was accepted. The report can be accessed using the reporting endpoint.
 */
@ApiModel(description = "A batch was accepted. The report can be accessed using the reporting endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchAcceptedResponse {
  public static final String SERIALIZED_NAME_OPERATION_TOKEN = "operationToken";
  @SerializedName(SERIALIZED_NAME_OPERATION_TOKEN)
  private String operationToken;


  public BatchAcceptedResponse operationToken(String operationToken) {
    
    this.operationToken = operationToken;
    return this;
  }

   /**
   * Get operationToken
   * @return operationToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOperationToken() {
    return operationToken;
  }


  public void setOperationToken(String operationToken) {
    this.operationToken = operationToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchAcceptedResponse batchAcceptedResponse = (BatchAcceptedResponse) o;
    return Objects.equals(this.operationToken, batchAcceptedResponse.operationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchAcceptedResponse {\n");
    sb.append("    operationToken: ").append(toIndentedString(operationToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
