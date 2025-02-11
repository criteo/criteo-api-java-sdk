/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_07.model;

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

import com.criteo.api.retailmedia.v2024_07.JSON;

/**
 * The status of an asynchronous request to generate a catalog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalCatalogStatus {
  /**
   * An enumeration of the status of the catalog.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    PENDING("pending"),
    
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    EXPIRED("expired");

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

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ROW_COUNT = "rowCount";
  @SerializedName(SERIALIZED_NAME_ROW_COUNT)
  private Integer rowCount;

  public static final String SERIALIZED_NAME_FILE_SIZE_BYTES = "fileSizeBytes";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE_BYTES)
  private Integer fileSizeBytes;

  public static final String SERIALIZED_NAME_MD5_CHECKSUM = "md5Checksum";
  @SerializedName(SERIALIZED_NAME_MD5_CHECKSUM)
  private String md5Checksum;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ExternalCatalogStatus() {
  }

  public ExternalCatalogStatus status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * An enumeration of the status of the catalog.
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalCatalogStatus currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * An ISO4217 representation of the currency products are listed under in this catalog.
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ExternalCatalogStatus rowCount(Integer rowCount) {
    
    this.rowCount = rowCount;
    return this;
  }

   /**
   * An indication of the number of products contained in this catalog. Available when  this catalog reaches a success status.
   * @return rowCount
  **/
  @javax.annotation.Nullable

  public Integer getRowCount() {
    return rowCount;
  }


  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }


  public ExternalCatalogStatus fileSizeBytes(Integer fileSizeBytes) {
    
    this.fileSizeBytes = fileSizeBytes;
    return this;
  }

   /**
   * The size of this catalog in bytes. Available when this catalog reaches a success status.
   * @return fileSizeBytes
  **/
  @javax.annotation.Nullable

  public Integer getFileSizeBytes() {
    return fileSizeBytes;
  }


  public void setFileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
  }


  public ExternalCatalogStatus md5Checksum(String md5Checksum) {
    
    this.md5Checksum = md5Checksum;
    return this;
  }

   /**
   * An MD5 checksum of the catalog for use in confirming complete and uncorrupted retrieval.  Available when this catalog reaches a success status.
   * @return md5Checksum
  **/
  @javax.annotation.Nullable

  public String getMd5Checksum() {
    return md5Checksum;
  }


  public void setMd5Checksum(String md5Checksum) {
    this.md5Checksum = md5Checksum;
  }


  public ExternalCatalogStatus createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time this catalog was created. Represented as a UTC ISO8601 string.
   * @return createdAt
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ExternalCatalogStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * An optional information message intended for developer consumption.
   * @return message
  **/
  @javax.annotation.Nullable

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
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
   * @return the ExternalCatalogStatus instance itself
   */
  public ExternalCatalogStatus putAdditionalProperty(String key, Object value) {
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
    ExternalCatalogStatus externalCatalogStatus = (ExternalCatalogStatus) o;
    return Objects.equals(this.status, externalCatalogStatus.status) &&
        Objects.equals(this.currency, externalCatalogStatus.currency) &&
        Objects.equals(this.rowCount, externalCatalogStatus.rowCount) &&
        Objects.equals(this.fileSizeBytes, externalCatalogStatus.fileSizeBytes) &&
        Objects.equals(this.md5Checksum, externalCatalogStatus.md5Checksum) &&
        Objects.equals(this.createdAt, externalCatalogStatus.createdAt) &&
        Objects.equals(this.message, externalCatalogStatus.message)&&
        Objects.equals(this.additionalProperties, externalCatalogStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, currency, rowCount, fileSizeBytes, md5Checksum, createdAt, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalCatalogStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    fileSizeBytes: ").append(toIndentedString(fileSizeBytes)).append("\n");
    sb.append("    md5Checksum: ").append(toIndentedString(md5Checksum)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("currency");
    openapiFields.add("rowCount");
    openapiFields.add("fileSizeBytes");
    openapiFields.add("md5Checksum");
    openapiFields.add("createdAt");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("rowCount");
    openapiRequiredFields.add("fileSizeBytes");
    openapiRequiredFields.add("md5Checksum");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalCatalogStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalCatalogStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalCatalogStatus is not found in the empty JSON string", ExternalCatalogStatus.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalCatalogStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("md5Checksum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5Checksum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5Checksum").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalCatalogStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalCatalogStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalCatalogStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalCatalogStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalCatalogStatus>() {
           @Override
           public void write(JsonWriter out, ExternalCatalogStatus value) throws IOException {
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
           public ExternalCatalogStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalCatalogStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalCatalogStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalCatalogStatus
  * @throws IOException if the JSON string is invalid with respect to ExternalCatalogStatus
  */
  public static ExternalCatalogStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalCatalogStatus.class);
  }

 /**
  * Convert an instance of ExternalCatalogStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

