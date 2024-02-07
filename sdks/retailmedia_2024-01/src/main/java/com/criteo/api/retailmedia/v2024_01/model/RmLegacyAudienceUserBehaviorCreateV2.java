/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_01.model.RmLegacySegmentUserBehaviorCreateV2;
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

import com.criteo.api.retailmedia.v2024_01.JSON;

/**
 * User Behavior to include and optionally exclude.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RmLegacyAudienceUserBehaviorCreateV2 {
  public static final String SERIALIZED_NAME_INCLUSIVE_SEGMENT = "inclusiveSegment";
  @SerializedName(SERIALIZED_NAME_INCLUSIVE_SEGMENT)
  private RmLegacySegmentUserBehaviorCreateV2 inclusiveSegment;

  public static final String SERIALIZED_NAME_EXCLUSIVE_SEGMENT = "exclusiveSegment";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_SEGMENT)
  private RmLegacySegmentUserBehaviorCreateV2 exclusiveSegment;

  public RmLegacyAudienceUserBehaviorCreateV2() {
  }

  public RmLegacyAudienceUserBehaviorCreateV2 inclusiveSegment(RmLegacySegmentUserBehaviorCreateV2 inclusiveSegment) {
    
    this.inclusiveSegment = inclusiveSegment;
    return this;
  }

   /**
   * Get inclusiveSegment
   * @return inclusiveSegment
  **/
  @javax.annotation.Nonnull

  public RmLegacySegmentUserBehaviorCreateV2 getInclusiveSegment() {
    return inclusiveSegment;
  }


  public void setInclusiveSegment(RmLegacySegmentUserBehaviorCreateV2 inclusiveSegment) {
    this.inclusiveSegment = inclusiveSegment;
  }


  public RmLegacyAudienceUserBehaviorCreateV2 exclusiveSegment(RmLegacySegmentUserBehaviorCreateV2 exclusiveSegment) {
    
    this.exclusiveSegment = exclusiveSegment;
    return this;
  }

   /**
   * Get exclusiveSegment
   * @return exclusiveSegment
  **/
  @javax.annotation.Nullable

  public RmLegacySegmentUserBehaviorCreateV2 getExclusiveSegment() {
    return exclusiveSegment;
  }


  public void setExclusiveSegment(RmLegacySegmentUserBehaviorCreateV2 exclusiveSegment) {
    this.exclusiveSegment = exclusiveSegment;
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
   * @return the RmLegacyAudienceUserBehaviorCreateV2 instance itself
   */
  public RmLegacyAudienceUserBehaviorCreateV2 putAdditionalProperty(String key, Object value) {
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
    RmLegacyAudienceUserBehaviorCreateV2 rmLegacyAudienceUserBehaviorCreateV2 = (RmLegacyAudienceUserBehaviorCreateV2) o;
    return Objects.equals(this.inclusiveSegment, rmLegacyAudienceUserBehaviorCreateV2.inclusiveSegment) &&
        Objects.equals(this.exclusiveSegment, rmLegacyAudienceUserBehaviorCreateV2.exclusiveSegment)&&
        Objects.equals(this.additionalProperties, rmLegacyAudienceUserBehaviorCreateV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusiveSegment, exclusiveSegment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmLegacyAudienceUserBehaviorCreateV2 {\n");
    sb.append("    inclusiveSegment: ").append(toIndentedString(inclusiveSegment)).append("\n");
    sb.append("    exclusiveSegment: ").append(toIndentedString(exclusiveSegment)).append("\n");
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
    openapiFields.add("inclusiveSegment");
    openapiFields.add("exclusiveSegment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inclusiveSegment");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RmLegacyAudienceUserBehaviorCreateV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RmLegacyAudienceUserBehaviorCreateV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmLegacyAudienceUserBehaviorCreateV2 is not found in the empty JSON string", RmLegacyAudienceUserBehaviorCreateV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RmLegacyAudienceUserBehaviorCreateV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `inclusiveSegment`
      RmLegacySegmentUserBehaviorCreateV2.validateJsonObject(jsonObj.getAsJsonObject("inclusiveSegment"));
      // validate the optional field `exclusiveSegment`
      if (jsonObj.get("exclusiveSegment") != null && !jsonObj.get("exclusiveSegment").isJsonNull()) {
        RmLegacySegmentUserBehaviorCreateV2.validateJsonObject(jsonObj.getAsJsonObject("exclusiveSegment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmLegacyAudienceUserBehaviorCreateV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmLegacyAudienceUserBehaviorCreateV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmLegacyAudienceUserBehaviorCreateV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmLegacyAudienceUserBehaviorCreateV2.class));

       return (TypeAdapter<T>) new TypeAdapter<RmLegacyAudienceUserBehaviorCreateV2>() {
           @Override
           public void write(JsonWriter out, RmLegacyAudienceUserBehaviorCreateV2 value) throws IOException {
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
           public RmLegacyAudienceUserBehaviorCreateV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RmLegacyAudienceUserBehaviorCreateV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RmLegacyAudienceUserBehaviorCreateV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmLegacyAudienceUserBehaviorCreateV2
  * @throws IOException if the JSON string is invalid with respect to RmLegacyAudienceUserBehaviorCreateV2
  */
  public static RmLegacyAudienceUserBehaviorCreateV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmLegacyAudienceUserBehaviorCreateV2.class);
  }

 /**
  * Convert an instance of RmLegacyAudienceUserBehaviorCreateV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

