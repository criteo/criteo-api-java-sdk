/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * Entity consists of multiple images in different ratios as a base-64 encoded and a headline text.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageSetBase64 {
  public static final String SERIALIZED_NAME_HEADLINE_TEXT = "headlineText";
  @SerializedName(SERIALIZED_NAME_HEADLINE_TEXT)
  private String headlineText;

  public static final String SERIALIZED_NAME_IMAGE_BASE64_STRINGS = "imageBase64Strings";
  @SerializedName(SERIALIZED_NAME_IMAGE_BASE64_STRINGS)
  private List<String> imageBase64Strings = new ArrayList<>();

  public ImageSetBase64() {
  }

  public ImageSetBase64 headlineText(String headlineText) {
    
    this.headlineText = headlineText;
    return this;
  }

   /**
   * The headline of the image set
   * @return headlineText
  **/
  @javax.annotation.Nullable

  public String getHeadlineText() {
    return headlineText;
  }


  public void setHeadlineText(String headlineText) {
    this.headlineText = headlineText;
  }


  public ImageSetBase64 imageBase64Strings(List<String> imageBase64Strings) {
    
    this.imageBase64Strings = imageBase64Strings;
    return this;
  }

  public ImageSetBase64 addImageBase64StringsItem(String imageBase64StringsItem) {
    this.imageBase64Strings.add(imageBase64StringsItem);
    return this;
  }

   /**
   * Multiple images potentially in different shapes, each image is a base-64 encoded string.
   * @return imageBase64Strings
  **/
  @javax.annotation.Nonnull

  public List<String> getImageBase64Strings() {
    return imageBase64Strings;
  }


  public void setImageBase64Strings(List<String> imageBase64Strings) {
    this.imageBase64Strings = imageBase64Strings;
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
   * @return the ImageSetBase64 instance itself
   */
  public ImageSetBase64 putAdditionalProperty(String key, Object value) {
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
    ImageSetBase64 imageSetBase64 = (ImageSetBase64) o;
    return Objects.equals(this.headlineText, imageSetBase64.headlineText) &&
        Objects.equals(this.imageBase64Strings, imageSetBase64.imageBase64Strings)&&
        Objects.equals(this.additionalProperties, imageSetBase64.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(headlineText, imageBase64Strings, additionalProperties);
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
    sb.append("class ImageSetBase64 {\n");
    sb.append("    headlineText: ").append(toIndentedString(headlineText)).append("\n");
    sb.append("    imageBase64Strings: ").append(toIndentedString(imageBase64Strings)).append("\n");
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
    openapiFields.add("headlineText");
    openapiFields.add("imageBase64Strings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("imageBase64Strings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImageSetBase64
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImageSetBase64.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageSetBase64 is not found in the empty JSON string", ImageSetBase64.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImageSetBase64.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("headlineText") != null && !jsonObj.get("headlineText").isJsonNull()) && !jsonObj.get("headlineText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headlineText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headlineText").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("imageBase64Strings") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("imageBase64Strings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageBase64Strings` to be an array in the JSON string but got `%s`", jsonObj.get("imageBase64Strings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageSetBase64.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageSetBase64' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageSetBase64> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageSetBase64.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageSetBase64>() {
           @Override
           public void write(JsonWriter out, ImageSetBase64 value) throws IOException {
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
           public ImageSetBase64 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImageSetBase64 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImageSetBase64 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImageSetBase64
  * @throws IOException if the JSON string is invalid with respect to ImageSetBase64
  */
  public static ImageSetBase64 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageSetBase64.class);
  }

 /**
  * Convert an instance of ImageSetBase64 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

