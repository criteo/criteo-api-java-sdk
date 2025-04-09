/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2025-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2025_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2025_01.model.AdSetTargetingV24Q1;
import com.criteo.api.marketingsolutions.v2025_01.model.PatchAdSetBiddingV24Q1;
import com.criteo.api.marketingsolutions.v2025_01.model.PatchAdSetBudgetV24Q1;
import com.criteo.api.marketingsolutions.v2025_01.model.PatchAdSetSchedulingV24Q1;
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

import com.criteo.api.marketingsolutions.v2025_01.JSON;

/**
 * ad set patch model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchAdSetV24Q1 {
  public static final String SERIALIZED_NAME_BIDDING = "bidding";
  @SerializedName(SERIALIZED_NAME_BIDDING)
  private PatchAdSetBiddingV24Q1 bidding;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private PatchAdSetBudgetV24Q1 budget;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";
  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private PatchAdSetSchedulingV24Q1 scheduling;

  public static final String SERIALIZED_NAME_TARGETING = "targeting";
  @SerializedName(SERIALIZED_NAME_TARGETING)
  private AdSetTargetingV24Q1 targeting;

  public PatchAdSetV24Q1() {
  }

  public PatchAdSetV24Q1 bidding(PatchAdSetBiddingV24Q1 bidding) {
    
    this.bidding = bidding;
    return this;
  }

   /**
   * Get bidding
   * @return bidding
  **/
  @javax.annotation.Nullable

  public PatchAdSetBiddingV24Q1 getBidding() {
    return bidding;
  }


  public void setBidding(PatchAdSetBiddingV24Q1 bidding) {
    this.bidding = bidding;
  }


  public PatchAdSetV24Q1 budget(PatchAdSetBudgetV24Q1 budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable

  public PatchAdSetBudgetV24Q1 getBudget() {
    return budget;
  }


  public void setBudget(PatchAdSetBudgetV24Q1 budget) {
    this.budget = budget;
  }


  public PatchAdSetV24Q1 name(String name) {
    
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


  public PatchAdSetV24Q1 scheduling(PatchAdSetSchedulingV24Q1 scheduling) {
    
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @javax.annotation.Nullable

  public PatchAdSetSchedulingV24Q1 getScheduling() {
    return scheduling;
  }


  public void setScheduling(PatchAdSetSchedulingV24Q1 scheduling) {
    this.scheduling = scheduling;
  }


  public PatchAdSetV24Q1 targeting(AdSetTargetingV24Q1 targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable

  public AdSetTargetingV24Q1 getTargeting() {
    return targeting;
  }


  public void setTargeting(AdSetTargetingV24Q1 targeting) {
    this.targeting = targeting;
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
   * @return the PatchAdSetV24Q1 instance itself
   */
  public PatchAdSetV24Q1 putAdditionalProperty(String key, Object value) {
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
    PatchAdSetV24Q1 patchAdSetV24Q1 = (PatchAdSetV24Q1) o;
    return Objects.equals(this.bidding, patchAdSetV24Q1.bidding) &&
        Objects.equals(this.budget, patchAdSetV24Q1.budget) &&
        Objects.equals(this.name, patchAdSetV24Q1.name) &&
        Objects.equals(this.scheduling, patchAdSetV24Q1.scheduling) &&
        Objects.equals(this.targeting, patchAdSetV24Q1.targeting)&&
        Objects.equals(this.additionalProperties, patchAdSetV24Q1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidding, budget, name, scheduling, targeting, additionalProperties);
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
    sb.append("class PatchAdSetV24Q1 {\n");
    sb.append("    bidding: ").append(toIndentedString(bidding)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
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
    openapiFields.add("bidding");
    openapiFields.add("budget");
    openapiFields.add("name");
    openapiFields.add("scheduling");
    openapiFields.add("targeting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchAdSetV24Q1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatchAdSetV24Q1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchAdSetV24Q1 is not found in the empty JSON string", PatchAdSetV24Q1.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bidding`
      if (jsonObj.get("bidding") != null && !jsonObj.get("bidding").isJsonNull()) {
        PatchAdSetBiddingV24Q1.validateJsonObject(jsonObj.getAsJsonObject("bidding"));
      }
      // validate the optional field `budget`
      if (jsonObj.get("budget") != null && !jsonObj.get("budget").isJsonNull()) {
        PatchAdSetBudgetV24Q1.validateJsonObject(jsonObj.getAsJsonObject("budget"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `scheduling`
      if (jsonObj.get("scheduling") != null && !jsonObj.get("scheduling").isJsonNull()) {
        PatchAdSetSchedulingV24Q1.validateJsonObject(jsonObj.getAsJsonObject("scheduling"));
      }
      // validate the optional field `targeting`
      if (jsonObj.get("targeting") != null && !jsonObj.get("targeting").isJsonNull()) {
        AdSetTargetingV24Q1.validateJsonObject(jsonObj.getAsJsonObject("targeting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchAdSetV24Q1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchAdSetV24Q1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchAdSetV24Q1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchAdSetV24Q1.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchAdSetV24Q1>() {
           @Override
           public void write(JsonWriter out, PatchAdSetV24Q1 value) throws IOException {
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
           public PatchAdSetV24Q1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PatchAdSetV24Q1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PatchAdSetV24Q1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchAdSetV24Q1
  * @throws IOException if the JSON string is invalid with respect to PatchAdSetV24Q1
  */
  public static PatchAdSetV24Q1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchAdSetV24Q1.class);
  }

 /**
  * Convert an instance of PatchAdSetV24Q1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

