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
 * Settings to target users close to a given seed segment.
 */
@ApiModel(description = "Settings to target users close to a given seed segment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LookalikeCreateV1 {
  public static final String SERIALIZED_NAME_SEED_SEGMENT_ID = "seedSegmentId";
  @SerializedName(SERIALIZED_NAME_SEED_SEGMENT_ID)
  private String seedSegmentId;

  public static final String SERIALIZED_NAME_TARGET_SIZE = "targetSize";
  @SerializedName(SERIALIZED_NAME_TARGET_SIZE)
  private Long targetSize;


  public LookalikeCreateV1 seedSegmentId(String seedSegmentId) {
    
    this.seedSegmentId = seedSegmentId;
    return this;
  }

   /**
   * Get seedSegmentId
   * @return seedSegmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeedSegmentId() {
    return seedSegmentId;
  }


  public void setSeedSegmentId(String seedSegmentId) {
    this.seedSegmentId = seedSegmentId;
  }


  public LookalikeCreateV1 targetSize(Long targetSize) {
    
    this.targetSize = targetSize;
    return this;
  }

   /**
   * Get targetSize
   * @return targetSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTargetSize() {
    return targetSize;
  }


  public void setTargetSize(Long targetSize) {
    this.targetSize = targetSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookalikeCreateV1 lookalikeCreateV1 = (LookalikeCreateV1) o;
    return Objects.equals(this.seedSegmentId, lookalikeCreateV1.seedSegmentId) &&
        Objects.equals(this.targetSize, lookalikeCreateV1.targetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seedSegmentId, targetSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookalikeCreateV1 {\n");
    sb.append("    seedSegmentId: ").append(toIndentedString(seedSegmentId)).append("\n");
    sb.append("    targetSize: ").append(toIndentedString(targetSize)).append("\n");
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
