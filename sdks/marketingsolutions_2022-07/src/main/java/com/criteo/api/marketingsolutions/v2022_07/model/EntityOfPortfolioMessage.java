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
import com.criteo.api.marketingsolutions.v2022_07.model.PortfolioMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generic Criteo API successful data model
 */
@ApiModel(description = "Generic Criteo API successful data model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityOfPortfolioMessage {
  /**
   * A string containing the entity type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CAMPAIGN("campaign"),
    
    ADSET("adset"),
    
    AD("ad"),
    
    ADVERTISER("advertiser"),
    
    AGENCY("agency"),
    
    PUBLISHER("publisher"),
    
    ADDRESS("address"),
    
    CLIENT("client"),
    
    CONTACT("contact"),
    
    INDUSTRY("industry");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private PortfolioMessage attributes;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;


  public EntityOfPortfolioMessage type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * A string containing the entity type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "campaign", value = "A string containing the entity type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public EntityOfPortfolioMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A opaque string containing the unique Id of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A opaque string containing the unique Id of the entity")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityOfPortfolioMessage attributes(PortfolioMessage attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PortfolioMessage getAttributes() {
    return attributes;
  }


  public void setAttributes(PortfolioMessage attributes) {
    this.attributes = attributes;
  }


  public EntityOfPortfolioMessage meta(Object meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * A meta object that contains application-specific metadata
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A meta object that contains application-specific metadata")

  public Object getMeta() {
    return meta;
  }


  public void setMeta(Object meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityOfPortfolioMessage entityOfPortfolioMessage = (EntityOfPortfolioMessage) o;
    return Objects.equals(this.type, entityOfPortfolioMessage.type) &&
        Objects.equals(this.id, entityOfPortfolioMessage.id) &&
        Objects.equals(this.attributes, entityOfPortfolioMessage.attributes) &&
        Objects.equals(this.meta, entityOfPortfolioMessage.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityOfPortfolioMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

