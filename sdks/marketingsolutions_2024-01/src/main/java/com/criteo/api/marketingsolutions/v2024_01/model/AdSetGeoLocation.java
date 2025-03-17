/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2024_01.model.NillableAdSetTargetingRule;
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

import com.criteo.api.marketingsolutions.v2024_01.JSON;

/**
 * ad set geolocation model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetGeoLocation {
  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private NillableAdSetTargetingRule countries;

  public static final String SERIALIZED_NAME_SUBDIVISIONS = "subdivisions";
  @SerializedName(SERIALIZED_NAME_SUBDIVISIONS)
  private NillableAdSetTargetingRule subdivisions;

  public static final String SERIALIZED_NAME_ZIP_CODES = "zipCodes";
  @SerializedName(SERIALIZED_NAME_ZIP_CODES)
  private NillableAdSetTargetingRule zipCodes;

  public AdSetGeoLocation() {
  }

  public AdSetGeoLocation countries(NillableAdSetTargetingRule countries) {
    
    this.countries = countries;
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @javax.annotation.Nullable

  public NillableAdSetTargetingRule getCountries() {
    return countries;
  }


  public void setCountries(NillableAdSetTargetingRule countries) {
    this.countries = countries;
  }


  public AdSetGeoLocation subdivisions(NillableAdSetTargetingRule subdivisions) {
    
    this.subdivisions = subdivisions;
    return this;
  }

   /**
   * Get subdivisions
   * @return subdivisions
  **/
  @javax.annotation.Nullable

  public NillableAdSetTargetingRule getSubdivisions() {
    return subdivisions;
  }


  public void setSubdivisions(NillableAdSetTargetingRule subdivisions) {
    this.subdivisions = subdivisions;
  }


  public AdSetGeoLocation zipCodes(NillableAdSetTargetingRule zipCodes) {
    
    this.zipCodes = zipCodes;
    return this;
  }

   /**
   * Get zipCodes
   * @return zipCodes
  **/
  @javax.annotation.Nullable

  public NillableAdSetTargetingRule getZipCodes() {
    return zipCodes;
  }


  public void setZipCodes(NillableAdSetTargetingRule zipCodes) {
    this.zipCodes = zipCodes;
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
   * @return the AdSetGeoLocation instance itself
   */
  public AdSetGeoLocation putAdditionalProperty(String key, Object value) {
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
    AdSetGeoLocation adSetGeoLocation = (AdSetGeoLocation) o;
    return Objects.equals(this.countries, adSetGeoLocation.countries) &&
        Objects.equals(this.subdivisions, adSetGeoLocation.subdivisions) &&
        Objects.equals(this.zipCodes, adSetGeoLocation.zipCodes)&&
        Objects.equals(this.additionalProperties, adSetGeoLocation.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, subdivisions, zipCodes, additionalProperties);
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
    sb.append("class AdSetGeoLocation {\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    subdivisions: ").append(toIndentedString(subdivisions)).append("\n");
    sb.append("    zipCodes: ").append(toIndentedString(zipCodes)).append("\n");
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
    openapiFields.add("countries");
    openapiFields.add("subdivisions");
    openapiFields.add("zipCodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdSetGeoLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdSetGeoLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdSetGeoLocation is not found in the empty JSON string", AdSetGeoLocation.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `countries`
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonNull()) {
        NillableAdSetTargetingRule.validateJsonObject(jsonObj.getAsJsonObject("countries"));
      }
      // validate the optional field `subdivisions`
      if (jsonObj.get("subdivisions") != null && !jsonObj.get("subdivisions").isJsonNull()) {
        NillableAdSetTargetingRule.validateJsonObject(jsonObj.getAsJsonObject("subdivisions"));
      }
      // validate the optional field `zipCodes`
      if (jsonObj.get("zipCodes") != null && !jsonObj.get("zipCodes").isJsonNull()) {
        NillableAdSetTargetingRule.validateJsonObject(jsonObj.getAsJsonObject("zipCodes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdSetGeoLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdSetGeoLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdSetGeoLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdSetGeoLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<AdSetGeoLocation>() {
           @Override
           public void write(JsonWriter out, AdSetGeoLocation value) throws IOException {
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
           public AdSetGeoLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdSetGeoLocation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdSetGeoLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdSetGeoLocation
  * @throws IOException if the JSON string is invalid with respect to AdSetGeoLocation
  */
  public static AdSetGeoLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdSetGeoLocation.class);
  }

 /**
  * Convert an instance of AdSetGeoLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

