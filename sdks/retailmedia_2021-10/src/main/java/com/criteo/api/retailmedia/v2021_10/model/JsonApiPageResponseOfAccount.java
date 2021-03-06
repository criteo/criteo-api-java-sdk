/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2021-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2021_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2021_10.model.CommonError;
import com.criteo.api.retailmedia.v2021_10.model.CommonWarning;
import com.criteo.api.retailmedia.v2021_10.model.JsonApiBodyWithIdOfInt64AndAccountAndAccount;
import com.criteo.api.retailmedia.v2021_10.model.PageMetadata;
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
 * A wrapper class to return a single page of &lt;typeparamref name&#x3D;\&quot;T\&quot; /&gt; with metadata
 */
@ApiModel(description = "A wrapper class to return a single page of <typeparamref name=\"T\" /> with metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonApiPageResponseOfAccount {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonError> errors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonWarning> warnings = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PageMetadata metadata;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<JsonApiBodyWithIdOfInt64AndAccountAndAccount> data = new ArrayList<>();


  public JsonApiPageResponseOfAccount errors(List<CommonError> errors) {
    
    this.errors = errors;
    return this;
  }

  public JsonApiPageResponseOfAccount addErrorsItem(CommonError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommonError> getErrors() {
    return errors;
  }


  public void setErrors(List<CommonError> errors) {
    this.errors = errors;
  }


  public JsonApiPageResponseOfAccount warnings(List<CommonWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public JsonApiPageResponseOfAccount addWarningsItem(CommonWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommonWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<CommonWarning> warnings) {
    this.warnings = warnings;
  }


  public JsonApiPageResponseOfAccount metadata(PageMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PageMetadata metadata) {
    this.metadata = metadata;
  }


  public JsonApiPageResponseOfAccount data(List<JsonApiBodyWithIdOfInt64AndAccountAndAccount> data) {
    
    this.data = data;
    return this;
  }

  public JsonApiPageResponseOfAccount addDataItem(JsonApiBodyWithIdOfInt64AndAccountAndAccount dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<JsonApiBodyWithIdOfInt64AndAccountAndAccount> getData() {
    return data;
  }


  public void setData(List<JsonApiBodyWithIdOfInt64AndAccountAndAccount> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiPageResponseOfAccount jsonApiPageResponseOfAccount = (JsonApiPageResponseOfAccount) o;
    return Objects.equals(this.errors, jsonApiPageResponseOfAccount.errors) &&
        Objects.equals(this.warnings, jsonApiPageResponseOfAccount.warnings) &&
        Objects.equals(this.metadata, jsonApiPageResponseOfAccount.metadata) &&
        Objects.equals(this.data, jsonApiPageResponseOfAccount.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings, metadata, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiPageResponseOfAccount {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

