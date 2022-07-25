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
import com.criteo.api.marketingsolutions.preview.model.CommerceUpdateV1;
import com.criteo.api.marketingsolutions.preview.model.LocationUpdateV1;
import com.criteo.api.marketingsolutions.preview.model.NillableString;
import com.criteo.api.marketingsolutions.preview.model.RetargetingUpdateV1;
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
public class AudienceSegmentUpdateEntityV1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private NillableString description;

  public static final String SERIALIZED_NAME_COMMERCE = "commerce";
  @SerializedName(SERIALIZED_NAME_COMMERCE)
  private CommerceUpdateV1 commerce;

  public static final String SERIALIZED_NAME_CONTACT_LIST = "contactList";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST)
  private Object contactList;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationUpdateV1 location;

  public static final String SERIALIZED_NAME_RETARGETING = "retargeting";
  @SerializedName(SERIALIZED_NAME_RETARGETING)
  private RetargetingUpdateV1 retargeting;


  public AudienceSegmentUpdateEntityV1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceSegmentUpdateEntityV1 description(NillableString description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableString getDescription() {
    return description;
  }


  public void setDescription(NillableString description) {
    this.description = description;
  }


  public AudienceSegmentUpdateEntityV1 commerce(CommerceUpdateV1 commerce) {
    
    this.commerce = commerce;
    return this;
  }

   /**
   * Get commerce
   * @return commerce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceUpdateV1 getCommerce() {
    return commerce;
  }


  public void setCommerce(CommerceUpdateV1 commerce) {
    this.commerce = commerce;
  }


  public AudienceSegmentUpdateEntityV1 contactList(Object contactList) {
    
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


  public AudienceSegmentUpdateEntityV1 location(LocationUpdateV1 location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationUpdateV1 getLocation() {
    return location;
  }


  public void setLocation(LocationUpdateV1 location) {
    this.location = location;
  }


  public AudienceSegmentUpdateEntityV1 retargeting(RetargetingUpdateV1 retargeting) {
    
    this.retargeting = retargeting;
    return this;
  }

   /**
   * Get retargeting
   * @return retargeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetargetingUpdateV1 getRetargeting() {
    return retargeting;
  }


  public void setRetargeting(RetargetingUpdateV1 retargeting) {
    this.retargeting = retargeting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceSegmentUpdateEntityV1 audienceSegmentUpdateEntityV1 = (AudienceSegmentUpdateEntityV1) o;
    return Objects.equals(this.name, audienceSegmentUpdateEntityV1.name) &&
        Objects.equals(this.description, audienceSegmentUpdateEntityV1.description) &&
        Objects.equals(this.commerce, audienceSegmentUpdateEntityV1.commerce) &&
        Objects.equals(this.contactList, audienceSegmentUpdateEntityV1.contactList) &&
        Objects.equals(this.location, audienceSegmentUpdateEntityV1.location) &&
        Objects.equals(this.retargeting, audienceSegmentUpdateEntityV1.retargeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, commerce, contactList, location, retargeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSegmentUpdateEntityV1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    commerce: ").append(toIndentedString(commerce)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    retargeting: ").append(toIndentedString(retargeting)).append("\n");
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

