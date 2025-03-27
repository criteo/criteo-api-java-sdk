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
 * Recommendation request parameters.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OnSiteRecoRequest {
  public static final String SERIALIZED_NAME_NB_REQUESTED_PRODUCTS = "nbRequestedProducts";
  @SerializedName(SERIALIZED_NAME_NB_REQUESTED_PRODUCTS)
  private Integer nbRequestedProducts;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  /**
   * Type of the user identifier (CtoBundle, Idfa, Gaid...)  Optional if its type is CtoBundle
   */
  @JsonAdapter(IdentityTypeEnum.Adapter.class)
  public enum IdentityTypeEnum {
    CTOBUNDLE("CtoBundle"),
    
    IDFA("Idfa"),
    
    GAID("Gaid");

    private String value;

    IdentityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentityTypeEnum fromValue(String value) {
      for (IdentityTypeEnum b : IdentityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdentityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdentityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdentityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identityType";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private IdentityTypeEnum identityType;

  public static final String SERIALIZED_NAME_AD_SET_ID = "adSetId";
  @SerializedName(SERIALIZED_NAME_AD_SET_ID)
  private Integer adSetId;

  public static final String SERIALIZED_NAME_AD_ID = "adId";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Integer adId;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public OnSiteRecoRequest() {
  }

  public OnSiteRecoRequest nbRequestedProducts(Integer nbRequestedProducts) {
    
    this.nbRequestedProducts = nbRequestedProducts;
    return this;
  }

   /**
   * Amount of products to recommend.
   * @return nbRequestedProducts
  **/
  @javax.annotation.Nonnull

  public Integer getNbRequestedProducts() {
    return nbRequestedProducts;
  }


  public void setNbRequestedProducts(Integer nbRequestedProducts) {
    this.nbRequestedProducts = nbRequestedProducts;
  }


  public OnSiteRecoRequest userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Used to retrieve user events from Criteo trackers.
   * @return userId
  **/
  @javax.annotation.Nullable

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public OnSiteRecoRequest identityType(IdentityTypeEnum identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * Type of the user identifier (CtoBundle, Idfa, Gaid...)  Optional if its type is CtoBundle
   * @return identityType
  **/
  @javax.annotation.Nullable

  public IdentityTypeEnum getIdentityType() {
    return identityType;
  }


  public void setIdentityType(IdentityTypeEnum identityType) {
    this.identityType = identityType;
  }


  public OnSiteRecoRequest adSetId(Integer adSetId) {
    
    this.adSetId = adSetId;
    return this;
  }

   /**
   * Id of the AdSet. This field is optional and is resolved automatically for adsets previously configured.
   * @return adSetId
  **/
  @javax.annotation.Nullable

  public Integer getAdSetId() {
    return adSetId;
  }


  public void setAdSetId(Integer adSetId) {
    this.adSetId = adSetId;
  }


  public OnSiteRecoRequest adId(Integer adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * Id of the Ad. This field is optional, it allows to setup Reco controls at Ad level.
   * @return adId
  **/
  @javax.annotation.Nullable

  public Integer getAdId() {
    return adId;
  }


  public void setAdId(Integer adId) {
    this.adId = adId;
  }


  public OnSiteRecoRequest partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Id of the partner.
   * @return partnerId
  **/
  @javax.annotation.Nonnull

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
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
   * @return the OnSiteRecoRequest instance itself
   */
  public OnSiteRecoRequest putAdditionalProperty(String key, Object value) {
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
    OnSiteRecoRequest onSiteRecoRequest = (OnSiteRecoRequest) o;
    return Objects.equals(this.nbRequestedProducts, onSiteRecoRequest.nbRequestedProducts) &&
        Objects.equals(this.userId, onSiteRecoRequest.userId) &&
        Objects.equals(this.identityType, onSiteRecoRequest.identityType) &&
        Objects.equals(this.adSetId, onSiteRecoRequest.adSetId) &&
        Objects.equals(this.adId, onSiteRecoRequest.adId) &&
        Objects.equals(this.partnerId, onSiteRecoRequest.partnerId)&&
        Objects.equals(this.additionalProperties, onSiteRecoRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbRequestedProducts, userId, identityType, adSetId, adId, partnerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSiteRecoRequest {\n");
    sb.append("    nbRequestedProducts: ").append(toIndentedString(nbRequestedProducts)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    adSetId: ").append(toIndentedString(adSetId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
    openapiFields.add("nbRequestedProducts");
    openapiFields.add("userId");
    openapiFields.add("identityType");
    openapiFields.add("adSetId");
    openapiFields.add("adId");
    openapiFields.add("partnerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nbRequestedProducts");
    openapiRequiredFields.add("partnerId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnSiteRecoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnSiteRecoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnSiteRecoRequest is not found in the empty JSON string", OnSiteRecoRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OnSiteRecoRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("identityType") != null && !jsonObj.get("identityType").isJsonNull()) && !jsonObj.get("identityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnSiteRecoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnSiteRecoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnSiteRecoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnSiteRecoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OnSiteRecoRequest>() {
           @Override
           public void write(JsonWriter out, OnSiteRecoRequest value) throws IOException {
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
           public OnSiteRecoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnSiteRecoRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OnSiteRecoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnSiteRecoRequest
  * @throws IOException if the JSON string is invalid with respect to OnSiteRecoRequest
  */
  public static OnSiteRecoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnSiteRecoRequest.class);
  }

 /**
  * Convert an instance of OnSiteRecoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

