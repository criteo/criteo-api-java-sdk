/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2021_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2021_10.model.AudienceAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Definition of an audience and all its information
 */
@ApiModel(description = "Definition of an audience and all its information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Audience {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private AudienceAttributes attributes;


  public Audience type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * the name of the entity type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Audience", required = true, value = "the name of the entity type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Audience id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * id of the Audience
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "314159", required = true, value = "id of the Audience")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Audience attributes(AudienceAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AudienceAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(AudienceAttributes attributes) {
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
    Audience audience = (Audience) o;
    return Objects.equals(this.type, audience.type) &&
        Objects.equals(this.id, audience.id) &&
        Objects.equals(this.attributes, audience.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audience {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

