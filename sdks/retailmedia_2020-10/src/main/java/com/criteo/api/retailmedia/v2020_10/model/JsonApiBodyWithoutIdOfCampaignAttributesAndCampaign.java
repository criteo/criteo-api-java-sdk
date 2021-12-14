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


package com.criteo.api.retailmedia.v2020_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2020_10.model.ExternalCampaignAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A JSON:API wrapper class to format a &lt;typeparamref name&#x3D;\&quot;TAttributes\&quot; /&gt; with Type, and  Attributes properties
 */
@ApiModel(description = "A JSON:API wrapper class to format a <typeparamref name=\"TAttributes\" /> with Type, and  Attributes properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private ExternalCampaignAttributes attributes;


  public JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign attributes(ExternalCampaignAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalCampaignAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(ExternalCampaignAttributes attributes) {
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
    JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign jsonApiBodyWithoutIdOfCampaignAttributesAndCampaign = (JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign) o;
    return Objects.equals(this.type, jsonApiBodyWithoutIdOfCampaignAttributesAndCampaign.type) &&
        Objects.equals(this.attributes, jsonApiBodyWithoutIdOfCampaignAttributesAndCampaign.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyWithoutIdOfCampaignAttributesAndCampaign {\n");
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

