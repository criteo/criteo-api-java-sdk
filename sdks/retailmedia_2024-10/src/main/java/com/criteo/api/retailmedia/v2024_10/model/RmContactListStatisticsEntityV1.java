/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_10.model;

import java.util.Objects;
import java.util.Arrays;
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

import com.criteo.api.retailmedia.v2024_10.JSON;

/**
 * Contact list statistics.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RmContactListStatisticsEntityV1 {
  public static final String SERIALIZED_NAME_NUMBER_OF_IDENTIFIERS = "numberOfIdentifiers";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_IDENTIFIERS)
  private Integer numberOfIdentifiers;

  public static final String SERIALIZED_NAME_NUMBER_OF_MATCHES = "numberOfMatches";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MATCHES)
  private Integer numberOfMatches;

  public static final String SERIALIZED_NAME_MATCH_RATE = "matchRate";
  @SerializedName(SERIALIZED_NAME_MATCH_RATE)
  private Double matchRate;

  public RmContactListStatisticsEntityV1() {
  }

  public RmContactListStatisticsEntityV1 numberOfIdentifiers(Integer numberOfIdentifiers) {
    
    this.numberOfIdentifiers = numberOfIdentifiers;
    return this;
  }

   /**
   * Number of identifiers in the contact list.
   * @return numberOfIdentifiers
  **/
  @javax.annotation.Nullable

  public Integer getNumberOfIdentifiers() {
    return numberOfIdentifiers;
  }


  public void setNumberOfIdentifiers(Integer numberOfIdentifiers) {
    this.numberOfIdentifiers = numberOfIdentifiers;
  }


  public RmContactListStatisticsEntityV1 numberOfMatches(Integer numberOfMatches) {
    
    this.numberOfMatches = numberOfMatches;
    return this;
  }

   /**
   * Number of matched identifiers in the contact list.
   * @return numberOfMatches
  **/
  @javax.annotation.Nullable

  public Integer getNumberOfMatches() {
    return numberOfMatches;
  }


  public void setNumberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
  }


  public RmContactListStatisticsEntityV1 matchRate(Double matchRate) {
    
    this.matchRate = matchRate;
    return this;
  }

   /**
   * Percentage of matched identifiers in the contact list.  Can differ from matches/identifiers depending on the contact list type.
   * @return matchRate
  **/
  @javax.annotation.Nullable

  public Double getMatchRate() {
    return matchRate;
  }


  public void setMatchRate(Double matchRate) {
    this.matchRate = matchRate;
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
   * @return the RmContactListStatisticsEntityV1 instance itself
   */
  public RmContactListStatisticsEntityV1 putAdditionalProperty(String key, Object value) {
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
    RmContactListStatisticsEntityV1 rmContactListStatisticsEntityV1 = (RmContactListStatisticsEntityV1) o;
    return Objects.equals(this.numberOfIdentifiers, rmContactListStatisticsEntityV1.numberOfIdentifiers) &&
        Objects.equals(this.numberOfMatches, rmContactListStatisticsEntityV1.numberOfMatches) &&
        Objects.equals(this.matchRate, rmContactListStatisticsEntityV1.matchRate)&&
        Objects.equals(this.additionalProperties, rmContactListStatisticsEntityV1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfIdentifiers, numberOfMatches, matchRate, additionalProperties);
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
    sb.append("class RmContactListStatisticsEntityV1 {\n");
    sb.append("    numberOfIdentifiers: ").append(toIndentedString(numberOfIdentifiers)).append("\n");
    sb.append("    numberOfMatches: ").append(toIndentedString(numberOfMatches)).append("\n");
    sb.append("    matchRate: ").append(toIndentedString(matchRate)).append("\n");
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
    openapiFields.add("numberOfIdentifiers");
    openapiFields.add("numberOfMatches");
    openapiFields.add("matchRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RmContactListStatisticsEntityV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RmContactListStatisticsEntityV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmContactListStatisticsEntityV1 is not found in the empty JSON string", RmContactListStatisticsEntityV1.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmContactListStatisticsEntityV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmContactListStatisticsEntityV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmContactListStatisticsEntityV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmContactListStatisticsEntityV1.class));

       return (TypeAdapter<T>) new TypeAdapter<RmContactListStatisticsEntityV1>() {
           @Override
           public void write(JsonWriter out, RmContactListStatisticsEntityV1 value) throws IOException {
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
           public RmContactListStatisticsEntityV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RmContactListStatisticsEntityV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RmContactListStatisticsEntityV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmContactListStatisticsEntityV1
  * @throws IOException if the JSON string is invalid with respect to RmContactListStatisticsEntityV1
  */
  public static RmContactListStatisticsEntityV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmContactListStatisticsEntityV1.class);
  }

 /**
  * Convert an instance of RmContactListStatisticsEntityV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

