/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_10.model.CommonProblem;
import com.criteo.api.retailmedia.v2024_10.model.PageMetadata;
import com.criteo.api.retailmedia.v2024_10.model.ResourceOfBalanceResponseV2;
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

import com.criteo.api.retailmedia.v2024_10.JSON;

/**
 * Data model for a paged list of response resources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PagedResourceCollectionOutcomeOfBalanceResponseV2 {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ResourceOfBalanceResponseV2> data = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonProblem> errors = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PageMetadata metadata;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonProblem> warnings = null;

  public PagedResourceCollectionOutcomeOfBalanceResponseV2() {
  }

  
  public PagedResourceCollectionOutcomeOfBalanceResponseV2(
     List<CommonProblem> errors, 
     List<CommonProblem> warnings
  ) {
    this();
    this.errors = errors;
    this.warnings = warnings;
  }

  public PagedResourceCollectionOutcomeOfBalanceResponseV2 data(List<ResourceOfBalanceResponseV2> data) {
    
    this.data = data;
    return this;
  }

  public PagedResourceCollectionOutcomeOfBalanceResponseV2 addDataItem(ResourceOfBalanceResponseV2 dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public List<ResourceOfBalanceResponseV2> getData() {
    return data;
  }


  public void setData(List<ResourceOfBalanceResponseV2> data) {
    this.data = data;
  }


   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<CommonProblem> getErrors() {
    return errors;
  }




  public PagedResourceCollectionOutcomeOfBalanceResponseV2 metadata(PageMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable

  public PageMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PageMetadata metadata) {
    this.metadata = metadata;
  }


   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable

  public List<CommonProblem> getWarnings() {
    return warnings;
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
   * @return the PagedResourceCollectionOutcomeOfBalanceResponseV2 instance itself
   */
  public PagedResourceCollectionOutcomeOfBalanceResponseV2 putAdditionalProperty(String key, Object value) {
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
    PagedResourceCollectionOutcomeOfBalanceResponseV2 pagedResourceCollectionOutcomeOfBalanceResponseV2 = (PagedResourceCollectionOutcomeOfBalanceResponseV2) o;
    return Objects.equals(this.data, pagedResourceCollectionOutcomeOfBalanceResponseV2.data) &&
        Objects.equals(this.errors, pagedResourceCollectionOutcomeOfBalanceResponseV2.errors) &&
        Objects.equals(this.metadata, pagedResourceCollectionOutcomeOfBalanceResponseV2.metadata) &&
        Objects.equals(this.warnings, pagedResourceCollectionOutcomeOfBalanceResponseV2.warnings)&&
        Objects.equals(this.additionalProperties, pagedResourceCollectionOutcomeOfBalanceResponseV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, metadata, warnings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourceCollectionOutcomeOfBalanceResponseV2 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("errors");
    openapiFields.add("metadata");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagedResourceCollectionOutcomeOfBalanceResponseV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagedResourceCollectionOutcomeOfBalanceResponseV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedResourceCollectionOutcomeOfBalanceResponseV2 is not found in the empty JSON string", PagedResourceCollectionOutcomeOfBalanceResponseV2.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            ResourceOfBalanceResponseV2.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            CommonProblem.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        PageMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        JsonArray jsonArraywarnings = jsonObj.getAsJsonArray("warnings");
        if (jsonArraywarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
          }

          // validate the optional field `warnings` (array)
          for (int i = 0; i < jsonArraywarnings.size(); i++) {
            CommonProblem.validateJsonObject(jsonArraywarnings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedResourceCollectionOutcomeOfBalanceResponseV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedResourceCollectionOutcomeOfBalanceResponseV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedResourceCollectionOutcomeOfBalanceResponseV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedResourceCollectionOutcomeOfBalanceResponseV2.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedResourceCollectionOutcomeOfBalanceResponseV2>() {
           @Override
           public void write(JsonWriter out, PagedResourceCollectionOutcomeOfBalanceResponseV2 value) throws IOException {
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
           public PagedResourceCollectionOutcomeOfBalanceResponseV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PagedResourceCollectionOutcomeOfBalanceResponseV2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PagedResourceCollectionOutcomeOfBalanceResponseV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedResourceCollectionOutcomeOfBalanceResponseV2
  * @throws IOException if the JSON string is invalid with respect to PagedResourceCollectionOutcomeOfBalanceResponseV2
  */
  public static PagedResourceCollectionOutcomeOfBalanceResponseV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedResourceCollectionOutcomeOfBalanceResponseV2.class);
  }

 /**
  * Convert an instance of PagedResourceCollectionOutcomeOfBalanceResponseV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

