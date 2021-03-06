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
import com.criteo.api.retailmedia.v2021_10.model.CreateRetailMediaAudienceAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Retail Media audience used in audience creation
 */
@ApiModel(description = "Retail Media audience used in audience creation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRetailMediaAudience {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private CreateRetailMediaAudienceAttributes attributes;


  public CreateRetailMediaAudience type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * the name of the entity type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RetailMediaAudience", required = true, value = "the name of the entity type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateRetailMediaAudience id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of this audience.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "314159", required = true, value = "Unique ID of this audience.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public CreateRetailMediaAudience attributes(CreateRetailMediaAudienceAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateRetailMediaAudienceAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(CreateRetailMediaAudienceAttributes attributes) {
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
    CreateRetailMediaAudience createRetailMediaAudience = (CreateRetailMediaAudience) o;
    return Objects.equals(this.type, createRetailMediaAudience.type) &&
        Objects.equals(this.id, createRetailMediaAudience.id) &&
        Objects.equals(this.attributes, createRetailMediaAudience.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRetailMediaAudience {\n");
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

