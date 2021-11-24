/*
 * Criteo API Specification
 * This is used to help Criteo clients use our API
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
import com.criteo.api.marketingsolutions.preview.model.CategoryUpdateError;
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
 * CategoryUpdatesPerCatalogError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CategoryUpdatesPerCatalogError {
  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  /**
   * Gets or Sets errorCode
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    OK("OK"),
    
    ACCESSDENIED("AccessDenied"),
    
    ENABLEDCATEGORYNUMBEREXCEEDED("EnabledCategoryNumberExceeded"),
    
    CATEGORIESNOTENABLED("CategoriesNotEnabled"),
    
    DUPLICATECATALOGENTRY("DuplicateCatalogEntry"),
    
    INVALIDCATALOGID("InvalidCatalogId"),
    
    INVALIDCATEGORYHASHCODE("InvalidCategoryHashcode"),
    
    INACTIVECATEGORY("InactiveCategory"),
    
    DUPLICATECATEGORYENTRY("DuplicateCategoryEntry"),
    
    BIDDINGCATEGORIESONTHISCAMPAIGNNOTALLOWED("BiddingCategoriesOnThisCampaignNotAllowed"),
    
    CAMPAIGNNOTINPORTFOLIOORNOTACTIVE("CampaignNotInPortfolioOrNotActive"),
    
    DUPLICATECAMPAIGNENTRY("DuplicateCampaignEntry"),
    
    BIDDINGONTHISCAMPAIGNNOTALLOWED("BiddingOnThisCampaignNotAllowed"),
    
    BIDNOTINRANGE("BidNotInRange"),
    
    FOURDECIMALSNOTALLOWED("FourDecimalsNotAllowed"),
    
    BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED("BiddingOnTargetBudgetCampaignNotAllowed");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryUpdateError> categories = null;


   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCatalogId() {
    return catalogId;
  }




  public CategoryUpdatesPerCatalogError errorCode(ErrorCodeEnum errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }




  public CategoryUpdatesPerCatalogError categories(List<CategoryUpdateError> categories) {
    
    this.categories = categories;
    return this;
  }

  public CategoryUpdatesPerCatalogError addCategoriesItem(CategoryUpdateError categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CategoryUpdateError> getCategories() {
    return categories;
  }


  public void setCategories(List<CategoryUpdateError> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryUpdatesPerCatalogError categoryUpdatesPerCatalogError = (CategoryUpdatesPerCatalogError) o;
    return Objects.equals(this.catalogId, categoryUpdatesPerCatalogError.catalogId) &&
        Objects.equals(this.errorCode, categoryUpdatesPerCatalogError.errorCode) &&
        Objects.equals(this.errorMessage, categoryUpdatesPerCatalogError.errorMessage) &&
        Objects.equals(this.categories, categoryUpdatesPerCatalogError.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, errorCode, errorMessage, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdatesPerCatalogError {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

