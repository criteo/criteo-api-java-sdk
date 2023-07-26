/*
 * Criteo API
 * Criteo API - RetailMedia
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
import com.criteo.api.retailmedia.v2022_07.model.ChoiceVariableSpecification;
import com.criteo.api.retailmedia.v2022_07.model.FilesVariablesSpecification;
import com.criteo.api.retailmedia.v2022_07.model.TextVariableSpecification;
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
 * A variable in a creative template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateVariable {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  /**
   * The type of the variable
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("Text"),
    
    CHOICE("Choice"),
    
    COLOR("Color"),
    
    FILES("Files"),
    
    HYPERLINK("Hyperlink");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_CHOICE_VARIABLE_SPECIFICATION = "choiceVariableSpecification";
  @SerializedName(SERIALIZED_NAME_CHOICE_VARIABLE_SPECIFICATION)
  private ChoiceVariableSpecification choiceVariableSpecification;

  public static final String SERIALIZED_NAME_TEXT_VARIABLE_SPECIFICATION = "textVariableSpecification";
  @SerializedName(SERIALIZED_NAME_TEXT_VARIABLE_SPECIFICATION)
  private TextVariableSpecification textVariableSpecification;

  public static final String SERIALIZED_NAME_FILES_VARIABLES_SPECIFICATION = "filesVariablesSpecification";
  @SerializedName(SERIALIZED_NAME_FILES_VARIABLES_SPECIFICATION)
  private FilesVariablesSpecification filesVariablesSpecification;

  public TemplateVariable() {
  }

  public TemplateVariable id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the variable
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TemplateVariable required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Whether the variable is required
   * @return required
  **/
  @javax.annotation.Nonnull

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public TemplateVariable type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the variable
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TemplateVariable choiceVariableSpecification(ChoiceVariableSpecification choiceVariableSpecification) {
    
    this.choiceVariableSpecification = choiceVariableSpecification;
    return this;
  }

   /**
   * Get choiceVariableSpecification
   * @return choiceVariableSpecification
  **/
  @javax.annotation.Nullable

  public ChoiceVariableSpecification getChoiceVariableSpecification() {
    return choiceVariableSpecification;
  }


  public void setChoiceVariableSpecification(ChoiceVariableSpecification choiceVariableSpecification) {
    this.choiceVariableSpecification = choiceVariableSpecification;
  }


  public TemplateVariable textVariableSpecification(TextVariableSpecification textVariableSpecification) {
    
    this.textVariableSpecification = textVariableSpecification;
    return this;
  }

   /**
   * Get textVariableSpecification
   * @return textVariableSpecification
  **/
  @javax.annotation.Nullable

  public TextVariableSpecification getTextVariableSpecification() {
    return textVariableSpecification;
  }


  public void setTextVariableSpecification(TextVariableSpecification textVariableSpecification) {
    this.textVariableSpecification = textVariableSpecification;
  }


  public TemplateVariable filesVariablesSpecification(FilesVariablesSpecification filesVariablesSpecification) {
    
    this.filesVariablesSpecification = filesVariablesSpecification;
    return this;
  }

   /**
   * Get filesVariablesSpecification
   * @return filesVariablesSpecification
  **/
  @javax.annotation.Nullable

  public FilesVariablesSpecification getFilesVariablesSpecification() {
    return filesVariablesSpecification;
  }


  public void setFilesVariablesSpecification(FilesVariablesSpecification filesVariablesSpecification) {
    this.filesVariablesSpecification = filesVariablesSpecification;
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
   * @return the TemplateVariable instance itself
   */
  public TemplateVariable putAdditionalProperty(String key, Object value) {
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
    TemplateVariable templateVariable = (TemplateVariable) o;
    return Objects.equals(this.id, templateVariable.id) &&
        Objects.equals(this.required, templateVariable.required) &&
        Objects.equals(this.type, templateVariable.type) &&
        Objects.equals(this.choiceVariableSpecification, templateVariable.choiceVariableSpecification) &&
        Objects.equals(this.textVariableSpecification, templateVariable.textVariableSpecification) &&
        Objects.equals(this.filesVariablesSpecification, templateVariable.filesVariablesSpecification)&&
        Objects.equals(this.additionalProperties, templateVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, required, type, choiceVariableSpecification, textVariableSpecification, filesVariablesSpecification, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateVariable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    choiceVariableSpecification: ").append(toIndentedString(choiceVariableSpecification)).append("\n");
    sb.append("    textVariableSpecification: ").append(toIndentedString(textVariableSpecification)).append("\n");
    sb.append("    filesVariablesSpecification: ").append(toIndentedString(filesVariablesSpecification)).append("\n");
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
    openapiFields.add("required");
    openapiFields.add("type");
    openapiFields.add("choiceVariableSpecification");
    openapiFields.add("textVariableSpecification");
    openapiFields.add("filesVariablesSpecification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("required");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateVariable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateVariable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateVariable is not found in the empty JSON string", TemplateVariable.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateVariable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `choiceVariableSpecification`
      if (jsonObj.get("choiceVariableSpecification") != null && !jsonObj.get("choiceVariableSpecification").isJsonNull()) {
        ChoiceVariableSpecification.validateJsonObject(jsonObj.getAsJsonObject("choiceVariableSpecification"));
      }
      // validate the optional field `textVariableSpecification`
      if (jsonObj.get("textVariableSpecification") != null && !jsonObj.get("textVariableSpecification").isJsonNull()) {
        TextVariableSpecification.validateJsonObject(jsonObj.getAsJsonObject("textVariableSpecification"));
      }
      // validate the optional field `filesVariablesSpecification`
      if (jsonObj.get("filesVariablesSpecification") != null && !jsonObj.get("filesVariablesSpecification").isJsonNull()) {
        FilesVariablesSpecification.validateJsonObject(jsonObj.getAsJsonObject("filesVariablesSpecification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateVariable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateVariable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateVariable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateVariable.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateVariable>() {
           @Override
           public void write(JsonWriter out, TemplateVariable value) throws IOException {
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
           public TemplateVariable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateVariable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateVariable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateVariable
  * @throws IOException if the JSON string is invalid with respect to TemplateVariable
  */
  public static TemplateVariable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateVariable.class);
  }

 /**
  * Convert an instance of TemplateVariable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

