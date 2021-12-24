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
 * This is the message defining the query for Categories report
 */
@ApiModel(description = "This is the message defining the query for Categories report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenerateCategoriesReportRequestAttributes {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_ADSET_ID = "adsetId";
  @SerializedName(SERIALIZED_NAME_ADSET_ID)
  private String adsetId;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_SHOULD_DISPLAY_DOMAIN_DIMENSION = "shouldDisplayDomainDimension";
  @SerializedName(SERIALIZED_NAME_SHOULD_DISPLAY_DOMAIN_DIMENSION)
  private Boolean shouldDisplayDomainDimension = true;

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


  public GenerateCategoriesReportRequestAttributes advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public GenerateCategoriesReportRequestAttributes addAdvertiserIdsItem(String advertiserIdsItem) {
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * List of Advertiser ids.
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of Advertiser ids.")

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public GenerateCategoriesReportRequestAttributes campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Report only on the specified Campaign id.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Report only on the specified Campaign id.")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public GenerateCategoriesReportRequestAttributes adsetId(String adsetId) {
    
    this.adsetId = adsetId;
    return this;
  }

   /**
   * Report only on the specified AdSet id.
   * @return adsetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Report only on the specified AdSet id.")

  public String getAdsetId() {
    return adsetId;
  }


  public void setAdsetId(String adsetId) {
    this.adsetId = adsetId;
  }


  public GenerateCategoriesReportRequestAttributes domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Report only on the specified domain.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Report only on the specified domain.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public GenerateCategoriesReportRequestAttributes category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Report only on the specified category.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Report only on the specified category.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public GenerateCategoriesReportRequestAttributes shouldDisplayDomainDimension(Boolean shouldDisplayDomainDimension) {
    
    this.shouldDisplayDomainDimension = shouldDisplayDomainDimension;
    return this;
  }

   /**
   * Specify if the domain dimension is displayed in the report.
   * @return shouldDisplayDomainDimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify if the domain dimension is displayed in the report.")

  public Boolean getShouldDisplayDomainDimension() {
    return shouldDisplayDomainDimension;
  }


  public void setShouldDisplayDomainDimension(Boolean shouldDisplayDomainDimension) {
    this.shouldDisplayDomainDimension = shouldDisplayDomainDimension;
  }


  public GenerateCategoriesReportRequestAttributes format(String format) {
    
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


  public GenerateCategoriesReportRequestAttributes timezone(String timezone) {
    
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


  public GenerateCategoriesReportRequestAttributes startDate(OffsetDateTime startDate) {
    
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


  public GenerateCategoriesReportRequestAttributes endDate(OffsetDateTime endDate) {
    
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
    GenerateCategoriesReportRequestAttributes generateCategoriesReportRequestAttributes = (GenerateCategoriesReportRequestAttributes) o;
    return Objects.equals(this.advertiserIds, generateCategoriesReportRequestAttributes.advertiserIds) &&
        Objects.equals(this.campaignId, generateCategoriesReportRequestAttributes.campaignId) &&
        Objects.equals(this.adsetId, generateCategoriesReportRequestAttributes.adsetId) &&
        Objects.equals(this.domain, generateCategoriesReportRequestAttributes.domain) &&
        Objects.equals(this.category, generateCategoriesReportRequestAttributes.category) &&
        Objects.equals(this.shouldDisplayDomainDimension, generateCategoriesReportRequestAttributes.shouldDisplayDomainDimension) &&
        Objects.equals(this.format, generateCategoriesReportRequestAttributes.format) &&
        Objects.equals(this.timezone, generateCategoriesReportRequestAttributes.timezone) &&
        Objects.equals(this.startDate, generateCategoriesReportRequestAttributes.startDate) &&
        Objects.equals(this.endDate, generateCategoriesReportRequestAttributes.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, campaignId, adsetId, domain, category, shouldDisplayDomainDimension, format, timezone, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCategoriesReportRequestAttributes {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adsetId: ").append(toIndentedString(adsetId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    shouldDisplayDomainDimension: ").append(toIndentedString(shouldDisplayDomainDimension)).append("\n");
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
