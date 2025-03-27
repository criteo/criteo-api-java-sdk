/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.NillableDateTime;
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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * ad set schedule read model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadAdSetScheduleV24Q3 {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private NillableDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private NillableDateTime endDate;

  /**
   * Gets or Sets activationStatus
   */
  @JsonAdapter(ActivationStatusEnum.Adapter.class)
  public enum ActivationStatusEnum {
    ON("on"),
    
    OFF("off");

    private String value;

    ActivationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActivationStatusEnum fromValue(String value) {
      for (ActivationStatusEnum b : ActivationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActivationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActivationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActivationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActivationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activationStatus";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private ActivationStatusEnum activationStatus;

  /**
   * Gets or Sets deliveryStatus
   */
  @JsonAdapter(DeliveryStatusEnum.Adapter.class)
  public enum DeliveryStatusEnum {
    DRAFT("draft"),
    
    INACTIVE("inactive"),
    
    LIVE("live"),
    
    NOTLIVE("notLive"),
    
    PAUSING("pausing"),
    
    PAUSED("paused"),
    
    SCHEDULED("scheduled"),
    
    ENDED("ended"),
    
    NOTDELIVERING("notDelivering"),
    
    ARCHIVED("archived");

    private String value;

    DeliveryStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryStatusEnum fromValue(String value) {
      for (DeliveryStatusEnum b : DeliveryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private DeliveryStatusEnum deliveryStatus;

  public ReadAdSetScheduleV24Q3() {
  }

  public ReadAdSetScheduleV24Q3 startDate(NillableDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable

  public NillableDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(NillableDateTime startDate) {
    this.startDate = startDate;
  }


  public ReadAdSetScheduleV24Q3 endDate(NillableDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable

  public NillableDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(NillableDateTime endDate) {
    this.endDate = endDate;
  }


  public ReadAdSetScheduleV24Q3 activationStatus(ActivationStatusEnum activationStatus) {
    
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * Get activationStatus
   * @return activationStatus
  **/
  @javax.annotation.Nullable

  public ActivationStatusEnum getActivationStatus() {
    return activationStatus;
  }


  public void setActivationStatus(ActivationStatusEnum activationStatus) {
    this.activationStatus = activationStatus;
  }


  public ReadAdSetScheduleV24Q3 deliveryStatus(DeliveryStatusEnum deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable

  public DeliveryStatusEnum getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
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
   * @return the ReadAdSetScheduleV24Q3 instance itself
   */
  public ReadAdSetScheduleV24Q3 putAdditionalProperty(String key, Object value) {
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
    ReadAdSetScheduleV24Q3 readAdSetScheduleV24Q3 = (ReadAdSetScheduleV24Q3) o;
    return Objects.equals(this.startDate, readAdSetScheduleV24Q3.startDate) &&
        Objects.equals(this.endDate, readAdSetScheduleV24Q3.endDate) &&
        Objects.equals(this.activationStatus, readAdSetScheduleV24Q3.activationStatus) &&
        Objects.equals(this.deliveryStatus, readAdSetScheduleV24Q3.deliveryStatus)&&
        Objects.equals(this.additionalProperties, readAdSetScheduleV24Q3.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, activationStatus, deliveryStatus, additionalProperties);
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
    sb.append("class ReadAdSetScheduleV24Q3 {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("activationStatus");
    openapiFields.add("deliveryStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadAdSetScheduleV24Q3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadAdSetScheduleV24Q3.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadAdSetScheduleV24Q3 is not found in the empty JSON string", ReadAdSetScheduleV24Q3.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `startDate`
      if (jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) {
        NillableDateTime.validateJsonObject(jsonObj.getAsJsonObject("startDate"));
      }
      // validate the optional field `endDate`
      if (jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) {
        NillableDateTime.validateJsonObject(jsonObj.getAsJsonObject("endDate"));
      }
      if ((jsonObj.get("activationStatus") != null && !jsonObj.get("activationStatus").isJsonNull()) && !jsonObj.get("activationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activationStatus").toString()));
      }
      if ((jsonObj.get("deliveryStatus") != null && !jsonObj.get("deliveryStatus").isJsonNull()) && !jsonObj.get("deliveryStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadAdSetScheduleV24Q3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadAdSetScheduleV24Q3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadAdSetScheduleV24Q3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadAdSetScheduleV24Q3.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadAdSetScheduleV24Q3>() {
           @Override
           public void write(JsonWriter out, ReadAdSetScheduleV24Q3 value) throws IOException {
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
           public ReadAdSetScheduleV24Q3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReadAdSetScheduleV24Q3 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReadAdSetScheduleV24Q3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadAdSetScheduleV24Q3
  * @throws IOException if the JSON string is invalid with respect to ReadAdSetScheduleV24Q3
  */
  public static ReadAdSetScheduleV24Q3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadAdSetScheduleV24Q3.class);
  }

 /**
  * Convert an instance of ReadAdSetScheduleV24Q3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

