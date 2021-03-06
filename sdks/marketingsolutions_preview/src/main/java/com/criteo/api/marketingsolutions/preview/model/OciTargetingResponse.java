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
import com.criteo.api.marketingsolutions.preview.model.OciTargetingResponseData;
import com.criteo.api.marketingsolutions.preview.model.TargetingErrorModel;
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
 * Response container
 */
@ApiModel(description = "Response container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OciTargetingResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private OciTargetingResponseData data;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<TargetingErrorModel> warnings = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<TargetingErrorModel> errors = null;


  public OciTargetingResponse data(OciTargetingResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OciTargetingResponseData getData() {
    return data;
  }


  public void setData(OciTargetingResponseData data) {
    this.data = data;
  }


  public OciTargetingResponse warnings(List<TargetingErrorModel> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public OciTargetingResponse addWarningsItem(TargetingErrorModel warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * An array of warning objects
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of warning objects")

  public List<TargetingErrorModel> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<TargetingErrorModel> warnings) {
    this.warnings = warnings;
  }


  public OciTargetingResponse errors(List<TargetingErrorModel> errors) {
    
    this.errors = errors;
    return this;
  }

  public OciTargetingResponse addErrorsItem(TargetingErrorModel errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array of error objects
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of error objects")

  public List<TargetingErrorModel> getErrors() {
    return errors;
  }


  public void setErrors(List<TargetingErrorModel> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OciTargetingResponse ociTargetingResponse = (OciTargetingResponse) o;
    return Objects.equals(this.data, ociTargetingResponse.data) &&
        Objects.equals(this.warnings, ociTargetingResponse.warnings) &&
        Objects.equals(this.errors, ociTargetingResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, warnings, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OciTargetingResponse {\n");
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

