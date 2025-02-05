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
 * Request data of retail media contact list amendment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaContactlistAmendment {
  /**
   * Whether to add or remove users
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ADD("add"),
    
    REMOVE("remove");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  /**
   * What type of identifiers are used
   */
  @JsonAdapter(IdentifierTypeEnum.Adapter.class)
  public enum IdentifierTypeEnum {
    EMAIL("Email"),
    
    USERIDENTIFIER("UserIdentifier"),
    
    IDENTITYLINK("IdentityLink"),
    
    GUM("Gum"),
    
    CUSTOMERID("CustomerId"),
    
    PHONENUMBER("PhoneNumber");

    private String value;

    IdentifierTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentifierTypeEnum fromValue(String value) {
      for (IdentifierTypeEnum b : IdentifierTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IdentifierTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentifierTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdentifierTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdentifierTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IDENTIFIER_TYPE = "identifierType";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_TYPE)
  private IdentifierTypeEnum identifierType;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<String> identifiers = new ArrayList<>();

  public RetailMediaContactlistAmendment() {
  }

  public RetailMediaContactlistAmendment operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Whether to add or remove users
   * @return operation
  **/
  @javax.annotation.Nonnull

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public RetailMediaContactlistAmendment identifierType(IdentifierTypeEnum identifierType) {
    
    this.identifierType = identifierType;
    return this;
  }

   /**
   * What type of identifiers are used
   * @return identifierType
  **/
  @javax.annotation.Nullable

  public IdentifierTypeEnum getIdentifierType() {
    return identifierType;
  }


  public void setIdentifierType(IdentifierTypeEnum identifierType) {
    this.identifierType = identifierType;
  }


  public RetailMediaContactlistAmendment identifiers(List<String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public RetailMediaContactlistAmendment addIdentifiersItem(String identifiersItem) {
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * The users to add or remove, each in the schema specified
   * @return identifiers
  **/
  @javax.annotation.Nonnull

  public List<String> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<String> identifiers) {
    this.identifiers = identifiers;
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
   * @return the RetailMediaContactlistAmendment instance itself
   */
  public RetailMediaContactlistAmendment putAdditionalProperty(String key, Object value) {
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
    RetailMediaContactlistAmendment retailMediaContactlistAmendment = (RetailMediaContactlistAmendment) o;
    return Objects.equals(this.operation, retailMediaContactlistAmendment.operation) &&
        Objects.equals(this.identifierType, retailMediaContactlistAmendment.identifierType) &&
        Objects.equals(this.identifiers, retailMediaContactlistAmendment.identifiers)&&
        Objects.equals(this.additionalProperties, retailMediaContactlistAmendment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, identifierType, identifiers, additionalProperties);
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
    sb.append("class RetailMediaContactlistAmendment {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("identifierType");
    openapiFields.add("identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
    openapiRequiredFields.add("identifiers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaContactlistAmendment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaContactlistAmendment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaContactlistAmendment is not found in the empty JSON string", RetailMediaContactlistAmendment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetailMediaContactlistAmendment.openapiRequiredFields) {
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
      // ensure the required json array is present
      if (jsonObj.get("identifiers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaContactlistAmendment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaContactlistAmendment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaContactlistAmendment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaContactlistAmendment.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaContactlistAmendment>() {
           @Override
           public void write(JsonWriter out, RetailMediaContactlistAmendment value) throws IOException {
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
           public RetailMediaContactlistAmendment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetailMediaContactlistAmendment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetailMediaContactlistAmendment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaContactlistAmendment
  * @throws IOException if the JSON string is invalid with respect to RetailMediaContactlistAmendment
  */
  public static RetailMediaContactlistAmendment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaContactlistAmendment.class);
  }

 /**
  * Convert an instance of RetailMediaContactlistAmendment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

