/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_01.model;

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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata and usage info of a preferred deals creative
 */
@ApiModel(description = "Metadata and usage info of a preferred deals creative")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Creative202110 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    READY("Ready"),
    
    IN_USE("In_Use"),
    
    ARCHIVED("Archived"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private Integer retailerId;

  public static final String SERIALIZED_NAME_ASSOCIATED_LINE_ITEM_IDS = "associatedLineItemIds";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_LINE_ITEM_IDS)
  private List<String> associatedLineItemIds = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public Creative202110 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Creative202110 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Creative202110 brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public Creative202110 retailerId(Integer retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Get retailerId
   * @return retailerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(Integer retailerId) {
    this.retailerId = retailerId;
  }


  public Creative202110 associatedLineItemIds(List<String> associatedLineItemIds) {
    
    this.associatedLineItemIds = associatedLineItemIds;
    return this;
  }

  public Creative202110 addAssociatedLineItemIdsItem(String associatedLineItemIdsItem) {
    if (this.associatedLineItemIds == null) {
      this.associatedLineItemIds = new ArrayList<>();
    }
    this.associatedLineItemIds.add(associatedLineItemIdsItem);
    return this;
  }

   /**
   * Get associatedLineItemIds
   * @return associatedLineItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAssociatedLineItemIds() {
    return associatedLineItemIds;
  }


  public void setAssociatedLineItemIds(List<String> associatedLineItemIds) {
    this.associatedLineItemIds = associatedLineItemIds;
  }


  public Creative202110 updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creative202110 creative202110 = (Creative202110) o;
    return Objects.equals(this.name, creative202110.name) &&
        Objects.equals(this.status, creative202110.status) &&
        Objects.equals(this.brandId, creative202110.brandId) &&
        Objects.equals(this.retailerId, creative202110.retailerId) &&
        Objects.equals(this.associatedLineItemIds, creative202110.associatedLineItemIds) &&
        Objects.equals(this.updatedAt, creative202110.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, brandId, retailerId, associatedLineItemIds, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creative202110 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    associatedLineItemIds: ").append(toIndentedString(associatedLineItemIds)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

