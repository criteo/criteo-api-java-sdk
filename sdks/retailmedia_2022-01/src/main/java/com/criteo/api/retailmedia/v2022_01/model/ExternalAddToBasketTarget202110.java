/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_01.model;

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
 * Identifies add to basket targeting for a line item
 */
@ApiModel(description = "Identifies add to basket targeting for a line item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAddToBasketTarget202110 {
  /**
   * Scope of the add to basket target
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    UNKNOWN("unknown"),
    
    INCLUDE("include"),
    
    EXCLUDE("exclude");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "productIds";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<String> productIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds = null;


  public ExternalAddToBasketTarget202110 scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope of the add to basket target
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Scope of the add to basket target")

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public ExternalAddToBasketTarget202110 productIds(List<String> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public ExternalAddToBasketTarget202110 addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * Product ids that add to basket should target
   * @return productIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product ids that add to basket should target")

  public List<String> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  public ExternalAddToBasketTarget202110 categoryIds(List<String> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public ExternalAddToBasketTarget202110 addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Category ids that add to basket should target
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category ids that add to basket should target")

  public List<String> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAddToBasketTarget202110 externalAddToBasketTarget202110 = (ExternalAddToBasketTarget202110) o;
    return Objects.equals(this.scope, externalAddToBasketTarget202110.scope) &&
        Objects.equals(this.productIds, externalAddToBasketTarget202110.productIds) &&
        Objects.equals(this.categoryIds, externalAddToBasketTarget202110.categoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, productIds, categoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAddToBasketTarget202110 {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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

