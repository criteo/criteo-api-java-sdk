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
import com.criteo.api.retailmedia.preview.model.PageTypeEnvironment;
import com.criteo.api.retailmedia.preview.model.TemplateVariableValue;
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
 * A creative entity
 */
@ApiModel(description = "A creative entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Creative202210 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Creative Status
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

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_FORMAT_ID = "formatId";
  @SerializedName(SERIALIZED_NAME_FORMAT_ID)
  private Integer formatId;

  public static final String SERIALIZED_NAME_ASSOCIATED_LINE_ITEM_IDS = "associatedLineItemIds";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_LINE_ITEM_IDS)
  private List<String> associatedLineItemIds = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * Creative format type
   */
  @JsonAdapter(CreativeFormatTypeEnum.Adapter.class)
  public enum CreativeFormatTypeEnum {
    UNKNOWN("Unknown"),
    
    FLAGSHIP("FlagShip"),
    
    SHOWCASE("Showcase"),
    
    SPONSOREDPRODUCTS("SponsoredProducts"),
    
    BUTTERFLY("Butterfly"),
    
    BUNDLEBOOST("BundleBoost"),
    
    IAB("IAB"),
    
    CUSTOM("CUSTOM"),
    
    DISPLAYPANEL("DisplayPanel"),
    
    DIGITALSHELFTALKER("DigitalShelfTalker");

    private String value;

    CreativeFormatTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreativeFormatTypeEnum fromValue(String value) {
      for (CreativeFormatTypeEnum b : CreativeFormatTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CreativeFormatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreativeFormatTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreativeFormatTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreativeFormatTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREATIVE_FORMAT_TYPE = "creativeFormatType";
  @SerializedName(SERIALIZED_NAME_CREATIVE_FORMAT_TYPE)
  private CreativeFormatTypeEnum creativeFormatType;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<PageTypeEnvironment> environments = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES = "templateVariableValues";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLE_VALUES)
  private List<TemplateVariableValue> templateVariableValues = new ArrayList<>();


  public Creative202210 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Creative202210 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Creative Status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Creative Status")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Creative202210 brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Brand Id
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Brand Id")

  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public Creative202210 retailerId(Integer retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Retailer Id
   * @return retailerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Retailer Id")

  public Integer getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(Integer retailerId) {
    this.retailerId = retailerId;
  }


  public Creative202210 templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Template Id
   * @return templateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Template Id")

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public Creative202210 templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Template Name
   * @return templateName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Template Name")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public Creative202210 formatId(Integer formatId) {
    
    this.formatId = formatId;
    return this;
  }

   /**
   * Format Id
   * @return formatId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Format Id")

  public Integer getFormatId() {
    return formatId;
  }


  public void setFormatId(Integer formatId) {
    this.formatId = formatId;
  }


  public Creative202210 associatedLineItemIds(List<String> associatedLineItemIds) {
    
    this.associatedLineItemIds = associatedLineItemIds;
    return this;
  }

  public Creative202210 addAssociatedLineItemIdsItem(String associatedLineItemIdsItem) {
    if (this.associatedLineItemIds == null) {
      this.associatedLineItemIds = new ArrayList<>();
    }
    this.associatedLineItemIds.add(associatedLineItemIdsItem);
    return this;
  }

   /**
   * Associated Line Item Ids
   * @return associatedLineItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated Line Item Ids")

  public List<String> getAssociatedLineItemIds() {
    return associatedLineItemIds;
  }


  public void setAssociatedLineItemIds(List<String> associatedLineItemIds) {
    this.associatedLineItemIds = associatedLineItemIds;
  }


  public Creative202210 updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Updated at time
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated at time")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Creative202210 creativeFormatType(CreativeFormatTypeEnum creativeFormatType) {
    
    this.creativeFormatType = creativeFormatType;
    return this;
  }

   /**
   * Creative format type
   * @return creativeFormatType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Creative format type")

  public CreativeFormatTypeEnum getCreativeFormatType() {
    return creativeFormatType;
  }


  public void setCreativeFormatType(CreativeFormatTypeEnum creativeFormatType) {
    this.creativeFormatType = creativeFormatType;
  }


  public Creative202210 environments(List<PageTypeEnvironment> environments) {
    
    this.environments = environments;
    return this;
  }

  public Creative202210 addEnvironmentsItem(PageTypeEnvironment environmentsItem) {
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * Environment type (e.g. mobile, web, app)
   * @return environments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Environment type (e.g. mobile, web, app)")

  public List<PageTypeEnvironment> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<PageTypeEnvironment> environments) {
    this.environments = environments;
  }


  public Creative202210 templateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    
    this.templateVariableValues = templateVariableValues;
    return this;
  }

  public Creative202210 addTemplateVariableValuesItem(TemplateVariableValue templateVariableValuesItem) {
    this.templateVariableValues.add(templateVariableValuesItem);
    return this;
  }

   /**
   * The template chosen values
   * @return templateVariableValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The template chosen values")

  public List<TemplateVariableValue> getTemplateVariableValues() {
    return templateVariableValues;
  }


  public void setTemplateVariableValues(List<TemplateVariableValue> templateVariableValues) {
    this.templateVariableValues = templateVariableValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creative202210 creative202210 = (Creative202210) o;
    return Objects.equals(this.name, creative202210.name) &&
        Objects.equals(this.status, creative202210.status) &&
        Objects.equals(this.brandId, creative202210.brandId) &&
        Objects.equals(this.retailerId, creative202210.retailerId) &&
        Objects.equals(this.templateId, creative202210.templateId) &&
        Objects.equals(this.templateName, creative202210.templateName) &&
        Objects.equals(this.formatId, creative202210.formatId) &&
        Objects.equals(this.associatedLineItemIds, creative202210.associatedLineItemIds) &&
        Objects.equals(this.updatedAt, creative202210.updatedAt) &&
        Objects.equals(this.creativeFormatType, creative202210.creativeFormatType) &&
        Objects.equals(this.environments, creative202210.environments) &&
        Objects.equals(this.templateVariableValues, creative202210.templateVariableValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, brandId, retailerId, templateId, templateName, formatId, associatedLineItemIds, updatedAt, creativeFormatType, environments, templateVariableValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creative202210 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    formatId: ").append(toIndentedString(formatId)).append("\n");
    sb.append("    associatedLineItemIds: ").append(toIndentedString(associatedLineItemIds)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    creativeFormatType: ").append(toIndentedString(creativeFormatType)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    templateVariableValues: ").append(toIndentedString(templateVariableValues)).append("\n");
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
