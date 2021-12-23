/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.AdSetDisplayMultiplierResource;
import com.criteo.api.marketingsolutions.preview.model.ProblemDetails;
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
public class AdSetDisplayMultiplierListResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<AdSetDisplayMultiplierResource> data = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ProblemDetails> warnings = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ProblemDetails> errors = null;


  public AdSetDisplayMultiplierListResponse data(List<AdSetDisplayMultiplierResource> data) {
    
    this.data = data;
    return this;
  }

  public AdSetDisplayMultiplierListResponse addDataItem(AdSetDisplayMultiplierResource dataItem) {
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

  public List<AdSetDisplayMultiplierResource> getData() {
    return data;
  }


  public void setData(List<AdSetDisplayMultiplierResource> data) {
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
    AdSetDisplayMultiplierListResponse adSetDisplayMultiplierListResponse = (AdSetDisplayMultiplierListResponse) o;
    return Objects.equals(this.data, adSetDisplayMultiplierListResponse.data) &&
        Objects.equals(this.warnings, adSetDisplayMultiplierListResponse.warnings) &&
        Objects.equals(this.errors, adSetDisplayMultiplierListResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, warnings, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetDisplayMultiplierListResponse {\n");
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

