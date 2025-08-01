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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * An object that represents the available options to set when creating a Retail Media Balance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBalanceV2 {
  public static final String SERIALIZED_NAME_DEPOSITED = "deposited";
  @SerializedName(SERIALIZED_NAME_DEPOSITED)
  private BigDecimal deposited;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PO_NUMBER = "poNumber";
  @SerializedName(SERIALIZED_NAME_PO_NUMBER)
  private String poNumber;

  /**
   * Type of the balance spend.
   */
  @JsonAdapter(SpendTypeEnum.Adapter.class)
  public enum SpendTypeEnum {
    ONSITE("Onsite"),
    
    OFFSITE("Offsite"),
    
    OFFSITEAWARENESS("OffsiteAwareness");

    private String value;

    SpendTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendTypeEnum fromValue(String value) {
      for (SpendTypeEnum b : SpendTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpendTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_TYPE = "spendType";
  @SerializedName(SERIALIZED_NAME_SPEND_TYPE)
  private SpendTypeEnum spendType;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public CreateBalanceV2() {
  }

  public CreateBalanceV2 deposited(BigDecimal deposited) {
    
    this.deposited = deposited;
    return this;
  }

   /**
   * Amount of billable funds allotted to the balance.
   * @return deposited
  **/
  @javax.annotation.Nullable

  public BigDecimal getDeposited() {
    return deposited;
  }


  public void setDeposited(BigDecimal deposited) {
    this.deposited = deposited;
  }


  public CreateBalanceV2 endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the balance in the format YYYY-MM-DD.
   * @return endDate
  **/
  @javax.annotation.Nullable

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreateBalanceV2 memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Memo
   * @return memo
  **/
  @javax.annotation.Nullable

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public CreateBalanceV2 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the balance.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateBalanceV2 poNumber(String poNumber) {
    
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Purchase Order number.
   * @return poNumber
  **/
  @javax.annotation.Nullable

  public String getPoNumber() {
    return poNumber;
  }


  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }


  public CreateBalanceV2 spendType(SpendTypeEnum spendType) {
    
    this.spendType = spendType;
    return this;
  }

   /**
   * Type of the balance spend.
   * @return spendType
  **/
  @javax.annotation.Nonnull

  public SpendTypeEnum getSpendType() {
    return spendType;
  }


  public void setSpendType(SpendTypeEnum spendType) {
    this.spendType = spendType;
  }


  public CreateBalanceV2 startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the balance in the format YYYY-MM-DD.
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
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
   * @return the CreateBalanceV2 instance itself
   */
  public CreateBalanceV2 putAdditionalProperty(String key, Object value) {
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
    CreateBalanceV2 createBalanceV2 = (CreateBalanceV2) o;
    return Objects.equals(this.deposited, createBalanceV2.deposited) &&
        Objects.equals(this.endDate, createBalanceV2.endDate) &&
        Objects.equals(this.memo, createBalanceV2.memo) &&
        Objects.equals(this.name, createBalanceV2.name) &&
        Objects.equals(this.poNumber, createBalanceV2.poNumber) &&
        Objects.equals(this.spendType, createBalanceV2.spendType) &&
        Objects.equals(this.startDate, createBalanceV2.startDate)&&
        Objects.equals(this.additionalProperties, createBalanceV2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deposited, endDate, memo, name, poNumber, spendType, startDate, additionalProperties);
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
    sb.append("class CreateBalanceV2 {\n");
    sb.append("    deposited: ").append(toIndentedString(deposited)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    spendType: ").append(toIndentedString(spendType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("deposited");
    openapiFields.add("endDate");
    openapiFields.add("memo");
    openapiFields.add("name");
    openapiFields.add("poNumber");
    openapiFields.add("spendType");
    openapiFields.add("startDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("spendType");
    openapiRequiredFields.add("startDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateBalanceV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateBalanceV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBalanceV2 is not found in the empty JSON string", CreateBalanceV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBalanceV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("poNumber") != null && !jsonObj.get("poNumber").isJsonNull()) && !jsonObj.get("poNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poNumber").toString()));
      }
      if (!jsonObj.get("spendType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spendType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spendType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBalanceV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBalanceV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBalanceV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBalanceV2.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBalanceV2>() {
           @Override
           public void write(JsonWriter out, CreateBalanceV2 value) throws IOException {
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
           public CreateBalanceV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateBalanceV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateBalanceV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBalanceV2
  * @throws IOException if the JSON string is invalid with respect to CreateBalanceV2
  */
  public static CreateBalanceV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBalanceV2.class);
  }

 /**
  * Convert an instance of CreateBalanceV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

