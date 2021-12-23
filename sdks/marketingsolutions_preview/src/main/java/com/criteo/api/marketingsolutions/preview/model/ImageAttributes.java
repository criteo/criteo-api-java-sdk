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
import java.util.ArrayList;
import java.util.List;

/**
 * The attributes specific to Image creatives
 */
@ApiModel(description = "The attributes specific to Image creatives")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageAttributes {
  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = null;

  public static final String SERIALIZED_NAME_LANDING_PAGE_URL = "landingPageUrl";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE_URL)
  private String landingPageUrl;


  public ImageAttributes urls(List<String> urls) {
    
    this.urls = urls;
    return this;
  }

  public ImageAttributes addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Array of images uploaded on demostatic.criteo.com when deploying and then static.criteo.net
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of images uploaded on demostatic.criteo.com when deploying and then static.criteo.net")

  public List<String> getUrls() {
    return urls;
  }


  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  public ImageAttributes landingPageUrl(String landingPageUrl) {
    
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Web redirection of the landing page url
   * @return landingPageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Web redirection of the landing page url")

  public String getLandingPageUrl() {
    return landingPageUrl;
  }


  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAttributes imageAttributes = (ImageAttributes) o;
    return Objects.equals(this.urls, imageAttributes.urls) &&
        Objects.equals(this.landingPageUrl, imageAttributes.landingPageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls, landingPageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAttributes {\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
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

