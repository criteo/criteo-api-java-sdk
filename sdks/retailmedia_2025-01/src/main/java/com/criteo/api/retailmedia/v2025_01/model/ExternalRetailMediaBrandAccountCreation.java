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
 * the initial set up and configuration options for a new private market demand brand account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalRetailMediaBrandAccountCreation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME = "onBehalfCompanyName";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME)
  private String onBehalfCompanyName;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<Long> brands = null;

  public ExternalRetailMediaBrandAccountCreation() {
  }

  public ExternalRetailMediaBrandAccountCreation name(String name) {
    
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


  public ExternalRetailMediaBrandAccountCreation companyName(String companyName) {
    
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


  public ExternalRetailMediaBrandAccountCreation onBehalfCompanyName(String onBehalfCompanyName) {
    
    this.onBehalfCompanyName = onBehalfCompanyName;
    return this;
  }

   /**
   * On behalf entity name of ads for the Digital Services Act
   * @return onBehalfCompanyName
  **/
  @javax.annotation.Nullable

  public String getOnBehalfCompanyName() {
    return onBehalfCompanyName;
  }


  public void setOnBehalfCompanyName(String onBehalfCompanyName) {
    this.onBehalfCompanyName = onBehalfCompanyName;
  }


  public ExternalRetailMediaBrandAccountCreation brands(List<Long> brands) {
    
    this.brands = brands;
    return this;
  }

  public ExternalRetailMediaBrandAccountCreation addBrandsItem(Long brandsItem) {
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

  public List<Long> getBrands() {
    return brands;
  }


  public void setBrands(List<Long> brands) {
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
    ExternalRetailMediaBrandAccountCreation externalRetailMediaBrandAccountCreation = (ExternalRetailMediaBrandAccountCreation) o;
    return Objects.equals(this.name, externalRetailMediaBrandAccountCreation.name) &&
        Objects.equals(this.companyName, externalRetailMediaBrandAccountCreation.companyName) &&
        Objects.equals(this.onBehalfCompanyName, externalRetailMediaBrandAccountCreation.onBehalfCompanyName) &&
        Objects.equals(this.brands, externalRetailMediaBrandAccountCreation.brands);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companyName, onBehalfCompanyName, brands);
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
    sb.append("class ExternalRetailMediaBrandAccountCreation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    onBehalfCompanyName: ").append(toIndentedString(onBehalfCompanyName)).append("\n");
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
    openapiFields.add("onBehalfCompanyName");
    openapiFields.add("brands");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalRetailMediaBrandAccountCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalRetailMediaBrandAccountCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalRetailMediaBrandAccountCreation is not found in the empty JSON string", ExternalRetailMediaBrandAccountCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalRetailMediaBrandAccountCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalRetailMediaBrandAccountCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("onBehalfCompanyName") != null && !jsonObj.get("onBehalfCompanyName").isJsonNull()) && !jsonObj.get("onBehalfCompanyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfCompanyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfCompanyName").toString()));
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
       if (!ExternalRetailMediaBrandAccountCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalRetailMediaBrandAccountCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalRetailMediaBrandAccountCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalRetailMediaBrandAccountCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalRetailMediaBrandAccountCreation>() {
           @Override
           public void write(JsonWriter out, ExternalRetailMediaBrandAccountCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalRetailMediaBrandAccountCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalRetailMediaBrandAccountCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalRetailMediaBrandAccountCreation
  * @throws IOException if the JSON string is invalid with respect to ExternalRetailMediaBrandAccountCreation
  */
  public static ExternalRetailMediaBrandAccountCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalRetailMediaBrandAccountCreation.class);
  }

 /**
  * Convert an instance of ExternalRetailMediaBrandAccountCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

