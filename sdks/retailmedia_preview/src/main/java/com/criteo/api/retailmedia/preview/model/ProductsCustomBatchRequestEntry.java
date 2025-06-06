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
import com.criteo.api.retailmedia.preview.model.Product;
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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * A product event for a batch request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductsCustomBatchRequestEntry {
  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private Long batchId;

  public static final String SERIALIZED_NAME_FEED_ID = "feedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID)
  private String feedId;

  public static final String SERIALIZED_NAME_ITEM_GROUP_ID = "itemGroupId";
  @SerializedName(SERIALIZED_NAME_ITEM_GROUP_ID)
  private String itemGroupId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private Integer merchantId;

  /**
   * The method of the batch entry.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    DELETE("delete"),
    
    INSERT("insert");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private Product product;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public ProductsCustomBatchRequestEntry() {
  }

  public ProductsCustomBatchRequestEntry batchId(Long batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * An entry ID, unique within the batch request.
   * @return batchId
  **/
  @javax.annotation.Nullable

  public Long getBatchId() {
    return batchId;
  }


  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }


  public ProductsCustomBatchRequestEntry feedId(String feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * Not used by Criteo.
   * @return feedId
  **/
  @javax.annotation.Nullable

  public String getFeedId() {
    return feedId;
  }


  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }


  public ProductsCustomBatchRequestEntry itemGroupId(String itemGroupId) {
    
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * Deprecated (providing this information is no more needed, this field will be removed in next release). The itemGroupId of the product to delete. To be defined when the method is delete and the product is a variant.
   * @return itemGroupId
  **/
  @javax.annotation.Nullable

  public String getItemGroupId() {
    return itemGroupId;
  }


  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }


  public ProductsCustomBatchRequestEntry merchantId(Integer merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the managing account. Criteo: the partnerId.
   * @return merchantId
  **/
  @javax.annotation.Nonnull

  public Integer getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(Integer merchantId) {
    this.merchantId = merchantId;
  }


  public ProductsCustomBatchRequestEntry method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method of the batch entry.
   * @return method
  **/
  @javax.annotation.Nonnull

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public ProductsCustomBatchRequestEntry product(Product product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable

  public Product getProduct() {
    return product;
  }


  public void setProduct(Product product) {
    this.product = product;
  }


  public ProductsCustomBatchRequestEntry productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * The Product ID to delete. Only defined if the method is delete.
   * @return productId
  **/
  @javax.annotation.Nullable

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
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
   * @return the ProductsCustomBatchRequestEntry instance itself
   */
  public ProductsCustomBatchRequestEntry putAdditionalProperty(String key, Object value) {
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
    ProductsCustomBatchRequestEntry productsCustomBatchRequestEntry = (ProductsCustomBatchRequestEntry) o;
    return Objects.equals(this.batchId, productsCustomBatchRequestEntry.batchId) &&
        Objects.equals(this.feedId, productsCustomBatchRequestEntry.feedId) &&
        Objects.equals(this.itemGroupId, productsCustomBatchRequestEntry.itemGroupId) &&
        Objects.equals(this.merchantId, productsCustomBatchRequestEntry.merchantId) &&
        Objects.equals(this.method, productsCustomBatchRequestEntry.method) &&
        Objects.equals(this.product, productsCustomBatchRequestEntry.product) &&
        Objects.equals(this.productId, productsCustomBatchRequestEntry.productId)&&
        Objects.equals(this.additionalProperties, productsCustomBatchRequestEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, feedId, itemGroupId, merchantId, method, product, productId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsCustomBatchRequestEntry {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    openapiFields.add("batchId");
    openapiFields.add("feedId");
    openapiFields.add("itemGroupId");
    openapiFields.add("merchantId");
    openapiFields.add("method");
    openapiFields.add("product");
    openapiFields.add("productId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantId");
    openapiRequiredFields.add("method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductsCustomBatchRequestEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductsCustomBatchRequestEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductsCustomBatchRequestEntry is not found in the empty JSON string", ProductsCustomBatchRequestEntry.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductsCustomBatchRequestEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("feedId") != null && !jsonObj.get("feedId").isJsonNull()) && !jsonObj.get("feedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedId").toString()));
      }
      if ((jsonObj.get("itemGroupId") != null && !jsonObj.get("itemGroupId").isJsonNull()) && !jsonObj.get("itemGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemGroupId").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        Product.validateJsonObject(jsonObj.getAsJsonObject("product"));
      }
      if ((jsonObj.get("productId") != null && !jsonObj.get("productId").isJsonNull()) && !jsonObj.get("productId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductsCustomBatchRequestEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductsCustomBatchRequestEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductsCustomBatchRequestEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductsCustomBatchRequestEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductsCustomBatchRequestEntry>() {
           @Override
           public void write(JsonWriter out, ProductsCustomBatchRequestEntry value) throws IOException {
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
           public ProductsCustomBatchRequestEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductsCustomBatchRequestEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductsCustomBatchRequestEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductsCustomBatchRequestEntry
  * @throws IOException if the JSON string is invalid with respect to ProductsCustomBatchRequestEntry
  */
  public static ProductsCustomBatchRequestEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductsCustomBatchRequestEntry.class);
  }

 /**
  * Convert an instance of ProductsCustomBatchRequestEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

