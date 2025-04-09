/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.ProductSetRule;
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
 * Encapsulate a group of product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSet {
  /**
   * The client type of the product set
   */
  @JsonAdapter(ClientTypeEnum.Adapter.class)
  public enum ClientTypeEnum {
    UNKNOWN("Unknown"),
    
    CGROWTH("CGrowth"),
    
    CMAX("CMax");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClientTypeEnum fromValue(String value) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClientTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClientTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLIENT_TYPE = "clientType";
  @SerializedName(SERIALIZED_NAME_CLIENT_TYPE)
  private ClientTypeEnum clientType;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEEP_VARIANT_PRODUCTS = "keepVariantProducts";
  @SerializedName(SERIALIZED_NAME_KEEP_VARIANT_PRODUCTS)
  private Boolean keepVariantProducts;

  public static final String SERIALIZED_NAME_MINIMUM_NUMBER_OF_PRODUCTS = "minimumNumberOfProducts";
  @SerializedName(SERIALIZED_NAME_MINIMUM_NUMBER_OF_PRODUCTS)
  private Integer minimumNumberOfProducts;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS = "numberOfProducts";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS)
  private Integer numberOfProducts;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ProductSetRule> rules = new ArrayList<>();

  /**
   * The status of the product set
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("Unknown"),
    
    DRAFT("Draft"),
    
    PENDING("Pending"),
    
    VALID("Valid"),
    
    INVALID("Invalid"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public ProductSet() {
  }

  public ProductSet clientType(ClientTypeEnum clientType) {
    
    this.clientType = clientType;
    return this;
  }

   /**
   * The client type of the product set
   * @return clientType
  **/
  @javax.annotation.Nonnull

  public ClientTypeEnum getClientType() {
    return clientType;
  }


  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }


  public ProductSet creationDate(String creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The creation date of the product set (UTC time in ISO8601 format). Example: \&quot;02/25/2022 14:51:26\&quot;.  Can be null if the value isn&#39;t available.
   * @return creationDate
  **/
  @javax.annotation.Nonnull

  public String getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public ProductSet datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * The dataset to which the product set belong
   * @return datasetId
  **/
  @javax.annotation.Nonnull

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public ProductSet id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProductSet keepVariantProducts(Boolean keepVariantProducts) {
    
    this.keepVariantProducts = keepVariantProducts;
    return this;
  }

   /**
   * Get keepVariantProducts
   * @return keepVariantProducts
  **/
  @javax.annotation.Nonnull

  public Boolean getKeepVariantProducts() {
    return keepVariantProducts;
  }


  public void setKeepVariantProducts(Boolean keepVariantProducts) {
    this.keepVariantProducts = keepVariantProducts;
  }


  public ProductSet minimumNumberOfProducts(Integer minimumNumberOfProducts) {
    
    this.minimumNumberOfProducts = minimumNumberOfProducts;
    return this;
  }

   /**
   * Minimum amount of products that should match the product set to consider it valid.  Greater or equal than one.
   * @return minimumNumberOfProducts
  **/
  @javax.annotation.Nonnull

  public Integer getMinimumNumberOfProducts() {
    return minimumNumberOfProducts;
  }


  public void setMinimumNumberOfProducts(Integer minimumNumberOfProducts) {
    this.minimumNumberOfProducts = minimumNumberOfProducts;
  }


  public ProductSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the product set
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductSet numberOfProducts(Integer numberOfProducts) {
    
    this.numberOfProducts = numberOfProducts;
    return this;
  }

   /**
   * The number of product matching the product set.  Can be null for newly created product set.
   * @return numberOfProducts
  **/
  @javax.annotation.Nullable

  public Integer getNumberOfProducts() {
    return numberOfProducts;
  }


  public void setNumberOfProducts(Integer numberOfProducts) {
    this.numberOfProducts = numberOfProducts;
  }


  public ProductSet rules(List<ProductSetRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public ProductSet addRulesItem(ProductSetRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The rules identifying the product belonging to the set
   * @return rules
  **/
  @javax.annotation.Nonnull

  public List<ProductSetRule> getRules() {
    return rules;
  }


  public void setRules(List<ProductSetRule> rules) {
    this.rules = rules;
  }


  public ProductSet status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the product set
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
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
   * @return the ProductSet instance itself
   */
  public ProductSet putAdditionalProperty(String key, Object value) {
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
    ProductSet productSet = (ProductSet) o;
    return Objects.equals(this.clientType, productSet.clientType) &&
        Objects.equals(this.creationDate, productSet.creationDate) &&
        Objects.equals(this.datasetId, productSet.datasetId) &&
        Objects.equals(this.id, productSet.id) &&
        Objects.equals(this.keepVariantProducts, productSet.keepVariantProducts) &&
        Objects.equals(this.minimumNumberOfProducts, productSet.minimumNumberOfProducts) &&
        Objects.equals(this.name, productSet.name) &&
        Objects.equals(this.numberOfProducts, productSet.numberOfProducts) &&
        Objects.equals(this.rules, productSet.rules) &&
        Objects.equals(this.status, productSet.status)&&
        Objects.equals(this.additionalProperties, productSet.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientType, creationDate, datasetId, id, keepVariantProducts, minimumNumberOfProducts, name, numberOfProducts, rules, status, additionalProperties);
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
    sb.append("class ProductSet {\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keepVariantProducts: ").append(toIndentedString(keepVariantProducts)).append("\n");
    sb.append("    minimumNumberOfProducts: ").append(toIndentedString(minimumNumberOfProducts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfProducts: ").append(toIndentedString(numberOfProducts)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("clientType");
    openapiFields.add("creationDate");
    openapiFields.add("datasetId");
    openapiFields.add("id");
    openapiFields.add("keepVariantProducts");
    openapiFields.add("minimumNumberOfProducts");
    openapiFields.add("name");
    openapiFields.add("numberOfProducts");
    openapiFields.add("rules");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientType");
    openapiRequiredFields.add("creationDate");
    openapiRequiredFields.add("datasetId");
    openapiRequiredFields.add("keepVariantProducts");
    openapiRequiredFields.add("minimumNumberOfProducts");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("numberOfProducts");
    openapiRequiredFields.add("rules");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSet is not found in the empty JSON string", ProductSet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductSet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("clientType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientType").toString()));
      }
      if (!jsonObj.get("creationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creationDate").toString()));
      }
      if (!jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }

      JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
      // validate the required field `rules` (array)
      for (int i = 0; i < jsonArrayrules.size(); i++) {
        ProductSetRule.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSet.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSet>() {
           @Override
           public void write(JsonWriter out, ProductSet value) throws IOException {
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
           public ProductSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductSet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSet
  * @throws IOException if the JSON string is invalid with respect to ProductSet
  */
  public static ProductSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSet.class);
  }

 /**
  * Convert an instance of ProductSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

