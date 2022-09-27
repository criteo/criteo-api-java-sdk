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
 * Category Bid to update for a given combination of Ad Set and Category.
 */
@ApiModel(description = "Category Bid to update for a given combination of Ad Set and Category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchAdSetCategoryBid {
  public static final String SERIALIZED_NAME_BID_AMOUNT = "bidAmount";
  @SerializedName(SERIALIZED_NAME_BID_AMOUNT)
  private Double bidAmount;


  public PatchAdSetCategoryBid bidAmount(Double bidAmount) {
    
    this.bidAmount = bidAmount;
    return this;
  }

   /**
   * positive decimal value match bid constraints. At most 4 decimals are supported. Additional decimals are rounded.
   * @return bidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "positive decimal value match bid constraints. At most 4 decimals are supported. Additional decimals are rounded.")

  public Double getBidAmount() {
    return bidAmount;
  }


  public void setBidAmount(Double bidAmount) {
    this.bidAmount = bidAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchAdSetCategoryBid patchAdSetCategoryBid = (PatchAdSetCategoryBid) o;
    return Objects.equals(this.bidAmount, patchAdSetCategoryBid.bidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAdSetCategoryBid {\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
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

