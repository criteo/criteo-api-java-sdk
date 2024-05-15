/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_04.model.CommonProblem;
import com.criteo.api.retailmedia.v2024_04.model.ResourceOfRetailMediaAccount;
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

import com.criteo.api.retailmedia.v2024_04.JSON;

/**
 * A top-level object that encapsulates a Criteo API response for a single entity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceOutcomeOfRetailMediaAccount {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ResourceOfRetailMediaAccount data;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonProblem> warnings = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonProblem> errors = null;

  public ResourceOutcomeOfRetailMediaAccount() {
  }

  
  public ResourceOutcomeOfRetailMediaAccount(
     List<CommonProblem> warnings, 
     List<CommonProblem> errors
  ) {
    this();
    this.warnings = warnings;
    this.errors = errors;
  }

  public ResourceOutcomeOfRetailMediaAccount data(ResourceOfRetailMediaAccount data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public ResourceOfRetailMediaAccount getData() {
    return data;
  }


  public void setData(ResourceOfRetailMediaAccount data) {
    this.data = data;
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
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<CommonProblem> getErrors() {
    return errors;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceOutcomeOfRetailMediaAccount resourceOutcomeOfRetailMediaAccount = (ResourceOutcomeOfRetailMediaAccount) o;
    return Objects.equals(this.data, resourceOutcomeOfRetailMediaAccount.data) &&
        Objects.equals(this.warnings, resourceOutcomeOfRetailMediaAccount.warnings) &&
        Objects.equals(this.errors, resourceOutcomeOfRetailMediaAccount.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, warnings, errors);
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
    sb.append("class ResourceOutcomeOfRetailMediaAccount {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("warnings");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResourceOutcomeOfRetailMediaAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResourceOutcomeOfRetailMediaAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceOutcomeOfRetailMediaAccount is not found in the empty JSON string", ResourceOutcomeOfRetailMediaAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResourceOutcomeOfRetailMediaAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceOutcomeOfRetailMediaAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ResourceOfRetailMediaAccount.validateJsonObject(jsonObj.getAsJsonObject("data"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceOutcomeOfRetailMediaAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceOutcomeOfRetailMediaAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceOutcomeOfRetailMediaAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceOutcomeOfRetailMediaAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceOutcomeOfRetailMediaAccount>() {
           @Override
           public void write(JsonWriter out, ResourceOutcomeOfRetailMediaAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceOutcomeOfRetailMediaAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceOutcomeOfRetailMediaAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceOutcomeOfRetailMediaAccount
  * @throws IOException if the JSON string is invalid with respect to ResourceOutcomeOfRetailMediaAccount
  */
  public static ResourceOutcomeOfRetailMediaAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceOutcomeOfRetailMediaAccount.class);
  }

 /**
  * Convert an instance of ResourceOutcomeOfRetailMediaAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

