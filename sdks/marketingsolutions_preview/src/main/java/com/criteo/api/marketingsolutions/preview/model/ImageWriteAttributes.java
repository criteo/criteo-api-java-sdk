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
 * The attributes specific to create or update an Image creative
 */
@ApiModel(description = "The attributes specific to create or update an Image creative")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageWriteAttributes {
  public static final String SERIALIZED_NAME_BASE64_STRINGS = "base64Strings";
  @SerializedName(SERIALIZED_NAME_BASE64_STRINGS)
  private List<String> base64Strings = null;

  public static final String SERIALIZED_NAME_LANDING_PAGE_URL = "landingPageUrl";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE_URL)
  private String landingPageUrl;


  public ImageWriteAttributes base64Strings(List<String> base64Strings) {
    
    this.base64Strings = base64Strings;
    return this;
  }

  public ImageWriteAttributes addBase64StringsItem(String base64StringsItem) {
    if (this.base64Strings == null) {
      this.base64Strings = new ArrayList<>();
    }
    this.base64Strings.add(base64StringsItem);
    return this;
  }

   /**
   * Array of images as a base-64 encoded string
   * @return base64Strings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of images as a base-64 encoded string")

  public List<String> getBase64Strings() {
    return base64Strings;
  }


  public void setBase64Strings(List<String> base64Strings) {
    this.base64Strings = base64Strings;
  }


  public ImageWriteAttributes landingPageUrl(String landingPageUrl) {
    
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
    ImageWriteAttributes imageWriteAttributes = (ImageWriteAttributes) o;
    return Objects.equals(this.base64Strings, imageWriteAttributes.base64Strings) &&
        Objects.equals(this.landingPageUrl, imageWriteAttributes.landingPageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64Strings, landingPageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageWriteAttributes {\n");
    sb.append("    base64Strings: ").append(toIndentedString(base64Strings)).append("\n");
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

