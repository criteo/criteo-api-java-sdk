/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_01.model;

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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Report Request Attributes
 */
@ApiModel(description = "Report Request Attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportRequestAttributes {
  /**
   * Defaults to value from campaign or one of \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;. If specified, viewAttributionWindow must also be specified
   */
  @JsonAdapter(ClickAttributionWindowEnum.Adapter.class)
  public enum ClickAttributionWindowEnum {
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
  private ClickAttributionWindowEnum clickAttributionWindow;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot;
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    CSV("csv"),
    
    JSON("json"),
    
    JSON_COMPACT("json-compact"),
    
    JSON_NEWLINE("json-newline");

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
  private FormatEnum format = FormatEnum.JSON;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids = null;

  /**
   * One of \&quot;summary\&quot;, \&quot;keyword\&quot;, \&quot;pageType\&quot;, \&quot;productCategory\&quot;, \&quot;product\&quot;, or \&quot;attributedTransactions\&quot;
   */
  @JsonAdapter(ReportTypeEnum.Adapter.class)
  public enum ReportTypeEnum {
    SUMMARY("summary"),
    
    KEYWORD("keyword"),
    
    PAGETYPE("pageType"),
    
    PRODUCTCATEGORY("productCategory"),
    
    PRODUCT("product"),
    
    ATTRIBUTEDTRANSACTIONS("attributedTransactions");

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

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  /**
   * Defaults to value from campaign or one of \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;. If specified, must be less than clickAttributionWindow, which must also be specified.
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
  private ViewAttributionWindowEnum viewAttributionWindow;


  public ReportRequestAttributes clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Defaults to value from campaign or one of \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;. If specified, viewAttributionWindow must also be specified
   * @return clickAttributionWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to value from campaign or one of \"7D\", \"14D\", or \"30D\". If specified, viewAttributionWindow must also be specified")

  public ClickAttributionWindowEnum getClickAttributionWindow() {
    return clickAttributionWindow;
  }


  public void setClickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }


  public ReportRequestAttributes endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * YYYY-MM-DD, must not be before startDate and not more than 100 days later
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "YYYY-MM-DD, must not be before startDate and not more than 100 days later")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ReportRequestAttributes format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot;
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of \"json\" (default),\"json-compact\",\"json-newline\" or \"csv\"")

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public ReportRequestAttributes id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the campaign or line item.  Either &#39;id&#39; or &#39;ids&#39; must be specified, but not both
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the campaign or line item.  Either 'id' or 'ids' must be specified, but not both")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ReportRequestAttributes ids(List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public ReportRequestAttributes addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The ids of the campaigns or line items.  Either &#39;id&#39; or &#39;ids&#39; must be specified, but not both
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the campaigns or line items.  Either 'id' or 'ids' must be specified, but not both")

  public List<String> getIds() {
    return ids;
  }


  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public ReportRequestAttributes reportType(ReportTypeEnum reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * One of \&quot;summary\&quot;, \&quot;keyword\&quot;, \&quot;pageType\&quot;, \&quot;productCategory\&quot;, \&quot;product\&quot;, or \&quot;attributedTransactions\&quot;
   * @return reportType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "One of \"summary\", \"keyword\", \"pageType\", \"productCategory\", \"product\", or \"attributedTransactions\"")

  public ReportTypeEnum getReportType() {
    return reportType;
  }


  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  public ReportRequestAttributes startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * YYYY-MM-DD
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "YYYY-MM-DD")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ReportRequestAttributes timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public ReportRequestAttributes viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Defaults to value from campaign or one of \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;. If specified, must be less than clickAttributionWindow, which must also be specified.
   * @return viewAttributionWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to value from campaign or one of \"none\", \"1D\", \"7D\", \"14D\", or \"30D\". If specified, must be less than clickAttributionWindow, which must also be specified.")

  public ViewAttributionWindowEnum getViewAttributionWindow() {
    return viewAttributionWindow;
  }


  public void setViewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRequestAttributes reportRequestAttributes = (ReportRequestAttributes) o;
    return Objects.equals(this.clickAttributionWindow, reportRequestAttributes.clickAttributionWindow) &&
        Objects.equals(this.endDate, reportRequestAttributes.endDate) &&
        Objects.equals(this.format, reportRequestAttributes.format) &&
        Objects.equals(this.id, reportRequestAttributes.id) &&
        Objects.equals(this.ids, reportRequestAttributes.ids) &&
        Objects.equals(this.reportType, reportRequestAttributes.reportType) &&
        Objects.equals(this.startDate, reportRequestAttributes.startDate) &&
        Objects.equals(this.timeZone, reportRequestAttributes.timeZone) &&
        Objects.equals(this.viewAttributionWindow, reportRequestAttributes.viewAttributionWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickAttributionWindow, endDate, format, id, ids, reportType, startDate, timeZone, viewAttributionWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRequestAttributes {\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
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

