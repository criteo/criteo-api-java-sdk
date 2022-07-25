/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: Preview
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
 * Settings to target users based on its type and days since last visit.
 */
@ApiModel(description = "Settings to target users based on its type and days since last visit.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingUpdateV1 {
  /**
   * Gets or Sets visitorsType
   */
  @JsonAdapter(VisitorsTypeEnum.Adapter.class)
  public enum VisitorsTypeEnum {
    ALL("All"),
    
    BUYERS("Buyers"),
    
    NONBUYERS("NonBuyers");

    private String value;

    VisitorsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisitorsTypeEnum fromValue(String value) {
      for (VisitorsTypeEnum b : VisitorsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisitorsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisitorsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisitorsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisitorsTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISITORS_TYPE = "visitorsType";
  @SerializedName(SERIALIZED_NAME_VISITORS_TYPE)
  private VisitorsTypeEnum visitorsType;

  public static final String SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MIN = "daysSinceLastVisitMin";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MIN)
  private Integer daysSinceLastVisitMin;

  public static final String SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MAX = "daysSinceLastVisitMax";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_LAST_VISIT_MAX)
  private Integer daysSinceLastVisitMax;


  public RetargetingUpdateV1 visitorsType(VisitorsTypeEnum visitorsType) {
    
    this.visitorsType = visitorsType;
    return this;
  }

   /**
   * Get visitorsType
   * @return visitorsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VisitorsTypeEnum getVisitorsType() {
    return visitorsType;
  }


  public void setVisitorsType(VisitorsTypeEnum visitorsType) {
    this.visitorsType = visitorsType;
  }


  public RetargetingUpdateV1 daysSinceLastVisitMin(Integer daysSinceLastVisitMin) {
    
    this.daysSinceLastVisitMin = daysSinceLastVisitMin;
    return this;
  }

   /**
   * Get daysSinceLastVisitMin
   * @return daysSinceLastVisitMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDaysSinceLastVisitMin() {
    return daysSinceLastVisitMin;
  }


  public void setDaysSinceLastVisitMin(Integer daysSinceLastVisitMin) {
    this.daysSinceLastVisitMin = daysSinceLastVisitMin;
  }


  public RetargetingUpdateV1 daysSinceLastVisitMax(Integer daysSinceLastVisitMax) {
    
    this.daysSinceLastVisitMax = daysSinceLastVisitMax;
    return this;
  }

   /**
   * Get daysSinceLastVisitMax
   * @return daysSinceLastVisitMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDaysSinceLastVisitMax() {
    return daysSinceLastVisitMax;
  }


  public void setDaysSinceLastVisitMax(Integer daysSinceLastVisitMax) {
    this.daysSinceLastVisitMax = daysSinceLastVisitMax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingUpdateV1 retargetingUpdateV1 = (RetargetingUpdateV1) o;
    return Objects.equals(this.visitorsType, retargetingUpdateV1.visitorsType) &&
        Objects.equals(this.daysSinceLastVisitMin, retargetingUpdateV1.daysSinceLastVisitMin) &&
        Objects.equals(this.daysSinceLastVisitMax, retargetingUpdateV1.daysSinceLastVisitMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitorsType, daysSinceLastVisitMin, daysSinceLastVisitMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingUpdateV1 {\n");
    sb.append("    visitorsType: ").append(toIndentedString(visitorsType)).append("\n");
    sb.append("    daysSinceLastVisitMin: ").append(toIndentedString(daysSinceLastVisitMin)).append("\n");
    sb.append("    daysSinceLastVisitMax: ").append(toIndentedString(daysSinceLastVisitMax)).append("\n");
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

