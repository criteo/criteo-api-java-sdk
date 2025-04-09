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
import com.criteo.api.retailmedia.v2024_07.model.ChoiceVariableSpecification;
import com.criteo.api.retailmedia.v2024_07.model.FilesVariablesSpecification;
import com.criteo.api.retailmedia.v2024_07.model.TextVariableSpecification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.retailmedia.v2024_07.JSON;

/**
 * A variable in a creative template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateVariable {
  public static final String SERIALIZED_NAME_CHOICE_VARIABLE_SPECIFICATION = "choiceVariableSpecification";
  @SerializedName(SERIALIZED_NAME_CHOICE_VARIABLE_SPECIFICATION)
  private ChoiceVariableSpecification choiceVariableSpecification;

  public static final String SERIALIZED_NAME_FILES_VARIABLES_SPECIFICATION = "filesVariablesSpecification";
  @SerializedName(SERIALIZED_NAME_FILES_VARIABLES_SPECIFICATION)
  private FilesVariablesSpecification filesVariablesSpecification;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_TEXT_VARIABLE_SPECIFICATION = "textVariableSpecification";
  @SerializedName(SERIALIZED_NAME_TEXT_VARIABLE_SPECIFICATION)
  private TextVariableSpecification textVariableSpecification;

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

  public TemplateVariable() {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateVariable templateVariable = (TemplateVariable) o;
    return Objects.equals(this.choiceVariableSpecification, templateVariable.choiceVariableSpecification) &&
        Objects.equals(this.filesVariablesSpecification, templateVariable.filesVariablesSpecification) &&
        Objects.equals(this.id, templateVariable.id) &&
        Objects.equals(this.required, templateVariable.required) &&
        Objects.equals(this.textVariableSpecification, templateVariable.textVariableSpecification) &&
        Objects.equals(this.type, templateVariable.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(choiceVariableSpecification, filesVariablesSpecification, id, required, textVariableSpecification, type);
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
    sb.append("class TemplateVariable {\n");
    sb.append("    choiceVariableSpecification: ").append(toIndentedString(choiceVariableSpecification)).append("\n");
    sb.append("    filesVariablesSpecification: ").append(toIndentedString(filesVariablesSpecification)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    textVariableSpecification: ").append(toIndentedString(textVariableSpecification)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("choiceVariableSpecification");
    openapiFields.add("filesVariablesSpecification");
    openapiFields.add("id");
    openapiFields.add("required");
    openapiFields.add("textVariableSpecification");
    openapiFields.add("type");

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

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateVariable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateVariable` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateVariable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `choiceVariableSpecification`
      if (jsonObj.get("choiceVariableSpecification") != null && !jsonObj.get("choiceVariableSpecification").isJsonNull()) {
        ChoiceVariableSpecification.validateJsonObject(jsonObj.getAsJsonObject("choiceVariableSpecification"));
      }
      // validate the optional field `filesVariablesSpecification`
      if (jsonObj.get("filesVariablesSpecification") != null && !jsonObj.get("filesVariablesSpecification").isJsonNull()) {
        FilesVariablesSpecification.validateJsonObject(jsonObj.getAsJsonObject("filesVariablesSpecification"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `textVariableSpecification`
      if (jsonObj.get("textVariableSpecification") != null && !jsonObj.get("textVariableSpecification").isJsonNull()) {
        TextVariableSpecification.validateJsonObject(jsonObj.getAsJsonObject("textVariableSpecification"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateVariable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

