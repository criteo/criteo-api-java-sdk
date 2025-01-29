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
 * Cpc Min Bids request object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CpcMinBidsRequest {
  public static final String SERIALIZED_NAME_SKU_IDS = "skuIds";
  @SerializedName(SERIALIZED_NAME_SKU_IDS)
  private List<String> skuIds = new ArrayList<>();

  public CpcMinBidsRequest() {
  }

  public CpcMinBidsRequest skuIds(List<String> skuIds) {
    
    this.skuIds = skuIds;
    return this;
  }

  public CpcMinBidsRequest addSkuIdsItem(String skuIdsItem) {
    this.skuIds.add(skuIdsItem);
    return this;
  }

   /**
   * Sku id list for which minimum bid amounts are requested.
   * @return skuIds
  **/
  @javax.annotation.Nonnull

  public List<String> getSkuIds() {
    return skuIds;
  }


  public void setSkuIds(List<String> skuIds) {
    this.skuIds = skuIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpcMinBidsRequest cpcMinBidsRequest = (CpcMinBidsRequest) o;
    return Objects.equals(this.skuIds, cpcMinBidsRequest.skuIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpcMinBidsRequest {\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
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
    openapiFields.add("skuIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("skuIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CpcMinBidsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CpcMinBidsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CpcMinBidsRequest is not found in the empty JSON string", CpcMinBidsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CpcMinBidsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CpcMinBidsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CpcMinBidsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("skuIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("skuIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuIds` to be an array in the JSON string but got `%s`", jsonObj.get("skuIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CpcMinBidsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CpcMinBidsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CpcMinBidsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CpcMinBidsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CpcMinBidsRequest>() {
           @Override
           public void write(JsonWriter out, CpcMinBidsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CpcMinBidsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CpcMinBidsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CpcMinBidsRequest
  * @throws IOException if the JSON string is invalid with respect to CpcMinBidsRequest
  */
  public static CpcMinBidsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CpcMinBidsRequest.class);
  }

 /**
  * Convert an instance of CpcMinBidsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

