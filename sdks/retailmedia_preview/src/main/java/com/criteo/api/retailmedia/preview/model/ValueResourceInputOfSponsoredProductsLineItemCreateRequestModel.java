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
import com.criteo.api.retailmedia.preview.model.ValueResourceOfSponsoredProductsLineItemCreateRequestModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * A top-level object that encapsulates a Criteo API request for a single value objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ValueResourceOfSponsoredProductsLineItemCreateRequestModel data;

  public ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel() {
  }

  public ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel data(ValueResourceOfSponsoredProductsLineItemCreateRequestModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public ValueResourceOfSponsoredProductsLineItemCreateRequestModel getData() {
    return data;
  }


  public void setData(ValueResourceOfSponsoredProductsLineItemCreateRequestModel data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel valueResourceInputOfSponsoredProductsLineItemCreateRequestModel = (ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel) o;
    return Objects.equals(this.data, valueResourceInputOfSponsoredProductsLineItemCreateRequestModel.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel is not found in the empty JSON string", ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ValueResourceOfSponsoredProductsLineItemCreateRequestModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel>() {
           @Override
           public void write(JsonWriter out, ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel
  * @throws IOException if the JSON string is invalid with respect to ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel
  */
  public static ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel.class);
  }

 /**
  * Convert an instance of ValueResourceInputOfSponsoredProductsLineItemCreateRequestModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

