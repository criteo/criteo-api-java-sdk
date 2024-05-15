/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2024_04.model.AdSetDeliveryLimitations;
import com.criteo.api.marketingsolutions.v2024_04.model.AdSetFrequencyCapping;
import com.criteo.api.marketingsolutions.v2024_04.model.CreateAdSetGeoLocation;
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

import com.criteo.api.marketingsolutions.v2024_04.JSON;

/**
 * Targeting configuration of the ad set
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAdSetTargeting {
  public static final String SERIALIZED_NAME_DELIVERY_LIMITATIONS = "deliveryLimitations";
  @SerializedName(SERIALIZED_NAME_DELIVERY_LIMITATIONS)
  private AdSetDeliveryLimitations deliveryLimitations;

  public static final String SERIALIZED_NAME_GEO_LOCATION = "geoLocation";
  @SerializedName(SERIALIZED_NAME_GEO_LOCATION)
  private CreateAdSetGeoLocation geoLocation;

  public static final String SERIALIZED_NAME_FREQUENCY_CAPPING = "frequencyCapping";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_CAPPING)
  private AdSetFrequencyCapping frequencyCapping;

  public CreateAdSetTargeting() {
  }

  public CreateAdSetTargeting deliveryLimitations(AdSetDeliveryLimitations deliveryLimitations) {
    
    this.deliveryLimitations = deliveryLimitations;
    return this;
  }

   /**
   * Get deliveryLimitations
   * @return deliveryLimitations
  **/
  @javax.annotation.Nullable

  public AdSetDeliveryLimitations getDeliveryLimitations() {
    return deliveryLimitations;
  }


  public void setDeliveryLimitations(AdSetDeliveryLimitations deliveryLimitations) {
    this.deliveryLimitations = deliveryLimitations;
  }


  public CreateAdSetTargeting geoLocation(CreateAdSetGeoLocation geoLocation) {
    
    this.geoLocation = geoLocation;
    return this;
  }

   /**
   * Get geoLocation
   * @return geoLocation
  **/
  @javax.annotation.Nullable

  public CreateAdSetGeoLocation getGeoLocation() {
    return geoLocation;
  }


  public void setGeoLocation(CreateAdSetGeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  public CreateAdSetTargeting frequencyCapping(AdSetFrequencyCapping frequencyCapping) {
    
    this.frequencyCapping = frequencyCapping;
    return this;
  }

   /**
   * Get frequencyCapping
   * @return frequencyCapping
  **/
  @javax.annotation.Nonnull

  public AdSetFrequencyCapping getFrequencyCapping() {
    return frequencyCapping;
  }


  public void setFrequencyCapping(AdSetFrequencyCapping frequencyCapping) {
    this.frequencyCapping = frequencyCapping;
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
   * @return the CreateAdSetTargeting instance itself
   */
  public CreateAdSetTargeting putAdditionalProperty(String key, Object value) {
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
    CreateAdSetTargeting createAdSetTargeting = (CreateAdSetTargeting) o;
    return Objects.equals(this.deliveryLimitations, createAdSetTargeting.deliveryLimitations) &&
        Objects.equals(this.geoLocation, createAdSetTargeting.geoLocation) &&
        Objects.equals(this.frequencyCapping, createAdSetTargeting.frequencyCapping)&&
        Objects.equals(this.additionalProperties, createAdSetTargeting.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryLimitations, geoLocation, frequencyCapping, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdSetTargeting {\n");
    sb.append("    deliveryLimitations: ").append(toIndentedString(deliveryLimitations)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    frequencyCapping: ").append(toIndentedString(frequencyCapping)).append("\n");
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
    openapiFields.add("deliveryLimitations");
    openapiFields.add("geoLocation");
    openapiFields.add("frequencyCapping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("frequencyCapping");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAdSetTargeting
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAdSetTargeting.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAdSetTargeting is not found in the empty JSON string", CreateAdSetTargeting.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAdSetTargeting.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `deliveryLimitations`
      if (jsonObj.get("deliveryLimitations") != null && !jsonObj.get("deliveryLimitations").isJsonNull()) {
        AdSetDeliveryLimitations.validateJsonObject(jsonObj.getAsJsonObject("deliveryLimitations"));
      }
      // validate the optional field `geoLocation`
      if (jsonObj.get("geoLocation") != null && !jsonObj.get("geoLocation").isJsonNull()) {
        CreateAdSetGeoLocation.validateJsonObject(jsonObj.getAsJsonObject("geoLocation"));
      }
      // validate the required field `frequencyCapping`
      AdSetFrequencyCapping.validateJsonObject(jsonObj.getAsJsonObject("frequencyCapping"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAdSetTargeting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAdSetTargeting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAdSetTargeting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAdSetTargeting.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAdSetTargeting>() {
           @Override
           public void write(JsonWriter out, CreateAdSetTargeting value) throws IOException {
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
           public CreateAdSetTargeting read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateAdSetTargeting instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateAdSetTargeting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAdSetTargeting
  * @throws IOException if the JSON string is invalid with respect to CreateAdSetTargeting
  */
  public static CreateAdSetTargeting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAdSetTargeting.class);
  }

 /**
  * Convert an instance of CreateAdSetTargeting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

