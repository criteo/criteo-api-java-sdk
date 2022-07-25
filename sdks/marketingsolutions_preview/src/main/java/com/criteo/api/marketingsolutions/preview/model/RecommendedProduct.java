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
 * Represents a recommended product.
 */
@ApiModel(description = "Represents a recommended product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendedProduct {
  public static final String SERIALIZED_NAME_PRODUCT_EXTERNAL_ID = "productExternalId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_EXTERNAL_ID)
  private String productExternalId;

  public static final String SERIALIZED_NAME_CLICK_URL = "clickUrl";
  @SerializedName(SERIALIZED_NAME_CLICK_URL)
  private String clickUrl;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_GOOGLE_CATEGORY = "googleCategory";
  @SerializedName(SERIALIZED_NAME_GOOGLE_CATEGORY)
  private String googleCategory;


  public RecommendedProduct productExternalId(String productExternalId) {
    
    this.productExternalId = productExternalId;
    return this;
  }

   /**
   * Product external id. Same id than what is used in user events.
   * @return productExternalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product external id. Same id than what is used in user events.")

  public String getProductExternalId() {
    return productExternalId;
  }


  public void setProductExternalId(String productExternalId) {
    this.productExternalId = productExternalId;
  }


  public RecommendedProduct clickUrl(String clickUrl) {
    
    this.clickUrl = clickUrl;
    return this;
  }

   /**
   * Url leading to product details page and also used to track user click.
   * @return clickUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url leading to product details page and also used to track user click.")

  public String getClickUrl() {
    return clickUrl;
  }


  public void setClickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
  }


  public RecommendedProduct imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Product image.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product image.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public RecommendedProduct name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Product name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RecommendedProduct description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Product description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RecommendedProduct price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Product price.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product price.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public RecommendedProduct googleCategory(String googleCategory) {
    
    this.googleCategory = googleCategory;
    return this;
  }

   /**
   * Product google category.
   * @return googleCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product google category.")

  public String getGoogleCategory() {
    return googleCategory;
  }


  public void setGoogleCategory(String googleCategory) {
    this.googleCategory = googleCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendedProduct recommendedProduct = (RecommendedProduct) o;
    return Objects.equals(this.productExternalId, recommendedProduct.productExternalId) &&
        Objects.equals(this.clickUrl, recommendedProduct.clickUrl) &&
        Objects.equals(this.imageUrl, recommendedProduct.imageUrl) &&
        Objects.equals(this.name, recommendedProduct.name) &&
        Objects.equals(this.description, recommendedProduct.description) &&
        Objects.equals(this.price, recommendedProduct.price) &&
        Objects.equals(this.googleCategory, recommendedProduct.googleCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productExternalId, clickUrl, imageUrl, name, description, price, googleCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendedProduct {\n");
    sb.append("    productExternalId: ").append(toIndentedString(productExternalId)).append("\n");
    sb.append("    clickUrl: ").append(toIndentedString(clickUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    googleCategory: ").append(toIndentedString(googleCategory)).append("\n");
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

