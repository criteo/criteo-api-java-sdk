/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: Preview
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
 * Entity consists of the color aliases of the creative&#39;s elements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdaptiveColors {
  public static final String SERIALIZED_NAME_LOGO_AREA_AND_TITLE_COLOR = "logoAreaAndTitleColor";
  @SerializedName(SERIALIZED_NAME_LOGO_AREA_AND_TITLE_COLOR)
  private String logoAreaAndTitleColor;

  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "backgroundColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  private String backgroundColor;

  public static final String SERIALIZED_NAME_TEXT1_COLOR = "text1Color";
  @SerializedName(SERIALIZED_NAME_TEXT1_COLOR)
  private String text1Color;

  public static final String SERIALIZED_NAME_TEXT2_COLOR = "text2Color";
  @SerializedName(SERIALIZED_NAME_TEXT2_COLOR)
  private String text2Color;

  public static final String SERIALIZED_NAME_CTA_BACKGROUND_COLOR = "ctaBackgroundColor";
  @SerializedName(SERIALIZED_NAME_CTA_BACKGROUND_COLOR)
  private String ctaBackgroundColor;

  public static final String SERIALIZED_NAME_CTA_TEXT_COLOR = "ctaTextColor";
  @SerializedName(SERIALIZED_NAME_CTA_TEXT_COLOR)
  private String ctaTextColor;

  public AdaptiveColors() {
  }

  public AdaptiveColors logoAreaAndTitleColor(String logoAreaAndTitleColor) {
    
    this.logoAreaAndTitleColor = logoAreaAndTitleColor;
    return this;
  }

   /**
   * Color of the creative&#39;s logo area.  A valid RGB24 color in hexadecimal (e.g. \&quot;AB00FF\&quot;).
   * @return logoAreaAndTitleColor
  **/
  @javax.annotation.Nonnull

  public String getLogoAreaAndTitleColor() {
    return logoAreaAndTitleColor;
  }


  public void setLogoAreaAndTitleColor(String logoAreaAndTitleColor) {
    this.logoAreaAndTitleColor = logoAreaAndTitleColor;
  }


  public AdaptiveColors backgroundColor(String backgroundColor) {
    
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Color of the creative&#39;s background.  A valid RGB24 color in hexadecimal (e.g. \&quot;AB00FF\&quot;)
   * @return backgroundColor
  **/
  @javax.annotation.Nonnull

  public String getBackgroundColor() {
    return backgroundColor;
  }


  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public AdaptiveColors text1Color(String text1Color) {
    
    this.text1Color = text1Color;
    return this;
  }

   /**
   * Color of the headline and the description texts.  A valid RGB24 color in hexadecimal (e.g. \&quot;AB00FF\&quot;)
   * @return text1Color
  **/
  @javax.annotation.Nonnull

  public String getText1Color() {
    return text1Color;
  }


  public void setText1Color(String text1Color) {
    this.text1Color = text1Color;
  }


  public AdaptiveColors text2Color(String text2Color) {
    
    this.text2Color = text2Color;
    return this;
  }

   /**
   * Color of the image set&#39;s headline text.  A valid RGB24 color in hexadecimal (e.g. \&quot;AB00FF\&quot;)
   * @return text2Color
  **/
  @javax.annotation.Nonnull

  public String getText2Color() {
    return text2Color;
  }


  public void setText2Color(String text2Color) {
    this.text2Color = text2Color;
  }


  public AdaptiveColors ctaBackgroundColor(String ctaBackgroundColor) {
    
    this.ctaBackgroundColor = ctaBackgroundColor;
    return this;
  }

   /**
   * Color of the background of the CTA.  A valid RGB24 color in hexadecimal (e.g. \&quot;AB00FF\&quot;).
   * @return ctaBackgroundColor
  **/
  @javax.annotation.Nonnull

  public String getCtaBackgroundColor() {
    return ctaBackgroundColor;
  }


  public void setCtaBackgroundColor(String ctaBackgroundColor) {
    this.ctaBackgroundColor = ctaBackgroundColor;
  }


  public AdaptiveColors ctaTextColor(String ctaTextColor) {
    
    this.ctaTextColor = ctaTextColor;
    return this;
  }

   /**
   * Color of the text of the CTA.  A valid RGB24 color in hexadecimal (e.g. \&quot;AB00FF\&quot;).
   * @return ctaTextColor
  **/
  @javax.annotation.Nonnull

  public String getCtaTextColor() {
    return ctaTextColor;
  }


  public void setCtaTextColor(String ctaTextColor) {
    this.ctaTextColor = ctaTextColor;
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
   * @return the AdaptiveColors instance itself
   */
  public AdaptiveColors putAdditionalProperty(String key, Object value) {
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
    AdaptiveColors adaptiveColors = (AdaptiveColors) o;
    return Objects.equals(this.logoAreaAndTitleColor, adaptiveColors.logoAreaAndTitleColor) &&
        Objects.equals(this.backgroundColor, adaptiveColors.backgroundColor) &&
        Objects.equals(this.text1Color, adaptiveColors.text1Color) &&
        Objects.equals(this.text2Color, adaptiveColors.text2Color) &&
        Objects.equals(this.ctaBackgroundColor, adaptiveColors.ctaBackgroundColor) &&
        Objects.equals(this.ctaTextColor, adaptiveColors.ctaTextColor)&&
        Objects.equals(this.additionalProperties, adaptiveColors.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoAreaAndTitleColor, backgroundColor, text1Color, text2Color, ctaBackgroundColor, ctaTextColor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveColors {\n");
    sb.append("    logoAreaAndTitleColor: ").append(toIndentedString(logoAreaAndTitleColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    text1Color: ").append(toIndentedString(text1Color)).append("\n");
    sb.append("    text2Color: ").append(toIndentedString(text2Color)).append("\n");
    sb.append("    ctaBackgroundColor: ").append(toIndentedString(ctaBackgroundColor)).append("\n");
    sb.append("    ctaTextColor: ").append(toIndentedString(ctaTextColor)).append("\n");
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
    openapiFields.add("logoAreaAndTitleColor");
    openapiFields.add("backgroundColor");
    openapiFields.add("text1Color");
    openapiFields.add("text2Color");
    openapiFields.add("ctaBackgroundColor");
    openapiFields.add("ctaTextColor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("logoAreaAndTitleColor");
    openapiRequiredFields.add("backgroundColor");
    openapiRequiredFields.add("text1Color");
    openapiRequiredFields.add("text2Color");
    openapiRequiredFields.add("ctaBackgroundColor");
    openapiRequiredFields.add("ctaTextColor");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdaptiveColors
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdaptiveColors.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdaptiveColors is not found in the empty JSON string", AdaptiveColors.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdaptiveColors.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("logoAreaAndTitleColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoAreaAndTitleColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoAreaAndTitleColor").toString()));
      }
      if (!jsonObj.get("backgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundColor").toString()));
      }
      if (!jsonObj.get("text1Color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text1Color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text1Color").toString()));
      }
      if (!jsonObj.get("text2Color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text2Color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text2Color").toString()));
      }
      if (!jsonObj.get("ctaBackgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ctaBackgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ctaBackgroundColor").toString()));
      }
      if (!jsonObj.get("ctaTextColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ctaTextColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ctaTextColor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdaptiveColors.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdaptiveColors' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdaptiveColors> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdaptiveColors.class));

       return (TypeAdapter<T>) new TypeAdapter<AdaptiveColors>() {
           @Override
           public void write(JsonWriter out, AdaptiveColors value) throws IOException {
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
           public AdaptiveColors read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdaptiveColors instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdaptiveColors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdaptiveColors
  * @throws IOException if the JSON string is invalid with respect to AdaptiveColors
  */
  public static AdaptiveColors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdaptiveColors.class);
  }

 /**
  * Convert an instance of AdaptiveColors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

