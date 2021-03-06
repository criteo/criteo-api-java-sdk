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
import com.criteo.api.marketingsolutions.preview.model.EntityFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents either an allowlisting or a blocklisting rule
 */
@ApiModel(description = "Represents either an allowlisting or a blocklisting rule")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetingEntity {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Set<EntityFilter> data = null;


  public TargetingEntity type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Can be either domain or bundle
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can be either domain or bundle")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TargetingEntity mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Can be either blocklist or allowlist
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can be either blocklist or allowlist")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public TargetingEntity data(Set<EntityFilter> data) {
    
    this.data = data;
    return this;
  }

  public TargetingEntity addDataItem(EntityFilter dataItem) {
    if (this.data == null) {
      this.data = new LinkedHashSet<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<EntityFilter> getData() {
    return data;
  }


  public void setData(Set<EntityFilter> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingEntity targetingEntity = (TargetingEntity) o;
    return Objects.equals(this.type, targetingEntity.type) &&
        Objects.equals(this.mode, targetingEntity.mode) &&
        Objects.equals(this.data, targetingEntity.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mode, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingEntity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

