/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.criteo.api.marketingsolutions.v2022_07.JSON;

/**
 * the contactlist operation attributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactlistOperationAttributes {
  public static final String SERIALIZED_NAME_CONTACT_LIST_ID = "contactListId";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST_ID)
  private Integer contactListId;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_REQUEST_DATE = "requestDate";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATE)
  private OffsetDateTime requestDate;

  public static final String SERIALIZED_NAME_IDENTIFIER_TYPE = "identifierType";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_TYPE)
  private String identifierType;

  public static final String SERIALIZED_NAME_NB_VALID_IDENTIFIERS = "nbValidIdentifiers";
  @SerializedName(SERIALIZED_NAME_NB_VALID_IDENTIFIERS)
  private Integer nbValidIdentifiers;

  public static final String SERIALIZED_NAME_NB_INVALID_IDENTIFIERS = "nbInvalidIdentifiers";
  @SerializedName(SERIALIZED_NAME_NB_INVALID_IDENTIFIERS)
  private Integer nbInvalidIdentifiers;

  public static final String SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS = "sampleInvalidIdentifiers";
  @SerializedName(SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS)
  private List<String> sampleInvalidIdentifiers = null;

  public ContactlistOperationAttributes() {
  }

  public ContactlistOperationAttributes contactListId(Integer contactListId) {
    
    this.contactListId = contactListId;
    return this;
  }

   /**
   * the affected user list id
   * @return contactListId
  **/
  @javax.annotation.Nullable

  public Integer getContactListId() {
    return contactListId;
  }


  public void setContactListId(Integer contactListId) {
    this.contactListId = contactListId;
  }


  public ContactlistOperationAttributes operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The action recorded
   * @return operation
  **/
  @javax.annotation.Nonnull

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ContactlistOperationAttributes requestDate(OffsetDateTime requestDate) {
    
    this.requestDate = requestDate;
    return this;
  }

   /**
   * When the action was recorded
   * @return requestDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getRequestDate() {
    return requestDate;
  }


  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }


  public ContactlistOperationAttributes identifierType(String identifierType) {
    
    this.identifierType = identifierType;
    return this;
  }

   /**
   * The schema specified for of the identifiers
   * @return identifierType
  **/
  @javax.annotation.Nullable

  public String getIdentifierType() {
    return identifierType;
  }


  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }


  public ContactlistOperationAttributes nbValidIdentifiers(Integer nbValidIdentifiers) {
    
    this.nbValidIdentifiers = nbValidIdentifiers;
    return this;
  }

   /**
   * How many identifiers were valid for the specified schema
   * @return nbValidIdentifiers
  **/
  @javax.annotation.Nullable

  public Integer getNbValidIdentifiers() {
    return nbValidIdentifiers;
  }


  public void setNbValidIdentifiers(Integer nbValidIdentifiers) {
    this.nbValidIdentifiers = nbValidIdentifiers;
  }


  public ContactlistOperationAttributes nbInvalidIdentifiers(Integer nbInvalidIdentifiers) {
    
    this.nbInvalidIdentifiers = nbInvalidIdentifiers;
    return this;
  }

   /**
   * How many identifiers were invalid for the specified schema
   * @return nbInvalidIdentifiers
  **/
  @javax.annotation.Nullable

  public Integer getNbInvalidIdentifiers() {
    return nbInvalidIdentifiers;
  }


  public void setNbInvalidIdentifiers(Integer nbInvalidIdentifiers) {
    this.nbInvalidIdentifiers = nbInvalidIdentifiers;
  }


  public ContactlistOperationAttributes sampleInvalidIdentifiers(List<String> sampleInvalidIdentifiers) {
    
    this.sampleInvalidIdentifiers = sampleInvalidIdentifiers;
    return this;
  }

  public ContactlistOperationAttributes addSampleInvalidIdentifiersItem(String sampleInvalidIdentifiersItem) {
    if (this.sampleInvalidIdentifiers == null) {
      this.sampleInvalidIdentifiers = new ArrayList<>();
    }
    this.sampleInvalidIdentifiers.add(sampleInvalidIdentifiersItem);
    return this;
  }

   /**
   * A sample of invalid identifiers if there is some
   * @return sampleInvalidIdentifiers
  **/
  @javax.annotation.Nullable

  public List<String> getSampleInvalidIdentifiers() {
    return sampleInvalidIdentifiers;
  }


  public void setSampleInvalidIdentifiers(List<String> sampleInvalidIdentifiers) {
    this.sampleInvalidIdentifiers = sampleInvalidIdentifiers;
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
   * @return the ContactlistOperationAttributes instance itself
   */
  public ContactlistOperationAttributes putAdditionalProperty(String key, Object value) {
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
    ContactlistOperationAttributes contactlistOperationAttributes = (ContactlistOperationAttributes) o;
    return Objects.equals(this.contactListId, contactlistOperationAttributes.contactListId) &&
        Objects.equals(this.operation, contactlistOperationAttributes.operation) &&
        Objects.equals(this.requestDate, contactlistOperationAttributes.requestDate) &&
        Objects.equals(this.identifierType, contactlistOperationAttributes.identifierType) &&
        Objects.equals(this.nbValidIdentifiers, contactlistOperationAttributes.nbValidIdentifiers) &&
        Objects.equals(this.nbInvalidIdentifiers, contactlistOperationAttributes.nbInvalidIdentifiers) &&
        Objects.equals(this.sampleInvalidIdentifiers, contactlistOperationAttributes.sampleInvalidIdentifiers)&&
        Objects.equals(this.additionalProperties, contactlistOperationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListId, operation, requestDate, identifierType, nbValidIdentifiers, nbInvalidIdentifiers, sampleInvalidIdentifiers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactlistOperationAttributes {\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    nbValidIdentifiers: ").append(toIndentedString(nbValidIdentifiers)).append("\n");
    sb.append("    nbInvalidIdentifiers: ").append(toIndentedString(nbInvalidIdentifiers)).append("\n");
    sb.append("    sampleInvalidIdentifiers: ").append(toIndentedString(sampleInvalidIdentifiers)).append("\n");
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
    openapiFields.add("contactListId");
    openapiFields.add("operation");
    openapiFields.add("requestDate");
    openapiFields.add("identifierType");
    openapiFields.add("nbValidIdentifiers");
    openapiFields.add("nbInvalidIdentifiers");
    openapiFields.add("sampleInvalidIdentifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactlistOperationAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContactlistOperationAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactlistOperationAttributes is not found in the empty JSON string", ContactlistOperationAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContactlistOperationAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("identifierType") != null && !jsonObj.get("identifierType").isJsonNull()) && !jsonObj.get("identifierType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifierType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifierType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sampleInvalidIdentifiers") != null && !jsonObj.get("sampleInvalidIdentifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sampleInvalidIdentifiers` to be an array in the JSON string but got `%s`", jsonObj.get("sampleInvalidIdentifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactlistOperationAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactlistOperationAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactlistOperationAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactlistOperationAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactlistOperationAttributes>() {
           @Override
           public void write(JsonWriter out, ContactlistOperationAttributes value) throws IOException {
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
           public ContactlistOperationAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContactlistOperationAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContactlistOperationAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactlistOperationAttributes
  * @throws IOException if the JSON string is invalid with respect to ContactlistOperationAttributes
  */
  public static ContactlistOperationAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactlistOperationAttributes.class);
  }

 /**
  * Convert an instance of ContactlistOperationAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

