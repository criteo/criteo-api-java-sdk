/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the message defining the query for Placements report
 */
@ApiModel(description = "This is the message defining the query for Placements report")
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


  public PlacementsReportQueryMessage advertiserIds(String advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

   /**
   * The comma-separated list of advertiser ids.
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comma-separated list of advertiser ids.")

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
  @ApiModelProperty(value = "The comma-separated list of campaign ids.")

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
  @ApiModelProperty(value = "The comma-separated list of adSet ids.")

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
  @ApiModelProperty(value = "Type of environment: Web, Android or iOS.")

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
  @ApiModelProperty(value = "Filter the value of the placement")

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
  @ApiModelProperty(required = true, value = "The dimensions for the report.")

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
  @ApiModelProperty(required = true, value = "The list of metrics to report.")

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
  @ApiModelProperty(required = true, value = "The currency used for the report. ISO 4217 code (three-letter capitals).")

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
  @ApiModelProperty(value = "Returns disclosed or undisclosed placements.")

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
  @ApiModelProperty(required = true, value = "The file format of the generated report: csv, xml, excel or json.")

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
  @ApiModelProperty(value = "The timezone used for the report. Timezone Database format (Tz).")

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
  @ApiModelProperty(required = true, value = "Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.")

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
  @ApiModelProperty(required = true, value = "End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
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
        Objects.equals(this.endDate, placementsReportQueryMessage.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, campaignIds, adsetIds, environment, placement, dimensions, metrics, currency, disclosed, format, timezone, startDate, endDate);
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

}

