/*
 * Criteo API
 * Criteo publicly exposed API
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
 * A single keyword and associated bid override
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaExternalv1SetBidModel {
  public static final String SERIALIZED_NAME_PHRASE = "phrase";
  @SerializedName(SERIALIZED_NAME_PHRASE)
  private String phrase;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid;

  public RetailMediaExternalv1SetBidModel() {
  }

  public RetailMediaExternalv1SetBidModel phrase(String phrase) {
    
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


  public RetailMediaExternalv1SetBidModel bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @javax.annotation.Nullable

  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
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
   * @return the RetailMediaExternalv1SetBidModel instance itself
   */
  public RetailMediaExternalv1SetBidModel putAdditionalProperty(String key, Object value) {
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
    RetailMediaExternalv1SetBidModel retailMediaExternalv1SetBidModel = (RetailMediaExternalv1SetBidModel) o;
    return Objects.equals(this.phrase, retailMediaExternalv1SetBidModel.phrase) &&
        Objects.equals(this.bid, retailMediaExternalv1SetBidModel.bid)&&
        Objects.equals(this.additionalProperties, retailMediaExternalv1SetBidModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phrase, bid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailMediaExternalv1SetBidModel {\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
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
    openapiFields.add("phrase");
    openapiFields.add("bid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaExternalv1SetBidModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaExternalv1SetBidModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaExternalv1SetBidModel is not found in the empty JSON string", RetailMediaExternalv1SetBidModel.openapiRequiredFields.toString()));
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
       if (!RetailMediaExternalv1SetBidModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaExternalv1SetBidModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaExternalv1SetBidModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaExternalv1SetBidModel.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaExternalv1SetBidModel>() {
           @Override
           public void write(JsonWriter out, RetailMediaExternalv1SetBidModel value) throws IOException {
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
           public RetailMediaExternalv1SetBidModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetailMediaExternalv1SetBidModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetailMediaExternalv1SetBidModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaExternalv1SetBidModel
  * @throws IOException if the JSON string is invalid with respect to RetailMediaExternalv1SetBidModel
  */
  public static RetailMediaExternalv1SetBidModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaExternalv1SetBidModel.class);
  }

 /**
  * Convert an instance of RetailMediaExternalv1SetBidModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

