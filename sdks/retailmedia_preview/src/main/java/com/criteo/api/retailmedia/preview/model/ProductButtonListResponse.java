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


package com.criteo.api.retailmedia.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.preview.model.ProblemDetails;
import com.criteo.api.retailmedia.preview.model.ResourceOfProductButtonResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data model for a list of response resources
 */
@ApiModel(description = "Data model for a list of response resources")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductButtonListResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ResourceOfProductButtonResponse> data = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ProblemDetails> warnings = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ProblemDetails> errors = null;


  public ProductButtonListResponse data(List<ResourceOfProductButtonResponse> data) {
    
    this.data = data;
    return this;
  }

  public ProductButtonListResponse addDataItem(ResourceOfProductButtonResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ResourceOfProductButtonResponse> getData() {
    return data;
  }


  public void setData(List<ResourceOfProductButtonResponse> data) {
    this.data = data;
  }


   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProblemDetails> getWarnings() {
    return warnings;
  }




   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProblemDetails> getErrors() {
    return errors;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductButtonListResponse productButtonListResponse = (ProductButtonListResponse) o;
    return Objects.equals(this.data, productButtonListResponse.data) &&
        Objects.equals(this.warnings, productButtonListResponse.warnings) &&
        Objects.equals(this.errors, productButtonListResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, warnings, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductButtonListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

