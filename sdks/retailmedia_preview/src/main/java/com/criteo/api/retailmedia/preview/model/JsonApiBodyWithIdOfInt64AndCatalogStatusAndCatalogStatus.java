/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.preview.model.ExternalCatalogStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A JSON:API wrapper class to format a &lt;typeparamref name&#x3D;\&quot;TAttributes\&quot; /&gt; with external Id, Type, and  Attributes properties
 */
@ApiModel(description = "A JSON:API wrapper class to format a <typeparamref name=\"TAttributes\" /> with external Id, Type, and  Attributes properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private ExternalCatalogStatus attributes;


  public JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus type(String type) {
    
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


  public JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus attributes(ExternalCatalogStatus attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalCatalogStatus getAttributes() {
    return attributes;
  }


  public void setAttributes(ExternalCatalogStatus attributes) {
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
    JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus jsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus = (JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus) o;
    return Objects.equals(this.id, jsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus.id) &&
        Objects.equals(this.type, jsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus.type) &&
        Objects.equals(this.attributes, jsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus {\n");
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

