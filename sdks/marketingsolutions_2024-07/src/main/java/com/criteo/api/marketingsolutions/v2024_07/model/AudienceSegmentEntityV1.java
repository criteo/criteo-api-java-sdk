/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2024_07.model.BehavioralV1;
import com.criteo.api.marketingsolutions.v2024_07.model.ContactListV1;
import com.criteo.api.marketingsolutions.v2024_07.model.InMarketV1;
import com.criteo.api.marketingsolutions.v2024_07.model.LocationV1;
import com.criteo.api.marketingsolutions.v2024_07.model.LookalikeV1;
import com.criteo.api.marketingsolutions.v2024_07.model.ProspectingV1;
import com.criteo.api.marketingsolutions.v2024_07.model.RetargetingV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.criteo.api.marketingsolutions.v2024_07.JSON;

/**
 * Set of rules that defines specific people to target.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceSegmentEntityV1 {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_BEHAVIORAL = "behavioral";
  @SerializedName(SERIALIZED_NAME_BEHAVIORAL)
  private BehavioralV1 behavioral;

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private ContactListV1 contactList;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IN_MARKET = "inMarket";
  @SerializedName(SERIALIZED_NAME_IN_MARKET)
  private InMarketV1 inMarket;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationV1 location;

  public static final String SERIALIZED_NAME_LOOKALIKE = "lookalike";
  @SerializedName(SERIALIZED_NAME_LOOKALIKE)
  private LookalikeV1 lookalike;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROSPECTING = "prospecting";
  @SerializedName(SERIALIZED_NAME_PROSPECTING)
  private ProspectingV1 prospecting;

  public static final String SERIALIZED_NAME_RETARGETING = "retargeting";
  @SerializedName(SERIALIZED_NAME_RETARGETING)
  private RetargetingV1 retargeting;

  /**
   * Type of segment (read-only)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("Unknown"),
    
    INMARKET("InMarket"),
    
    PROSPECTING("Prospecting"),
    
    CONTACTLIST("ContactList"),
    
    LOCATION("Location"),
    
    BEHAVIORAL("Behavioral"),
    
    RETARGETING("Retargeting"),
    
    LOOKALIKE("Lookalike");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AudienceSegmentEntityV1() {
  }

  public AudienceSegmentEntityV1 advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser associated to the segment
   * @return advertiserId
  **/
  @javax.annotation.Nullable

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceSegmentEntityV1 behavioral(BehavioralV1 behavioral) {
    
    this.behavioral = behavioral;
    return this;
  }

   /**
   * Get behavioral
   * @return behavioral
  **/
  @javax.annotation.Nullable

  public BehavioralV1 getBehavioral() {
    return behavioral;
  }


  public void setBehavioral(BehavioralV1 behavioral) {
    this.behavioral = behavioral;
  }


  public AudienceSegmentEntityV1 contactList(ContactListV1 contactList) {
    
    this.contactList = contactList;
    return this;
  }

   /**
   * Get contactList
   * @return contactList
  **/
  @javax.annotation.Nullable

  public ContactListV1 getContactList() {
    return contactList;
  }


  public void setContactList(ContactListV1 contactList) {
    this.contactList = contactList;
  }


  public AudienceSegmentEntityV1 createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO-8601 timestamp in UTC of segment creation (read-only)
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AudienceSegmentEntityV1 description(String description) {
    
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


  public AudienceSegmentEntityV1 inMarket(InMarketV1 inMarket) {
    
    this.inMarket = inMarket;
    return this;
  }

   /**
   * Get inMarket
   * @return inMarket
  **/
  @javax.annotation.Nullable

  public InMarketV1 getInMarket() {
    return inMarket;
  }


  public void setInMarket(InMarketV1 inMarket) {
    this.inMarket = inMarket;
  }


  public AudienceSegmentEntityV1 location(LocationV1 location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public LocationV1 getLocation() {
    return location;
  }


  public void setLocation(LocationV1 location) {
    this.location = location;
  }


  public AudienceSegmentEntityV1 lookalike(LookalikeV1 lookalike) {
    
    this.lookalike = lookalike;
    return this;
  }

   /**
   * Get lookalike
   * @return lookalike
  **/
  @javax.annotation.Nullable

  public LookalikeV1 getLookalike() {
    return lookalike;
  }


  public void setLookalike(LookalikeV1 lookalike) {
    this.lookalike = lookalike;
  }


  public AudienceSegmentEntityV1 name(String name) {
    
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


  public AudienceSegmentEntityV1 prospecting(ProspectingV1 prospecting) {
    
    this.prospecting = prospecting;
    return this;
  }

   /**
   * Get prospecting
   * @return prospecting
  **/
  @javax.annotation.Nullable

  public ProspectingV1 getProspecting() {
    return prospecting;
  }


  public void setProspecting(ProspectingV1 prospecting) {
    this.prospecting = prospecting;
  }


  public AudienceSegmentEntityV1 retargeting(RetargetingV1 retargeting) {
    
    this.retargeting = retargeting;
    return this;
  }

   /**
   * Get retargeting
   * @return retargeting
  **/
  @javax.annotation.Nullable

  public RetargetingV1 getRetargeting() {
    return retargeting;
  }


  public void setRetargeting(RetargetingV1 retargeting) {
    this.retargeting = retargeting;
  }


  public AudienceSegmentEntityV1 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of segment (read-only)
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AudienceSegmentEntityV1 updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO-8601 timestamp in UTC of segment update (read-only)
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the AudienceSegmentEntityV1 instance itself
   */
  public AudienceSegmentEntityV1 putAdditionalProperty(String key, Object value) {
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
    AudienceSegmentEntityV1 audienceSegmentEntityV1 = (AudienceSegmentEntityV1) o;
    return Objects.equals(this.advertiserId, audienceSegmentEntityV1.advertiserId) &&
        Objects.equals(this.behavioral, audienceSegmentEntityV1.behavioral) &&
        Objects.equals(this.contactList, audienceSegmentEntityV1.contactList) &&
        Objects.equals(this.createdAt, audienceSegmentEntityV1.createdAt) &&
        Objects.equals(this.description, audienceSegmentEntityV1.description) &&
        Objects.equals(this.inMarket, audienceSegmentEntityV1.inMarket) &&
        Objects.equals(this.location, audienceSegmentEntityV1.location) &&
        Objects.equals(this.lookalike, audienceSegmentEntityV1.lookalike) &&
        Objects.equals(this.name, audienceSegmentEntityV1.name) &&
        Objects.equals(this.prospecting, audienceSegmentEntityV1.prospecting) &&
        Objects.equals(this.retargeting, audienceSegmentEntityV1.retargeting) &&
        Objects.equals(this.type, audienceSegmentEntityV1.type) &&
        Objects.equals(this.updatedAt, audienceSegmentEntityV1.updatedAt)&&
        Objects.equals(this.additionalProperties, audienceSegmentEntityV1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, behavioral, contactList, createdAt, description, inMarket, location, lookalike, name, prospecting, retargeting, type, updatedAt, additionalProperties);
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
    sb.append("class AudienceSegmentEntityV1 {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    behavioral: ").append(toIndentedString(behavioral)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inMarket: ").append(toIndentedString(inMarket)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lookalike: ").append(toIndentedString(lookalike)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prospecting: ").append(toIndentedString(prospecting)).append("\n");
    sb.append("    retargeting: ").append(toIndentedString(retargeting)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("behavioral");
    openapiFields.add("contactList");
    openapiFields.add("createdAt");
    openapiFields.add("description");
    openapiFields.add("inMarket");
    openapiFields.add("location");
    openapiFields.add("lookalike");
    openapiFields.add("name");
    openapiFields.add("prospecting");
    openapiFields.add("retargeting");
    openapiFields.add("type");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudienceSegmentEntityV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudienceSegmentEntityV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudienceSegmentEntityV1 is not found in the empty JSON string", AudienceSegmentEntityV1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("advertiserId") != null && !jsonObj.get("advertiserId").isJsonNull()) && !jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      // validate the optional field `behavioral`
      if (jsonObj.get("behavioral") != null && !jsonObj.get("behavioral").isJsonNull()) {
        BehavioralV1.validateJsonObject(jsonObj.getAsJsonObject("behavioral"));
      }
      // validate the optional field `contactList`
      if (jsonObj.get("contactList") != null && !jsonObj.get("contactList").isJsonNull()) {
        ContactListV1.validateJsonObject(jsonObj.getAsJsonObject("contactList"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `inMarket`
      if (jsonObj.get("inMarket") != null && !jsonObj.get("inMarket").isJsonNull()) {
        InMarketV1.validateJsonObject(jsonObj.getAsJsonObject("inMarket"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LocationV1.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `lookalike`
      if (jsonObj.get("lookalike") != null && !jsonObj.get("lookalike").isJsonNull()) {
        LookalikeV1.validateJsonObject(jsonObj.getAsJsonObject("lookalike"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `prospecting`
      if (jsonObj.get("prospecting") != null && !jsonObj.get("prospecting").isJsonNull()) {
        ProspectingV1.validateJsonObject(jsonObj.getAsJsonObject("prospecting"));
      }
      // validate the optional field `retargeting`
      if (jsonObj.get("retargeting") != null && !jsonObj.get("retargeting").isJsonNull()) {
        RetargetingV1.validateJsonObject(jsonObj.getAsJsonObject("retargeting"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudienceSegmentEntityV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudienceSegmentEntityV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudienceSegmentEntityV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudienceSegmentEntityV1.class));

       return (TypeAdapter<T>) new TypeAdapter<AudienceSegmentEntityV1>() {
           @Override
           public void write(JsonWriter out, AudienceSegmentEntityV1 value) throws IOException {
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
           public AudienceSegmentEntityV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudienceSegmentEntityV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudienceSegmentEntityV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudienceSegmentEntityV1
  * @throws IOException if the JSON string is invalid with respect to AudienceSegmentEntityV1
  */
  public static AudienceSegmentEntityV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudienceSegmentEntityV1.class);
  }

 /**
  * Convert an instance of AudienceSegmentEntityV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

