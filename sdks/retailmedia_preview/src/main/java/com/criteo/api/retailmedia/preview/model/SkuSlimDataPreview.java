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
 * Slim  version of Sku Data model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SkuSlimDataPreview {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_GLOBAL_CATEGORY_ID = "globalCategoryId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_CATEGORY_ID)
  private String globalCategoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_GLOBAL_BRAND_ID = "globalBrandId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_BRAND_ID)
  private String globalBrandId;

  public static final String SERIALIZED_NAME_GLOBAL_BRAND_NAME = "globalBrandName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_BRAND_NAME)
  private String globalBrandName;

  public static final String SERIALIZED_NAME_RETAILER_BRAND_ID = "retailerBrandId";
  @SerializedName(SERIALIZED_NAME_RETAILER_BRAND_ID)
  private String retailerBrandId;

  public static final String SERIALIZED_NAME_RETAILER_BRAND_NAME = "retailerBrandName";
  @SerializedName(SERIALIZED_NAME_RETAILER_BRAND_NAME)
  private String retailerBrandName;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_IS_IN_STOCK = "isInStock";
  @SerializedName(SERIALIZED_NAME_IS_IN_STOCK)
  private Boolean isInStock;

  public static final String SERIALIZED_NAME_GTIN = "gtin";
  @SerializedName(SERIALIZED_NAME_GTIN)
  private String gtin;

  public static final String SERIALIZED_NAME_MPN = "mpn";
  @SerializedName(SERIALIZED_NAME_MPN)
  private String mpn;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public SkuSlimDataPreview() {
  }

  public SkuSlimDataPreview name(String name) {
    
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


  public SkuSlimDataPreview categoryId(String categoryId) {
    
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


  public SkuSlimDataPreview globalCategoryId(String globalCategoryId) {
    
    this.globalCategoryId = globalCategoryId;
    return this;
  }

   /**
   * The global category Id.
   * @return globalCategoryId
  **/
  @javax.annotation.Nullable

  public String getGlobalCategoryId() {
    return globalCategoryId;
  }


  public void setGlobalCategoryId(String globalCategoryId) {
    this.globalCategoryId = globalCategoryId;
  }


  public SkuSlimDataPreview category(String category) {
    
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


  public SkuSlimDataPreview globalBrandId(String globalBrandId) {
    
    this.globalBrandId = globalBrandId;
    return this;
  }

   /**
   * The global brand id associated to the product.
   * @return globalBrandId
  **/
  @javax.annotation.Nonnull

  public String getGlobalBrandId() {
    return globalBrandId;
  }


  public void setGlobalBrandId(String globalBrandId) {
    this.globalBrandId = globalBrandId;
  }


  public SkuSlimDataPreview globalBrandName(String globalBrandName) {
    
    this.globalBrandName = globalBrandName;
    return this;
  }

   /**
   * The name of the global brand.
   * @return globalBrandName
  **/
  @javax.annotation.Nonnull

  public String getGlobalBrandName() {
    return globalBrandName;
  }


  public void setGlobalBrandName(String globalBrandName) {
    this.globalBrandName = globalBrandName;
  }


  public SkuSlimDataPreview retailerBrandId(String retailerBrandId) {
    
    this.retailerBrandId = retailerBrandId;
    return this;
  }

   /**
   * The retailer brand id associated to the product.
   * @return retailerBrandId
  **/
  @javax.annotation.Nullable

  public String getRetailerBrandId() {
    return retailerBrandId;
  }


  public void setRetailerBrandId(String retailerBrandId) {
    this.retailerBrandId = retailerBrandId;
  }


  public SkuSlimDataPreview retailerBrandName(String retailerBrandName) {
    
    this.retailerBrandName = retailerBrandName;
    return this;
  }

   /**
   * The name of the retailer brand.
   * @return retailerBrandName
  **/
  @javax.annotation.Nullable

  public String getRetailerBrandName() {
    return retailerBrandName;
  }


  public void setRetailerBrandName(String retailerBrandName) {
    this.retailerBrandName = retailerBrandName;
  }


  public SkuSlimDataPreview price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the product on the retailer site. Can be omitted in certain circumstances
   * @return price
  **/
  @javax.annotation.Nullable

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public SkuSlimDataPreview isInStock(Boolean isInStock) {
    
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


  public SkuSlimDataPreview gtin(String gtin) {
    
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


  public SkuSlimDataPreview mpn(String mpn) {
    
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


  public SkuSlimDataPreview imageUrl(String imageUrl) {
    
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


  public SkuSlimDataPreview updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the SkuSlimDataPreview instance itself
   */
  public SkuSlimDataPreview putAdditionalProperty(String key, Object value) {
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
    SkuSlimDataPreview skuSlimDataPreview = (SkuSlimDataPreview) o;
    return Objects.equals(this.name, skuSlimDataPreview.name) &&
        Objects.equals(this.categoryId, skuSlimDataPreview.categoryId) &&
        Objects.equals(this.globalCategoryId, skuSlimDataPreview.globalCategoryId) &&
        Objects.equals(this.category, skuSlimDataPreview.category) &&
        Objects.equals(this.globalBrandId, skuSlimDataPreview.globalBrandId) &&
        Objects.equals(this.globalBrandName, skuSlimDataPreview.globalBrandName) &&
        Objects.equals(this.retailerBrandId, skuSlimDataPreview.retailerBrandId) &&
        Objects.equals(this.retailerBrandName, skuSlimDataPreview.retailerBrandName) &&
        Objects.equals(this.price, skuSlimDataPreview.price) &&
        Objects.equals(this.isInStock, skuSlimDataPreview.isInStock) &&
        Objects.equals(this.gtin, skuSlimDataPreview.gtin) &&
        Objects.equals(this.mpn, skuSlimDataPreview.mpn) &&
        Objects.equals(this.imageUrl, skuSlimDataPreview.imageUrl) &&
        Objects.equals(this.updatedAt, skuSlimDataPreview.updatedAt)&&
        Objects.equals(this.additionalProperties, skuSlimDataPreview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categoryId, globalCategoryId, category, globalBrandId, globalBrandName, retailerBrandId, retailerBrandName, price, isInStock, gtin, mpn, imageUrl, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuSlimDataPreview {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    globalCategoryId: ").append(toIndentedString(globalCategoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    globalBrandId: ").append(toIndentedString(globalBrandId)).append("\n");
    sb.append("    globalBrandName: ").append(toIndentedString(globalBrandName)).append("\n");
    sb.append("    retailerBrandId: ").append(toIndentedString(retailerBrandId)).append("\n");
    sb.append("    retailerBrandName: ").append(toIndentedString(retailerBrandName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isInStock: ").append(toIndentedString(isInStock)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("categoryId");
    openapiFields.add("globalCategoryId");
    openapiFields.add("category");
    openapiFields.add("globalBrandId");
    openapiFields.add("globalBrandName");
    openapiFields.add("retailerBrandId");
    openapiFields.add("retailerBrandName");
    openapiFields.add("price");
    openapiFields.add("isInStock");
    openapiFields.add("gtin");
    openapiFields.add("mpn");
    openapiFields.add("imageUrl");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("categoryId");
    openapiRequiredFields.add("globalBrandId");
    openapiRequiredFields.add("globalBrandName");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("isInStock");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkuSlimDataPreview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkuSlimDataPreview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkuSlimDataPreview is not found in the empty JSON string", SkuSlimDataPreview.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkuSlimDataPreview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("categoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryId").toString()));
      }
      if ((jsonObj.get("globalCategoryId") != null && !jsonObj.get("globalCategoryId").isJsonNull()) && !jsonObj.get("globalCategoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalCategoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalCategoryId").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("globalBrandId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalBrandId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalBrandId").toString()));
      }
      if (!jsonObj.get("globalBrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalBrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalBrandName").toString()));
      }
      if ((jsonObj.get("retailerBrandId") != null && !jsonObj.get("retailerBrandId").isJsonNull()) && !jsonObj.get("retailerBrandId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerBrandId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerBrandId").toString()));
      }
      if ((jsonObj.get("retailerBrandName") != null && !jsonObj.get("retailerBrandName").isJsonNull()) && !jsonObj.get("retailerBrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerBrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerBrandName").toString()));
      }
      if ((jsonObj.get("gtin") != null && !jsonObj.get("gtin").isJsonNull()) && !jsonObj.get("gtin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gtin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gtin").toString()));
      }
      if ((jsonObj.get("mpn") != null && !jsonObj.get("mpn").isJsonNull()) && !jsonObj.get("mpn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mpn").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkuSlimDataPreview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkuSlimDataPreview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkuSlimDataPreview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkuSlimDataPreview.class));

       return (TypeAdapter<T>) new TypeAdapter<SkuSlimDataPreview>() {
           @Override
           public void write(JsonWriter out, SkuSlimDataPreview value) throws IOException {
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
           public SkuSlimDataPreview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkuSlimDataPreview instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkuSlimDataPreview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkuSlimDataPreview
  * @throws IOException if the JSON string is invalid with respect to SkuSlimDataPreview
  */
  public static SkuSlimDataPreview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkuSlimDataPreview.class);
  }

 /**
  * Convert an instance of SkuSlimDataPreview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

