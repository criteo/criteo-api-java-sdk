/*
 * Criteo API Specification
 * This is used to help Criteo clients use our APIs
 *
 * The version of the OpenAPI document: 2021-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2020_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2020_10.model.NewAudienceAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Body for the creation of a new audience (name, advertiserId, etc)
 */
@ApiModel(description = "Body for the creation of a new audience (name, advertiserId, etc)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewAudience {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private NewAudienceAttributes attributes;


  public NewAudience type(String type) {
    
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


  public NewAudience attributes(NewAudienceAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NewAudienceAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(NewAudienceAttributes attributes) {
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
    NewAudience newAudience = (NewAudience) o;
    return Objects.equals(this.type, newAudience.type) &&
        Objects.equals(this.attributes, newAudience.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAudience {\n");
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

