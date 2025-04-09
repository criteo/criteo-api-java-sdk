/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_01.model;

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
import java.time.OffsetDateTime;

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

import com.criteo.api.retailmedia.v2024_01.JSON;

/**
 * A Retail Media Balance used to determine the funds available for any or all campaigns in an account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalBalanceResponse {
  /**
   * Type of the balance
   */
  @JsonAdapter(BalanceTypeEnum.Adapter.class)
  public enum BalanceTypeEnum {
    UNKNOWN("unknown"),
    
    CAPPED("capped"),
    
    UNCAPPED("uncapped");

    private String value;

    BalanceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BalanceTypeEnum fromValue(String value) {
      for (BalanceTypeEnum b : BalanceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BalanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BalanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BalanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BalanceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BALANCE_TYPE = "balanceType";
  @SerializedName(SERIALIZED_NAME_BALANCE_TYPE)
  private BalanceTypeEnum balanceType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

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
   * Billing type for Private Market.
   */
  @JsonAdapter(PrivateMarketBillingTypeEnum.Adapter.class)
  public enum PrivateMarketBillingTypeEnum {
    NOTAPPLICABLE("notApplicable"),
    
    BILLBYRETAILER("billByRetailer"),
    
    BILLBYCRITEO("billByCriteo"),
    
    UNKNOWN("unknown");

    private String value;

    PrivateMarketBillingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivateMarketBillingTypeEnum fromValue(String value) {
      for (PrivateMarketBillingTypeEnum b : PrivateMarketBillingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivateMarketBillingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivateMarketBillingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivateMarketBillingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivateMarketBillingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIVATE_MARKET_BILLING_TYPE = "privateMarketBillingType";
  @SerializedName(SERIALIZED_NAME_PRIVATE_MARKET_BILLING_TYPE)
  private PrivateMarketBillingTypeEnum privateMarketBillingType;

  public static final String SERIALIZED_NAME_REMAINING = "remaining";
  @SerializedName(SERIALIZED_NAME_REMAINING)
  private BigDecimal remaining;

  public static final String SERIALIZED_NAME_SALES_FORCE_ID = "salesForceId";
  @SerializedName(SERIALIZED_NAME_SALES_FORCE_ID)
  private String salesForceId;

  /**
   * Spend Type of the balance.
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

  public static final String SERIALIZED_NAME_SPENT = "spent";
  @SerializedName(SERIALIZED_NAME_SPENT)
  private BigDecimal spent;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    SCHEDULED("scheduled"),
    
    ACTIVE("active"),
    
    ENDED("ended");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ExternalBalanceResponse() {
  }

  public ExternalBalanceResponse balanceType(BalanceTypeEnum balanceType) {
    
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Type of the balance
   * @return balanceType
  **/
  @javax.annotation.Nonnull

  public BalanceTypeEnum getBalanceType() {
    return balanceType;
  }


  public void setBalanceType(BalanceTypeEnum balanceType) {
    this.balanceType = balanceType;
  }


  public ExternalBalanceResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ExternalBalanceResponse deposited(BigDecimal deposited) {
    
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


  public ExternalBalanceResponse endDate(LocalDate endDate) {
    
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


  public ExternalBalanceResponse memo(String memo) {
    
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


  public ExternalBalanceResponse name(String name) {
    
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


  public ExternalBalanceResponse poNumber(String poNumber) {
    
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Purchase Order number.
   * @return poNumber
  **/
  @javax.annotation.Nonnull

  public String getPoNumber() {
    return poNumber;
  }


  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }


  public ExternalBalanceResponse privateMarketBillingType(PrivateMarketBillingTypeEnum privateMarketBillingType) {
    
    this.privateMarketBillingType = privateMarketBillingType;
    return this;
  }

   /**
   * Billing type for Private Market.
   * @return privateMarketBillingType
  **/
  @javax.annotation.Nonnull

  public PrivateMarketBillingTypeEnum getPrivateMarketBillingType() {
    return privateMarketBillingType;
  }


  public void setPrivateMarketBillingType(PrivateMarketBillingTypeEnum privateMarketBillingType) {
    this.privateMarketBillingType = privateMarketBillingType;
  }


  public ExternalBalanceResponse remaining(BigDecimal remaining) {
    
    this.remaining = remaining;
    return this;
  }

   /**
   * Get remaining
   * @return remaining
  **/
  @javax.annotation.Nullable

  public BigDecimal getRemaining() {
    return remaining;
  }


  public void setRemaining(BigDecimal remaining) {
    this.remaining = remaining;
  }


  public ExternalBalanceResponse salesForceId(String salesForceId) {
    
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


  public ExternalBalanceResponse spendType(SpendTypeEnum spendType) {
    
    this.spendType = spendType;
    return this;
  }

   /**
   * Spend Type of the balance.
   * @return spendType
  **/
  @javax.annotation.Nonnull

  public SpendTypeEnum getSpendType() {
    return spendType;
  }


  public void setSpendType(SpendTypeEnum spendType) {
    this.spendType = spendType;
  }


  public ExternalBalanceResponse spent(BigDecimal spent) {
    
    this.spent = spent;
    return this;
  }

   /**
   * Get spent
   * @return spent
  **/
  @javax.annotation.Nullable

  public BigDecimal getSpent() {
    return spent;
  }


  public void setSpent(BigDecimal spent) {
    this.spent = spent;
  }


  public ExternalBalanceResponse startDate(LocalDate startDate) {
    
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


  public ExternalBalanceResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalBalanceResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull

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
   * @return the ExternalBalanceResponse instance itself
   */
  public ExternalBalanceResponse putAdditionalProperty(String key, Object value) {
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
    ExternalBalanceResponse externalBalanceResponse = (ExternalBalanceResponse) o;
    return Objects.equals(this.balanceType, externalBalanceResponse.balanceType) &&
        Objects.equals(this.createdAt, externalBalanceResponse.createdAt) &&
        Objects.equals(this.deposited, externalBalanceResponse.deposited) &&
        Objects.equals(this.endDate, externalBalanceResponse.endDate) &&
        Objects.equals(this.memo, externalBalanceResponse.memo) &&
        Objects.equals(this.name, externalBalanceResponse.name) &&
        Objects.equals(this.poNumber, externalBalanceResponse.poNumber) &&
        Objects.equals(this.privateMarketBillingType, externalBalanceResponse.privateMarketBillingType) &&
        Objects.equals(this.remaining, externalBalanceResponse.remaining) &&
        Objects.equals(this.salesForceId, externalBalanceResponse.salesForceId) &&
        Objects.equals(this.spendType, externalBalanceResponse.spendType) &&
        Objects.equals(this.spent, externalBalanceResponse.spent) &&
        Objects.equals(this.startDate, externalBalanceResponse.startDate) &&
        Objects.equals(this.status, externalBalanceResponse.status) &&
        Objects.equals(this.updatedAt, externalBalanceResponse.updatedAt)&&
        Objects.equals(this.additionalProperties, externalBalanceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceType, createdAt, deposited, endDate, memo, name, poNumber, privateMarketBillingType, remaining, salesForceId, spendType, spent, startDate, status, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalBalanceResponse {\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deposited: ").append(toIndentedString(deposited)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    privateMarketBillingType: ").append(toIndentedString(privateMarketBillingType)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    salesForceId: ").append(toIndentedString(salesForceId)).append("\n");
    sb.append("    spendType: ").append(toIndentedString(spendType)).append("\n");
    sb.append("    spent: ").append(toIndentedString(spent)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("balanceType");
    openapiFields.add("createdAt");
    openapiFields.add("deposited");
    openapiFields.add("endDate");
    openapiFields.add("memo");
    openapiFields.add("name");
    openapiFields.add("poNumber");
    openapiFields.add("privateMarketBillingType");
    openapiFields.add("remaining");
    openapiFields.add("salesForceId");
    openapiFields.add("spendType");
    openapiFields.add("spent");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("balanceType");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("deposited");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("memo");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("poNumber");
    openapiRequiredFields.add("privateMarketBillingType");
    openapiRequiredFields.add("remaining");
    openapiRequiredFields.add("salesForceId");
    openapiRequiredFields.add("spendType");
    openapiRequiredFields.add("spent");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalBalanceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalBalanceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalBalanceResponse is not found in the empty JSON string", ExternalBalanceResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalBalanceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("balanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceType").toString()));
      }
      if (!jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("poNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poNumber").toString()));
      }
      if (!jsonObj.get("privateMarketBillingType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privateMarketBillingType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privateMarketBillingType").toString()));
      }
      if (!jsonObj.get("salesForceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesForceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salesForceId").toString()));
      }
      if (!jsonObj.get("spendType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spendType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spendType").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalBalanceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalBalanceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalBalanceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalBalanceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalBalanceResponse>() {
           @Override
           public void write(JsonWriter out, ExternalBalanceResponse value) throws IOException {
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
           public ExternalBalanceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalBalanceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalBalanceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalBalanceResponse
  * @throws IOException if the JSON string is invalid with respect to ExternalBalanceResponse
  */
  public static ExternalBalanceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalBalanceResponse.class);
  }

 /**
  * Convert an instance of ExternalBalanceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

