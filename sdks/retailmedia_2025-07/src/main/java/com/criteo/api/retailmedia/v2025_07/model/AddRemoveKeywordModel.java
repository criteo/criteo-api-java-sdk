/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2025-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2025_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2025_07.model.MatchTypeModel;
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

import com.criteo.api.retailmedia.v2025_07.JSON;

/**
 * A single keyword to be added or removed
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddRemoveKeywordModel {
  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private MatchTypeModel matchType;

  public static final String SERIALIZED_NAME_PHRASE = "phrase";
  @SerializedName(SERIALIZED_NAME_PHRASE)
  private String phrase;

  public AddRemoveKeywordModel() {
  }

  public AddRemoveKeywordModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public AddRemoveKeywordModel matchType(MatchTypeModel matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable

  public MatchTypeModel getMatchType() {
    return matchType;
  }


  public void setMatchType(MatchTypeModel matchType) {
    this.matchType = matchType;
  }


  public AddRemoveKeywordModel phrase(String phrase) {
    
    this.phrase = phrase;
    return this;
  }

   /**
   * Get phrase
   * @return phrase
  **/
  @javax.annotation.Nullable

  public String getPhrase() {
    return phrase;
  }


  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRemoveKeywordModel addRemoveKeywordModel = (AddRemoveKeywordModel) o;
    return Objects.equals(this.isDeleted, addRemoveKeywordModel.isDeleted) &&
        Objects.equals(this.matchType, addRemoveKeywordModel.matchType) &&
        Objects.equals(this.phrase, addRemoveKeywordModel.phrase);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDeleted, matchType, phrase);
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
    sb.append("class AddRemoveKeywordModel {\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
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
    openapiFields.add("isDeleted");
    openapiFields.add("matchType");
    openapiFields.add("phrase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddRemoveKeywordModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddRemoveKeywordModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddRemoveKeywordModel is not found in the empty JSON string", AddRemoveKeywordModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddRemoveKeywordModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddRemoveKeywordModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("phrase") != null && !jsonObj.get("phrase").isJsonNull()) && !jsonObj.get("phrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phrase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddRemoveKeywordModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddRemoveKeywordModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddRemoveKeywordModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddRemoveKeywordModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AddRemoveKeywordModel>() {
           @Override
           public void write(JsonWriter out, AddRemoveKeywordModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddRemoveKeywordModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddRemoveKeywordModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddRemoveKeywordModel
  * @throws IOException if the JSON string is invalid with respect to AddRemoveKeywordModel
  */
  public static AddRemoveKeywordModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddRemoveKeywordModel.class);
  }

 /**
  * Convert an instance of AddRemoveKeywordModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

