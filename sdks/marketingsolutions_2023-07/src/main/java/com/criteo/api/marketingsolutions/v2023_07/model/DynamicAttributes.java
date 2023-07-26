/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2023-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2023_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2023_07.model.ImageShape;
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

import com.criteo.api.marketingsolutions.v2023_07.JSON;

/**
 * The attributes specific to Dynamic creatives
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicAttributes {
  public static final String SERIALIZED_NAME_LOGOS = "logos";
  @SerializedName(SERIALIZED_NAME_LOGOS)
  private List<ImageShape> logos = null;

  public static final String SERIALIZED_NAME_CREATIVE_BACKGROUND_COLOR = "creativeBackgroundColor";
  @SerializedName(SERIALIZED_NAME_CREATIVE_BACKGROUND_COLOR)
  private String creativeBackgroundColor;

  public static final String SERIALIZED_NAME_BODY_TEXT_COLOR = "bodyTextColor";
  @SerializedName(SERIALIZED_NAME_BODY_TEXT_COLOR)
  private String bodyTextColor;

  public static final String SERIALIZED_NAME_PRICES_COLOR = "pricesColor";
  @SerializedName(SERIALIZED_NAME_PRICES_COLOR)
  private String pricesColor;

  public static final String SERIALIZED_NAME_PRIMARY_FONT = "primaryFont";
  @SerializedName(SERIALIZED_NAME_PRIMARY_FONT)
  private String primaryFont;

  public static final String SERIALIZED_NAME_CALLS_TO_ACTION = "callsToAction";
  @SerializedName(SERIALIZED_NAME_CALLS_TO_ACTION)
  private List<String> callsToAction = null;

  /**
   * Value can be \&quot;ShowFullImage\&quot; or \&quot;ZoomOnImage\&quot;. Choose whether your product catalog images should fit inside the allocated  space (\&quot;ShowFullImage\&quot;) or whether they should fill that space (\&quot;ZoomOnImage\&quot;). If you choose ZoomOnImage, there may be some  image cropping.
   */
  @JsonAdapter(ProductImageDisplayEnum.Adapter.class)
  public enum ProductImageDisplayEnum {
    SHOWFULLIMAGE("ShowFullImage"),
    
    ZOOMONIMAGE("ZoomOnImage");

    private String value;

    ProductImageDisplayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductImageDisplayEnum fromValue(String value) {
      for (ProductImageDisplayEnum b : ProductImageDisplayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductImageDisplayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductImageDisplayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductImageDisplayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProductImageDisplayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_DISPLAY = "productImageDisplay";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_DISPLAY)
  private ProductImageDisplayEnum productImageDisplay;

  public DynamicAttributes() {
  }

  public DynamicAttributes logos(List<ImageShape> logos) {
    
    this.logos = logos;
    return this;
  }

  public DynamicAttributes addLogosItem(ImageShape logosItem) {
    if (this.logos == null) {
      this.logos = new ArrayList<>();
    }
    this.logos.add(logosItem);
    return this;
  }

   /**
   * Logo images uploaded on demostatic.criteo.com when deploying and then static.criteo.net
   * @return logos
  **/
  @javax.annotation.Nullable

  public List<ImageShape> getLogos() {
    return logos;
  }


  public void setLogos(List<ImageShape> logos) {
    this.logos = logos;
  }


  public DynamicAttributes creativeBackgroundColor(String creativeBackgroundColor) {
    
    this.creativeBackgroundColor = creativeBackgroundColor;
    return this;
  }

   /**
   * Color of the creative&#39;s background  Valid hexadecimal color (e.g. \&quot;AB00FF\&quot;)
   * @return creativeBackgroundColor
  **/
  @javax.annotation.Nullable

  public String getCreativeBackgroundColor() {
    return creativeBackgroundColor;
  }


  public void setCreativeBackgroundColor(String creativeBackgroundColor) {
    this.creativeBackgroundColor = creativeBackgroundColor;
  }


  public DynamicAttributes bodyTextColor(String bodyTextColor) {
    
    this.bodyTextColor = bodyTextColor;
    return this;
  }

   /**
   * Color of the creative&#39;s body text  Valid hexadecimal color (e.g. \&quot;AB00FF\&quot;)
   * @return bodyTextColor
  **/
  @javax.annotation.Nullable

  public String getBodyTextColor() {
    return bodyTextColor;
  }


  public void setBodyTextColor(String bodyTextColor) {
    this.bodyTextColor = bodyTextColor;
  }


  public DynamicAttributes pricesColor(String pricesColor) {
    
    this.pricesColor = pricesColor;
    return this;
  }

   /**
   * Color of the creative&#39;s prices  Valid hexadecimal color (e.g. \&quot;AB00FF\&quot;)
   * @return pricesColor
  **/
  @javax.annotation.Nullable

  public String getPricesColor() {
    return pricesColor;
  }


  public void setPricesColor(String pricesColor) {
    this.pricesColor = pricesColor;
  }


  public DynamicAttributes primaryFont(String primaryFont) {
    
    this.primaryFont = primaryFont;
    return this;
  }

   /**
   * Font of the primary font  Valid supported font like \&quot;Arial\&quot;
   * @return primaryFont
  **/
  @javax.annotation.Nullable

  public String getPrimaryFont() {
    return primaryFont;
  }


  public void setPrimaryFont(String primaryFont) {
    this.primaryFont = primaryFont;
  }


  public DynamicAttributes callsToAction(List<String> callsToAction) {
    
    this.callsToAction = callsToAction;
    return this;
  }

  public DynamicAttributes addCallsToActionItem(String callsToActionItem) {
    if (this.callsToAction == null) {
      this.callsToAction = new ArrayList<>();
    }
    this.callsToAction.add(callsToActionItem);
    return this;
  }

   /**
   * A Call-to-Action (CTA) is an action-driven instruction to your audience intended to provoke an immediate  response, such as “Buy now” or “Go!”.
   * @return callsToAction
  **/
  @javax.annotation.Nullable

  public List<String> getCallsToAction() {
    return callsToAction;
  }


  public void setCallsToAction(List<String> callsToAction) {
    this.callsToAction = callsToAction;
  }


  public DynamicAttributes productImageDisplay(ProductImageDisplayEnum productImageDisplay) {
    
    this.productImageDisplay = productImageDisplay;
    return this;
  }

   /**
   * Value can be \&quot;ShowFullImage\&quot; or \&quot;ZoomOnImage\&quot;. Choose whether your product catalog images should fit inside the allocated  space (\&quot;ShowFullImage\&quot;) or whether they should fill that space (\&quot;ZoomOnImage\&quot;). If you choose ZoomOnImage, there may be some  image cropping.
   * @return productImageDisplay
  **/
  @javax.annotation.Nullable

  public ProductImageDisplayEnum getProductImageDisplay() {
    return productImageDisplay;
  }


  public void setProductImageDisplay(ProductImageDisplayEnum productImageDisplay) {
    this.productImageDisplay = productImageDisplay;
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
   * @return the DynamicAttributes instance itself
   */
  public DynamicAttributes putAdditionalProperty(String key, Object value) {
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
    DynamicAttributes dynamicAttributes = (DynamicAttributes) o;
    return Objects.equals(this.logos, dynamicAttributes.logos) &&
        Objects.equals(this.creativeBackgroundColor, dynamicAttributes.creativeBackgroundColor) &&
        Objects.equals(this.bodyTextColor, dynamicAttributes.bodyTextColor) &&
        Objects.equals(this.pricesColor, dynamicAttributes.pricesColor) &&
        Objects.equals(this.primaryFont, dynamicAttributes.primaryFont) &&
        Objects.equals(this.callsToAction, dynamicAttributes.callsToAction) &&
        Objects.equals(this.productImageDisplay, dynamicAttributes.productImageDisplay)&&
        Objects.equals(this.additionalProperties, dynamicAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logos, creativeBackgroundColor, bodyTextColor, pricesColor, primaryFont, callsToAction, productImageDisplay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicAttributes {\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
    sb.append("    creativeBackgroundColor: ").append(toIndentedString(creativeBackgroundColor)).append("\n");
    sb.append("    bodyTextColor: ").append(toIndentedString(bodyTextColor)).append("\n");
    sb.append("    pricesColor: ").append(toIndentedString(pricesColor)).append("\n");
    sb.append("    primaryFont: ").append(toIndentedString(primaryFont)).append("\n");
    sb.append("    callsToAction: ").append(toIndentedString(callsToAction)).append("\n");
    sb.append("    productImageDisplay: ").append(toIndentedString(productImageDisplay)).append("\n");
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
    openapiFields.add("logos");
    openapiFields.add("creativeBackgroundColor");
    openapiFields.add("bodyTextColor");
    openapiFields.add("pricesColor");
    openapiFields.add("primaryFont");
    openapiFields.add("callsToAction");
    openapiFields.add("productImageDisplay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DynamicAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DynamicAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicAttributes is not found in the empty JSON string", DynamicAttributes.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("logos") != null && !jsonObj.get("logos").isJsonNull()) {
        JsonArray jsonArraylogos = jsonObj.getAsJsonArray("logos");
        if (jsonArraylogos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("logos").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `logos` to be an array in the JSON string but got `%s`", jsonObj.get("logos").toString()));
          }

          // validate the optional field `logos` (array)
          for (int i = 0; i < jsonArraylogos.size(); i++) {
            ImageShape.validateJsonObject(jsonArraylogos.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("creativeBackgroundColor") != null && !jsonObj.get("creativeBackgroundColor").isJsonNull()) && !jsonObj.get("creativeBackgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creativeBackgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creativeBackgroundColor").toString()));
      }
      if ((jsonObj.get("bodyTextColor") != null && !jsonObj.get("bodyTextColor").isJsonNull()) && !jsonObj.get("bodyTextColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bodyTextColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bodyTextColor").toString()));
      }
      if ((jsonObj.get("pricesColor") != null && !jsonObj.get("pricesColor").isJsonNull()) && !jsonObj.get("pricesColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricesColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricesColor").toString()));
      }
      if ((jsonObj.get("primaryFont") != null && !jsonObj.get("primaryFont").isJsonNull()) && !jsonObj.get("primaryFont").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryFont` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryFont").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("callsToAction") != null && !jsonObj.get("callsToAction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callsToAction` to be an array in the JSON string but got `%s`", jsonObj.get("callsToAction").toString()));
      }
      if ((jsonObj.get("productImageDisplay") != null && !jsonObj.get("productImageDisplay").isJsonNull()) && !jsonObj.get("productImageDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productImageDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productImageDisplay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicAttributes>() {
           @Override
           public void write(JsonWriter out, DynamicAttributes value) throws IOException {
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
           public DynamicAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DynamicAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DynamicAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicAttributes
  * @throws IOException if the JSON string is invalid with respect to DynamicAttributes
  */
  public static DynamicAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicAttributes.class);
  }

 /**
  * Convert an instance of DynamicAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

