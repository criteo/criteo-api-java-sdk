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
import com.criteo.api.retailmedia.preview.model.RetailMediaSeller;
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
public class RetailMediaSellerAccountCreation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME = "onBehalfCompanyName";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME)
  private String onBehalfCompanyName;

  public static final String SERIALIZED_NAME_SELLERS = "sellers";
  @SerializedName(SERIALIZED_NAME_SELLERS)
  private List<RetailMediaSeller> sellers = null;

  public RetailMediaSellerAccountCreation() {
  }

  public RetailMediaSellerAccountCreation name(String name) {
    
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


  public RetailMediaSellerAccountCreation companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Paying entity name of ads for the Digital Services Act
   * @return companyName
  **/
  @javax.annotation.Nullable

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public RetailMediaSellerAccountCreation onBehalfCompanyName(String onBehalfCompanyName) {
    
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


  public RetailMediaSellerAccountCreation sellers(List<RetailMediaSeller> sellers) {
    
    this.sellers = sellers;
    return this;
  }

  public RetailMediaSellerAccountCreation addSellersItem(RetailMediaSeller sellersItem) {
    if (this.sellers == null) {
      this.sellers = null;
    }
    this.sellers.add(sellersItem);
    return this;
  }

   /**
   * list of sellers to associate to the new account
   * @return sellers
  **/
  @javax.annotation.Nullable

  public List<RetailMediaSeller> getSellers() {
    return sellers;
  }


  public void setSellers(List<RetailMediaSeller> sellers) {
    this.sellers = sellers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaSellerAccountCreation retailMediaSellerAccountCreation = (RetailMediaSellerAccountCreation) o;
    return Objects.equals(this.name, retailMediaSellerAccountCreation.name) &&
        Objects.equals(this.companyName, retailMediaSellerAccountCreation.companyName) &&
        Objects.equals(this.onBehalfCompanyName, retailMediaSellerAccountCreation.onBehalfCompanyName) &&
        Objects.equals(this.sellers, retailMediaSellerAccountCreation.sellers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companyName, onBehalfCompanyName, sellers);
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
    sb.append("class RetailMediaSellerAccountCreation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    onBehalfCompanyName: ").append(toIndentedString(onBehalfCompanyName)).append("\n");
    sb.append("    sellers: ").append(toIndentedString(sellers)).append("\n");
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
    openapiFields.add("sellers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaSellerAccountCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaSellerAccountCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaSellerAccountCreation is not found in the empty JSON string", RetailMediaSellerAccountCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetailMediaSellerAccountCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetailMediaSellerAccountCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("sellers") != null && !jsonObj.get("sellers").isJsonNull()) {
        JsonArray jsonArraysellers = jsonObj.getAsJsonArray("sellers");
        if (jsonArraysellers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sellers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sellers` to be an array in the JSON string but got `%s`", jsonObj.get("sellers").toString()));
          }

          // validate the optional field `sellers` (array)
          for (int i = 0; i < jsonArraysellers.size(); i++) {
            RetailMediaSeller.validateJsonObject(jsonArraysellers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaSellerAccountCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaSellerAccountCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaSellerAccountCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaSellerAccountCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaSellerAccountCreation>() {
           @Override
           public void write(JsonWriter out, RetailMediaSellerAccountCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetailMediaSellerAccountCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetailMediaSellerAccountCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaSellerAccountCreation
  * @throws IOException if the JSON string is invalid with respect to RetailMediaSellerAccountCreation
  */
  public static RetailMediaSellerAccountCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaSellerAccountCreation.class);
  }

 /**
  * Convert an instance of RetailMediaSellerAccountCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

