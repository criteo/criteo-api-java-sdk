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
 * Commerce segment brand entity
 */
@ApiModel(description = "Commerce segment brand entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceAudienceSegmentBrandEntityV1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;


  public CommerceAudienceSegmentBrandEntityV1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the commerce segment brand
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the commerce segment brand")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CommerceAudienceSegmentBrandEntityV1 size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the commerce segment brand
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the commerce segment brand")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceAudienceSegmentBrandEntityV1 commerceAudienceSegmentBrandEntityV1 = (CommerceAudienceSegmentBrandEntityV1) o;
    return Objects.equals(this.name, commerceAudienceSegmentBrandEntityV1.name) &&
        Objects.equals(this.size, commerceAudienceSegmentBrandEntityV1.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceAudienceSegmentBrandEntityV1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

