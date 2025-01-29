/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_07.model;

import java.util.Objects;
import java.util.Arrays;
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

import com.criteo.api.retailmedia.v2024_07.JSON;

/**
 * Change details of a property of the balance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChangeDetailsV1 {
  public static final String SERIALIZED_NAME_PREVIOUS_VALUE = "previousValue";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_VALUE)
  private String previousValue;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "currentValue";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private String currentValue;

  public static final String SERIALIZED_NAME_CHANGE_VALUE = "changeValue";
  @SerializedName(SERIALIZED_NAME_CHANGE_VALUE)
  private String changeValue;

  public ChangeDetailsV1() {
  }

  public ChangeDetailsV1 previousValue(String previousValue) {
    
    this.previousValue = previousValue;
    return this;
  }

   /**
   * Previous value of a property of the insertion order.
   * @return previousValue
  **/
  @javax.annotation.Nullable

  public String getPreviousValue() {
    return previousValue;
  }


  public void setPreviousValue(String previousValue) {
    this.previousValue = previousValue;
  }


  public ChangeDetailsV1 currentValue(String currentValue) {
    
    this.currentValue = currentValue;
    return this;
  }

   /**
   * Current value of a property of the insertion order.
   * @return currentValue
  **/
  @javax.annotation.Nullable

  public String getCurrentValue() {
    return currentValue;
  }


  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }


  public ChangeDetailsV1 changeValue(String changeValue) {
    
    this.changeValue = changeValue;
    return this;
  }

   /**
   * Change detail of a property of the insertion order.
   * @return changeValue
  **/
  @javax.annotation.Nullable

  public String getChangeValue() {
    return changeValue;
  }


  public void setChangeValue(String changeValue) {
    this.changeValue = changeValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDetailsV1 changeDetailsV1 = (ChangeDetailsV1) o;
    return Objects.equals(this.previousValue, changeDetailsV1.previousValue) &&
        Objects.equals(this.currentValue, changeDetailsV1.currentValue) &&
        Objects.equals(this.changeValue, changeDetailsV1.changeValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousValue, currentValue, changeValue);
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
    sb.append("class ChangeDetailsV1 {\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    changeValue: ").append(toIndentedString(changeValue)).append("\n");
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
    openapiFields.add("previousValue");
    openapiFields.add("currentValue");
    openapiFields.add("changeValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeDetailsV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeDetailsV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeDetailsV1 is not found in the empty JSON string", ChangeDetailsV1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChangeDetailsV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeDetailsV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("previousValue") != null && !jsonObj.get("previousValue").isJsonNull()) && !jsonObj.get("previousValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousValue").toString()));
      }
      if ((jsonObj.get("currentValue") != null && !jsonObj.get("currentValue").isJsonNull()) && !jsonObj.get("currentValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentValue").toString()));
      }
      if ((jsonObj.get("changeValue") != null && !jsonObj.get("changeValue").isJsonNull()) && !jsonObj.get("changeValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeDetailsV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeDetailsV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeDetailsV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeDetailsV1.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeDetailsV1>() {
           @Override
           public void write(JsonWriter out, ChangeDetailsV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeDetailsV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeDetailsV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeDetailsV1
  * @throws IOException if the JSON string is invalid with respect to ChangeDetailsV1
  */
  public static ChangeDetailsV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeDetailsV1.class);
  }

 /**
  * Convert an instance of ChangeDetailsV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

