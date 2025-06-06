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
import com.criteo.api.marketingsolutions.preview.model.ReportDetailErrors;
import com.criteo.api.marketingsolutions.preview.model.ReportDetailWarnings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * The report on a given operationToken is ready. The report is available for 4 days
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportOkResponse {
  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private List<ReportDetailErrors> errorDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMPORT_REQUEST_TIMESTAMP = "importRequestTimestamp";
  @SerializedName(SERIALIZED_NAME_IMPORT_REQUEST_TIMESTAMP)
  private String importRequestTimestamp;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS_DELETED = "numberOfProductsDeleted";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS_DELETED)
  private String numberOfProductsDeleted;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS_IN_THE_BATCH = "numberOfProductsInTheBatch";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS_IN_THE_BATCH)
  private String numberOfProductsInTheBatch;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS_UPSERTED = "numberOfProductsUpserted";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS_UPSERTED)
  private String numberOfProductsUpserted;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS_WITH_ERRORS = "numberOfProductsWithErrors";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS_WITH_ERRORS)
  private String numberOfProductsWithErrors;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS_WITH_WARNINGS = "numberOfProductsWithWarnings";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS_WITH_WARNINGS)
  private String numberOfProductsWithWarnings;

  /**
   * The status of the operation. The operation is completed when the status is one of (VALIDATED,VALIDATED_WITH_ERRORS,FAILED)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACCEPTED("ACCEPTED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    VALIDATED("VALIDATED"),
    
    VALIDATED_WITH_ERRORS("VALIDATED_WITH_ERRORS"),
    
    FAILED("FAILED");

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

  public static final String SERIALIZED_NAME_WARNING_DETAILS = "warningDetails";
  @SerializedName(SERIALIZED_NAME_WARNING_DETAILS)
  private List<ReportDetailWarnings> warningDetails = new ArrayList<>();

  public ReportOkResponse() {
  }

  public ReportOkResponse errorDetails(List<ReportDetailErrors> errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

  public ReportOkResponse addErrorDetailsItem(ReportDetailErrors errorDetailsItem) {
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

   /**
   * The list of errors with details.
   * @return errorDetails
  **/
  @javax.annotation.Nonnull

  public List<ReportDetailErrors> getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(List<ReportDetailErrors> errorDetails) {
    this.errorDetails = errorDetails;
  }


  public ReportOkResponse importRequestTimestamp(String importRequestTimestamp) {
    
    this.importRequestTimestamp = importRequestTimestamp;
    return this;
  }

   /**
   * The date when the original batch request was sent.
   * @return importRequestTimestamp
  **/
  @javax.annotation.Nullable

  public String getImportRequestTimestamp() {
    return importRequestTimestamp;
  }


  public void setImportRequestTimestamp(String importRequestTimestamp) {
    this.importRequestTimestamp = importRequestTimestamp;
  }


  public ReportOkResponse numberOfProductsDeleted(String numberOfProductsDeleted) {
    
    this.numberOfProductsDeleted = numberOfProductsDeleted;
    return this;
  }

   /**
   * The number of products deleted.
   * @return numberOfProductsDeleted
  **/
  @javax.annotation.Nullable

  public String getNumberOfProductsDeleted() {
    return numberOfProductsDeleted;
  }


  public void setNumberOfProductsDeleted(String numberOfProductsDeleted) {
    this.numberOfProductsDeleted = numberOfProductsDeleted;
  }


  public ReportOkResponse numberOfProductsInTheBatch(String numberOfProductsInTheBatch) {
    
    this.numberOfProductsInTheBatch = numberOfProductsInTheBatch;
    return this;
  }

   /**
   * The number of products present in the batch.
   * @return numberOfProductsInTheBatch
  **/
  @javax.annotation.Nullable

  public String getNumberOfProductsInTheBatch() {
    return numberOfProductsInTheBatch;
  }


  public void setNumberOfProductsInTheBatch(String numberOfProductsInTheBatch) {
    this.numberOfProductsInTheBatch = numberOfProductsInTheBatch;
  }


  public ReportOkResponse numberOfProductsUpserted(String numberOfProductsUpserted) {
    
    this.numberOfProductsUpserted = numberOfProductsUpserted;
    return this;
  }

   /**
   * The number of products upserted.
   * @return numberOfProductsUpserted
  **/
  @javax.annotation.Nullable

  public String getNumberOfProductsUpserted() {
    return numberOfProductsUpserted;
  }


  public void setNumberOfProductsUpserted(String numberOfProductsUpserted) {
    this.numberOfProductsUpserted = numberOfProductsUpserted;
  }


  public ReportOkResponse numberOfProductsWithErrors(String numberOfProductsWithErrors) {
    
    this.numberOfProductsWithErrors = numberOfProductsWithErrors;
    return this;
  }

   /**
   * The number of products with errors.
   * @return numberOfProductsWithErrors
  **/
  @javax.annotation.Nullable

  public String getNumberOfProductsWithErrors() {
    return numberOfProductsWithErrors;
  }


  public void setNumberOfProductsWithErrors(String numberOfProductsWithErrors) {
    this.numberOfProductsWithErrors = numberOfProductsWithErrors;
  }


  public ReportOkResponse numberOfProductsWithWarnings(String numberOfProductsWithWarnings) {
    
    this.numberOfProductsWithWarnings = numberOfProductsWithWarnings;
    return this;
  }

   /**
   * The number of products with Warnings.
   * @return numberOfProductsWithWarnings
  **/
  @javax.annotation.Nullable

  public String getNumberOfProductsWithWarnings() {
    return numberOfProductsWithWarnings;
  }


  public void setNumberOfProductsWithWarnings(String numberOfProductsWithWarnings) {
    this.numberOfProductsWithWarnings = numberOfProductsWithWarnings;
  }


  public ReportOkResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the operation. The operation is completed when the status is one of (VALIDATED,VALIDATED_WITH_ERRORS,FAILED)
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ReportOkResponse warningDetails(List<ReportDetailWarnings> warningDetails) {
    
    this.warningDetails = warningDetails;
    return this;
  }

  public ReportOkResponse addWarningDetailsItem(ReportDetailWarnings warningDetailsItem) {
    this.warningDetails.add(warningDetailsItem);
    return this;
  }

   /**
   * The list of Warnings with details.
   * @return warningDetails
  **/
  @javax.annotation.Nonnull

  public List<ReportDetailWarnings> getWarningDetails() {
    return warningDetails;
  }


  public void setWarningDetails(List<ReportDetailWarnings> warningDetails) {
    this.warningDetails = warningDetails;
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
   * @return the ReportOkResponse instance itself
   */
  public ReportOkResponse putAdditionalProperty(String key, Object value) {
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
    ReportOkResponse reportOkResponse = (ReportOkResponse) o;
    return Objects.equals(this.errorDetails, reportOkResponse.errorDetails) &&
        Objects.equals(this.importRequestTimestamp, reportOkResponse.importRequestTimestamp) &&
        Objects.equals(this.numberOfProductsDeleted, reportOkResponse.numberOfProductsDeleted) &&
        Objects.equals(this.numberOfProductsInTheBatch, reportOkResponse.numberOfProductsInTheBatch) &&
        Objects.equals(this.numberOfProductsUpserted, reportOkResponse.numberOfProductsUpserted) &&
        Objects.equals(this.numberOfProductsWithErrors, reportOkResponse.numberOfProductsWithErrors) &&
        Objects.equals(this.numberOfProductsWithWarnings, reportOkResponse.numberOfProductsWithWarnings) &&
        Objects.equals(this.status, reportOkResponse.status) &&
        Objects.equals(this.warningDetails, reportOkResponse.warningDetails)&&
        Objects.equals(this.additionalProperties, reportOkResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, importRequestTimestamp, numberOfProductsDeleted, numberOfProductsInTheBatch, numberOfProductsUpserted, numberOfProductsWithErrors, numberOfProductsWithWarnings, status, warningDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportOkResponse {\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    importRequestTimestamp: ").append(toIndentedString(importRequestTimestamp)).append("\n");
    sb.append("    numberOfProductsDeleted: ").append(toIndentedString(numberOfProductsDeleted)).append("\n");
    sb.append("    numberOfProductsInTheBatch: ").append(toIndentedString(numberOfProductsInTheBatch)).append("\n");
    sb.append("    numberOfProductsUpserted: ").append(toIndentedString(numberOfProductsUpserted)).append("\n");
    sb.append("    numberOfProductsWithErrors: ").append(toIndentedString(numberOfProductsWithErrors)).append("\n");
    sb.append("    numberOfProductsWithWarnings: ").append(toIndentedString(numberOfProductsWithWarnings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warningDetails: ").append(toIndentedString(warningDetails)).append("\n");
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
    openapiFields.add("errorDetails");
    openapiFields.add("importRequestTimestamp");
    openapiFields.add("numberOfProductsDeleted");
    openapiFields.add("numberOfProductsInTheBatch");
    openapiFields.add("numberOfProductsUpserted");
    openapiFields.add("numberOfProductsWithErrors");
    openapiFields.add("numberOfProductsWithWarnings");
    openapiFields.add("status");
    openapiFields.add("warningDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errorDetails");
    openapiRequiredFields.add("importRequestTimestamp");
    openapiRequiredFields.add("numberOfProductsDeleted");
    openapiRequiredFields.add("numberOfProductsInTheBatch");
    openapiRequiredFields.add("numberOfProductsUpserted");
    openapiRequiredFields.add("numberOfProductsWithErrors");
    openapiRequiredFields.add("numberOfProductsWithWarnings");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("warningDetails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportOkResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportOkResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportOkResponse is not found in the empty JSON string", ReportOkResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportOkResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("errorDetails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be an array in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }

      JsonArray jsonArrayerrorDetails = jsonObj.getAsJsonArray("errorDetails");
      // validate the required field `errorDetails` (array)
      for (int i = 0; i < jsonArrayerrorDetails.size(); i++) {
        ReportDetailErrors.validateJsonObject(jsonArrayerrorDetails.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("importRequestTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `importRequestTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("importRequestTimestamp").toString()));
      }
      if (!jsonObj.get("numberOfProductsDeleted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfProductsDeleted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfProductsDeleted").toString()));
      }
      if (!jsonObj.get("numberOfProductsInTheBatch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfProductsInTheBatch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfProductsInTheBatch").toString()));
      }
      if (!jsonObj.get("numberOfProductsUpserted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfProductsUpserted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfProductsUpserted").toString()));
      }
      if (!jsonObj.get("numberOfProductsWithErrors").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfProductsWithErrors` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfProductsWithErrors").toString()));
      }
      if (!jsonObj.get("numberOfProductsWithWarnings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfProductsWithWarnings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfProductsWithWarnings").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("warningDetails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningDetails` to be an array in the JSON string but got `%s`", jsonObj.get("warningDetails").toString()));
      }

      JsonArray jsonArraywarningDetails = jsonObj.getAsJsonArray("warningDetails");
      // validate the required field `warningDetails` (array)
      for (int i = 0; i < jsonArraywarningDetails.size(); i++) {
        ReportDetailWarnings.validateJsonObject(jsonArraywarningDetails.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportOkResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportOkResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportOkResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportOkResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportOkResponse>() {
           @Override
           public void write(JsonWriter out, ReportOkResponse value) throws IOException {
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
           public ReportOkResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportOkResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportOkResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportOkResponse
  * @throws IOException if the JSON string is invalid with respect to ReportOkResponse
  */
  public static ReportOkResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportOkResponse.class);
  }

 /**
  * Convert an instance of ReportOkResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

