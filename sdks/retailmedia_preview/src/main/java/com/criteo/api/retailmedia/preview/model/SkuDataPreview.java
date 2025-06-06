/*
 * Criteo API
 * Criteo API - RetailMedia
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
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.criteo.api.retailmedia.preview.JSON;

/**
 * Metadata and usage info of a sku search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SkuDataPreview {
  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GTIN = "gtin";
  @SerializedName(SERIALIZED_NAME_GTIN)
  private String gtin;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_IS_BUYBOX = "isBuybox";
  @SerializedName(SERIALIZED_NAME_IS_BUYBOX)
  private Boolean isBuybox;

  public static final String SERIALIZED_NAME_IS_IN_STOCK = "isInStock";
  @SerializedName(SERIALIZED_NAME_IS_IN_STOCK)
  private Boolean isInStock;

  public static final String SERIALIZED_NAME_IS_SELLER_SKU = "isSellerSku";
  @SerializedName(SERIALIZED_NAME_IS_SELLER_SKU)
  private Boolean isSellerSku;

  public static final String SERIALIZED_NAME_MODEL_NUMBER = "modelNumber";
  @SerializedName(SERIALIZED_NAME_MODEL_NUMBER)
  private String modelNumber;

  public static final String SERIALIZED_NAME_MPN = "mpn";
  @SerializedName(SERIALIZED_NAME_MPN)
  private String mpn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PRODUCT_PAGE = "productPage";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PAGE)
  private String productPage;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_RETAILER_NAME = "retailerName";
  @SerializedName(SERIALIZED_NAME_RETAILER_NAME)
  private String retailerName;

  public static final String SERIALIZED_NAME_SELLER_ID = "sellerId";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_SELLER_NAME = "sellerName";
  @SerializedName(SERIALIZED_NAME_SELLER_NAME)
  private String sellerName;

  public static final String SERIALIZED_NAME_SKU_KEY = "skuKey";
  @SerializedName(SERIALIZED_NAME_SKU_KEY)
  private String skuKey;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public SkuDataPreview() {
  }

  public SkuDataPreview brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * The global brand id associated to the product.
   * @return brandId
  **/
  @javax.annotation.Nonnull

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public SkuDataPreview brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * The name of the global brand.
   * @return brandName
  **/
  @javax.annotation.Nonnull

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public SkuDataPreview category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The full category breadcrumb in the retailers catalog.
   * @return category
  **/
  @javax.annotation.Nullable

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public SkuDataPreview categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The category Id.
   * @return categoryId
  **/
  @javax.annotation.Nonnull

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public SkuDataPreview description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A product description.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SkuDataPreview gtin(String gtin) {
    
    this.gtin = gtin;
    return this;
  }

   /**
   * A GTIN identifier for the product if available. Covers variations such as EANs and UPCs.
   * @return gtin
  **/
  @javax.annotation.Nullable

  public String getGtin() {
    return gtin;
  }


  public void setGtin(String gtin) {
    this.gtin = gtin;
  }


  public SkuDataPreview imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * An http image resource provided by the retailer.
   * @return imageUrl
  **/
  @javax.annotation.Nullable

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public SkuDataPreview isBuybox(Boolean isBuybox) {
    
    this.isBuybox = isBuybox;
    return this;
  }

   /**
   * Whether the Sku is a Buybox Winner.
   * @return isBuybox
  **/
  @javax.annotation.Nullable

  public Boolean getIsBuybox() {
    return isBuybox;
  }


  public void setIsBuybox(Boolean isBuybox) {
    this.isBuybox = isBuybox;
  }


  public SkuDataPreview isInStock(Boolean isInStock) {
    
    this.isInStock = isInStock;
    return this;
  }

   /**
   * An indication of if the retailer currently has the product in stock.
   * @return isInStock
  **/
  @javax.annotation.Nonnull

  public Boolean getIsInStock() {
    return isInStock;
  }


  public void setIsInStock(Boolean isInStock) {
    this.isInStock = isInStock;
  }


  public SkuDataPreview isSellerSku(Boolean isSellerSku) {
    
    this.isSellerSku = isSellerSku;
    return this;
  }

   /**
   * An indication of if the sku is seller sku.
   * @return isSellerSku
  **/
  @javax.annotation.Nullable

  public Boolean getIsSellerSku() {
    return isSellerSku;
  }


  public void setIsSellerSku(Boolean isSellerSku) {
    this.isSellerSku = isSellerSku;
  }


  public SkuDataPreview modelNumber(String modelNumber) {
    
    this.modelNumber = modelNumber;
    return this;
  }

   /**
   * The Model Number for the product if available.
   * @return modelNumber
  **/
  @javax.annotation.Nullable

  public String getModelNumber() {
    return modelNumber;
  }


  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }


  public SkuDataPreview mpn(String mpn) {
    
    this.mpn = mpn;
    return this;
  }

   /**
   * The MPN for the product if available.
   * @return mpn
  **/
  @javax.annotation.Nullable

  public String getMpn() {
    return mpn;
  }


  public void setMpn(String mpn) {
    this.mpn = mpn;
  }


  public SkuDataPreview name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A short product name.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SkuDataPreview parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * The ParentId for the product if available.
   * @return parentId
  **/
  @javax.annotation.Nullable

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public SkuDataPreview price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the product on the retailer site.
   * @return price
  **/
  @javax.annotation.Nonnull

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public SkuDataPreview productPage(String productPage) {
    
    this.productPage = productPage;
    return this;
  }

   /**
   * The product page URL
   * @return productPage
  **/
  @javax.annotation.Nullable

  public String getProductPage() {
    return productPage;
  }


  public void setProductPage(String productPage) {
    this.productPage = productPage;
  }


  public SkuDataPreview retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * The identifier for the retailer the product is listed by.
   * @return retailerId
  **/
  @javax.annotation.Nonnull

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public SkuDataPreview retailerName(String retailerName) {
    
    this.retailerName = retailerName;
    return this;
  }

   /**
   * The retailer name.
   * @return retailerName
  **/
  @javax.annotation.Nonnull

  public String getRetailerName() {
    return retailerName;
  }


  public void setRetailerName(String retailerName) {
    this.retailerName = retailerName;
  }


  public SkuDataPreview sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The id of the seller.
   * @return sellerId
  **/
  @javax.annotation.Nullable

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public SkuDataPreview sellerName(String sellerName) {
    
    this.sellerName = sellerName;
    return this;
  }

   /**
   * The name of the seller.
   * @return sellerName
  **/
  @javax.annotation.Nullable

  public String getSellerName() {
    return sellerName;
  }


  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }


  public SkuDataPreview skuKey(String skuKey) {
    
    this.skuKey = skuKey;
    return this;
  }

   /**
   * The product SKU Key.
   * @return skuKey
  **/
  @javax.annotation.Nonnull

  public String getSkuKey() {
    return skuKey;
  }


  public void setSkuKey(String skuKey) {
    this.skuKey = skuKey;
  }


  public SkuDataPreview updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The last time this product was updated in the Retail Media Catalog. Represented as a UTC ISO8601 string.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SkuDataPreview instance itself
   */
  public SkuDataPreview putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuDataPreview skuDataPreview = (SkuDataPreview) o;
    return Objects.equals(this.brandId, skuDataPreview.brandId) &&
        Objects.equals(this.brandName, skuDataPreview.brandName) &&
        Objects.equals(this.category, skuDataPreview.category) &&
        Objects.equals(this.categoryId, skuDataPreview.categoryId) &&
        Objects.equals(this.description, skuDataPreview.description) &&
        Objects.equals(this.gtin, skuDataPreview.gtin) &&
        Objects.equals(this.imageUrl, skuDataPreview.imageUrl) &&
        Objects.equals(this.isBuybox, skuDataPreview.isBuybox) &&
        Objects.equals(this.isInStock, skuDataPreview.isInStock) &&
        Objects.equals(this.isSellerSku, skuDataPreview.isSellerSku) &&
        Objects.equals(this.modelNumber, skuDataPreview.modelNumber) &&
        Objects.equals(this.mpn, skuDataPreview.mpn) &&
        Objects.equals(this.name, skuDataPreview.name) &&
        Objects.equals(this.parentId, skuDataPreview.parentId) &&
        Objects.equals(this.price, skuDataPreview.price) &&
        Objects.equals(this.productPage, skuDataPreview.productPage) &&
        Objects.equals(this.retailerId, skuDataPreview.retailerId) &&
        Objects.equals(this.retailerName, skuDataPreview.retailerName) &&
        Objects.equals(this.sellerId, skuDataPreview.sellerId) &&
        Objects.equals(this.sellerName, skuDataPreview.sellerName) &&
        Objects.equals(this.skuKey, skuDataPreview.skuKey) &&
        Objects.equals(this.updatedAt, skuDataPreview.updatedAt)&&
        Objects.equals(this.additionalProperties, skuDataPreview.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, category, categoryId, description, gtin, imageUrl, isBuybox, isInStock, isSellerSku, modelNumber, mpn, name, parentId, price, productPage, retailerId, retailerName, sellerId, sellerName, skuKey, updatedAt, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuDataPreview {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isBuybox: ").append(toIndentedString(isBuybox)).append("\n");
    sb.append("    isInStock: ").append(toIndentedString(isInStock)).append("\n");
    sb.append("    isSellerSku: ").append(toIndentedString(isSellerSku)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productPage: ").append(toIndentedString(productPage)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    retailerName: ").append(toIndentedString(retailerName)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
    sb.append("    skuKey: ").append(toIndentedString(skuKey)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("brandId");
    openapiFields.add("brandName");
    openapiFields.add("category");
    openapiFields.add("categoryId");
    openapiFields.add("description");
    openapiFields.add("gtin");
    openapiFields.add("imageUrl");
    openapiFields.add("isBuybox");
    openapiFields.add("isInStock");
    openapiFields.add("isSellerSku");
    openapiFields.add("modelNumber");
    openapiFields.add("mpn");
    openapiFields.add("name");
    openapiFields.add("parentId");
    openapiFields.add("price");
    openapiFields.add("productPage");
    openapiFields.add("retailerId");
    openapiFields.add("retailerName");
    openapiFields.add("sellerId");
    openapiFields.add("sellerName");
    openapiFields.add("skuKey");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brandId");
    openapiRequiredFields.add("brandName");
    openapiRequiredFields.add("categoryId");
    openapiRequiredFields.add("isInStock");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("retailerId");
    openapiRequiredFields.add("retailerName");
    openapiRequiredFields.add("skuKey");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkuDataPreview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkuDataPreview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkuDataPreview is not found in the empty JSON string", SkuDataPreview.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkuDataPreview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("brandId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandId").toString()));
      }
      if (!jsonObj.get("brandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandName").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("categoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("gtin") != null && !jsonObj.get("gtin").isJsonNull()) && !jsonObj.get("gtin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gtin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gtin").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("modelNumber") != null && !jsonObj.get("modelNumber").isJsonNull()) && !jsonObj.get("modelNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modelNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modelNumber").toString()));
      }
      if ((jsonObj.get("mpn") != null && !jsonObj.get("mpn").isJsonNull()) && !jsonObj.get("mpn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mpn").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if ((jsonObj.get("productPage") != null && !jsonObj.get("productPage").isJsonNull()) && !jsonObj.get("productPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productPage").toString()));
      }
      if (!jsonObj.get("retailerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerId").toString()));
      }
      if (!jsonObj.get("retailerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerName").toString()));
      }
      if ((jsonObj.get("sellerId") != null && !jsonObj.get("sellerId").isJsonNull()) && !jsonObj.get("sellerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerId").toString()));
      }
      if ((jsonObj.get("sellerName") != null && !jsonObj.get("sellerName").isJsonNull()) && !jsonObj.get("sellerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerName").toString()));
      }
      if (!jsonObj.get("skuKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skuKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkuDataPreview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkuDataPreview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkuDataPreview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkuDataPreview.class));

       return (TypeAdapter<T>) new TypeAdapter<SkuDataPreview>() {
           @Override
           public void write(JsonWriter out, SkuDataPreview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SkuDataPreview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkuDataPreview instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SkuDataPreview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkuDataPreview
  * @throws IOException if the JSON string is invalid with respect to SkuDataPreview
  */
  public static SkuDataPreview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkuDataPreview.class);
  }

 /**
  * Convert an instance of SkuDataPreview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

