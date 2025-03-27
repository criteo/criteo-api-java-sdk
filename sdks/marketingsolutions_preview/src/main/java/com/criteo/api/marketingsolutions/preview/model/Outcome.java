/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.CommonProblem;
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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * The outcome of an API call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Outcome {
  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonProblem> warnings = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonProblem> errors = null;

  public Outcome() {
  }

  
  public Outcome(
     List<CommonProblem> warnings, 
     List<CommonProblem> errors
  ) {
    this();
    this.warnings = warnings;
    this.errors = errors;
  }

   /**
   * Warnings that occured during this call.
   * @return warnings
  **/
  @javax.annotation.Nullable

  public List<CommonProblem> getWarnings() {
    return warnings;
  }




   /**
   * Errors that occured during this call.
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
    Outcome outcome = (Outcome) o;
    return Objects.equals(this.warnings, outcome.warnings) &&
        Objects.equals(this.errors, outcome.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnings, errors);
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
    sb.append("class Outcome {\n");
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
    openapiFields.add("warnings");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Outcome
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Outcome.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outcome is not found in the empty JSON string", Outcome.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Outcome.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outcome` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
       if (!Outcome.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outcome' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outcome> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outcome.class));

       return (TypeAdapter<T>) new TypeAdapter<Outcome>() {
           @Override
           public void write(JsonWriter out, Outcome value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outcome read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outcome given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outcome
  * @throws IOException if the JSON string is invalid with respect to Outcome
  */
  public static Outcome fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outcome.class);
  }

 /**
  * Convert an instance of Outcome to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

