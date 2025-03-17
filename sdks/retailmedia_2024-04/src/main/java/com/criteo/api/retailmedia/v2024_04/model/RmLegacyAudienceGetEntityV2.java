/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_04.model.RmLegacyAudienceUserBehaviorDetailsV2;
import com.criteo.api.retailmedia.v2024_04.model.RmLegacySegmentCustomerList;
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

import com.criteo.api.retailmedia.v2024_04.JSON;

/**
 * Audience definition of people of interest for a marketer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RmLegacyAudienceGetEntityV2 {
  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_USER_BEHAVIOR_DETAILS = "userBehaviorDetails";
  @SerializedName(SERIALIZED_NAME_USER_BEHAVIOR_DETAILS)
  private RmLegacyAudienceUserBehaviorDetailsV2 userBehaviorDetails;

  public static final String SERIALIZED_NAME_CUSTOMER_LIST_DETAILS = "customerListDetails";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LIST_DETAILS)
  private RmLegacySegmentCustomerList customerListDetails;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public RmLegacyAudienceGetEntityV2() {
  }

  public RmLegacyAudienceGetEntityV2 retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * ID of the retailer associated with this audience
   * @return retailerId
  **/
  @javax.annotation.Nonnull

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public RmLegacyAudienceGetEntityV2 userBehaviorDetails(RmLegacyAudienceUserBehaviorDetailsV2 userBehaviorDetails) {
    
    this.userBehaviorDetails = userBehaviorDetails;
    return this;
  }

   /**
   * Get userBehaviorDetails
   * @return userBehaviorDetails
  **/
  @javax.annotation.Nullable

  public RmLegacyAudienceUserBehaviorDetailsV2 getUserBehaviorDetails() {
    return userBehaviorDetails;
  }


  public void setUserBehaviorDetails(RmLegacyAudienceUserBehaviorDetailsV2 userBehaviorDetails) {
    this.userBehaviorDetails = userBehaviorDetails;
  }


  public RmLegacyAudienceGetEntityV2 customerListDetails(RmLegacySegmentCustomerList customerListDetails) {
    
    this.customerListDetails = customerListDetails;
    return this;
  }

   /**
   * Get customerListDetails
   * @return customerListDetails
  **/
  @javax.annotation.Nullable

  public RmLegacySegmentCustomerList getCustomerListDetails() {
    return customerListDetails;
  }


  public void setCustomerListDetails(RmLegacySegmentCustomerList customerListDetails) {
    this.customerListDetails = customerListDetails;
  }


  public RmLegacyAudienceGetEntityV2 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the audience
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
   * @return the RmLegacyAudienceGetEntityV2 instance itself
   */
  public RmLegacyAudienceGetEntityV2 putAdditionalProperty(String key, Object value) {
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
    RmLegacyAudienceGetEntityV2 rmLegacyAudienceGetEntityV2 = (RmLegacyAudienceGetEntityV2) o;
    return Objects.equals(this.retailerId, rmLegacyAudienceGetEntityV2.retailerId) &&
        Objects.equals(this.userBehaviorDetails, rmLegacyAudienceGetEntityV2.userBehaviorDetails) &&
        Objects.equals(this.customerListDetails, rmLegacyAudienceGetEntityV2.customerListDetails) &&
        Objects.equals(this.name, rmLegacyAudienceGetEntityV2.name)&&
        Objects.equals(this.additionalProperties, rmLegacyAudienceGetEntityV2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, userBehaviorDetails, customerListDetails, name, additionalProperties);
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
    sb.append("class RmLegacyAudienceGetEntityV2 {\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    userBehaviorDetails: ").append(toIndentedString(userBehaviorDetails)).append("\n");
    sb.append("    customerListDetails: ").append(toIndentedString(customerListDetails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("retailerId");
    openapiFields.add("userBehaviorDetails");
    openapiFields.add("customerListDetails");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("retailerId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RmLegacyAudienceGetEntityV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RmLegacyAudienceGetEntityV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmLegacyAudienceGetEntityV2 is not found in the empty JSON string", RmLegacyAudienceGetEntityV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RmLegacyAudienceGetEntityV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("retailerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerId").toString()));
      }
      // validate the optional field `userBehaviorDetails`
      if (jsonObj.get("userBehaviorDetails") != null && !jsonObj.get("userBehaviorDetails").isJsonNull()) {
        RmLegacyAudienceUserBehaviorDetailsV2.validateJsonObject(jsonObj.getAsJsonObject("userBehaviorDetails"));
      }
      // validate the optional field `customerListDetails`
      if (jsonObj.get("customerListDetails") != null && !jsonObj.get("customerListDetails").isJsonNull()) {
        RmLegacySegmentCustomerList.validateJsonObject(jsonObj.getAsJsonObject("customerListDetails"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmLegacyAudienceGetEntityV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmLegacyAudienceGetEntityV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmLegacyAudienceGetEntityV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmLegacyAudienceGetEntityV2.class));

       return (TypeAdapter<T>) new TypeAdapter<RmLegacyAudienceGetEntityV2>() {
           @Override
           public void write(JsonWriter out, RmLegacyAudienceGetEntityV2 value) throws IOException {
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
           public RmLegacyAudienceGetEntityV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RmLegacyAudienceGetEntityV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RmLegacyAudienceGetEntityV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmLegacyAudienceGetEntityV2
  * @throws IOException if the JSON string is invalid with respect to RmLegacyAudienceGetEntityV2
  */
  public static RmLegacyAudienceGetEntityV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmLegacyAudienceGetEntityV2.class);
  }

 /**
  * Convert an instance of RmLegacyAudienceGetEntityV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

