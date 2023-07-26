/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_07.model;

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

import com.criteo.api.retailmedia.v2023_07.JSON;

/**
 * Line item report body request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LineItemReport {
  /**
   * Gets or Sets reportType
   */
  @JsonAdapter(ReportTypeEnum.Adapter.class)
  public enum ReportTypeEnum {
    SUMMARY("summary"),
    
    PAGETYPE("pageType"),
    
    KEYWORD("keyword"),
    
    PRODUCTCATEGORY("productCategory"),
    
    PRODUCT("product");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReportTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPORT_TYPE = "reportType";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private ReportTypeEnum reportType;

  public static final String SERIALIZED_NAME_LINE_ITEM_IDS = "lineItemIds";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM_IDS)
  private List<String> lineItemIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<String> campaignIds = null;

  /**
   * Gets or Sets metrics
   */
  @JsonAdapter(MetricsEnum.Adapter.class)
  public enum MetricsEnum {
    IMPRESSIONS("impressions"),
    
    CLICKS("clicks"),
    
    SPEND("spend"),
    
    ATTRIBUTEDSALES("attributedSales"),
    
    ATTRIBUTEDUNITS("attributedUnits"),
    
    ATTRIBUTEDORDERS("attributedOrders"),
    
    CTR("ctr"),
    
    CPC("cpc"),
    
    CPO("cpo"),
    
    ROAS("roas"),
    
    ASSISTEDUNITS("assistedUnits"),
    
    ASSISTEDSALES("assistedSales"),
    
    UNIQUEVISITORS("uniqueVisitors"),
    
    FREQUENCY("frequency");

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
  private List<MetricsEnum> metrics = null;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    DATE("date"),
    
    CAMPAIGNID("campaignId"),
    
    CAMPAIGNNAME("campaignName"),
    
    CAMPAIGNTYPENAME("campaignTypeName"),
    
    ADVPRODUCTCATEGORY("advProductCategory"),
    
    ADVPRODUCTID("advProductId"),
    
    ADVPRODUCTNAME("advProductName"),
    
    BRANDID("brandId"),
    
    BRANDNAME("brandName"),
    
    LINEITEMID("lineItemId"),
    
    LINEITEMNAME("lineItemName"),
    
    RETAILERID("retailerId"),
    
    RETAILERNAME("retailerName"),
    
    KEYWORD("keyword"),
    
    PAGETYPENAME("pageTypeName"),
    
    SALESCHANNEL("salesChannel");

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
  private List<DimensionsEnum> dimensions = null;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  /**
   * Gets or Sets clickAttributionWindow
   */
  @JsonAdapter(ClickAttributionWindowEnum.Adapter.class)
  public enum ClickAttributionWindowEnum {
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D"),
    
    NONE("none");

    private String value;

    ClickAttributionWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClickAttributionWindowEnum fromValue(String value) {
      for (ClickAttributionWindowEnum b : ClickAttributionWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClickAttributionWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClickAttributionWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClickAttributionWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClickAttributionWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLICK_ATTRIBUTION_WINDOW = "clickAttributionWindow";
  @SerializedName(SERIALIZED_NAME_CLICK_ATTRIBUTION_WINDOW)
  private ClickAttributionWindowEnum clickAttributionWindow;

  /**
   * Gets or Sets viewAttributionWindow
   */
  @JsonAdapter(ViewAttributionWindowEnum.Adapter.class)
  public enum ViewAttributionWindowEnum {
    _1D("1D"),
    
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D"),
    
    NONE("none");

    private String value;

    ViewAttributionWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewAttributionWindowEnum fromValue(String value) {
      for (ViewAttributionWindowEnum b : ViewAttributionWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewAttributionWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewAttributionWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewAttributionWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewAttributionWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW_ATTRIBUTION_WINDOW = "viewAttributionWindow";
  @SerializedName(SERIALIZED_NAME_VIEW_ATTRIBUTION_WINDOW)
  private ViewAttributionWindowEnum viewAttributionWindow;

  /**
   * Gets or Sets campaignType
   */
  @JsonAdapter(CampaignTypeEnum.Adapter.class)
  public enum CampaignTypeEnum {
    SPONSOREDPRODUCTS("sponsoredProducts"),
    
    ONSITEDISPLAYS("onSiteDisplays");

    private String value;

    CampaignTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignTypeEnum fromValue(String value) {
      for (CampaignTypeEnum b : CampaignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaignType";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignTypeEnum campaignType;

  /**
   * Gets or Sets salesChannel
   */
  @JsonAdapter(SalesChannelEnum.Adapter.class)
  public enum SalesChannelEnum {
    OFFLINE("offline"),
    
    ONLINE("online");

    private String value;

    SalesChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SalesChannelEnum fromValue(String value) {
      for (SalesChannelEnum b : SalesChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SalesChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SalesChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SalesChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SalesChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SALES_CHANNEL = "salesChannel";
  @SerializedName(SERIALIZED_NAME_SALES_CHANNEL)
  private SalesChannelEnum salesChannel;

  public LineItemReport() {
  }

  public LineItemReport reportType(ReportTypeEnum reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable

  public ReportTypeEnum getReportType() {
    return reportType;
  }


  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  public LineItemReport lineItemIds(List<String> lineItemIds) {
    
    this.lineItemIds = lineItemIds;
    return this;
  }

  public LineItemReport addLineItemIdsItem(String lineItemIdsItem) {
    if (this.lineItemIds == null) {
      this.lineItemIds = new ArrayList<>();
    }
    this.lineItemIds.add(lineItemIdsItem);
    return this;
  }

   /**
   * Get lineItemIds
   * @return lineItemIds
  **/
  @javax.annotation.Nullable

  public List<String> getLineItemIds() {
    return lineItemIds;
  }


  public void setLineItemIds(List<String> lineItemIds) {
    this.lineItemIds = lineItemIds;
  }


  public LineItemReport campaignIds(List<String> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public LineItemReport addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @javax.annotation.Nullable

  public List<String> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public LineItemReport metrics(List<MetricsEnum> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public LineItemReport addMetricsItem(MetricsEnum metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable

  public List<MetricsEnum> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  public LineItemReport dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public LineItemReport addDimensionsItem(DimensionsEnum dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * List of dimensions to report on
   * @return dimensions
  **/
  @javax.annotation.Nullable

  public List<DimensionsEnum> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<DimensionsEnum> dimensions) {
    this.dimensions = dimensions;
  }


  public LineItemReport accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public LineItemReport startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public LineItemReport endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public LineItemReport timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public LineItemReport clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Get clickAttributionWindow
   * @return clickAttributionWindow
  **/
  @javax.annotation.Nullable

  public ClickAttributionWindowEnum getClickAttributionWindow() {
    return clickAttributionWindow;
  }


  public void setClickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }


  public LineItemReport viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Get viewAttributionWindow
   * @return viewAttributionWindow
  **/
  @javax.annotation.Nullable

  public ViewAttributionWindowEnum getViewAttributionWindow() {
    return viewAttributionWindow;
  }


  public void setViewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
  }


  public LineItemReport campaignType(CampaignTypeEnum campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable

  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }


  public LineItemReport salesChannel(SalesChannelEnum salesChannel) {
    
    this.salesChannel = salesChannel;
    return this;
  }

   /**
   * Get salesChannel
   * @return salesChannel
  **/
  @javax.annotation.Nullable

  public SalesChannelEnum getSalesChannel() {
    return salesChannel;
  }


  public void setSalesChannel(SalesChannelEnum salesChannel) {
    this.salesChannel = salesChannel;
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
   * @return the LineItemReport instance itself
   */
  public LineItemReport putAdditionalProperty(String key, Object value) {
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
    LineItemReport lineItemReport = (LineItemReport) o;
    return Objects.equals(this.reportType, lineItemReport.reportType) &&
        Objects.equals(this.lineItemIds, lineItemReport.lineItemIds) &&
        Objects.equals(this.campaignIds, lineItemReport.campaignIds) &&
        Objects.equals(this.metrics, lineItemReport.metrics) &&
        Objects.equals(this.dimensions, lineItemReport.dimensions) &&
        Objects.equals(this.accountId, lineItemReport.accountId) &&
        Objects.equals(this.startDate, lineItemReport.startDate) &&
        Objects.equals(this.endDate, lineItemReport.endDate) &&
        Objects.equals(this.timezone, lineItemReport.timezone) &&
        Objects.equals(this.clickAttributionWindow, lineItemReport.clickAttributionWindow) &&
        Objects.equals(this.viewAttributionWindow, lineItemReport.viewAttributionWindow) &&
        Objects.equals(this.campaignType, lineItemReport.campaignType) &&
        Objects.equals(this.salesChannel, lineItemReport.salesChannel)&&
        Objects.equals(this.additionalProperties, lineItemReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, lineItemIds, campaignIds, metrics, dimensions, accountId, startDate, endDate, timezone, clickAttributionWindow, viewAttributionWindow, campaignType, salesChannel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemReport {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    lineItemIds: ").append(toIndentedString(lineItemIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
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
    openapiFields.add("reportType");
    openapiFields.add("lineItemIds");
    openapiFields.add("campaignIds");
    openapiFields.add("metrics");
    openapiFields.add("dimensions");
    openapiFields.add("accountId");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("timezone");
    openapiFields.add("clickAttributionWindow");
    openapiFields.add("viewAttributionWindow");
    openapiFields.add("campaignType");
    openapiFields.add("salesChannel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LineItemReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LineItemReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItemReport is not found in the empty JSON string", LineItemReport.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LineItemReport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reportType") != null && !jsonObj.get("reportType").isJsonNull()) && !jsonObj.get("reportType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("lineItemIds") != null && !jsonObj.get("lineItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("lineItemIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("campaignIds") != null && !jsonObj.get("campaignIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignIds` to be an array in the JSON string but got `%s`", jsonObj.get("campaignIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("metrics") != null && !jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dimensions") != null && !jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("clickAttributionWindow") != null && !jsonObj.get("clickAttributionWindow").isJsonNull()) && !jsonObj.get("clickAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickAttributionWindow").toString()));
      }
      if ((jsonObj.get("viewAttributionWindow") != null && !jsonObj.get("viewAttributionWindow").isJsonNull()) && !jsonObj.get("viewAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewAttributionWindow").toString()));
      }
      if ((jsonObj.get("campaignType") != null && !jsonObj.get("campaignType").isJsonNull()) && !jsonObj.get("campaignType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignType").toString()));
      }
      if ((jsonObj.get("salesChannel") != null && !jsonObj.get("salesChannel").isJsonNull()) && !jsonObj.get("salesChannel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesChannel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salesChannel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LineItemReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItemReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItemReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItemReport.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItemReport>() {
           @Override
           public void write(JsonWriter out, LineItemReport value) throws IOException {
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
           public LineItemReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LineItemReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LineItemReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LineItemReport
  * @throws IOException if the JSON string is invalid with respect to LineItemReport
  */
  public static LineItemReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItemReport.class);
  }

 /**
  * Convert an instance of LineItemReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

