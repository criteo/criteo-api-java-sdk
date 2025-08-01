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
 * An object that represents the available options to set when editing a Retail Media Campaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EditableCampaignAttributesV202301 {
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
      return null;
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
  private ClickAttributionWindowEnum clickAttributionWindow;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_DAILY_PACING = "dailyPacing";
  @SerializedName(SERIALIZED_NAME_DAILY_PACING)
  private BigDecimal dailyPacing;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_IS_AUTO_DAILY_PACING = "isAutoDailyPacing";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_DAILY_PACING)
  private Boolean isAutoDailyPacing;

  public static final String SERIALIZED_NAME_MONTHLY_PACING = "monthlyPacing";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PACING)
  private BigDecimal monthlyPacing;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME = "onBehalfCompanyName";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME)
  private String onBehalfCompanyName;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

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
      return null;
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

  /**
   * Gets or Sets viewAttributionWindow
   */
  @JsonAdapter(ViewAttributionWindowEnum.Adapter.class)
  public enum ViewAttributionWindowEnum {
    NONE("none"),
    
    UNKNOWN("unknown"),
    
    _1D("1D"),
    
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D");

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
  private ViewAttributionWindowEnum viewAttributionWindow;

  public EditableCampaignAttributesV202301() {
  }

  public EditableCampaignAttributesV202301 budget(BigDecimal budget) {
    
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


  public EditableCampaignAttributesV202301 clickAttributionScope(ClickAttributionScopeEnum clickAttributionScope) {
    
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


  public EditableCampaignAttributesV202301 clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Get clickAttributionWindow
   * @return clickAttributionWindow
  **/
  @javax.annotation.Nonnull

  public ClickAttributionWindowEnum getClickAttributionWindow() {
    return clickAttributionWindow;
  }


  public void setClickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }


  public EditableCampaignAttributesV202301 companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public EditableCampaignAttributesV202301 dailyPacing(BigDecimal dailyPacing) {
    
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


  public EditableCampaignAttributesV202301 endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public EditableCampaignAttributesV202301 isAutoDailyPacing(Boolean isAutoDailyPacing) {
    
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


  public EditableCampaignAttributesV202301 monthlyPacing(BigDecimal monthlyPacing) {
    
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


  public EditableCampaignAttributesV202301 name(String name) {
    
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


  public EditableCampaignAttributesV202301 onBehalfCompanyName(String onBehalfCompanyName) {
    
    this.onBehalfCompanyName = onBehalfCompanyName;
    return this;
  }

   /**
   * Get onBehalfCompanyName
   * @return onBehalfCompanyName
  **/
  @javax.annotation.Nullable

  public String getOnBehalfCompanyName() {
    return onBehalfCompanyName;
  }


  public void setOnBehalfCompanyName(String onBehalfCompanyName) {
    this.onBehalfCompanyName = onBehalfCompanyName;
  }


  public EditableCampaignAttributesV202301 startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public EditableCampaignAttributesV202301 viewAttributionScope(ViewAttributionScopeEnum viewAttributionScope) {
    
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


  public EditableCampaignAttributesV202301 viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Get viewAttributionWindow
   * @return viewAttributionWindow
  **/
  @javax.annotation.Nonnull

  public ViewAttributionWindowEnum getViewAttributionWindow() {
    return viewAttributionWindow;
  }


  public void setViewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
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
   * @return the EditableCampaignAttributesV202301 instance itself
   */
  public EditableCampaignAttributesV202301 putAdditionalProperty(String key, Object value) {
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
    EditableCampaignAttributesV202301 editableCampaignAttributesV202301 = (EditableCampaignAttributesV202301) o;
    return Objects.equals(this.budget, editableCampaignAttributesV202301.budget) &&
        Objects.equals(this.clickAttributionScope, editableCampaignAttributesV202301.clickAttributionScope) &&
        Objects.equals(this.clickAttributionWindow, editableCampaignAttributesV202301.clickAttributionWindow) &&
        Objects.equals(this.companyName, editableCampaignAttributesV202301.companyName) &&
        Objects.equals(this.dailyPacing, editableCampaignAttributesV202301.dailyPacing) &&
        Objects.equals(this.endDate, editableCampaignAttributesV202301.endDate) &&
        Objects.equals(this.isAutoDailyPacing, editableCampaignAttributesV202301.isAutoDailyPacing) &&
        Objects.equals(this.monthlyPacing, editableCampaignAttributesV202301.monthlyPacing) &&
        Objects.equals(this.name, editableCampaignAttributesV202301.name) &&
        Objects.equals(this.onBehalfCompanyName, editableCampaignAttributesV202301.onBehalfCompanyName) &&
        Objects.equals(this.startDate, editableCampaignAttributesV202301.startDate) &&
        Objects.equals(this.viewAttributionScope, editableCampaignAttributesV202301.viewAttributionScope) &&
        Objects.equals(this.viewAttributionWindow, editableCampaignAttributesV202301.viewAttributionWindow)&&
        Objects.equals(this.additionalProperties, editableCampaignAttributesV202301.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, clickAttributionScope, clickAttributionWindow, companyName, dailyPacing, endDate, isAutoDailyPacing, monthlyPacing, name, onBehalfCompanyName, startDate, viewAttributionScope, viewAttributionWindow, additionalProperties);
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
    sb.append("class EditableCampaignAttributesV202301 {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    clickAttributionScope: ").append(toIndentedString(clickAttributionScope)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    dailyPacing: ").append(toIndentedString(dailyPacing)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isAutoDailyPacing: ").append(toIndentedString(isAutoDailyPacing)).append("\n");
    sb.append("    monthlyPacing: ").append(toIndentedString(monthlyPacing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onBehalfCompanyName: ").append(toIndentedString(onBehalfCompanyName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    viewAttributionScope: ").append(toIndentedString(viewAttributionScope)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
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
    openapiFields.add("clickAttributionScope");
    openapiFields.add("clickAttributionWindow");
    openapiFields.add("companyName");
    openapiFields.add("dailyPacing");
    openapiFields.add("endDate");
    openapiFields.add("isAutoDailyPacing");
    openapiFields.add("monthlyPacing");
    openapiFields.add("name");
    openapiFields.add("onBehalfCompanyName");
    openapiFields.add("startDate");
    openapiFields.add("viewAttributionScope");
    openapiFields.add("viewAttributionWindow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clickAttributionWindow");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("isAutoDailyPacing");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("viewAttributionWindow");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EditableCampaignAttributesV202301
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EditableCampaignAttributesV202301.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditableCampaignAttributesV202301 is not found in the empty JSON string", EditableCampaignAttributesV202301.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EditableCampaignAttributesV202301.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("clickAttributionScope") != null && !jsonObj.get("clickAttributionScope").isJsonNull()) && !jsonObj.get("clickAttributionScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickAttributionScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickAttributionScope").toString()));
      }
      if (!jsonObj.get("clickAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickAttributionWindow").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("onBehalfCompanyName") != null && !jsonObj.get("onBehalfCompanyName").isJsonNull()) && !jsonObj.get("onBehalfCompanyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfCompanyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfCompanyName").toString()));
      }
      if ((jsonObj.get("viewAttributionScope") != null && !jsonObj.get("viewAttributionScope").isJsonNull()) && !jsonObj.get("viewAttributionScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewAttributionScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewAttributionScope").toString()));
      }
      if (!jsonObj.get("viewAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewAttributionWindow").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditableCampaignAttributesV202301.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditableCampaignAttributesV202301' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditableCampaignAttributesV202301> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditableCampaignAttributesV202301.class));

       return (TypeAdapter<T>) new TypeAdapter<EditableCampaignAttributesV202301>() {
           @Override
           public void write(JsonWriter out, EditableCampaignAttributesV202301 value) throws IOException {
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
           public EditableCampaignAttributesV202301 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EditableCampaignAttributesV202301 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EditableCampaignAttributesV202301 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EditableCampaignAttributesV202301
  * @throws IOException if the JSON string is invalid with respect to EditableCampaignAttributesV202301
  */
  public static EditableCampaignAttributesV202301 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditableCampaignAttributesV202301.class);
  }

 /**
  * Convert an instance of EditableCampaignAttributesV202301 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

