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

import com.criteo.api.retailmedia.v2024_04.JSON;

/**
 * Data model representing bid multipliers on a line item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LineItemBidMultipliers {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private Double categories;

  public static final String SERIALIZED_NAME_CHECKOUT = "checkout";
  @SerializedName(SERIALIZED_NAME_CHECKOUT)
  private Double checkout;

  public static final String SERIALIZED_NAME_CONFIRMATION = "confirmation";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION)
  private Double confirmation;

  public static final String SERIALIZED_NAME_DEALS = "deals";
  @SerializedName(SERIALIZED_NAME_DEALS)
  private Double deals;

  public static final String SERIALIZED_NAME_HOMEPAGE = "homepage";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE)
  private Double homepage;

  public static final String SERIALIZED_NAME_MERCHANDISING = "merchandising";
  @SerializedName(SERIALIZED_NAME_MERCHANDISING)
  private Double merchandising;

  public static final String SERIALIZED_NAME_PRODUCT_DETAIL = "productDetail";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DETAIL)
  private Double productDetail;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private Double search;

  public LineItemBidMultipliers() {
  }

  public LineItemBidMultipliers categories(Double categories) {
    
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable

  public Double getCategories() {
    return categories;
  }


  public void setCategories(Double categories) {
    this.categories = categories;
  }


  public LineItemBidMultipliers checkout(Double checkout) {
    
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @javax.annotation.Nullable

  public Double getCheckout() {
    return checkout;
  }


  public void setCheckout(Double checkout) {
    this.checkout = checkout;
  }


  public LineItemBidMultipliers confirmation(Double confirmation) {
    
    this.confirmation = confirmation;
    return this;
  }

   /**
   * Get confirmation
   * @return confirmation
  **/
  @javax.annotation.Nullable

  public Double getConfirmation() {
    return confirmation;
  }


  public void setConfirmation(Double confirmation) {
    this.confirmation = confirmation;
  }


  public LineItemBidMultipliers deals(Double deals) {
    
    this.deals = deals;
    return this;
  }

   /**
   * Get deals
   * @return deals
  **/
  @javax.annotation.Nullable

  public Double getDeals() {
    return deals;
  }


  public void setDeals(Double deals) {
    this.deals = deals;
  }


  public LineItemBidMultipliers homepage(Double homepage) {
    
    this.homepage = homepage;
    return this;
  }

   /**
   * Get homepage
   * @return homepage
  **/
  @javax.annotation.Nullable

  public Double getHomepage() {
    return homepage;
  }


  public void setHomepage(Double homepage) {
    this.homepage = homepage;
  }


  public LineItemBidMultipliers merchandising(Double merchandising) {
    
    this.merchandising = merchandising;
    return this;
  }

   /**
   * Get merchandising
   * @return merchandising
  **/
  @javax.annotation.Nullable

  public Double getMerchandising() {
    return merchandising;
  }


  public void setMerchandising(Double merchandising) {
    this.merchandising = merchandising;
  }


  public LineItemBidMultipliers productDetail(Double productDetail) {
    
    this.productDetail = productDetail;
    return this;
  }

   /**
   * Get productDetail
   * @return productDetail
  **/
  @javax.annotation.Nullable

  public Double getProductDetail() {
    return productDetail;
  }


  public void setProductDetail(Double productDetail) {
    this.productDetail = productDetail;
  }


  public LineItemBidMultipliers search(Double search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable

  public Double getSearch() {
    return search;
  }


  public void setSearch(Double search) {
    this.search = search;
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
   * @return the LineItemBidMultipliers instance itself
   */
  public LineItemBidMultipliers putAdditionalProperty(String key, Object value) {
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
    LineItemBidMultipliers lineItemBidMultipliers = (LineItemBidMultipliers) o;
    return Objects.equals(this.categories, lineItemBidMultipliers.categories) &&
        Objects.equals(this.checkout, lineItemBidMultipliers.checkout) &&
        Objects.equals(this.confirmation, lineItemBidMultipliers.confirmation) &&
        Objects.equals(this.deals, lineItemBidMultipliers.deals) &&
        Objects.equals(this.homepage, lineItemBidMultipliers.homepage) &&
        Objects.equals(this.merchandising, lineItemBidMultipliers.merchandising) &&
        Objects.equals(this.productDetail, lineItemBidMultipliers.productDetail) &&
        Objects.equals(this.search, lineItemBidMultipliers.search)&&
        Objects.equals(this.additionalProperties, lineItemBidMultipliers.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, checkout, confirmation, deals, homepage, merchandising, productDetail, search, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemBidMultipliers {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    merchandising: ").append(toIndentedString(merchandising)).append("\n");
    sb.append("    productDetail: ").append(toIndentedString(productDetail)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("checkout");
    openapiFields.add("confirmation");
    openapiFields.add("deals");
    openapiFields.add("homepage");
    openapiFields.add("merchandising");
    openapiFields.add("productDetail");
    openapiFields.add("search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LineItemBidMultipliers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LineItemBidMultipliers.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItemBidMultipliers is not found in the empty JSON string", LineItemBidMultipliers.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LineItemBidMultipliers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItemBidMultipliers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItemBidMultipliers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItemBidMultipliers.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItemBidMultipliers>() {
           @Override
           public void write(JsonWriter out, LineItemBidMultipliers value) throws IOException {
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
           public LineItemBidMultipliers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LineItemBidMultipliers instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LineItemBidMultipliers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LineItemBidMultipliers
  * @throws IOException if the JSON string is invalid with respect to LineItemBidMultipliers
  */
  public static LineItemBidMultipliers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItemBidMultipliers.class);
  }

 /**
  * Convert an instance of LineItemBidMultipliers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

