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
import com.criteo.api.retailmedia.preview.model.BalanceHistoryChangeDataCaptureV1;
import com.criteo.api.retailmedia.preview.model.Metadata;
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
 * A wrapper class to return a single page of items with metadata for offset and limit based paging.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageOfBalanceHistoryChangeDataCaptureV1 {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<BalanceHistoryChangeDataCaptureV1> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Metadata meta;

  public PageOfBalanceHistoryChangeDataCaptureV1() {
  }

  public PageOfBalanceHistoryChangeDataCaptureV1 data(List<BalanceHistoryChangeDataCaptureV1> data) {
    
    this.data = data;
    return this;
  }

  public PageOfBalanceHistoryChangeDataCaptureV1 addDataItem(BalanceHistoryChangeDataCaptureV1 dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull

  public List<BalanceHistoryChangeDataCaptureV1> getData() {
    return data;
  }


  public void setData(List<BalanceHistoryChangeDataCaptureV1> data) {
    this.data = data;
  }


  public PageOfBalanceHistoryChangeDataCaptureV1 meta(Metadata meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable

  public Metadata getMeta() {
    return meta;
  }


  public void setMeta(Metadata meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfBalanceHistoryChangeDataCaptureV1 pageOfBalanceHistoryChangeDataCaptureV1 = (PageOfBalanceHistoryChangeDataCaptureV1) o;
    return Objects.equals(this.data, pageOfBalanceHistoryChangeDataCaptureV1.data) &&
        Objects.equals(this.meta, pageOfBalanceHistoryChangeDataCaptureV1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfBalanceHistoryChangeDataCaptureV1 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageOfBalanceHistoryChangeDataCaptureV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageOfBalanceHistoryChangeDataCaptureV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageOfBalanceHistoryChangeDataCaptureV1 is not found in the empty JSON string", PageOfBalanceHistoryChangeDataCaptureV1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PageOfBalanceHistoryChangeDataCaptureV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageOfBalanceHistoryChangeDataCaptureV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PageOfBalanceHistoryChangeDataCaptureV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        BalanceHistoryChangeDataCaptureV1.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
      };
      // validate the required field `meta`
      Metadata.validateJsonObject(jsonObj.getAsJsonObject("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageOfBalanceHistoryChangeDataCaptureV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageOfBalanceHistoryChangeDataCaptureV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageOfBalanceHistoryChangeDataCaptureV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageOfBalanceHistoryChangeDataCaptureV1.class));

       return (TypeAdapter<T>) new TypeAdapter<PageOfBalanceHistoryChangeDataCaptureV1>() {
           @Override
           public void write(JsonWriter out, PageOfBalanceHistoryChangeDataCaptureV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageOfBalanceHistoryChangeDataCaptureV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageOfBalanceHistoryChangeDataCaptureV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageOfBalanceHistoryChangeDataCaptureV1
  * @throws IOException if the JSON string is invalid with respect to PageOfBalanceHistoryChangeDataCaptureV1
  */
  public static PageOfBalanceHistoryChangeDataCaptureV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageOfBalanceHistoryChangeDataCaptureV1.class);
  }

 /**
  * Convert an instance of PageOfBalanceHistoryChangeDataCaptureV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

