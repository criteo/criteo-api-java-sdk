/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
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

import com.criteo.api.retailmedia.v2024_01.JSON;

/**
 * Audience definition of people based on what they visited
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RmLegacySegmentUserBehaviorV2 {
  /**
   * Type of shopper activity used to generate the audience.
   */
  @JsonAdapter(UserActionEnum.Adapter.class)
  public enum UserActionEnum {
    BUY("buy"),
    
    VIEW("view"),
    
    ADDTOCART("addToCart");

    private String value;

    UserActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserActionEnum fromValue(String value) {
      for (UserActionEnum b : UserActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_ACTION = "userAction";
  @SerializedName(SERIALIZED_NAME_USER_ACTION)
  private UserActionEnum userAction;

  /**
   * Length of lookback window
   */
  @JsonAdapter(LookbackWindowEnum.Adapter.class)
  public enum LookbackWindowEnum {
    P7D("P7D"),
    
    P14D("P14D"),
    
    P30D("P30D"),
    
    P45D("P45D"),
    
    P60D("P60D"),
    
    P90D("P90D"),
    
    P120D("P120D"),
    
    P150D("P150D"),
    
    P180D("P180D");

    private String value;

    LookbackWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LookbackWindowEnum fromValue(String value) {
      for (LookbackWindowEnum b : LookbackWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LookbackWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LookbackWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LookbackWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LookbackWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOOKBACK_WINDOW = "lookbackWindow";
  @SerializedName(SERIALIZED_NAME_LOOKBACK_WINDOW)
  private LookbackWindowEnum lookbackWindow;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private Set<Integer> categoryIds = null;

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private Set<Long> brandIds = null;

  public static final String SERIALIZED_NAME_MIN_PRICE = "minPrice";
  @SerializedName(SERIALIZED_NAME_MIN_PRICE)
  private Double minPrice;

  public static final String SERIALIZED_NAME_MAX_PRICE = "maxPrice";
  @SerializedName(SERIALIZED_NAME_MAX_PRICE)
  private Double maxPrice;

  public RmLegacySegmentUserBehaviorV2() {
  }

  public RmLegacySegmentUserBehaviorV2 userAction(UserActionEnum userAction) {
    
    this.userAction = userAction;
    return this;
  }

   /**
   * Type of shopper activity used to generate the audience.
   * @return userAction
  **/
  @javax.annotation.Nonnull

  public UserActionEnum getUserAction() {
    return userAction;
  }


  public void setUserAction(UserActionEnum userAction) {
    this.userAction = userAction;
  }


  public RmLegacySegmentUserBehaviorV2 lookbackWindow(LookbackWindowEnum lookbackWindow) {
    
    this.lookbackWindow = lookbackWindow;
    return this;
  }

   /**
   * Length of lookback window
   * @return lookbackWindow
  **/
  @javax.annotation.Nonnull

  public LookbackWindowEnum getLookbackWindow() {
    return lookbackWindow;
  }


  public void setLookbackWindow(LookbackWindowEnum lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }


  public RmLegacySegmentUserBehaviorV2 categoryIds(Set<Integer> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public RmLegacySegmentUserBehaviorV2 addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = null;
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * The categories to target
   * @return categoryIds
  **/
  @javax.annotation.Nullable

  public Set<Integer> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public RmLegacySegmentUserBehaviorV2 brandIds(Set<Long> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public RmLegacySegmentUserBehaviorV2 addBrandIdsItem(Long brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = null;
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * The brands to target
   * @return brandIds
  **/
  @javax.annotation.Nullable

  public Set<Long> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(Set<Long> brandIds) {
    this.brandIds = brandIds;
  }


  public RmLegacySegmentUserBehaviorV2 minPrice(Double minPrice) {
    
    this.minPrice = minPrice;
    return this;
  }

   /**
   * The min price of targeted skus.
   * @return minPrice
  **/
  @javax.annotation.Nullable

  public Double getMinPrice() {
    return minPrice;
  }


  public void setMinPrice(Double minPrice) {
    this.minPrice = minPrice;
  }


  public RmLegacySegmentUserBehaviorV2 maxPrice(Double maxPrice) {
    
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * The max price of targeted skus.
   * @return maxPrice
  **/
  @javax.annotation.Nullable

  public Double getMaxPrice() {
    return maxPrice;
  }


  public void setMaxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
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
   * @return the RmLegacySegmentUserBehaviorV2 instance itself
   */
  public RmLegacySegmentUserBehaviorV2 putAdditionalProperty(String key, Object value) {
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
    RmLegacySegmentUserBehaviorV2 rmLegacySegmentUserBehaviorV2 = (RmLegacySegmentUserBehaviorV2) o;
    return Objects.equals(this.userAction, rmLegacySegmentUserBehaviorV2.userAction) &&
        Objects.equals(this.lookbackWindow, rmLegacySegmentUserBehaviorV2.lookbackWindow) &&
        Objects.equals(this.categoryIds, rmLegacySegmentUserBehaviorV2.categoryIds) &&
        Objects.equals(this.brandIds, rmLegacySegmentUserBehaviorV2.brandIds) &&
        Objects.equals(this.minPrice, rmLegacySegmentUserBehaviorV2.minPrice) &&
        Objects.equals(this.maxPrice, rmLegacySegmentUserBehaviorV2.maxPrice)&&
        Objects.equals(this.additionalProperties, rmLegacySegmentUserBehaviorV2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAction, lookbackWindow, categoryIds, brandIds, minPrice, maxPrice, additionalProperties);
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
    sb.append("class RmLegacySegmentUserBehaviorV2 {\n");
    sb.append("    userAction: ").append(toIndentedString(userAction)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
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
    openapiFields.add("userAction");
    openapiFields.add("lookbackWindow");
    openapiFields.add("categoryIds");
    openapiFields.add("brandIds");
    openapiFields.add("minPrice");
    openapiFields.add("maxPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userAction");
    openapiRequiredFields.add("lookbackWindow");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RmLegacySegmentUserBehaviorV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RmLegacySegmentUserBehaviorV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmLegacySegmentUserBehaviorV2 is not found in the empty JSON string", RmLegacySegmentUserBehaviorV2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RmLegacySegmentUserBehaviorV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("userAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userAction").toString()));
      }
      if (!jsonObj.get("lookbackWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lookbackWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lookbackWindow").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categoryIds") != null && !jsonObj.get("categoryIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryIds` to be an array in the JSON string but got `%s`", jsonObj.get("categoryIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("brandIds") != null && !jsonObj.get("brandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandIds` to be an array in the JSON string but got `%s`", jsonObj.get("brandIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmLegacySegmentUserBehaviorV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmLegacySegmentUserBehaviorV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmLegacySegmentUserBehaviorV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmLegacySegmentUserBehaviorV2.class));

       return (TypeAdapter<T>) new TypeAdapter<RmLegacySegmentUserBehaviorV2>() {
           @Override
           public void write(JsonWriter out, RmLegacySegmentUserBehaviorV2 value) throws IOException {
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
           public RmLegacySegmentUserBehaviorV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RmLegacySegmentUserBehaviorV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RmLegacySegmentUserBehaviorV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmLegacySegmentUserBehaviorV2
  * @throws IOException if the JSON string is invalid with respect to RmLegacySegmentUserBehaviorV2
  */
  public static RmLegacySegmentUserBehaviorV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmLegacySegmentUserBehaviorV2.class);
  }

 /**
  * Convert an instance of RmLegacySegmentUserBehaviorV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

