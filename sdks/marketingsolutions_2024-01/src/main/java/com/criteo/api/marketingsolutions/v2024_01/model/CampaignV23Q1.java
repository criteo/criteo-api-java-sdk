/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2024_01.model.CampaignBudgetAutomationV23Q1;
import com.criteo.api.marketingsolutions.v2024_01.model.CampaignSpendLimitV23Q1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.marketingsolutions.v2024_01.JSON;

/**
 * campaign read model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignV23Q1 {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_BUDGET_AUTOMATION = "budgetAutomation";
  @SerializedName(SERIALIZED_NAME_BUDGET_AUTOMATION)
  private CampaignBudgetAutomationV23Q1 budgetAutomation;

  /**
   * Gets or Sets goal
   */
  @JsonAdapter(GoalEnum.Adapter.class)
  public enum GoalEnum {
    UNSPECIFIED("unspecified"),
    
    ACQUISITION("acquisition"),
    
    RETENTION("retention");

    private String value;

    GoalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GoalEnum fromValue(String value) {
      for (GoalEnum b : GoalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GoalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GoalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GoalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GoalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GOAL = "goal";
  @SerializedName(SERIALIZED_NAME_GOAL)
  private GoalEnum goal;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPEND_LIMIT = "spendLimit";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT)
  private CampaignSpendLimitV23Q1 spendLimit;

  public CampaignV23Q1() {
  }

  public CampaignV23Q1 advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @javax.annotation.Nullable

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CampaignV23Q1 budgetAutomation(CampaignBudgetAutomationV23Q1 budgetAutomation) {
    
    this.budgetAutomation = budgetAutomation;
    return this;
  }

   /**
   * Get budgetAutomation
   * @return budgetAutomation
  **/
  @javax.annotation.Nullable

  public CampaignBudgetAutomationV23Q1 getBudgetAutomation() {
    return budgetAutomation;
  }


  public void setBudgetAutomation(CampaignBudgetAutomationV23Q1 budgetAutomation) {
    this.budgetAutomation = budgetAutomation;
  }


  public CampaignV23Q1 goal(GoalEnum goal) {
    
    this.goal = goal;
    return this;
  }

   /**
   * Get goal
   * @return goal
  **/
  @javax.annotation.Nullable

  public GoalEnum getGoal() {
    return goal;
  }


  public void setGoal(GoalEnum goal) {
    this.goal = goal;
  }


  public CampaignV23Q1 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity (duplicate of the parent id).
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CampaignV23Q1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CampaignV23Q1 spendLimit(CampaignSpendLimitV23Q1 spendLimit) {
    
    this.spendLimit = spendLimit;
    return this;
  }

   /**
   * Get spendLimit
   * @return spendLimit
  **/
  @javax.annotation.Nullable

  public CampaignSpendLimitV23Q1 getSpendLimit() {
    return spendLimit;
  }


  public void setSpendLimit(CampaignSpendLimitV23Q1 spendLimit) {
    this.spendLimit = spendLimit;
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
   * @return the CampaignV23Q1 instance itself
   */
  public CampaignV23Q1 putAdditionalProperty(String key, Object value) {
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
    CampaignV23Q1 campaignV23Q1 = (CampaignV23Q1) o;
    return Objects.equals(this.advertiserId, campaignV23Q1.advertiserId) &&
        Objects.equals(this.budgetAutomation, campaignV23Q1.budgetAutomation) &&
        Objects.equals(this.goal, campaignV23Q1.goal) &&
        Objects.equals(this.id, campaignV23Q1.id) &&
        Objects.equals(this.name, campaignV23Q1.name) &&
        Objects.equals(this.spendLimit, campaignV23Q1.spendLimit)&&
        Objects.equals(this.additionalProperties, campaignV23Q1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budgetAutomation, goal, id, name, spendLimit, additionalProperties);
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
    sb.append("class CampaignV23Q1 {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budgetAutomation: ").append(toIndentedString(budgetAutomation)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spendLimit: ").append(toIndentedString(spendLimit)).append("\n");
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
    openapiFields.add("advertiserId");
    openapiFields.add("budgetAutomation");
    openapiFields.add("goal");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("spendLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignV23Q1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignV23Q1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignV23Q1 is not found in the empty JSON string", CampaignV23Q1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("advertiserId") != null && !jsonObj.get("advertiserId").isJsonNull()) && !jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      // validate the optional field `budgetAutomation`
      if (jsonObj.get("budgetAutomation") != null && !jsonObj.get("budgetAutomation").isJsonNull()) {
        CampaignBudgetAutomationV23Q1.validateJsonObject(jsonObj.getAsJsonObject("budgetAutomation"));
      }
      if ((jsonObj.get("goal") != null && !jsonObj.get("goal").isJsonNull()) && !jsonObj.get("goal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goal").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `spendLimit`
      if (jsonObj.get("spendLimit") != null && !jsonObj.get("spendLimit").isJsonNull()) {
        CampaignSpendLimitV23Q1.validateJsonObject(jsonObj.getAsJsonObject("spendLimit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignV23Q1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignV23Q1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignV23Q1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignV23Q1.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignV23Q1>() {
           @Override
           public void write(JsonWriter out, CampaignV23Q1 value) throws IOException {
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
           public CampaignV23Q1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignV23Q1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignV23Q1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignV23Q1
  * @throws IOException if the JSON string is invalid with respect to CampaignV23Q1
  */
  public static CampaignV23Q1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignV23Q1.class);
  }

 /**
  * Convert an instance of CampaignV23Q1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

