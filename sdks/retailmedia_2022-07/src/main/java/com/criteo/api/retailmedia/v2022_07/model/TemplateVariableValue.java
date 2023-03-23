/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2022_07.model.ChoiceVariableValue;
import com.criteo.api.retailmedia.v2022_07.model.ColorVariableValue;
import com.criteo.api.retailmedia.v2022_07.model.FilesVariableValue;
import com.criteo.api.retailmedia.v2022_07.model.HyperlinkVariableValue;
import com.criteo.api.retailmedia.v2022_07.model.TextVariableValue;
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

import com.criteo.api.retailmedia.v2022_07.JSON;

/**
 * A value for a variable in a creative template.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateVariableValue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEXT_VARIABLE_VALUE = "textVariableValue";
  @SerializedName(SERIALIZED_NAME_TEXT_VARIABLE_VALUE)
  private TextVariableValue textVariableValue;

  public static final String SERIALIZED_NAME_CHOICE_VARIABLE_VALUE = "choiceVariableValue";
  @SerializedName(SERIALIZED_NAME_CHOICE_VARIABLE_VALUE)
  private ChoiceVariableValue choiceVariableValue;

  public static final String SERIALIZED_NAME_COLOR_VARIABLE_VALUE = "colorVariableValue";
  @SerializedName(SERIALIZED_NAME_COLOR_VARIABLE_VALUE)
  private ColorVariableValue colorVariableValue;

  public static final String SERIALIZED_NAME_FILES_VARIABLE_VALUE = "filesVariableValue";
  @SerializedName(SERIALIZED_NAME_FILES_VARIABLE_VALUE)
  private FilesVariableValue filesVariableValue;

  public static final String SERIALIZED_NAME_HYPERLINK_VARIABLE_VALUE = "hyperlinkVariableValue";
  @SerializedName(SERIALIZED_NAME_HYPERLINK_VARIABLE_VALUE)
  private HyperlinkVariableValue hyperlinkVariableValue;

  public TemplateVariableValue() {
  }

  public TemplateVariableValue id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the template variable the value is applied to
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TemplateVariableValue textVariableValue(TextVariableValue textVariableValue) {
    
    this.textVariableValue = textVariableValue;
    return this;
  }

   /**
   * Get textVariableValue
   * @return textVariableValue
  **/
  @javax.annotation.Nullable

  public TextVariableValue getTextVariableValue() {
    return textVariableValue;
  }


  public void setTextVariableValue(TextVariableValue textVariableValue) {
    this.textVariableValue = textVariableValue;
  }


  public TemplateVariableValue choiceVariableValue(ChoiceVariableValue choiceVariableValue) {
    
    this.choiceVariableValue = choiceVariableValue;
    return this;
  }

   /**
   * Get choiceVariableValue
   * @return choiceVariableValue
  **/
  @javax.annotation.Nullable

  public ChoiceVariableValue getChoiceVariableValue() {
    return choiceVariableValue;
  }


  public void setChoiceVariableValue(ChoiceVariableValue choiceVariableValue) {
    this.choiceVariableValue = choiceVariableValue;
  }


  public TemplateVariableValue colorVariableValue(ColorVariableValue colorVariableValue) {
    
    this.colorVariableValue = colorVariableValue;
    return this;
  }

   /**
   * Get colorVariableValue
   * @return colorVariableValue
  **/
  @javax.annotation.Nullable

  public ColorVariableValue getColorVariableValue() {
    return colorVariableValue;
  }


  public void setColorVariableValue(ColorVariableValue colorVariableValue) {
    this.colorVariableValue = colorVariableValue;
  }


  public TemplateVariableValue filesVariableValue(FilesVariableValue filesVariableValue) {
    
    this.filesVariableValue = filesVariableValue;
    return this;
  }

   /**
   * Get filesVariableValue
   * @return filesVariableValue
  **/
  @javax.annotation.Nullable

  public FilesVariableValue getFilesVariableValue() {
    return filesVariableValue;
  }


  public void setFilesVariableValue(FilesVariableValue filesVariableValue) {
    this.filesVariableValue = filesVariableValue;
  }


  public TemplateVariableValue hyperlinkVariableValue(HyperlinkVariableValue hyperlinkVariableValue) {
    
    this.hyperlinkVariableValue = hyperlinkVariableValue;
    return this;
  }

   /**
   * Get hyperlinkVariableValue
   * @return hyperlinkVariableValue
  **/
  @javax.annotation.Nullable

  public HyperlinkVariableValue getHyperlinkVariableValue() {
    return hyperlinkVariableValue;
  }


  public void setHyperlinkVariableValue(HyperlinkVariableValue hyperlinkVariableValue) {
    this.hyperlinkVariableValue = hyperlinkVariableValue;
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
   * @return the TemplateVariableValue instance itself
   */
  public TemplateVariableValue putAdditionalProperty(String key, Object value) {
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
    TemplateVariableValue templateVariableValue = (TemplateVariableValue) o;
    return Objects.equals(this.id, templateVariableValue.id) &&
        Objects.equals(this.textVariableValue, templateVariableValue.textVariableValue) &&
        Objects.equals(this.choiceVariableValue, templateVariableValue.choiceVariableValue) &&
        Objects.equals(this.colorVariableValue, templateVariableValue.colorVariableValue) &&
        Objects.equals(this.filesVariableValue, templateVariableValue.filesVariableValue) &&
        Objects.equals(this.hyperlinkVariableValue, templateVariableValue.hyperlinkVariableValue)&&
        Objects.equals(this.additionalProperties, templateVariableValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, textVariableValue, choiceVariableValue, colorVariableValue, filesVariableValue, hyperlinkVariableValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateVariableValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    textVariableValue: ").append(toIndentedString(textVariableValue)).append("\n");
    sb.append("    choiceVariableValue: ").append(toIndentedString(choiceVariableValue)).append("\n");
    sb.append("    colorVariableValue: ").append(toIndentedString(colorVariableValue)).append("\n");
    sb.append("    filesVariableValue: ").append(toIndentedString(filesVariableValue)).append("\n");
    sb.append("    hyperlinkVariableValue: ").append(toIndentedString(hyperlinkVariableValue)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("textVariableValue");
    openapiFields.add("choiceVariableValue");
    openapiFields.add("colorVariableValue");
    openapiFields.add("filesVariableValue");
    openapiFields.add("hyperlinkVariableValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateVariableValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateVariableValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateVariableValue is not found in the empty JSON string", TemplateVariableValue.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateVariableValue.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `textVariableValue`
      if (jsonObj.get("textVariableValue") != null && !jsonObj.get("textVariableValue").isJsonNull()) {
        TextVariableValue.validateJsonObject(jsonObj.getAsJsonObject("textVariableValue"));
      }
      // validate the optional field `choiceVariableValue`
      if (jsonObj.get("choiceVariableValue") != null && !jsonObj.get("choiceVariableValue").isJsonNull()) {
        ChoiceVariableValue.validateJsonObject(jsonObj.getAsJsonObject("choiceVariableValue"));
      }
      // validate the optional field `colorVariableValue`
      if (jsonObj.get("colorVariableValue") != null && !jsonObj.get("colorVariableValue").isJsonNull()) {
        ColorVariableValue.validateJsonObject(jsonObj.getAsJsonObject("colorVariableValue"));
      }
      // validate the optional field `filesVariableValue`
      if (jsonObj.get("filesVariableValue") != null && !jsonObj.get("filesVariableValue").isJsonNull()) {
        FilesVariableValue.validateJsonObject(jsonObj.getAsJsonObject("filesVariableValue"));
      }
      // validate the optional field `hyperlinkVariableValue`
      if (jsonObj.get("hyperlinkVariableValue") != null && !jsonObj.get("hyperlinkVariableValue").isJsonNull()) {
        HyperlinkVariableValue.validateJsonObject(jsonObj.getAsJsonObject("hyperlinkVariableValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateVariableValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateVariableValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateVariableValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateVariableValue.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateVariableValue>() {
           @Override
           public void write(JsonWriter out, TemplateVariableValue value) throws IOException {
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
           public TemplateVariableValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateVariableValue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateVariableValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateVariableValue
  * @throws IOException if the JSON string is invalid with respect to TemplateVariableValue
  */
  public static TemplateVariableValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateVariableValue.class);
  }

 /**
  * Convert an instance of TemplateVariableValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

