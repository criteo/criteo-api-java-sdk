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


package com.criteo.api.marketingsolutions.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2022_07.model.TransparencyReportFile;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the message defining the attribute response for Transparency report
 */
@ApiModel(description = "This is the message defining the attribute response for Transparency report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransparencyReportAttributes {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_TOKEN_VALID_UNTIL = "tokenValidUntil";
  @SerializedName(SERIALIZED_NAME_TOKEN_VALID_UNTIL)
  private OffsetDateTime tokenValidUntil;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<TransparencyReportFile> files = new ArrayList<>();


  public TransparencyReportAttributes advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public TransparencyReportAttributes tokenValidUntil(OffsetDateTime tokenValidUntil) {
    
    this.tokenValidUntil = tokenValidUntil;
    return this;
  }

   /**
   * Get tokenValidUntil
   * @return tokenValidUntil
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getTokenValidUntil() {
    return tokenValidUntil;
  }


  public void setTokenValidUntil(OffsetDateTime tokenValidUntil) {
    this.tokenValidUntil = tokenValidUntil;
  }


  public TransparencyReportAttributes files(List<TransparencyReportFile> files) {
    
    this.files = files;
    return this;
  }

  public TransparencyReportAttributes addFilesItem(TransparencyReportFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TransparencyReportFile> getFiles() {
    return files;
  }


  public void setFiles(List<TransparencyReportFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransparencyReportAttributes transparencyReportAttributes = (TransparencyReportAttributes) o;
    return Objects.equals(this.advertiserId, transparencyReportAttributes.advertiserId) &&
        Objects.equals(this.tokenValidUntil, transparencyReportAttributes.tokenValidUntil) &&
        Objects.equals(this.files, transparencyReportAttributes.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, tokenValidUntil, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransparencyReportAttributes {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    tokenValidUntil: ").append(toIndentedString(tokenValidUntil)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

