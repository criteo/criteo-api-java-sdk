/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2021-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2021_10.model;

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

/**
 * This is the message defining the query for Transaction report
 */
@ApiModel(description = "This is the message defining the query for Transaction report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionsReportQueryMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private String advertiserIds;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

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


  public TransactionsReportQueryMessage advertiserIds(String advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

   /**
   * The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used")

  public String getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(String advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public TransactionsReportQueryMessage eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Apply a filter on Event type .
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply a filter on Event type .")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public TransactionsReportQueryMessage currency(String currency) {
    
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


  public TransactionsReportQueryMessage format(String format) {
    
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


  public TransactionsReportQueryMessage timezone(String timezone) {
    
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


  public TransactionsReportQueryMessage startDate(OffsetDateTime startDate) {
    
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


  public TransactionsReportQueryMessage endDate(OffsetDateTime endDate) {
    
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
    TransactionsReportQueryMessage transactionsReportQueryMessage = (TransactionsReportQueryMessage) o;
    return Objects.equals(this.advertiserIds, transactionsReportQueryMessage.advertiserIds) &&
        Objects.equals(this.eventType, transactionsReportQueryMessage.eventType) &&
        Objects.equals(this.currency, transactionsReportQueryMessage.currency) &&
        Objects.equals(this.format, transactionsReportQueryMessage.format) &&
        Objects.equals(this.timezone, transactionsReportQueryMessage.timezone) &&
        Objects.equals(this.startDate, transactionsReportQueryMessage.startDate) &&
        Objects.equals(this.endDate, transactionsReportQueryMessage.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, eventType, currency, format, timezone, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsReportQueryMessage {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

