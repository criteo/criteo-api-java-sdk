/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_07.model;

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

import com.criteo.api.retailmedia.v2023_07.JSON;

/**
 * Input values associated with a keyword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaExternalv1InputKeywordsModel {
  public static final String SERIALIZED_NAME_NEGATIVE_BROAD = "negativeBroad";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_BROAD)
  private List<String> negativeBroad = null;

  public static final String SERIALIZED_NAME_NEGATIVE_EXACT = "negativeExact";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_EXACT)
  private List<String> negativeExact = null;

  public static final String SERIALIZED_NAME_POSITIVE_EXACT = "positiveExact";
  @SerializedName(SERIALIZED_NAME_POSITIVE_EXACT)
  private List<String> positiveExact = null;

  public RetailMediaExternalv1InputKeywordsModel() {
  }

  public RetailMediaExternalv1InputKeywordsModel negativeBroad(List<String> negativeBroad) {
    
    this.negativeBroad = negativeBroad;
    return this;
  }

  public RetailMediaExternalv1InputKeywordsModel addNegativeBroadItem(String negativeBroadItem) {
    if (this.negativeBroad == null) {
      this.negativeBroad = new ArrayList<>();
    }
    this.negativeBroad.add(negativeBroadItem);
    return this;
  }

   /**
   * Get negativeBroad
   * @return negativeBroad
  **/
  @javax.annotation.Nullable

  public List<String> getNegativeBroad() {
    return negativeBroad;
  }


  public void setNegativeBroad(List<String> negativeBroad) {
    this.negativeBroad = negativeBroad;
  }


  public RetailMediaExternalv1InputKeywordsModel negativeExact(List<String> negativeExact) {
    
    this.negativeExact = negativeExact;
    return this;
  }

  public RetailMediaExternalv1InputKeywordsModel addNegativeExactItem(String negativeExactItem) {
    if (this.negativeExact == null) {
      this.negativeExact = new ArrayList<>();
    }
    this.negativeExact.add(negativeExactItem);
    return this;
  }

   /**
   * Get negativeExact
   * @return negativeExact
  **/
  @javax.annotation.Nullable

  public List<String> getNegativeExact() {
    return negativeExact;
  }


  public void setNegativeExact(List<String> negativeExact) {
    this.negativeExact = negativeExact;
  }


  public RetailMediaExternalv1InputKeywordsModel positiveExact(List<String> positiveExact) {
    
    this.positiveExact = positiveExact;
    return this;
  }

  public RetailMediaExternalv1InputKeywordsModel addPositiveExactItem(String positiveExactItem) {
    if (this.positiveExact == null) {
      this.positiveExact = new ArrayList<>();
    }
    this.positiveExact.add(positiveExactItem);
    return this;
  }

   /**
   * Get positiveExact
   * @return positiveExact
  **/
  @javax.annotation.Nullable

  public List<String> getPositiveExact() {
    return positiveExact;
  }


  public void setPositiveExact(List<String> positiveExact) {
    this.positiveExact = positiveExact;
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
   * @return the RetailMediaExternalv1InputKeywordsModel instance itself
   */
  public RetailMediaExternalv1InputKeywordsModel putAdditionalProperty(String key, Object value) {
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
    RetailMediaExternalv1InputKeywordsModel retailMediaExternalv1InputKeywordsModel = (RetailMediaExternalv1InputKeywordsModel) o;
    return Objects.equals(this.negativeBroad, retailMediaExternalv1InputKeywordsModel.negativeBroad) &&
        Objects.equals(this.negativeExact, retailMediaExternalv1InputKeywordsModel.negativeExact) &&
        Objects.equals(this.positiveExact, retailMediaExternalv1InputKeywordsModel.positiveExact)&&
        Objects.equals(this.additionalProperties, retailMediaExternalv1InputKeywordsModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negativeBroad, negativeExact, positiveExact, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailMediaExternalv1InputKeywordsModel {\n");
    sb.append("    negativeBroad: ").append(toIndentedString(negativeBroad)).append("\n");
    sb.append("    negativeExact: ").append(toIndentedString(negativeExact)).append("\n");
    sb.append("    positiveExact: ").append(toIndentedString(positiveExact)).append("\n");
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
    openapiFields.add("negativeBroad");
    openapiFields.add("negativeExact");
    openapiFields.add("positiveExact");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaExternalv1InputKeywordsModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaExternalv1InputKeywordsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaExternalv1InputKeywordsModel is not found in the empty JSON string", RetailMediaExternalv1InputKeywordsModel.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("negativeBroad") != null && !jsonObj.get("negativeBroad").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `negativeBroad` to be an array in the JSON string but got `%s`", jsonObj.get("negativeBroad").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("negativeExact") != null && !jsonObj.get("negativeExact").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `negativeExact` to be an array in the JSON string but got `%s`", jsonObj.get("negativeExact").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("positiveExact") != null && !jsonObj.get("positiveExact").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `positiveExact` to be an array in the JSON string but got `%s`", jsonObj.get("positiveExact").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaExternalv1InputKeywordsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaExternalv1InputKeywordsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaExternalv1InputKeywordsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaExternalv1InputKeywordsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaExternalv1InputKeywordsModel>() {
           @Override
           public void write(JsonWriter out, RetailMediaExternalv1InputKeywordsModel value) throws IOException {
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
           public RetailMediaExternalv1InputKeywordsModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetailMediaExternalv1InputKeywordsModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetailMediaExternalv1InputKeywordsModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaExternalv1InputKeywordsModel
  * @throws IOException if the JSON string is invalid with respect to RetailMediaExternalv1InputKeywordsModel
  */
  public static RetailMediaExternalv1InputKeywordsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaExternalv1InputKeywordsModel.class);
  }

 /**
  * Convert an instance of RetailMediaExternalv1InputKeywordsModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

