/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_10.model;

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

import com.criteo.api.retailmedia.v2024_10.JSON;

/**
 * The PageType-Environment Tuples for creatives
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalPageTypeEnvironment {
  /**
   * Creative PageType
   */
  @JsonAdapter(PageTypeEnum.Adapter.class)
  public enum PageTypeEnum {
    UNKNOWN("Unknown"),
    
    SEARCH("Search"),
    
    HOME("Home"),
    
    BROWSE("Browse"),
    
    CHECKOUT("Checkout"),
    
    CATEGORY("Category"),
    
    PRODUCTDETAIL("ProductDetail"),
    
    CONFIRMATION("Confirmation"),
    
    MERCHANDISING("Merchandising"),
    
    DEALS("Deals"),
    
    FAVORITES("Favorites"),
    
    SEARCHBAR("SearchBar"),
    
    CATEGORYMENU("CategoryMenu");

    private String value;

    PageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageTypeEnum fromValue(String value) {
      for (PageTypeEnum b : PageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAGE_TYPE = "pageType";
  @SerializedName(SERIALIZED_NAME_PAGE_TYPE)
  private PageTypeEnum pageType;

  /**
   * Creative format, defining where the creative can be served
   */
  @JsonAdapter(EnvironmentsEnum.Adapter.class)
  public enum EnvironmentsEnum {
    WEB("Web"),
    
    MOBILE("Mobile"),
    
    APP("App"),
    
    LOCKOUT("Lockout"),
    
    MIXED("Mixed"),
    
    IOS("iOS"),
    
    ANDROID("Android");

    private String value;

    EnvironmentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentsEnum fromValue(String value) {
      for (EnvironmentsEnum b : EnvironmentsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<EnvironmentsEnum> environments = null;

  public ExternalPageTypeEnvironment() {
  }

  public ExternalPageTypeEnvironment pageType(PageTypeEnum pageType) {
    
    this.pageType = pageType;
    return this;
  }

   /**
   * Creative PageType
   * @return pageType
  **/
  @javax.annotation.Nullable

  public PageTypeEnum getPageType() {
    return pageType;
  }


  public void setPageType(PageTypeEnum pageType) {
    this.pageType = pageType;
  }


  public ExternalPageTypeEnvironment environments(List<EnvironmentsEnum> environments) {
    
    this.environments = environments;
    return this;
  }

  public ExternalPageTypeEnvironment addEnvironmentsItem(EnvironmentsEnum environmentsItem) {
    if (this.environments == null) {
      this.environments = null;
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * List of environments per PageType
   * @return environments
  **/
  @javax.annotation.Nullable

  public List<EnvironmentsEnum> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<EnvironmentsEnum> environments) {
    this.environments = environments;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ExternalPageTypeEnvironment instance itself
   */
  public ExternalPageTypeEnvironment putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPageTypeEnvironment externalPageTypeEnvironment = (ExternalPageTypeEnvironment) o;
    return Objects.equals(this.pageType, externalPageTypeEnvironment.pageType) &&
        Objects.equals(this.environments, externalPageTypeEnvironment.environments)&&
        Objects.equals(this.additionalProperties, externalPageTypeEnvironment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageType, environments, additionalProperties);
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
    sb.append("class ExternalPageTypeEnvironment {\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("pageType");
    openapiFields.add("environments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPageTypeEnvironment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalPageTypeEnvironment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPageTypeEnvironment is not found in the empty JSON string", ExternalPageTypeEnvironment.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("pageType") != null && !jsonObj.get("pageType").isJsonNull()) && !jsonObj.get("pageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("environments") != null && !jsonObj.get("environments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPageTypeEnvironment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPageTypeEnvironment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPageTypeEnvironment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPageTypeEnvironment.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPageTypeEnvironment>() {
           @Override
           public void write(JsonWriter out, ExternalPageTypeEnvironment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalPageTypeEnvironment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalPageTypeEnvironment instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalPageTypeEnvironment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPageTypeEnvironment
  * @throws IOException if the JSON string is invalid with respect to ExternalPageTypeEnvironment
  */
  public static ExternalPageTypeEnvironment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPageTypeEnvironment.class);
  }

 /**
  * Convert an instance of ExternalPageTypeEnvironment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

