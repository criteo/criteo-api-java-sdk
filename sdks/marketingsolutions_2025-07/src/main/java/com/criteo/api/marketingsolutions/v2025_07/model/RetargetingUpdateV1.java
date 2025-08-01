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
 * Settings to target users based on its type and days since last visit.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingUpdateV1 {
  public static final String SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MAX = "daysSinceLastVisitMax";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MAX)
  private Integer daysSinceLastVisitMax;

  public static final String SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MIN = "daysSinceLastVisitMin";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MIN)
  private Integer daysSinceLastVisitMin;

  /**
   * Types of visitors.
   */
  @JsonAdapter(VisitorsTypeEnum.Adapter.class)
  public enum VisitorsTypeEnum {
    ALL("All"),
    
    BUYERS("Buyers"),
    
    NONBUYERS("NonBuyers");

    private String value;

    VisitorsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisitorsTypeEnum fromValue(String value) {
      for (VisitorsTypeEnum b : VisitorsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisitorsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisitorsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisitorsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisitorsTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISITORS_TYPE = "visitorsType";
  @SerializedName(SERIALIZED_NAME_VISITORS_TYPE)
  private VisitorsTypeEnum visitorsType;

  public RetargetingUpdateV1() {
  }

  public RetargetingUpdateV1 daysSinceLastVisitMax(Integer daysSinceLastVisitMax) {
    
    this.daysSinceLastVisitMax = daysSinceLastVisitMax;
    return this;
  }

   /**
   * Maximum number of days since last visit to partner.
   * @return daysSinceLastVisitMax
  **/
  @javax.annotation.Nullable

  public Integer getDaysSinceLastVisitMax() {
    return daysSinceLastVisitMax;
  }


  public void setDaysSinceLastVisitMax(Integer daysSinceLastVisitMax) {
    this.daysSinceLastVisitMax = daysSinceLastVisitMax;
  }


  public RetargetingUpdateV1 daysSinceLastVisitMin(Integer daysSinceLastVisitMin) {
    
    this.daysSinceLastVisitMin = daysSinceLastVisitMin;
    return this;
  }

   /**
   * Minimum number of days since last visit to partner.
   * @return daysSinceLastVisitMin
  **/
  @javax.annotation.Nullable

  public Integer getDaysSinceLastVisitMin() {
    return daysSinceLastVisitMin;
  }


  public void setDaysSinceLastVisitMin(Integer daysSinceLastVisitMin) {
    this.daysSinceLastVisitMin = daysSinceLastVisitMin;
  }


  public RetargetingUpdateV1 visitorsType(VisitorsTypeEnum visitorsType) {
    
    this.visitorsType = visitorsType;
    return this;
  }

   /**
   * Types of visitors.
   * @return visitorsType
  **/
  @javax.annotation.Nullable

  public VisitorsTypeEnum getVisitorsType() {
    return visitorsType;
  }


  public void setVisitorsType(VisitorsTypeEnum visitorsType) {
    this.visitorsType = visitorsType;
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
   * @return the RetargetingUpdateV1 instance itself
   */
  public RetargetingUpdateV1 putAdditionalProperty(String key, Object value) {
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
    RetargetingUpdateV1 retargetingUpdateV1 = (RetargetingUpdateV1) o;
    return Objects.equals(this.daysSinceLastVisitMax, retargetingUpdateV1.daysSinceLastVisitMax) &&
        Objects.equals(this.daysSinceLastVisitMin, retargetingUpdateV1.daysSinceLastVisitMin) &&
        Objects.equals(this.visitorsType, retargetingUpdateV1.visitorsType)&&
        Objects.equals(this.additionalProperties, retargetingUpdateV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysSinceLastVisitMax, daysSinceLastVisitMin, visitorsType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingUpdateV1 {\n");
    sb.append("    daysSinceLastVisitMax: ").append(toIndentedString(daysSinceLastVisitMax)).append("\n");
    sb.append("    daysSinceLastVisitMin: ").append(toIndentedString(daysSinceLastVisitMin)).append("\n");
    sb.append("    visitorsType: ").append(toIndentedString(visitorsType)).append("\n");
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
    openapiFields.add("daysSinceLastVisitMax");
    openapiFields.add("daysSinceLastVisitMin");
    openapiFields.add("visitorsType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetargetingUpdateV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetargetingUpdateV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetargetingUpdateV1 is not found in the empty JSON string", RetargetingUpdateV1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("visitorsType") != null && !jsonObj.get("visitorsType").isJsonNull()) && !jsonObj.get("visitorsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visitorsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visitorsType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetargetingUpdateV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetargetingUpdateV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetargetingUpdateV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetargetingUpdateV1.class));

       return (TypeAdapter<T>) new TypeAdapter<RetargetingUpdateV1>() {
           @Override
           public void write(JsonWriter out, RetargetingUpdateV1 value) throws IOException {
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
           public RetargetingUpdateV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetargetingUpdateV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetargetingUpdateV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetargetingUpdateV1
  * @throws IOException if the JSON string is invalid with respect to RetargetingUpdateV1
  */
  public static RetargetingUpdateV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetargetingUpdateV1.class);
  }

 /**
  * Convert an instance of RetargetingUpdateV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

