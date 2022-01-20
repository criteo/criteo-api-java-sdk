/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_01.model;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Common problem object. Can be specialized as needed.
 */
@ApiModel(description = "Common problem object. Can be specialized as needed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommonProblem {
  public static final String SERIALIZED_NAME_TRACE_IDENTIFIER = "traceIdentifier";
  @SerializedName(SERIALIZED_NAME_TRACE_IDENTIFIER)
  private String traceIdentifier;

  /**
   * The problem&#39;s category.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    ACCESS_CONTROL("access-control"),
    
    AUTHENTICATION("authentication"),
    
    AUTHORIZATION("authorization"),
    
    AVAILABILITY("availability"),
    
    DEPRECATION("deprecation"),
    
    QUOTA("quota"),
    
    VALIDATION("validation");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

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

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Map<String, String> source = null;

  public static final String SERIALIZED_NAME_STACK_TRACE = "stackTrace";
  @SerializedName(SERIALIZED_NAME_STACK_TRACE)
  private String stackTrace;


  public CommonProblem traceIdentifier(String traceIdentifier) {
    
    this.traceIdentifier = traceIdentifier;
    return this;
  }

   /**
   * The request correlation ID this problem comes from.
   * @return traceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The request correlation ID this problem comes from.")

  public String getTraceIdentifier() {
    return traceIdentifier;
  }


  public void setTraceIdentifier(String traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
  }


  public CommonProblem type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The problem&#39;s category.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The problem's category.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CommonProblem code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A machine-readable  error code, expressed as a string value.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A machine-readable  error code, expressed as a string value.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CommonProblem instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A URI that identifies the specific occurrence of the problem.
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI that identifies the specific occurrence of the problem.")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public CommonProblem title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short human-readable description of the problem type
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short human-readable description of the problem type")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CommonProblem detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable explanation specific to this occurrence of the problem")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public CommonProblem source(Map<String, String> source) {
    
    this.source = source;
    return this;
  }

  public CommonProblem putSourceItem(String key, String sourceItem) {
    if (this.source == null) {
      this.source = new HashMap<>();
    }
    this.source.put(key, sourceItem);
    return this;
  }

   /**
   * A machine-readable structure to reference to the exact location(s) causing the error(s)
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A machine-readable structure to reference to the exact location(s) causing the error(s)")

  public Map<String, String> getSource() {
    return source;
  }


  public void setSource(Map<String, String> source) {
    this.source = source;
  }


  public CommonProblem stackTrace(String stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStackTrace() {
    return stackTrace;
  }


  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonProblem commonProblem = (CommonProblem) o;
    return Objects.equals(this.traceIdentifier, commonProblem.traceIdentifier) &&
        Objects.equals(this.type, commonProblem.type) &&
        Objects.equals(this.code, commonProblem.code) &&
        Objects.equals(this.instance, commonProblem.instance) &&
        Objects.equals(this.title, commonProblem.title) &&
        Objects.equals(this.detail, commonProblem.detail) &&
        Objects.equals(this.source, commonProblem.source) &&
        Objects.equals(this.stackTrace, commonProblem.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceIdentifier, type, code, instance, title, detail, source, stackTrace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonProblem {\n");
    sb.append("    traceIdentifier: ").append(toIndentedString(traceIdentifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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

