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

import com.criteo.api.retailmedia.v2024_04.JSON;

/**
 * The keywords to be added or removed from a line item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InputKeywordsModel {
  public static final String SERIALIZED_NAME_NEGATIVE_BROAD = "negativeBroad";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_BROAD)
  private List<String> negativeBroad = null;

  public static final String SERIALIZED_NAME_NEGATIVE_EXACT = "negativeExact";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_EXACT)
  private List<String> negativeExact = null;

  public static final String SERIALIZED_NAME_POSITIVE_EXACT = "positiveExact";
  @SerializedName(SERIALIZED_NAME_POSITIVE_EXACT)
  private List<String> positiveExact = null;

  public InputKeywordsModel() {
  }

  public InputKeywordsModel negativeBroad(List<String> negativeBroad) {
    
    this.negativeBroad = negativeBroad;
    return this;
  }

  public InputKeywordsModel addNegativeBroadItem(String negativeBroadItem) {
    if (this.negativeBroad == null) {
      this.negativeBroad = null;
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


  public InputKeywordsModel negativeExact(List<String> negativeExact) {
    
    this.negativeExact = negativeExact;
    return this;
  }

  public InputKeywordsModel addNegativeExactItem(String negativeExactItem) {
    if (this.negativeExact == null) {
      this.negativeExact = null;
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


  public InputKeywordsModel positiveExact(List<String> positiveExact) {
    
    this.positiveExact = positiveExact;
    return this;
  }

  public InputKeywordsModel addPositiveExactItem(String positiveExactItem) {
    if (this.positiveExact == null) {
      this.positiveExact = null;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputKeywordsModel inputKeywordsModel = (InputKeywordsModel) o;
    return Objects.equals(this.negativeBroad, inputKeywordsModel.negativeBroad) &&
        Objects.equals(this.negativeExact, inputKeywordsModel.negativeExact) &&
        Objects.equals(this.positiveExact, inputKeywordsModel.positiveExact);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(negativeBroad, negativeExact, positiveExact);
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
    sb.append("class InputKeywordsModel {\n");
    sb.append("    negativeBroad: ").append(toIndentedString(negativeBroad)).append("\n");
    sb.append("    negativeExact: ").append(toIndentedString(negativeExact)).append("\n");
    sb.append("    positiveExact: ").append(toIndentedString(positiveExact)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to InputKeywordsModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InputKeywordsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputKeywordsModel is not found in the empty JSON string", InputKeywordsModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InputKeywordsModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InputKeywordsModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!InputKeywordsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputKeywordsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputKeywordsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputKeywordsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InputKeywordsModel>() {
           @Override
           public void write(JsonWriter out, InputKeywordsModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InputKeywordsModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InputKeywordsModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InputKeywordsModel
  * @throws IOException if the JSON string is invalid with respect to InputKeywordsModel
  */
  public static InputKeywordsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputKeywordsModel.class);
  }

 /**
  * Convert an instance of InputKeywordsModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

