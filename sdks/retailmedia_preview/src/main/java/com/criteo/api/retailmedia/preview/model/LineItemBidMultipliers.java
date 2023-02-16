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
 * Data model representing bid multipliers on a line item
 */
@ApiModel(description = "Data model representing bid multipliers on a line item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LineItemBidMultipliers {
  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private Double search;

  public static final String SERIALIZED_NAME_HOMEPAGE = "homepage";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE)
  private Double homepage;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private Double categories;

  public static final String SERIALIZED_NAME_PRODUCT_DETAIL = "productDetail";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DETAIL)
  private Double productDetail;

  public static final String SERIALIZED_NAME_CONFIRMATION = "confirmation";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION)
  private Double confirmation;

  public static final String SERIALIZED_NAME_MERCHANDISING = "merchandising";
  @SerializedName(SERIALIZED_NAME_MERCHANDISING)
  private Double merchandising;

  public static final String SERIALIZED_NAME_DEALS = "deals";
  @SerializedName(SERIALIZED_NAME_DEALS)
  private Double deals;

  public static final String SERIALIZED_NAME_CHECKOUT = "checkout";
  @SerializedName(SERIALIZED_NAME_CHECKOUT)
  private Double checkout;


  public LineItemBidMultipliers search(Double search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSearch() {
    return search;
  }


  public void setSearch(Double search) {
    this.search = search;
  }


  public LineItemBidMultipliers homepage(Double homepage) {
    
    this.homepage = homepage;
    return this;
  }

   /**
   * Get homepage
   * @return homepage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getHomepage() {
    return homepage;
  }


  public void setHomepage(Double homepage) {
    this.homepage = homepage;
  }


  public LineItemBidMultipliers categories(Double categories) {
    
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCategories() {
    return categories;
  }


  public void setCategories(Double categories) {
    this.categories = categories;
  }


  public LineItemBidMultipliers productDetail(Double productDetail) {
    
    this.productDetail = productDetail;
    return this;
  }

   /**
   * Get productDetail
   * @return productDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProductDetail() {
    return productDetail;
  }


  public void setProductDetail(Double productDetail) {
    this.productDetail = productDetail;
  }


  public LineItemBidMultipliers confirmation(Double confirmation) {
    
    this.confirmation = confirmation;
    return this;
  }

   /**
   * Get confirmation
   * @return confirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getConfirmation() {
    return confirmation;
  }


  public void setConfirmation(Double confirmation) {
    this.confirmation = confirmation;
  }


  public LineItemBidMultipliers merchandising(Double merchandising) {
    
    this.merchandising = merchandising;
    return this;
  }

   /**
   * Get merchandising
   * @return merchandising
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMerchandising() {
    return merchandising;
  }


  public void setMerchandising(Double merchandising) {
    this.merchandising = merchandising;
  }


  public LineItemBidMultipliers deals(Double deals) {
    
    this.deals = deals;
    return this;
  }

   /**
   * Get deals
   * @return deals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDeals() {
    return deals;
  }


  public void setDeals(Double deals) {
    this.deals = deals;
  }


  public LineItemBidMultipliers checkout(Double checkout) {
    
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCheckout() {
    return checkout;
  }


  public void setCheckout(Double checkout) {
    this.checkout = checkout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemBidMultipliers lineItemBidMultipliers = (LineItemBidMultipliers) o;
    return Objects.equals(this.search, lineItemBidMultipliers.search) &&
        Objects.equals(this.homepage, lineItemBidMultipliers.homepage) &&
        Objects.equals(this.categories, lineItemBidMultipliers.categories) &&
        Objects.equals(this.productDetail, lineItemBidMultipliers.productDetail) &&
        Objects.equals(this.confirmation, lineItemBidMultipliers.confirmation) &&
        Objects.equals(this.merchandising, lineItemBidMultipliers.merchandising) &&
        Objects.equals(this.deals, lineItemBidMultipliers.deals) &&
        Objects.equals(this.checkout, lineItemBidMultipliers.checkout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, homepage, categories, productDetail, confirmation, merchandising, deals, checkout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemBidMultipliers {\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    productDetail: ").append(toIndentedString(productDetail)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    merchandising: ").append(toIndentedString(merchandising)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
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

