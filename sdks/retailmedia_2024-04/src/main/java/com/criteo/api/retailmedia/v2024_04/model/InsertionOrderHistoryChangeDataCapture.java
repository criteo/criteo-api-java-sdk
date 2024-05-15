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
import com.criteo.api.retailmedia.v2024_04.model.ChangeDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.criteo.api.retailmedia.v2024_04.JSON;

/**
 * Data model represents the data change capture of insertion order history.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InsertionOrderHistoryChangeDataCapture {
  public static final String SERIALIZED_NAME_DATE_OF_MODIFICATION = "dateOfModification";
  @SerializedName(SERIALIZED_NAME_DATE_OF_MODIFICATION)
  private OffsetDateTime dateOfModification;

  public static final String SERIALIZED_NAME_MODIFIED_BY_USER = "modifiedByUser";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_USER)
  private String modifiedByUser;

  /**
   * Represent the type of change states of the history.
   */
  @JsonAdapter(ChangeTypeEnum.Adapter.class)
  public enum ChangeTypeEnum {
    BALANCECREATED("BalanceCreated"),
    
    BALANCEADDED("BalanceAdded"),
    
    BALANCEREMOVED("BalanceRemoved"),
    
    BALANCEUNCAPPED("BalanceUncapped"),
    
    BALANCECAPPED("BalanceCapped"),
    
    ENDDATE("EndDate"),
    
    STARTDATE("StartDate"),
    
    BALANCENAME("BalanceName"),
    
    PONUMBER("PoNumber"),
    
    VALUEADD("ValueAdd"),
    
    SALESFORCEID("SalesforceId");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChangeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChangeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChangeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANGE_TYPE = "changeType";
  @SerializedName(SERIALIZED_NAME_CHANGE_TYPE)
  private ChangeTypeEnum changeType;

  public static final String SERIALIZED_NAME_CHANGE_DETAILS = "changeDetails";
  @SerializedName(SERIALIZED_NAME_CHANGE_DETAILS)
  private ChangeDetails changeDetails;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public InsertionOrderHistoryChangeDataCapture() {
  }

  public InsertionOrderHistoryChangeDataCapture dateOfModification(OffsetDateTime dateOfModification) {
    
    this.dateOfModification = dateOfModification;
    return this;
  }

   /**
   * Date when data change has occured.
   * @return dateOfModification
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getDateOfModification() {
    return dateOfModification;
  }


  public void setDateOfModification(OffsetDateTime dateOfModification) {
    this.dateOfModification = dateOfModification;
  }


  public InsertionOrderHistoryChangeDataCapture modifiedByUser(String modifiedByUser) {
    
    this.modifiedByUser = modifiedByUser;
    return this;
  }

   /**
   * User name who modified the insertion order.
   * @return modifiedByUser
  **/
  @javax.annotation.Nonnull

  public String getModifiedByUser() {
    return modifiedByUser;
  }


  public void setModifiedByUser(String modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
  }


  public InsertionOrderHistoryChangeDataCapture changeType(ChangeTypeEnum changeType) {
    
    this.changeType = changeType;
    return this;
  }

   /**
   * Represent the type of change states of the history.
   * @return changeType
  **/
  @javax.annotation.Nonnull

  public ChangeTypeEnum getChangeType() {
    return changeType;
  }


  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }


  public InsertionOrderHistoryChangeDataCapture changeDetails(ChangeDetails changeDetails) {
    
    this.changeDetails = changeDetails;
    return this;
  }

   /**
   * Get changeDetails
   * @return changeDetails
  **/
  @javax.annotation.Nonnull

  public ChangeDetails getChangeDetails() {
    return changeDetails;
  }


  public void setChangeDetails(ChangeDetails changeDetails) {
    this.changeDetails = changeDetails;
  }


  public InsertionOrderHistoryChangeDataCapture memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Memo associate with the insertion order modification.
   * @return memo
  **/
  @javax.annotation.Nullable

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertionOrderHistoryChangeDataCapture insertionOrderHistoryChangeDataCapture = (InsertionOrderHistoryChangeDataCapture) o;
    return Objects.equals(this.dateOfModification, insertionOrderHistoryChangeDataCapture.dateOfModification) &&
        Objects.equals(this.modifiedByUser, insertionOrderHistoryChangeDataCapture.modifiedByUser) &&
        Objects.equals(this.changeType, insertionOrderHistoryChangeDataCapture.changeType) &&
        Objects.equals(this.changeDetails, insertionOrderHistoryChangeDataCapture.changeDetails) &&
        Objects.equals(this.memo, insertionOrderHistoryChangeDataCapture.memo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfModification, modifiedByUser, changeType, changeDetails, memo);
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
    sb.append("class InsertionOrderHistoryChangeDataCapture {\n");
    sb.append("    dateOfModification: ").append(toIndentedString(dateOfModification)).append("\n");
    sb.append("    modifiedByUser: ").append(toIndentedString(modifiedByUser)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    changeDetails: ").append(toIndentedString(changeDetails)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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
    openapiFields.add("dateOfModification");
    openapiFields.add("modifiedByUser");
    openapiFields.add("changeType");
    openapiFields.add("changeDetails");
    openapiFields.add("memo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dateOfModification");
    openapiRequiredFields.add("modifiedByUser");
    openapiRequiredFields.add("changeType");
    openapiRequiredFields.add("changeDetails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InsertionOrderHistoryChangeDataCapture
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InsertionOrderHistoryChangeDataCapture.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsertionOrderHistoryChangeDataCapture is not found in the empty JSON string", InsertionOrderHistoryChangeDataCapture.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InsertionOrderHistoryChangeDataCapture.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InsertionOrderHistoryChangeDataCapture` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InsertionOrderHistoryChangeDataCapture.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("modifiedByUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedByUser").toString()));
      }
      if (!jsonObj.get("changeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeType").toString()));
      }
      // validate the required field `changeDetails`
      ChangeDetails.validateJsonObject(jsonObj.getAsJsonObject("changeDetails"));
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsertionOrderHistoryChangeDataCapture.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsertionOrderHistoryChangeDataCapture' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsertionOrderHistoryChangeDataCapture> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsertionOrderHistoryChangeDataCapture.class));

       return (TypeAdapter<T>) new TypeAdapter<InsertionOrderHistoryChangeDataCapture>() {
           @Override
           public void write(JsonWriter out, InsertionOrderHistoryChangeDataCapture value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InsertionOrderHistoryChangeDataCapture read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InsertionOrderHistoryChangeDataCapture given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsertionOrderHistoryChangeDataCapture
  * @throws IOException if the JSON string is invalid with respect to InsertionOrderHistoryChangeDataCapture
  */
  public static InsertionOrderHistoryChangeDataCapture fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsertionOrderHistoryChangeDataCapture.class);
  }

 /**
  * Convert an instance of InsertionOrderHistoryChangeDataCapture to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

