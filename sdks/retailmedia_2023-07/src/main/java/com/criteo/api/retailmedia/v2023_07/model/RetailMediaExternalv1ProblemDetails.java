/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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

import com.criteo.api.retailmedia.v2023_07.JSON;

/**
 * Datamodel for common errors and warnings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaExternalv1ProblemDetails {
  public static final String SERIALIZED_NAME_TRACE_IDENTIFIER = "traceIdentifier";
  @SerializedName(SERIALIZED_NAME_TRACE_IDENTIFIER)
  private String traceIdentifier;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Map<String, String> source = null;

  public static final String SERIALIZED_NAME_STACK_TRACE = "stackTrace";
  @SerializedName(SERIALIZED_NAME_STACK_TRACE)
  private String stackTrace;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public RetailMediaExternalv1ProblemDetails() {
  }

  public RetailMediaExternalv1ProblemDetails traceIdentifier(String traceIdentifier) {
    
    this.traceIdentifier = traceIdentifier;
    return this;
  }

   /**
   * Get traceIdentifier
   * @return traceIdentifier
  **/
  @javax.annotation.Nullable

  public String getTraceIdentifier() {
    return traceIdentifier;
  }


  public void setTraceIdentifier(String traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
  }


  public RetailMediaExternalv1ProblemDetails code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public RetailMediaExternalv1ProblemDetails source(Map<String, String> source) {
    
    this.source = source;
    return this;
  }

  public RetailMediaExternalv1ProblemDetails putSourceItem(String key, String sourceItem) {
    if (this.source == null) {
      this.source = null;
    }
    this.source.put(key, sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable

  public Map<String, String> getSource() {
    return source;
  }


  public void setSource(Map<String, String> source) {
    this.source = source;
  }


  public RetailMediaExternalv1ProblemDetails stackTrace(String stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable

  public String getStackTrace() {
    return stackTrace;
  }


  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }


  public RetailMediaExternalv1ProblemDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public RetailMediaExternalv1ProblemDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RetailMediaExternalv1ProblemDetails status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public RetailMediaExternalv1ProblemDetails detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public RetailMediaExternalv1ProblemDetails instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaExternalv1ProblemDetails retailMediaExternalv1ProblemDetails = (RetailMediaExternalv1ProblemDetails) o;
    return Objects.equals(this.traceIdentifier, retailMediaExternalv1ProblemDetails.traceIdentifier) &&
        Objects.equals(this.code, retailMediaExternalv1ProblemDetails.code) &&
        Objects.equals(this.source, retailMediaExternalv1ProblemDetails.source) &&
        Objects.equals(this.stackTrace, retailMediaExternalv1ProblemDetails.stackTrace) &&
        Objects.equals(this.type, retailMediaExternalv1ProblemDetails.type) &&
        Objects.equals(this.title, retailMediaExternalv1ProblemDetails.title) &&
        Objects.equals(this.status, retailMediaExternalv1ProblemDetails.status) &&
        Objects.equals(this.detail, retailMediaExternalv1ProblemDetails.detail) &&
        Objects.equals(this.instance, retailMediaExternalv1ProblemDetails.instance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceIdentifier, code, source, stackTrace, type, title, status, detail, instance);
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
    sb.append("class RetailMediaExternalv1ProblemDetails {\n");
    sb.append("    traceIdentifier: ").append(toIndentedString(traceIdentifier)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
    openapiFields.add("traceIdentifier");
    openapiFields.add("code");
    openapiFields.add("source");
    openapiFields.add("stackTrace");
    openapiFields.add("type");
    openapiFields.add("title");
    openapiFields.add("status");
    openapiFields.add("detail");
    openapiFields.add("instance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaExternalv1ProblemDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaExternalv1ProblemDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaExternalv1ProblemDetails is not found in the empty JSON string", RetailMediaExternalv1ProblemDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetailMediaExternalv1ProblemDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetailMediaExternalv1ProblemDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("traceIdentifier") != null && !jsonObj.get("traceIdentifier").isJsonNull()) && !jsonObj.get("traceIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceIdentifier").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("stackTrace") != null && !jsonObj.get("stackTrace").isJsonNull()) && !jsonObj.get("stackTrace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stackTrace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stackTrace").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if ((jsonObj.get("instance") != null && !jsonObj.get("instance").isJsonNull()) && !jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaExternalv1ProblemDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaExternalv1ProblemDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaExternalv1ProblemDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaExternalv1ProblemDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaExternalv1ProblemDetails>() {
           @Override
           public void write(JsonWriter out, RetailMediaExternalv1ProblemDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetailMediaExternalv1ProblemDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetailMediaExternalv1ProblemDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaExternalv1ProblemDetails
  * @throws IOException if the JSON string is invalid with respect to RetailMediaExternalv1ProblemDetails
  */
  public static RetailMediaExternalv1ProblemDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaExternalv1ProblemDetails.class);
  }

 /**
  * Convert an instance of RetailMediaExternalv1ProblemDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

