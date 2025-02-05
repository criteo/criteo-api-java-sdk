/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * An ad is the binding that connects a creative with an ad set
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Ad {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creativeId";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId;

  public static final String SERIALIZED_NAME_AD_SET_ID = "adSetId";
  @SerializedName(SERIALIZED_NAME_AD_SET_ID)
  private String adSetId;

  /**
   * The inventory the Ad belongs to. Possible values are \&quot;Display\&quot; and \&quot;Native\&quot;. This is optional since this doesn&#39;t make sense for every creative type but will throw an error if not set for a dynamic creative.
   */
  @JsonAdapter(InventoryTypeEnum.Adapter.class)
  public enum InventoryTypeEnum {
    NATIVE("Native"),
    
    DISPLAY("Display"),
    
    VIDEO("Video");

    private String value;

    InventoryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InventoryTypeEnum fromValue(String value) {
      for (InventoryTypeEnum b : InventoryTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InventoryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InventoryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InventoryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InventoryTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventoryType";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private InventoryTypeEnum inventoryType;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public Ad() {
  }

  public Ad name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the ad
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Ad description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the ad
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Ad creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * The id of the Creative binded to this Ad
   * @return creativeId
  **/
  @javax.annotation.Nullable

  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public Ad adSetId(String adSetId) {
    
    this.adSetId = adSetId;
    return this;
  }

   /**
   * The id of the Ad Set binded to this Ad
   * @return adSetId
  **/
  @javax.annotation.Nullable

  public String getAdSetId() {
    return adSetId;
  }


  public void setAdSetId(String adSetId) {
    this.adSetId = adSetId;
  }


  public Ad inventoryType(InventoryTypeEnum inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

   /**
   * The inventory the Ad belongs to. Possible values are \&quot;Display\&quot; and \&quot;Native\&quot;. This is optional since this doesn&#39;t make sense for every creative type but will throw an error if not set for a dynamic creative.
   * @return inventoryType
  **/
  @javax.annotation.Nullable

  public InventoryTypeEnum getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(InventoryTypeEnum inventoryType) {
    this.inventoryType = inventoryType;
  }


  public Ad startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the ad will be launched  String must be in ISO8601 format
   * @return startDate
  **/
  @javax.annotation.Nullable

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Ad endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date when when we will stop to show this ad. If the end date is not specified (i.e. null) then the ad will go on forever  String must be in ISO8601 format
   * @return endDate
  **/
  @javax.annotation.Nullable

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Ad id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier (duplicate of the parent id).
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
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
   * @return the Ad instance itself
   */
  public Ad putAdditionalProperty(String key, Object value) {
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
    Ad ad = (Ad) o;
    return Objects.equals(this.name, ad.name) &&
        Objects.equals(this.description, ad.description) &&
        Objects.equals(this.creativeId, ad.creativeId) &&
        Objects.equals(this.adSetId, ad.adSetId) &&
        Objects.equals(this.inventoryType, ad.inventoryType) &&
        Objects.equals(this.startDate, ad.startDate) &&
        Objects.equals(this.endDate, ad.endDate) &&
        Objects.equals(this.id, ad.id)&&
        Objects.equals(this.additionalProperties, ad.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, creativeId, adSetId, inventoryType, startDate, endDate, id, additionalProperties);
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
    sb.append("class Ad {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    adSetId: ").append(toIndentedString(adSetId)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("creativeId");
    openapiFields.add("adSetId");
    openapiFields.add("inventoryType");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Ad
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Ad.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ad is not found in the empty JSON string", Ad.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("creativeId") != null && !jsonObj.get("creativeId").isJsonNull()) && !jsonObj.get("creativeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeId").toString()));
      }
      if ((jsonObj.get("adSetId") != null && !jsonObj.get("adSetId").isJsonNull()) && !jsonObj.get("adSetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adSetId").toString()));
      }
      if ((jsonObj.get("inventoryType") != null && !jsonObj.get("inventoryType").isJsonNull()) && !jsonObj.get("inventoryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inventoryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inventoryType").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ad.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ad' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ad> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ad.class));

       return (TypeAdapter<T>) new TypeAdapter<Ad>() {
           @Override
           public void write(JsonWriter out, Ad value) throws IOException {
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
           public Ad read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Ad instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Ad given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ad
  * @throws IOException if the JSON string is invalid with respect to Ad
  */
  public static Ad fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ad.class);
  }

 /**
  * Convert an instance of Ad to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

