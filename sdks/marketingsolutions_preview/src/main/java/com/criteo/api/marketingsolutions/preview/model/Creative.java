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
import com.criteo.api.marketingsolutions.preview.model.AdaptiveAttributes;
import com.criteo.api.marketingsolutions.preview.model.DynamicAttributes;
import com.criteo.api.marketingsolutions.preview.model.HtmlTagAttributes;
import com.criteo.api.marketingsolutions.preview.model.ImageAttributes;
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
 * A creative is a project with the necessary information to display a creative
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Creative {
  public static final String SERIALIZED_NAME_ADAPTIVE_ATTRIBUTES = "adaptiveAttributes";
  @SerializedName(SERIALIZED_NAME_ADAPTIVE_ATTRIBUTES)
  private AdaptiveAttributes adaptiveAttributes;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DYNAMIC_ATTRIBUTES = "dynamicAttributes";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_ATTRIBUTES)
  private DynamicAttributes dynamicAttributes;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_HTML_TAG_ATTRIBUTES = "htmlTagAttributes";
  @SerializedName(SERIALIZED_NAME_HTML_TAG_ATTRIBUTES)
  private HtmlTagAttributes htmlTagAttributes;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_ATTRIBUTES = "imageAttributes";
  @SerializedName(SERIALIZED_NAME_IMAGE_ATTRIBUTES)
  private ImageAttributes imageAttributes;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public Creative() {
  }

  public Creative adaptiveAttributes(AdaptiveAttributes adaptiveAttributes) {
    
    this.adaptiveAttributes = adaptiveAttributes;
    return this;
  }

   /**
   * Get adaptiveAttributes
   * @return adaptiveAttributes
  **/
  @javax.annotation.Nullable

  public AdaptiveAttributes getAdaptiveAttributes() {
    return adaptiveAttributes;
  }


  public void setAdaptiveAttributes(AdaptiveAttributes adaptiveAttributes) {
    this.adaptiveAttributes = adaptiveAttributes;
  }


  public Creative advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser linked to the Creative
   * @return advertiserId
  **/
  @javax.annotation.Nonnull

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public Creative author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * The login of the person who created this creative (
   * @return author
  **/
  @javax.annotation.Nonnull

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public Creative datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Data set id linked to the Creative
   * @return datasetId
  **/
  @javax.annotation.Nullable

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public Creative description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the creative
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Creative dynamicAttributes(DynamicAttributes dynamicAttributes) {
    
    this.dynamicAttributes = dynamicAttributes;
    return this;
  }

   /**
   * Get dynamicAttributes
   * @return dynamicAttributes
  **/
  @javax.annotation.Nullable

  public DynamicAttributes getDynamicAttributes() {
    return dynamicAttributes;
  }


  public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
    this.dynamicAttributes = dynamicAttributes;
  }


  public Creative format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * The format of the creative
   * @return format
  **/
  @javax.annotation.Nullable

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public Creative htmlTagAttributes(HtmlTagAttributes htmlTagAttributes) {
    
    this.htmlTagAttributes = htmlTagAttributes;
    return this;
  }

   /**
   * Get htmlTagAttributes
   * @return htmlTagAttributes
  **/
  @javax.annotation.Nullable

  public HtmlTagAttributes getHtmlTagAttributes() {
    return htmlTagAttributes;
  }


  public void setHtmlTagAttributes(HtmlTagAttributes htmlTagAttributes) {
    this.htmlTagAttributes = htmlTagAttributes;
  }


  public Creative id(String id) {
    
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


  public Creative imageAttributes(ImageAttributes imageAttributes) {
    
    this.imageAttributes = imageAttributes;
    return this;
  }

   /**
   * Get imageAttributes
   * @return imageAttributes
  **/
  @javax.annotation.Nullable

  public ImageAttributes getImageAttributes() {
    return imageAttributes;
  }


  public void setImageAttributes(ImageAttributes imageAttributes) {
    this.imageAttributes = imageAttributes;
  }


  public Creative name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the creative
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Creative status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the creative
   * @return status
  **/
  @javax.annotation.Nonnull

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the Creative instance itself
   */
  public Creative putAdditionalProperty(String key, Object value) {
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
    Creative creative = (Creative) o;
    return Objects.equals(this.adaptiveAttributes, creative.adaptiveAttributes) &&
        Objects.equals(this.advertiserId, creative.advertiserId) &&
        Objects.equals(this.author, creative.author) &&
        Objects.equals(this.datasetId, creative.datasetId) &&
        Objects.equals(this.description, creative.description) &&
        Objects.equals(this.dynamicAttributes, creative.dynamicAttributes) &&
        Objects.equals(this.format, creative.format) &&
        Objects.equals(this.htmlTagAttributes, creative.htmlTagAttributes) &&
        Objects.equals(this.id, creative.id) &&
        Objects.equals(this.imageAttributes, creative.imageAttributes) &&
        Objects.equals(this.name, creative.name) &&
        Objects.equals(this.status, creative.status)&&
        Objects.equals(this.additionalProperties, creative.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptiveAttributes, advertiserId, author, datasetId, description, dynamicAttributes, format, htmlTagAttributes, id, imageAttributes, name, status, additionalProperties);
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
    sb.append("class Creative {\n");
    sb.append("    adaptiveAttributes: ").append(toIndentedString(adaptiveAttributes)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dynamicAttributes: ").append(toIndentedString(dynamicAttributes)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    htmlTagAttributes: ").append(toIndentedString(htmlTagAttributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageAttributes: ").append(toIndentedString(imageAttributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("adaptiveAttributes");
    openapiFields.add("advertiserId");
    openapiFields.add("author");
    openapiFields.add("datasetId");
    openapiFields.add("description");
    openapiFields.add("dynamicAttributes");
    openapiFields.add("format");
    openapiFields.add("htmlTagAttributes");
    openapiFields.add("id");
    openapiFields.add("imageAttributes");
    openapiFields.add("name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiserId");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Creative
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Creative.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Creative is not found in the empty JSON string", Creative.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Creative.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `adaptiveAttributes`
      if (jsonObj.get("adaptiveAttributes") != null && !jsonObj.get("adaptiveAttributes").isJsonNull()) {
        AdaptiveAttributes.validateJsonObject(jsonObj.getAsJsonObject("adaptiveAttributes"));
      }
      if (!jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      if (!jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if ((jsonObj.get("datasetId") != null && !jsonObj.get("datasetId").isJsonNull()) && !jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `dynamicAttributes`
      if (jsonObj.get("dynamicAttributes") != null && !jsonObj.get("dynamicAttributes").isJsonNull()) {
        DynamicAttributes.validateJsonObject(jsonObj.getAsJsonObject("dynamicAttributes"));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `htmlTagAttributes`
      if (jsonObj.get("htmlTagAttributes") != null && !jsonObj.get("htmlTagAttributes").isJsonNull()) {
        HtmlTagAttributes.validateJsonObject(jsonObj.getAsJsonObject("htmlTagAttributes"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `imageAttributes`
      if (jsonObj.get("imageAttributes") != null && !jsonObj.get("imageAttributes").isJsonNull()) {
        ImageAttributes.validateJsonObject(jsonObj.getAsJsonObject("imageAttributes"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Creative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Creative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Creative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Creative.class));

       return (TypeAdapter<T>) new TypeAdapter<Creative>() {
           @Override
           public void write(JsonWriter out, Creative value) throws IOException {
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
           public Creative read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Creative instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Creative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Creative
  * @throws IOException if the JSON string is invalid with respect to Creative
  */
  public static Creative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Creative.class);
  }

 /**
  * Convert an instance of Creative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

