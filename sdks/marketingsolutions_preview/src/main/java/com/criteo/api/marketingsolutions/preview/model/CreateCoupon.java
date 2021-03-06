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
import com.criteo.api.marketingsolutions.preview.model.CreateImageSlide;
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
 * Entity to create a Coupon
 */
@ApiModel(description = "Entity to create a Coupon")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCoupon {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AD_SET_ID = "adSetId";
  @SerializedName(SERIALIZED_NAME_AD_SET_ID)
  private String adSetId;

  public static final String SERIALIZED_NAME_LANDING_PAGE_URL = "landingPageUrl";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE_URL)
  private String landingPageUrl;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<CreateImageSlide> images = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHOW_EVERY = "showEvery";
  @SerializedName(SERIALIZED_NAME_SHOW_EVERY)
  private Integer showEvery;

  public static final String SERIALIZED_NAME_SHOW_DURATION = "showDuration";
  @SerializedName(SERIALIZED_NAME_SHOW_DURATION)
  private Integer showDuration;

  public static final String SERIALIZED_NAME_ROTATIONS_NUMBER = "rotationsNumber";
  @SerializedName(SERIALIZED_NAME_ROTATIONS_NUMBER)
  private Integer rotationsNumber;


  public CreateCoupon name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Coupon
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the Coupon")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCoupon description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Coupon
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the Coupon")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCoupon adSetId(String adSetId) {
    
    this.adSetId = adSetId;
    return this;
  }

   /**
   * The id of the Ad Set on which the Coupon is applied to
   * @return adSetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the Ad Set on which the Coupon is applied to")

  public String getAdSetId() {
    return adSetId;
  }


  public void setAdSetId(String adSetId) {
    this.adSetId = adSetId;
  }


  public CreateCoupon landingPageUrl(String landingPageUrl) {
    
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Web redirection of the landing page url
   * @return landingPageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Web redirection of the landing page url")

  public String getLandingPageUrl() {
    return landingPageUrl;
  }


  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }


  public CreateCoupon startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the coupon will be launched  String must be in ISO8601 format
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date when the coupon will be launched  String must be in ISO8601 format")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public CreateCoupon endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date when when we will stop to show this Coupon. If the end date is not specified (i.e. null) then the Coupon will go on forever  String must be in ISO8601 format
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when when we will stop to show this Coupon. If the end date is not specified (i.e. null) then the Coupon will go on forever  String must be in ISO8601 format")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public CreateCoupon format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Format of the Coupon, it can have two values: \&quot;FullFrame\&quot; or \&quot;LogoZone\&quot;
   * @return format
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Format of the Coupon, it can have two values: \"FullFrame\" or \"LogoZone\"")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public CreateCoupon images(List<CreateImageSlide> images) {
    
    this.images = images;
    return this;
  }

  public CreateCoupon addImagesItem(CreateImageSlide imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * List of slides containing the images as a base-64 encoded string
   * @return images
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of slides containing the images as a base-64 encoded string")

  public List<CreateImageSlide> getImages() {
    return images;
  }


  public void setImages(List<CreateImageSlide> images) {
    this.images = images;
  }


  public CreateCoupon showEvery(Integer showEvery) {
    
    this.showEvery = showEvery;
    return this;
  }

   /**
   * Show the Coupon every N seconds (between 1 and 10)
   * @return showEvery
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Show the Coupon every N seconds (between 1 and 10)")

  public Integer getShowEvery() {
    return showEvery;
  }


  public void setShowEvery(Integer showEvery) {
    this.showEvery = showEvery;
  }


  public CreateCoupon showDuration(Integer showDuration) {
    
    this.showDuration = showDuration;
    return this;
  }

   /**
   * Show Coupon for a duration of N seconds (between 1 and 5)
   * @return showDuration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Show Coupon for a duration of N seconds (between 1 and 5)")

  public Integer getShowDuration() {
    return showDuration;
  }


  public void setShowDuration(Integer showDuration) {
    this.showDuration = showDuration;
  }


  public CreateCoupon rotationsNumber(Integer rotationsNumber) {
    
    this.rotationsNumber = rotationsNumber;
    return this;
  }

   /**
   * Number of rotations for the Coupons (from 1 to 10 times)
   * @return rotationsNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of rotations for the Coupons (from 1 to 10 times)")

  public Integer getRotationsNumber() {
    return rotationsNumber;
  }


  public void setRotationsNumber(Integer rotationsNumber) {
    this.rotationsNumber = rotationsNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCoupon createCoupon = (CreateCoupon) o;
    return Objects.equals(this.name, createCoupon.name) &&
        Objects.equals(this.description, createCoupon.description) &&
        Objects.equals(this.adSetId, createCoupon.adSetId) &&
        Objects.equals(this.landingPageUrl, createCoupon.landingPageUrl) &&
        Objects.equals(this.startDate, createCoupon.startDate) &&
        Objects.equals(this.endDate, createCoupon.endDate) &&
        Objects.equals(this.format, createCoupon.format) &&
        Objects.equals(this.images, createCoupon.images) &&
        Objects.equals(this.showEvery, createCoupon.showEvery) &&
        Objects.equals(this.showDuration, createCoupon.showDuration) &&
        Objects.equals(this.rotationsNumber, createCoupon.rotationsNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, adSetId, landingPageUrl, startDate, endDate, format, images, showEvery, showDuration, rotationsNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCoupon {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    adSetId: ").append(toIndentedString(adSetId)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    showEvery: ").append(toIndentedString(showEvery)).append("\n");
    sb.append("    showDuration: ").append(toIndentedString(showDuration)).append("\n");
    sb.append("    rotationsNumber: ").append(toIndentedString(rotationsNumber)).append("\n");
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

