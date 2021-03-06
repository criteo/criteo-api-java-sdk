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
import com.criteo.api.marketingsolutions.preview.model.UserEvent;
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
 * Recommendation request parameters.
 */
@ApiModel(description = "Recommendation request parameters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OnSiteRecoRequest {
  public static final String SERIALIZED_NAME_NB_REQUESTED_PRODUCTS = "nbRequestedProducts";
  @SerializedName(SERIALIZED_NAME_NB_REQUESTED_PRODUCTS)
  private Integer nbRequestedProducts;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_EVENTS = "userEvents";
  @SerializedName(SERIALIZED_NAME_USER_EVENTS)
  private List<UserEvent> userEvents = null;


  public OnSiteRecoRequest nbRequestedProducts(Integer nbRequestedProducts) {
    
    this.nbRequestedProducts = nbRequestedProducts;
    return this;
  }

   /**
   * Amount of products to recommend.
   * @return nbRequestedProducts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Amount of products to recommend.")

  public Integer getNbRequestedProducts() {
    return nbRequestedProducts;
  }


  public void setNbRequestedProducts(Integer nbRequestedProducts) {
    this.nbRequestedProducts = nbRequestedProducts;
  }


  public OnSiteRecoRequest userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Used to retrieve user events from Criteo trackers. Optional if UserEvents are passed.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to retrieve user events from Criteo trackers. Optional if UserEvents are passed.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public OnSiteRecoRequest userEvents(List<UserEvent> userEvents) {
    
    this.userEvents = userEvents;
    return this;
  }

  public OnSiteRecoRequest addUserEventsItem(UserEvent userEventsItem) {
    if (this.userEvents == null) {
      this.userEvents = new ArrayList<>();
    }
    this.userEvents.add(userEventsItem);
    return this;
  }

   /**
   * Used to perform a recommendation without relying on events stored for a UserId. Optional if UserId is passed.
   * @return userEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to perform a recommendation without relying on events stored for a UserId. Optional if UserId is passed.")

  public List<UserEvent> getUserEvents() {
    return userEvents;
  }


  public void setUserEvents(List<UserEvent> userEvents) {
    this.userEvents = userEvents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnSiteRecoRequest onSiteRecoRequest = (OnSiteRecoRequest) o;
    return Objects.equals(this.nbRequestedProducts, onSiteRecoRequest.nbRequestedProducts) &&
        Objects.equals(this.userId, onSiteRecoRequest.userId) &&
        Objects.equals(this.userEvents, onSiteRecoRequest.userEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbRequestedProducts, userId, userEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSiteRecoRequest {\n");
    sb.append("    nbRequestedProducts: ").append(toIndentedString(nbRequestedProducts)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userEvents: ").append(toIndentedString(userEvents)).append("\n");
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

