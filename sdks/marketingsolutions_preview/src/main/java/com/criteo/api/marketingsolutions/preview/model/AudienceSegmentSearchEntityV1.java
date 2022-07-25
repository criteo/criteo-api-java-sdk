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
import java.util.ArrayList;
import java.util.List;

/**
 * Available filters to perform a search on audience segments. If present, the filters are AND&#39;ed together when applied.
 */
@ApiModel(description = "Available filters to perform a search on audience segments. If present, the filters are AND'ed together when applied.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceSegmentSearchEntityV1 {
  public static final String SERIALIZED_NAME_AUDIENCE_SEGMENT_IDS = "audienceSegmentIds";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_SEGMENT_IDS)
  private List<String> audienceSegmentIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<String> advertiserIds = null;

  /**
   * Gets or Sets audienceSegmentTypes
   */
  @JsonAdapter(AudienceSegmentTypesEnum.Adapter.class)
  public enum AudienceSegmentTypesEnum {
    UNKNOWN("Unknown"),
    
    COMMERCE("Commerce"),
    
    SIMILAR("Similar"),
    
    CONTACTLIST("ContactList"),
    
    LOCATION("Location"),
    
    PREBUILT("Prebuilt"),
    
    RETARGETING("Retargeting");

    private String value;

    AudienceSegmentTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AudienceSegmentTypesEnum fromValue(String value) {
      for (AudienceSegmentTypesEnum b : AudienceSegmentTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AudienceSegmentTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AudienceSegmentTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AudienceSegmentTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AudienceSegmentTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUDIENCE_SEGMENT_TYPES = "audienceSegmentTypes";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_SEGMENT_TYPES)
  private List<AudienceSegmentTypesEnum> audienceSegmentTypes = null;


  public AudienceSegmentSearchEntityV1 audienceSegmentIds(List<String> audienceSegmentIds) {
    
    this.audienceSegmentIds = audienceSegmentIds;
    return this;
  }

  public AudienceSegmentSearchEntityV1 addAudienceSegmentIdsItem(String audienceSegmentIdsItem) {
    if (this.audienceSegmentIds == null) {
      this.audienceSegmentIds = new ArrayList<>();
    }
    this.audienceSegmentIds.add(audienceSegmentIdsItem);
    return this;
  }

   /**
   * List of segment ids
   * @return audienceSegmentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of segment ids")

  public List<String> getAudienceSegmentIds() {
    return audienceSegmentIds;
  }


  public void setAudienceSegmentIds(List<String> audienceSegmentIds) {
    this.audienceSegmentIds = audienceSegmentIds;
  }


  public AudienceSegmentSearchEntityV1 advertiserIds(List<String> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AudienceSegmentSearchEntityV1 addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * List of advertiser ids
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of advertiser ids")

  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AudienceSegmentSearchEntityV1 audienceSegmentTypes(List<AudienceSegmentTypesEnum> audienceSegmentTypes) {
    
    this.audienceSegmentTypes = audienceSegmentTypes;
    return this;
  }

  public AudienceSegmentSearchEntityV1 addAudienceSegmentTypesItem(AudienceSegmentTypesEnum audienceSegmentTypesItem) {
    if (this.audienceSegmentTypes == null) {
      this.audienceSegmentTypes = new ArrayList<>();
    }
    this.audienceSegmentTypes.add(audienceSegmentTypesItem);
    return this;
  }

   /**
   * List of segment types
   * @return audienceSegmentTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of segment types")

  public List<AudienceSegmentTypesEnum> getAudienceSegmentTypes() {
    return audienceSegmentTypes;
  }


  public void setAudienceSegmentTypes(List<AudienceSegmentTypesEnum> audienceSegmentTypes) {
    this.audienceSegmentTypes = audienceSegmentTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceSegmentSearchEntityV1 audienceSegmentSearchEntityV1 = (AudienceSegmentSearchEntityV1) o;
    return Objects.equals(this.audienceSegmentIds, audienceSegmentSearchEntityV1.audienceSegmentIds) &&
        Objects.equals(this.advertiserIds, audienceSegmentSearchEntityV1.advertiserIds) &&
        Objects.equals(this.audienceSegmentTypes, audienceSegmentSearchEntityV1.audienceSegmentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceSegmentIds, advertiserIds, audienceSegmentTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSegmentSearchEntityV1 {\n");
    sb.append("    audienceSegmentIds: ").append(toIndentedString(audienceSegmentIds)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    audienceSegmentTypes: ").append(toIndentedString(audienceSegmentTypes)).append("\n");
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

