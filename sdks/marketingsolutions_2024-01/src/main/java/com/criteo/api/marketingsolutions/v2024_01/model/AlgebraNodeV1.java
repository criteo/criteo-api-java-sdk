/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_01.model;

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

import com.criteo.api.marketingsolutions.v2024_01.JSON;

/**
 * Node in the audience algebra definition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlgebraNodeV1 {
  public static final String SERIALIZED_NAME_AND = "and";
  @SerializedName(SERIALIZED_NAME_AND)
  private List<AlgebraNodeV1> and = null;

  public static final String SERIALIZED_NAME_AUDIENCE_SEGMENT_ID = "audienceSegmentId";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_SEGMENT_ID)
  private String audienceSegmentId;

  public static final String SERIALIZED_NAME_NOT = "not";
  @SerializedName(SERIALIZED_NAME_NOT)
  private AlgebraNodeV1 not;

  public static final String SERIALIZED_NAME_OR = "or";
  @SerializedName(SERIALIZED_NAME_OR)
  private List<AlgebraNodeV1> or = null;

  public AlgebraNodeV1() {
  }

  public AlgebraNodeV1 and(List<AlgebraNodeV1> and) {
    
    this.and = and;
    return this;
  }

  public AlgebraNodeV1 addAndItem(AlgebraNodeV1 andItem) {
    if (this.and == null) {
      this.and = null;
    }
    this.and.add(andItem);
    return this;
  }

   /**
   * Get and
   * @return and
  **/
  @javax.annotation.Nullable

  public List<AlgebraNodeV1> getAnd() {
    return and;
  }


  public void setAnd(List<AlgebraNodeV1> and) {
    this.and = and;
  }


  public AlgebraNodeV1 audienceSegmentId(String audienceSegmentId) {
    
    this.audienceSegmentId = audienceSegmentId;
    return this;
  }

   /**
   * Get audienceSegmentId
   * @return audienceSegmentId
  **/
  @javax.annotation.Nullable

  public String getAudienceSegmentId() {
    return audienceSegmentId;
  }


  public void setAudienceSegmentId(String audienceSegmentId) {
    this.audienceSegmentId = audienceSegmentId;
  }


  public AlgebraNodeV1 not(AlgebraNodeV1 not) {
    
    this.not = not;
    return this;
  }

   /**
   * Get not
   * @return not
  **/
  @javax.annotation.Nullable

  public AlgebraNodeV1 getNot() {
    return not;
  }


  public void setNot(AlgebraNodeV1 not) {
    this.not = not;
  }


  public AlgebraNodeV1 or(List<AlgebraNodeV1> or) {
    
    this.or = or;
    return this;
  }

  public AlgebraNodeV1 addOrItem(AlgebraNodeV1 orItem) {
    if (this.or == null) {
      this.or = null;
    }
    this.or.add(orItem);
    return this;
  }

   /**
   * Get or
   * @return or
  **/
  @javax.annotation.Nullable

  public List<AlgebraNodeV1> getOr() {
    return or;
  }


  public void setOr(List<AlgebraNodeV1> or) {
    this.or = or;
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
   * @return the AlgebraNodeV1 instance itself
   */
  public AlgebraNodeV1 putAdditionalProperty(String key, Object value) {
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
    AlgebraNodeV1 algebraNodeV1 = (AlgebraNodeV1) o;
    return Objects.equals(this.and, algebraNodeV1.and) &&
        Objects.equals(this.audienceSegmentId, algebraNodeV1.audienceSegmentId) &&
        Objects.equals(this.not, algebraNodeV1.not) &&
        Objects.equals(this.or, algebraNodeV1.or)&&
        Objects.equals(this.additionalProperties, algebraNodeV1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(and, audienceSegmentId, not, or, additionalProperties);
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
    sb.append("class AlgebraNodeV1 {\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    audienceSegmentId: ").append(toIndentedString(audienceSegmentId)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
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
    openapiFields.add("and");
    openapiFields.add("audienceSegmentId");
    openapiFields.add("not");
    openapiFields.add("or");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlgebraNodeV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AlgebraNodeV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlgebraNodeV1 is not found in the empty JSON string", AlgebraNodeV1.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("and") != null && !jsonObj.get("and").isJsonNull()) {
        JsonArray jsonArrayand = jsonObj.getAsJsonArray("and");
        if (jsonArrayand != null) {
          // ensure the json data is an array
          if (!jsonObj.get("and").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `and` to be an array in the JSON string but got `%s`", jsonObj.get("and").toString()));
          }

          // validate the optional field `and` (array)
          for (int i = 0; i < jsonArrayand.size(); i++) {
            AlgebraNodeV1.validateJsonObject(jsonArrayand.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("audienceSegmentId") != null && !jsonObj.get("audienceSegmentId").isJsonNull()) && !jsonObj.get("audienceSegmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audienceSegmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audienceSegmentId").toString()));
      }
      // validate the optional field `not`
      if (jsonObj.get("not") != null && !jsonObj.get("not").isJsonNull()) {
        AlgebraNodeV1.validateJsonObject(jsonObj.getAsJsonObject("not"));
      }
      if (jsonObj.get("or") != null && !jsonObj.get("or").isJsonNull()) {
        JsonArray jsonArrayor = jsonObj.getAsJsonArray("or");
        if (jsonArrayor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("or").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `or` to be an array in the JSON string but got `%s`", jsonObj.get("or").toString()));
          }

          // validate the optional field `or` (array)
          for (int i = 0; i < jsonArrayor.size(); i++) {
            AlgebraNodeV1.validateJsonObject(jsonArrayor.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlgebraNodeV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlgebraNodeV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlgebraNodeV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlgebraNodeV1.class));

       return (TypeAdapter<T>) new TypeAdapter<AlgebraNodeV1>() {
           @Override
           public void write(JsonWriter out, AlgebraNodeV1 value) throws IOException {
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
           public AlgebraNodeV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlgebraNodeV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlgebraNodeV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlgebraNodeV1
  * @throws IOException if the JSON string is invalid with respect to AlgebraNodeV1
  */
  public static AlgebraNodeV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlgebraNodeV1.class);
  }

 /**
  * Convert an instance of AlgebraNodeV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

