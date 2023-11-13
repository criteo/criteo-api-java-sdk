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
import com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1SetBidModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * Data model containing keywords and bid overrides to associate to them
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaExternalv1SetBidsModel {
  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<RetailMediaExternalv1SetBidModel> keywords = null;

  public RetailMediaExternalv1SetBidsModel() {
  }

  public RetailMediaExternalv1SetBidsModel keywords(List<RetailMediaExternalv1SetBidModel> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public RetailMediaExternalv1SetBidsModel addKeywordsItem(RetailMediaExternalv1SetBidModel keywordsItem) {
    if (this.keywords == null) {
      this.keywords = null;
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable

  public List<RetailMediaExternalv1SetBidModel> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<RetailMediaExternalv1SetBidModel> keywords) {
    this.keywords = keywords;
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
   * @return the RetailMediaExternalv1SetBidsModel instance itself
   */
  public RetailMediaExternalv1SetBidsModel putAdditionalProperty(String key, Object value) {
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
    RetailMediaExternalv1SetBidsModel retailMediaExternalv1SetBidsModel = (RetailMediaExternalv1SetBidsModel) o;
    return Objects.equals(this.keywords, retailMediaExternalv1SetBidsModel.keywords)&&
        Objects.equals(this.additionalProperties, retailMediaExternalv1SetBidsModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, additionalProperties);
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
    sb.append("class RetailMediaExternalv1SetBidsModel {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
    openapiFields.add("keywords");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaExternalv1SetBidsModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaExternalv1SetBidsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaExternalv1SetBidsModel is not found in the empty JSON string", RetailMediaExternalv1SetBidsModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonNull()) {
        JsonArray jsonArraykeywords = jsonObj.getAsJsonArray("keywords");
        if (jsonArraykeywords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("keywords").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
          }

          // validate the optional field `keywords` (array)
          for (int i = 0; i < jsonArraykeywords.size(); i++) {
            RetailMediaExternalv1SetBidModel.validateJsonObject(jsonArraykeywords.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaExternalv1SetBidsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaExternalv1SetBidsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaExternalv1SetBidsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaExternalv1SetBidsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaExternalv1SetBidsModel>() {
           @Override
           public void write(JsonWriter out, RetailMediaExternalv1SetBidsModel value) throws IOException {
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
           public RetailMediaExternalv1SetBidsModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetailMediaExternalv1SetBidsModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetailMediaExternalv1SetBidsModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaExternalv1SetBidsModel
  * @throws IOException if the JSON string is invalid with respect to RetailMediaExternalv1SetBidsModel
  */
  public static RetailMediaExternalv1SetBidsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaExternalv1SetBidsModel.class);
  }

 /**
  * Convert an instance of RetailMediaExternalv1SetBidsModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

