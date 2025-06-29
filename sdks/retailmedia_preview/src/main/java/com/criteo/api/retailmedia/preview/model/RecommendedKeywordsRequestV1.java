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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * Request model of RecommendedKeywords
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendedKeywordsRequestV1 {
  public static final String SERIALIZED_NAME_PRODUCT_IDS = "productIds";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<String> productIds = new ArrayList<>();

  public RecommendedKeywordsRequestV1() {
  }

  public RecommendedKeywordsRequestV1 productIds(List<String> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public RecommendedKeywordsRequestV1 addProductIdsItem(String productIdsItem) {
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * Product Id list that the recommended keywords generated on.
   * @return productIds
  **/
  @javax.annotation.Nonnull

  public List<String> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendedKeywordsRequestV1 recommendedKeywordsRequestV1 = (RecommendedKeywordsRequestV1) o;
    return Objects.equals(this.productIds, recommendedKeywordsRequestV1.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendedKeywordsRequestV1 {\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("productIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecommendedKeywordsRequestV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecommendedKeywordsRequestV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendedKeywordsRequestV1 is not found in the empty JSON string", RecommendedKeywordsRequestV1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecommendedKeywordsRequestV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecommendedKeywordsRequestV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecommendedKeywordsRequestV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("productIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("productIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productIds` to be an array in the JSON string but got `%s`", jsonObj.get("productIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendedKeywordsRequestV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendedKeywordsRequestV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendedKeywordsRequestV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendedKeywordsRequestV1.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendedKeywordsRequestV1>() {
           @Override
           public void write(JsonWriter out, RecommendedKeywordsRequestV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendedKeywordsRequestV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecommendedKeywordsRequestV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecommendedKeywordsRequestV1
  * @throws IOException if the JSON string is invalid with respect to RecommendedKeywordsRequestV1
  */
  public static RecommendedKeywordsRequestV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendedKeywordsRequestV1.class);
  }

 /**
  * Convert an instance of RecommendedKeywordsRequestV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

