/*
 * Criteo API
 * Criteo API - RetailMedia
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
 * The Product Button entity used for input
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalProductButtonRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BACKGROUND_IMAGE = "backgroundImage";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_IMAGE)
  private String backgroundImage;

  public static final String SERIALIZED_NAME_IS_MANDATORY = "isMandatory";
  @SerializedName(SERIALIZED_NAME_IS_MANDATORY)
  private Integer isMandatory;

  public static final String SERIALIZED_NAME_SKUS = "skus";
  @SerializedName(SERIALIZED_NAME_SKUS)
  private List<String> skus = new ArrayList<>();

  public ExternalProductButtonRequest() {
  }

  public ExternalProductButtonRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Product Button
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalProductButtonRequest backgroundImage(String backgroundImage) {
    
    this.backgroundImage = backgroundImage;
    return this;
  }

   /**
   * URL of the background image
   * @return backgroundImage
  **/
  @javax.annotation.Nonnull

  public String getBackgroundImage() {
    return backgroundImage;
  }


  public void setBackgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
  }


  public ExternalProductButtonRequest isMandatory(Integer isMandatory) {
    
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * If the Product Button is Mandatory
   * @return isMandatory
  **/
  @javax.annotation.Nonnull

  public Integer getIsMandatory() {
    return isMandatory;
  }


  public void setIsMandatory(Integer isMandatory) {
    this.isMandatory = isMandatory;
  }


  public ExternalProductButtonRequest skus(List<String> skus) {
    
    this.skus = skus;
    return this;
  }

  public ExternalProductButtonRequest addSkusItem(String skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * List of skus on the Product Button
   * @return skus
  **/
  @javax.annotation.Nonnull

  public List<String> getSkus() {
    return skus;
  }


  public void setSkus(List<String> skus) {
    this.skus = skus;
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
   * @return the ExternalProductButtonRequest instance itself
   */
  public ExternalProductButtonRequest putAdditionalProperty(String key, Object value) {
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
    ExternalProductButtonRequest externalProductButtonRequest = (ExternalProductButtonRequest) o;
    return Objects.equals(this.name, externalProductButtonRequest.name) &&
        Objects.equals(this.backgroundImage, externalProductButtonRequest.backgroundImage) &&
        Objects.equals(this.isMandatory, externalProductButtonRequest.isMandatory) &&
        Objects.equals(this.skus, externalProductButtonRequest.skus)&&
        Objects.equals(this.additionalProperties, externalProductButtonRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, backgroundImage, isMandatory, skus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProductButtonRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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
    openapiFields.add("backgroundImage");
    openapiFields.add("isMandatory");
    openapiFields.add("skus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("backgroundImage");
    openapiRequiredFields.add("isMandatory");
    openapiRequiredFields.add("skus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalProductButtonRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalProductButtonRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalProductButtonRequest is not found in the empty JSON string", ExternalProductButtonRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalProductButtonRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("backgroundImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundImage").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("skus") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("skus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `skus` to be an array in the JSON string but got `%s`", jsonObj.get("skus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalProductButtonRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalProductButtonRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalProductButtonRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalProductButtonRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalProductButtonRequest>() {
           @Override
           public void write(JsonWriter out, ExternalProductButtonRequest value) throws IOException {
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
           public ExternalProductButtonRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalProductButtonRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalProductButtonRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalProductButtonRequest
  * @throws IOException if the JSON string is invalid with respect to ExternalProductButtonRequest
  */
  public static ExternalProductButtonRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalProductButtonRequest.class);
  }

 /**
  * Convert an instance of ExternalProductButtonRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

