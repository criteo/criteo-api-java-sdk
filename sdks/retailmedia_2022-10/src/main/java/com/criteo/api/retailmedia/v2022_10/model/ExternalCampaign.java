/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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

import com.criteo.api.retailmedia.v2022_10.JSON;

/**
 * A Retail Media Campaign used to represent an advertiser&#39;s marketing objective
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalCampaign {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_PROMOTED_BRAND_IDS = "promotedBrandIds";
  @SerializedName(SERIALIZED_NAME_PROMOTED_BRAND_IDS)
  private List<String> promotedBrandIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUDGET_SPENT = "budgetSpent";
  @SerializedName(SERIALIZED_NAME_BUDGET_SPENT)
  private BigDecimal budgetSpent;

  public static final String SERIALIZED_NAME_BUDGET_REMAINING = "budgetRemaining";
  @SerializedName(SERIALIZED_NAME_BUDGET_REMAINING)
  private BigDecimal budgetRemaining;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    AUCTION("auction"),
    
    PREFERRED("preferred");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.AUCTION;

  public static final String SERIALIZED_NAME_DRAWABLE_BALANCE_IDS = "drawableBalanceIds";
  @SerializedName(SERIALIZED_NAME_DRAWABLE_BALANCE_IDS)
  private List<String> drawableBalanceIds = null;

  /**
   * Gets or Sets clickAttributionWindow
   */
  @JsonAdapter(ClickAttributionWindowEnum.Adapter.class)
  public enum ClickAttributionWindowEnum {
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D"),
    
    UNKNOWN("unknown");

    private String value;

    ClickAttributionWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClickAttributionWindowEnum fromValue(String value) {
      for (ClickAttributionWindowEnum b : ClickAttributionWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClickAttributionWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClickAttributionWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClickAttributionWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClickAttributionWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLICK_ATTRIBUTION_WINDOW = "clickAttributionWindow";
  @SerializedName(SERIALIZED_NAME_CLICK_ATTRIBUTION_WINDOW)
  private ClickAttributionWindowEnum clickAttributionWindow = ClickAttributionWindowEnum._30D;

  /**
   * Gets or Sets viewAttributionWindow
   */
  @JsonAdapter(ViewAttributionWindowEnum.Adapter.class)
  public enum ViewAttributionWindowEnum {
    NONE("none"),
    
    _1D("1D"),
    
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D"),
    
    UNKNOWN("unknown");

    private String value;

    ViewAttributionWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewAttributionWindowEnum fromValue(String value) {
      for (ViewAttributionWindowEnum b : ViewAttributionWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewAttributionWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewAttributionWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewAttributionWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewAttributionWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW_ATTRIBUTION_WINDOW = "viewAttributionWindow";
  @SerializedName(SERIALIZED_NAME_VIEW_ATTRIBUTION_WINDOW)
  private ViewAttributionWindowEnum viewAttributionWindow = ViewAttributionWindowEnum.NONE;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  /**
   * Gets or Sets clickAttributionScope
   */
  @JsonAdapter(ClickAttributionScopeEnum.Adapter.class)
  public enum ClickAttributionScopeEnum {
    UNKNOWN("unknown"),
    
    SAMESKU("sameSku"),
    
    SAMESKUCATEGORY("sameSkuCategory"),
    
    SAMESKUCATEGORYBRAND("sameSkuCategoryBrand");

    private String value;

    ClickAttributionScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClickAttributionScopeEnum fromValue(String value) {
      for (ClickAttributionScopeEnum b : ClickAttributionScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClickAttributionScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClickAttributionScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClickAttributionScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClickAttributionScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLICK_ATTRIBUTION_SCOPE = "clickAttributionScope";
  @SerializedName(SERIALIZED_NAME_CLICK_ATTRIBUTION_SCOPE)
  private ClickAttributionScopeEnum clickAttributionScope;

  /**
   * Gets or Sets viewAttributionScope
   */
  @JsonAdapter(ViewAttributionScopeEnum.Adapter.class)
  public enum ViewAttributionScopeEnum {
    UNKNOWN("unknown"),
    
    SAMESKU("sameSku"),
    
    SAMESKUCATEGORY("sameSkuCategory"),
    
    SAMESKUCATEGORYBRAND("sameSkuCategoryBrand");

    private String value;

    ViewAttributionScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewAttributionScopeEnum fromValue(String value) {
      for (ViewAttributionScopeEnum b : ViewAttributionScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewAttributionScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewAttributionScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewAttributionScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewAttributionScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW_ATTRIBUTION_SCOPE = "viewAttributionScope";
  @SerializedName(SERIALIZED_NAME_VIEW_ATTRIBUTION_SCOPE)
  private ViewAttributionScopeEnum viewAttributionScope;

  public ExternalCampaign() {
  }

  public ExternalCampaign accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ExternalCampaign promotedBrandIds(List<String> promotedBrandIds) {
    
    this.promotedBrandIds = promotedBrandIds;
    return this;
  }

  public ExternalCampaign addPromotedBrandIdsItem(String promotedBrandIdsItem) {
    this.promotedBrandIds.add(promotedBrandIdsItem);
    return this;
  }

   /**
   * Get promotedBrandIds
   * @return promotedBrandIds
  **/
  @javax.annotation.Nonnull

  public List<String> getPromotedBrandIds() {
    return promotedBrandIds;
  }


  public void setPromotedBrandIds(List<String> promotedBrandIds) {
    this.promotedBrandIds = promotedBrandIds;
  }


  public ExternalCampaign budgetSpent(BigDecimal budgetSpent) {
    
    this.budgetSpent = budgetSpent;
    return this;
  }

   /**
   * Get budgetSpent
   * @return budgetSpent
  **/
  @javax.annotation.Nonnull

  public BigDecimal getBudgetSpent() {
    return budgetSpent;
  }


  public void setBudgetSpent(BigDecimal budgetSpent) {
    this.budgetSpent = budgetSpent;
  }


  public ExternalCampaign budgetRemaining(BigDecimal budgetRemaining) {
    
    this.budgetRemaining = budgetRemaining;
    return this;
  }

   /**
   * Get budgetRemaining
   * @return budgetRemaining
  **/
  @javax.annotation.Nonnull

  public BigDecimal getBudgetRemaining() {
    return budgetRemaining;
  }


  public void setBudgetRemaining(BigDecimal budgetRemaining) {
    this.budgetRemaining = budgetRemaining;
  }


  public ExternalCampaign status(StatusEnum status) {
    
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


  public ExternalCampaign createdAt(OffsetDateTime createdAt) {
    
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


  public ExternalCampaign updatedAt(OffsetDateTime updatedAt) {
    
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


  public ExternalCampaign type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ExternalCampaign drawableBalanceIds(List<String> drawableBalanceIds) {
    
    this.drawableBalanceIds = drawableBalanceIds;
    return this;
  }

  public ExternalCampaign addDrawableBalanceIdsItem(String drawableBalanceIdsItem) {
    if (this.drawableBalanceIds == null) {
      this.drawableBalanceIds = new ArrayList<>();
    }
    this.drawableBalanceIds.add(drawableBalanceIdsItem);
    return this;
  }

   /**
   * Get drawableBalanceIds
   * @return drawableBalanceIds
  **/
  @javax.annotation.Nullable

  public List<String> getDrawableBalanceIds() {
    return drawableBalanceIds;
  }


  public void setDrawableBalanceIds(List<String> drawableBalanceIds) {
    this.drawableBalanceIds = drawableBalanceIds;
  }


  public ExternalCampaign clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Get clickAttributionWindow
   * @return clickAttributionWindow
  **/
  @javax.annotation.Nullable

  public ClickAttributionWindowEnum getClickAttributionWindow() {
    return clickAttributionWindow;
  }


  public void setClickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }


  public ExternalCampaign viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Get viewAttributionWindow
   * @return viewAttributionWindow
  **/
  @javax.annotation.Nullable

  public ViewAttributionWindowEnum getViewAttributionWindow() {
    return viewAttributionWindow;
  }


  public void setViewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
  }


  public ExternalCampaign name(String name) {
    
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


  public ExternalCampaign budget(BigDecimal budget) {
    
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


  public ExternalCampaign clickAttributionScope(ClickAttributionScopeEnum clickAttributionScope) {
    
    this.clickAttributionScope = clickAttributionScope;
    return this;
  }

   /**
   * Get clickAttributionScope
   * @return clickAttributionScope
  **/
  @javax.annotation.Nullable

  public ClickAttributionScopeEnum getClickAttributionScope() {
    return clickAttributionScope;
  }


  public void setClickAttributionScope(ClickAttributionScopeEnum clickAttributionScope) {
    this.clickAttributionScope = clickAttributionScope;
  }


  public ExternalCampaign viewAttributionScope(ViewAttributionScopeEnum viewAttributionScope) {
    
    this.viewAttributionScope = viewAttributionScope;
    return this;
  }

   /**
   * Get viewAttributionScope
   * @return viewAttributionScope
  **/
  @javax.annotation.Nullable

  public ViewAttributionScopeEnum getViewAttributionScope() {
    return viewAttributionScope;
  }


  public void setViewAttributionScope(ViewAttributionScopeEnum viewAttributionScope) {
    this.viewAttributionScope = viewAttributionScope;
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
   * @return the ExternalCampaign instance itself
   */
  public ExternalCampaign putAdditionalProperty(String key, Object value) {
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
    ExternalCampaign externalCampaign = (ExternalCampaign) o;
    return Objects.equals(this.accountId, externalCampaign.accountId) &&
        Objects.equals(this.promotedBrandIds, externalCampaign.promotedBrandIds) &&
        Objects.equals(this.budgetSpent, externalCampaign.budgetSpent) &&
        Objects.equals(this.budgetRemaining, externalCampaign.budgetRemaining) &&
        Objects.equals(this.status, externalCampaign.status) &&
        Objects.equals(this.createdAt, externalCampaign.createdAt) &&
        Objects.equals(this.updatedAt, externalCampaign.updatedAt) &&
        Objects.equals(this.type, externalCampaign.type) &&
        Objects.equals(this.drawableBalanceIds, externalCampaign.drawableBalanceIds) &&
        Objects.equals(this.clickAttributionWindow, externalCampaign.clickAttributionWindow) &&
        Objects.equals(this.viewAttributionWindow, externalCampaign.viewAttributionWindow) &&
        Objects.equals(this.name, externalCampaign.name) &&
        Objects.equals(this.budget, externalCampaign.budget) &&
        Objects.equals(this.clickAttributionScope, externalCampaign.clickAttributionScope) &&
        Objects.equals(this.viewAttributionScope, externalCampaign.viewAttributionScope)&&
        Objects.equals(this.additionalProperties, externalCampaign.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, promotedBrandIds, budgetSpent, budgetRemaining, status, createdAt, updatedAt, type, drawableBalanceIds, clickAttributionWindow, viewAttributionWindow, name, budget, clickAttributionScope, viewAttributionScope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalCampaign {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    promotedBrandIds: ").append(toIndentedString(promotedBrandIds)).append("\n");
    sb.append("    budgetSpent: ").append(toIndentedString(budgetSpent)).append("\n");
    sb.append("    budgetRemaining: ").append(toIndentedString(budgetRemaining)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    drawableBalanceIds: ").append(toIndentedString(drawableBalanceIds)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    clickAttributionScope: ").append(toIndentedString(clickAttributionScope)).append("\n");
    sb.append("    viewAttributionScope: ").append(toIndentedString(viewAttributionScope)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("promotedBrandIds");
    openapiFields.add("budgetSpent");
    openapiFields.add("budgetRemaining");
    openapiFields.add("status");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("type");
    openapiFields.add("drawableBalanceIds");
    openapiFields.add("clickAttributionWindow");
    openapiFields.add("viewAttributionWindow");
    openapiFields.add("name");
    openapiFields.add("budget");
    openapiFields.add("clickAttributionScope");
    openapiFields.add("viewAttributionScope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("promotedBrandIds");
    openapiRequiredFields.add("budgetSpent");
    openapiRequiredFields.add("budgetRemaining");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalCampaign
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalCampaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalCampaign is not found in the empty JSON string", ExternalCampaign.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalCampaign.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("promotedBrandIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("promotedBrandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotedBrandIds` to be an array in the JSON string but got `%s`", jsonObj.get("promotedBrandIds").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("drawableBalanceIds") != null && !jsonObj.get("drawableBalanceIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drawableBalanceIds` to be an array in the JSON string but got `%s`", jsonObj.get("drawableBalanceIds").toString()));
      }
      if ((jsonObj.get("clickAttributionWindow") != null && !jsonObj.get("clickAttributionWindow").isJsonNull()) && !jsonObj.get("clickAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickAttributionWindow").toString()));
      }
      if ((jsonObj.get("viewAttributionWindow") != null && !jsonObj.get("viewAttributionWindow").isJsonNull()) && !jsonObj.get("viewAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewAttributionWindow").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("clickAttributionScope") != null && !jsonObj.get("clickAttributionScope").isJsonNull()) && !jsonObj.get("clickAttributionScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickAttributionScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickAttributionScope").toString()));
      }
      if ((jsonObj.get("viewAttributionScope") != null && !jsonObj.get("viewAttributionScope").isJsonNull()) && !jsonObj.get("viewAttributionScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewAttributionScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewAttributionScope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalCampaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalCampaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalCampaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalCampaign.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalCampaign>() {
           @Override
           public void write(JsonWriter out, ExternalCampaign value) throws IOException {
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
           public ExternalCampaign read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalCampaign instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalCampaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalCampaign
  * @throws IOException if the JSON string is invalid with respect to ExternalCampaign
  */
  public static ExternalCampaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalCampaign.class);
  }

 /**
  * Convert an instance of ExternalCampaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

