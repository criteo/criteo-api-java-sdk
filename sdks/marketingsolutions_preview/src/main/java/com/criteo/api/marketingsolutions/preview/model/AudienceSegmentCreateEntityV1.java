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
import com.criteo.api.marketingsolutions.preview.model.InMarketCreateV1;
import com.criteo.api.marketingsolutions.preview.model.LocationCreateV1;
import com.criteo.api.marketingsolutions.preview.model.LookalikeCreateV1;
import com.criteo.api.marketingsolutions.preview.model.RetargetingCreateV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Set of rules that defines specific people to target.
 */
@ApiModel(description = "Set of rules that defines specific people to target.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceSegmentCreateEntityV1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_IN_MARKET = "inMarket";
  @SerializedName(SERIALIZED_NAME_IN_MARKET)
  private InMarketCreateV1 inMarket;

  public static final String SERIALIZED_NAME_PROSPECTING = "prospecting";
  @SerializedName(SERIALIZED_NAME_PROSPECTING)
  private Object prospecting;

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private Object contactList;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationCreateV1 location;

  public static final String SERIALIZED_NAME_RETARGETING = "retargeting";
  @SerializedName(SERIALIZED_NAME_RETARGETING)
  private RetargetingCreateV1 retargeting;

  public static final String SERIALIZED_NAME_LOOKALIKE = "lookalike";
  @SerializedName(SERIALIZED_NAME_LOOKALIKE)
  private LookalikeCreateV1 lookalike;


  public AudienceSegmentCreateEntityV1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the segment
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the segment")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceSegmentCreateEntityV1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the segment
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the segment")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AudienceSegmentCreateEntityV1 advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser associated to the segment
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Advertiser associated to the segment")

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceSegmentCreateEntityV1 inMarket(InMarketCreateV1 inMarket) {
    
    this.inMarket = inMarket;
    return this;
  }

   /**
   * Get inMarket
   * @return inMarket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InMarketCreateV1 getInMarket() {
    return inMarket;
  }


  public void setInMarket(InMarketCreateV1 inMarket) {
    this.inMarket = inMarket;
  }


  public AudienceSegmentCreateEntityV1 prospecting(Object prospecting) {
    
    this.prospecting = prospecting;
    return this;
  }

   /**
   * Settings to target prospecting users to website visitors.
   * @return prospecting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Settings to target prospecting users to website visitors.")

  public Object getProspecting() {
    return prospecting;
  }


  public void setProspecting(Object prospecting) {
    this.prospecting = prospecting;
  }


  public AudienceSegmentCreateEntityV1 contactList(Object contactList) {
    
    this.contactList = contactList;
    return this;
  }

   /**
   * Settings to target users with your contact lists.
   * @return contactList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Settings to target users with your contact lists.")

  public Object getContactList() {
    return contactList;
  }


  public void setContactList(Object contactList) {
    this.contactList = contactList;
  }


  public AudienceSegmentCreateEntityV1 location(LocationCreateV1 location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationCreateV1 getLocation() {
    return location;
  }


  public void setLocation(LocationCreateV1 location) {
    this.location = location;
  }


  public AudienceSegmentCreateEntityV1 retargeting(RetargetingCreateV1 retargeting) {
    
    this.retargeting = retargeting;
    return this;
  }

   /**
   * Get retargeting
   * @return retargeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetargetingCreateV1 getRetargeting() {
    return retargeting;
  }


  public void setRetargeting(RetargetingCreateV1 retargeting) {
    this.retargeting = retargeting;
  }


  public AudienceSegmentCreateEntityV1 lookalike(LookalikeCreateV1 lookalike) {
    
    this.lookalike = lookalike;
    return this;
  }

   /**
   * Get lookalike
   * @return lookalike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LookalikeCreateV1 getLookalike() {
    return lookalike;
  }


  public void setLookalike(LookalikeCreateV1 lookalike) {
    this.lookalike = lookalike;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceSegmentCreateEntityV1 audienceSegmentCreateEntityV1 = (AudienceSegmentCreateEntityV1) o;
    return Objects.equals(this.name, audienceSegmentCreateEntityV1.name) &&
        Objects.equals(this.description, audienceSegmentCreateEntityV1.description) &&
        Objects.equals(this.advertiserId, audienceSegmentCreateEntityV1.advertiserId) &&
        Objects.equals(this.inMarket, audienceSegmentCreateEntityV1.inMarket) &&
        Objects.equals(this.prospecting, audienceSegmentCreateEntityV1.prospecting) &&
        Objects.equals(this.contactList, audienceSegmentCreateEntityV1.contactList) &&
        Objects.equals(this.location, audienceSegmentCreateEntityV1.location) &&
        Objects.equals(this.retargeting, audienceSegmentCreateEntityV1.retargeting) &&
        Objects.equals(this.lookalike, audienceSegmentCreateEntityV1.lookalike);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, advertiserId, inMarket, prospecting, contactList, location, retargeting, lookalike);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSegmentCreateEntityV1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    inMarket: ").append(toIndentedString(inMarket)).append("\n");
    sb.append("    prospecting: ").append(toIndentedString(prospecting)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    retargeting: ").append(toIndentedString(retargeting)).append("\n");
    sb.append("    lookalike: ").append(toIndentedString(lookalike)).append("\n");
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

