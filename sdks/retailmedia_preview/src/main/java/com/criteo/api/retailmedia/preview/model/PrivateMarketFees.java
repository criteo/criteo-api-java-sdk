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
import com.criteo.api.retailmedia.preview.model.DemandManagedFee;
import com.criteo.api.retailmedia.preview.model.ManagedServiceFee;
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
 * fees for a private market account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrivateMarketFees {
  public static final String SERIALIZED_NAME_DEMAND_MANAGED = "demandManaged";
  @SerializedName(SERIALIZED_NAME_DEMAND_MANAGED)
  private DemandManagedFee demandManaged;

  public static final String SERIALIZED_NAME_MANAGED_SERVICE = "managedService";
  @SerializedName(SERIALIZED_NAME_MANAGED_SERVICE)
  private ManagedServiceFee managedService;

  public PrivateMarketFees() {
  }

  public PrivateMarketFees demandManaged(DemandManagedFee demandManaged) {
    
    this.demandManaged = demandManaged;
    return this;
  }

   /**
   * Get demandManaged
   * @return demandManaged
  **/
  @javax.annotation.Nonnull

  public DemandManagedFee getDemandManaged() {
    return demandManaged;
  }


  public void setDemandManaged(DemandManagedFee demandManaged) {
    this.demandManaged = demandManaged;
  }


  public PrivateMarketFees managedService(ManagedServiceFee managedService) {
    
    this.managedService = managedService;
    return this;
  }

   /**
   * Get managedService
   * @return managedService
  **/
  @javax.annotation.Nonnull

  public ManagedServiceFee getManagedService() {
    return managedService;
  }


  public void setManagedService(ManagedServiceFee managedService) {
    this.managedService = managedService;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateMarketFees privateMarketFees = (PrivateMarketFees) o;
    return Objects.equals(this.demandManaged, privateMarketFees.demandManaged) &&
        Objects.equals(this.managedService, privateMarketFees.managedService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandManaged, managedService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateMarketFees {\n");
    sb.append("    demandManaged: ").append(toIndentedString(demandManaged)).append("\n");
    sb.append("    managedService: ").append(toIndentedString(managedService)).append("\n");
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
    openapiFields.add("demandManaged");
    openapiFields.add("managedService");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demandManaged");
    openapiRequiredFields.add("managedService");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrivateMarketFees
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrivateMarketFees.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrivateMarketFees is not found in the empty JSON string", PrivateMarketFees.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PrivateMarketFees.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrivateMarketFees` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrivateMarketFees.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `demandManaged`
      DemandManagedFee.validateJsonObject(jsonObj.getAsJsonObject("demandManaged"));
      // validate the required field `managedService`
      ManagedServiceFee.validateJsonObject(jsonObj.getAsJsonObject("managedService"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrivateMarketFees.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrivateMarketFees' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrivateMarketFees> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrivateMarketFees.class));

       return (TypeAdapter<T>) new TypeAdapter<PrivateMarketFees>() {
           @Override
           public void write(JsonWriter out, PrivateMarketFees value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrivateMarketFees read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrivateMarketFees given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrivateMarketFees
  * @throws IOException if the JSON string is invalid with respect to PrivateMarketFees
  */
  public static PrivateMarketFees fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrivateMarketFees.class);
  }

 /**
  * Convert an instance of PrivateMarketFees to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

