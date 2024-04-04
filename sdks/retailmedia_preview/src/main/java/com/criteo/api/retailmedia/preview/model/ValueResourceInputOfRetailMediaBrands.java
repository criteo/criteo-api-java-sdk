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
import com.criteo.api.retailmedia.preview.model.ValueResourceOfRetailMediaBrands;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * A top-level object that encapsulates a Criteo API request for a single value.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValueResourceInputOfRetailMediaBrands {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ValueResourceOfRetailMediaBrands data;

  public ValueResourceInputOfRetailMediaBrands() {
  }

  public ValueResourceInputOfRetailMediaBrands data(ValueResourceOfRetailMediaBrands data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public ValueResourceOfRetailMediaBrands getData() {
    return data;
  }


  public void setData(ValueResourceOfRetailMediaBrands data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueResourceInputOfRetailMediaBrands valueResourceInputOfRetailMediaBrands = (ValueResourceInputOfRetailMediaBrands) o;
    return Objects.equals(this.data, valueResourceInputOfRetailMediaBrands.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueResourceInputOfRetailMediaBrands {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ValueResourceInputOfRetailMediaBrands
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValueResourceInputOfRetailMediaBrands.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueResourceInputOfRetailMediaBrands is not found in the empty JSON string", ValueResourceInputOfRetailMediaBrands.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ValueResourceInputOfRetailMediaBrands.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValueResourceInputOfRetailMediaBrands` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ValueResourceOfRetailMediaBrands.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueResourceInputOfRetailMediaBrands.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueResourceInputOfRetailMediaBrands' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueResourceInputOfRetailMediaBrands> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueResourceInputOfRetailMediaBrands.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueResourceInputOfRetailMediaBrands>() {
           @Override
           public void write(JsonWriter out, ValueResourceInputOfRetailMediaBrands value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValueResourceInputOfRetailMediaBrands read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValueResourceInputOfRetailMediaBrands given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValueResourceInputOfRetailMediaBrands
  * @throws IOException if the JSON string is invalid with respect to ValueResourceInputOfRetailMediaBrands
  */
  public static ValueResourceInputOfRetailMediaBrands fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueResourceInputOfRetailMediaBrands.class);
  }

 /**
  * Convert an instance of ValueResourceInputOfRetailMediaBrands to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

