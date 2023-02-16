/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2023-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2023_01.model.CreateRetailMediaAudienceV2Attributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request body of CreateRetailMediaAudienceV2Request
 */
@ApiModel(description = "Request body of CreateRetailMediaAudienceV2Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRetailMediaAudienceV2Data {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private CreateRetailMediaAudienceV2Attributes attributes;


  public CreateRetailMediaAudienceV2Data type(String type) {
    
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


  public CreateRetailMediaAudienceV2Data attributes(CreateRetailMediaAudienceV2Attributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateRetailMediaAudienceV2Attributes getAttributes() {
    return attributes;
  }


  public void setAttributes(CreateRetailMediaAudienceV2Attributes attributes) {
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
    CreateRetailMediaAudienceV2Data createRetailMediaAudienceV2Data = (CreateRetailMediaAudienceV2Data) o;
    return Objects.equals(this.type, createRetailMediaAudienceV2Data.type) &&
        Objects.equals(this.attributes, createRetailMediaAudienceV2Data.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRetailMediaAudienceV2Data {\n");
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
