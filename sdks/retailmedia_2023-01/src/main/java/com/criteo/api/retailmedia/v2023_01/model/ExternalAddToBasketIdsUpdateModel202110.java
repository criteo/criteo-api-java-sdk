/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.criteo.api.retailmedia.v2023_01.JSON;

/**
 * Update model for updating add to basket target ids
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAddToBasketIdsUpdateModel202110 {
  public static final String SERIALIZED_NAME_PRODUCT_IDS = "productIds";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<String> productIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds = null;

  public ExternalAddToBasketIdsUpdateModel202110() {
  }

  public ExternalAddToBasketIdsUpdateModel202110 productIds(List<String> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public ExternalAddToBasketIdsUpdateModel202110 addProductIdsItem(String productIdsItem) {
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

  public List<String> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  public ExternalAddToBasketIdsUpdateModel202110 categoryIds(List<String> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public ExternalAddToBasketIdsUpdateModel202110 addCategoryIdsItem(String categoryIdsItem) {
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

  public List<String> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
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
   * @return the ExternalAddToBasketIdsUpdateModel202110 instance itself
   */
  public ExternalAddToBasketIdsUpdateModel202110 putAdditionalProperty(String key, Object value) {
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
    ExternalAddToBasketIdsUpdateModel202110 externalAddToBasketIdsUpdateModel202110 = (ExternalAddToBasketIdsUpdateModel202110) o;
    return Objects.equals(this.productIds, externalAddToBasketIdsUpdateModel202110.productIds) &&
        Objects.equals(this.categoryIds, externalAddToBasketIdsUpdateModel202110.categoryIds)&&
        Objects.equals(this.additionalProperties, externalAddToBasketIdsUpdateModel202110.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds, categoryIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAddToBasketIdsUpdateModel202110 {\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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
    openapiFields.add("productIds");
    openapiFields.add("categoryIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalAddToBasketIdsUpdateModel202110
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalAddToBasketIdsUpdateModel202110.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalAddToBasketIdsUpdateModel202110 is not found in the empty JSON string", ExternalAddToBasketIdsUpdateModel202110.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("productIds") != null && !jsonObj.get("productIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productIds` to be an array in the JSON string but got `%s`", jsonObj.get("productIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categoryIds") != null && !jsonObj.get("categoryIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryIds` to be an array in the JSON string but got `%s`", jsonObj.get("categoryIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalAddToBasketIdsUpdateModel202110.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalAddToBasketIdsUpdateModel202110' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalAddToBasketIdsUpdateModel202110> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalAddToBasketIdsUpdateModel202110.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalAddToBasketIdsUpdateModel202110>() {
           @Override
           public void write(JsonWriter out, ExternalAddToBasketIdsUpdateModel202110 value) throws IOException {
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
           public ExternalAddToBasketIdsUpdateModel202110 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalAddToBasketIdsUpdateModel202110 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalAddToBasketIdsUpdateModel202110 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalAddToBasketIdsUpdateModel202110
  * @throws IOException if the JSON string is invalid with respect to ExternalAddToBasketIdsUpdateModel202110
  */
  public static ExternalAddToBasketIdsUpdateModel202110 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalAddToBasketIdsUpdateModel202110.class);
  }

 /**
  * Convert an instance of ExternalAddToBasketIdsUpdateModel202110 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

