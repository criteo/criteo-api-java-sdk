/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2023-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2023_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.criteo.api.marketingsolutions.v2023_10.JSON;

/**
 * This is the message defining the query for Placements report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementsReportQueryMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private String advertiserIds;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private String campaignIds;

  public static final String SERIALIZED_NAME_ADSET_IDS = "adsetIds";
  @SerializedName(SERIALIZED_NAME_ADSET_IDS)
  private String adsetIds;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_PLACEMENT = "placement";
  @SerializedName(SERIALIZED_NAME_PLACEMENT)
  private String placement;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    ADSETID("AdsetId"),
    
    ADVERTISERID("AdvertiserId"),
    
    PLACEMENT("Placement"),
    
    ENVIRONMENT("Environment"),
    
    ADSETNAME("AdsetName"),
    
    ADVERTISERNAME("AdvertiserName"),
    
    CAMPAIGNID("CampaignId"),
    
    CAMPAIGNNAME("CampaignName");

    private String value;

    DimensionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DimensionsEnum fromValue(String value) {
      for (DimensionsEnum b : DimensionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DimensionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DimensionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DimensionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DimensionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<DimensionsEnum> dimensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DISCLOSED = "disclosed";
  @SerializedName(SERIALIZED_NAME_DISCLOSED)
  private Boolean disclosed = true;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone = "UTC";

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public PlacementsReportQueryMessage() {
  }

  public PlacementsReportQueryMessage advertiserIds(String advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

   /**
   * The comma-separated list of advertiser ids.
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull

  public String getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(String advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public PlacementsReportQueryMessage campaignIds(String campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

   /**
   * The comma-separated list of campaign ids.
   * @return campaignIds
  **/
  @javax.annotation.Nullable

  public String getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(String campaignIds) {
    this.campaignIds = campaignIds;
  }


  public PlacementsReportQueryMessage adsetIds(String adsetIds) {
    
    this.adsetIds = adsetIds;
    return this;
  }

   /**
   * The comma-separated list of adSet ids.
   * @return adsetIds
  **/
  @javax.annotation.Nullable

  public String getAdsetIds() {
    return adsetIds;
  }


  public void setAdsetIds(String adsetIds) {
    this.adsetIds = adsetIds;
  }


  public PlacementsReportQueryMessage environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Type of environment: Web, Android or iOS.
   * @return environment
  **/
  @javax.annotation.Nullable

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public PlacementsReportQueryMessage placement(String placement) {
    
    this.placement = placement;
    return this;
  }

   /**
   * Filter the value of the placement
   * @return placement
  **/
  @javax.annotation.Nullable

  public String getPlacement() {
    return placement;
  }


  public void setPlacement(String placement) {
    this.placement = placement;
  }


  public PlacementsReportQueryMessage dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public PlacementsReportQueryMessage addDimensionsItem(DimensionsEnum dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * The dimensions for the report.
   * @return dimensions
  **/
  @javax.annotation.Nonnull

  public List<DimensionsEnum> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<DimensionsEnum> dimensions) {
    this.dimensions = dimensions;
  }


  public PlacementsReportQueryMessage metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public PlacementsReportQueryMessage addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * The list of metrics to report.
   * @return metrics
  **/
  @javax.annotation.Nonnull

  public List<String> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }


  public PlacementsReportQueryMessage currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for the report. ISO 4217 code (three-letter capitals).
   * @return currency
  **/
  @javax.annotation.Nonnull

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PlacementsReportQueryMessage disclosed(Boolean disclosed) {
    
    this.disclosed = disclosed;
    return this;
  }

   /**
   * Returns disclosed or undisclosed placements.
   * @return disclosed
  **/
  @javax.annotation.Nullable

  public Boolean getDisclosed() {
    return disclosed;
  }


  public void setDisclosed(Boolean disclosed) {
    this.disclosed = disclosed;
  }


  public PlacementsReportQueryMessage format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * The file format of the generated report: csv, xml, excel or json.
   * @return format
  **/
  @javax.annotation.Nonnull

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public PlacementsReportQueryMessage timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone used for the report. Timezone Database format (Tz).
   * @return timezone
  **/
  @javax.annotation.Nullable

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public PlacementsReportQueryMessage startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PlacementsReportQueryMessage endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
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
   * @return the PlacementsReportQueryMessage instance itself
   */
  public PlacementsReportQueryMessage putAdditionalProperty(String key, Object value) {
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
    PlacementsReportQueryMessage placementsReportQueryMessage = (PlacementsReportQueryMessage) o;
    return Objects.equals(this.advertiserIds, placementsReportQueryMessage.advertiserIds) &&
        Objects.equals(this.campaignIds, placementsReportQueryMessage.campaignIds) &&
        Objects.equals(this.adsetIds, placementsReportQueryMessage.adsetIds) &&
        Objects.equals(this.environment, placementsReportQueryMessage.environment) &&
        Objects.equals(this.placement, placementsReportQueryMessage.placement) &&
        Objects.equals(this.dimensions, placementsReportQueryMessage.dimensions) &&
        Objects.equals(this.metrics, placementsReportQueryMessage.metrics) &&
        Objects.equals(this.currency, placementsReportQueryMessage.currency) &&
        Objects.equals(this.disclosed, placementsReportQueryMessage.disclosed) &&
        Objects.equals(this.format, placementsReportQueryMessage.format) &&
        Objects.equals(this.timezone, placementsReportQueryMessage.timezone) &&
        Objects.equals(this.startDate, placementsReportQueryMessage.startDate) &&
        Objects.equals(this.endDate, placementsReportQueryMessage.endDate)&&
        Objects.equals(this.additionalProperties, placementsReportQueryMessage.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, campaignIds, adsetIds, environment, placement, dimensions, metrics, currency, disclosed, format, timezone, startDate, endDate, additionalProperties);
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
    sb.append("class PlacementsReportQueryMessage {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adsetIds: ").append(toIndentedString(adsetIds)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    disclosed: ").append(toIndentedString(disclosed)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("advertiserIds");
    openapiFields.add("campaignIds");
    openapiFields.add("adsetIds");
    openapiFields.add("environment");
    openapiFields.add("placement");
    openapiFields.add("dimensions");
    openapiFields.add("metrics");
    openapiFields.add("currency");
    openapiFields.add("disclosed");
    openapiFields.add("format");
    openapiFields.add("timezone");
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiserIds");
    openapiRequiredFields.add("dimensions");
    openapiRequiredFields.add("metrics");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlacementsReportQueryMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlacementsReportQueryMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlacementsReportQueryMessage is not found in the empty JSON string", PlacementsReportQueryMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlacementsReportQueryMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("advertiserIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserIds").toString()));
      }
      if ((jsonObj.get("campaignIds") != null && !jsonObj.get("campaignIds").isJsonNull()) && !jsonObj.get("campaignIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignIds").toString()));
      }
      if ((jsonObj.get("adsetIds") != null && !jsonObj.get("adsetIds").isJsonNull()) && !jsonObj.get("adsetIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adsetIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adsetIds").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("placement") != null && !jsonObj.get("placement").isJsonNull()) && !jsonObj.get("placement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placement").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("dimensions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("metrics") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlacementsReportQueryMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlacementsReportQueryMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlacementsReportQueryMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlacementsReportQueryMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<PlacementsReportQueryMessage>() {
           @Override
           public void write(JsonWriter out, PlacementsReportQueryMessage value) throws IOException {
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
           public PlacementsReportQueryMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PlacementsReportQueryMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlacementsReportQueryMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlacementsReportQueryMessage
  * @throws IOException if the JSON string is invalid with respect to PlacementsReportQueryMessage
  */
  public static PlacementsReportQueryMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlacementsReportQueryMessage.class);
  }

 /**
  * Convert an instance of PlacementsReportQueryMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
