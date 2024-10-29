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
 * The details for a newly created account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaAccount {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME = "onBehalfCompanyName";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_COMPANY_NAME)
  private String onBehalfCompanyName;

  /**
   * Type for the account
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("Unknown"),
    
    SUPPLY("Supply"),
    
    DEMAND("Demand");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * subtype for the account
   */
  @JsonAdapter(SubTypeEnum.Adapter.class)
  public enum SubTypeEnum {
    UNKNOWN("Unknown"),
    
    BRAND("Brand"),
    
    SELLER("Seller");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubTypeEnum fromValue(String value) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUB_TYPE = "subType";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private SubTypeEnum subType;

  public static final String SERIALIZED_NAME_COUNTRY_IDS = "countryIds";
  @SerializedName(SERIALIZED_NAME_COUNTRY_IDS)
  private List<String> countryIds = null;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_LABEL = "parentAccountLabel";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_LABEL)
  private String parentAccountLabel;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public RetailMediaAccount() {
  }

  public RetailMediaAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * account name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RetailMediaAccount companyName(String companyName) {
    
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


  public RetailMediaAccount onBehalfCompanyName(String onBehalfCompanyName) {
    
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


  public RetailMediaAccount type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type for the account
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RetailMediaAccount subType(SubTypeEnum subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * subtype for the account
   * @return subType
  **/
  @javax.annotation.Nullable

  public SubTypeEnum getSubType() {
    return subType;
  }


  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }


  public RetailMediaAccount countryIds(List<String> countryIds) {
    
    this.countryIds = countryIds;
    return this;
  }

  public RetailMediaAccount addCountryIdsItem(String countryIdsItem) {
    if (this.countryIds == null) {
      this.countryIds = null;
    }
    this.countryIds.add(countryIdsItem);
    return this;
  }

   /**
   * list of countries associated with the account
   * @return countryIds
  **/
  @javax.annotation.Nullable

  public List<String> getCountryIds() {
    return countryIds;
  }


  public void setCountryIds(List<String> countryIds) {
    this.countryIds = countryIds;
  }


  public RetailMediaAccount currencyId(String currencyId) {
    
    this.currencyId = currencyId;
    return this;
  }

   /**
   * the currency for the account
   * @return currencyId
  **/
  @javax.annotation.Nullable

  public String getCurrencyId() {
    return currencyId;
  }


  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }


  public RetailMediaAccount parentAccountLabel(String parentAccountLabel) {
    
    this.parentAccountLabel = parentAccountLabel;
    return this;
  }

   /**
   * parent account label for the account
   * @return parentAccountLabel
  **/
  @javax.annotation.Nullable

  public String getParentAccountLabel() {
    return parentAccountLabel;
  }


  public void setParentAccountLabel(String parentAccountLabel) {
    this.parentAccountLabel = parentAccountLabel;
  }


  public RetailMediaAccount timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * the timezone for the account
   * @return timeZone
  **/
  @javax.annotation.Nullable

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaAccount retailMediaAccount = (RetailMediaAccount) o;
    return Objects.equals(this.name, retailMediaAccount.name) &&
        Objects.equals(this.companyName, retailMediaAccount.companyName) &&
        Objects.equals(this.onBehalfCompanyName, retailMediaAccount.onBehalfCompanyName) &&
        Objects.equals(this.type, retailMediaAccount.type) &&
        Objects.equals(this.subType, retailMediaAccount.subType) &&
        Objects.equals(this.countryIds, retailMediaAccount.countryIds) &&
        Objects.equals(this.currencyId, retailMediaAccount.currencyId) &&
        Objects.equals(this.parentAccountLabel, retailMediaAccount.parentAccountLabel) &&
        Objects.equals(this.timeZone, retailMediaAccount.timeZone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companyName, onBehalfCompanyName, type, subType, countryIds, currencyId, parentAccountLabel, timeZone);
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
    sb.append("class RetailMediaAccount {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    onBehalfCompanyName: ").append(toIndentedString(onBehalfCompanyName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    countryIds: ").append(toIndentedString(countryIds)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    parentAccountLabel: ").append(toIndentedString(parentAccountLabel)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("subType");
    openapiFields.add("countryIds");
    openapiFields.add("currencyId");
    openapiFields.add("parentAccountLabel");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaAccount is not found in the empty JSON string", RetailMediaAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetailMediaAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetailMediaAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("subType") != null && !jsonObj.get("subType").isJsonNull()) && !jsonObj.get("subType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countryIds") != null && !jsonObj.get("countryIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryIds` to be an array in the JSON string but got `%s`", jsonObj.get("countryIds").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("parentAccountLabel") != null && !jsonObj.get("parentAccountLabel").isJsonNull()) && !jsonObj.get("parentAccountLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentAccountLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentAccountLabel").toString()));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaAccount>() {
           @Override
           public void write(JsonWriter out, RetailMediaAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetailMediaAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetailMediaAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaAccount
  * @throws IOException if the JSON string is invalid with respect to RetailMediaAccount
  */
  public static RetailMediaAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaAccount.class);
  }

 /**
  * Convert an instance of RetailMediaAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

