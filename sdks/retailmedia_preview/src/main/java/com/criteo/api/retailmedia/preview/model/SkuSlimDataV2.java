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
import com.criteo.api.retailmedia.preview.model.Brand;
import com.criteo.api.retailmedia.preview.model.Category;
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
 * Slim  version of Sku Data model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SkuSlimDataV2 {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private Brand brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private Category category;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GTIN = "gtin";
  @SerializedName(SERIALIZED_NAME_GTIN)
  private String gtin;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_IS_IN_STOCK = "isInStock";
  @SerializedName(SERIALIZED_NAME_IS_IN_STOCK)
  private Boolean isInStock;

  public static final String SERIALIZED_NAME_MPN = "mpn";
  @SerializedName(SERIALIZED_NAME_MPN)
  private String mpn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public SkuSlimDataV2() {
  }

  public SkuSlimDataV2 brand(Brand brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable

  public Brand getBrand() {
    return brand;
  }


  public void setBrand(Brand brand) {
    this.brand = brand;
  }


  public SkuSlimDataV2 category(Category category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable

  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }


  public SkuSlimDataV2 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the product.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SkuSlimDataV2 gtin(String gtin) {
    
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


  public SkuSlimDataV2 imageUrl(String imageUrl) {
    
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


  public SkuSlimDataV2 isInStock(Boolean isInStock) {
    
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


  public SkuSlimDataV2 mpn(String mpn) {
    
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


  public SkuSlimDataV2 name(String name) {
    
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


  public SkuSlimDataV2 price(Double price) {
    
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


  public SkuSlimDataV2 updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the SkuSlimDataV2 instance itself
   */
  public SkuSlimDataV2 putAdditionalProperty(String key, Object value) {
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
    SkuSlimDataV2 skuSlimDataV2 = (SkuSlimDataV2) o;
    return Objects.equals(this.brand, skuSlimDataV2.brand) &&
        Objects.equals(this.category, skuSlimDataV2.category) &&
        Objects.equals(this.description, skuSlimDataV2.description) &&
        Objects.equals(this.gtin, skuSlimDataV2.gtin) &&
        Objects.equals(this.imageUrl, skuSlimDataV2.imageUrl) &&
        Objects.equals(this.isInStock, skuSlimDataV2.isInStock) &&
        Objects.equals(this.mpn, skuSlimDataV2.mpn) &&
        Objects.equals(this.name, skuSlimDataV2.name) &&
        Objects.equals(this.price, skuSlimDataV2.price) &&
        Objects.equals(this.updatedAt, skuSlimDataV2.updatedAt)&&
        Objects.equals(this.additionalProperties, skuSlimDataV2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, category, description, gtin, imageUrl, isInStock, mpn, name, price, updatedAt, additionalProperties);
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
    sb.append("class SkuSlimDataV2 {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isInStock: ").append(toIndentedString(isInStock)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("category");
    openapiFields.add("description");
    openapiFields.add("gtin");
    openapiFields.add("imageUrl");
    openapiFields.add("isInStock");
    openapiFields.add("mpn");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isInStock");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkuSlimDataV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkuSlimDataV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkuSlimDataV2 is not found in the empty JSON string", SkuSlimDataV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkuSlimDataV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `brand`
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) {
        Brand.validateJsonObject(jsonObj.getAsJsonObject("brand"));
      }
      // validate the optional field `category`
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        Category.validateJsonObject(jsonObj.getAsJsonObject("category"));
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
      if ((jsonObj.get("mpn") != null && !jsonObj.get("mpn").isJsonNull()) && !jsonObj.get("mpn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mpn").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkuSlimDataV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkuSlimDataV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkuSlimDataV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkuSlimDataV2.class));

       return (TypeAdapter<T>) new TypeAdapter<SkuSlimDataV2>() {
           @Override
           public void write(JsonWriter out, SkuSlimDataV2 value) throws IOException {
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
           public SkuSlimDataV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkuSlimDataV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkuSlimDataV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkuSlimDataV2
  * @throws IOException if the JSON string is invalid with respect to SkuSlimDataV2
  */
  public static SkuSlimDataV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkuSlimDataV2.class);
  }

 /**
  * Convert an instance of SkuSlimDataV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

