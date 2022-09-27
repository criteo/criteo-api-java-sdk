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
import com.criteo.api.marketingsolutions.preview.model.DealId;
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
 * deal ids targeting writing model
 */
@ApiModel(description = "deal ids targeting writing model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetAdSetTargetingDealIds {
  public static final String SERIALIZED_NAME_DEAL_IDS = "dealIds";
  @SerializedName(SERIALIZED_NAME_DEAL_IDS)
  private List<DealId> dealIds = null;


  public SetAdSetTargetingDealIds dealIds(List<DealId> dealIds) {
    
    this.dealIds = dealIds;
    return this;
  }

  public SetAdSetTargetingDealIds addDealIdsItem(DealId dealIdsItem) {
    if (this.dealIds == null) {
      this.dealIds = new ArrayList<>();
    }
    this.dealIds.add(dealIdsItem);
    return this;
  }

   /**
   * Get dealIds
   * @return dealIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DealId> getDealIds() {
    return dealIds;
  }


  public void setDealIds(List<DealId> dealIds) {
    this.dealIds = dealIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetAdSetTargetingDealIds setAdSetTargetingDealIds = (SetAdSetTargetingDealIds) o;
    return Objects.equals(this.dealIds, setAdSetTargetingDealIds.dealIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAdSetTargetingDealIds {\n");
    sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
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
