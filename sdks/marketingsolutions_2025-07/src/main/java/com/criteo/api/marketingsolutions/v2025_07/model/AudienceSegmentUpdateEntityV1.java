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
import com.criteo.api.marketingsolutions.v2025_07.model.InMarketUpdateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.LocationUpdateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.LookalikeUpdateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.NillableString;
import com.criteo.api.marketingsolutions.v2025_07.model.ProspectingUpdateV1;
import com.criteo.api.marketingsolutions.v2025_07.model.RetargetingUpdateV1;
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

import com.criteo.api.marketingsolutions.v2025_07.JSON;

/**
 * Set of rules that defines specific people to target.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceSegmentUpdateEntityV1 {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private NillableString description;

  public static final String SERIALIZED_NAME_IN_MARKET = "inMarket";
  @SerializedName(SERIALIZED_NAME_IN_MARKET)
  private InMarketUpdateV1 inMarket;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationUpdateV1 location;

  public static final String SERIALIZED_NAME_LOOKALIKE = "lookalike";
  @SerializedName(SERIALIZED_NAME_LOOKALIKE)
  private LookalikeUpdateV1 lookalike;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROSPECTING = "prospecting";
  @SerializedName(SERIALIZED_NAME_PROSPECTING)
  private ProspectingUpdateV1 prospecting;

  public static final String SERIALIZED_NAME_RETARGETING = "retargeting";
  @SerializedName(SERIALIZED_NAME_RETARGETING)
  private RetargetingUpdateV1 retargeting;

  public AudienceSegmentUpdateEntityV1() {
  }

  public AudienceSegmentUpdateEntityV1 description(NillableString description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public NillableString getDescription() {
    return description;
  }


  public void setDescription(NillableString description) {
    this.description = description;
  }


  public AudienceSegmentUpdateEntityV1 inMarket(InMarketUpdateV1 inMarket) {
    
    this.inMarket = inMarket;
    return this;
  }

   /**
   * Get inMarket
   * @return inMarket
  **/
  @javax.annotation.Nullable

  public InMarketUpdateV1 getInMarket() {
    return inMarket;
  }


  public void setInMarket(InMarketUpdateV1 inMarket) {
    this.inMarket = inMarket;
  }


  public AudienceSegmentUpdateEntityV1 location(LocationUpdateV1 location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public LocationUpdateV1 getLocation() {
    return location;
  }


  public void setLocation(LocationUpdateV1 location) {
    this.location = location;
  }


  public AudienceSegmentUpdateEntityV1 lookalike(LookalikeUpdateV1 lookalike) {
    
    this.lookalike = lookalike;
    return this;
  }

   /**
   * Get lookalike
   * @return lookalike
  **/
  @javax.annotation.Nullable

  public LookalikeUpdateV1 getLookalike() {
    return lookalike;
  }


  public void setLookalike(LookalikeUpdateV1 lookalike) {
    this.lookalike = lookalike;
  }


  public AudienceSegmentUpdateEntityV1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the segment
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceSegmentUpdateEntityV1 prospecting(ProspectingUpdateV1 prospecting) {
    
    this.prospecting = prospecting;
    return this;
  }

   /**
   * Get prospecting
   * @return prospecting
  **/
  @javax.annotation.Nullable

  public ProspectingUpdateV1 getProspecting() {
    return prospecting;
  }


  public void setProspecting(ProspectingUpdateV1 prospecting) {
    this.prospecting = prospecting;
  }


  public AudienceSegmentUpdateEntityV1 retargeting(RetargetingUpdateV1 retargeting) {
    
    this.retargeting = retargeting;
    return this;
  }

   /**
   * Get retargeting
   * @return retargeting
  **/
  @javax.annotation.Nullable

  public RetargetingUpdateV1 getRetargeting() {
    return retargeting;
  }


  public void setRetargeting(RetargetingUpdateV1 retargeting) {
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
   * @return the AudienceSegmentUpdateEntityV1 instance itself
   */
  public AudienceSegmentUpdateEntityV1 putAdditionalProperty(String key, Object value) {
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
    AudienceSegmentUpdateEntityV1 audienceSegmentUpdateEntityV1 = (AudienceSegmentUpdateEntityV1) o;
    return Objects.equals(this.description, audienceSegmentUpdateEntityV1.description) &&
        Objects.equals(this.inMarket, audienceSegmentUpdateEntityV1.inMarket) &&
        Objects.equals(this.location, audienceSegmentUpdateEntityV1.location) &&
        Objects.equals(this.lookalike, audienceSegmentUpdateEntityV1.lookalike) &&
        Objects.equals(this.name, audienceSegmentUpdateEntityV1.name) &&
        Objects.equals(this.prospecting, audienceSegmentUpdateEntityV1.prospecting) &&
        Objects.equals(this.retargeting, audienceSegmentUpdateEntityV1.retargeting)&&
        Objects.equals(this.additionalProperties, audienceSegmentUpdateEntityV1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, inMarket, location, lookalike, name, prospecting, retargeting, additionalProperties);
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
    sb.append("class AudienceSegmentUpdateEntityV1 {\n");
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
    openapiFields.add("description");
    openapiFields.add("inMarket");
    openapiFields.add("location");
    openapiFields.add("lookalike");
    openapiFields.add("name");
    openapiFields.add("prospecting");
    openapiFields.add("retargeting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudienceSegmentUpdateEntityV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudienceSegmentUpdateEntityV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudienceSegmentUpdateEntityV1 is not found in the empty JSON string", AudienceSegmentUpdateEntityV1.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        NillableString.validateJsonObject(jsonObj.getAsJsonObject("description"));
      }
      // validate the optional field `inMarket`
      if (jsonObj.get("inMarket") != null && !jsonObj.get("inMarket").isJsonNull()) {
        InMarketUpdateV1.validateJsonObject(jsonObj.getAsJsonObject("inMarket"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LocationUpdateV1.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `lookalike`
      if (jsonObj.get("lookalike") != null && !jsonObj.get("lookalike").isJsonNull()) {
        LookalikeUpdateV1.validateJsonObject(jsonObj.getAsJsonObject("lookalike"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `prospecting`
      if (jsonObj.get("prospecting") != null && !jsonObj.get("prospecting").isJsonNull()) {
        ProspectingUpdateV1.validateJsonObject(jsonObj.getAsJsonObject("prospecting"));
      }
      // validate the optional field `retargeting`
      if (jsonObj.get("retargeting") != null && !jsonObj.get("retargeting").isJsonNull()) {
        RetargetingUpdateV1.validateJsonObject(jsonObj.getAsJsonObject("retargeting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudienceSegmentUpdateEntityV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudienceSegmentUpdateEntityV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudienceSegmentUpdateEntityV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudienceSegmentUpdateEntityV1.class));

       return (TypeAdapter<T>) new TypeAdapter<AudienceSegmentUpdateEntityV1>() {
           @Override
           public void write(JsonWriter out, AudienceSegmentUpdateEntityV1 value) throws IOException {
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
           public AudienceSegmentUpdateEntityV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudienceSegmentUpdateEntityV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudienceSegmentUpdateEntityV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudienceSegmentUpdateEntityV1
  * @throws IOException if the JSON string is invalid with respect to AudienceSegmentUpdateEntityV1
  */
  public static AudienceSegmentUpdateEntityV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudienceSegmentUpdateEntityV1.class);
  }

 /**
  * Convert an instance of AudienceSegmentUpdateEntityV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

