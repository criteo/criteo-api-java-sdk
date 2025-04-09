/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * Line Items report body request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyncLineItemsReport {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaignIds";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<String> campaignIds = null;

  /**
   * Filter the type of campaigns to report on: sponsoredProducts or onSiteDisplays
   */
  @JsonAdapter(CampaignTypeEnum.Adapter.class)
  public enum CampaignTypeEnum {
    ALL("all"),
    
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
  private CampaignTypeEnum campaignType = CampaignTypeEnum.ALL;

  /**
   * Click attribution window
   */
  @JsonAdapter(ClickAttributionWindowEnum.Adapter.class)
  public enum ClickAttributionWindowEnum {
    NONE("none"),
    
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D");

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
  private ClickAttributionWindowEnum clickAttributionWindow = ClickAttributionWindowEnum.NONE;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    DATE("date"),
    
    HOUR("hour"),
    
    ACCOUNTID("accountId"),
    
    ACCOUNTNAME("accountName"),
    
    CAMPAIGNID("campaignId"),
    
    CAMPAIGNNAME("campaignName"),
    
    CAMPAIGNTYPENAME("campaignTypeName"),
    
    LINEITEMID("lineItemId"),
    
    LINEITEMNAME("lineItemName"),
    
    RETAILERID("retailerId"),
    
    RETAILERNAME("retailerName"),
    
    BRANDID("brandId"),
    
    BRANDNAME("brandName"),
    
    ADVPRODUCTCATEGORY("advProductCategory"),
    
    ADVPRODUCTID("advProductId"),
    
    ADVPRODUCTNAME("advProductName"),
    
    SALESCHANNEL("salesChannel"),
    
    ENVIRONMENT("environment"),
    
    PAGETYPENAME("pageTypeName"),
    
    PAGECATEGORY("pageCategory"),
    
    SERVEDCATEGORY("servedCategory"),
    
    TAXONOMYBREADCRUMB("taxonomyBreadcrumb");

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

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_LINE_ITEM_IDS = "lineItemIds";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM_IDS)
  private List<String> lineItemIds = null;

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
    
    ASSISTEDSALES("assistedSales"),
    
    ASSISTEDUNITS("assistedUnits"),
    
    CTR("ctr"),
    
    CPC("cpc"),
    
    CPO("cpo"),
    
    CPM("cpm"),
    
    ROAS("roas"),
    
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
   * Type of report, if no dimensions/metrics are provided, falls back to summary reportType
   */
  @JsonAdapter(ReportTypeEnum.Adapter.class)
  public enum ReportTypeEnum {
    SUMMARY("summary"),
    
    PAGETYPE("pageType"),
    
    PRODUCTCATEGORY("productCategory"),
    
    PRODUCT("product"),
    
    ENVIRONMENT("environment"),
    
    SERVEDCATEGORY("servedCategory");

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
  private ReportTypeEnum reportType = ReportTypeEnum.SUMMARY;

  /**
   * Filter on specific sales channel: offline or online
   */
  @JsonAdapter(SalesChannelEnum.Adapter.class)
  public enum SalesChannelEnum {
    ALL("all"),
    
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
  private SalesChannelEnum salesChannel = SalesChannelEnum.ALL;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone = "UTC";

  /**
   * View attribution window
   */
  @JsonAdapter(ViewAttributionWindowEnum.Adapter.class)
  public enum ViewAttributionWindowEnum {
    NONE("none"),
    
    _1D("1D"),
    
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D");

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
  private ViewAttributionWindowEnum viewAttributionWindow = ViewAttributionWindowEnum.NONE;

  public SyncLineItemsReport() {
  }

  public SyncLineItemsReport accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account id to report on
   * @return accountId
  **/
  @javax.annotation.Nonnull

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SyncLineItemsReport campaignIds(List<String> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public SyncLineItemsReport addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Campaign ids to filter
   * @return campaignIds
  **/
  @javax.annotation.Nullable

  public List<String> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public SyncLineItemsReport campaignType(CampaignTypeEnum campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Filter the type of campaigns to report on: sponsoredProducts or onSiteDisplays
   * @return campaignType
  **/
  @javax.annotation.Nullable

  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }


  public SyncLineItemsReport clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Click attribution window
   * @return clickAttributionWindow
  **/
  @javax.annotation.Nullable

  public ClickAttributionWindowEnum getClickAttributionWindow() {
    return clickAttributionWindow;
  }


  public void setClickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }


  public SyncLineItemsReport dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public SyncLineItemsReport addDimensionsItem(DimensionsEnum dimensionsItem) {
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


  public SyncLineItemsReport endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public SyncLineItemsReport lineItemIds(List<String> lineItemIds) {
    
    this.lineItemIds = lineItemIds;
    return this;
  }

  public SyncLineItemsReport addLineItemIdsItem(String lineItemIdsItem) {
    if (this.lineItemIds == null) {
      this.lineItemIds = new ArrayList<>();
    }
    this.lineItemIds.add(lineItemIdsItem);
    return this;
  }

   /**
   * Line Item ids to filter
   * @return lineItemIds
  **/
  @javax.annotation.Nullable

  public List<String> getLineItemIds() {
    return lineItemIds;
  }


  public void setLineItemIds(List<String> lineItemIds) {
    this.lineItemIds = lineItemIds;
  }


  public SyncLineItemsReport metrics(List<MetricsEnum> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public SyncLineItemsReport addMetricsItem(MetricsEnum metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * List of metrics to report on
   * @return metrics
  **/
  @javax.annotation.Nullable

  public List<MetricsEnum> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  public SyncLineItemsReport reportType(ReportTypeEnum reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Type of report, if no dimensions/metrics are provided, falls back to summary reportType
   * @return reportType
  **/
  @javax.annotation.Nullable

  public ReportTypeEnum getReportType() {
    return reportType;
  }


  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  public SyncLineItemsReport salesChannel(SalesChannelEnum salesChannel) {
    
    this.salesChannel = salesChannel;
    return this;
  }

   /**
   * Filter on specific sales channel: offline or online
   * @return salesChannel
  **/
  @javax.annotation.Nullable

  public SalesChannelEnum getSalesChannel() {
    return salesChannel;
  }


  public void setSalesChannel(SalesChannelEnum salesChannel) {
    this.salesChannel = salesChannel;
  }


  public SyncLineItemsReport startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public SyncLineItemsReport timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Time zone : see criteo developer portal for supported time zones
   * @return timezone
  **/
  @javax.annotation.Nullable

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public SyncLineItemsReport viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * View attribution window
   * @return viewAttributionWindow
  **/
  @javax.annotation.Nullable

  public ViewAttributionWindowEnum getViewAttributionWindow() {
    return viewAttributionWindow;
  }


  public void setViewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
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
   * @return the SyncLineItemsReport instance itself
   */
  public SyncLineItemsReport putAdditionalProperty(String key, Object value) {
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
    SyncLineItemsReport syncLineItemsReport = (SyncLineItemsReport) o;
    return Objects.equals(this.accountId, syncLineItemsReport.accountId) &&
        Objects.equals(this.campaignIds, syncLineItemsReport.campaignIds) &&
        Objects.equals(this.campaignType, syncLineItemsReport.campaignType) &&
        Objects.equals(this.clickAttributionWindow, syncLineItemsReport.clickAttributionWindow) &&
        Objects.equals(this.dimensions, syncLineItemsReport.dimensions) &&
        Objects.equals(this.endDate, syncLineItemsReport.endDate) &&
        Objects.equals(this.lineItemIds, syncLineItemsReport.lineItemIds) &&
        Objects.equals(this.metrics, syncLineItemsReport.metrics) &&
        Objects.equals(this.reportType, syncLineItemsReport.reportType) &&
        Objects.equals(this.salesChannel, syncLineItemsReport.salesChannel) &&
        Objects.equals(this.startDate, syncLineItemsReport.startDate) &&
        Objects.equals(this.timezone, syncLineItemsReport.timezone) &&
        Objects.equals(this.viewAttributionWindow, syncLineItemsReport.viewAttributionWindow)&&
        Objects.equals(this.additionalProperties, syncLineItemsReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, campaignType, clickAttributionWindow, dimensions, endDate, lineItemIds, metrics, reportType, salesChannel, startDate, timezone, viewAttributionWindow, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncLineItemsReport {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    lineItemIds: ").append(toIndentedString(lineItemIds)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("campaignIds");
    openapiFields.add("campaignType");
    openapiFields.add("clickAttributionWindow");
    openapiFields.add("dimensions");
    openapiFields.add("endDate");
    openapiFields.add("lineItemIds");
    openapiFields.add("metrics");
    openapiFields.add("reportType");
    openapiFields.add("salesChannel");
    openapiFields.add("startDate");
    openapiFields.add("timezone");
    openapiFields.add("viewAttributionWindow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("startDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SyncLineItemsReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SyncLineItemsReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SyncLineItemsReport is not found in the empty JSON string", SyncLineItemsReport.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SyncLineItemsReport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("campaignIds") != null && !jsonObj.get("campaignIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignIds` to be an array in the JSON string but got `%s`", jsonObj.get("campaignIds").toString()));
      }
      if ((jsonObj.get("campaignType") != null && !jsonObj.get("campaignType").isJsonNull()) && !jsonObj.get("campaignType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignType").toString()));
      }
      if ((jsonObj.get("clickAttributionWindow") != null && !jsonObj.get("clickAttributionWindow").isJsonNull()) && !jsonObj.get("clickAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickAttributionWindow").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dimensions") != null && !jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("lineItemIds") != null && !jsonObj.get("lineItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("lineItemIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("metrics") != null && !jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      if ((jsonObj.get("reportType") != null && !jsonObj.get("reportType").isJsonNull()) && !jsonObj.get("reportType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportType").toString()));
      }
      if ((jsonObj.get("salesChannel") != null && !jsonObj.get("salesChannel").isJsonNull()) && !jsonObj.get("salesChannel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesChannel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salesChannel").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("viewAttributionWindow") != null && !jsonObj.get("viewAttributionWindow").isJsonNull()) && !jsonObj.get("viewAttributionWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewAttributionWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewAttributionWindow").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SyncLineItemsReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SyncLineItemsReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SyncLineItemsReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SyncLineItemsReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SyncLineItemsReport>() {
           @Override
           public void write(JsonWriter out, SyncLineItemsReport value) throws IOException {
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
           public SyncLineItemsReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SyncLineItemsReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SyncLineItemsReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SyncLineItemsReport
  * @throws IOException if the JSON string is invalid with respect to SyncLineItemsReport
  */
  public static SyncLineItemsReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SyncLineItemsReport.class);
  }

 /**
  * Convert an instance of SyncLineItemsReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

