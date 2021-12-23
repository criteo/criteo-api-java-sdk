/*
 * Criteo API
 * Criteo publicly exposed API
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
import com.criteo.api.marketingsolutions.preview.model.AdSetTargeting;
import com.criteo.api.marketingsolutions.preview.model.ReadAdSetBidding;
import com.criteo.api.marketingsolutions.preview.model.ReadAdSetBudget;
import com.criteo.api.marketingsolutions.preview.model.ReadAdSetSchedule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set read model
 */
@ApiModel(description = "ad set read model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadAdSet {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  /**
   * The environment that an ad click will lead a user to
   */
  @JsonAdapter(DestinationEnvironmentEnum.Adapter.class)
  public enum DestinationEnvironmentEnum {
    UNDEFINED("undefined"),
    
    WEB("web"),
    
    APP("app");

    private String value;

    DestinationEnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationEnvironmentEnum fromValue(String value) {
      for (DestinationEnvironmentEnum b : DestinationEnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationEnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationEnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationEnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationEnvironmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_ENVIRONMENT = "destinationEnvironment";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ENVIRONMENT)
  private DestinationEnvironmentEnum destinationEnvironment;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private ReadAdSetSchedule schedule;

  public static final String SERIALIZED_NAME_BIDDING = "bidding";
  @SerializedName(SERIALIZED_NAME_BIDDING)
  private ReadAdSetBidding bidding;

  public static final String SERIALIZED_NAME_TARGETING = "targeting";
  @SerializedName(SERIALIZED_NAME_TARGETING)
  private AdSetTargeting targeting;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private ReadAdSetBudget budget;


  public ReadAdSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the ad set
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the ad set")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReadAdSet advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser id of the campaign this ad set belongs to
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Advertiser id of the campaign this ad set belongs to")

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ReadAdSet datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Dataset id of this ad set
   * @return datasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dataset id of this ad set")

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public ReadAdSet campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign id this ad set belongs to
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Campaign id this ad set belongs to")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ReadAdSet destinationEnvironment(DestinationEnvironmentEnum destinationEnvironment) {
    
    this.destinationEnvironment = destinationEnvironment;
    return this;
  }

   /**
   * The environment that an ad click will lead a user to
   * @return destinationEnvironment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The environment that an ad click will lead a user to")

  public DestinationEnvironmentEnum getDestinationEnvironment() {
    return destinationEnvironment;
  }


  public void setDestinationEnvironment(DestinationEnvironmentEnum destinationEnvironment) {
    this.destinationEnvironment = destinationEnvironment;
  }


  public ReadAdSet schedule(ReadAdSetSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadAdSetSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(ReadAdSetSchedule schedule) {
    this.schedule = schedule;
  }


  public ReadAdSet bidding(ReadAdSetBidding bidding) {
    
    this.bidding = bidding;
    return this;
  }

   /**
   * Get bidding
   * @return bidding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadAdSetBidding getBidding() {
    return bidding;
  }


  public void setBidding(ReadAdSetBidding bidding) {
    this.bidding = bidding;
  }


  public ReadAdSet targeting(AdSetTargeting targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdSetTargeting getTargeting() {
    return targeting;
  }


  public void setTargeting(AdSetTargeting targeting) {
    this.targeting = targeting;
  }


  public ReadAdSet budget(ReadAdSetBudget budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadAdSetBudget getBudget() {
    return budget;
  }


  public void setBudget(ReadAdSetBudget budget) {
    this.budget = budget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadAdSet readAdSet = (ReadAdSet) o;
    return Objects.equals(this.name, readAdSet.name) &&
        Objects.equals(this.advertiserId, readAdSet.advertiserId) &&
        Objects.equals(this.datasetId, readAdSet.datasetId) &&
        Objects.equals(this.campaignId, readAdSet.campaignId) &&
        Objects.equals(this.destinationEnvironment, readAdSet.destinationEnvironment) &&
        Objects.equals(this.schedule, readAdSet.schedule) &&
        Objects.equals(this.bidding, readAdSet.bidding) &&
        Objects.equals(this.targeting, readAdSet.targeting) &&
        Objects.equals(this.budget, readAdSet.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, advertiserId, datasetId, campaignId, destinationEnvironment, schedule, bidding, targeting, budget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadAdSet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    destinationEnvironment: ").append(toIndentedString(destinationEnvironment)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    bidding: ").append(toIndentedString(bidding)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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

