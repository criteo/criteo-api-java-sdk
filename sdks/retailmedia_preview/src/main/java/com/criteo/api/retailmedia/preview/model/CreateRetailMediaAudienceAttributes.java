/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * Parameters needed to create an audience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRetailMediaAudienceAttributes {
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

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<String> brandIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds = null;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CreateRetailMediaAudienceAttributes() {
  }

  public CreateRetailMediaAudienceAttributes userType(UserTypeEnum userType) {
    
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


  public CreateRetailMediaAudienceAttributes lookbackWindow(LookbackWindowEnum lookbackWindow) {
    
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


  public CreateRetailMediaAudienceAttributes brandIds(List<String> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public CreateRetailMediaAudienceAttributes addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * The brands to target
   * @return brandIds
  **/
  @javax.annotation.Nullable

  public List<String> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(List<String> brandIds) {
    this.brandIds = brandIds;
  }


  public CreateRetailMediaAudienceAttributes categoryIds(List<String> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public CreateRetailMediaAudienceAttributes addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * The categories to target
   * @return categoryIds
  **/
  @javax.annotation.Nullable

  public List<String> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public CreateRetailMediaAudienceAttributes retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * ID of the retailer associated with this audience
   * @return retailerId
  **/
  @javax.annotation.Nonnull

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public CreateRetailMediaAudienceAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the audience.
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
   * @return the CreateRetailMediaAudienceAttributes instance itself
   */
  public CreateRetailMediaAudienceAttributes putAdditionalProperty(String key, Object value) {
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
    CreateRetailMediaAudienceAttributes createRetailMediaAudienceAttributes = (CreateRetailMediaAudienceAttributes) o;
    return Objects.equals(this.userType, createRetailMediaAudienceAttributes.userType) &&
        Objects.equals(this.lookbackWindow, createRetailMediaAudienceAttributes.lookbackWindow) &&
        Objects.equals(this.brandIds, createRetailMediaAudienceAttributes.brandIds) &&
        Objects.equals(this.categoryIds, createRetailMediaAudienceAttributes.categoryIds) &&
        Objects.equals(this.retailerId, createRetailMediaAudienceAttributes.retailerId) &&
        Objects.equals(this.name, createRetailMediaAudienceAttributes.name)&&
        Objects.equals(this.additionalProperties, createRetailMediaAudienceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, lookbackWindow, brandIds, categoryIds, retailerId, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRetailMediaAudienceAttributes {\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("userType");
    openapiFields.add("lookbackWindow");
    openapiFields.add("brandIds");
    openapiFields.add("categoryIds");
    openapiFields.add("retailerId");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userType");
    openapiRequiredFields.add("lookbackWindow");
    openapiRequiredFields.add("retailerId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateRetailMediaAudienceAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateRetailMediaAudienceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRetailMediaAudienceAttributes is not found in the empty JSON string", CreateRetailMediaAudienceAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRetailMediaAudienceAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("userType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userType").toString()));
      }
      if (!jsonObj.get("lookbackWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lookbackWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lookbackWindow").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("brandIds") != null && !jsonObj.get("brandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandIds` to be an array in the JSON string but got `%s`", jsonObj.get("brandIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categoryIds") != null && !jsonObj.get("categoryIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryIds` to be an array in the JSON string but got `%s`", jsonObj.get("categoryIds").toString()));
      }
      if (!jsonObj.get("retailerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRetailMediaAudienceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRetailMediaAudienceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRetailMediaAudienceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRetailMediaAudienceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRetailMediaAudienceAttributes>() {
           @Override
           public void write(JsonWriter out, CreateRetailMediaAudienceAttributes value) throws IOException {
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
           public CreateRetailMediaAudienceAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateRetailMediaAudienceAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateRetailMediaAudienceAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRetailMediaAudienceAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateRetailMediaAudienceAttributes
  */
  public static CreateRetailMediaAudienceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRetailMediaAudienceAttributes.class);
  }

 /**
  * Convert an instance of CreateRetailMediaAudienceAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

