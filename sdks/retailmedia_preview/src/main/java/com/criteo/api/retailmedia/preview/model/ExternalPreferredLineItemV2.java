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
import com.criteo.api.retailmedia.preview.model.ExternalLineItemCappingV2;
import com.criteo.api.retailmedia.preview.model.ExternalLineItemPageV2;
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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * A Retail Media Preferred Line Item used to hold bid settings for one or many promoted products on a single retailer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalPreferredLineItemV2 {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  public static final String SERIALIZED_NAME_BUDGET_REMAINING = "budgetRemaining";
  @SerializedName(SERIALIZED_NAME_BUDGET_REMAINING)
  private BigDecimal budgetRemaining;

  public static final String SERIALIZED_NAME_BUDGET_SPENT = "budgetSpent";
  @SerializedName(SERIALIZED_NAME_BUDGET_SPENT)
  private BigDecimal budgetSpent;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CAPPING = "capping";
  @SerializedName(SERIALIZED_NAME_CAPPING)
  private ExternalLineItemCappingV2 capping;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creativeId";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets pacing
   */
  @JsonAdapter(PacingEnum.Adapter.class)
  public enum PacingEnum {
    UNKNOWN("unknown"),
    
    STANDARD("standard"),
    
    ACCELERATED("accelerated");

    private String value;

    PacingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PacingEnum fromValue(String value) {
      for (PacingEnum b : PacingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PacingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PacingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PacingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PacingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PACING = "pacing";
  @SerializedName(SERIALIZED_NAME_PACING)
  private PacingEnum pacing;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private ExternalLineItemPageV2 page;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  /**
   * Line Item Status Enum
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

  public static final String SERIALIZED_NAME_TARGET_RETAILER_ID = "targetRetailerId";
  @SerializedName(SERIALIZED_NAME_TARGET_RETAILER_ID)
  private String targetRetailerId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ExternalPreferredLineItemV2() {
  }

  public ExternalPreferredLineItemV2 budget(BigDecimal budget) {
    
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


  public ExternalPreferredLineItemV2 budgetRemaining(BigDecimal budgetRemaining) {
    
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


  public ExternalPreferredLineItemV2 budgetSpent(BigDecimal budgetSpent) {
    
    this.budgetSpent = budgetSpent;
    return this;
  }

   /**
   * Get budgetSpent
   * @return budgetSpent
  **/
  @javax.annotation.Nullable

  public BigDecimal getBudgetSpent() {
    return budgetSpent;
  }


  public void setBudgetSpent(BigDecimal budgetSpent) {
    this.budgetSpent = budgetSpent;
  }


  public ExternalPreferredLineItemV2 campaignId(String campaignId) {
    
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


  public ExternalPreferredLineItemV2 capping(ExternalLineItemCappingV2 capping) {
    
    this.capping = capping;
    return this;
  }

   /**
   * Get capping
   * @return capping
  **/
  @javax.annotation.Nullable

  public ExternalLineItemCappingV2 getCapping() {
    return capping;
  }


  public void setCapping(ExternalLineItemCappingV2 capping) {
    this.capping = capping;
  }


  public ExternalPreferredLineItemV2 createdAt(OffsetDateTime createdAt) {
    
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


  public ExternalPreferredLineItemV2 creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * External creative Id
   * @return creativeId
  **/
  @javax.annotation.Nullable

  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public ExternalPreferredLineItemV2 endDate(LocalDate endDate) {
    
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


  public ExternalPreferredLineItemV2 id(String id) {
    
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


  public ExternalPreferredLineItemV2 name(String name) {
    
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


  public ExternalPreferredLineItemV2 pacing(PacingEnum pacing) {
    
    this.pacing = pacing;
    return this;
  }

   /**
   * Get pacing
   * @return pacing
  **/
  @javax.annotation.Nullable

  public PacingEnum getPacing() {
    return pacing;
  }


  public void setPacing(PacingEnum pacing) {
    this.pacing = pacing;
  }


  public ExternalPreferredLineItemV2 page(ExternalLineItemPageV2 page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable

  public ExternalLineItemPageV2 getPage() {
    return page;
  }


  public void setPage(ExternalLineItemPageV2 page) {
    this.page = page;
  }


  public ExternalPreferredLineItemV2 startDate(LocalDate startDate) {
    
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


  public ExternalPreferredLineItemV2 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Line Item Status Enum
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalPreferredLineItemV2 targetRetailerId(String targetRetailerId) {
    
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


  public ExternalPreferredLineItemV2 updatedAt(OffsetDateTime updatedAt) {
    
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
   * @return the ExternalPreferredLineItemV2 instance itself
   */
  public ExternalPreferredLineItemV2 putAdditionalProperty(String key, Object value) {
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
    ExternalPreferredLineItemV2 externalPreferredLineItemV2 = (ExternalPreferredLineItemV2) o;
    return Objects.equals(this.budget, externalPreferredLineItemV2.budget) &&
        Objects.equals(this.budgetRemaining, externalPreferredLineItemV2.budgetRemaining) &&
        Objects.equals(this.budgetSpent, externalPreferredLineItemV2.budgetSpent) &&
        Objects.equals(this.campaignId, externalPreferredLineItemV2.campaignId) &&
        Objects.equals(this.capping, externalPreferredLineItemV2.capping) &&
        Objects.equals(this.createdAt, externalPreferredLineItemV2.createdAt) &&
        Objects.equals(this.creativeId, externalPreferredLineItemV2.creativeId) &&
        Objects.equals(this.endDate, externalPreferredLineItemV2.endDate) &&
        Objects.equals(this.id, externalPreferredLineItemV2.id) &&
        Objects.equals(this.name, externalPreferredLineItemV2.name) &&
        Objects.equals(this.pacing, externalPreferredLineItemV2.pacing) &&
        Objects.equals(this.page, externalPreferredLineItemV2.page) &&
        Objects.equals(this.startDate, externalPreferredLineItemV2.startDate) &&
        Objects.equals(this.status, externalPreferredLineItemV2.status) &&
        Objects.equals(this.targetRetailerId, externalPreferredLineItemV2.targetRetailerId) &&
        Objects.equals(this.updatedAt, externalPreferredLineItemV2.updatedAt)&&
        Objects.equals(this.additionalProperties, externalPreferredLineItemV2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetRemaining, budgetSpent, campaignId, capping, createdAt, creativeId, endDate, id, name, pacing, page, startDate, status, targetRetailerId, updatedAt, additionalProperties);
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
    sb.append("class ExternalPreferredLineItemV2 {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetRemaining: ").append(toIndentedString(budgetRemaining)).append("\n");
    sb.append("    budgetSpent: ").append(toIndentedString(budgetSpent)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    capping: ").append(toIndentedString(capping)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budgetRemaining");
    openapiFields.add("budgetSpent");
    openapiFields.add("campaignId");
    openapiFields.add("capping");
    openapiFields.add("createdAt");
    openapiFields.add("creativeId");
    openapiFields.add("endDate");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("pacing");
    openapiFields.add("page");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("targetRetailerId");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("campaignId");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("targetRetailerId");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPreferredLineItemV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalPreferredLineItemV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPreferredLineItemV2 is not found in the empty JSON string", ExternalPreferredLineItemV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalPreferredLineItemV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("campaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignId").toString()));
      }
      // validate the optional field `capping`
      if (jsonObj.get("capping") != null && !jsonObj.get("capping").isJsonNull()) {
        ExternalLineItemCappingV2.validateJsonObject(jsonObj.getAsJsonObject("capping"));
      }
      if ((jsonObj.get("creativeId") != null && !jsonObj.get("creativeId").isJsonNull()) && !jsonObj.get("creativeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pacing") != null && !jsonObj.get("pacing").isJsonNull()) && !jsonObj.get("pacing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pacing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pacing").toString()));
      }
      // validate the optional field `page`
      if (jsonObj.get("page") != null && !jsonObj.get("page").isJsonNull()) {
        ExternalLineItemPageV2.validateJsonObject(jsonObj.getAsJsonObject("page"));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
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
       if (!ExternalPreferredLineItemV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPreferredLineItemV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPreferredLineItemV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPreferredLineItemV2.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPreferredLineItemV2>() {
           @Override
           public void write(JsonWriter out, ExternalPreferredLineItemV2 value) throws IOException {
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
           public ExternalPreferredLineItemV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalPreferredLineItemV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalPreferredLineItemV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPreferredLineItemV2
  * @throws IOException if the JSON string is invalid with respect to ExternalPreferredLineItemV2
  */
  public static ExternalPreferredLineItemV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPreferredLineItemV2.class);
  }

 /**
  * Convert an instance of ExternalPreferredLineItemV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

