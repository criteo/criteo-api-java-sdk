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
 * filter on ad set ids
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetSearchFilterV23Q1 {
  public static final String SERIALIZED_NAME_AD_SET_IDS = "adSetIds";
  @SerializedName(SERIALIZED_NAME_AD_SET_IDS)
  private List<String> adSetIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<String> campaignIds = null;

  public AdSetSearchFilterV23Q1() {
  }

  public AdSetSearchFilterV23Q1 adSetIds(List<String> adSetIds) {
    
    this.adSetIds = adSetIds;
    return this;
  }

  public AdSetSearchFilterV23Q1 addAdSetIdsItem(String adSetIdsItem) {
    if (this.adSetIds == null) {
      this.adSetIds = new ArrayList<>();
    }
    this.adSetIds.add(adSetIdsItem);
    return this;
  }

   /**
   * Ad set ids to filter on
   * @return adSetIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetIds() {
    return adSetIds;
  }


  public void setAdSetIds(List<String> adSetIds) {
    this.adSetIds = adSetIds;
  }


  public AdSetSearchFilterV23Q1 advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AdSetSearchFilterV23Q1 addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * Advertiser ids which ad sets belongs to (indirectly via their marketing campaign)
   * @return advertiserIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AdSetSearchFilterV23Q1 campaignIds(List<String> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public AdSetSearchFilterV23Q1 addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Campaign ids to filter on
   * @return campaignIds
  **/
  @javax.annotation.Nullable

  public List<String> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
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
   * @return the AdSetSearchFilterV23Q1 instance itself
   */
  public AdSetSearchFilterV23Q1 putAdditionalProperty(String key, Object value) {
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
    AdSetSearchFilterV23Q1 adSetSearchFilterV23Q1 = (AdSetSearchFilterV23Q1) o;
    return Objects.equals(this.adSetIds, adSetSearchFilterV23Q1.adSetIds) &&
        Objects.equals(this.advertiserIds, adSetSearchFilterV23Q1.advertiserIds) &&
        Objects.equals(this.campaignIds, adSetSearchFilterV23Q1.campaignIds)&&
        Objects.equals(this.additionalProperties, adSetSearchFilterV23Q1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSetIds, advertiserIds, campaignIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetSearchFilterV23Q1 {\n");
    sb.append("    adSetIds: ").append(toIndentedString(adSetIds)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
    openapiFields.add("adSetIds");
    openapiFields.add("advertiserIds");
    openapiFields.add("campaignIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdSetSearchFilterV23Q1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdSetSearchFilterV23Q1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdSetSearchFilterV23Q1 is not found in the empty JSON string", AdSetSearchFilterV23Q1.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetIds") != null && !jsonObj.get("adSetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetIds` to be an array in the JSON string but got `%s`", jsonObj.get("adSetIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("advertiserIds") != null && !jsonObj.get("advertiserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserIds` to be an array in the JSON string but got `%s`", jsonObj.get("advertiserIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("campaignIds") != null && !jsonObj.get("campaignIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignIds` to be an array in the JSON string but got `%s`", jsonObj.get("campaignIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdSetSearchFilterV23Q1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdSetSearchFilterV23Q1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdSetSearchFilterV23Q1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdSetSearchFilterV23Q1.class));

       return (TypeAdapter<T>) new TypeAdapter<AdSetSearchFilterV23Q1>() {
           @Override
           public void write(JsonWriter out, AdSetSearchFilterV23Q1 value) throws IOException {
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
           public AdSetSearchFilterV23Q1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdSetSearchFilterV23Q1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdSetSearchFilterV23Q1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdSetSearchFilterV23Q1
  * @throws IOException if the JSON string is invalid with respect to AdSetSearchFilterV23Q1
  */
  public static AdSetSearchFilterV23Q1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdSetSearchFilterV23Q1.class);
  }

 /**
  * Convert an instance of AdSetSearchFilterV23Q1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

