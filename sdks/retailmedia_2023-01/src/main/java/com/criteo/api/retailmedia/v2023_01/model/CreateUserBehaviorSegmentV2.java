/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2023-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_01.model;

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
 * Inclusive and exclusive segments of a user behavior audience 
 */
@ApiModel(description = "Inclusive and exclusive segments of a user behavior audience ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateUserBehaviorSegmentV2 {
  /**
   * Type of shopper activity used to generate the audience.
   */
  @JsonAdapter(UserActionEnum.Adapter.class)
  public enum UserActionEnum {
    BUY("buy"),
    
    VIEW("view"),
    
    ADDTOCART("addToCart");

    private String value;

    UserActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserActionEnum fromValue(String value) {
      for (UserActionEnum b : UserActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_ACTION = "userAction";
  @SerializedName(SERIALIZED_NAME_USER_ACTION)
  private UserActionEnum userAction;

  /**
   * Length of lookback window
   */
  @JsonAdapter(LookbackWindowEnum.Adapter.class)
  public enum LookbackWindowEnum {
    P7D("P7D"),
    
    P14D("P14D"),
    
    P30D("P30D"),
    
    P45D("P45D"),
    
    P60D("P60D"),
    
    P90D("P90D"),
    
    P120D("P120D"),
    
    P150D("P150D"),
    
    P180D("P180D");

    private String value;

    LookbackWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LookbackWindowEnum fromValue(String value) {
      for (LookbackWindowEnum b : LookbackWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LookbackWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LookbackWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LookbackWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LookbackWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOOKBACK_WINDOW = "lookbackWindow";
  @SerializedName(SERIALIZED_NAME_LOOKBACK_WINDOW)
  private LookbackWindowEnum lookbackWindow;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds = null;

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<String> brandIds = null;

  public static final String SERIALIZED_NAME_MIN_PRICE = "minPrice";
  @SerializedName(SERIALIZED_NAME_MIN_PRICE)
  private Double minPrice;

  public static final String SERIALIZED_NAME_MAX_PRICE = "maxPrice";
  @SerializedName(SERIALIZED_NAME_MAX_PRICE)
  private Double maxPrice;


  public CreateUserBehaviorSegmentV2 userAction(UserActionEnum userAction) {
    
    this.userAction = userAction;
    return this;
  }

   /**
   * Type of shopper activity used to generate the audience.
   * @return userAction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "buy", required = true, value = "Type of shopper activity used to generate the audience.")

  public UserActionEnum getUserAction() {
    return userAction;
  }


  public void setUserAction(UserActionEnum userAction) {
    this.userAction = userAction;
  }


  public CreateUserBehaviorSegmentV2 lookbackWindow(LookbackWindowEnum lookbackWindow) {
    
    this.lookbackWindow = lookbackWindow;
    return this;
  }

   /**
   * Length of lookback window
   * @return lookbackWindow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "P7D", required = true, value = "Length of lookback window")

  public LookbackWindowEnum getLookbackWindow() {
    return lookbackWindow;
  }


  public void setLookbackWindow(LookbackWindowEnum lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }


  public CreateUserBehaviorSegmentV2 categoryIds(List<String> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public CreateUserBehaviorSegmentV2 addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * The categories to target
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The categories to target")

  public List<String> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public CreateUserBehaviorSegmentV2 brandIds(List<String> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public CreateUserBehaviorSegmentV2 addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * The brands to target
   * @return brandIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The brands to target")

  public List<String> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(List<String> brandIds) {
    this.brandIds = brandIds;
  }


   /**
   * The min price of targeted skus.
   * @return minPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The min price of targeted skus.")

  public Double getMinPrice() {
    return minPrice;
  }




   /**
   * The max price of targeted skus.
   * @return maxPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The max price of targeted skus.")

  public Double getMaxPrice() {
    return maxPrice;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserBehaviorSegmentV2 createUserBehaviorSegmentV2 = (CreateUserBehaviorSegmentV2) o;
    return Objects.equals(this.userAction, createUserBehaviorSegmentV2.userAction) &&
        Objects.equals(this.lookbackWindow, createUserBehaviorSegmentV2.lookbackWindow) &&
        Objects.equals(this.categoryIds, createUserBehaviorSegmentV2.categoryIds) &&
        Objects.equals(this.brandIds, createUserBehaviorSegmentV2.brandIds) &&
        Objects.equals(this.minPrice, createUserBehaviorSegmentV2.minPrice) &&
        Objects.equals(this.maxPrice, createUserBehaviorSegmentV2.maxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAction, lookbackWindow, categoryIds, brandIds, minPrice, maxPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserBehaviorSegmentV2 {\n");
    sb.append("    userAction: ").append(toIndentedString(userAction)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
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

