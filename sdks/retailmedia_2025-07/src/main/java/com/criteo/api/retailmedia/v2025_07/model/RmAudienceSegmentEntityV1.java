/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2025-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2025_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2025_07.model.RmContactListV1;
import com.criteo.api.retailmedia.v2025_07.model.RmEventsV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.criteo.api.retailmedia.v2025_07.JSON;

/**
 * Set of rules that defines specific people to target.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RmAudienceSegmentEntityV1 {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * Gets or Sets channels
   */
  @JsonAdapter(ChannelsEnum.Adapter.class)
  public enum ChannelsEnum {
    UNKNOWN("Unknown"),
    
    ONSITE("Onsite"),
    
    OFFSITE("Offsite");

    private String value;

    ChannelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelsEnum fromValue(String value) {
      for (ChannelsEnum b : ChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<ChannelsEnum> channels = null;

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private RmContactListV1 contactList;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private String createdById;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private RmEventsV1 events;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  /**
   * Type of segment (read-only)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("Unknown"),
    
    CONTACTLIST("ContactList"),
    
    EVENTS("Events");

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

  public RmAudienceSegmentEntityV1() {
  }

  public RmAudienceSegmentEntityV1 accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account associated to the segment
   * @return accountId
  **/
  @javax.annotation.Nullable

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public RmAudienceSegmentEntityV1 channels(List<ChannelsEnum> channels) {
    
    this.channels = channels;
    return this;
  }

  public RmAudienceSegmentEntityV1 addChannelsItem(ChannelsEnum channelsItem) {
    if (this.channels == null) {
      this.channels = null;
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Channels associated to the segment (read-only)
   * @return channels
  **/
  @javax.annotation.Nullable

  public List<ChannelsEnum> getChannels() {
    return channels;
  }


  public void setChannels(List<ChannelsEnum> channels) {
    this.channels = channels;
  }


  public RmAudienceSegmentEntityV1 contactList(RmContactListV1 contactList) {
    
    this.contactList = contactList;
    return this;
  }

   /**
   * Get contactList
   * @return contactList
  **/
  @javax.annotation.Nullable

  public RmContactListV1 getContactList() {
    return contactList;
  }


  public void setContactList(RmContactListV1 contactList) {
    this.contactList = contactList;
  }


  public RmAudienceSegmentEntityV1 createdAt(OffsetDateTime createdAt) {
    
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


  public RmAudienceSegmentEntityV1 createdById(String createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * User that created the segment
   * @return createdById
  **/
  @javax.annotation.Nullable

  public String getCreatedById() {
    return createdById;
  }


  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }


  public RmAudienceSegmentEntityV1 description(String description) {
    
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


  public RmAudienceSegmentEntityV1 events(RmEventsV1 events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable

  public RmEventsV1 getEvents() {
    return events;
  }


  public void setEvents(RmEventsV1 events) {
    this.events = events;
  }


  public RmAudienceSegmentEntityV1 name(String name) {
    
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


  public RmAudienceSegmentEntityV1 retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Retailer  associated to the segment
   * @return retailerId
  **/
  @javax.annotation.Nullable

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public RmAudienceSegmentEntityV1 type(TypeEnum type) {
    
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


  public RmAudienceSegmentEntityV1 updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the RmAudienceSegmentEntityV1 instance itself
   */
  public RmAudienceSegmentEntityV1 putAdditionalProperty(String key, Object value) {
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
    RmAudienceSegmentEntityV1 rmAudienceSegmentEntityV1 = (RmAudienceSegmentEntityV1) o;
    return Objects.equals(this.accountId, rmAudienceSegmentEntityV1.accountId) &&
        Objects.equals(this.channels, rmAudienceSegmentEntityV1.channels) &&
        Objects.equals(this.contactList, rmAudienceSegmentEntityV1.contactList) &&
        Objects.equals(this.createdAt, rmAudienceSegmentEntityV1.createdAt) &&
        Objects.equals(this.createdById, rmAudienceSegmentEntityV1.createdById) &&
        Objects.equals(this.description, rmAudienceSegmentEntityV1.description) &&
        Objects.equals(this.events, rmAudienceSegmentEntityV1.events) &&
        Objects.equals(this.name, rmAudienceSegmentEntityV1.name) &&
        Objects.equals(this.retailerId, rmAudienceSegmentEntityV1.retailerId) &&
        Objects.equals(this.type, rmAudienceSegmentEntityV1.type) &&
        Objects.equals(this.updatedAt, rmAudienceSegmentEntityV1.updatedAt)&&
        Objects.equals(this.additionalProperties, rmAudienceSegmentEntityV1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, channels, contactList, createdAt, createdById, description, events, name, retailerId, type, updatedAt, additionalProperties);
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
    sb.append("class RmAudienceSegmentEntityV1 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("channels");
    openapiFields.add("contactList");
    openapiFields.add("createdAt");
    openapiFields.add("createdById");
    openapiFields.add("description");
    openapiFields.add("events");
    openapiFields.add("name");
    openapiFields.add("retailerId");
    openapiFields.add("type");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RmAudienceSegmentEntityV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RmAudienceSegmentEntityV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmAudienceSegmentEntityV1 is not found in the empty JSON string", RmAudienceSegmentEntityV1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string but got `%s`", jsonObj.get("channels").toString()));
      }
      // validate the optional field `contactList`
      if (jsonObj.get("contactList") != null && !jsonObj.get("contactList").isJsonNull()) {
        RmContactListV1.validateJsonObject(jsonObj.getAsJsonObject("contactList"));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `events`
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull()) {
        RmEventsV1.validateJsonObject(jsonObj.getAsJsonObject("events"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("retailerId") != null && !jsonObj.get("retailerId").isJsonNull()) && !jsonObj.get("retailerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerId").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmAudienceSegmentEntityV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmAudienceSegmentEntityV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmAudienceSegmentEntityV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmAudienceSegmentEntityV1.class));

       return (TypeAdapter<T>) new TypeAdapter<RmAudienceSegmentEntityV1>() {
           @Override
           public void write(JsonWriter out, RmAudienceSegmentEntityV1 value) throws IOException {
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
           public RmAudienceSegmentEntityV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RmAudienceSegmentEntityV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RmAudienceSegmentEntityV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmAudienceSegmentEntityV1
  * @throws IOException if the JSON string is invalid with respect to RmAudienceSegmentEntityV1
  */
  public static RmAudienceSegmentEntityV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmAudienceSegmentEntityV1.class);
  }

 /**
  * Convert an instance of RmAudienceSegmentEntityV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

