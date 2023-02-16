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
import com.criteo.api.marketingsolutions.preview.model.AdSetAudienceLinkEntityV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A class that represents a domain entity exposed by an API
 */
@ApiModel(description = "A class that represents a domain entity exposed by an API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetAudienceLinkEntityV1Resource {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private AdSetAudienceLinkEntityV1 attributes;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public AdSetAudienceLinkEntityV1Resource attributes(AdSetAudienceLinkEntityV1 attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdSetAudienceLinkEntityV1 getAttributes() {
    return attributes;
  }


  public void setAttributes(AdSetAudienceLinkEntityV1 attributes) {
    this.attributes = attributes;
  }


  public AdSetAudienceLinkEntityV1Resource id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the entity")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AdSetAudienceLinkEntityV1Resource type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdSetAudienceLinkEntityV1Resource adSetAudienceLinkEntityV1Resource = (AdSetAudienceLinkEntityV1Resource) o;
    return Objects.equals(this.attributes, adSetAudienceLinkEntityV1Resource.attributes) &&
        Objects.equals(this.id, adSetAudienceLinkEntityV1Resource.id) &&
        Objects.equals(this.type, adSetAudienceLinkEntityV1Resource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetAudienceLinkEntityV1Resource {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

