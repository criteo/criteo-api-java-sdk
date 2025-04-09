/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

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

import com.criteo.api.marketingsolutions.v2024_04.JSON;

/**
 * This is the message defining the query for Transparency report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransparencyQueryMessage {
  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_SHOULD_DISPLAY_PRODUCT_IDS = "shouldDisplayProductIds";
  @SerializedName(SERIALIZED_NAME_SHOULD_DISPLAY_PRODUCT_IDS)
  private Boolean shouldDisplayProductIds = false;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public TransparencyQueryMessage() {
  }

  public TransparencyQueryMessage endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TransparencyQueryMessage shouldDisplayProductIds(Boolean shouldDisplayProductIds) {
    
    this.shouldDisplayProductIds = shouldDisplayProductIds;
    return this;
  }

   /**
   * Specify if the product ids are displayed in the report.
   * @return shouldDisplayProductIds
  **/
  @javax.annotation.Nullable

  public Boolean getShouldDisplayProductIds() {
    return shouldDisplayProductIds;
  }


  public void setShouldDisplayProductIds(Boolean shouldDisplayProductIds) {
    this.shouldDisplayProductIds = shouldDisplayProductIds;
  }


  public TransparencyQueryMessage startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransparencyQueryMessage transparencyQueryMessage = (TransparencyQueryMessage) o;
    return Objects.equals(this.endDate, transparencyQueryMessage.endDate) &&
        Objects.equals(this.shouldDisplayProductIds, transparencyQueryMessage.shouldDisplayProductIds) &&
        Objects.equals(this.startDate, transparencyQueryMessage.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, shouldDisplayProductIds, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransparencyQueryMessage {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    shouldDisplayProductIds: ").append(toIndentedString(shouldDisplayProductIds)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("endDate");
    openapiFields.add("shouldDisplayProductIds");
    openapiFields.add("startDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("startDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransparencyQueryMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransparencyQueryMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransparencyQueryMessage is not found in the empty JSON string", TransparencyQueryMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransparencyQueryMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransparencyQueryMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransparencyQueryMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransparencyQueryMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransparencyQueryMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransparencyQueryMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransparencyQueryMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<TransparencyQueryMessage>() {
           @Override
           public void write(JsonWriter out, TransparencyQueryMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransparencyQueryMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransparencyQueryMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransparencyQueryMessage
  * @throws IOException if the JSON string is invalid with respect to TransparencyQueryMessage
  */
  public static TransparencyQueryMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransparencyQueryMessage.class);
  }

 /**
  * Convert an instance of TransparencyQueryMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

