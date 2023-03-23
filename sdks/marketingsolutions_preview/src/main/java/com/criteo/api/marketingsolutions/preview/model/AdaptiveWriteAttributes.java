/*
 * Criteo API
 * Criteo publicly exposed API
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
import com.criteo.api.marketingsolutions.preview.model.AdaptiveColors;
import com.criteo.api.marketingsolutions.preview.model.ImageSetBase64;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * The attributes specific to create or update an Adaptive creative
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdaptiveWriteAttributes {
  public static final String SERIALIZED_NAME_LAYOUTS = "layouts";
  @SerializedName(SERIALIZED_NAME_LAYOUTS)
  private List<String> layouts = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOGO_BASE64_STRING = "logoBase64String";
  @SerializedName(SERIALIZED_NAME_LOGO_BASE64_STRING)
  private String logoBase64String;

  public static final String SERIALIZED_NAME_HEADLINE_TEXT = "headlineText";
  @SerializedName(SERIALIZED_NAME_HEADLINE_TEXT)
  private String headlineText;

  public static final String SERIALIZED_NAME_HEADLINE_FONT = "headlineFont";
  @SerializedName(SERIALIZED_NAME_HEADLINE_FONT)
  private String headlineFont;

  public static final String SERIALIZED_NAME_DESCRIPTION_TEXT = "descriptionText";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_TEXT)
  private String descriptionText;

  public static final String SERIALIZED_NAME_DESCRIPTION_FONT = "descriptionFont";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_FONT)
  private String descriptionFont;

  public static final String SERIALIZED_NAME_CALLS_TO_ACTION = "callsToAction";
  @SerializedName(SERIALIZED_NAME_CALLS_TO_ACTION)
  private List<String> callsToAction = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLORS = "colors";
  @SerializedName(SERIALIZED_NAME_COLORS)
  private AdaptiveColors colors;

  public static final String SERIALIZED_NAME_IMAGE_SETS_BASE64 = "imageSetsBase64";
  @SerializedName(SERIALIZED_NAME_IMAGE_SETS_BASE64)
  private List<ImageSetBase64> imageSetsBase64 = null;

  public static final String SERIALIZED_NAME_IMAGE_DISPLAY = "imageDisplay";
  @SerializedName(SERIALIZED_NAME_IMAGE_DISPLAY)
  private String imageDisplay;

  public static final String SERIALIZED_NAME_VIDEO_BASE64_STRINGS = "videoBase64Strings";
  @SerializedName(SERIALIZED_NAME_VIDEO_BASE64_STRINGS)
  private List<String> videoBase64Strings = null;

  public static final String SERIALIZED_NAME_LANDING_PAGE_URL = "landingPageUrl";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE_URL)
  private URI landingPageUrl;

  public AdaptiveWriteAttributes() {
  }

  public AdaptiveWriteAttributes layouts(List<String> layouts) {
    
    this.layouts = layouts;
    return this;
  }

  public AdaptiveWriteAttributes addLayoutsItem(String layoutsItem) {
    this.layouts.add(layoutsItem);
    return this;
  }

   /**
   * The Adaptive layouts that are enabled.  It can contain any of the following values: \&quot;Editorial\&quot;, “Montage“, \&quot;InBannerVideo\&quot;.
   * @return layouts
  **/
  @javax.annotation.Nonnull

  public List<String> getLayouts() {
    return layouts;
  }


  public void setLayouts(List<String> layouts) {
    this.layouts = layouts;
  }


  public AdaptiveWriteAttributes logoBase64String(String logoBase64String) {
    
    this.logoBase64String = logoBase64String;
    return this;
  }

   /**
   * Logo image as a base-64 encoded string
   * @return logoBase64String
  **/
  @javax.annotation.Nonnull

  public String getLogoBase64String() {
    return logoBase64String;
  }


  public void setLogoBase64String(String logoBase64String) {
    this.logoBase64String = logoBase64String;
  }


  public AdaptiveWriteAttributes headlineText(String headlineText) {
    
    this.headlineText = headlineText;
    return this;
  }

   /**
   * The headline text of the banner
   * @return headlineText
  **/
  @javax.annotation.Nonnull

  public String getHeadlineText() {
    return headlineText;
  }


  public void setHeadlineText(String headlineText) {
    this.headlineText = headlineText;
  }


  public AdaptiveWriteAttributes headlineFont(String headlineFont) {
    
    this.headlineFont = headlineFont;
    return this;
  }

   /**
   * Font of the headline  Valid supported font like \&quot;Arial\&quot;
   * @return headlineFont
  **/
  @javax.annotation.Nonnull

  public String getHeadlineFont() {
    return headlineFont;
  }


  public void setHeadlineFont(String headlineFont) {
    this.headlineFont = headlineFont;
  }


  public AdaptiveWriteAttributes descriptionText(String descriptionText) {
    
    this.descriptionText = descriptionText;
    return this;
  }

   /**
   * The description text of the banner
   * @return descriptionText
  **/
  @javax.annotation.Nonnull

  public String getDescriptionText() {
    return descriptionText;
  }


  public void setDescriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
  }


  public AdaptiveWriteAttributes descriptionFont(String descriptionFont) {
    
    this.descriptionFont = descriptionFont;
    return this;
  }

   /**
   * Font of the description  Valid supported font like \&quot;Arial\&quot;
   * @return descriptionFont
  **/
  @javax.annotation.Nonnull

  public String getDescriptionFont() {
    return descriptionFont;
  }


  public void setDescriptionFont(String descriptionFont) {
    this.descriptionFont = descriptionFont;
  }


  public AdaptiveWriteAttributes callsToAction(List<String> callsToAction) {
    
    this.callsToAction = callsToAction;
    return this;
  }

  public AdaptiveWriteAttributes addCallsToActionItem(String callsToActionItem) {
    this.callsToAction.add(callsToActionItem);
    return this;
  }

   /**
   * A Call-to-Action (CTA) is an action-driven instruction to your audience intended to provoke an immediate  response, such as “Buy now” or “Go!”.
   * @return callsToAction
  **/
  @javax.annotation.Nonnull

  public List<String> getCallsToAction() {
    return callsToAction;
  }


  public void setCallsToAction(List<String> callsToAction) {
    this.callsToAction = callsToAction;
  }


  public AdaptiveWriteAttributes colors(AdaptiveColors colors) {
    
    this.colors = colors;
    return this;
  }

   /**
   * Get colors
   * @return colors
  **/
  @javax.annotation.Nonnull

  public AdaptiveColors getColors() {
    return colors;
  }


  public void setColors(AdaptiveColors colors) {
    this.colors = colors;
  }


  public AdaptiveWriteAttributes imageSetsBase64(List<ImageSetBase64> imageSetsBase64) {
    
    this.imageSetsBase64 = imageSetsBase64;
    return this;
  }

  public AdaptiveWriteAttributes addImageSetsBase64Item(ImageSetBase64 imageSetsBase64Item) {
    if (this.imageSetsBase64 == null) {
      this.imageSetsBase64 = new ArrayList<>();
    }
    this.imageSetsBase64.add(imageSetsBase64Item);
    return this;
  }

   /**
   * Multiple image sets, each image set consists of multiple images as a base-64 encoded string and a headline text.
   * @return imageSetsBase64
  **/
  @javax.annotation.Nullable

  public List<ImageSetBase64> getImageSetsBase64() {
    return imageSetsBase64;
  }


  public void setImageSetsBase64(List<ImageSetBase64> imageSetsBase64) {
    this.imageSetsBase64 = imageSetsBase64;
  }


  public AdaptiveWriteAttributes imageDisplay(String imageDisplay) {
    
    this.imageDisplay = imageDisplay;
    return this;
  }

   /**
   * Value can be \&quot;ShowFullImage\&quot; or \&quot;ZoomOnImage\&quot;. Choose whether your image set should fit inside the allocated  space (\&quot;ShowFullImage\&quot;) or whether it should fill that space (\&quot;ZoomOnImage\&quot;). If you choose ZoomOnImage, there may be some  image cropping.
   * @return imageDisplay
  **/
  @javax.annotation.Nullable

  public String getImageDisplay() {
    return imageDisplay;
  }


  public void setImageDisplay(String imageDisplay) {
    this.imageDisplay = imageDisplay;
  }


  public AdaptiveWriteAttributes videoBase64Strings(List<String> videoBase64Strings) {
    
    this.videoBase64Strings = videoBase64Strings;
    return this;
  }

  public AdaptiveWriteAttributes addVideoBase64StringsItem(String videoBase64StringsItem) {
    if (this.videoBase64Strings == null) {
      this.videoBase64Strings = new ArrayList<>();
    }
    this.videoBase64Strings.add(videoBase64StringsItem);
    return this;
  }

   /**
   * Multiple videos potentially in different shapes, each video is a base-64 encoded string.
   * @return videoBase64Strings
  **/
  @javax.annotation.Nullable

  public List<String> getVideoBase64Strings() {
    return videoBase64Strings;
  }


  public void setVideoBase64Strings(List<String> videoBase64Strings) {
    this.videoBase64Strings = videoBase64Strings;
  }


  public AdaptiveWriteAttributes landingPageUrl(URI landingPageUrl) {
    
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Web redirection of the landing page url.
   * @return landingPageUrl
  **/
  @javax.annotation.Nonnull

  public URI getLandingPageUrl() {
    return landingPageUrl;
  }


  public void setLandingPageUrl(URI landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
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
   * @return the AdaptiveWriteAttributes instance itself
   */
  public AdaptiveWriteAttributes putAdditionalProperty(String key, Object value) {
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
    AdaptiveWriteAttributes adaptiveWriteAttributes = (AdaptiveWriteAttributes) o;
    return Objects.equals(this.layouts, adaptiveWriteAttributes.layouts) &&
        Objects.equals(this.logoBase64String, adaptiveWriteAttributes.logoBase64String) &&
        Objects.equals(this.headlineText, adaptiveWriteAttributes.headlineText) &&
        Objects.equals(this.headlineFont, adaptiveWriteAttributes.headlineFont) &&
        Objects.equals(this.descriptionText, adaptiveWriteAttributes.descriptionText) &&
        Objects.equals(this.descriptionFont, adaptiveWriteAttributes.descriptionFont) &&
        Objects.equals(this.callsToAction, adaptiveWriteAttributes.callsToAction) &&
        Objects.equals(this.colors, adaptiveWriteAttributes.colors) &&
        Objects.equals(this.imageSetsBase64, adaptiveWriteAttributes.imageSetsBase64) &&
        Objects.equals(this.imageDisplay, adaptiveWriteAttributes.imageDisplay) &&
        Objects.equals(this.videoBase64Strings, adaptiveWriteAttributes.videoBase64Strings) &&
        Objects.equals(this.landingPageUrl, adaptiveWriteAttributes.landingPageUrl)&&
        Objects.equals(this.additionalProperties, adaptiveWriteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layouts, logoBase64String, headlineText, headlineFont, descriptionText, descriptionFont, callsToAction, colors, imageSetsBase64, imageDisplay, videoBase64Strings, landingPageUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveWriteAttributes {\n");
    sb.append("    layouts: ").append(toIndentedString(layouts)).append("\n");
    sb.append("    logoBase64String: ").append(toIndentedString(logoBase64String)).append("\n");
    sb.append("    headlineText: ").append(toIndentedString(headlineText)).append("\n");
    sb.append("    headlineFont: ").append(toIndentedString(headlineFont)).append("\n");
    sb.append("    descriptionText: ").append(toIndentedString(descriptionText)).append("\n");
    sb.append("    descriptionFont: ").append(toIndentedString(descriptionFont)).append("\n");
    sb.append("    callsToAction: ").append(toIndentedString(callsToAction)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    imageSetsBase64: ").append(toIndentedString(imageSetsBase64)).append("\n");
    sb.append("    imageDisplay: ").append(toIndentedString(imageDisplay)).append("\n");
    sb.append("    videoBase64Strings: ").append(toIndentedString(videoBase64Strings)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
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
    openapiFields.add("layouts");
    openapiFields.add("logoBase64String");
    openapiFields.add("headlineText");
    openapiFields.add("headlineFont");
    openapiFields.add("descriptionText");
    openapiFields.add("descriptionFont");
    openapiFields.add("callsToAction");
    openapiFields.add("colors");
    openapiFields.add("imageSetsBase64");
    openapiFields.add("imageDisplay");
    openapiFields.add("videoBase64Strings");
    openapiFields.add("landingPageUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("layouts");
    openapiRequiredFields.add("logoBase64String");
    openapiRequiredFields.add("headlineText");
    openapiRequiredFields.add("headlineFont");
    openapiRequiredFields.add("descriptionText");
    openapiRequiredFields.add("descriptionFont");
    openapiRequiredFields.add("callsToAction");
    openapiRequiredFields.add("colors");
    openapiRequiredFields.add("landingPageUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdaptiveWriteAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdaptiveWriteAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdaptiveWriteAttributes is not found in the empty JSON string", AdaptiveWriteAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdaptiveWriteAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("layouts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("layouts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `layouts` to be an array in the JSON string but got `%s`", jsonObj.get("layouts").toString()));
      }
      if (!jsonObj.get("logoBase64String").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoBase64String` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoBase64String").toString()));
      }
      if (!jsonObj.get("headlineText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headlineText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headlineText").toString()));
      }
      if (!jsonObj.get("headlineFont").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headlineFont` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headlineFont").toString()));
      }
      if (!jsonObj.get("descriptionText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionText").toString()));
      }
      if (!jsonObj.get("descriptionFont").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionFont` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionFont").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("callsToAction") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("callsToAction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callsToAction` to be an array in the JSON string but got `%s`", jsonObj.get("callsToAction").toString()));
      }
      // validate the required field `colors`
      AdaptiveColors.validateJsonObject(jsonObj.getAsJsonObject("colors"));
      if (jsonObj.get("imageSetsBase64") != null && !jsonObj.get("imageSetsBase64").isJsonNull()) {
        JsonArray jsonArrayimageSetsBase64 = jsonObj.getAsJsonArray("imageSetsBase64");
        if (jsonArrayimageSetsBase64 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("imageSetsBase64").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `imageSetsBase64` to be an array in the JSON string but got `%s`", jsonObj.get("imageSetsBase64").toString()));
          }

          // validate the optional field `imageSetsBase64` (array)
          for (int i = 0; i < jsonArrayimageSetsBase64.size(); i++) {
            ImageSetBase64.validateJsonObject(jsonArrayimageSetsBase64.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("imageDisplay") != null && !jsonObj.get("imageDisplay").isJsonNull()) && !jsonObj.get("imageDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageDisplay").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("videoBase64Strings") != null && !jsonObj.get("videoBase64Strings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoBase64Strings` to be an array in the JSON string but got `%s`", jsonObj.get("videoBase64Strings").toString()));
      }
      if (!jsonObj.get("landingPageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landingPageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landingPageUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdaptiveWriteAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdaptiveWriteAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdaptiveWriteAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdaptiveWriteAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AdaptiveWriteAttributes>() {
           @Override
           public void write(JsonWriter out, AdaptiveWriteAttributes value) throws IOException {
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
           public AdaptiveWriteAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdaptiveWriteAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdaptiveWriteAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdaptiveWriteAttributes
  * @throws IOException if the JSON string is invalid with respect to AdaptiveWriteAttributes
  */
  public static AdaptiveWriteAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdaptiveWriteAttributes.class);
  }

 /**
  * Convert an instance of AdaptiveWriteAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

