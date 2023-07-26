/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * An object that represents the available options to set when creating a Retail Media Balance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalCreateBalance {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PO_NUMBER = "poNumber";
  @SerializedName(SERIALIZED_NAME_PO_NUMBER)
  private String poNumber;

  public static final String SERIALIZED_NAME_DEPOSITED = "deposited";
  @SerializedName(SERIALIZED_NAME_DEPOSITED)
  private BigDecimal deposited;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * Type of the balance spend.
   */
  @JsonAdapter(SpendTypeEnum.Adapter.class)
  public enum SpendTypeEnum {
    ONSITE("Onsite"),
    
    OFFSITE("Offsite");

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

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_SALES_FORCE_ID = "salesForceId";
  @SerializedName(SERIALIZED_NAME_SALES_FORCE_ID)
  private String salesForceId;

  public ExternalCreateBalance() {
  }

  public ExternalCreateBalance name(String name) {
    
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


  public ExternalCreateBalance poNumber(String poNumber) {
    
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


  public ExternalCreateBalance deposited(BigDecimal deposited) {
    
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


  public ExternalCreateBalance startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ExternalCreateBalance endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalCreateBalance spendType(SpendTypeEnum spendType) {
    
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


  public ExternalCreateBalance memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Memo
   * @return memo
  **/
  @javax.annotation.Nonnull

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public ExternalCreateBalance salesForceId(String salesForceId) {
    
    this.salesForceId = salesForceId;
    return this;
  }

   /**
   * SalesForceId the balance is linked to.
   * @return salesForceId
  **/
  @javax.annotation.Nonnull

  public String getSalesForceId() {
    return salesForceId;
  }


  public void setSalesForceId(String salesForceId) {
    this.salesForceId = salesForceId;
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
   * @return the ExternalCreateBalance instance itself
   */
  public ExternalCreateBalance putAdditionalProperty(String key, Object value) {
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
    ExternalCreateBalance externalCreateBalance = (ExternalCreateBalance) o;
    return Objects.equals(this.name, externalCreateBalance.name) &&
        Objects.equals(this.poNumber, externalCreateBalance.poNumber) &&
        Objects.equals(this.deposited, externalCreateBalance.deposited) &&
        Objects.equals(this.startDate, externalCreateBalance.startDate) &&
        Objects.equals(this.endDate, externalCreateBalance.endDate) &&
        Objects.equals(this.spendType, externalCreateBalance.spendType) &&
        Objects.equals(this.memo, externalCreateBalance.memo) &&
        Objects.equals(this.salesForceId, externalCreateBalance.salesForceId)&&
        Objects.equals(this.additionalProperties, externalCreateBalance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, poNumber, deposited, startDate, endDate, spendType, memo, salesForceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalCreateBalance {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    deposited: ").append(toIndentedString(deposited)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    spendType: ").append(toIndentedString(spendType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    salesForceId: ").append(toIndentedString(salesForceId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("poNumber");
    openapiFields.add("deposited");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("spendType");
    openapiFields.add("memo");
    openapiFields.add("salesForceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("deposited");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("spendType");
    openapiRequiredFields.add("memo");
    openapiRequiredFields.add("salesForceId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalCreateBalance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalCreateBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalCreateBalance is not found in the empty JSON string", ExternalCreateBalance.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalCreateBalance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
      if (!jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (!jsonObj.get("salesForceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesForceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salesForceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalCreateBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalCreateBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalCreateBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalCreateBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalCreateBalance>() {
           @Override
           public void write(JsonWriter out, ExternalCreateBalance value) throws IOException {
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
           public ExternalCreateBalance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalCreateBalance instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalCreateBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalCreateBalance
  * @throws IOException if the JSON string is invalid with respect to ExternalCreateBalance
  */
  public static ExternalCreateBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalCreateBalance.class);
  }

 /**
  * Convert an instance of ExternalCreateBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

