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


package com.criteo.api.retailmedia.v2022_07.model;

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
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Model to update a retail media auction line item
 */
@ApiModel(description = "Model to update a retail media auction line item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAuctionLineItemUpdateModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    ACTIVE("active"),
    
    SCHEDULED("scheduled"),
    
    DRAFT("draft"),
    
    PAUSED("paused"),
    
    BUDGETHIT("budgetHit"),
    
    ENDED("ended"),
    
    ARCHIVED("archived"),
    
    NOFUNDS("noFunds");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  public static final String SERIALIZED_NAME_TARGET_BID = "targetBid";
  @SerializedName(SERIALIZED_NAME_TARGET_BID)
  private BigDecimal targetBid;

  public static final String SERIALIZED_NAME_MAX_BID = "maxBid";
  @SerializedName(SERIALIZED_NAME_MAX_BID)
  private BigDecimal maxBid;

  public static final String SERIALIZED_NAME_MONTHLY_PACING = "monthlyPacing";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PACING)
  private BigDecimal monthlyPacing;

  public static final String SERIALIZED_NAME_DAILY_PACING = "dailyPacing";
  @SerializedName(SERIALIZED_NAME_DAILY_PACING)
  private BigDecimal dailyPacing;

  public static final String SERIALIZED_NAME_IS_AUTO_DAILY_PACING = "isAutoDailyPacing";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_DAILY_PACING)
  private Boolean isAutoDailyPacing;

  /**
   * Gets or Sets bidStrategy
   */
  @JsonAdapter(BidStrategyEnum.Adapter.class)
  public enum BidStrategyEnum {
    UNKNOWN("unknown"),
    
    CONVERSION("conversion"),
    
    CLICKS("clicks"),
    
    REVENUE("revenue");

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
  private BidStrategyEnum bidStrategy = BidStrategyEnum.CONVERSION;


  public ExternalAuctionLineItemUpdateModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalAuctionLineItemUpdateModel startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the Date as a year, month, and day in the format YYYY-MM-DD")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ExternalAuctionLineItemUpdateModel endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the Date as a year, month, and day in the format YYYY-MM-DD")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalAuctionLineItemUpdateModel status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalAuctionLineItemUpdateModel budget(BigDecimal budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBudget() {
    return budget;
  }


  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }


  public ExternalAuctionLineItemUpdateModel targetBid(BigDecimal targetBid) {
    
    this.targetBid = targetBid;
    return this;
  }

   /**
   * Get targetBid
   * @return targetBid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getTargetBid() {
    return targetBid;
  }


  public void setTargetBid(BigDecimal targetBid) {
    this.targetBid = targetBid;
  }


  public ExternalAuctionLineItemUpdateModel maxBid(BigDecimal maxBid) {
    
    this.maxBid = maxBid;
    return this;
  }

   /**
   * Get maxBid
   * @return maxBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxBid() {
    return maxBid;
  }


  public void setMaxBid(BigDecimal maxBid) {
    this.maxBid = maxBid;
  }


  public ExternalAuctionLineItemUpdateModel monthlyPacing(BigDecimal monthlyPacing) {
    
    this.monthlyPacing = monthlyPacing;
    return this;
  }

   /**
   * Get monthlyPacing
   * @return monthlyPacing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMonthlyPacing() {
    return monthlyPacing;
  }


  public void setMonthlyPacing(BigDecimal monthlyPacing) {
    this.monthlyPacing = monthlyPacing;
  }


  public ExternalAuctionLineItemUpdateModel dailyPacing(BigDecimal dailyPacing) {
    
    this.dailyPacing = dailyPacing;
    return this;
  }

   /**
   * Get dailyPacing
   * @return dailyPacing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDailyPacing() {
    return dailyPacing;
  }


  public void setDailyPacing(BigDecimal dailyPacing) {
    this.dailyPacing = dailyPacing;
  }


  public ExternalAuctionLineItemUpdateModel isAutoDailyPacing(Boolean isAutoDailyPacing) {
    
    this.isAutoDailyPacing = isAutoDailyPacing;
    return this;
  }

   /**
   * Get isAutoDailyPacing
   * @return isAutoDailyPacing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAutoDailyPacing() {
    return isAutoDailyPacing;
  }


  public void setIsAutoDailyPacing(Boolean isAutoDailyPacing) {
    this.isAutoDailyPacing = isAutoDailyPacing;
  }


  public ExternalAuctionLineItemUpdateModel bidStrategy(BidStrategyEnum bidStrategy) {
    
    this.bidStrategy = bidStrategy;
    return this;
  }

   /**
   * Get bidStrategy
   * @return bidStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BidStrategyEnum getBidStrategy() {
    return bidStrategy;
  }


  public void setBidStrategy(BidStrategyEnum bidStrategy) {
    this.bidStrategy = bidStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAuctionLineItemUpdateModel externalAuctionLineItemUpdateModel = (ExternalAuctionLineItemUpdateModel) o;
    return Objects.equals(this.name, externalAuctionLineItemUpdateModel.name) &&
        Objects.equals(this.startDate, externalAuctionLineItemUpdateModel.startDate) &&
        Objects.equals(this.endDate, externalAuctionLineItemUpdateModel.endDate) &&
        Objects.equals(this.status, externalAuctionLineItemUpdateModel.status) &&
        Objects.equals(this.budget, externalAuctionLineItemUpdateModel.budget) &&
        Objects.equals(this.targetBid, externalAuctionLineItemUpdateModel.targetBid) &&
        Objects.equals(this.maxBid, externalAuctionLineItemUpdateModel.maxBid) &&
        Objects.equals(this.monthlyPacing, externalAuctionLineItemUpdateModel.monthlyPacing) &&
        Objects.equals(this.dailyPacing, externalAuctionLineItemUpdateModel.dailyPacing) &&
        Objects.equals(this.isAutoDailyPacing, externalAuctionLineItemUpdateModel.isAutoDailyPacing) &&
        Objects.equals(this.bidStrategy, externalAuctionLineItemUpdateModel.bidStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate, endDate, status, budget, targetBid, maxBid, monthlyPacing, dailyPacing, isAutoDailyPacing, bidStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAuctionLineItemUpdateModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    targetBid: ").append(toIndentedString(targetBid)).append("\n");
    sb.append("    maxBid: ").append(toIndentedString(maxBid)).append("\n");
    sb.append("    monthlyPacing: ").append(toIndentedString(monthlyPacing)).append("\n");
    sb.append("    dailyPacing: ").append(toIndentedString(dailyPacing)).append("\n");
    sb.append("    isAutoDailyPacing: ").append(toIndentedString(isAutoDailyPacing)).append("\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
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

