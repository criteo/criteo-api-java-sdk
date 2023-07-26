/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2022_07.model.NillableDecimal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import com.criteo.api.marketingsolutions.v2022_07.JSON;

/**
 * ad set budget patch model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchAdSetBudget {
  /**
   * Whether your budget is capped or not
   */
  @JsonAdapter(BudgetStrategyEnum.Adapter.class)
  public enum BudgetStrategyEnum {
    CAPPED("capped"),
    
    UNCAPPED("uncapped");

    private String value;

    BudgetStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetStrategyEnum fromValue(String value) {
      for (BudgetStrategyEnum b : BudgetStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_STRATEGY = "budgetStrategy";
  @SerializedName(SERIALIZED_NAME_BUDGET_STRATEGY)
  private BudgetStrategyEnum budgetStrategy;

  /**
   * The pace of the budget renewal
   */
  @JsonAdapter(BudgetRenewalEnum.Adapter.class)
  public enum BudgetRenewalEnum {
    UNDEFINED("undefined"),
    
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    LIFETIME("lifetime");

    private String value;

    BudgetRenewalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetRenewalEnum fromValue(String value) {
      for (BudgetRenewalEnum b : BudgetRenewalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetRenewalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetRenewalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetRenewalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetRenewalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_RENEWAL = "budgetRenewal";
  @SerializedName(SERIALIZED_NAME_BUDGET_RENEWAL)
  private BudgetRenewalEnum budgetRenewal;

  /**
   * The pace at which the budget can be spent
   */
  @JsonAdapter(BudgetDeliverySmoothingEnum.Adapter.class)
  public enum BudgetDeliverySmoothingEnum {
    ACCELERATED("accelerated"),
    
    STANDARD("standard");

    private String value;

    BudgetDeliverySmoothingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetDeliverySmoothingEnum fromValue(String value) {
      for (BudgetDeliverySmoothingEnum b : BudgetDeliverySmoothingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetDeliverySmoothingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetDeliverySmoothingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetDeliverySmoothingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetDeliverySmoothingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_DELIVERY_SMOOTHING = "budgetDeliverySmoothing";
  @SerializedName(SERIALIZED_NAME_BUDGET_DELIVERY_SMOOTHING)
  private BudgetDeliverySmoothingEnum budgetDeliverySmoothing;

  /**
   * The delivery week for the budget
   */
  @JsonAdapter(BudgetDeliveryWeekEnum.Adapter.class)
  public enum BudgetDeliveryWeekEnum {
    UNDEFINED("undefined"),
    
    MONDAYTOSUNDAY("mondayToSunday"),
    
    TUESDAYTOMONDAY("tuesdayToMonday"),
    
    WEDNESDAYTOTUESDAY("wednesdayToTuesday"),
    
    THURSDAYTOWEDNESDAY("thursdayToWednesday"),
    
    FRIDAYTOTHURSDAY("fridayToThursday"),
    
    SATURDAYTOFRIDAY("saturdayToFriday"),
    
    SUNDAYTOSATURDAY("sundayToSaturday");

    private String value;

    BudgetDeliveryWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetDeliveryWeekEnum fromValue(String value) {
      for (BudgetDeliveryWeekEnum b : BudgetDeliveryWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetDeliveryWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetDeliveryWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetDeliveryWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetDeliveryWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_DELIVERY_WEEK = "budgetDeliveryWeek";
  @SerializedName(SERIALIZED_NAME_BUDGET_DELIVERY_WEEK)
  private BudgetDeliveryWeekEnum budgetDeliveryWeek;

  public static final String SERIALIZED_NAME_BUDGET_AMOUNT = "budgetAmount";
  @SerializedName(SERIALIZED_NAME_BUDGET_AMOUNT)
  private NillableDecimal budgetAmount;

  public PatchAdSetBudget() {
  }

  public PatchAdSetBudget budgetStrategy(BudgetStrategyEnum budgetStrategy) {
    
    this.budgetStrategy = budgetStrategy;
    return this;
  }

   /**
   * Whether your budget is capped or not
   * @return budgetStrategy
  **/
  @javax.annotation.Nullable

  public BudgetStrategyEnum getBudgetStrategy() {
    return budgetStrategy;
  }


  public void setBudgetStrategy(BudgetStrategyEnum budgetStrategy) {
    this.budgetStrategy = budgetStrategy;
  }


  public PatchAdSetBudget budgetRenewal(BudgetRenewalEnum budgetRenewal) {
    
    this.budgetRenewal = budgetRenewal;
    return this;
  }

   /**
   * The pace of the budget renewal
   * @return budgetRenewal
  **/
  @javax.annotation.Nullable

  public BudgetRenewalEnum getBudgetRenewal() {
    return budgetRenewal;
  }


  public void setBudgetRenewal(BudgetRenewalEnum budgetRenewal) {
    this.budgetRenewal = budgetRenewal;
  }


  public PatchAdSetBudget budgetDeliverySmoothing(BudgetDeliverySmoothingEnum budgetDeliverySmoothing) {
    
    this.budgetDeliverySmoothing = budgetDeliverySmoothing;
    return this;
  }

   /**
   * The pace at which the budget can be spent
   * @return budgetDeliverySmoothing
  **/
  @javax.annotation.Nullable

  public BudgetDeliverySmoothingEnum getBudgetDeliverySmoothing() {
    return budgetDeliverySmoothing;
  }


  public void setBudgetDeliverySmoothing(BudgetDeliverySmoothingEnum budgetDeliverySmoothing) {
    this.budgetDeliverySmoothing = budgetDeliverySmoothing;
  }


  public PatchAdSetBudget budgetDeliveryWeek(BudgetDeliveryWeekEnum budgetDeliveryWeek) {
    
    this.budgetDeliveryWeek = budgetDeliveryWeek;
    return this;
  }

   /**
   * The delivery week for the budget
   * @return budgetDeliveryWeek
  **/
  @javax.annotation.Nullable

  public BudgetDeliveryWeekEnum getBudgetDeliveryWeek() {
    return budgetDeliveryWeek;
  }


  public void setBudgetDeliveryWeek(BudgetDeliveryWeekEnum budgetDeliveryWeek) {
    this.budgetDeliveryWeek = budgetDeliveryWeek;
  }


  public PatchAdSetBudget budgetAmount(NillableDecimal budgetAmount) {
    
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * Get budgetAmount
   * @return budgetAmount
  **/
  @javax.annotation.Nullable

  public NillableDecimal getBudgetAmount() {
    return budgetAmount;
  }


  public void setBudgetAmount(NillableDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
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
   * @return the PatchAdSetBudget instance itself
   */
  public PatchAdSetBudget putAdditionalProperty(String key, Object value) {
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
    PatchAdSetBudget patchAdSetBudget = (PatchAdSetBudget) o;
    return Objects.equals(this.budgetStrategy, patchAdSetBudget.budgetStrategy) &&
        Objects.equals(this.budgetRenewal, patchAdSetBudget.budgetRenewal) &&
        Objects.equals(this.budgetDeliverySmoothing, patchAdSetBudget.budgetDeliverySmoothing) &&
        Objects.equals(this.budgetDeliveryWeek, patchAdSetBudget.budgetDeliveryWeek) &&
        Objects.equals(this.budgetAmount, patchAdSetBudget.budgetAmount)&&
        Objects.equals(this.additionalProperties, patchAdSetBudget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetStrategy, budgetRenewal, budgetDeliverySmoothing, budgetDeliveryWeek, budgetAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAdSetBudget {\n");
    sb.append("    budgetStrategy: ").append(toIndentedString(budgetStrategy)).append("\n");
    sb.append("    budgetRenewal: ").append(toIndentedString(budgetRenewal)).append("\n");
    sb.append("    budgetDeliverySmoothing: ").append(toIndentedString(budgetDeliverySmoothing)).append("\n");
    sb.append("    budgetDeliveryWeek: ").append(toIndentedString(budgetDeliveryWeek)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
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
    openapiFields.add("budgetStrategy");
    openapiFields.add("budgetRenewal");
    openapiFields.add("budgetDeliverySmoothing");
    openapiFields.add("budgetDeliveryWeek");
    openapiFields.add("budgetAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchAdSetBudget
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatchAdSetBudget.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchAdSetBudget is not found in the empty JSON string", PatchAdSetBudget.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("budgetStrategy") != null && !jsonObj.get("budgetStrategy").isJsonNull()) && !jsonObj.get("budgetStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budgetStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budgetStrategy").toString()));
      }
      if ((jsonObj.get("budgetRenewal") != null && !jsonObj.get("budgetRenewal").isJsonNull()) && !jsonObj.get("budgetRenewal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budgetRenewal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budgetRenewal").toString()));
      }
      if ((jsonObj.get("budgetDeliverySmoothing") != null && !jsonObj.get("budgetDeliverySmoothing").isJsonNull()) && !jsonObj.get("budgetDeliverySmoothing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budgetDeliverySmoothing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budgetDeliverySmoothing").toString()));
      }
      if ((jsonObj.get("budgetDeliveryWeek") != null && !jsonObj.get("budgetDeliveryWeek").isJsonNull()) && !jsonObj.get("budgetDeliveryWeek").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budgetDeliveryWeek` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budgetDeliveryWeek").toString()));
      }
      // validate the optional field `budgetAmount`
      if (jsonObj.get("budgetAmount") != null && !jsonObj.get("budgetAmount").isJsonNull()) {
        NillableDecimal.validateJsonObject(jsonObj.getAsJsonObject("budgetAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchAdSetBudget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchAdSetBudget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchAdSetBudget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchAdSetBudget.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchAdSetBudget>() {
           @Override
           public void write(JsonWriter out, PatchAdSetBudget value) throws IOException {
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
           public PatchAdSetBudget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PatchAdSetBudget instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PatchAdSetBudget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchAdSetBudget
  * @throws IOException if the JSON string is invalid with respect to PatchAdSetBudget
  */
  public static PatchAdSetBudget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchAdSetBudget.class);
  }

 /**
  * Convert an instance of PatchAdSetBudget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

