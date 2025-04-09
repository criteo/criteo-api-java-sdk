/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2025-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2025_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2025_01.model.ProductMetadata;
import com.criteo.api.retailmedia.v2025_01.model.PromotedProductResource;
import com.criteo.api.retailmedia.v2025_01.model.RmcaCommonProblem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.retailmedia.v2025_01.JSON;

/**
 * Outcome object containing promoted products.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromotedProductResourceCollectionOutcome {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<PromotedProductResource> data = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<RmcaCommonProblem> errors = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ProductMetadata meta;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<RmcaCommonProblem> warnings = null;

  public PromotedProductResourceCollectionOutcome() {
  }

  
  public PromotedProductResourceCollectionOutcome(
     List<RmcaCommonProblem> errors, 
     List<RmcaCommonProblem> warnings
  ) {
    this();
    this.errors = errors;
    this.warnings = warnings;
  }

  public PromotedProductResourceCollectionOutcome data(List<PromotedProductResource> data) {
    
    this.data = data;
    return this;
  }

  public PromotedProductResourceCollectionOutcome addDataItem(PromotedProductResource dataItem) {
    if (this.data == null) {
      this.data = null;
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public List<PromotedProductResource> getData() {
    return data;
  }


  public void setData(List<PromotedProductResource> data) {
    this.data = data;
  }


   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<RmcaCommonProblem> getErrors() {
    return errors;
  }




  public PromotedProductResourceCollectionOutcome meta(ProductMetadata meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable

  public ProductMetadata getMeta() {
    return meta;
  }


  public void setMeta(ProductMetadata meta) {
    this.meta = meta;
  }


   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable

  public List<RmcaCommonProblem> getWarnings() {
    return warnings;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotedProductResourceCollectionOutcome promotedProductResourceCollectionOutcome = (PromotedProductResourceCollectionOutcome) o;
    return Objects.equals(this.data, promotedProductResourceCollectionOutcome.data) &&
        Objects.equals(this.errors, promotedProductResourceCollectionOutcome.errors) &&
        Objects.equals(this.meta, promotedProductResourceCollectionOutcome.meta) &&
        Objects.equals(this.warnings, promotedProductResourceCollectionOutcome.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, meta, warnings);
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
    sb.append("class PromotedProductResourceCollectionOutcome {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PromotedProductResourceCollectionOutcome
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PromotedProductResourceCollectionOutcome.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotedProductResourceCollectionOutcome is not found in the empty JSON string", PromotedProductResourceCollectionOutcome.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PromotedProductResourceCollectionOutcome.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromotedProductResourceCollectionOutcome` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
            PromotedProductResource.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        ProductMetadata.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotedProductResourceCollectionOutcome.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotedProductResourceCollectionOutcome' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotedProductResourceCollectionOutcome> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotedProductResourceCollectionOutcome.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotedProductResourceCollectionOutcome>() {
           @Override
           public void write(JsonWriter out, PromotedProductResourceCollectionOutcome value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotedProductResourceCollectionOutcome read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotedProductResourceCollectionOutcome given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotedProductResourceCollectionOutcome
  * @throws IOException if the JSON string is invalid with respect to PromotedProductResourceCollectionOutcome
  */
  public static PromotedProductResourceCollectionOutcome fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotedProductResourceCollectionOutcome.class);
  }

 /**
  * Convert an instance of PromotedProductResourceCollectionOutcome to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

