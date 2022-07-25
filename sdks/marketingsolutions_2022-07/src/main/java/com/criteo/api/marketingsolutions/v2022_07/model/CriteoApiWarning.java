/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_07.model;

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
 * Criteo API response warning
 */
@ApiModel(description = "Criteo API response warning")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CriteoApiWarning {
  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  /**
   * A machine-readable code specifying error category
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACCESS_CONTROL("access_control"),
    
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

  /**
   * A machine-readable error code string in kabab-case. Unique across Criteo
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INTERNAL_ERROR("internal-error"),
    
    DEPRECATED_FIELD("deprecated-field"),
    
    ENDPOINT_DEPRECATED("endpoint-deprecated"),
    
    REQUIRED_FIELD("required-field"),
    
    INVALID_DATE_FORMAT("invalid-date-format"),
    
    INVALID("invalid"),
    
    INVALID_RANGED("invalid-ranged"),
    
    INVALID_TIMESPAN("invalid-timespan");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;


  public CriteoApiWarning traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * The correlation ID provided by the gateway
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The correlation ID provided by the gateway")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public CriteoApiWarning type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * A machine-readable code specifying error category
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "access_control", value = "A machine-readable code specifying error category")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CriteoApiWarning code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * A machine-readable error code string in kabab-case. Unique across Criteo
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "internal-error", value = "A machine-readable error code string in kabab-case. Unique across Criteo")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public CriteoApiWarning instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A URI reference that identifies the specific occurrence of the problem
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI reference that identifies the specific occurrence of the problem")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public CriteoApiWarning title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable remarks of the problem type.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short, human-readable remarks of the problem type.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CriteoApiWarning detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable explanation specific to this occurrence of the problem.")

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
    CriteoApiWarning criteoApiWarning = (CriteoApiWarning) o;
    return Objects.equals(this.traceId, criteoApiWarning.traceId) &&
        Objects.equals(this.type, criteoApiWarning.type) &&
        Objects.equals(this.code, criteoApiWarning.code) &&
        Objects.equals(this.instance, criteoApiWarning.instance) &&
        Objects.equals(this.title, criteoApiWarning.title) &&
        Objects.equals(this.detail, criteoApiWarning.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceId, type, code, instance, title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriteoApiWarning {\n");
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

