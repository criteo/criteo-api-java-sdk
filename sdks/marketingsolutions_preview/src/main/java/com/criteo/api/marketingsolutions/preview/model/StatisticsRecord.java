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
import java.time.OffsetDateTime;

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
 * The format  statistics report for a period between startDate and endDate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatisticsRecord {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private Long variant;

  public static final String SERIALIZED_NAME_DISPLAYABLE = "displayable";
  @SerializedName(SERIALIZED_NAME_DISPLAYABLE)
  private Long displayable;

  public static final String SERIALIZED_NAME_NON_DISPLAYABLE = "nonDisplayable";
  @SerializedName(SERIALIZED_NAME_NON_DISPLAYABLE)
  private Long nonDisplayable;

  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private Long added;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Long deleted;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Long updated;

  public static final String SERIALIZED_NAME_BLACKLISTED = "blacklisted";
  @SerializedName(SERIALIZED_NAME_BLACKLISTED)
  private Long blacklisted;

  public static final String SERIALIZED_NAME_OUT_OF_STOCK = "outOfStock";
  @SerializedName(SERIALIZED_NAME_OUT_OF_STOCK)
  private Long outOfStock;

  public static final String SERIALIZED_NAME_MISSING_IMAGE = "missingImage";
  @SerializedName(SERIALIZED_NAME_MISSING_IMAGE)
  private Long missingImage;

  public static final String SERIALIZED_NAME_MISSING_URL = "missingUrl";
  @SerializedName(SERIALIZED_NAME_MISSING_URL)
  private Long missingUrl;

  public static final String SERIALIZED_NAME_MISSING_PRICE = "missingPrice";
  @SerializedName(SERIALIZED_NAME_MISSING_PRICE)
  private Long missingPrice;

  public static final String SERIALIZED_NAME_MISSING_NAME = "missingName";
  @SerializedName(SERIALIZED_NAME_MISSING_NAME)
  private Long missingName;

  public static final String SERIALIZED_NAME_MISSING_DESCRIPTION = "missingDescription";
  @SerializedName(SERIALIZED_NAME_MISSING_DESCRIPTION)
  private Long missingDescription;

  public StatisticsRecord() {
  }

  public StatisticsRecord startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of streaming products collection
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public StatisticsRecord endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of streaming products collection
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public StatisticsRecord total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * The number of total products at endDate moment
   * @return total
  **/
  @javax.annotation.Nonnull

  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }


  public StatisticsRecord variant(Long variant) {
    
    this.variant = variant;
    return this;
  }

   /**
   * The number of total variant products at endDate moment
   * @return variant
  **/
  @javax.annotation.Nonnull

  public Long getVariant() {
    return variant;
  }


  public void setVariant(Long variant) {
    this.variant = variant;
  }


  public StatisticsRecord displayable(Long displayable) {
    
    this.displayable = displayable;
    return this;
  }

   /**
   * The number of total displayable products at endDate moment
   * @return displayable
  **/
  @javax.annotation.Nonnull

  public Long getDisplayable() {
    return displayable;
  }


  public void setDisplayable(Long displayable) {
    this.displayable = displayable;
  }


  public StatisticsRecord nonDisplayable(Long nonDisplayable) {
    
    this.nonDisplayable = nonDisplayable;
    return this;
  }

   /**
   * The number of total non-displayable products at endDate moment
   * @return nonDisplayable
  **/
  @javax.annotation.Nonnull

  public Long getNonDisplayable() {
    return nonDisplayable;
  }


  public void setNonDisplayable(Long nonDisplayable) {
    this.nonDisplayable = nonDisplayable;
  }


  public StatisticsRecord added(Long added) {
    
    this.added = added;
    return this;
  }

   /**
   * The number of inserted products during the period between startDate and endDate
   * @return added
  **/
  @javax.annotation.Nonnull

  public Long getAdded() {
    return added;
  }


  public void setAdded(Long added) {
    this.added = added;
  }


  public StatisticsRecord deleted(Long deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * The number of deleted products during the period between startDate and endDate
   * @return deleted
  **/
  @javax.annotation.Nonnull

  public Long getDeleted() {
    return deleted;
  }


  public void setDeleted(Long deleted) {
    this.deleted = deleted;
  }


  public StatisticsRecord updated(Long updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * The number of updated products during the period between startDate and endDate
   * @return updated
  **/
  @javax.annotation.Nonnull

  public Long getUpdated() {
    return updated;
  }


  public void setUpdated(Long updated) {
    this.updated = updated;
  }


  public StatisticsRecord blacklisted(Long blacklisted) {
    
    this.blacklisted = blacklisted;
    return this;
  }

   /**
   * The number of total blacklisted products at endDate moment
   * @return blacklisted
  **/
  @javax.annotation.Nonnull

  public Long getBlacklisted() {
    return blacklisted;
  }


  public void setBlacklisted(Long blacklisted) {
    this.blacklisted = blacklisted;
  }


  public StatisticsRecord outOfStock(Long outOfStock) {
    
    this.outOfStock = outOfStock;
    return this;
  }

   /**
   * The number of total out-of-stock products at endDate moment
   * @return outOfStock
  **/
  @javax.annotation.Nonnull

  public Long getOutOfStock() {
    return outOfStock;
  }


  public void setOutOfStock(Long outOfStock) {
    this.outOfStock = outOfStock;
  }


  public StatisticsRecord missingImage(Long missingImage) {
    
    this.missingImage = missingImage;
    return this;
  }

   /**
   * The number of total missing image products at endDate moment
   * @return missingImage
  **/
  @javax.annotation.Nonnull

  public Long getMissingImage() {
    return missingImage;
  }


  public void setMissingImage(Long missingImage) {
    this.missingImage = missingImage;
  }


  public StatisticsRecord missingUrl(Long missingUrl) {
    
    this.missingUrl = missingUrl;
    return this;
  }

   /**
   * The number of total missing url products at endDate moment
   * @return missingUrl
  **/
  @javax.annotation.Nonnull

  public Long getMissingUrl() {
    return missingUrl;
  }


  public void setMissingUrl(Long missingUrl) {
    this.missingUrl = missingUrl;
  }


  public StatisticsRecord missingPrice(Long missingPrice) {
    
    this.missingPrice = missingPrice;
    return this;
  }

   /**
   * The number of total missing price products at endDate moment
   * @return missingPrice
  **/
  @javax.annotation.Nonnull

  public Long getMissingPrice() {
    return missingPrice;
  }


  public void setMissingPrice(Long missingPrice) {
    this.missingPrice = missingPrice;
  }


  public StatisticsRecord missingName(Long missingName) {
    
    this.missingName = missingName;
    return this;
  }

   /**
   * The number of total missing name products at endDate moment
   * @return missingName
  **/
  @javax.annotation.Nonnull

  public Long getMissingName() {
    return missingName;
  }


  public void setMissingName(Long missingName) {
    this.missingName = missingName;
  }


  public StatisticsRecord missingDescription(Long missingDescription) {
    
    this.missingDescription = missingDescription;
    return this;
  }

   /**
   * The number of total missing description products at endDate moment
   * @return missingDescription
  **/
  @javax.annotation.Nonnull

  public Long getMissingDescription() {
    return missingDescription;
  }


  public void setMissingDescription(Long missingDescription) {
    this.missingDescription = missingDescription;
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
   * @return the StatisticsRecord instance itself
   */
  public StatisticsRecord putAdditionalProperty(String key, Object value) {
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
    StatisticsRecord statisticsRecord = (StatisticsRecord) o;
    return Objects.equals(this.startDate, statisticsRecord.startDate) &&
        Objects.equals(this.endDate, statisticsRecord.endDate) &&
        Objects.equals(this.total, statisticsRecord.total) &&
        Objects.equals(this.variant, statisticsRecord.variant) &&
        Objects.equals(this.displayable, statisticsRecord.displayable) &&
        Objects.equals(this.nonDisplayable, statisticsRecord.nonDisplayable) &&
        Objects.equals(this.added, statisticsRecord.added) &&
        Objects.equals(this.deleted, statisticsRecord.deleted) &&
        Objects.equals(this.updated, statisticsRecord.updated) &&
        Objects.equals(this.blacklisted, statisticsRecord.blacklisted) &&
        Objects.equals(this.outOfStock, statisticsRecord.outOfStock) &&
        Objects.equals(this.missingImage, statisticsRecord.missingImage) &&
        Objects.equals(this.missingUrl, statisticsRecord.missingUrl) &&
        Objects.equals(this.missingPrice, statisticsRecord.missingPrice) &&
        Objects.equals(this.missingName, statisticsRecord.missingName) &&
        Objects.equals(this.missingDescription, statisticsRecord.missingDescription)&&
        Objects.equals(this.additionalProperties, statisticsRecord.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, total, variant, displayable, nonDisplayable, added, deleted, updated, blacklisted, outOfStock, missingImage, missingUrl, missingPrice, missingName, missingDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsRecord {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
    sb.append("    nonDisplayable: ").append(toIndentedString(nonDisplayable)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    blacklisted: ").append(toIndentedString(blacklisted)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    missingImage: ").append(toIndentedString(missingImage)).append("\n");
    sb.append("    missingUrl: ").append(toIndentedString(missingUrl)).append("\n");
    sb.append("    missingPrice: ").append(toIndentedString(missingPrice)).append("\n");
    sb.append("    missingName: ").append(toIndentedString(missingName)).append("\n");
    sb.append("    missingDescription: ").append(toIndentedString(missingDescription)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("total");
    openapiFields.add("variant");
    openapiFields.add("displayable");
    openapiFields.add("nonDisplayable");
    openapiFields.add("added");
    openapiFields.add("deleted");
    openapiFields.add("updated");
    openapiFields.add("blacklisted");
    openapiFields.add("outOfStock");
    openapiFields.add("missingImage");
    openapiFields.add("missingUrl");
    openapiFields.add("missingPrice");
    openapiFields.add("missingName");
    openapiFields.add("missingDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("variant");
    openapiRequiredFields.add("displayable");
    openapiRequiredFields.add("nonDisplayable");
    openapiRequiredFields.add("added");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("updated");
    openapiRequiredFields.add("blacklisted");
    openapiRequiredFields.add("outOfStock");
    openapiRequiredFields.add("missingImage");
    openapiRequiredFields.add("missingUrl");
    openapiRequiredFields.add("missingPrice");
    openapiRequiredFields.add("missingName");
    openapiRequiredFields.add("missingDescription");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatisticsRecord
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatisticsRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatisticsRecord is not found in the empty JSON string", StatisticsRecord.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatisticsRecord.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatisticsRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatisticsRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatisticsRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatisticsRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<StatisticsRecord>() {
           @Override
           public void write(JsonWriter out, StatisticsRecord value) throws IOException {
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
           public StatisticsRecord read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatisticsRecord instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatisticsRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatisticsRecord
  * @throws IOException if the JSON string is invalid with respect to StatisticsRecord
  */
  public static StatisticsRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatisticsRecord.class);
  }

 /**
  * Convert an instance of StatisticsRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

