/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.DealId;
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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * deal ids targeting writing model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetAdSetTargetingDealIds {
  public static final String SERIALIZED_NAME_DEAL_IDS = "dealIds";
  @SerializedName(SERIALIZED_NAME_DEAL_IDS)
  private List<DealId> dealIds = null;

  public SetAdSetTargetingDealIds() {
  }

  public SetAdSetTargetingDealIds dealIds(List<DealId> dealIds) {
    
    this.dealIds = dealIds;
    return this;
  }

  public SetAdSetTargetingDealIds addDealIdsItem(DealId dealIdsItem) {
    if (this.dealIds == null) {
      this.dealIds = new ArrayList<>();
    }
    this.dealIds.add(dealIdsItem);
    return this;
  }

   /**
   * Get dealIds
   * @return dealIds
  **/
  @javax.annotation.Nullable

  public List<DealId> getDealIds() {
    return dealIds;
  }


  public void setDealIds(List<DealId> dealIds) {
    this.dealIds = dealIds;
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
   * @return the SetAdSetTargetingDealIds instance itself
   */
  public SetAdSetTargetingDealIds putAdditionalProperty(String key, Object value) {
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
    SetAdSetTargetingDealIds setAdSetTargetingDealIds = (SetAdSetTargetingDealIds) o;
    return Objects.equals(this.dealIds, setAdSetTargetingDealIds.dealIds)&&
        Objects.equals(this.additionalProperties, setAdSetTargetingDealIds.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAdSetTargetingDealIds {\n");
    sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
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
    openapiFields.add("dealIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetAdSetTargetingDealIds
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SetAdSetTargetingDealIds.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetAdSetTargetingDealIds is not found in the empty JSON string", SetAdSetTargetingDealIds.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("dealIds") != null && !jsonObj.get("dealIds").isJsonNull()) {
        JsonArray jsonArraydealIds = jsonObj.getAsJsonArray("dealIds");
        if (jsonArraydealIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dealIds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dealIds` to be an array in the JSON string but got `%s`", jsonObj.get("dealIds").toString()));
          }

          // validate the optional field `dealIds` (array)
          for (int i = 0; i < jsonArraydealIds.size(); i++) {
            DealId.validateJsonObject(jsonArraydealIds.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetAdSetTargetingDealIds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetAdSetTargetingDealIds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetAdSetTargetingDealIds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetAdSetTargetingDealIds.class));

       return (TypeAdapter<T>) new TypeAdapter<SetAdSetTargetingDealIds>() {
           @Override
           public void write(JsonWriter out, SetAdSetTargetingDealIds value) throws IOException {
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
           public SetAdSetTargetingDealIds read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SetAdSetTargetingDealIds instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SetAdSetTargetingDealIds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetAdSetTargetingDealIds
  * @throws IOException if the JSON string is invalid with respect to SetAdSetTargetingDealIds
  */
  public static SetAdSetTargetingDealIds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetAdSetTargetingDealIds.class);
  }

 /**
  * Convert an instance of SetAdSetTargetingDealIds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

