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
 * ad set bidding create model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAdSetBidding {
  public static final String SERIALIZED_NAME_BID_AMOUNT = "bidAmount";
  @SerializedName(SERIALIZED_NAME_BID_AMOUNT)
  private Double bidAmount;

  /**
   * How spend is controlled
   */
  @JsonAdapter(CostControllerEnum.Adapter.class)
  public enum CostControllerEnum {
    COS("COS"),
    
    CPC("CPC"),
    
    CPI("CPI"),
    
    CPM("CPM"),
    
    CPO("CPO"),
    
    CPSV("CPSV"),
    
    CPV("CPV"),
    
    DAILYBUDGET("dailyBudget");

    private String value;

    CostControllerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CostControllerEnum fromValue(String value) {
      for (CostControllerEnum b : CostControllerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CostControllerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CostControllerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CostControllerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CostControllerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COST_CONTROLLER = "costController";
  @SerializedName(SERIALIZED_NAME_COST_CONTROLLER)
  private CostControllerEnum costController;

  public CreateAdSetBidding() {
  }

  public CreateAdSetBidding bidAmount(Double bidAmount) {
    
    this.bidAmount = bidAmount;
    return this;
  }

   /**
   * Decimal value target relating to the &#x60;bidStrategy&#x60; specified. May be &#x60;null&#x60; for strategies that do not require a target value. At most 4 decimals are supported. Additional decimals are rounded.
   * @return bidAmount
  **/
  @javax.annotation.Nullable

  public Double getBidAmount() {
    return bidAmount;
  }


  public void setBidAmount(Double bidAmount) {
    this.bidAmount = bidAmount;
  }


  public CreateAdSetBidding costController(CostControllerEnum costController) {
    
    this.costController = costController;
    return this;
  }

   /**
   * How spend is controlled
   * @return costController
  **/
  @javax.annotation.Nonnull

  public CostControllerEnum getCostController() {
    return costController;
  }


  public void setCostController(CostControllerEnum costController) {
    this.costController = costController;
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
   * @return the CreateAdSetBidding instance itself
   */
  public CreateAdSetBidding putAdditionalProperty(String key, Object value) {
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
    CreateAdSetBidding createAdSetBidding = (CreateAdSetBidding) o;
    return Objects.equals(this.bidAmount, createAdSetBidding.bidAmount) &&
        Objects.equals(this.costController, createAdSetBidding.costController)&&
        Objects.equals(this.additionalProperties, createAdSetBidding.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidAmount, costController, additionalProperties);
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
    sb.append("class CreateAdSetBidding {\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
    sb.append("    costController: ").append(toIndentedString(costController)).append("\n");
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
    openapiFields.add("bidAmount");
    openapiFields.add("costController");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("costController");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAdSetBidding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAdSetBidding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAdSetBidding is not found in the empty JSON string", CreateAdSetBidding.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAdSetBidding.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("costController").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `costController` to be a primitive type in the JSON string but got `%s`", jsonObj.get("costController").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAdSetBidding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAdSetBidding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAdSetBidding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAdSetBidding.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAdSetBidding>() {
           @Override
           public void write(JsonWriter out, CreateAdSetBidding value) throws IOException {
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
           public CreateAdSetBidding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateAdSetBidding instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateAdSetBidding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAdSetBidding
  * @throws IOException if the JSON string is invalid with respect to CreateAdSetBidding
  */
  public static CreateAdSetBidding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAdSetBidding.class);
  }

 /**
  * Convert an instance of CreateAdSetBidding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
