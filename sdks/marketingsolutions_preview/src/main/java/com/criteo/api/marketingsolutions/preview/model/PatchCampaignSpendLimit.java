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
import com.criteo.api.marketingsolutions.preview.model.NillableDecimal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * campaign spend limit model
 */
@ApiModel(description = "campaign spend limit model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchCampaignSpendLimit {
  /**
   * Whether your spend limit is capped or not
   */
  @JsonAdapter(SpendLimitTypeEnum.Adapter.class)
  public enum SpendLimitTypeEnum {
    CAPPED("capped"),
    
    UNCAPPED("uncapped");

    private String value;

    SpendLimitTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendLimitTypeEnum fromValue(String value) {
      for (SpendLimitTypeEnum b : SpendLimitTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpendLimitTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendLimitTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendLimitTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendLimitTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_LIMIT_TYPE = "spendLimitType";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_TYPE)
  private SpendLimitTypeEnum spendLimitType;

  /**
   * The pace of the spend limit renewal
   */
  @JsonAdapter(SpendLimitRenewalEnum.Adapter.class)
  public enum SpendLimitRenewalEnum {
    UNDEFINED("undefined"),
    
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    LIFETIME("lifetime");

    private String value;

    SpendLimitRenewalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendLimitRenewalEnum fromValue(String value) {
      for (SpendLimitRenewalEnum b : SpendLimitRenewalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpendLimitRenewalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendLimitRenewalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendLimitRenewalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendLimitRenewalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_LIMIT_RENEWAL = "spendLimitRenewal";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_RENEWAL)
  private SpendLimitRenewalEnum spendLimitRenewal;

  public static final String SERIALIZED_NAME_SPEND_LIMIT_AMOUNT = "spendLimitAmount";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_AMOUNT)
  private NillableDecimal spendLimitAmount;


  public PatchCampaignSpendLimit spendLimitType(SpendLimitTypeEnum spendLimitType) {
    
    this.spendLimitType = spendLimitType;
    return this;
  }

   /**
   * Whether your spend limit is capped or not
   * @return spendLimitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether your spend limit is capped or not")

  public SpendLimitTypeEnum getSpendLimitType() {
    return spendLimitType;
  }


  public void setSpendLimitType(SpendLimitTypeEnum spendLimitType) {
    this.spendLimitType = spendLimitType;
  }


  public PatchCampaignSpendLimit spendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    
    this.spendLimitRenewal = spendLimitRenewal;
    return this;
  }

   /**
   * The pace of the spend limit renewal
   * @return spendLimitRenewal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pace of the spend limit renewal")

  public SpendLimitRenewalEnum getSpendLimitRenewal() {
    return spendLimitRenewal;
  }


  public void setSpendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    this.spendLimitRenewal = spendLimitRenewal;
  }


  public PatchCampaignSpendLimit spendLimitAmount(NillableDecimal spendLimitAmount) {
    
    this.spendLimitAmount = spendLimitAmount;
    return this;
  }

   /**
   * Get spendLimitAmount
   * @return spendLimitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableDecimal getSpendLimitAmount() {
    return spendLimitAmount;
  }


  public void setSpendLimitAmount(NillableDecimal spendLimitAmount) {
    this.spendLimitAmount = spendLimitAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCampaignSpendLimit patchCampaignSpendLimit = (PatchCampaignSpendLimit) o;
    return Objects.equals(this.spendLimitType, patchCampaignSpendLimit.spendLimitType) &&
        Objects.equals(this.spendLimitRenewal, patchCampaignSpendLimit.spendLimitRenewal) &&
        Objects.equals(this.spendLimitAmount, patchCampaignSpendLimit.spendLimitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendLimitType, spendLimitRenewal, spendLimitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCampaignSpendLimit {\n");
    sb.append("    spendLimitType: ").append(toIndentedString(spendLimitType)).append("\n");
    sb.append("    spendLimitRenewal: ").append(toIndentedString(spendLimitRenewal)).append("\n");
    sb.append("    spendLimitAmount: ").append(toIndentedString(spendLimitAmount)).append("\n");
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

