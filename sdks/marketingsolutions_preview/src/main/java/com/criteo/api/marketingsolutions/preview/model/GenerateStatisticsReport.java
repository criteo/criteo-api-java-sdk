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
 * Request attributes for async statistics report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenerateStatisticsReport {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = null;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    ADVERTISERID("AdvertiserId"),
    
    ADVERTISER("Advertiser"),
    
    CAMPAIGNID("CampaignId"),
    
    CAMPAIGN("Campaign"),
    
    ADSETID("AdSetId"),
    
    ADSET("AdSet"),
    
    CHANNELID("ChannelId"),
    
    CHANNEL("Channel"),
    
    CATEGORYID("CategoryId"),
    
    CATEGORY("Category"),
    
    DEVICE("Device"),
    
    OS("Os"),
    
    ADID("AdId"),
    
    AD("Ad"),
    
    COUPONID("CouponId"),
    
    COUPON("Coupon"),
    
    YEAR("Year"),
    
    MONTH("Month"),
    
    WEEK("Week"),
    
    DAY("Day"),
    
    HOUR("Hour"),
    
    MARKETINGCAMPAIGNGOAL("MarketingCampaignGoal"),
    
    MARKETINGOBJECTIVE("MarketingObjective"),
    
    MARKETINGOBJECTIVEID("MarketingObjectiveId"),
    
    VIDEOPLAYERSIZE("VideoPlayerSize"),
    
    VIDEOPLACEMENT("VideoPlacement"),
    
    VIDEOPLAYBACKMETHOD("VideoPlaybackMethod"),
    
    SSP("SSP"),
    
    VIDEODURATIONINSECONDS("VideoDurationInSeconds"),
    
    MEDIATYPE("MediaType"),
    
    ADFORMAT("AdFormat"),
    
    DISPLAYSIZE("DisplaySize"),
    
    VIDEOPLAYERRATIO("VideoPlayerRatio"),
    
    COUNTRY("Country"),
    
    REGION("Region"),
    
    POSTALCODE("PostalCode"),
    
    USERBEHAVIOR("UserBehavior"),
    
    ENVIRONMENT("Environment"),
    
    ADCHANNEL("AdChannel"),
    
    SOCIALPLATFORM("SocialPlatform");

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

  /**
   * Gets or Sets metrics
   */
  @JsonAdapter(MetricsEnum.Adapter.class)
  public enum MetricsEnum {
    CLICKS("Clicks"),
    
    DISPLAYS("Displays"),
    
    ADVERTISERCOST("AdvertiserCost"),
    
    SALESPC30DCLIENTATTRIBUTION("SalesPc30dClientAttribution"),
    
    SALESALLPC30DCLIENTATTRIBUTION("SalesAllPc30dClientAttribution"),
    
    SALESCLIENTATTRIBUTION("SalesClientAttribution"),
    
    SALESALLCLIENTATTRIBUTION("SalesAllClientAttribution"),
    
    SALESPC30D("SalesPc30d"),
    
    SALESALLPC30D("SalesAllPc30d"),
    
    SALESPC1D("SalesPc1d"),
    
    SALESALLPC1D("SalesAllPc1d"),
    
    SALESPC7D("SalesPc7d"),
    
    SALESALLPC7D("SalesAllPc7d"),
    
    SALESPC7DPV24("SalesPc7dPv24"),
    
    SALESALLPC7DPV24("SalesAllPc7dPv24"),
    
    SALESPC7DPV24H("SalesPc7dPv24h"),
    
    SALESALLPC7DPV24H("SalesAllPc7dPv24h"),
    
    SALESPV24H("SalesPv24h"),
    
    SALESALLPV24H("SalesAllPv24h"),
    
    SALESPC30PV24("SalesPc30Pv24"),
    
    SALESALLPC30PV24("SalesAllPc30Pv24"),
    
    SALESPC30DPV24H("SalesPc30dPv24h"),
    
    SALESALLPC30DPV24H("SalesAllPc30dPv24h"),
    
    SALESPIPC("SalesPiPc"),
    
    SALESPIPV("SalesPiPv"),
    
    SALESPIPCPV("SalesPiPcPv"),
    
    POSTINSTALLSALES("PostInstallSales"),
    
    SALESOFFLINEPC("SalesOfflinePc"),
    
    SALESOFFLINEPV("SalesOfflinePv"),
    
    SALESOFFLINEPC30D("SalesOfflinePc30d"),
    
    SALESOFFLINEPV24H("SalesOfflinePv24h"),
    
    REVENUEGENERATEDPC30DCLIENTATTRIBUTION("RevenueGeneratedPc30dClientAttribution"),
    
    REVENUEGENERATEDALLPC30DCLIENTATTRIBUTION("RevenueGeneratedAllPc30dClientAttribution"),
    
    REVENUEGENERATEDCLIENTATTRIBUTION("RevenueGeneratedClientAttribution"),
    
    REVENUEGENERATEDALLCLIENTATTRIBUTION("RevenueGeneratedAllClientAttribution"),
    
    REVENUEGENERATEDPC30D("RevenueGeneratedPc30d"),
    
    REVENUEGENERATEDALLPC30D("RevenueGeneratedAllPc30d"),
    
    REVENUEGENERATEDPC1D("RevenueGeneratedPc1d"),
    
    REVENUEGENERATEDALLPC1D("RevenueGeneratedAllPc1d"),
    
    REVENUEGENERATEDPC7D("RevenueGeneratedPc7d"),
    
    REVENUEGENERATEDALLPC7D("RevenueGeneratedAllPc7d"),
    
    REVENUEGENERATEDPV24H("RevenueGeneratedPv24h"),
    
    REVENUEGENERATEDALLPV24H("RevenueGeneratedAllPv24h"),
    
    REVENUEGENERATEDPC30PV24("RevenueGeneratedPc30Pv24"),
    
    REVENUEGENERATEDALLPC30PV24("RevenueGeneratedAllPc30Pv24"),
    
    REVENUEGENERATEDPC30DPV24H("RevenueGeneratedPc30dPv24h"),
    
    REVENUEGENERATEDALLPC30DPV24H("RevenueGeneratedAllPc30dPv24h"),
    
    REVENUEGENERATEDPC7DPV24H("RevenueGeneratedPc7dPv24h"),
    
    REVENUEGENERATEDALLPC7DPV24H("RevenueGeneratedAllPc7dPv24h"),
    
    REVENUEGENERATEDPC7DPV24("RevenueGeneratedPc7dPv24"),
    
    REVENUEGENERATEDALLPC7DPV24("RevenueGeneratedAllPc7dPv24"),
    
    REVENUEGENERATEDOFFLINEPC("RevenueGeneratedOfflinePc"),
    
    REVENUEGENERATEDOFFLINEPV("RevenueGeneratedOfflinePv"),
    
    REVENUEGENERATEDOFFLINEPC30D("RevenueGeneratedOfflinePc30d"),
    
    REVENUEGENERATEDOFFLINEPV24H("RevenueGeneratedOfflinePv24h"),
    
    CONVERSIONRATEPC30DCLIENTATTRIBUTION("ConversionRatePc30dClientAttribution"),
    
    CONVERSIONRATEALLPC30DCLIENTATTRIBUTION("ConversionRateAllPc30dClientAttribution"),
    
    CONVERSIONRATECLIENTATTRIBUTION("ConversionRateClientAttribution"),
    
    CONVERSIONRATEALLCLIENTATTRIBUTION("ConversionRateAllClientAttribution"),
    
    CONVERSIONRATEPC30D("ConversionRatePc30d"),
    
    CONVERSIONRATEALLPC30D("ConversionRateAllPc30d"),
    
    CONVERSIONRATEPC1D("ConversionRatePc1d"),
    
    CONVERSIONRATEALLPC1D("ConversionRateAllPc1d"),
    
    CONVERSIONRATEPC7D("ConversionRatePc7d"),
    
    CONVERSIONRATEALLPC7D("ConversionRateAllPc7d"),
    
    CONVERSIONRATEPV24H("ConversionRatePv24h"),
    
    CONVERSIONRATEALLPV24H("ConversionRateAllPv24h"),
    
    CONVERSIONRATEPC30PV24("ConversionRatePc30Pv24"),
    
    CONVERSIONRATEALLPC30PV24("ConversionRateAllPc30Pv24"),
    
    CONVERSIONRATEPC30DPV24H("ConversionRatePc30dPv24h"),
    
    CONVERSIONRATEALLPC30DPV24H("ConversionRateAllPc30dPv24h"),
    
    CONVERSIONRATEPC7DPV24("ConversionRatePc7dPv24"),
    
    CONVERSIONRATEALLPC7DPV24("ConversionRateAllPc7dPv24"),
    
    CONVERSIONRATEPC7DPV24H("ConversionRatePc7dPv24h"),
    
    CONVERSIONRATEALLPC7DPV24H("ConversionRateAllPc7dPv24h"),
    
    CONVERSIONRATEPIPCPV("ConversionRatePiPcPv"),
    
    POSTINSTALLCONVERSIONRATE("PostInstallConversionRate"),
    
    ECOSPC30DCLIENTATTRIBUTION("ECosPc30dClientAttribution"),
    
    ECOSALLPC30DCLIENTATTRIBUTION("ECosAllPc30dClientAttribution"),
    
    ECOSCLIENTATTRIBUTION("ECosClientAttribution"),
    
    ECOSALLCLIENTATTRIBUTION("ECosAllClientAttribution"),
    
    ECOSPC30D("ECosPc30d"),
    
    ECOSALLPC30D("ECosAllPc30d"),
    
    ECOSPC1D("ECosPc1d"),
    
    ECOSALLPC1D("ECosAllPc1d"),
    
    ECOSPC7D("ECosPc7d"),
    
    ECOSALLPC7D("ECosAllPc7d"),
    
    ECOSPV24H("ECosPv24h"),
    
    ECOSALLPV24H("ECosAllPv24h"),
    
    ECOSPC30PV24("ECosPc30Pv24"),
    
    ECOSALLPC30PV24("ECosAllPc30Pv24"),
    
    ECOSPC30DPV24H("ECosPc30dPv24h"),
    
    ECOSALLPC30DPV24H("ECosAllPc30dPv24h"),
    
    ECOSPC7DPV24H("ECosPc7dPv24h"),
    
    ECOSALLPC7DPV24H("ECosAllPc7dPv24h"),
    
    ECOSPC7DPV24("ECosPc7dPv24"),
    
    ECOSALLPC7DPV24("ECosAllPc7dPv24"),
    
    COSTPERORDERPC30DCLIENTATTRIBUTION("CostPerOrderPc30dClientAttribution"),
    
    COSTPERORDERALLPC30DCLIENTATTRIBUTION("CostPerOrderAllPc30dClientAttribution"),
    
    COSTPERORDERCLIENTATTRIBUTION("CostPerOrderClientAttribution"),
    
    COSTPERORDERALLCLIENTATTRIBUTION("CostPerOrderAllClientAttribution"),
    
    COSTPERORDERPC30D("CostPerOrderPc30d"),
    
    COSTPERORDERALLPC30D("CostPerOrderAllPc30d"),
    
    COSTPERORDERPC1D("CostPerOrderPc1d"),
    
    COSTPERORDERALLPC1D("CostPerOrderAllPc1d"),
    
    COSTPERORDERPC7D("CostPerOrderPc7d"),
    
    COSTPERORDERALLPC7D("CostPerOrderAllPc7d"),
    
    COSTPERORDERPV24H("CostPerOrderPv24h"),
    
    COSTPERORDERALLPV24H("CostPerOrderAllPv24h"),
    
    COSTPERORDERPC30PV24("CostPerOrderPc30Pv24"),
    
    COSTPERORDERALLPC30PV24("CostPerOrderAllPc30Pv24"),
    
    COSTPERORDERPC30DPV24H("CostPerOrderPc30dPv24h"),
    
    COSTPERORDERALLPC30DPV24H("CostPerOrderAllPc30dPv24h"),
    
    COSTPERORDERPC7DPV24H("CostPerOrderPc7dPv24h"),
    
    COSTPERORDERALLPC7DPV24H("CostPerOrderAllPc7dPv24h"),
    
    COSTPERORDERPC7DPV24("CostPerOrderPc7dPv24"),
    
    COSTPERORDERALLPC7DPV24("CostPerOrderAllPc7dPv24"),
    
    EXPOSEDUSERS("ExposedUsers"),
    
    AUDIENCE("Audience"),
    
    REACH("Reach"),
    
    AVERAGECARTPC30DCLIENTATTRIBUTION("AverageCartPc30dClientAttribution"),
    
    AVERAGECARTALLPC30DCLIENTATTRIBUTION("AverageCartAllPc30dClientAttribution"),
    
    AVERAGECARTCLIENTATTRIBUTION("AverageCartClientAttribution"),
    
    AVERAGECARTALLCLIENTATTRIBUTION("AverageCartAllClientAttribution"),
    
    AVERAGECARTPC30D("AverageCartPc30d"),
    
    AVERAGECARTALLPC30D("AverageCartAllPc30d"),
    
    AVERAGECARTPV24H("AverageCartPv24h"),
    
    AVERAGECARTALLPV24H("AverageCartAllPv24h"),
    
    AVERAGECARTPC1D("AverageCartPc1d"),
    
    AVERAGECARTALLPC1D("AverageCartAllPc1d"),
    
    AVERAGECARTPC7D("AverageCartPc7d"),
    
    AVERAGECARTALLPC7D("AverageCartAllPc7d"),
    
    AVERAGECARTPC30PV24("AverageCartPc30Pv24"),
    
    AVERAGECARTALLPC30PV24("AverageCartAllPc30Pv24"),
    
    AVERAGECARTPC30DPV24H("AverageCartPc30dPv24h"),
    
    AVERAGECARTALLPC30DPV24H("AverageCartAllPc30dPv24h"),
    
    AVERAGECARTPC7DPV24H("AverageCartPc7dPv24h"),
    
    AVERAGECARTALLPC7DPV24H("AverageCartAllPc7dPv24h"),
    
    AVERAGECARTPC7DPV24("AverageCartPc7dPv24"),
    
    AVERAGECARTALLPC7DPV24("AverageCartAllPc7dPv24"),
    
    CLICKTHROUGHRATE("ClickThroughRate"),
    
    ECPC("ECpc"),
    
    CPC("Cpc"),
    
    ECPM("ECpm"),
    
    RETURNONADVERTISINGSPENDINGCLIENTATTRIBUTION("ReturnOnAdvertisingSpendingClientAttribution"),
    
    RETURNONADVERTISINGSPENDINGALLCLIENTATTRIBUTION("ReturnOnAdvertisingSpendingAllClientAttribution"),
    
    ADVERTISERVALUE("AdvertiserValue"),
    
    ADVERTISERALLVALUE("AdvertiserAllValue"),
    
    COSTOFADVERTISERVALUE("CostOfAdvertiserValue"),
    
    COSTOFADVERTISERVALUEALL("CostOfAdvertiserValueAll"),
    
    APPINSTALLSPCPV("AppInstallsPcPv"),
    
    APPINSTALLS("AppInstalls"),
    
    QUALIFIEDVISITS("QualifiedVisits"),
    
    VISITS("Visits"),
    
    ORDERVALUEPI("OrderValuePi"),
    
    POSTINSTALLORDERVALUE("PostInstallOrderValue"),
    
    BOUNCERATE("BounceRate"),
    
    COSTPERINSTALLPCPV("CostPerInstallPcPv"),
    
    COSTPERINSTALL("CostPerInstall"),
    
    COSTPERVISIT("CostPerVisit"),
    
    INSTALLRATEPCPV("InstallRatePcPv"),
    
    INSTALLRATE("InstallRate"),
    
    OMNICHANNELROASPC30D("OmniChannelRoasPc30d"),
    
    OMNICHANNELROASALLPC30D("OmnichannelRoasAllPc30d"),
    
    OMNICHANNELREVENUEPC30D("OmniChannelRevenuePc30d"),
    
    OMNICHANNELREVENUEALLPC30D("OmnichannelRevenueAllPc30d"),
    
    OMNICHANNELSALESPC30D("OmniChannelSalesPc30d"),
    
    OMNICHANNELSALESALLPC30D("OmnichannelSalesAllPc30d"),
    
    OMNICHANNELROASALLPV24H("OmnichannelRoasAllPv24h"),
    
    OMNICHANNELROASPV24H("OmnichannelRoasPv24h"),
    
    OMNICHANNELREVENUEALLPV24H("OmnichannelRevenueAllPv24h"),
    
    OMNICHANNELREVENUEPV24H("OmnichannelRevenuePv24h"),
    
    OMNICHANNELSALESALLPV24H("OmnichannelSalesAllPv24h"),
    
    OMNICHANNELSALESPV24H("OmnichannelSalesPv24h"),
    
    OMNICHANNELROASCLIENTATTRIBUTION("OmnichannelRoasClientAttribution"),
    
    OMNICHANNELREVENUECLIENTATTRIBUTION("OmnichannelRevenueClientAttribution"),
    
    OMNICHANNELSALESCLIENTATTRIBUTION("OmnichannelSalesClientAttribution"),
    
    ROASALLPC30DCLIENTATTRIBUTION("RoasAllPc30dClientAttribution"),
    
    ROASPC30DCLIENTATTRIBUTION("RoasPc30dClientAttribution"),
    
    ROASALLCLIENTATTRIBUTION("RoasAllClientAttribution"),
    
    ROASCLIENTATTRIBUTION("RoasClientAttribution"),
    
    ROASALLPC30D("RoasAllPc30d"),
    
    ROASPC30D("RoasPc30d"),
    
    ROASALLPC7D("RoasAllPc7d"),
    
    ROASPC7D("RoasPc7d"),
    
    ROASALLPC1D("RoasAllPc1d"),
    
    ROASPC1D("RoasPc1d"),
    
    ROASALLPV24H("RoasAllPv24h"),
    
    ROASPV24H("RoasPv24h"),
    
    ROASPC30PV24("RoasPc30Pv24"),
    
    ROASALLPC30PV24("RoasAllPc30Pv24"),
    
    ROASPC30DPV24H("RoasPc30dPv24h"),
    
    ROASALLPC30DPV24H("RoasAllPc30dPv24h"),
    
    ROASPC7DPV24("RoasPc7dPv24"),
    
    ROASALLPC7DPV24("RoasAllPc7dPv24"),
    
    ROASPC7DPV24H("RoasPc7dPv24h"),
    
    ROASALLPC7DPV24H("RoasAllPc7dPv24h"),
    
    COSTOFSALEPI("CostOfSalePi"),
    
    COSTPERORDERPI("CostPerOrderPi"),
    
    POSTINSTALLCOSTOFSALE("PostInstallCostOfSale"),
    
    POSTINSTALLCOSTPERORDER("PostInstallCostPerOrder"),
    
    RETURNONADVERTISERSPENDINGPI("ReturnOnAdvertiserSpendingPi"),
    
    POSTINSTALLROAS("PostInstallRoas"),
    
    RETURNONADVERTISERSPENDINGOFFLINEPC("ReturnOnAdvertiserSpendingOfflinePc"),
    
    RETURNONADVERTISERSPENDINGOFFLINEPV("ReturnOnAdvertiserSpendingOfflinePv"),
    
    ROASOFFLINEPC30D("RoasOfflinePc30d"),
    
    ROASOFFLINEPV24H("RoasOfflinePv24h"),
    
    POTENTIALDISPLAYS("PotentialDisplays"),
    
    OVERALLCOMPETITIONWIN("OverallCompetitionWin"),
    
    VIEWABLEDISPLAYS("ViewableDisplays"),
    
    NONVIEWABLEDISPLAYS("NonViewableDisplays"),
    
    UNTRACKABLEDISPLAYS("UntrackableDisplays"),
    
    FREQUENCY("Frequency"),
    
    INVALIDCLICKS("InvalidClicks"),
    
    INVALIDDISPLAYS("InvalidDisplays"),
    
    RESULTTYPE("ResultType"),
    
    COSTPERQUALIFIEDVISIT("CostPerQualifiedVisit"),
    
    COSTPERVISITPV1D("CostPerVisitPV1D"),
    
    VISITSPV1D("VisitsPV1D"),
    
    ASSISTSPC30DCLIENTATTRIBUTION("AssistsPc30dClientAttribution"),
    
    ASSISTSALLPC30DCLIENTATTRIBUTION("AssistsAllPc30dClientAttribution"),
    
    ASSISTSCLIENTATTRIBUTION("AssistsClientAttribution"),
    
    ASSISTSALLCLIENTATTRIBUTION("AssistsAllClientAttribution"),
    
    ASSISTSPC30D("AssistsPc30d"),
    
    ASSISTSALLPC30D("AssistsAllPc30d"),
    
    ASSISTSPC1D("AssistsPc1d"),
    
    ASSISTSALLPC1D("AssistsAllPc1d"),
    
    ASSISTSPC7D("AssistsPc7d"),
    
    ASSISTSALLPC7D("AssistsAllPc7d"),
    
    ASSISTSPC7DPV24("AssistsPc7dPv24"),
    
    ASSISTSALLPC7DPV24("AssistsAllPc7dPv24"),
    
    ASSISTSPC7DPV24H("AssistsPc7dPv24h"),
    
    ASSISTSALLPC7DPV24H("AssistsAllPc7dPv24h"),
    
    ASSISTSPV24H("AssistsPv24h"),
    
    ASSISTSALLPV24H("AssistsAllPv24h"),
    
    ASSISTSPC30PV24("AssistsPc30Pv24"),
    
    ASSISTSALLPC30PV24("AssistsAllPc30Pv24"),
    
    ASSISTSPC30DPV24H("AssistsPc30dPv24h"),
    
    ASSISTSALLPC30DPV24H("AssistsAllPc30dPv24h"),
    
    ASSISTSPIPC("AssistsPiPc"),
    
    ASSISTSPIPV("AssistsPiPv"),
    
    ASSISTSPIPCPV("AssistsPiPcPv"),
    
    ASSISTSSALESRATIOPC30DCLIENTATTRIBUTION("AssistsSalesRatioPc30dClientAttribution"),
    
    ASSISTSSALESRATIOALLPC30DCLIENTATTRIBUTION("AssistsSalesRatioAllPc30dClientAttribution"),
    
    ASSISTSSALESRATIOCLIENTATTRIBUTION("AssistsSalesRatioClientAttribution"),
    
    ASSISTSSALESRATIOALLCLIENTATTRIBUTION("AssistsSalesRatioAllClientAttribution"),
    
    ASSISTSSALESRATIOPC30D("AssistsSalesRatioPc30d"),
    
    ASSISTSSALESRATIOALLPC30D("AssistsSalesRatioAllPc30d"),
    
    ASSISTSSALESRATIOPC1D("AssistsSalesRatioPc1d"),
    
    ASSISTSSALESRATIOALLPC1D("AssistsSalesRatioAllPc1d"),
    
    ASSISTSSALESRATIOPC7D("AssistsSalesRatioPc7d"),
    
    ASSISTSSALESRATIOALLPC7D("AssistsSalesRatioAllPc7d"),
    
    ASSISTSSALESRATIOPC7DPV24("AssistsSalesRatioPc7dPv24"),
    
    ASSISTSSALESRATIOALLPC7DPV24("AssistsSalesRatioAllPc7dPv24"),
    
    ASSISTSSALESRATIOPC7DPV24H("AssistsSalesRatioPc7dPv24h"),
    
    ASSISTSSALESRATIOALLPC7DPV24H("AssistsSalesRatioAllPc7dPv24h"),
    
    ASSISTSSALESRATIOPV24H("AssistsSalesRatioPv24h"),
    
    ASSISTSSALESRATIOALLPV24H("AssistsSalesRatioAllPv24h"),
    
    ASSISTSSALESRATIOPC30PV24("AssistsSalesRatioPc30Pv24"),
    
    ASSISTSSALESRATIOALLPC30PV24("AssistsSalesRatioAllPc30Pv24"),
    
    ASSISTSSALESRATIOPC30DPV24H("AssistsSalesRatioPc30dPv24h"),
    
    ASSISTSSALESRATIOALLPC30DPV24H("AssistsSalesRatioAllPc30dPv24h"),
    
    ASSISTSSALESRATIOPIPC("AssistsSalesRatioPiPc"),
    
    ASSISTSSALESRATIOPIPV("AssistsSalesRatioPiPv"),
    
    ASSISTSSALESRATIOPIPCPV("AssistsSalesRatioPiPcPv");

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

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_AD_SET_IDS = "adSetIds";
  @SerializedName(SERIALIZED_NAME_AD_SET_IDS)
  private List<String> adSetIds = null;

  public static final String SERIALIZED_NAME_AD_SET_NAMES = "adSetNames";
  @SerializedName(SERIALIZED_NAME_AD_SET_NAMES)
  private List<String> adSetNames = null;

  public static final String SERIALIZED_NAME_AD_SET_STATUS = "adSetStatus";
  @SerializedName(SERIALIZED_NAME_AD_SET_STATUS)
  private List<String> adSetStatus = null;

  public GenerateStatisticsReport() {
  }

  public GenerateStatisticsReport startDate(OffsetDateTime startDate) {
    
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


  public GenerateStatisticsReport endDate(OffsetDateTime endDate) {
    
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


  public GenerateStatisticsReport advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public GenerateStatisticsReport addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = null;
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * The list of advertiser ids
   * @return advertiserIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public GenerateStatisticsReport timezone(String timezone) {
    
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


  public GenerateStatisticsReport dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public GenerateStatisticsReport addDimensionsItem(DimensionsEnum dimensionsItem) {
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


  public GenerateStatisticsReport metrics(List<MetricsEnum> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public GenerateStatisticsReport addMetricsItem(MetricsEnum metricsItem) {
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


  public GenerateStatisticsReport currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for the report. ISO 4217 code (three-letter capitals).
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public GenerateStatisticsReport adSetIds(List<String> adSetIds) {
    
    this.adSetIds = adSetIds;
    return this;
  }

  public GenerateStatisticsReport addAdSetIdsItem(String adSetIdsItem) {
    if (this.adSetIds == null) {
      this.adSetIds = null;
    }
    this.adSetIds.add(adSetIdsItem);
    return this;
  }

   /**
   * The list of adSets ids. If empty, all the adSets will be fetched
   * @return adSetIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetIds() {
    return adSetIds;
  }


  public void setAdSetIds(List<String> adSetIds) {
    this.adSetIds = adSetIds;
  }


  public GenerateStatisticsReport adSetNames(List<String> adSetNames) {
    
    this.adSetNames = adSetNames;
    return this;
  }

  public GenerateStatisticsReport addAdSetNamesItem(String adSetNamesItem) {
    if (this.adSetNames == null) {
      this.adSetNames = null;
    }
    this.adSetNames.add(adSetNamesItem);
    return this;
  }

   /**
   * The list of adSets names. If empty, all the adSets will be fetched
   * @return adSetNames
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetNames() {
    return adSetNames;
  }


  public void setAdSetNames(List<String> adSetNames) {
    this.adSetNames = adSetNames;
  }


  public GenerateStatisticsReport adSetStatus(List<String> adSetStatus) {
    
    this.adSetStatus = adSetStatus;
    return this;
  }

  public GenerateStatisticsReport addAdSetStatusItem(String adSetStatusItem) {
    if (this.adSetStatus == null) {
      this.adSetStatus = null;
    }
    this.adSetStatus.add(adSetStatusItem);
    return this;
  }

   /**
   * The list of adSets status. If empty, all the adSets will be fetched
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
    GenerateStatisticsReport generateStatisticsReport = (GenerateStatisticsReport) o;
    return Objects.equals(this.startDate, generateStatisticsReport.startDate) &&
        Objects.equals(this.endDate, generateStatisticsReport.endDate) &&
        Objects.equals(this.advertiserIds, generateStatisticsReport.advertiserIds) &&
        Objects.equals(this.timezone, generateStatisticsReport.timezone) &&
        Objects.equals(this.dimensions, generateStatisticsReport.dimensions) &&
        Objects.equals(this.metrics, generateStatisticsReport.metrics) &&
        Objects.equals(this.currency, generateStatisticsReport.currency) &&
        Objects.equals(this.adSetIds, generateStatisticsReport.adSetIds) &&
        Objects.equals(this.adSetNames, generateStatisticsReport.adSetNames) &&
        Objects.equals(this.adSetStatus, generateStatisticsReport.adSetStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, advertiserIds, timezone, dimensions, metrics, currency, adSetIds, adSetNames, adSetStatus);
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
    sb.append("class GenerateStatisticsReport {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    adSetIds: ").append(toIndentedString(adSetIds)).append("\n");
    sb.append("    adSetNames: ").append(toIndentedString(adSetNames)).append("\n");
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
    openapiFields.add("timezone");
    openapiFields.add("dimensions");
    openapiFields.add("metrics");
    openapiFields.add("currency");
    openapiFields.add("adSetIds");
    openapiFields.add("adSetNames");
    openapiFields.add("adSetStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("dimensions");
    openapiRequiredFields.add("metrics");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateStatisticsReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenerateStatisticsReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateStatisticsReport is not found in the empty JSON string", GenerateStatisticsReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenerateStatisticsReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateStatisticsReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateStatisticsReport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("advertiserIds") != null && !jsonObj.get("advertiserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserIds` to be an array in the JSON string but got `%s`", jsonObj.get("advertiserIds").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
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
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetIds") != null && !jsonObj.get("adSetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetIds` to be an array in the JSON string but got `%s`", jsonObj.get("adSetIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetNames") != null && !jsonObj.get("adSetNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetNames` to be an array in the JSON string but got `%s`", jsonObj.get("adSetNames").toString()));
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
       if (!GenerateStatisticsReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateStatisticsReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateStatisticsReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateStatisticsReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateStatisticsReport>() {
           @Override
           public void write(JsonWriter out, GenerateStatisticsReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateStatisticsReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateStatisticsReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateStatisticsReport
  * @throws IOException if the JSON string is invalid with respect to GenerateStatisticsReport
  */
  public static GenerateStatisticsReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateStatisticsReport.class);
  }

 /**
  * Convert an instance of GenerateStatisticsReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

