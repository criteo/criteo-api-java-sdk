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
import com.criteo.api.retailmedia.preview.model.RetailMediaAudienceAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * All the information about a retail media audience
 */
@ApiModel(description = "All the information about a retail media audience")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaAudience {
  /**
   * Type of the audience
   */
  @JsonAdapter(AudienceTypeEnum.Adapter.class)
  public enum AudienceTypeEnum {
    CUSTOMERLIST("customerList"),
    
    USERBEHAVIOR("userBehavior");

    private String value;

    AudienceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AudienceTypeEnum fromValue(String value) {
      for (AudienceTypeEnum b : AudienceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AudienceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AudienceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AudienceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AudienceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUDIENCE_TYPE = "audienceType";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_TYPE)
  private AudienceTypeEnum audienceType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private RetailMediaAudienceAttributes attributes;


  public RetailMediaAudience audienceType(AudienceTypeEnum audienceType) {
    
    this.audienceType = audienceType;
    return this;
  }

   /**
   * Type of the audience
   * @return audienceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "customerList", required = true, value = "Type of the audience")

  public AudienceTypeEnum getAudienceType() {
    return audienceType;
  }


  public void setAudienceType(AudienceTypeEnum audienceType) {
    this.audienceType = audienceType;
  }


  public RetailMediaAudience id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of this audience.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "314159", required = true, value = "Unique ID of this audience.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RetailMediaAudience type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Name of the entity i.e. RetailMediaAudienceSummary
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RetailMediaAudienceSummary", required = true, value = "Name of the entity i.e. RetailMediaAudienceSummary")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public RetailMediaAudience attributes(RetailMediaAudienceAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RetailMediaAudienceAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(RetailMediaAudienceAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaAudience retailMediaAudience = (RetailMediaAudience) o;
    return Objects.equals(this.audienceType, retailMediaAudience.audienceType) &&
        Objects.equals(this.id, retailMediaAudience.id) &&
        Objects.equals(this.type, retailMediaAudience.type) &&
        Objects.equals(this.attributes, retailMediaAudience.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceType, id, type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailMediaAudience {\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

