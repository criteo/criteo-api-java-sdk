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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Represents a recommended product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendedProduct {
  public static final String SERIALIZED_NAME_ALTERNATIVE_CLICK_URL = "alternativeClickUrl";
  @SerializedName(SERIALIZED_NAME_ALTERNATIVE_CLICK_URL)
  private String alternativeClickUrl;

  public static final String SERIALIZED_NAME_CLICK_URL = "clickUrl";
  @SerializedName(SERIALIZED_NAME_CLICK_URL)
  private String clickUrl;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GOOGLE_CATEGORY = "googleCategory";
  @SerializedName(SERIALIZED_NAME_GOOGLE_CATEGORY)
  private String googleCategory;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PRODUCT_EXTERNAL_ID = "productExternalId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_EXTERNAL_ID)
  private String productExternalId;

  public static final String SERIALIZED_NAME_RETAILPRICE = "retailprice";
  @SerializedName(SERIALIZED_NAME_RETAILPRICE)
  private Double retailprice;

  public RecommendedProduct() {
  }

  public RecommendedProduct alternativeClickUrl(String alternativeClickUrl) {
    
    this.alternativeClickUrl = alternativeClickUrl;
    return this;
  }

   /**
   * Url leading to product details page and also used to track user click. It&#39;s relying on a custom product URL field in the catalog.
   * @return alternativeClickUrl
  **/
  @javax.annotation.Nullable

  public String getAlternativeClickUrl() {
    return alternativeClickUrl;
  }


  public void setAlternativeClickUrl(String alternativeClickUrl) {
    this.alternativeClickUrl = alternativeClickUrl;
  }


  public RecommendedProduct clickUrl(String clickUrl) {
    
    this.clickUrl = clickUrl;
    return this;
  }

   /**
   * Url leading to product details page and also used to track user click. It&#39;s relying on the default product URL field in the catalog.
   * @return clickUrl
  **/
  @javax.annotation.Nullable

  public String getClickUrl() {
    return clickUrl;
  }


  public void setClickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
  }


  public RecommendedProduct description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Product description.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RecommendedProduct googleCategory(String googleCategory) {
    
    this.googleCategory = googleCategory;
    return this;
  }

   /**
   * Product google category.
   * @return googleCategory
  **/
  @javax.annotation.Nullable

  public String getGoogleCategory() {
    return googleCategory;
  }


  public void setGoogleCategory(String googleCategory) {
    this.googleCategory = googleCategory;
  }


  public RecommendedProduct imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Product image.
   * @return imageUrl
  **/
  @javax.annotation.Nullable

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public RecommendedProduct name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Product name.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RecommendedProduct price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Product price.
   * @return price
  **/
  @javax.annotation.Nullable

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public RecommendedProduct productExternalId(String productExternalId) {
    
    this.productExternalId = productExternalId;
    return this;
  }

   /**
   * Product external id. Same id than what is used in user events.
   * @return productExternalId
  **/
  @javax.annotation.Nullable

  public String getProductExternalId() {
    return productExternalId;
  }


  public void setProductExternalId(String productExternalId) {
    this.productExternalId = productExternalId;
  }


  public RecommendedProduct retailprice(Double retailprice) {
    
    this.retailprice = retailprice;
    return this;
  }

   /**
   * Product retail price.
   * @return retailprice
  **/
  @javax.annotation.Nullable

  public Double getRetailprice() {
    return retailprice;
  }


  public void setRetailprice(Double retailprice) {
    this.retailprice = retailprice;
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
   * @return the RecommendedProduct instance itself
   */
  public RecommendedProduct putAdditionalProperty(String key, Object value) {
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
    RecommendedProduct recommendedProduct = (RecommendedProduct) o;
    return Objects.equals(this.alternativeClickUrl, recommendedProduct.alternativeClickUrl) &&
        Objects.equals(this.clickUrl, recommendedProduct.clickUrl) &&
        Objects.equals(this.description, recommendedProduct.description) &&
        Objects.equals(this.googleCategory, recommendedProduct.googleCategory) &&
        Objects.equals(this.imageUrl, recommendedProduct.imageUrl) &&
        Objects.equals(this.name, recommendedProduct.name) &&
        Objects.equals(this.price, recommendedProduct.price) &&
        Objects.equals(this.productExternalId, recommendedProduct.productExternalId) &&
        Objects.equals(this.retailprice, recommendedProduct.retailprice)&&
        Objects.equals(this.additionalProperties, recommendedProduct.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeClickUrl, clickUrl, description, googleCategory, imageUrl, name, price, productExternalId, retailprice, additionalProperties);
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
    sb.append("class RecommendedProduct {\n");
    sb.append("    alternativeClickUrl: ").append(toIndentedString(alternativeClickUrl)).append("\n");
    sb.append("    clickUrl: ").append(toIndentedString(clickUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    googleCategory: ").append(toIndentedString(googleCategory)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productExternalId: ").append(toIndentedString(productExternalId)).append("\n");
    sb.append("    retailprice: ").append(toIndentedString(retailprice)).append("\n");
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
    openapiFields.add("alternativeClickUrl");
    openapiFields.add("clickUrl");
    openapiFields.add("description");
    openapiFields.add("googleCategory");
    openapiFields.add("imageUrl");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("productExternalId");
    openapiFields.add("retailprice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecommendedProduct
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecommendedProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendedProduct is not found in the empty JSON string", RecommendedProduct.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("alternativeClickUrl") != null && !jsonObj.get("alternativeClickUrl").isJsonNull()) && !jsonObj.get("alternativeClickUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternativeClickUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alternativeClickUrl").toString()));
      }
      if ((jsonObj.get("clickUrl") != null && !jsonObj.get("clickUrl").isJsonNull()) && !jsonObj.get("clickUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickUrl").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("googleCategory") != null && !jsonObj.get("googleCategory").isJsonNull()) && !jsonObj.get("googleCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googleCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googleCategory").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("productExternalId") != null && !jsonObj.get("productExternalId").isJsonNull()) && !jsonObj.get("productExternalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productExternalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productExternalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendedProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendedProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendedProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendedProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendedProduct>() {
           @Override
           public void write(JsonWriter out, RecommendedProduct value) throws IOException {
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
           public RecommendedProduct read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecommendedProduct instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecommendedProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecommendedProduct
  * @throws IOException if the JSON string is invalid with respect to RecommendedProduct
  */
  public static RecommendedProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendedProduct.class);
  }

 /**
  * Convert an instance of RecommendedProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

