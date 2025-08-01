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
import java.time.OffsetDateTime;
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
 * A Retail Media Auction Line Item used to hold bid settings for one or many promoted products on a single retailer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAuctionLineItem {
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

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  public static final String SERIALIZED_NAME_BUDGET_REMAINING = "budgetRemaining";
  @SerializedName(SERIALIZED_NAME_BUDGET_REMAINING)
  private BigDecimal budgetRemaining;

  public static final String SERIALIZED_NAME_BUDGET_SPENT = "budgetSpent";
  @SerializedName(SERIALIZED_NAME_BUDGET_SPENT)
  private Double budgetSpent;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DAILY_PACING = "dailyPacing";
  @SerializedName(SERIALIZED_NAME_DAILY_PACING)
  private BigDecimal dailyPacing;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_AUTO_DAILY_PACING = "isAutoDailyPacing";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_DAILY_PACING)
  private Boolean isAutoDailyPacing = false;

  public static final String SERIALIZED_NAME_MAX_BID = "maxBid";
  @SerializedName(SERIALIZED_NAME_MAX_BID)
  private BigDecimal maxBid;

  public static final String SERIALIZED_NAME_MONTHLY_PACING = "monthlyPacing";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PACING)
  private BigDecimal monthlyPacing;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

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

  public static final String SERIALIZED_NAME_TARGET_BID = "targetBid";
  @SerializedName(SERIALIZED_NAME_TARGET_BID)
  private BigDecimal targetBid;

  public static final String SERIALIZED_NAME_TARGET_RETAILER_ID = "targetRetailerId";
  @SerializedName(SERIALIZED_NAME_TARGET_RETAILER_ID)
  private String targetRetailerId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ExternalAuctionLineItem() {
  }

  public ExternalAuctionLineItem bidStrategy(BidStrategyEnum bidStrategy) {
    
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


  public ExternalAuctionLineItem budget(BigDecimal budget) {
    
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


  public ExternalAuctionLineItem budgetRemaining(BigDecimal budgetRemaining) {
    
    this.budgetRemaining = budgetRemaining;
    return this;
  }

   /**
   * Get budgetRemaining
   * @return budgetRemaining
  **/
  @javax.annotation.Nullable

  public BigDecimal getBudgetRemaining() {
    return budgetRemaining;
  }


  public void setBudgetRemaining(BigDecimal budgetRemaining) {
    this.budgetRemaining = budgetRemaining;
  }


  public ExternalAuctionLineItem budgetSpent(Double budgetSpent) {
    
    this.budgetSpent = budgetSpent;
    return this;
  }

   /**
   * Get budgetSpent
   * @return budgetSpent
  **/
  @javax.annotation.Nullable

  public Double getBudgetSpent() {
    return budgetSpent;
  }


  public void setBudgetSpent(Double budgetSpent) {
    this.budgetSpent = budgetSpent;
  }


  public ExternalAuctionLineItem campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nonnull

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ExternalAuctionLineItem createdAt(OffsetDateTime createdAt) {
    
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


  public ExternalAuctionLineItem dailyPacing(BigDecimal dailyPacing) {
    
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


  public ExternalAuctionLineItem endDate(LocalDate endDate) {
    
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


  public ExternalAuctionLineItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ExternalAuctionLineItem isAutoDailyPacing(Boolean isAutoDailyPacing) {
    
    this.isAutoDailyPacing = isAutoDailyPacing;
    return this;
  }

   /**
   * Get isAutoDailyPacing
   * @return isAutoDailyPacing
  **/
  @javax.annotation.Nullable

  public Boolean getIsAutoDailyPacing() {
    return isAutoDailyPacing;
  }


  public void setIsAutoDailyPacing(Boolean isAutoDailyPacing) {
    this.isAutoDailyPacing = isAutoDailyPacing;
  }


  public ExternalAuctionLineItem maxBid(BigDecimal maxBid) {
    
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


  public ExternalAuctionLineItem monthlyPacing(BigDecimal monthlyPacing) {
    
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


  public ExternalAuctionLineItem name(String name) {
    
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


  public ExternalAuctionLineItem startDate(LocalDate startDate) {
    
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


  public ExternalAuctionLineItem status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalAuctionLineItem targetBid(BigDecimal targetBid) {
    
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


  public ExternalAuctionLineItem targetRetailerId(String targetRetailerId) {
    
    this.targetRetailerId = targetRetailerId;
    return this;
  }

   /**
   * Get targetRetailerId
   * @return targetRetailerId
  **/
  @javax.annotation.Nonnull

  public String getTargetRetailerId() {
    return targetRetailerId;
  }


  public void setTargetRetailerId(String targetRetailerId) {
    this.targetRetailerId = targetRetailerId;
  }


  public ExternalAuctionLineItem updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the ExternalAuctionLineItem instance itself
   */
  public ExternalAuctionLineItem putAdditionalProperty(String key, Object value) {
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
    ExternalAuctionLineItem externalAuctionLineItem = (ExternalAuctionLineItem) o;
    return Objects.equals(this.bidStrategy, externalAuctionLineItem.bidStrategy) &&
        Objects.equals(this.budget, externalAuctionLineItem.budget) &&
        Objects.equals(this.budgetRemaining, externalAuctionLineItem.budgetRemaining) &&
        Objects.equals(this.budgetSpent, externalAuctionLineItem.budgetSpent) &&
        Objects.equals(this.campaignId, externalAuctionLineItem.campaignId) &&
        Objects.equals(this.createdAt, externalAuctionLineItem.createdAt) &&
        Objects.equals(this.dailyPacing, externalAuctionLineItem.dailyPacing) &&
        Objects.equals(this.endDate, externalAuctionLineItem.endDate) &&
        Objects.equals(this.id, externalAuctionLineItem.id) &&
        Objects.equals(this.isAutoDailyPacing, externalAuctionLineItem.isAutoDailyPacing) &&
        Objects.equals(this.maxBid, externalAuctionLineItem.maxBid) &&
        Objects.equals(this.monthlyPacing, externalAuctionLineItem.monthlyPacing) &&
        Objects.equals(this.name, externalAuctionLineItem.name) &&
        Objects.equals(this.startDate, externalAuctionLineItem.startDate) &&
        Objects.equals(this.status, externalAuctionLineItem.status) &&
        Objects.equals(this.targetBid, externalAuctionLineItem.targetBid) &&
        Objects.equals(this.targetRetailerId, externalAuctionLineItem.targetRetailerId) &&
        Objects.equals(this.updatedAt, externalAuctionLineItem.updatedAt)&&
        Objects.equals(this.additionalProperties, externalAuctionLineItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidStrategy, budget, budgetRemaining, budgetSpent, campaignId, createdAt, dailyPacing, endDate, id, isAutoDailyPacing, maxBid, monthlyPacing, name, startDate, status, targetBid, targetRetailerId, updatedAt, additionalProperties);
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
    sb.append("class ExternalAuctionLineItem {\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetRemaining: ").append(toIndentedString(budgetRemaining)).append("\n");
    sb.append("    budgetSpent: ").append(toIndentedString(budgetSpent)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dailyPacing: ").append(toIndentedString(dailyPacing)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAutoDailyPacing: ").append(toIndentedString(isAutoDailyPacing)).append("\n");
    sb.append("    maxBid: ").append(toIndentedString(maxBid)).append("\n");
    sb.append("    monthlyPacing: ").append(toIndentedString(monthlyPacing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetBid: ").append(toIndentedString(targetBid)).append("\n");
    sb.append("    targetRetailerId: ").append(toIndentedString(targetRetailerId)).append("\n");
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
    openapiFields.add("bidStrategy");
    openapiFields.add("budget");
    openapiFields.add("budgetRemaining");
    openapiFields.add("budgetSpent");
    openapiFields.add("campaignId");
    openapiFields.add("createdAt");
    openapiFields.add("dailyPacing");
    openapiFields.add("endDate");
    openapiFields.add("id");
    openapiFields.add("isAutoDailyPacing");
    openapiFields.add("maxBid");
    openapiFields.add("monthlyPacing");
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("targetBid");
    openapiFields.add("targetRetailerId");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budgetRemaining");
    openapiRequiredFields.add("campaignId");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("targetRetailerId");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalAuctionLineItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalAuctionLineItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalAuctionLineItem is not found in the empty JSON string", ExternalAuctionLineItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalAuctionLineItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("bidStrategy") != null && !jsonObj.get("bidStrategy").isJsonNull()) && !jsonObj.get("bidStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bidStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bidStrategy").toString()));
      }
      if (!jsonObj.get("campaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("targetRetailerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetRetailerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetRetailerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalAuctionLineItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalAuctionLineItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalAuctionLineItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalAuctionLineItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalAuctionLineItem>() {
           @Override
           public void write(JsonWriter out, ExternalAuctionLineItem value) throws IOException {
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
           public ExternalAuctionLineItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalAuctionLineItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalAuctionLineItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalAuctionLineItem
  * @throws IOException if the JSON string is invalid with respect to ExternalAuctionLineItem
  */
  public static ExternalAuctionLineItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalAuctionLineItem.class);
  }

 /**
  * Convert an instance of ExternalAuctionLineItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

