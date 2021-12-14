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
import com.criteo.api.retailmedia.v2020_10.model.ValueTypeResourceOfAddToBasketIdsUpdateModel202110;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data model for a value type input resource
 */
@ApiModel(description = "Data model for a value type input resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddToBasketIdsUpdateModel202110Request {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ValueTypeResourceOfAddToBasketIdsUpdateModel202110 data;


  public AddToBasketIdsUpdateModel202110Request data(ValueTypeResourceOfAddToBasketIdsUpdateModel202110 data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValueTypeResourceOfAddToBasketIdsUpdateModel202110 getData() {
    return data;
  }


  public void setData(ValueTypeResourceOfAddToBasketIdsUpdateModel202110 data) {
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
    AddToBasketIdsUpdateModel202110Request addToBasketIdsUpdateModel202110Request = (AddToBasketIdsUpdateModel202110Request) o;
    return Objects.equals(this.data, addToBasketIdsUpdateModel202110Request.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddToBasketIdsUpdateModel202110Request {\n");
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

