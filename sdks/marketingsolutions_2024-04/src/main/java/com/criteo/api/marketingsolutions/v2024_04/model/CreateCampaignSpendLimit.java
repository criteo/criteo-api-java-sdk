/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_04.model;

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

import com.criteo.api.marketingsolutions.v2024_04.JSON;

/**
 * campaign spend limit create model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCampaignSpendLimit {
  /**
   * Whether your spend limit is capped or not
   */
  @JsonAdapter(SpendLimitTypeEnum.Adapter.class)
  public enum SpendLimitTypeEnum {
    CAPPED("capped"),
    
    UNCAPPED("uncapped");

    private String value;

    SpendLimitTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendLimitTypeEnum fromValue(String value) {
      for (SpendLimitTypeEnum b : SpendLimitTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpendLimitTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendLimitTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendLimitTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendLimitTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_LIMIT_TYPE = "spendLimitType";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_TYPE)
  private SpendLimitTypeEnum spendLimitType;

  /**
   * The pace of the spend limit renewal
   */
  @JsonAdapter(SpendLimitRenewalEnum.Adapter.class)
  public enum SpendLimitRenewalEnum {
    UNDEFINED("undefined"),
    
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    LIFETIME("lifetime");

    private String value;

    SpendLimitRenewalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendLimitRenewalEnum fromValue(String value) {
      for (SpendLimitRenewalEnum b : SpendLimitRenewalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpendLimitRenewalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendLimitRenewalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendLimitRenewalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendLimitRenewalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_LIMIT_RENEWAL = "spendLimitRenewal";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_RENEWAL)
  private SpendLimitRenewalEnum spendLimitRenewal;

  public static final String SERIALIZED_NAME_SPEND_LIMIT_AMOUNT = "spendLimitAmount";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_AMOUNT)
  private Double spendLimitAmount;

  public CreateCampaignSpendLimit() {
  }

  public CreateCampaignSpendLimit spendLimitType(SpendLimitTypeEnum spendLimitType) {
    
    this.spendLimitType = spendLimitType;
    return this;
  }

   /**
   * Whether your spend limit is capped or not
   * @return spendLimitType
  **/
  @javax.annotation.Nonnull

  public SpendLimitTypeEnum getSpendLimitType() {
    return spendLimitType;
  }


  public void setSpendLimitType(SpendLimitTypeEnum spendLimitType) {
    this.spendLimitType = spendLimitType;
  }


  public CreateCampaignSpendLimit spendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    
    this.spendLimitRenewal = spendLimitRenewal;
    return this;
  }

   /**
   * The pace of the spend limit renewal
   * @return spendLimitRenewal
  **/
  @javax.annotation.Nullable

  public SpendLimitRenewalEnum getSpendLimitRenewal() {
    return spendLimitRenewal;
  }


  public void setSpendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    this.spendLimitRenewal = spendLimitRenewal;
  }


  public CreateCampaignSpendLimit spendLimitAmount(Double spendLimitAmount) {
    
    this.spendLimitAmount = spendLimitAmount;
    return this;
  }

   /**
   * The amount of the spend limit. null if spendLimitType is uncapped.
   * @return spendLimitAmount
  **/
  @javax.annotation.Nullable

  public Double getSpendLimitAmount() {
    return spendLimitAmount;
  }


  public void setSpendLimitAmount(Double spendLimitAmount) {
    this.spendLimitAmount = spendLimitAmount;
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
   * @return the CreateCampaignSpendLimit instance itself
   */
  public CreateCampaignSpendLimit putAdditionalProperty(String key, Object value) {
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
    CreateCampaignSpendLimit createCampaignSpendLimit = (CreateCampaignSpendLimit) o;
    return Objects.equals(this.spendLimitType, createCampaignSpendLimit.spendLimitType) &&
        Objects.equals(this.spendLimitRenewal, createCampaignSpendLimit.spendLimitRenewal) &&
        Objects.equals(this.spendLimitAmount, createCampaignSpendLimit.spendLimitAmount)&&
        Objects.equals(this.additionalProperties, createCampaignSpendLimit.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendLimitType, spendLimitRenewal, spendLimitAmount, additionalProperties);
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
    sb.append("class CreateCampaignSpendLimit {\n");
    sb.append("    spendLimitType: ").append(toIndentedString(spendLimitType)).append("\n");
    sb.append("    spendLimitRenewal: ").append(toIndentedString(spendLimitRenewal)).append("\n");
    sb.append("    spendLimitAmount: ").append(toIndentedString(spendLimitAmount)).append("\n");
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
    openapiFields.add("spendLimitType");
    openapiFields.add("spendLimitRenewal");
    openapiFields.add("spendLimitAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("spendLimitType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCampaignSpendLimit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCampaignSpendLimit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCampaignSpendLimit is not found in the empty JSON string", CreateCampaignSpendLimit.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCampaignSpendLimit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("spendLimitType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spendLimitType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spendLimitType").toString()));
      }
      if ((jsonObj.get("spendLimitRenewal") != null && !jsonObj.get("spendLimitRenewal").isJsonNull()) && !jsonObj.get("spendLimitRenewal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spendLimitRenewal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spendLimitRenewal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCampaignSpendLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCampaignSpendLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCampaignSpendLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCampaignSpendLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCampaignSpendLimit>() {
           @Override
           public void write(JsonWriter out, CreateCampaignSpendLimit value) throws IOException {
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
           public CreateCampaignSpendLimit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateCampaignSpendLimit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateCampaignSpendLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCampaignSpendLimit
  * @throws IOException if the JSON string is invalid with respect to CreateCampaignSpendLimit
  */
  public static CreateCampaignSpendLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCampaignSpendLimit.class);
  }

 /**
  * Convert an instance of CreateCampaignSpendLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
