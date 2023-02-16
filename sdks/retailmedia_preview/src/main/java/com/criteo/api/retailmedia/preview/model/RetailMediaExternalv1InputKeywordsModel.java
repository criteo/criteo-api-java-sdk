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


package com.criteo.api.retailmedia.preview.model;

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
 * Input values associated with a keyword
 */
@ApiModel(description = "Input values associated with a keyword")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaExternalv1InputKeywordsModel {
  public static final String SERIALIZED_NAME_NEGATIVE_BROAD = "negativeBroad";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_BROAD)
  private List<String> negativeBroad = null;

  public static final String SERIALIZED_NAME_NEGATIVE_EXACT = "negativeExact";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_EXACT)
  private List<String> negativeExact = null;

  public static final String SERIALIZED_NAME_POSITIVE_EXACT = "positiveExact";
  @SerializedName(SERIALIZED_NAME_POSITIVE_EXACT)
  private List<String> positiveExact = null;


  public RetailMediaExternalv1InputKeywordsModel negativeBroad(List<String> negativeBroad) {
    
    this.negativeBroad = negativeBroad;
    return this;
  }

  public RetailMediaExternalv1InputKeywordsModel addNegativeBroadItem(String negativeBroadItem) {
    if (this.negativeBroad == null) {
      this.negativeBroad = new ArrayList<>();
    }
    this.negativeBroad.add(negativeBroadItem);
    return this;
  }

   /**
   * Get negativeBroad
   * @return negativeBroad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNegativeBroad() {
    return negativeBroad;
  }


  public void setNegativeBroad(List<String> negativeBroad) {
    this.negativeBroad = negativeBroad;
  }


  public RetailMediaExternalv1InputKeywordsModel negativeExact(List<String> negativeExact) {
    
    this.negativeExact = negativeExact;
    return this;
  }

  public RetailMediaExternalv1InputKeywordsModel addNegativeExactItem(String negativeExactItem) {
    if (this.negativeExact == null) {
      this.negativeExact = new ArrayList<>();
    }
    this.negativeExact.add(negativeExactItem);
    return this;
  }

   /**
   * Get negativeExact
   * @return negativeExact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNegativeExact() {
    return negativeExact;
  }


  public void setNegativeExact(List<String> negativeExact) {
    this.negativeExact = negativeExact;
  }


  public RetailMediaExternalv1InputKeywordsModel positiveExact(List<String> positiveExact) {
    
    this.positiveExact = positiveExact;
    return this;
  }

  public RetailMediaExternalv1InputKeywordsModel addPositiveExactItem(String positiveExactItem) {
    if (this.positiveExact == null) {
      this.positiveExact = new ArrayList<>();
    }
    this.positiveExact.add(positiveExactItem);
    return this;
  }

   /**
   * Get positiveExact
   * @return positiveExact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPositiveExact() {
    return positiveExact;
  }


  public void setPositiveExact(List<String> positiveExact) {
    this.positiveExact = positiveExact;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaExternalv1InputKeywordsModel retailMediaExternalv1InputKeywordsModel = (RetailMediaExternalv1InputKeywordsModel) o;
    return Objects.equals(this.negativeBroad, retailMediaExternalv1InputKeywordsModel.negativeBroad) &&
        Objects.equals(this.negativeExact, retailMediaExternalv1InputKeywordsModel.negativeExact) &&
        Objects.equals(this.positiveExact, retailMediaExternalv1InputKeywordsModel.positiveExact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negativeBroad, negativeExact, positiveExact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailMediaExternalv1InputKeywordsModel {\n");
    sb.append("    negativeBroad: ").append(toIndentedString(negativeBroad)).append("\n");
    sb.append("    negativeExact: ").append(toIndentedString(negativeExact)).append("\n");
    sb.append("    positiveExact: ").append(toIndentedString(positiveExact)).append("\n");
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

