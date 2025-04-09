/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2024_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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

import com.criteo.api.marketingsolutions.v2024_01.JSON;

/**
 * Criteo API response error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CriteoApiError {
  /**
   * A machine-readable error code string in kabab-case. Unique across Criteo
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INTERNAL_ERROR("internal-error"),
    
    DEPRECATED_FIELD("deprecated-field"),
    
    ENDPOINT_DEPRECATED("endpoint-deprecated"),
    
    REQUIRED_FIELD("required-field"),
    
    INVALID_DATE_FORMAT("invalid-date-format"),
    
    INVALID("invalid"),
    
    INVALID_RANGED("invalid-ranged"),
    
    INVALID_TIMESPAN("invalid-timespan");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Map<String, String> source = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  /**
   * A machine-readable code specifying error category
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACCESS_CONTROL("access_control"),
    
    AUTHENTICATION("authentication"),
    
    AUTHORIZATION("authorization"),
    
    AVAILABILITY("availability"),
    
    DEPRECATION("deprecation"),
    
    QUOTA("quota"),
    
    VALIDATION("validation");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public CriteoApiError() {
  }

  public CriteoApiError code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * A machine-readable error code string in kabab-case. Unique across Criteo
   * @return code
  **/
  @javax.annotation.Nullable

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public CriteoApiError detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @javax.annotation.Nullable

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public CriteoApiError instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A URI reference that identifies the specific occurrence of the problem
   * @return instance
  **/
  @javax.annotation.Nullable

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public CriteoApiError source(Map<String, String> source) {
    
    this.source = source;
    return this;
  }

  public CriteoApiError putSourceItem(String key, String sourceItem) {
    if (this.source == null) {
      this.source = null;
    }
    this.source.put(key, sourceItem);
    return this;
  }

   /**
   * A machine-readable structure to reference to the exact location(s) causing the error(s).
   * @return source
  **/
  @javax.annotation.Nullable

  public Map<String, String> getSource() {
    return source;
  }


  public void setSource(Map<String, String> source) {
    this.source = source;
  }


  public CriteoApiError title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable remarks of the problem type.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CriteoApiError traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * The correlation ID provided by the gateway
   * @return traceId
  **/
  @javax.annotation.Nullable

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public CriteoApiError type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * A machine-readable code specifying error category
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
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
   * @return the CriteoApiError instance itself
   */
  public CriteoApiError putAdditionalProperty(String key, Object value) {
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
    CriteoApiError criteoApiError = (CriteoApiError) o;
    return Objects.equals(this.code, criteoApiError.code) &&
        Objects.equals(this.detail, criteoApiError.detail) &&
        Objects.equals(this.instance, criteoApiError.instance) &&
        Objects.equals(this.source, criteoApiError.source) &&
        Objects.equals(this.title, criteoApiError.title) &&
        Objects.equals(this.traceId, criteoApiError.traceId) &&
        Objects.equals(this.type, criteoApiError.type)&&
        Objects.equals(this.additionalProperties, criteoApiError.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, instance, source, title, traceId, type, additionalProperties);
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
    sb.append("class CriteoApiError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("detail");
    openapiFields.add("instance");
    openapiFields.add("source");
    openapiFields.add("title");
    openapiFields.add("traceId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CriteoApiError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CriteoApiError.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CriteoApiError is not found in the empty JSON string", CriteoApiError.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if ((jsonObj.get("instance") != null && !jsonObj.get("instance").isJsonNull()) && !jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("traceId") != null && !jsonObj.get("traceId").isJsonNull()) && !jsonObj.get("traceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceId").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CriteoApiError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CriteoApiError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CriteoApiError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CriteoApiError.class));

       return (TypeAdapter<T>) new TypeAdapter<CriteoApiError>() {
           @Override
           public void write(JsonWriter out, CriteoApiError value) throws IOException {
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
           public CriteoApiError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CriteoApiError instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CriteoApiError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CriteoApiError
  * @throws IOException if the JSON string is invalid with respect to CriteoApiError
  */
  public static CriteoApiError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CriteoApiError.class);
  }

 /**
  * Convert an instance of CriteoApiError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

