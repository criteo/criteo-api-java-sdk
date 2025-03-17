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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Settings to target users based on high shopping intents and demographics.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InMarketSizeEstimationV1 {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  /**
   * Gets or Sets buyingPower
   */
  @JsonAdapter(BuyingPowerEnum.Adapter.class)
  public enum BuyingPowerEnum {
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High"),
    
    VERYHIGH("VeryHigh");

    private String value;

    BuyingPowerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BuyingPowerEnum fromValue(String value) {
      for (BuyingPowerEnum b : BuyingPowerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BuyingPowerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BuyingPowerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BuyingPowerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BuyingPowerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUYING_POWER = "buyingPower";
  @SerializedName(SERIALIZED_NAME_BUYING_POWER)
  private Set<BuyingPowerEnum> buyingPower = null;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("Male"),
    
    FEMALE("Female");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_INTEREST_IDS = "interestIds";
  @SerializedName(SERIALIZED_NAME_INTEREST_IDS)
  private Set<String> interestIds = null;

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private Set<String> brandIds = null;

  /**
   * Gets or Sets priceRange
   */
  @JsonAdapter(PriceRangeEnum.Adapter.class)
  public enum PriceRangeEnum {
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High");

    private String value;

    PriceRangeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriceRangeEnum fromValue(String value) {
      for (PriceRangeEnum b : PriceRangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriceRangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriceRangeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriceRangeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriceRangeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRICE_RANGE = "priceRange";
  @SerializedName(SERIALIZED_NAME_PRICE_RANGE)
  private Set<PriceRangeEnum> priceRange = null;

  public InMarketSizeEstimationV1() {
  }

  public InMarketSizeEstimationV1 country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public InMarketSizeEstimationV1 buyingPower(Set<BuyingPowerEnum> buyingPower) {
    
    this.buyingPower = buyingPower;
    return this;
  }

  public InMarketSizeEstimationV1 addBuyingPowerItem(BuyingPowerEnum buyingPowerItem) {
    if (this.buyingPower == null) {
      this.buyingPower = new LinkedHashSet<>();
    }
    this.buyingPower.add(buyingPowerItem);
    return this;
  }

   /**
   * Get buyingPower
   * @return buyingPower
  **/
  @javax.annotation.Nullable

  public Set<BuyingPowerEnum> getBuyingPower() {
    return buyingPower;
  }


  public void setBuyingPower(Set<BuyingPowerEnum> buyingPower) {
    this.buyingPower = buyingPower;
  }


  public InMarketSizeEstimationV1 gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public InMarketSizeEstimationV1 interestIds(Set<String> interestIds) {
    
    this.interestIds = interestIds;
    return this;
  }

  public InMarketSizeEstimationV1 addInterestIdsItem(String interestIdsItem) {
    if (this.interestIds == null) {
      this.interestIds = new LinkedHashSet<>();
    }
    this.interestIds.add(interestIdsItem);
    return this;
  }

   /**
   * Get interestIds
   * @return interestIds
  **/
  @javax.annotation.Nullable

  public Set<String> getInterestIds() {
    return interestIds;
  }


  public void setInterestIds(Set<String> interestIds) {
    this.interestIds = interestIds;
  }


  public InMarketSizeEstimationV1 brandIds(Set<String> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public InMarketSizeEstimationV1 addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new LinkedHashSet<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * Get brandIds
   * @return brandIds
  **/
  @javax.annotation.Nullable

  public Set<String> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(Set<String> brandIds) {
    this.brandIds = brandIds;
  }


  public InMarketSizeEstimationV1 priceRange(Set<PriceRangeEnum> priceRange) {
    
    this.priceRange = priceRange;
    return this;
  }

  public InMarketSizeEstimationV1 addPriceRangeItem(PriceRangeEnum priceRangeItem) {
    if (this.priceRange == null) {
      this.priceRange = new LinkedHashSet<>();
    }
    this.priceRange.add(priceRangeItem);
    return this;
  }

   /**
   * Get priceRange
   * @return priceRange
  **/
  @javax.annotation.Nullable

  public Set<PriceRangeEnum> getPriceRange() {
    return priceRange;
  }


  public void setPriceRange(Set<PriceRangeEnum> priceRange) {
    this.priceRange = priceRange;
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
   * @return the InMarketSizeEstimationV1 instance itself
   */
  public InMarketSizeEstimationV1 putAdditionalProperty(String key, Object value) {
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
    InMarketSizeEstimationV1 inMarketSizeEstimationV1 = (InMarketSizeEstimationV1) o;
    return Objects.equals(this.country, inMarketSizeEstimationV1.country) &&
        Objects.equals(this.buyingPower, inMarketSizeEstimationV1.buyingPower) &&
        Objects.equals(this.gender, inMarketSizeEstimationV1.gender) &&
        Objects.equals(this.interestIds, inMarketSizeEstimationV1.interestIds) &&
        Objects.equals(this.brandIds, inMarketSizeEstimationV1.brandIds) &&
        Objects.equals(this.priceRange, inMarketSizeEstimationV1.priceRange)&&
        Objects.equals(this.additionalProperties, inMarketSizeEstimationV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, buyingPower, gender, interestIds, brandIds, priceRange, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InMarketSizeEstimationV1 {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    buyingPower: ").append(toIndentedString(buyingPower)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestIds: ").append(toIndentedString(interestIds)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    priceRange: ").append(toIndentedString(priceRange)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("buyingPower");
    openapiFields.add("gender");
    openapiFields.add("interestIds");
    openapiFields.add("brandIds");
    openapiFields.add("priceRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InMarketSizeEstimationV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InMarketSizeEstimationV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InMarketSizeEstimationV1 is not found in the empty JSON string", InMarketSizeEstimationV1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InMarketSizeEstimationV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buyingPower") != null && !jsonObj.get("buyingPower").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyingPower` to be an array in the JSON string but got `%s`", jsonObj.get("buyingPower").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("interestIds") != null && !jsonObj.get("interestIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `interestIds` to be an array in the JSON string but got `%s`", jsonObj.get("interestIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("brandIds") != null && !jsonObj.get("brandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandIds` to be an array in the JSON string but got `%s`", jsonObj.get("brandIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("priceRange") != null && !jsonObj.get("priceRange").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceRange` to be an array in the JSON string but got `%s`", jsonObj.get("priceRange").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InMarketSizeEstimationV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InMarketSizeEstimationV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InMarketSizeEstimationV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InMarketSizeEstimationV1.class));

       return (TypeAdapter<T>) new TypeAdapter<InMarketSizeEstimationV1>() {
           @Override
           public void write(JsonWriter out, InMarketSizeEstimationV1 value) throws IOException {
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
           public InMarketSizeEstimationV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InMarketSizeEstimationV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InMarketSizeEstimationV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InMarketSizeEstimationV1
  * @throws IOException if the JSON string is invalid with respect to InMarketSizeEstimationV1
  */
  public static InMarketSizeEstimationV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InMarketSizeEstimationV1.class);
  }

 /**
  * Convert an instance of InMarketSizeEstimationV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

