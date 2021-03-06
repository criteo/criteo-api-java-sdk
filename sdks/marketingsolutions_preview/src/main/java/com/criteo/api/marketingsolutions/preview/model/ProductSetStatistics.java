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
import java.util.ArrayList;
import java.util.List;

/**
 * ProductSet statistics preview response
 */
@ApiModel(description = "ProductSet statistics preview response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSetStatistics {
  public static final String SERIALIZED_NAME_PRODUCT_COUNT = "productCount";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COUNT)
  private Long productCount;

  public static final String SERIALIZED_NAME_TOTAL_PRODUCT_COUNT = "totalProductCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRODUCT_COUNT)
  private Long totalProductCount;

  public static final String SERIALIZED_NAME_SAMPLE_PRODUCTS = "sampleProducts";
  @SerializedName(SERIALIZED_NAME_SAMPLE_PRODUCTS)
  private List<String> sampleProducts = new ArrayList<>();


  public ProductSetStatistics productCount(Long productCount) {
    
    this.productCount = productCount;
    return this;
  }

   /**
   * Number of products in the product set
   * @return productCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of products in the product set")

  public Long getProductCount() {
    return productCount;
  }


  public void setProductCount(Long productCount) {
    this.productCount = productCount;
  }


  public ProductSetStatistics totalProductCount(Long totalProductCount) {
    
    this.totalProductCount = totalProductCount;
    return this;
  }

   /**
   * Number of products in the partner&#39;s catalog
   * @return totalProductCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of products in the partner's catalog")

  public Long getTotalProductCount() {
    return totalProductCount;
  }


  public void setTotalProductCount(Long totalProductCount) {
    this.totalProductCount = totalProductCount;
  }


  public ProductSetStatistics sampleProducts(List<String> sampleProducts) {
    
    this.sampleProducts = sampleProducts;
    return this;
  }

  public ProductSetStatistics addSampleProductsItem(String sampleProductsItem) {
    this.sampleProducts.add(sampleProductsItem);
    return this;
  }

   /**
   * A sample of products (hashed external id) contained in the product set
   * @return sampleProducts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A sample of products (hashed external id) contained in the product set")

  public List<String> getSampleProducts() {
    return sampleProducts;
  }


  public void setSampleProducts(List<String> sampleProducts) {
    this.sampleProducts = sampleProducts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSetStatistics productSetStatistics = (ProductSetStatistics) o;
    return Objects.equals(this.productCount, productSetStatistics.productCount) &&
        Objects.equals(this.totalProductCount, productSetStatistics.totalProductCount) &&
        Objects.equals(this.sampleProducts, productSetStatistics.sampleProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCount, totalProductCount, sampleProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSetStatistics {\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    totalProductCount: ").append(toIndentedString(totalProductCount)).append("\n");
    sb.append("    sampleProducts: ").append(toIndentedString(sampleProducts)).append("\n");
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

