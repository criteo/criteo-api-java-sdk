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
import com.criteo.api.marketingsolutions.preview.model.CreateImageSlide;
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
 * Entity to create a Coupon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCoupon {
  public static final String SERIALIZED_NAME_AD_SET_ID = "adSetId";
  @SerializedName(SERIALIZED_NAME_AD_SET_ID)
  private String adSetId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  /**
   * Format of the Coupon, it can have two values: \&quot;FullFrame\&quot; or \&quot;LogoZone\&quot;
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    FULLFRAME("FullFrame"),
    
    LOGOZONE("LogoZone");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<CreateImageSlide> images = new ArrayList<>();

  public static final String SERIALIZED_NAME_LANDING_PAGE_URL = "landingPageUrl";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE_URL)
  private String landingPageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROTATIONS_NUMBER = "rotationsNumber";
  @SerializedName(SERIALIZED_NAME_ROTATIONS_NUMBER)
  private Integer rotationsNumber;

  public static final String SERIALIZED_NAME_SHOW_DURATION = "showDuration";
  @SerializedName(SERIALIZED_NAME_SHOW_DURATION)
  private Integer showDuration;

  public static final String SERIALIZED_NAME_SHOW_EVERY = "showEvery";
  @SerializedName(SERIALIZED_NAME_SHOW_EVERY)
  private Integer showEvery;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public CreateCoupon() {
  }

  public CreateCoupon adSetId(String adSetId) {
    
    this.adSetId = adSetId;
    return this;
  }

   /**
   * The id of the Ad Set on which the Coupon is applied to
   * @return adSetId
  **/
  @javax.annotation.Nonnull

  public String getAdSetId() {
    return adSetId;
  }


  public void setAdSetId(String adSetId) {
    this.adSetId = adSetId;
  }


  public CreateCoupon description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Coupon
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCoupon endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date when when we will stop to show this Coupon. If the end date is not specified (i.e. null) then the Coupon will go on forever  String must be in ISO8601 format
   * @return endDate
  **/
  @javax.annotation.Nullable

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public CreateCoupon format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * Format of the Coupon, it can have two values: \&quot;FullFrame\&quot; or \&quot;LogoZone\&quot;
   * @return format
  **/
  @javax.annotation.Nonnull

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public CreateCoupon images(List<CreateImageSlide> images) {
    
    this.images = images;
    return this;
  }

  public CreateCoupon addImagesItem(CreateImageSlide imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * List of slides containing the images as a base-64 encoded string
   * @return images
  **/
  @javax.annotation.Nonnull

  public List<CreateImageSlide> getImages() {
    return images;
  }


  public void setImages(List<CreateImageSlide> images) {
    this.images = images;
  }


  public CreateCoupon landingPageUrl(String landingPageUrl) {
    
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Web redirection of the landing page url
   * @return landingPageUrl
  **/
  @javax.annotation.Nonnull

  public String getLandingPageUrl() {
    return landingPageUrl;
  }


  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }


  public CreateCoupon name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Coupon
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCoupon rotationsNumber(Integer rotationsNumber) {
    
    this.rotationsNumber = rotationsNumber;
    return this;
  }

   /**
   * Number of rotations for the Coupons (from 1 to 10 times)
   * minimum: 1
   * maximum: 10
   * @return rotationsNumber
  **/
  @javax.annotation.Nonnull

  public Integer getRotationsNumber() {
    return rotationsNumber;
  }


  public void setRotationsNumber(Integer rotationsNumber) {
    this.rotationsNumber = rotationsNumber;
  }


  public CreateCoupon showDuration(Integer showDuration) {
    
    this.showDuration = showDuration;
    return this;
  }

   /**
   * Show Coupon for a duration of N seconds (between 1 and 5)
   * minimum: 1
   * maximum: 5
   * @return showDuration
  **/
  @javax.annotation.Nonnull

  public Integer getShowDuration() {
    return showDuration;
  }


  public void setShowDuration(Integer showDuration) {
    this.showDuration = showDuration;
  }


  public CreateCoupon showEvery(Integer showEvery) {
    
    this.showEvery = showEvery;
    return this;
  }

   /**
   * Show the Coupon every N seconds (between 1 and 10)
   * minimum: 1
   * maximum: 10
   * @return showEvery
  **/
  @javax.annotation.Nonnull

  public Integer getShowEvery() {
    return showEvery;
  }


  public void setShowEvery(Integer showEvery) {
    this.showEvery = showEvery;
  }


  public CreateCoupon startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the coupon will be launched  String must be in ISO8601 format
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
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
   * @return the CreateCoupon instance itself
   */
  public CreateCoupon putAdditionalProperty(String key, Object value) {
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
    CreateCoupon createCoupon = (CreateCoupon) o;
    return Objects.equals(this.adSetId, createCoupon.adSetId) &&
        Objects.equals(this.description, createCoupon.description) &&
        Objects.equals(this.endDate, createCoupon.endDate) &&
        Objects.equals(this.format, createCoupon.format) &&
        Objects.equals(this.images, createCoupon.images) &&
        Objects.equals(this.landingPageUrl, createCoupon.landingPageUrl) &&
        Objects.equals(this.name, createCoupon.name) &&
        Objects.equals(this.rotationsNumber, createCoupon.rotationsNumber) &&
        Objects.equals(this.showDuration, createCoupon.showDuration) &&
        Objects.equals(this.showEvery, createCoupon.showEvery) &&
        Objects.equals(this.startDate, createCoupon.startDate)&&
        Objects.equals(this.additionalProperties, createCoupon.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSetId, description, endDate, format, images, landingPageUrl, name, rotationsNumber, showDuration, showEvery, startDate, additionalProperties);
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
    sb.append("class CreateCoupon {\n");
    sb.append("    adSetId: ").append(toIndentedString(adSetId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rotationsNumber: ").append(toIndentedString(rotationsNumber)).append("\n");
    sb.append("    showDuration: ").append(toIndentedString(showDuration)).append("\n");
    sb.append("    showEvery: ").append(toIndentedString(showEvery)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("adSetId");
    openapiFields.add("description");
    openapiFields.add("endDate");
    openapiFields.add("format");
    openapiFields.add("images");
    openapiFields.add("landingPageUrl");
    openapiFields.add("name");
    openapiFields.add("rotationsNumber");
    openapiFields.add("showDuration");
    openapiFields.add("showEvery");
    openapiFields.add("startDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("adSetId");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("images");
    openapiRequiredFields.add("landingPageUrl");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("rotationsNumber");
    openapiRequiredFields.add("showDuration");
    openapiRequiredFields.add("showEvery");
    openapiRequiredFields.add("startDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCoupon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCoupon.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCoupon is not found in the empty JSON string", CreateCoupon.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCoupon.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("adSetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adSetId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }

      JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
      // validate the required field `images` (array)
      for (int i = 0; i < jsonArrayimages.size(); i++) {
        CreateImageSlide.validateJsonObject(jsonArrayimages.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("landingPageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landingPageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landingPageUrl").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCoupon>() {
           @Override
           public void write(JsonWriter out, CreateCoupon value) throws IOException {
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
           public CreateCoupon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateCoupon instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCoupon
  * @throws IOException if the JSON string is invalid with respect to CreateCoupon
  */
  public static CreateCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCoupon.class);
  }

 /**
  * Convert an instance of CreateCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

