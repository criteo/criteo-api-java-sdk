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
 * Available filters to perform a search on audience segments. If present, the filters are AND&#39;ed together when applied.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceSegmentSearchEntityV1 {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = null;

  public static final String SERIALIZED_NAME_AUDIENCE_SEGMENT_IDS = "audienceSegmentIds";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_SEGMENT_IDS)
  private List<String> audienceSegmentIds = null;

  /**
   * Gets or Sets audienceSegmentTypes
   */
  @JsonAdapter(AudienceSegmentTypesEnum.Adapter.class)
  public enum AudienceSegmentTypesEnum {
    UNKNOWN("Unknown"),
    
    INMARKET("InMarket"),
    
    PROSPECTING("Prospecting"),
    
    CONTACTLIST("ContactList"),
    
    LOCATION("Location"),
    
    BEHAVIORAL("Behavioral"),
    
    RETARGETING("Retargeting"),
    
    LOOKALIKE("Lookalike");

    private String value;

    AudienceSegmentTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AudienceSegmentTypesEnum fromValue(String value) {
      for (AudienceSegmentTypesEnum b : AudienceSegmentTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AudienceSegmentTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AudienceSegmentTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AudienceSegmentTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AudienceSegmentTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUDIENCE_SEGMENT_TYPES = "audienceSegmentTypes";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_SEGMENT_TYPES)
  private List<AudienceSegmentTypesEnum> audienceSegmentTypes = null;

  public AudienceSegmentSearchEntityV1() {
  }

  public AudienceSegmentSearchEntityV1 advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AudienceSegmentSearchEntityV1 addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * List of advertiser ids
   * @return advertiserIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AudienceSegmentSearchEntityV1 audienceSegmentIds(List<String> audienceSegmentIds) {
    
    this.audienceSegmentIds = audienceSegmentIds;
    return this;
  }

  public AudienceSegmentSearchEntityV1 addAudienceSegmentIdsItem(String audienceSegmentIdsItem) {
    if (this.audienceSegmentIds == null) {
      this.audienceSegmentIds = new ArrayList<>();
    }
    this.audienceSegmentIds.add(audienceSegmentIdsItem);
    return this;
  }

   /**
   * List of segment ids
   * @return audienceSegmentIds
  **/
  @javax.annotation.Nullable

  public List<String> getAudienceSegmentIds() {
    return audienceSegmentIds;
  }


  public void setAudienceSegmentIds(List<String> audienceSegmentIds) {
    this.audienceSegmentIds = audienceSegmentIds;
  }


  public AudienceSegmentSearchEntityV1 audienceSegmentTypes(List<AudienceSegmentTypesEnum> audienceSegmentTypes) {
    
    this.audienceSegmentTypes = audienceSegmentTypes;
    return this;
  }

  public AudienceSegmentSearchEntityV1 addAudienceSegmentTypesItem(AudienceSegmentTypesEnum audienceSegmentTypesItem) {
    if (this.audienceSegmentTypes == null) {
      this.audienceSegmentTypes = new ArrayList<>();
    }
    this.audienceSegmentTypes.add(audienceSegmentTypesItem);
    return this;
  }

   /**
   * List of segment types
   * @return audienceSegmentTypes
  **/
  @javax.annotation.Nullable

  public List<AudienceSegmentTypesEnum> getAudienceSegmentTypes() {
    return audienceSegmentTypes;
  }


  public void setAudienceSegmentTypes(List<AudienceSegmentTypesEnum> audienceSegmentTypes) {
    this.audienceSegmentTypes = audienceSegmentTypes;
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
   * @return the AudienceSegmentSearchEntityV1 instance itself
   */
  public AudienceSegmentSearchEntityV1 putAdditionalProperty(String key, Object value) {
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
    AudienceSegmentSearchEntityV1 audienceSegmentSearchEntityV1 = (AudienceSegmentSearchEntityV1) o;
    return Objects.equals(this.advertiserIds, audienceSegmentSearchEntityV1.advertiserIds) &&
        Objects.equals(this.audienceSegmentIds, audienceSegmentSearchEntityV1.audienceSegmentIds) &&
        Objects.equals(this.audienceSegmentTypes, audienceSegmentSearchEntityV1.audienceSegmentTypes)&&
        Objects.equals(this.additionalProperties, audienceSegmentSearchEntityV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, audienceSegmentIds, audienceSegmentTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSegmentSearchEntityV1 {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    audienceSegmentIds: ").append(toIndentedString(audienceSegmentIds)).append("\n");
    sb.append("    audienceSegmentTypes: ").append(toIndentedString(audienceSegmentTypes)).append("\n");
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
    openapiFields.add("advertiserIds");
    openapiFields.add("audienceSegmentIds");
    openapiFields.add("audienceSegmentTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudienceSegmentSearchEntityV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudienceSegmentSearchEntityV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudienceSegmentSearchEntityV1 is not found in the empty JSON string", AudienceSegmentSearchEntityV1.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("advertiserIds") != null && !jsonObj.get("advertiserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserIds` to be an array in the JSON string but got `%s`", jsonObj.get("advertiserIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audienceSegmentIds") != null && !jsonObj.get("audienceSegmentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audienceSegmentIds` to be an array in the JSON string but got `%s`", jsonObj.get("audienceSegmentIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audienceSegmentTypes") != null && !jsonObj.get("audienceSegmentTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audienceSegmentTypes` to be an array in the JSON string but got `%s`", jsonObj.get("audienceSegmentTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudienceSegmentSearchEntityV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudienceSegmentSearchEntityV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudienceSegmentSearchEntityV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudienceSegmentSearchEntityV1.class));

       return (TypeAdapter<T>) new TypeAdapter<AudienceSegmentSearchEntityV1>() {
           @Override
           public void write(JsonWriter out, AudienceSegmentSearchEntityV1 value) throws IOException {
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
           public AudienceSegmentSearchEntityV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudienceSegmentSearchEntityV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudienceSegmentSearchEntityV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudienceSegmentSearchEntityV1
  * @throws IOException if the JSON string is invalid with respect to AudienceSegmentSearchEntityV1
  */
  public static AudienceSegmentSearchEntityV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudienceSegmentSearchEntityV1.class);
  }

 /**
  * Convert an instance of AudienceSegmentSearchEntityV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

