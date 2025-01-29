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

import com.criteo.api.retailmedia.v2024_07.JSON;

/**
 * A value of a template file variable (one or several files), like images in a creative
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilesVariableValue {
  public static final String SERIALIZED_NAME_ASSET_IDS = "assetIds";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<String> assetIds = new ArrayList<>();

  public FilesVariableValue() {
  }

  public FilesVariableValue assetIds(List<String> assetIds) {
    
    this.assetIds = assetIds;
    return this;
  }

  public FilesVariableValue addAssetIdsItem(String assetIdsItem) {
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * The assets representing the images to be displayed
   * @return assetIds
  **/
  @javax.annotation.Nonnull

  public List<String> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesVariableValue filesVariableValue = (FilesVariableValue) o;
    return Objects.equals(this.assetIds, filesVariableValue.assetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesVariableValue {\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
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
    openapiFields.add("assetIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assetIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilesVariableValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilesVariableValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilesVariableValue is not found in the empty JSON string", FilesVariableValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FilesVariableValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilesVariableValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilesVariableValue.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("assetIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("assetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetIds` to be an array in the JSON string but got `%s`", jsonObj.get("assetIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilesVariableValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilesVariableValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilesVariableValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilesVariableValue.class));

       return (TypeAdapter<T>) new TypeAdapter<FilesVariableValue>() {
           @Override
           public void write(JsonWriter out, FilesVariableValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilesVariableValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilesVariableValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilesVariableValue
  * @throws IOException if the JSON string is invalid with respect to FilesVariableValue
  */
  public static FilesVariableValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilesVariableValue.class);
  }

 /**
  * Convert an instance of FilesVariableValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

