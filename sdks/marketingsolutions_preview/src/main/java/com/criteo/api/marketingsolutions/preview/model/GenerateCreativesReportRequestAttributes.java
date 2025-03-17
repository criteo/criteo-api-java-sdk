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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * This is the message defining the query for Creatives report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenerateCreativesReportRequestAttributes {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = new ArrayList<>();

  /**
   * Gets or Sets metrics
   */
  @JsonAdapter(MetricsEnum.Adapter.class)
  public enum MetricsEnum {
    CLICKS("Clicks"),
    
    CTR("Ctr"),
    
    DISPLAYS("Displays");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetricsEnum fromValue(String value) {
      for (MetricsEnum b : MetricsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetricsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetricsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetricsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetricsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<MetricsEnum> metrics = new ArrayList<>();

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    ADFORMAT("AdFormat"),
    
    COUPON("Coupon"),
    
    COUPONID("CouponId"),
    
    DISPLAYSIZE("DisplaySize"),
    
    SIZECATEGORY("SizeCategory"),
    
    AD("Ad"),
    
    ADID("AdId"),
    
    DAY("Day"),
    
    HOUR("Hour");

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

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_AD_FORMATS = "adFormats";
  @SerializedName(SERIALIZED_NAME_AD_FORMATS)
  private List<String> adFormats = null;

  public static final String SERIALIZED_NAME_DISPLAY_SIZES = "displaySizes";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SIZES)
  private List<String> displaySizes = null;

  public static final String SERIALIZED_NAME_COUPON_NAMES = "couponNames";
  @SerializedName(SERIALIZED_NAME_COUPON_NAMES)
  private List<String> couponNames = null;

  public static final String SERIALIZED_NAME_COUPON_IDS = "couponIds";
  @SerializedName(SERIALIZED_NAME_COUPON_IDS)
  private List<String> couponIds = null;

  public static final String SERIALIZED_NAME_AD_NAMES = "adNames";
  @SerializedName(SERIALIZED_NAME_AD_NAMES)
  private List<String> adNames = null;

  public static final String SERIALIZED_NAME_AD_IDS = "adIds";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<String> adIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<String> campaignIds = null;

  public static final String SERIALIZED_NAME_AD_SET_IDS = "adSetIds";
  @SerializedName(SERIALIZED_NAME_AD_SET_IDS)
  private List<String> adSetIds = null;

  public static final String SERIALIZED_NAME_AD_SET_STATUS = "adSetStatus";
  @SerializedName(SERIALIZED_NAME_AD_SET_STATUS)
  private List<String> adSetStatus = null;

  public GenerateCreativesReportRequestAttributes() {
  }

  public GenerateCreativesReportRequestAttributes startDate(OffsetDateTime startDate) {
    
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


  public GenerateCreativesReportRequestAttributes endDate(OffsetDateTime endDate) {
    
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


  public GenerateCreativesReportRequestAttributes advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addAdvertiserIdsItem(String advertiserIdsItem) {
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * The list of client ids.
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public GenerateCreativesReportRequestAttributes metrics(List<MetricsEnum> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addMetricsItem(MetricsEnum metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * The list of metrics to report.
   * @return metrics
  **/
  @javax.annotation.Nonnull

  public List<MetricsEnum> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  public GenerateCreativesReportRequestAttributes dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addDimensionsItem(DimensionsEnum dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * The list of dimensions to report.
   * @return dimensions
  **/
  @javax.annotation.Nonnull

  public List<DimensionsEnum> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<DimensionsEnum> dimensions) {
    this.dimensions = dimensions;
  }


  public GenerateCreativesReportRequestAttributes timezone(String timezone) {
    
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


  public GenerateCreativesReportRequestAttributes adFormats(List<String> adFormats) {
    
    this.adFormats = adFormats;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addAdFormatsItem(String adFormatsItem) {
    if (this.adFormats == null) {
      this.adFormats = null;
    }
    this.adFormats.add(adFormatsItem);
    return this;
  }

   /**
   * The list of adFormats.
   * @return adFormats
  **/
  @javax.annotation.Nullable

  public List<String> getAdFormats() {
    return adFormats;
  }


  public void setAdFormats(List<String> adFormats) {
    this.adFormats = adFormats;
  }


  public GenerateCreativesReportRequestAttributes displaySizes(List<String> displaySizes) {
    
    this.displaySizes = displaySizes;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addDisplaySizesItem(String displaySizesItem) {
    if (this.displaySizes == null) {
      this.displaySizes = null;
    }
    this.displaySizes.add(displaySizesItem);
    return this;
  }

   /**
   * The list of displaySizes.
   * @return displaySizes
  **/
  @javax.annotation.Nullable

  public List<String> getDisplaySizes() {
    return displaySizes;
  }


  public void setDisplaySizes(List<String> displaySizes) {
    this.displaySizes = displaySizes;
  }


  public GenerateCreativesReportRequestAttributes couponNames(List<String> couponNames) {
    
    this.couponNames = couponNames;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addCouponNamesItem(String couponNamesItem) {
    if (this.couponNames == null) {
      this.couponNames = null;
    }
    this.couponNames.add(couponNamesItem);
    return this;
  }

   /**
   * The list of coupon names.
   * @return couponNames
  **/
  @javax.annotation.Nullable

  public List<String> getCouponNames() {
    return couponNames;
  }


  public void setCouponNames(List<String> couponNames) {
    this.couponNames = couponNames;
  }


  public GenerateCreativesReportRequestAttributes couponIds(List<String> couponIds) {
    
    this.couponIds = couponIds;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addCouponIdsItem(String couponIdsItem) {
    if (this.couponIds == null) {
      this.couponIds = null;
    }
    this.couponIds.add(couponIdsItem);
    return this;
  }

   /**
   * The list of coupon ids.
   * @return couponIds
  **/
  @javax.annotation.Nullable

  public List<String> getCouponIds() {
    return couponIds;
  }


  public void setCouponIds(List<String> couponIds) {
    this.couponIds = couponIds;
  }


  public GenerateCreativesReportRequestAttributes adNames(List<String> adNames) {
    
    this.adNames = adNames;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addAdNamesItem(String adNamesItem) {
    if (this.adNames == null) {
      this.adNames = null;
    }
    this.adNames.add(adNamesItem);
    return this;
  }

   /**
   * The list of ad names.
   * @return adNames
  **/
  @javax.annotation.Nullable

  public List<String> getAdNames() {
    return adNames;
  }


  public void setAdNames(List<String> adNames) {
    this.adNames = adNames;
  }


  public GenerateCreativesReportRequestAttributes adIds(List<String> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = null;
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * The list of ad ids.
   * @return adIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }


  public GenerateCreativesReportRequestAttributes campaignIds(List<String> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = null;
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * The list of campaign ids (marketing campaign ids).
   * @return campaignIds
  **/
  @javax.annotation.Nullable

  public List<String> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public GenerateCreativesReportRequestAttributes adSetIds(List<String> adSetIds) {
    
    this.adSetIds = adSetIds;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addAdSetIdsItem(String adSetIdsItem) {
    if (this.adSetIds == null) {
      this.adSetIds = null;
    }
    this.adSetIds.add(adSetIdsItem);
    return this;
  }

   /**
   * The list of adSet ids (campaign ids).
   * @return adSetIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetIds() {
    return adSetIds;
  }


  public void setAdSetIds(List<String> adSetIds) {
    this.adSetIds = adSetIds;
  }


  public GenerateCreativesReportRequestAttributes adSetStatus(List<String> adSetStatus) {
    
    this.adSetStatus = adSetStatus;
    return this;
  }

  public GenerateCreativesReportRequestAttributes addAdSetStatusItem(String adSetStatusItem) {
    if (this.adSetStatus == null) {
      this.adSetStatus = null;
    }
    this.adSetStatus.add(adSetStatusItem);
    return this;
  }

   /**
   * The list of adSet status (ex: &#39;Active&#39;,&#39;NotRunning&#39;).
   * @return adSetStatus
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetStatus() {
    return adSetStatus;
  }


  public void setAdSetStatus(List<String> adSetStatus) {
    this.adSetStatus = adSetStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateCreativesReportRequestAttributes generateCreativesReportRequestAttributes = (GenerateCreativesReportRequestAttributes) o;
    return Objects.equals(this.startDate, generateCreativesReportRequestAttributes.startDate) &&
        Objects.equals(this.endDate, generateCreativesReportRequestAttributes.endDate) &&
        Objects.equals(this.advertiserIds, generateCreativesReportRequestAttributes.advertiserIds) &&
        Objects.equals(this.metrics, generateCreativesReportRequestAttributes.metrics) &&
        Objects.equals(this.dimensions, generateCreativesReportRequestAttributes.dimensions) &&
        Objects.equals(this.timezone, generateCreativesReportRequestAttributes.timezone) &&
        Objects.equals(this.adFormats, generateCreativesReportRequestAttributes.adFormats) &&
        Objects.equals(this.displaySizes, generateCreativesReportRequestAttributes.displaySizes) &&
        Objects.equals(this.couponNames, generateCreativesReportRequestAttributes.couponNames) &&
        Objects.equals(this.couponIds, generateCreativesReportRequestAttributes.couponIds) &&
        Objects.equals(this.adNames, generateCreativesReportRequestAttributes.adNames) &&
        Objects.equals(this.adIds, generateCreativesReportRequestAttributes.adIds) &&
        Objects.equals(this.campaignIds, generateCreativesReportRequestAttributes.campaignIds) &&
        Objects.equals(this.adSetIds, generateCreativesReportRequestAttributes.adSetIds) &&
        Objects.equals(this.adSetStatus, generateCreativesReportRequestAttributes.adSetStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, advertiserIds, metrics, dimensions, timezone, adFormats, displaySizes, couponNames, couponIds, adNames, adIds, campaignIds, adSetIds, adSetStatus);
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
    sb.append("class GenerateCreativesReportRequestAttributes {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    adFormats: ").append(toIndentedString(adFormats)).append("\n");
    sb.append("    displaySizes: ").append(toIndentedString(displaySizes)).append("\n");
    sb.append("    couponNames: ").append(toIndentedString(couponNames)).append("\n");
    sb.append("    couponIds: ").append(toIndentedString(couponIds)).append("\n");
    sb.append("    adNames: ").append(toIndentedString(adNames)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adSetIds: ").append(toIndentedString(adSetIds)).append("\n");
    sb.append("    adSetStatus: ").append(toIndentedString(adSetStatus)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("advertiserIds");
    openapiFields.add("metrics");
    openapiFields.add("dimensions");
    openapiFields.add("timezone");
    openapiFields.add("adFormats");
    openapiFields.add("displaySizes");
    openapiFields.add("couponNames");
    openapiFields.add("couponIds");
    openapiFields.add("adNames");
    openapiFields.add("adIds");
    openapiFields.add("campaignIds");
    openapiFields.add("adSetIds");
    openapiFields.add("adSetStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("advertiserIds");
    openapiRequiredFields.add("metrics");
    openapiRequiredFields.add("dimensions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateCreativesReportRequestAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenerateCreativesReportRequestAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateCreativesReportRequestAttributes is not found in the empty JSON string", GenerateCreativesReportRequestAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenerateCreativesReportRequestAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateCreativesReportRequestAttributes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateCreativesReportRequestAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("advertiserIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("advertiserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserIds` to be an array in the JSON string but got `%s`", jsonObj.get("advertiserIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("metrics") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("dimensions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adFormats") != null && !jsonObj.get("adFormats").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adFormats` to be an array in the JSON string but got `%s`", jsonObj.get("adFormats").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("displaySizes") != null && !jsonObj.get("displaySizes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `displaySizes` to be an array in the JSON string but got `%s`", jsonObj.get("displaySizes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("couponNames") != null && !jsonObj.get("couponNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponNames` to be an array in the JSON string but got `%s`", jsonObj.get("couponNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("couponIds") != null && !jsonObj.get("couponIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponIds` to be an array in the JSON string but got `%s`", jsonObj.get("couponIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adNames") != null && !jsonObj.get("adNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adNames` to be an array in the JSON string but got `%s`", jsonObj.get("adNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adIds") != null && !jsonObj.get("adIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adIds` to be an array in the JSON string but got `%s`", jsonObj.get("adIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("campaignIds") != null && !jsonObj.get("campaignIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignIds` to be an array in the JSON string but got `%s`", jsonObj.get("campaignIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetIds") != null && !jsonObj.get("adSetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetIds` to be an array in the JSON string but got `%s`", jsonObj.get("adSetIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetStatus") != null && !jsonObj.get("adSetStatus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetStatus` to be an array in the JSON string but got `%s`", jsonObj.get("adSetStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateCreativesReportRequestAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateCreativesReportRequestAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateCreativesReportRequestAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateCreativesReportRequestAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateCreativesReportRequestAttributes>() {
           @Override
           public void write(JsonWriter out, GenerateCreativesReportRequestAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateCreativesReportRequestAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateCreativesReportRequestAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateCreativesReportRequestAttributes
  * @throws IOException if the JSON string is invalid with respect to GenerateCreativesReportRequestAttributes
  */
  public static GenerateCreativesReportRequestAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateCreativesReportRequestAttributes.class);
  }

 /**
  * Convert an instance of GenerateCreativesReportRequestAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

