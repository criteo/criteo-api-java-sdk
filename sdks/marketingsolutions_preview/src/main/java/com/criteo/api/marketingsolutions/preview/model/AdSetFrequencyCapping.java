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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set frequency capping model
 */
@ApiModel(description = "ad set frequency capping model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetFrequencyCapping {
  /**
   * Period on which impression limitation is calculated
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    HOURLY("hourly"),
    
    DAILY("daily"),
    
    LIFETIME("lifetime"),
    
    ADVANCED("advanced");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_MAXIMUM_IMPRESSIONS = "maximumImpressions";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_IMPRESSIONS)
  private Integer maximumImpressions;


  public AdSetFrequencyCapping frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Period on which impression limitation is calculated
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Period on which impression limitation is calculated")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public AdSetFrequencyCapping maximumImpressions(Integer maximumImpressions) {
    
    this.maximumImpressions = maximumImpressions;
    return this;
  }

   /**
   * Maximum impressions for the specified period
   * @return maximumImpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum impressions for the specified period")

  public Integer getMaximumImpressions() {
    return maximumImpressions;
  }


  public void setMaximumImpressions(Integer maximumImpressions) {
    this.maximumImpressions = maximumImpressions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdSetFrequencyCapping adSetFrequencyCapping = (AdSetFrequencyCapping) o;
    return Objects.equals(this.frequency, adSetFrequencyCapping.frequency) &&
        Objects.equals(this.maximumImpressions, adSetFrequencyCapping.maximumImpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, maximumImpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetFrequencyCapping {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    maximumImpressions: ").append(toIndentedString(maximumImpressions)).append("\n");
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

