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
 * Placeholder object for string value  for which \&quot;null\&quot; is a valid business value
 */
@ApiModel(description = "Placeholder object for string value  for which \"null\" is a valid business value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NillableString {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public NillableString value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The string&#39;s value. If missing or null the string&#39;s value is set to \&quot;null\&quot;
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string's value. If missing or null the string's value is set to \"null\"")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NillableString nillableString = (NillableString) o;
    return Objects.equals(this.value, nillableString.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NillableString {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

