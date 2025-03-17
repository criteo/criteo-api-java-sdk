/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_10.model.ValueResourceOfRetailMediaSellerAccountCreation;
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

import com.criteo.api.retailmedia.v2024_10.JSON;

/**
 * A top-level object that encapsulates a Criteo API request for a single value objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValueResourceInputOfRetailMediaSellerAccountCreation {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ValueResourceOfRetailMediaSellerAccountCreation data;

  public ValueResourceInputOfRetailMediaSellerAccountCreation() {
  }

  public ValueResourceInputOfRetailMediaSellerAccountCreation data(ValueResourceOfRetailMediaSellerAccountCreation data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public ValueResourceOfRetailMediaSellerAccountCreation getData() {
    return data;
  }


  public void setData(ValueResourceOfRetailMediaSellerAccountCreation data) {
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
    ValueResourceInputOfRetailMediaSellerAccountCreation valueResourceInputOfRetailMediaSellerAccountCreation = (ValueResourceInputOfRetailMediaSellerAccountCreation) o;
    return Objects.equals(this.data, valueResourceInputOfRetailMediaSellerAccountCreation.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueResourceInputOfRetailMediaSellerAccountCreation {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ValueResourceInputOfRetailMediaSellerAccountCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValueResourceInputOfRetailMediaSellerAccountCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueResourceInputOfRetailMediaSellerAccountCreation is not found in the empty JSON string", ValueResourceInputOfRetailMediaSellerAccountCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ValueResourceInputOfRetailMediaSellerAccountCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValueResourceInputOfRetailMediaSellerAccountCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ValueResourceOfRetailMediaSellerAccountCreation.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueResourceInputOfRetailMediaSellerAccountCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueResourceInputOfRetailMediaSellerAccountCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueResourceInputOfRetailMediaSellerAccountCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueResourceInputOfRetailMediaSellerAccountCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueResourceInputOfRetailMediaSellerAccountCreation>() {
           @Override
           public void write(JsonWriter out, ValueResourceInputOfRetailMediaSellerAccountCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValueResourceInputOfRetailMediaSellerAccountCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValueResourceInputOfRetailMediaSellerAccountCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValueResourceInputOfRetailMediaSellerAccountCreation
  * @throws IOException if the JSON string is invalid with respect to ValueResourceInputOfRetailMediaSellerAccountCreation
  */
  public static ValueResourceInputOfRetailMediaSellerAccountCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueResourceInputOfRetailMediaSellerAccountCreation.class);
  }

 /**
  * Convert an instance of ValueResourceInputOfRetailMediaSellerAccountCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

