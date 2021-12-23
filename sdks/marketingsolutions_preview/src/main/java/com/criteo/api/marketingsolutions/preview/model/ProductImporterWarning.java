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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Warning descriptor.
 */
@ApiModel(description = "Warning descriptor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductImporterWarning {
  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;


  public ProductImporterWarning traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * The MACHINE-READABLE correlation ID provided by the gateway
   * @return traceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The MACHINE-READABLE correlation ID provided by the gateway")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public ProductImporterWarning type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A MACHINE-READABLE code specifying error category. This information is used on client side to focus on certain type of error, to either retry some processing or display only certain type of errors.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A MACHINE-READABLE code specifying error category. This information is used on client side to focus on certain type of error, to either retry some processing or display only certain type of errors.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ProductImporterWarning code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A MACHINE-READABLE error code string in kebab-case. Unique across Criteo
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A MACHINE-READABLE error code string in kebab-case. Unique across Criteo")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ProductImporterWarning instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A MACHINE-READABLE URI reference that identifies the specific occurrence of the problem. This could be useful when we want to the return the API Endpoint identifying the exact resource related to the error.
   * @return instance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A MACHINE-READABLE URI reference that identifies the specific occurrence of the problem. This could be useful when we want to the return the API Endpoint identifying the exact resource related to the error.")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public ProductImporterWarning title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, HUMAN-READABLE summary of the problem type. It should not change from occurrence to occurrence of the problem, except for purposes of localization.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A short, HUMAN-READABLE summary of the problem type. It should not change from occurrence to occurrence of the problem, except for purposes of localization.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ProductImporterWarning detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A HUMAN-READABLE detailed explanation specific to this occurrence of the problem. This should not be more that 1 paragraph
   * @return detail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A HUMAN-READABLE detailed explanation specific to this occurrence of the problem. This should not be more that 1 paragraph")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductImporterWarning productImporterWarning = (ProductImporterWarning) o;
    return Objects.equals(this.traceId, productImporterWarning.traceId) &&
        Objects.equals(this.type, productImporterWarning.type) &&
        Objects.equals(this.code, productImporterWarning.code) &&
        Objects.equals(this.instance, productImporterWarning.instance) &&
        Objects.equals(this.title, productImporterWarning.title) &&
        Objects.equals(this.detail, productImporterWarning.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceId, type, code, instance, title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductImporterWarning {\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

