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
import com.criteo.api.retailmedia.v2024_07.model.TemplateVariableValue;
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

import com.criteo.api.retailmedia.v2024_07.JSON;

/**
 * Update model of a creative
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreativeUpdateModel202207 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private Integer retailerId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES = "templateVariableValues";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES)
  private List<TemplateVariableValue> templateVariableValues = new ArrayList<>();

  public CreativeUpdateModel202207() {
  }

  public CreativeUpdateModel202207 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the creative
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreativeUpdateModel202207 brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * The brand associated to the creative
   * @return brandId
  **/
  @javax.annotation.Nullable

  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public CreativeUpdateModel202207 retailerId(Integer retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * The retailer associated to the creative
   * @return retailerId
  **/
  @javax.annotation.Nonnull

  public Integer getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(Integer retailerId) {
    this.retailerId = retailerId;
  }


  public CreativeUpdateModel202207 templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The creative template used for this creative
   * @return templateId
  **/
  @javax.annotation.Nonnull

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public CreativeUpdateModel202207 templateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    
    this.templateVariableValues = templateVariableValues;
    return this;
  }

  public CreativeUpdateModel202207 addTemplateVariableValuesItem(TemplateVariableValue templateVariableValuesItem) {
    this.templateVariableValues.add(templateVariableValuesItem);
    return this;
  }

   /**
   * The template chosen values
   * @return templateVariableValues
  **/
  @javax.annotation.Nonnull

  public List<TemplateVariableValue> getTemplateVariableValues() {
    return templateVariableValues;
  }


  public void setTemplateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    this.templateVariableValues = templateVariableValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeUpdateModel202207 creativeUpdateModel202207 = (CreativeUpdateModel202207) o;
    return Objects.equals(this.name, creativeUpdateModel202207.name) &&
        Objects.equals(this.brandId, creativeUpdateModel202207.brandId) &&
        Objects.equals(this.retailerId, creativeUpdateModel202207.retailerId) &&
        Objects.equals(this.templateId, creativeUpdateModel202207.templateId) &&
        Objects.equals(this.templateVariableValues, creativeUpdateModel202207.templateVariableValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, brandId, retailerId, templateId, templateVariableValues);
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
    sb.append("class CreativeUpdateModel202207 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVariableValues: ").append(toIndentedString(templateVariableValues)).append("\n");
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
    openapiFields.add("brandId");
    openapiFields.add("retailerId");
    openapiFields.add("templateId");
    openapiFields.add("templateVariableValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("retailerId");
    openapiRequiredFields.add("templateId");
    openapiRequiredFields.add("templateVariableValues");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreativeUpdateModel202207
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreativeUpdateModel202207.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreativeUpdateModel202207 is not found in the empty JSON string", CreativeUpdateModel202207.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreativeUpdateModel202207.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreativeUpdateModel202207` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreativeUpdateModel202207.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("templateVariableValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateVariableValues` to be an array in the JSON string but got `%s`", jsonObj.get("templateVariableValues").toString()));
      }

      JsonArray jsonArraytemplateVariableValues = jsonObj.getAsJsonArray("templateVariableValues");
      // validate the required field `templateVariableValues` (array)
      for (int i = 0; i < jsonArraytemplateVariableValues.size(); i++) {
        TemplateVariableValue.validateJsonObject(jsonArraytemplateVariableValues.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeUpdateModel202207.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeUpdateModel202207' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeUpdateModel202207> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeUpdateModel202207.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeUpdateModel202207>() {
           @Override
           public void write(JsonWriter out, CreativeUpdateModel202207 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeUpdateModel202207 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeUpdateModel202207 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeUpdateModel202207
  * @throws IOException if the JSON string is invalid with respect to CreativeUpdateModel202207
  */
  public static CreativeUpdateModel202207 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeUpdateModel202207.class);
  }

 /**
  * Convert an instance of CreativeUpdateModel202207 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

