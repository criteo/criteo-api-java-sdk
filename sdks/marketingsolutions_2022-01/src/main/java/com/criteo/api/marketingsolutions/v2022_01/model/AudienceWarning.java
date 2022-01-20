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


package com.criteo.api.marketingsolutions.v2022_01.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * Definition of the warning
 */
@ApiModel(description = "Definition of the warning")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceWarning {
  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  /**
   * (REQUIRED) The classification of the error
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
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
  private Object source;

  public static final String SERIALIZED_NAME_STACK_TRACE = "stackTrace";
  @SerializedName(SERIALIZED_NAME_STACK_TRACE)
  private List<String> stackTrace = null;


  public AudienceWarning traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * (REQUIRED) The Correlation ID provided by the Gateway. It is also a unique identifier for this particular occurrence of the problem.
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(REQUIRED) The Correlation ID provided by the Gateway. It is also a unique identifier for this particular occurrence of the problem.")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public AudienceWarning type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * (REQUIRED) The classification of the error
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(REQUIRED) The classification of the error")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AudienceWarning code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * (REQUIRED) A machine-readable unique error code, expressed as a string value. The format used must be kebab-case.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(REQUIRED) A machine-readable unique error code, expressed as a string value. The format used must be kebab-case.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AudienceWarning instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * (REQUIRED) A URI reference that identifies the specific occurrence of the problem
   * @return instance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(REQUIRED) A URI reference that identifies the specific occurrence of the problem")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public AudienceWarning title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * (RECOMMENDED) A short, human-readable summary of the problem type
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(RECOMMENDED) A short, human-readable summary of the problem type")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AudienceWarning detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * (REQUIRED) A human-readable explanation specific to this occurrence of the problem
   * @return detail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(REQUIRED) A human-readable explanation specific to this occurrence of the problem")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public AudienceWarning source(Object source) {
    
    this.source = source;
    return this;
  }

   /**
   * (OPTIONAL) A machine-readable structure to reference to the exact location(s) causing the error(s)
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(OPTIONAL) A machine-readable structure to reference to the exact location(s) causing the error(s)")

  public Object getSource() {
    return source;
  }


  public void setSource(Object source) {
    this.source = source;
  }


  public AudienceWarning stackTrace(List<String> stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

  public AudienceWarning addStackTraceItem(String stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * (NEVER IN PRODUCTION) A human-readable stacktrace produced by the implementation technology
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(NEVER IN PRODUCTION) A human-readable stacktrace produced by the implementation technology")

  public List<String> getStackTrace() {
    return stackTrace;
  }


  public void setStackTrace(List<String> stackTrace) {
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
    AudienceWarning audienceWarning = (AudienceWarning) o;
    return Objects.equals(this.traceId, audienceWarning.traceId) &&
        Objects.equals(this.type, audienceWarning.type) &&
        Objects.equals(this.code, audienceWarning.code) &&
        Objects.equals(this.instance, audienceWarning.instance) &&
        Objects.equals(this.title, audienceWarning.title) &&
        Objects.equals(this.detail, audienceWarning.detail) &&
        Objects.equals(this.source, audienceWarning.source) &&
        Objects.equals(this.stackTrace, audienceWarning.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceId, type, code, instance, title, detail, source, stackTrace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceWarning {\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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

