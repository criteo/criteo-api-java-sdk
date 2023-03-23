/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
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

import com.criteo.api.retailmedia.v2022_07.JSON;

/**
 * Details about a user behavior retail media audience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserBehaviorDetails {
  /**
   * Type of target
   */
  @JsonAdapter(TargetTypeEnum.Adapter.class)
  public enum TargetTypeEnum {
    BRAND("brand"),
    
    CATEGORY("category");

    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetTypeEnum fromValue(String value) {
      for (TargetTypeEnum b : TargetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_TYPE = "targetType";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private TargetTypeEnum targetType;

  public static final String SERIALIZED_NAME_TARGET_IDS = "targetIds";
  @SerializedName(SERIALIZED_NAME_TARGET_IDS)
  private List<String> targetIds = new ArrayList<>();

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

  /**
   * Type of the user
   */
  @JsonAdapter(UserTypeEnum.Adapter.class)
  public enum UserTypeEnum {
    VIEWER("viewer"),
    
    BUYER("buyer");

    private String value;

    UserTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserTypeEnum fromValue(String value) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private UserTypeEnum userType;

  public UserBehaviorDetails() {
  }

  public UserBehaviorDetails targetType(TargetTypeEnum targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Type of target
   * @return targetType
  **/
  @javax.annotation.Nonnull

  public TargetTypeEnum getTargetType() {
    return targetType;
  }


  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }


  public UserBehaviorDetails targetIds(List<String> targetIds) {
    
    this.targetIds = targetIds;
    return this;
  }

  public UserBehaviorDetails addTargetIdsItem(String targetIdsItem) {
    this.targetIds.add(targetIdsItem);
    return this;
  }

   /**
   * ist of ids for the target type
   * @return targetIds
  **/
  @javax.annotation.Nonnull

  public List<String> getTargetIds() {
    return targetIds;
  }


  public void setTargetIds(List<String> targetIds) {
    this.targetIds = targetIds;
  }


  public UserBehaviorDetails lookbackWindow(LookbackWindowEnum lookbackWindow) {
    
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


  public UserBehaviorDetails userType(UserTypeEnum userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Type of the user
   * @return userType
  **/
  @javax.annotation.Nonnull

  public UserTypeEnum getUserType() {
    return userType;
  }


  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
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
   * @return the UserBehaviorDetails instance itself
   */
  public UserBehaviorDetails putAdditionalProperty(String key, Object value) {
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
    UserBehaviorDetails userBehaviorDetails = (UserBehaviorDetails) o;
    return Objects.equals(this.targetType, userBehaviorDetails.targetType) &&
        Objects.equals(this.targetIds, userBehaviorDetails.targetIds) &&
        Objects.equals(this.lookbackWindow, userBehaviorDetails.lookbackWindow) &&
        Objects.equals(this.userType, userBehaviorDetails.userType)&&
        Objects.equals(this.additionalProperties, userBehaviorDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetType, targetIds, lookbackWindow, userType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBehaviorDetails {\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
    openapiFields.add("targetType");
    openapiFields.add("targetIds");
    openapiFields.add("lookbackWindow");
    openapiFields.add("userType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("targetType");
    openapiRequiredFields.add("targetIds");
    openapiRequiredFields.add("lookbackWindow");
    openapiRequiredFields.add("userType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserBehaviorDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserBehaviorDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserBehaviorDetails is not found in the empty JSON string", UserBehaviorDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserBehaviorDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("targetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("targetIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("targetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetIds` to be an array in the JSON string but got `%s`", jsonObj.get("targetIds").toString()));
      }
      if (!jsonObj.get("lookbackWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lookbackWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lookbackWindow").toString()));
      }
      if (!jsonObj.get("userType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserBehaviorDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserBehaviorDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserBehaviorDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserBehaviorDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UserBehaviorDetails>() {
           @Override
           public void write(JsonWriter out, UserBehaviorDetails value) throws IOException {
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
           public UserBehaviorDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserBehaviorDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserBehaviorDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserBehaviorDetails
  * @throws IOException if the JSON string is invalid with respect to UserBehaviorDetails
  */
  public static UserBehaviorDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserBehaviorDetails.class);
  }

 /**
  * Convert an instance of UserBehaviorDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

