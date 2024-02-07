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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * the initial set up and configuration options for a new private market demand brand account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaBrandAccountCreation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<Integer> brands = null;

  public RetailMediaBrandAccountCreation() {
  }

  public RetailMediaBrandAccountCreation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of the account, must be unique across all accounts
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RetailMediaBrandAccountCreation companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Display name for reporting the owning entity of ads for the Digital Services Act in the European Union
   * @return companyName
  **/
  @javax.annotation.Nullable

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public RetailMediaBrandAccountCreation brands(List<Integer> brands) {
    
    this.brands = brands;
    return this;
  }

  public RetailMediaBrandAccountCreation addBrandsItem(Integer brandsItem) {
    if (this.brands == null) {
      this.brands = null;
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * list of brands to link to the new account
   * @return brands
  **/
  @javax.annotation.Nullable

  public List<Integer> getBrands() {
    return brands;
  }


  public void setBrands(List<Integer> brands) {
    this.brands = brands;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaBrandAccountCreation retailMediaBrandAccountCreation = (RetailMediaBrandAccountCreation) o;
    return Objects.equals(this.name, retailMediaBrandAccountCreation.name) &&
        Objects.equals(this.companyName, retailMediaBrandAccountCreation.companyName) &&
        Objects.equals(this.brands, retailMediaBrandAccountCreation.brands);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companyName, brands);
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
    sb.append("class RetailMediaBrandAccountCreation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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
    openapiFields.add("companyName");
    openapiFields.add("brands");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaBrandAccountCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaBrandAccountCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaBrandAccountCreation is not found in the empty JSON string", RetailMediaBrandAccountCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetailMediaBrandAccountCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetailMediaBrandAccountCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("brands") != null && !jsonObj.get("brands").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brands` to be an array in the JSON string but got `%s`", jsonObj.get("brands").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaBrandAccountCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaBrandAccountCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaBrandAccountCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaBrandAccountCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaBrandAccountCreation>() {
           @Override
           public void write(JsonWriter out, RetailMediaBrandAccountCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetailMediaBrandAccountCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetailMediaBrandAccountCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaBrandAccountCreation
  * @throws IOException if the JSON string is invalid with respect to RetailMediaBrandAccountCreation
  */
  public static RetailMediaBrandAccountCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaBrandAccountCreation.class);
  }

 /**
  * Convert an instance of RetailMediaBrandAccountCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

