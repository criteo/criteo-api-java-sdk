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


package com.criteo.api.marketingsolutions.v2022_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2022_01.model.NillableDecimal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set bidding read model
 */
@ApiModel(description = "ad set bidding read model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadAdSetBidding {
  public static final String SERIALIZED_NAME_BID_AMOUNT = "bidAmount";
  @SerializedName(SERIALIZED_NAME_BID_AMOUNT)
  private NillableDecimal bidAmount;

  /**
   * The intended optimization for the Ad Set
   */
  @JsonAdapter(BidStrategyEnum.Adapter.class)
  public enum BidStrategyEnum {
    ACTIONS("actions"),
    
    CLICKS("clicks"),
    
    CONVERSIONS("conversions"),
    
    DISPLAYS("displays"),
    
    INSTALLS("installs"),
    
    REVENUE("revenue"),
    
    STORECONVERSIONS("storeConversions"),
    
    VALUE("value"),
    
    VIEWEDIMPRESSIONS("viewedImpressions"),
    
    VISITS("Visits"),
    
    COMPLETEDVIDEOVIEWS("completedVideoViews");

    private String value;

    BidStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BidStrategyEnum fromValue(String value) {
      for (BidStrategyEnum b : BidStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BidStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BidStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BidStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BidStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BID_STRATEGY = "bidStrategy";
  @SerializedName(SERIALIZED_NAME_BID_STRATEGY)
  private BidStrategyEnum bidStrategy;

  /**
   * How is spend controlled
   */
  @JsonAdapter(CostControllerEnum.Adapter.class)
  public enum CostControllerEnum {
    COS("COS"),
    
    CPC("CPC"),
    
    CPI("CPI"),
    
    CPM("CPM"),
    
    CPO("CPO"),
    
    CPSV("CPSV"),
    
    CPV("CPV"),
    
    DAILYBUDGET("dailyBudget");

    private String value;

    CostControllerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CostControllerEnum fromValue(String value) {
      for (CostControllerEnum b : CostControllerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CostControllerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CostControllerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CostControllerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CostControllerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COST_CONTROLLER = "costController";
  @SerializedName(SERIALIZED_NAME_COST_CONTROLLER)
  private CostControllerEnum costController;


  public ReadAdSetBidding bidAmount(NillableDecimal bidAmount) {
    
    this.bidAmount = bidAmount;
    return this;
  }

   /**
   * Get bidAmount
   * @return bidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableDecimal getBidAmount() {
    return bidAmount;
  }


  public void setBidAmount(NillableDecimal bidAmount) {
    this.bidAmount = bidAmount;
  }


  public ReadAdSetBidding bidStrategy(BidStrategyEnum bidStrategy) {
    
    this.bidStrategy = bidStrategy;
    return this;
  }

   /**
   * The intended optimization for the Ad Set
   * @return bidStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The intended optimization for the Ad Set")

  public BidStrategyEnum getBidStrategy() {
    return bidStrategy;
  }


  public void setBidStrategy(BidStrategyEnum bidStrategy) {
    this.bidStrategy = bidStrategy;
  }


  public ReadAdSetBidding costController(CostControllerEnum costController) {
    
    this.costController = costController;
    return this;
  }

   /**
   * How is spend controlled
   * @return costController
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How is spend controlled")

  public CostControllerEnum getCostController() {
    return costController;
  }


  public void setCostController(CostControllerEnum costController) {
    this.costController = costController;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadAdSetBidding readAdSetBidding = (ReadAdSetBidding) o;
    return Objects.equals(this.bidAmount, readAdSetBidding.bidAmount) &&
        Objects.equals(this.bidStrategy, readAdSetBidding.bidStrategy) &&
        Objects.equals(this.costController, readAdSetBidding.costController);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidAmount, bidStrategy, costController);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadAdSetBidding {\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
    sb.append("    costController: ").append(toIndentedString(costController)).append("\n");
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

