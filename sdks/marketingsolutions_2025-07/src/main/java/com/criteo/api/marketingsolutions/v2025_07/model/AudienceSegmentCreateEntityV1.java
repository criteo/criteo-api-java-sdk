/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2025-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2025_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2025_07.model.InMarketCreateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.LocationCreateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.LookalikeCreateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.ProspectingCreateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.RetargetingCreateV1;
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

import com.criteo.api.marketingsolutions.v2025_07.JSON;

/**
 * Set of rules that defines specific people to target.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceSegmentCreateEntityV1 {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private Object contactList;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IN_MARKET = "inMarket";
  @SerializedName(SERIALIZED_NAME_IN_MARKET)
  private InMarketCreateV1 inMarket;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationCreateV1 location;

  public static final String SERIALIZED_NAME_LOOKALIKE = "lookalike";
  @SerializedName(SERIALIZED_NAME_LOOKALIKE)
  private LookalikeCreateV1 lookalike;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROSPECTING = "prospecting";
  @SerializedName(SERIALIZED_NAME_PROSPECTING)
  private ProspectingCreateV1 prospecting;

  public static final String SERIALIZED_NAME_RETARGETING = "retargeting";
  @SerializedName(SERIALIZED_NAME_RETARGETING)
  private RetargetingCreateV1 retargeting;

  public AudienceSegmentCreateEntityV1() {
  }

  public AudienceSegmentCreateEntityV1 advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser associated to the segment
   * @return advertiserId
  **/
  @javax.annotation.Nonnull

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceSegmentCreateEntityV1 contactList(Object contactList) {
    
    this.contactList = contactList;
    return this;
  }

   /**
   * Settings to target users with your contact lists.
   * @return contactList
  **/
  @javax.annotation.Nullable

  public Object getContactList() {
    return contactList;
  }


  public void setContactList(Object contactList) {
    this.contactList = contactList;
  }


  public AudienceSegmentCreateEntityV1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the segment
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AudienceSegmentCreateEntityV1 inMarket(InMarketCreateV1 inMarket) {
    
    this.inMarket = inMarket;
    return this;
  }

   /**
   * Get inMarket
   * @return inMarket
  **/
  @javax.annotation.Nullable

  public InMarketCreateV1 getInMarket() {
    return inMarket;
  }


  public void setInMarket(InMarketCreateV1 inMarket) {
    this.inMarket = inMarket;
  }


  public AudienceSegmentCreateEntityV1 location(LocationCreateV1 location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public LocationCreateV1 getLocation() {
    return location;
  }


  public void setLocation(LocationCreateV1 location) {
    this.location = location;
  }


  public AudienceSegmentCreateEntityV1 lookalike(LookalikeCreateV1 lookalike) {
    
    this.lookalike = lookalike;
    return this;
  }

   /**
   * Get lookalike
   * @return lookalike
  **/
  @javax.annotation.Nullable

  public LookalikeCreateV1 getLookalike() {
    return lookalike;
  }


  public void setLookalike(LookalikeCreateV1 lookalike) {
    this.lookalike = lookalike;
  }


  public AudienceSegmentCreateEntityV1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the segment
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceSegmentCreateEntityV1 prospecting(ProspectingCreateV1 prospecting) {
    
    this.prospecting = prospecting;
    return this;
  }

   /**
   * Get prospecting
   * @return prospecting
  **/
  @javax.annotation.Nullable

  public ProspectingCreateV1 getProspecting() {
    return prospecting;
  }


  public void setProspecting(ProspectingCreateV1 prospecting) {
    this.prospecting = prospecting;
  }


  public AudienceSegmentCreateEntityV1 retargeting(RetargetingCreateV1 retargeting) {
    
    this.retargeting = retargeting;
    return this;
  }

   /**
   * Get retargeting
   * @return retargeting
  **/
  @javax.annotation.Nullable

  public RetargetingCreateV1 getRetargeting() {
    return retargeting;
  }


  public void setRetargeting(RetargetingCreateV1 retargeting) {
    this.retargeting = retargeting;
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
   * @return the AudienceSegmentCreateEntityV1 instance itself
   */
  public AudienceSegmentCreateEntityV1 putAdditionalProperty(String key, Object value) {
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
    AudienceSegmentCreateEntityV1 audienceSegmentCreateEntityV1 = (AudienceSegmentCreateEntityV1) o;
    return Objects.equals(this.advertiserId, audienceSegmentCreateEntityV1.advertiserId) &&
        Objects.equals(this.contactList, audienceSegmentCreateEntityV1.contactList) &&
        Objects.equals(this.description, audienceSegmentCreateEntityV1.description) &&
        Objects.equals(this.inMarket, audienceSegmentCreateEntityV1.inMarket) &&
        Objects.equals(this.location, audienceSegmentCreateEntityV1.location) &&
        Objects.equals(this.lookalike, audienceSegmentCreateEntityV1.lookalike) &&
        Objects.equals(this.name, audienceSegmentCreateEntityV1.name) &&
        Objects.equals(this.prospecting, audienceSegmentCreateEntityV1.prospecting) &&
        Objects.equals(this.retargeting, audienceSegmentCreateEntityV1.retargeting)&&
        Objects.equals(this.additionalProperties, audienceSegmentCreateEntityV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, contactList, description, inMarket, location, lookalike, name, prospecting, retargeting, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSegmentCreateEntityV1 {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inMarket: ").append(toIndentedString(inMarket)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lookalike: ").append(toIndentedString(lookalike)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prospecting: ").append(toIndentedString(prospecting)).append("\n");
    sb.append("    retargeting: ").append(toIndentedString(retargeting)).append("\n");
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
    openapiFields.add("advertiserId");
    openapiFields.add("contactList");
    openapiFields.add("description");
    openapiFields.add("inMarket");
    openapiFields.add("location");
    openapiFields.add("lookalike");
    openapiFields.add("name");
    openapiFields.add("prospecting");
    openapiFields.add("retargeting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiserId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudienceSegmentCreateEntityV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudienceSegmentCreateEntityV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudienceSegmentCreateEntityV1 is not found in the empty JSON string", AudienceSegmentCreateEntityV1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AudienceSegmentCreateEntityV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `inMarket`
      if (jsonObj.get("inMarket") != null && !jsonObj.get("inMarket").isJsonNull()) {
        InMarketCreateV1.validateJsonObject(jsonObj.getAsJsonObject("inMarket"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LocationCreateV1.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `lookalike`
      if (jsonObj.get("lookalike") != null && !jsonObj.get("lookalike").isJsonNull()) {
        LookalikeCreateV1.validateJsonObject(jsonObj.getAsJsonObject("lookalike"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `prospecting`
      if (jsonObj.get("prospecting") != null && !jsonObj.get("prospecting").isJsonNull()) {
        ProspectingCreateV1.validateJsonObject(jsonObj.getAsJsonObject("prospecting"));
      }
      // validate the optional field `retargeting`
      if (jsonObj.get("retargeting") != null && !jsonObj.get("retargeting").isJsonNull()) {
        RetargetingCreateV1.validateJsonObject(jsonObj.getAsJsonObject("retargeting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudienceSegmentCreateEntityV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudienceSegmentCreateEntityV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudienceSegmentCreateEntityV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudienceSegmentCreateEntityV1.class));

       return (TypeAdapter<T>) new TypeAdapter<AudienceSegmentCreateEntityV1>() {
           @Override
           public void write(JsonWriter out, AudienceSegmentCreateEntityV1 value) throws IOException {
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
           public AudienceSegmentCreateEntityV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudienceSegmentCreateEntityV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudienceSegmentCreateEntityV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudienceSegmentCreateEntityV1
  * @throws IOException if the JSON string is invalid with respect to AudienceSegmentCreateEntityV1
  */
  public static AudienceSegmentCreateEntityV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudienceSegmentCreateEntityV1.class);
  }

 /**
  * Convert an instance of AudienceSegmentCreateEntityV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

