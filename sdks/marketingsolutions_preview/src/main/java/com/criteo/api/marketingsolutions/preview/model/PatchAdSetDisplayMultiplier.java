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
 * Display Multiplier to update for a given combination of Ad Set and Category.
 */
@ApiModel(description = "Display Multiplier to update for a given combination of Ad Set and Category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchAdSetDisplayMultiplier {
  public static final String SERIALIZED_NAME_DISPLAY_MULTIPLIER = "displayMultiplier";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MULTIPLIER)
  private Double displayMultiplier;


  public PatchAdSetDisplayMultiplier displayMultiplier(Double displayMultiplier) {
    
    this.displayMultiplier = displayMultiplier;
    return this;
  }

   /**
   * Any positive decimal value. To remove the impact of the Display Multiplier set it to 1. At most 4 decimals are supported. Additional decimals are rounded.
   * @return displayMultiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any positive decimal value. To remove the impact of the Display Multiplier set it to 1. At most 4 decimals are supported. Additional decimals are rounded.")

  public Double getDisplayMultiplier() {
    return displayMultiplier;
  }


  public void setDisplayMultiplier(Double displayMultiplier) {
    this.displayMultiplier = displayMultiplier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchAdSetDisplayMultiplier patchAdSetDisplayMultiplier = (PatchAdSetDisplayMultiplier) o;
    return Objects.equals(this.displayMultiplier, patchAdSetDisplayMultiplier.displayMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayMultiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAdSetDisplayMultiplier {\n");
    sb.append("    displayMultiplier: ").append(toIndentedString(displayMultiplier)).append("\n");
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

