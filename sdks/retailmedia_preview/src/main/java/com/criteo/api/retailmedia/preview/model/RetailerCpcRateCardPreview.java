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


package com.criteo.api.retailmedia.preview.model;

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
 * Represents the Minimum CPC for a Retailer Id
 */
@ApiModel(description = "Represents the Minimum CPC for a Retailer Id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailerCpcRateCardPreview {
  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_MINIMUM_BID = "minimumBid";
  @SerializedName(SERIALIZED_NAME_MINIMUM_BID)
  private Double minimumBid;


  public RetailerCpcRateCardPreview retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Retailer Id
   * @return retailerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Retailer Id")

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public RetailerCpcRateCardPreview minimumBid(Double minimumBid) {
    
    this.minimumBid = minimumBid;
    return this;
  }

   /**
   * Minimum Bid
   * @return minimumBid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Minimum Bid")

  public Double getMinimumBid() {
    return minimumBid;
  }


  public void setMinimumBid(Double minimumBid) {
    this.minimumBid = minimumBid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailerCpcRateCardPreview retailerCpcRateCardPreview = (RetailerCpcRateCardPreview) o;
    return Objects.equals(this.retailerId, retailerCpcRateCardPreview.retailerId) &&
        Objects.equals(this.minimumBid, retailerCpcRateCardPreview.minimumBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, minimumBid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerCpcRateCardPreview {\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    minimumBid: ").append(toIndentedString(minimumBid)).append("\n");
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

