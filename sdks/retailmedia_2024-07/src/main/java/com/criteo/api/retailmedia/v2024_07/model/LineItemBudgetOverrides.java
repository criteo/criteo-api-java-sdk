/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_07.model.DailyLineItemBudgetOverride;
import com.criteo.api.retailmedia.v2024_07.model.MonthlyLineItemBudegetOverride;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.retailmedia.v2024_07.JSON;

/**
 * Line item budget overrides including Monthly and Daily budget overrides.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LineItemBudgetOverrides {
  public static final String SERIALIZED_NAME_MONTHLY_LINE_ITEM_BUDGET_OVERRIDES = "monthlyLineItemBudgetOverrides";
  @SerializedName(SERIALIZED_NAME_MONTHLY_LINE_ITEM_BUDGET_OVERRIDES)
  private List<MonthlyLineItemBudegetOverride> monthlyLineItemBudgetOverrides = new ArrayList<>();

  public static final String SERIALIZED_NAME_DAILY_LINE_ITEM_BUDGET_OVERRIDES = "dailyLineItemBudgetOverrides";
  @SerializedName(SERIALIZED_NAME_DAILY_LINE_ITEM_BUDGET_OVERRIDES)
  private List<DailyLineItemBudgetOverride> dailyLineItemBudgetOverrides = new ArrayList<>();

  public LineItemBudgetOverrides() {
  }

  public LineItemBudgetOverrides monthlyLineItemBudgetOverrides(List<MonthlyLineItemBudegetOverride> monthlyLineItemBudgetOverrides) {
    
    this.monthlyLineItemBudgetOverrides = monthlyLineItemBudgetOverrides;
    return this;
  }

  public LineItemBudgetOverrides addMonthlyLineItemBudgetOverridesItem(MonthlyLineItemBudegetOverride monthlyLineItemBudgetOverridesItem) {
    this.monthlyLineItemBudgetOverrides.add(monthlyLineItemBudgetOverridesItem);
    return this;
  }

   /**
   * Line item budget override monthly part, chronological order restricted.
   * @return monthlyLineItemBudgetOverrides
  **/
  @javax.annotation.Nonnull

  public List<MonthlyLineItemBudegetOverride> getMonthlyLineItemBudgetOverrides() {
    return monthlyLineItemBudgetOverrides;
  }


  public void setMonthlyLineItemBudgetOverrides(List<MonthlyLineItemBudegetOverride> monthlyLineItemBudgetOverrides) {
    this.monthlyLineItemBudgetOverrides = monthlyLineItemBudgetOverrides;
  }


  public LineItemBudgetOverrides dailyLineItemBudgetOverrides(List<DailyLineItemBudgetOverride> dailyLineItemBudgetOverrides) {
    
    this.dailyLineItemBudgetOverrides = dailyLineItemBudgetOverrides;
    return this;
  }

  public LineItemBudgetOverrides addDailyLineItemBudgetOverridesItem(DailyLineItemBudgetOverride dailyLineItemBudgetOverridesItem) {
    this.dailyLineItemBudgetOverrides.add(dailyLineItemBudgetOverridesItem);
    return this;
  }

   /**
   * Line item budget override daily part, chronological order restricted.
   * @return dailyLineItemBudgetOverrides
  **/
  @javax.annotation.Nonnull

  public List<DailyLineItemBudgetOverride> getDailyLineItemBudgetOverrides() {
    return dailyLineItemBudgetOverrides;
  }


  public void setDailyLineItemBudgetOverrides(List<DailyLineItemBudgetOverride> dailyLineItemBudgetOverrides) {
    this.dailyLineItemBudgetOverrides = dailyLineItemBudgetOverrides;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemBudgetOverrides lineItemBudgetOverrides = (LineItemBudgetOverrides) o;
    return Objects.equals(this.monthlyLineItemBudgetOverrides, lineItemBudgetOverrides.monthlyLineItemBudgetOverrides) &&
        Objects.equals(this.dailyLineItemBudgetOverrides, lineItemBudgetOverrides.dailyLineItemBudgetOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyLineItemBudgetOverrides, dailyLineItemBudgetOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemBudgetOverrides {\n");
    sb.append("    monthlyLineItemBudgetOverrides: ").append(toIndentedString(monthlyLineItemBudgetOverrides)).append("\n");
    sb.append("    dailyLineItemBudgetOverrides: ").append(toIndentedString(dailyLineItemBudgetOverrides)).append("\n");
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
    openapiFields.add("monthlyLineItemBudgetOverrides");
    openapiFields.add("dailyLineItemBudgetOverrides");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("monthlyLineItemBudgetOverrides");
    openapiRequiredFields.add("dailyLineItemBudgetOverrides");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LineItemBudgetOverrides
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LineItemBudgetOverrides.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItemBudgetOverrides is not found in the empty JSON string", LineItemBudgetOverrides.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LineItemBudgetOverrides.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LineItemBudgetOverrides` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LineItemBudgetOverrides.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("monthlyLineItemBudgetOverrides").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthlyLineItemBudgetOverrides` to be an array in the JSON string but got `%s`", jsonObj.get("monthlyLineItemBudgetOverrides").toString()));
      }

      JsonArray jsonArraymonthlyLineItemBudgetOverrides = jsonObj.getAsJsonArray("monthlyLineItemBudgetOverrides");
      // validate the required field `monthlyLineItemBudgetOverrides` (array)
      for (int i = 0; i < jsonArraymonthlyLineItemBudgetOverrides.size(); i++) {
        MonthlyLineItemBudegetOverride.validateJsonObject(jsonArraymonthlyLineItemBudgetOverrides.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("dailyLineItemBudgetOverrides").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dailyLineItemBudgetOverrides` to be an array in the JSON string but got `%s`", jsonObj.get("dailyLineItemBudgetOverrides").toString()));
      }

      JsonArray jsonArraydailyLineItemBudgetOverrides = jsonObj.getAsJsonArray("dailyLineItemBudgetOverrides");
      // validate the required field `dailyLineItemBudgetOverrides` (array)
      for (int i = 0; i < jsonArraydailyLineItemBudgetOverrides.size(); i++) {
        DailyLineItemBudgetOverride.validateJsonObject(jsonArraydailyLineItemBudgetOverrides.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LineItemBudgetOverrides.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItemBudgetOverrides' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItemBudgetOverrides> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItemBudgetOverrides.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItemBudgetOverrides>() {
           @Override
           public void write(JsonWriter out, LineItemBudgetOverrides value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LineItemBudgetOverrides read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LineItemBudgetOverrides given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LineItemBudgetOverrides
  * @throws IOException if the JSON string is invalid with respect to LineItemBudgetOverrides
  */
  public static LineItemBudgetOverrides fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItemBudgetOverrides.class);
  }

 /**
  * Convert an instance of LineItemBudgetOverrides to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

