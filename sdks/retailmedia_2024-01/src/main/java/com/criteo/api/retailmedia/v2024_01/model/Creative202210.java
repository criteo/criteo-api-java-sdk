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
import com.criteo.api.retailmedia.v2024_01.model.PageTypeEnvironment202210;
import com.criteo.api.retailmedia.v2024_01.model.TemplateVariableValue;
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

import com.criteo.api.retailmedia.v2024_01.JSON;

/**
 * A creative entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Creative202210 {
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

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_FORMAT_ID = "formatId";
  @SerializedName(SERIALIZED_NAME_FORMAT_ID)
  private Integer formatId;

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

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<PageTypeEnvironment202210> environments = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES = "templateVariableValues";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES)
  private List<TemplateVariableValue> templateVariableValues = new ArrayList<>();

  public Creative202210() {
  }

  public Creative202210 name(String name) {
    
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


  public Creative202210 status(StatusEnum status) {
    
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


  public Creative202210 brandId(Long brandId) {
    
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


  public Creative202210 retailerId(Integer retailerId) {
    
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


  public Creative202210 templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Template Id
   * @return templateId
  **/
  @javax.annotation.Nonnull

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public Creative202210 templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Template Name
   * @return templateName
  **/
  @javax.annotation.Nonnull

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public Creative202210 formatId(Integer formatId) {
    
    this.formatId = formatId;
    return this;
  }

   /**
   * Format Id
   * @return formatId
  **/
  @javax.annotation.Nonnull

  public Integer getFormatId() {
    return formatId;
  }


  public void setFormatId(Integer formatId) {
    this.formatId = formatId;
  }


  public Creative202210 associatedLineItemIds(List<String> associatedLineItemIds) {
    
    this.associatedLineItemIds = associatedLineItemIds;
    return this;
  }

  public Creative202210 addAssociatedLineItemIdsItem(String associatedLineItemIdsItem) {
    if (this.associatedLineItemIds == null) {
      this.associatedLineItemIds = null;
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


  public Creative202210 updatedAt(OffsetDateTime updatedAt) {
    
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


  public Creative202210 creativeFormatType(CreativeFormatTypeEnum creativeFormatType) {
    
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


  public Creative202210 environments(List<PageTypeEnvironment202210> environments) {
    
    this.environments = environments;
    return this;
  }

  public Creative202210 addEnvironmentsItem(PageTypeEnvironment202210 environmentsItem) {
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * Environment type (e.g. mobile, web, app)
   * @return environments
  **/
  @javax.annotation.Nonnull

  public List<PageTypeEnvironment202210> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<PageTypeEnvironment202210> environments) {
    this.environments = environments;
  }


  public Creative202210 templateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    
    this.templateVariableValues = templateVariableValues;
    return this;
  }

  public Creative202210 addTemplateVariableValuesItem(TemplateVariableValue templateVariableValuesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creative202210 creative202210 = (Creative202210) o;
    return Objects.equals(this.name, creative202210.name) &&
        Objects.equals(this.status, creative202210.status) &&
        Objects.equals(this.brandId, creative202210.brandId) &&
        Objects.equals(this.retailerId, creative202210.retailerId) &&
        Objects.equals(this.templateId, creative202210.templateId) &&
        Objects.equals(this.templateName, creative202210.templateName) &&
        Objects.equals(this.formatId, creative202210.formatId) &&
        Objects.equals(this.associatedLineItemIds, creative202210.associatedLineItemIds) &&
        Objects.equals(this.updatedAt, creative202210.updatedAt) &&
        Objects.equals(this.creativeFormatType, creative202210.creativeFormatType) &&
        Objects.equals(this.environments, creative202210.environments) &&
        Objects.equals(this.templateVariableValues, creative202210.templateVariableValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, brandId, retailerId, templateId, templateName, formatId, associatedLineItemIds, updatedAt, creativeFormatType, environments, templateVariableValues);
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
    sb.append("class Creative202210 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    formatId: ").append(toIndentedString(formatId)).append("\n");
    sb.append("    associatedLineItemIds: ").append(toIndentedString(associatedLineItemIds)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    creativeFormatType: ").append(toIndentedString(creativeFormatType)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    templateVariableValues: ").append(toIndentedString(templateVariableValues)).append("\n");
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
    openapiFields.add("templateId");
    openapiFields.add("templateName");
    openapiFields.add("formatId");
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
    openapiRequiredFields.add("templateId");
    openapiRequiredFields.add("templateName");
    openapiRequiredFields.add("formatId");
    openapiRequiredFields.add("creativeFormatType");
    openapiRequiredFields.add("environments");
    openapiRequiredFields.add("templateVariableValues");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Creative202210
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Creative202210.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Creative202210 is not found in the empty JSON string", Creative202210.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Creative202210.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Creative202210` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Creative202210.openapiRequiredFields) {
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
      if (!jsonObj.get("templateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("associatedLineItemIds") != null && !jsonObj.get("associatedLineItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedLineItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("associatedLineItemIds").toString()));
      }
      if (!jsonObj.get("creativeFormatType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeFormatType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeFormatType").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("environments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
      }

      JsonArray jsonArrayenvironments = jsonObj.getAsJsonArray("environments");
      // validate the required field `environments` (array)
      for (int i = 0; i < jsonArrayenvironments.size(); i++) {
        PageTypeEnvironment202210.validateJsonObject(jsonArrayenvironments.get(i).getAsJsonObject());
      };
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
       if (!Creative202210.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Creative202210' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Creative202210> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Creative202210.class));

       return (TypeAdapter<T>) new TypeAdapter<Creative202210>() {
           @Override
           public void write(JsonWriter out, Creative202210 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Creative202210 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Creative202210 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Creative202210
  * @throws IOException if the JSON string is invalid with respect to Creative202210
  */
  public static Creative202210 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Creative202210.class);
  }

 /**
  * Convert an instance of Creative202210 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

