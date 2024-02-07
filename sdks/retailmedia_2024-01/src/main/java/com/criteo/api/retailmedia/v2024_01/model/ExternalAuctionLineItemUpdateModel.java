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

import com.criteo.api.retailmedia.v2024_01.JSON;

/**
 * Model to update a retail media auction line item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAuctionLineItemUpdateModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    ACTIVE("active"),
    
    SCHEDULED("scheduled"),
    
    DRAFT("draft"),
    
    PAUSED("paused"),
    
    BUDGETHIT("budgetHit"),
    
    ENDED("ended"),
    
    ARCHIVED("archived"),
    
    NOFUNDS("noFunds");

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

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  public static final String SERIALIZED_NAME_TARGET_BID = "targetBid";
  @SerializedName(SERIALIZED_NAME_TARGET_BID)
  private BigDecimal targetBid;

  public static final String SERIALIZED_NAME_MAX_BID = "maxBid";
  @SerializedName(SERIALIZED_NAME_MAX_BID)
  private BigDecimal maxBid;

  public static final String SERIALIZED_NAME_MONTHLY_PACING = "monthlyPacing";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PACING)
  private BigDecimal monthlyPacing;

  public static final String SERIALIZED_NAME_DAILY_PACING = "dailyPacing";
  @SerializedName(SERIALIZED_NAME_DAILY_PACING)
  private BigDecimal dailyPacing;

  public static final String SERIALIZED_NAME_IS_AUTO_DAILY_PACING = "isAutoDailyPacing";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_DAILY_PACING)
  private Boolean isAutoDailyPacing;

  /**
   * Gets or Sets bidStrategy
   */
  @JsonAdapter(BidStrategyEnum.Adapter.class)
  public enum BidStrategyEnum {
    UNKNOWN("unknown"),
    
    CONVERSION("conversion"),
    
    CLICKS("clicks"),
    
    REVENUE("revenue");

    private String value;

    BidStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BidStrategyEnum fromValue(String value) {
      for (BidStrategyEnum b : BidStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BidStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BidStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BidStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BidStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BID_STRATEGY = "bidStrategy";
  @SerializedName(SERIALIZED_NAME_BID_STRATEGY)
  private BidStrategyEnum bidStrategy = BidStrategyEnum.CONVERSION;

  public ExternalAuctionLineItemUpdateModel() {
  }

  public ExternalAuctionLineItemUpdateModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalAuctionLineItemUpdateModel startDate(LocalDate startDate) {
    
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


  public ExternalAuctionLineItemUpdateModel endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return endDate
  **/
  @javax.annotation.Nullable

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalAuctionLineItemUpdateModel status(StatusEnum status) {
    
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


  public ExternalAuctionLineItemUpdateModel budget(BigDecimal budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable

  public BigDecimal getBudget() {
    return budget;
  }


  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }


  public ExternalAuctionLineItemUpdateModel targetBid(BigDecimal targetBid) {
    
    this.targetBid = targetBid;
    return this;
  }

   /**
   * Get targetBid
   * @return targetBid
  **/
  @javax.annotation.Nullable

  public BigDecimal getTargetBid() {
    return targetBid;
  }


  public void setTargetBid(BigDecimal targetBid) {
    this.targetBid = targetBid;
  }


  public ExternalAuctionLineItemUpdateModel maxBid(BigDecimal maxBid) {
    
    this.maxBid = maxBid;
    return this;
  }

   /**
   * Get maxBid
   * @return maxBid
  **/
  @javax.annotation.Nullable

  public BigDecimal getMaxBid() {
    return maxBid;
  }


  public void setMaxBid(BigDecimal maxBid) {
    this.maxBid = maxBid;
  }


  public ExternalAuctionLineItemUpdateModel monthlyPacing(BigDecimal monthlyPacing) {
    
    this.monthlyPacing = monthlyPacing;
    return this;
  }

   /**
   * Get monthlyPacing
   * @return monthlyPacing
  **/
  @javax.annotation.Nullable

  public BigDecimal getMonthlyPacing() {
    return monthlyPacing;
  }


  public void setMonthlyPacing(BigDecimal monthlyPacing) {
    this.monthlyPacing = monthlyPacing;
  }


  public ExternalAuctionLineItemUpdateModel dailyPacing(BigDecimal dailyPacing) {
    
    this.dailyPacing = dailyPacing;
    return this;
  }

   /**
   * Get dailyPacing
   * @return dailyPacing
  **/
  @javax.annotation.Nullable

  public BigDecimal getDailyPacing() {
    return dailyPacing;
  }


  public void setDailyPacing(BigDecimal dailyPacing) {
    this.dailyPacing = dailyPacing;
  }


  public ExternalAuctionLineItemUpdateModel isAutoDailyPacing(Boolean isAutoDailyPacing) {
    
    this.isAutoDailyPacing = isAutoDailyPacing;
    return this;
  }

   /**
   * Get isAutoDailyPacing
   * @return isAutoDailyPacing
  **/
  @javax.annotation.Nonnull

  public Boolean getIsAutoDailyPacing() {
    return isAutoDailyPacing;
  }


  public void setIsAutoDailyPacing(Boolean isAutoDailyPacing) {
    this.isAutoDailyPacing = isAutoDailyPacing;
  }


  public ExternalAuctionLineItemUpdateModel bidStrategy(BidStrategyEnum bidStrategy) {
    
    this.bidStrategy = bidStrategy;
    return this;
  }

   /**
   * Get bidStrategy
   * @return bidStrategy
  **/
  @javax.annotation.Nullable

  public BidStrategyEnum getBidStrategy() {
    return bidStrategy;
  }


  public void setBidStrategy(BidStrategyEnum bidStrategy) {
    this.bidStrategy = bidStrategy;
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
   * @return the ExternalAuctionLineItemUpdateModel instance itself
   */
  public ExternalAuctionLineItemUpdateModel putAdditionalProperty(String key, Object value) {
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
    ExternalAuctionLineItemUpdateModel externalAuctionLineItemUpdateModel = (ExternalAuctionLineItemUpdateModel) o;
    return Objects.equals(this.name, externalAuctionLineItemUpdateModel.name) &&
        Objects.equals(this.startDate, externalAuctionLineItemUpdateModel.startDate) &&
        Objects.equals(this.endDate, externalAuctionLineItemUpdateModel.endDate) &&
        Objects.equals(this.status, externalAuctionLineItemUpdateModel.status) &&
        Objects.equals(this.budget, externalAuctionLineItemUpdateModel.budget) &&
        Objects.equals(this.targetBid, externalAuctionLineItemUpdateModel.targetBid) &&
        Objects.equals(this.maxBid, externalAuctionLineItemUpdateModel.maxBid) &&
        Objects.equals(this.monthlyPacing, externalAuctionLineItemUpdateModel.monthlyPacing) &&
        Objects.equals(this.dailyPacing, externalAuctionLineItemUpdateModel.dailyPacing) &&
        Objects.equals(this.isAutoDailyPacing, externalAuctionLineItemUpdateModel.isAutoDailyPacing) &&
        Objects.equals(this.bidStrategy, externalAuctionLineItemUpdateModel.bidStrategy)&&
        Objects.equals(this.additionalProperties, externalAuctionLineItemUpdateModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate, endDate, status, budget, targetBid, maxBid, monthlyPacing, dailyPacing, isAutoDailyPacing, bidStrategy, additionalProperties);
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
    sb.append("class ExternalAuctionLineItemUpdateModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    targetBid: ").append(toIndentedString(targetBid)).append("\n");
    sb.append("    maxBid: ").append(toIndentedString(maxBid)).append("\n");
    sb.append("    monthlyPacing: ").append(toIndentedString(monthlyPacing)).append("\n");
    sb.append("    dailyPacing: ").append(toIndentedString(dailyPacing)).append("\n");
    sb.append("    isAutoDailyPacing: ").append(toIndentedString(isAutoDailyPacing)).append("\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("status");
    openapiFields.add("budget");
    openapiFields.add("targetBid");
    openapiFields.add("maxBid");
    openapiFields.add("monthlyPacing");
    openapiFields.add("dailyPacing");
    openapiFields.add("isAutoDailyPacing");
    openapiFields.add("bidStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("targetBid");
    openapiRequiredFields.add("isAutoDailyPacing");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalAuctionLineItemUpdateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalAuctionLineItemUpdateModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalAuctionLineItemUpdateModel is not found in the empty JSON string", ExternalAuctionLineItemUpdateModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalAuctionLineItemUpdateModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("bidStrategy") != null && !jsonObj.get("bidStrategy").isJsonNull()) && !jsonObj.get("bidStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bidStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bidStrategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalAuctionLineItemUpdateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalAuctionLineItemUpdateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalAuctionLineItemUpdateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalAuctionLineItemUpdateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalAuctionLineItemUpdateModel>() {
           @Override
           public void write(JsonWriter out, ExternalAuctionLineItemUpdateModel value) throws IOException {
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
           public ExternalAuctionLineItemUpdateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalAuctionLineItemUpdateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalAuctionLineItemUpdateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalAuctionLineItemUpdateModel
  * @throws IOException if the JSON string is invalid with respect to ExternalAuctionLineItemUpdateModel
  */
  public static ExternalAuctionLineItemUpdateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalAuctionLineItemUpdateModel.class);
  }

 /**
  * Convert an instance of ExternalAuctionLineItemUpdateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

