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
import com.criteo.api.retailmedia.v2024_04.model.ExternalLineItemCapping202110;
import com.criteo.api.retailmedia.v2024_04.model.ExternalLineItemPage202110;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * Model used to update a preferred line item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalPreferredLineItemUpdateModel202110 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    ACTIVE("active"),
    
    SCHEDULED("scheduled"),
    
    DRAFT("draft"),
    
    PAUSED("paused"),
    
    BUDGETHIT("budgetHit"),
    
    ENDED("ended"),
    
    ARCHIVED("archived"),
    
    NOFUNDS("noFunds");

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

  /**
   * Gets or Sets pacing
   */
  @JsonAdapter(PacingEnum.Adapter.class)
  public enum PacingEnum {
    UNKNOWN("unknown"),
    
    STANDARD("standard"),
    
    ACCELERATED("accelerated");

    private String value;

    PacingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PacingEnum fromValue(String value) {
      for (PacingEnum b : PacingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PacingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PacingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PacingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PacingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PACING = "pacing";
  @SerializedName(SERIALIZED_NAME_PACING)
  private PacingEnum pacing = PacingEnum.ACCELERATED;

  public static final String SERIALIZED_NAME_CAPPING = "capping";
  @SerializedName(SERIALIZED_NAME_CAPPING)
  private ExternalLineItemCapping202110 capping;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private ExternalLineItemPage202110 page;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creativeId";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId;

  public ExternalPreferredLineItemUpdateModel202110() {
  }

  public ExternalPreferredLineItemUpdateModel202110 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalPreferredLineItemUpdateModel202110 startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ExternalPreferredLineItemUpdateModel202110 endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalPreferredLineItemUpdateModel202110 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalPreferredLineItemUpdateModel202110 pacing(PacingEnum pacing) {
    
    this.pacing = pacing;
    return this;
  }

   /**
   * Get pacing
   * @return pacing
  **/
  @javax.annotation.Nullable

  public PacingEnum getPacing() {
    return pacing;
  }


  public void setPacing(PacingEnum pacing) {
    this.pacing = pacing;
  }


  public ExternalPreferredLineItemUpdateModel202110 capping(ExternalLineItemCapping202110 capping) {
    
    this.capping = capping;
    return this;
  }

   /**
   * Get capping
   * @return capping
  **/
  @javax.annotation.Nullable

  public ExternalLineItemCapping202110 getCapping() {
    return capping;
  }


  public void setCapping(ExternalLineItemCapping202110 capping) {
    this.capping = capping;
  }


  public ExternalPreferredLineItemUpdateModel202110 page(ExternalLineItemPage202110 page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable

  public ExternalLineItemPage202110 getPage() {
    return page;
  }


  public void setPage(ExternalLineItemPage202110 page) {
    this.page = page;
  }


  public ExternalPreferredLineItemUpdateModel202110 budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable

  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public ExternalPreferredLineItemUpdateModel202110 creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * Get creativeId
   * @return creativeId
  **/
  @javax.annotation.Nullable

  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
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
   * @return the ExternalPreferredLineItemUpdateModel202110 instance itself
   */
  public ExternalPreferredLineItemUpdateModel202110 putAdditionalProperty(String key, Object value) {
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
    ExternalPreferredLineItemUpdateModel202110 externalPreferredLineItemUpdateModel202110 = (ExternalPreferredLineItemUpdateModel202110) o;
    return Objects.equals(this.name, externalPreferredLineItemUpdateModel202110.name) &&
        Objects.equals(this.startDate, externalPreferredLineItemUpdateModel202110.startDate) &&
        Objects.equals(this.endDate, externalPreferredLineItemUpdateModel202110.endDate) &&
        Objects.equals(this.status, externalPreferredLineItemUpdateModel202110.status) &&
        Objects.equals(this.pacing, externalPreferredLineItemUpdateModel202110.pacing) &&
        Objects.equals(this.capping, externalPreferredLineItemUpdateModel202110.capping) &&
        Objects.equals(this.page, externalPreferredLineItemUpdateModel202110.page) &&
        Objects.equals(this.budget, externalPreferredLineItemUpdateModel202110.budget) &&
        Objects.equals(this.creativeId, externalPreferredLineItemUpdateModel202110.creativeId)&&
        Objects.equals(this.additionalProperties, externalPreferredLineItemUpdateModel202110.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate, endDate, status, pacing, capping, page, budget, creativeId, additionalProperties);
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
    sb.append("class ExternalPreferredLineItemUpdateModel202110 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
    sb.append("    capping: ").append(toIndentedString(capping)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("status");
    openapiFields.add("pacing");
    openapiFields.add("capping");
    openapiFields.add("page");
    openapiFields.add("budget");
    openapiFields.add("creativeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPreferredLineItemUpdateModel202110
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalPreferredLineItemUpdateModel202110.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPreferredLineItemUpdateModel202110 is not found in the empty JSON string", ExternalPreferredLineItemUpdateModel202110.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalPreferredLineItemUpdateModel202110.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("pacing") != null && !jsonObj.get("pacing").isJsonNull()) && !jsonObj.get("pacing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pacing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pacing").toString()));
      }
      // validate the optional field `capping`
      if (jsonObj.get("capping") != null && !jsonObj.get("capping").isJsonNull()) {
        ExternalLineItemCapping202110.validateJsonObject(jsonObj.getAsJsonObject("capping"));
      }
      // validate the optional field `page`
      if (jsonObj.get("page") != null && !jsonObj.get("page").isJsonNull()) {
        ExternalLineItemPage202110.validateJsonObject(jsonObj.getAsJsonObject("page"));
      }
      if ((jsonObj.get("creativeId") != null && !jsonObj.get("creativeId").isJsonNull()) && !jsonObj.get("creativeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPreferredLineItemUpdateModel202110.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPreferredLineItemUpdateModel202110' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPreferredLineItemUpdateModel202110> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPreferredLineItemUpdateModel202110.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPreferredLineItemUpdateModel202110>() {
           @Override
           public void write(JsonWriter out, ExternalPreferredLineItemUpdateModel202110 value) throws IOException {
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
           public ExternalPreferredLineItemUpdateModel202110 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalPreferredLineItemUpdateModel202110 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalPreferredLineItemUpdateModel202110 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPreferredLineItemUpdateModel202110
  * @throws IOException if the JSON string is invalid with respect to ExternalPreferredLineItemUpdateModel202110
  */
  public static ExternalPreferredLineItemUpdateModel202110 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPreferredLineItemUpdateModel202110.class);
  }

 /**
  * Convert an instance of ExternalPreferredLineItemUpdateModel202110 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
