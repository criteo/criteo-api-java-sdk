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
import com.criteo.api.marketingsolutions.v2021_10.model.NillableDateTime;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set schedule read model
 */
@ApiModel(description = "ad set schedule read model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadAdSetSchedule {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private NillableDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private NillableDateTime endDate;

  /**
   * Activation status of the ad set, i.e. whether the consumer wants it to deliver
   */
  @JsonAdapter(ActivationStatusEnum.Adapter.class)
  public enum ActivationStatusEnum {
    ON("on"),
    
    OFF("off");

    private String value;

    ActivationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActivationStatusEnum fromValue(String value) {
      for (ActivationStatusEnum b : ActivationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActivationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActivationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActivationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActivationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activationStatus";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private ActivationStatusEnum activationStatus;

  /**
   * Delivery status of the delivery of the ad set, i.e. whether the ad set is delivering
   */
  @JsonAdapter(DeliveryStatusEnum.Adapter.class)
  public enum DeliveryStatusEnum {
    DRAFT("draft"),
    
    INACTIVE("inactive"),
    
    LIVE("live"),
    
    NOTLIVE("notLive"),
    
    PAUSING("pausing"),
    
    PAUSED("paused"),
    
    SCHEDULED("scheduled"),
    
    ENDED("ended"),
    
    NOTDELIVERING("notDelivering"),
    
    ARCHIVED("archived");

    private String value;

    DeliveryStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryStatusEnum fromValue(String value) {
      for (DeliveryStatusEnum b : DeliveryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private DeliveryStatusEnum deliveryStatus;


  public ReadAdSetSchedule startDate(NillableDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(NillableDateTime startDate) {
    this.startDate = startDate;
  }


  public ReadAdSetSchedule endDate(NillableDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(NillableDateTime endDate) {
    this.endDate = endDate;
  }


  public ReadAdSetSchedule activationStatus(ActivationStatusEnum activationStatus) {
    
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * Activation status of the ad set, i.e. whether the consumer wants it to deliver
   * @return activationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Activation status of the ad set, i.e. whether the consumer wants it to deliver")

  public ActivationStatusEnum getActivationStatus() {
    return activationStatus;
  }


  public void setActivationStatus(ActivationStatusEnum activationStatus) {
    this.activationStatus = activationStatus;
  }


  public ReadAdSetSchedule deliveryStatus(DeliveryStatusEnum deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Delivery status of the delivery of the ad set, i.e. whether the ad set is delivering
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Delivery status of the delivery of the ad set, i.e. whether the ad set is delivering")

  public DeliveryStatusEnum getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadAdSetSchedule readAdSetSchedule = (ReadAdSetSchedule) o;
    return Objects.equals(this.startDate, readAdSetSchedule.startDate) &&
        Objects.equals(this.endDate, readAdSetSchedule.endDate) &&
        Objects.equals(this.activationStatus, readAdSetSchedule.activationStatus) &&
        Objects.equals(this.deliveryStatus, readAdSetSchedule.deliveryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, activationStatus, deliveryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadAdSetSchedule {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
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

