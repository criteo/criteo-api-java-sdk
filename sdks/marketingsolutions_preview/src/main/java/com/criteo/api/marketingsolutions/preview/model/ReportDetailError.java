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
 * An error on a batch operation.
 */
@ApiModel(description = "An error on a batch operation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDetailError {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWNERROR("UnknownError"),
    
    INVALIDBIGIMAGEURL("InvalidBigImageUrl"),
    
    INVALIDPRODUCTID("InvalidProductId"),
    
    INVALIDPRODUCTURL("InvalidProductUrl"),
    
    INVALIDSMALLIMAGEURL("InvalidSmallImageUrl"),
    
    JSONPARSINGISSUE("JsonParsingIssue"),
    
    MISSINGID("MissingID"),
    
    MISSINGIMAGES("MissingImages"),
    
    MISSINGNAME("MissingName"),
    
    MISSINGURL("MissingURL"),
    
    NONASCIIID("NonAsciiId"),
    
    OVERLARGEBIGIMAGE("OverlargeBigImage"),
    
    OVERLARGEID("OverlargeID"),
    
    OVERLARGESMALLIMAGE("OverlargeSmallImage"),
    
    OVERLARGEURL("OverlargeURL"),
    
    CONFIGURATIONERROR("ConfigurationError");

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

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_IS_SERVER_RELATED = "isServerRelated";
  @SerializedName(SERIALIZED_NAME_IS_SERVER_RELATED)
  private Boolean isServerRelated;


  public ReportDetailError type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ReportDetailError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ReportDetailError isServerRelated(Boolean isServerRelated) {
    
    this.isServerRelated = isServerRelated;
    return this;
  }

   /**
   * Get isServerRelated
   * @return isServerRelated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsServerRelated() {
    return isServerRelated;
  }


  public void setIsServerRelated(Boolean isServerRelated) {
    this.isServerRelated = isServerRelated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDetailError reportDetailError = (ReportDetailError) o;
    return Objects.equals(this.type, reportDetailError.type) &&
        Objects.equals(this.message, reportDetailError.message) &&
        Objects.equals(this.isServerRelated, reportDetailError.isServerRelated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, isServerRelated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDetailError {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isServerRelated: ").append(toIndentedString(isServerRelated)).append("\n");
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

