/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2024_10.model.BudgetAutomationConfiguration;
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

import com.criteo.api.marketingsolutions.v2024_10.JSON;

/**
 * patch marketing campaign budet automation model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchMarketingCampaignBudgetAutomation {
  public static final String SERIALIZED_NAME_BUDGET_CONFIGURATION = "budgetConfiguration";
  @SerializedName(SERIALIZED_NAME_BUDGET_CONFIGURATION)
  private BudgetAutomationConfiguration budgetConfiguration;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public PatchMarketingCampaignBudgetAutomation() {
  }

  public PatchMarketingCampaignBudgetAutomation budgetConfiguration(BudgetAutomationConfiguration budgetConfiguration) {
    
    this.budgetConfiguration = budgetConfiguration;
    return this;
  }

   /**
   * Get budgetConfiguration
   * @return budgetConfiguration
  **/
  @javax.annotation.Nullable

  public BudgetAutomationConfiguration getBudgetConfiguration() {
    return budgetConfiguration;
  }


  public void setBudgetConfiguration(BudgetAutomationConfiguration budgetConfiguration) {
    this.budgetConfiguration = budgetConfiguration;
  }


  public PatchMarketingCampaignBudgetAutomation enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Budget automation for the marketing campaign enable
   * @return enable
  **/
  @javax.annotation.Nullable

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
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
   * @return the PatchMarketingCampaignBudgetAutomation instance itself
   */
  public PatchMarketingCampaignBudgetAutomation putAdditionalProperty(String key, Object value) {
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
    PatchMarketingCampaignBudgetAutomation patchMarketingCampaignBudgetAutomation = (PatchMarketingCampaignBudgetAutomation) o;
    return Objects.equals(this.budgetConfiguration, patchMarketingCampaignBudgetAutomation.budgetConfiguration) &&
        Objects.equals(this.enable, patchMarketingCampaignBudgetAutomation.enable)&&
        Objects.equals(this.additionalProperties, patchMarketingCampaignBudgetAutomation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetConfiguration, enable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchMarketingCampaignBudgetAutomation {\n");
    sb.append("    budgetConfiguration: ").append(toIndentedString(budgetConfiguration)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
    openapiFields.add("budgetConfiguration");
    openapiFields.add("enable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchMarketingCampaignBudgetAutomation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatchMarketingCampaignBudgetAutomation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchMarketingCampaignBudgetAutomation is not found in the empty JSON string", PatchMarketingCampaignBudgetAutomation.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `budgetConfiguration`
      if (jsonObj.get("budgetConfiguration") != null && !jsonObj.get("budgetConfiguration").isJsonNull()) {
        BudgetAutomationConfiguration.validateJsonObject(jsonObj.getAsJsonObject("budgetConfiguration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchMarketingCampaignBudgetAutomation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchMarketingCampaignBudgetAutomation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchMarketingCampaignBudgetAutomation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchMarketingCampaignBudgetAutomation.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchMarketingCampaignBudgetAutomation>() {
           @Override
           public void write(JsonWriter out, PatchMarketingCampaignBudgetAutomation value) throws IOException {
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
           public PatchMarketingCampaignBudgetAutomation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PatchMarketingCampaignBudgetAutomation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PatchMarketingCampaignBudgetAutomation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchMarketingCampaignBudgetAutomation
  * @throws IOException if the JSON string is invalid with respect to PatchMarketingCampaignBudgetAutomation
  */
  public static PatchMarketingCampaignBudgetAutomation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchMarketingCampaignBudgetAutomation.class);
  }

 /**
  * Convert an instance of PatchMarketingCampaignBudgetAutomation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

