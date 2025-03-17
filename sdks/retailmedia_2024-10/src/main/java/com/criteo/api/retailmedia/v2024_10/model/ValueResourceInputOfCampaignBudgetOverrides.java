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
import com.criteo.api.retailmedia.v2024_10.model.ValueResourceOfCampaignBudgetOverrides;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.retailmedia.v2024_10.JSON;

/**
 * A top-level object that encapsulates a Criteo API request for a single value.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValueResourceInputOfCampaignBudgetOverrides {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ValueResourceOfCampaignBudgetOverrides data;

  public ValueResourceInputOfCampaignBudgetOverrides() {
  }

  public ValueResourceInputOfCampaignBudgetOverrides data(ValueResourceOfCampaignBudgetOverrides data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public ValueResourceOfCampaignBudgetOverrides getData() {
    return data;
  }


  public void setData(ValueResourceOfCampaignBudgetOverrides data) {
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
    ValueResourceInputOfCampaignBudgetOverrides valueResourceInputOfCampaignBudgetOverrides = (ValueResourceInputOfCampaignBudgetOverrides) o;
    return Objects.equals(this.data, valueResourceInputOfCampaignBudgetOverrides.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
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
    sb.append("class ValueResourceInputOfCampaignBudgetOverrides {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ValueResourceInputOfCampaignBudgetOverrides
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValueResourceInputOfCampaignBudgetOverrides.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueResourceInputOfCampaignBudgetOverrides is not found in the empty JSON string", ValueResourceInputOfCampaignBudgetOverrides.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ValueResourceInputOfCampaignBudgetOverrides.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValueResourceInputOfCampaignBudgetOverrides` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ValueResourceOfCampaignBudgetOverrides.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueResourceInputOfCampaignBudgetOverrides.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueResourceInputOfCampaignBudgetOverrides' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueResourceInputOfCampaignBudgetOverrides> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueResourceInputOfCampaignBudgetOverrides.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueResourceInputOfCampaignBudgetOverrides>() {
           @Override
           public void write(JsonWriter out, ValueResourceInputOfCampaignBudgetOverrides value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValueResourceInputOfCampaignBudgetOverrides read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValueResourceInputOfCampaignBudgetOverrides given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValueResourceInputOfCampaignBudgetOverrides
  * @throws IOException if the JSON string is invalid with respect to ValueResourceInputOfCampaignBudgetOverrides
  */
  public static ValueResourceInputOfCampaignBudgetOverrides fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueResourceInputOfCampaignBudgetOverrides.class);
  }

 /**
  * Convert an instance of ValueResourceInputOfCampaignBudgetOverrides to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

