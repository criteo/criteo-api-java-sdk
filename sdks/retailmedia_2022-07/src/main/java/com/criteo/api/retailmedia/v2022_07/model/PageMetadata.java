/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
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

import com.criteo.api.retailmedia.v2022_07.JSON;

/**
 * Metadata related to the current request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageMetadata {
  public static final String SERIALIZED_NAME_TOTAL_ITEMS_ACROSS_ALL_PAGES = "totalItemsAcrossAllPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS_ACROSS_ALL_PAGES)
  private Long totalItemsAcrossAllPages;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_SIZE = "currentPageSize";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_SIZE)
  private Integer currentPageSize;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_INDEX = "currentPageIndex";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_INDEX)
  private Integer currentPageIndex;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Long totalPages;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public PageMetadata() {
  }

  public PageMetadata totalItemsAcrossAllPages(Long totalItemsAcrossAllPages) {
    
    this.totalItemsAcrossAllPages = totalItemsAcrossAllPages;
    return this;
  }

   /**
   * Get totalItemsAcrossAllPages
   * @return totalItemsAcrossAllPages
  **/
  @javax.annotation.Nullable

  public Long getTotalItemsAcrossAllPages() {
    return totalItemsAcrossAllPages;
  }


  public void setTotalItemsAcrossAllPages(Long totalItemsAcrossAllPages) {
    this.totalItemsAcrossAllPages = totalItemsAcrossAllPages;
  }


  public PageMetadata currentPageSize(Integer currentPageSize) {
    
    this.currentPageSize = currentPageSize;
    return this;
  }

   /**
   * Get currentPageSize
   * @return currentPageSize
  **/
  @javax.annotation.Nonnull

  public Integer getCurrentPageSize() {
    return currentPageSize;
  }


  public void setCurrentPageSize(Integer currentPageSize) {
    this.currentPageSize = currentPageSize;
  }


  public PageMetadata currentPageIndex(Integer currentPageIndex) {
    
    this.currentPageIndex = currentPageIndex;
    return this;
  }

   /**
   * Get currentPageIndex
   * @return currentPageIndex
  **/
  @javax.annotation.Nonnull

  public Integer getCurrentPageIndex() {
    return currentPageIndex;
  }


  public void setCurrentPageIndex(Integer currentPageIndex) {
    this.currentPageIndex = currentPageIndex;
  }


  public PageMetadata totalPages(Long totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable

  public Long getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }


  public PageMetadata nextPage(String nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @javax.annotation.Nullable

  public String getNextPage() {
    return nextPage;
  }


  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public PageMetadata previousPage(String previousPage) {
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @javax.annotation.Nullable

  public String getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
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
   * @return the PageMetadata instance itself
   */
  public PageMetadata putAdditionalProperty(String key, Object value) {
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
    PageMetadata pageMetadata = (PageMetadata) o;
    return Objects.equals(this.totalItemsAcrossAllPages, pageMetadata.totalItemsAcrossAllPages) &&
        Objects.equals(this.currentPageSize, pageMetadata.currentPageSize) &&
        Objects.equals(this.currentPageIndex, pageMetadata.currentPageIndex) &&
        Objects.equals(this.totalPages, pageMetadata.totalPages) &&
        Objects.equals(this.nextPage, pageMetadata.nextPage) &&
        Objects.equals(this.previousPage, pageMetadata.previousPage)&&
        Objects.equals(this.additionalProperties, pageMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItemsAcrossAllPages, currentPageSize, currentPageIndex, totalPages, nextPage, previousPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadata {\n");
    sb.append("    totalItemsAcrossAllPages: ").append(toIndentedString(totalItemsAcrossAllPages)).append("\n");
    sb.append("    currentPageSize: ").append(toIndentedString(currentPageSize)).append("\n");
    sb.append("    currentPageIndex: ").append(toIndentedString(currentPageIndex)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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
    openapiFields.add("totalItemsAcrossAllPages");
    openapiFields.add("currentPageSize");
    openapiFields.add("currentPageIndex");
    openapiFields.add("totalPages");
    openapiFields.add("nextPage");
    openapiFields.add("previousPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currentPageSize");
    openapiRequiredFields.add("currentPageIndex");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageMetadata is not found in the empty JSON string", PageMetadata.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PageMetadata.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("previousPage") != null && !jsonObj.get("previousPage").isJsonNull()) && !jsonObj.get("previousPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<PageMetadata>() {
           @Override
           public void write(JsonWriter out, PageMetadata value) throws IOException {
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
           public PageMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageMetadata
  * @throws IOException if the JSON string is invalid with respect to PageMetadata
  */
  public static PageMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageMetadata.class);
  }

 /**
  * Convert an instance of PageMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

