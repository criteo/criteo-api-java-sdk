/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2023_01.model.TemplateVariableValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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

import com.criteo.api.retailmedia.v2023_01.JSON;

/**
 * A creative entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Creative202207 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Creative Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    READY("Ready"),
    
    IN_USE("In_Use"),
    
    ARCHIVED("Archived"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private Integer retailerId;

  public static final String SERIALIZED_NAME_ASSOCIATED_LINE_ITEM_IDS = "associatedLineItemIds";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_LINE_ITEM_IDS)
  private List<String> associatedLineItemIds = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * Creative format type
   */
  @JsonAdapter(CreativeFormatTypeEnum.Adapter.class)
  public enum CreativeFormatTypeEnum {
    UNKNOWN("Unknown"),
    
    FLAGSHIP("FlagShip"),
    
    SHOWCASE("Showcase"),
    
    SPONSOREDPRODUCTS("SponsoredProducts"),
    
    BUTTERFLY("Butterfly"),
    
    BUNDLEBOOST("BundleBoost"),
    
    IAB("IAB"),
    
    CUSTOM("CUSTOM"),
    
    DISPLAYPANEL("DisplayPanel"),
    
    DIGITALSHELFTALKER("DigitalShelfTalker");

    private String value;

    CreativeFormatTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreativeFormatTypeEnum fromValue(String value) {
      for (CreativeFormatTypeEnum b : CreativeFormatTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CreativeFormatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreativeFormatTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreativeFormatTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreativeFormatTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREATIVE_FORMAT_TYPE = "creativeFormatType";
  @SerializedName(SERIALIZED_NAME_CREATIVE_FORMAT_TYPE)
  private CreativeFormatTypeEnum creativeFormatType;

  /**
   * Gets or Sets environments
   */
  @JsonAdapter(EnvironmentsEnum.Adapter.class)
  public enum EnvironmentsEnum {
    WEB("Web"),
    
    MOBILE("Mobile"),
    
    APP("App");

    private String value;

    EnvironmentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentsEnum fromValue(String value) {
      for (EnvironmentsEnum b : EnvironmentsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<EnvironmentsEnum> environments = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES = "templateVariableValues";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES)
  private List<TemplateVariableValue> templateVariableValues = new ArrayList<>();

  public Creative202207() {
  }

  public Creative202207 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Creative202207 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Creative Status
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Creative202207 brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Brand Id
   * @return brandId
  **/
  @javax.annotation.Nullable

  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public Creative202207 retailerId(Integer retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Retailer Id
   * @return retailerId
  **/
  @javax.annotation.Nonnull

  public Integer getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(Integer retailerId) {
    this.retailerId = retailerId;
  }


  public Creative202207 associatedLineItemIds(List<String> associatedLineItemIds) {
    
    this.associatedLineItemIds = associatedLineItemIds;
    return this;
  }

  public Creative202207 addAssociatedLineItemIdsItem(String associatedLineItemIdsItem) {
    if (this.associatedLineItemIds == null) {
      this.associatedLineItemIds = new ArrayList<>();
    }
    this.associatedLineItemIds.add(associatedLineItemIdsItem);
    return this;
  }

   /**
   * Associated Line Item Ids
   * @return associatedLineItemIds
  **/
  @javax.annotation.Nullable

  public List<String> getAssociatedLineItemIds() {
    return associatedLineItemIds;
  }


  public void setAssociatedLineItemIds(List<String> associatedLineItemIds) {
    this.associatedLineItemIds = associatedLineItemIds;
  }


  public Creative202207 updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Updated at time
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Creative202207 creativeFormatType(CreativeFormatTypeEnum creativeFormatType) {
    
    this.creativeFormatType = creativeFormatType;
    return this;
  }

   /**
   * Creative format type
   * @return creativeFormatType
  **/
  @javax.annotation.Nonnull

  public CreativeFormatTypeEnum getCreativeFormatType() {
    return creativeFormatType;
  }


  public void setCreativeFormatType(CreativeFormatTypeEnum creativeFormatType) {
    this.creativeFormatType = creativeFormatType;
  }


  public Creative202207 environments(List<EnvironmentsEnum> environments) {
    
    this.environments = environments;
    return this;
  }

  public Creative202207 addEnvironmentsItem(EnvironmentsEnum environmentsItem) {
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * Environment type (e.g. mobile, web, app)
   * @return environments
  **/
  @javax.annotation.Nonnull

  public List<EnvironmentsEnum> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<EnvironmentsEnum> environments) {
    this.environments = environments;
  }


  public Creative202207 templateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    
    this.templateVariableValues = templateVariableValues;
    return this;
  }

  public Creative202207 addTemplateVariableValuesItem(TemplateVariableValue templateVariableValuesItem) {
    this.templateVariableValues.add(templateVariableValuesItem);
    return this;
  }

   /**
   * The template chosen values
   * @return templateVariableValues
  **/
  @javax.annotation.Nonnull

  public List<TemplateVariableValue> getTemplateVariableValues() {
    return templateVariableValues;
  }


  public void setTemplateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    this.templateVariableValues = templateVariableValues;
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
   * @return the Creative202207 instance itself
   */
  public Creative202207 putAdditionalProperty(String key, Object value) {
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
    Creative202207 creative202207 = (Creative202207) o;
    return Objects.equals(this.name, creative202207.name) &&
        Objects.equals(this.status, creative202207.status) &&
        Objects.equals(this.brandId, creative202207.brandId) &&
        Objects.equals(this.retailerId, creative202207.retailerId) &&
        Objects.equals(this.associatedLineItemIds, creative202207.associatedLineItemIds) &&
        Objects.equals(this.updatedAt, creative202207.updatedAt) &&
        Objects.equals(this.creativeFormatType, creative202207.creativeFormatType) &&
        Objects.equals(this.environments, creative202207.environments) &&
        Objects.equals(this.templateVariableValues, creative202207.templateVariableValues)&&
        Objects.equals(this.additionalProperties, creative202207.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, brandId, retailerId, associatedLineItemIds, updatedAt, creativeFormatType, environments, templateVariableValues, additionalProperties);
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
    sb.append("class Creative202207 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    associatedLineItemIds: ").append(toIndentedString(associatedLineItemIds)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    creativeFormatType: ").append(toIndentedString(creativeFormatType)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    templateVariableValues: ").append(toIndentedString(templateVariableValues)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("brandId");
    openapiFields.add("retailerId");
    openapiFields.add("associatedLineItemIds");
    openapiFields.add("updatedAt");
    openapiFields.add("creativeFormatType");
    openapiFields.add("environments");
    openapiFields.add("templateVariableValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("retailerId");
    openapiRequiredFields.add("creativeFormatType");
    openapiRequiredFields.add("environments");
    openapiRequiredFields.add("templateVariableValues");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Creative202207
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Creative202207.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Creative202207 is not found in the empty JSON string", Creative202207.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Creative202207.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("associatedLineItemIds") != null && !jsonObj.get("associatedLineItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedLineItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("associatedLineItemIds").toString()));
      }
      if (!jsonObj.get("creativeFormatType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeFormatType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeFormatType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("environments") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("environments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("templateVariableValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateVariableValues` to be an array in the JSON string but got `%s`", jsonObj.get("templateVariableValues").toString()));
      }

      JsonArray jsonArraytemplateVariableValues = jsonObj.getAsJsonArray("templateVariableValues");
      // validate the required field `templateVariableValues` (array)
      for (int i = 0; i < jsonArraytemplateVariableValues.size(); i++) {
        TemplateVariableValue.validateJsonObject(jsonArraytemplateVariableValues.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Creative202207.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Creative202207' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Creative202207> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Creative202207.class));

       return (TypeAdapter<T>) new TypeAdapter<Creative202207>() {
           @Override
           public void write(JsonWriter out, Creative202207 value) throws IOException {
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
           public Creative202207 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Creative202207 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Creative202207 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Creative202207
  * @throws IOException if the JSON string is invalid with respect to Creative202207
  */
  public static Creative202207 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Creative202207.class);
  }

 /**
  * Convert an instance of Creative202207 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

