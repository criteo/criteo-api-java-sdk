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
import com.criteo.api.marketingsolutions.preview.model.NillableDecimal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set budget patch model
 */
@ApiModel(description = "ad set budget patch model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchAdSetBudget {
  /**
   * Whether your budget is capped or not
   */
  @JsonAdapter(BudgetStrategyEnum.Adapter.class)
  public enum BudgetStrategyEnum {
    CAPPED("capped"),
    
    UNCAPPED("uncapped");

    private String value;

    BudgetStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetStrategyEnum fromValue(String value) {
      for (BudgetStrategyEnum b : BudgetStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_STRATEGY = "budgetStrategy";
  @SerializedName(SERIALIZED_NAME_BUDGET_STRATEGY)
  private BudgetStrategyEnum budgetStrategy;

  /**
   * The pace of the budget renewal
   */
  @JsonAdapter(BudgetRenewalEnum.Adapter.class)
  public enum BudgetRenewalEnum {
    UNDEFINED("undefined"),
    
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    LIFETIME("lifetime");

    private String value;

    BudgetRenewalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetRenewalEnum fromValue(String value) {
      for (BudgetRenewalEnum b : BudgetRenewalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetRenewalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetRenewalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetRenewalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetRenewalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_RENEWAL = "budgetRenewal";
  @SerializedName(SERIALIZED_NAME_BUDGET_RENEWAL)
  private BudgetRenewalEnum budgetRenewal;

  /**
   * The pace at which the budget can be spent
   */
  @JsonAdapter(BudgetDeliverySmoothingEnum.Adapter.class)
  public enum BudgetDeliverySmoothingEnum {
    ACCELERATED("accelerated"),
    
    STANDARD("standard");

    private String value;

    BudgetDeliverySmoothingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetDeliverySmoothingEnum fromValue(String value) {
      for (BudgetDeliverySmoothingEnum b : BudgetDeliverySmoothingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetDeliverySmoothingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetDeliverySmoothingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetDeliverySmoothingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetDeliverySmoothingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_DELIVERY_SMOOTHING = "budgetDeliverySmoothing";
  @SerializedName(SERIALIZED_NAME_BUDGET_DELIVERY_SMOOTHING)
  private BudgetDeliverySmoothingEnum budgetDeliverySmoothing;

  /**
   * The delivery week for the budget
   */
  @JsonAdapter(BudgetDeliveryWeekEnum.Adapter.class)
  public enum BudgetDeliveryWeekEnum {
    UNDEFINED("undefined"),
    
    MONDAYTOSUNDAY("mondayToSunday"),
    
    TUESDAYTOMONDAY("tuesdayToMonday"),
    
    WEDNESDAYTOTUESDAY("wednesdayToTuesday"),
    
    THURSDAYTOWEDNESDAY("thursdayToWednesday"),
    
    FRIDAYTOTHURSDAY("fridayToThursday"),
    
    SATURDAYTOFRIDAY("saturdayToFriday"),
    
    SUNDAYTOSATURDAY("sundayToSaturday");

    private String value;

    BudgetDeliveryWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BudgetDeliveryWeekEnum fromValue(String value) {
      for (BudgetDeliveryWeekEnum b : BudgetDeliveryWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BudgetDeliveryWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BudgetDeliveryWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BudgetDeliveryWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BudgetDeliveryWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUDGET_DELIVERY_WEEK = "budgetDeliveryWeek";
  @SerializedName(SERIALIZED_NAME_BUDGET_DELIVERY_WEEK)
  private BudgetDeliveryWeekEnum budgetDeliveryWeek;

  public static final String SERIALIZED_NAME_BUDGET_AMOUNT = "budgetAmount";
  @SerializedName(SERIALIZED_NAME_BUDGET_AMOUNT)
  private NillableDecimal budgetAmount;


  public PatchAdSetBudget budgetStrategy(BudgetStrategyEnum budgetStrategy) {
    
    this.budgetStrategy = budgetStrategy;
    return this;
  }

   /**
   * Whether your budget is capped or not
   * @return budgetStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether your budget is capped or not")

  public BudgetStrategyEnum getBudgetStrategy() {
    return budgetStrategy;
  }


  public void setBudgetStrategy(BudgetStrategyEnum budgetStrategy) {
    this.budgetStrategy = budgetStrategy;
  }


  public PatchAdSetBudget budgetRenewal(BudgetRenewalEnum budgetRenewal) {
    
    this.budgetRenewal = budgetRenewal;
    return this;
  }

   /**
   * The pace of the budget renewal
   * @return budgetRenewal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pace of the budget renewal")

  public BudgetRenewalEnum getBudgetRenewal() {
    return budgetRenewal;
  }


  public void setBudgetRenewal(BudgetRenewalEnum budgetRenewal) {
    this.budgetRenewal = budgetRenewal;
  }


  public PatchAdSetBudget budgetDeliverySmoothing(BudgetDeliverySmoothingEnum budgetDeliverySmoothing) {
    
    this.budgetDeliverySmoothing = budgetDeliverySmoothing;
    return this;
  }

   /**
   * The pace at which the budget can be spent
   * @return budgetDeliverySmoothing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pace at which the budget can be spent")

  public BudgetDeliverySmoothingEnum getBudgetDeliverySmoothing() {
    return budgetDeliverySmoothing;
  }


  public void setBudgetDeliverySmoothing(BudgetDeliverySmoothingEnum budgetDeliverySmoothing) {
    this.budgetDeliverySmoothing = budgetDeliverySmoothing;
  }


  public PatchAdSetBudget budgetDeliveryWeek(BudgetDeliveryWeekEnum budgetDeliveryWeek) {
    
    this.budgetDeliveryWeek = budgetDeliveryWeek;
    return this;
  }

   /**
   * The delivery week for the budget
   * @return budgetDeliveryWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The delivery week for the budget")

  public BudgetDeliveryWeekEnum getBudgetDeliveryWeek() {
    return budgetDeliveryWeek;
  }


  public void setBudgetDeliveryWeek(BudgetDeliveryWeekEnum budgetDeliveryWeek) {
    this.budgetDeliveryWeek = budgetDeliveryWeek;
  }


  public PatchAdSetBudget budgetAmount(NillableDecimal budgetAmount) {
    
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * Get budgetAmount
   * @return budgetAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NillableDecimal getBudgetAmount() {
    return budgetAmount;
  }


  public void setBudgetAmount(NillableDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchAdSetBudget patchAdSetBudget = (PatchAdSetBudget) o;
    return Objects.equals(this.budgetStrategy, patchAdSetBudget.budgetStrategy) &&
        Objects.equals(this.budgetRenewal, patchAdSetBudget.budgetRenewal) &&
        Objects.equals(this.budgetDeliverySmoothing, patchAdSetBudget.budgetDeliverySmoothing) &&
        Objects.equals(this.budgetDeliveryWeek, patchAdSetBudget.budgetDeliveryWeek) &&
        Objects.equals(this.budgetAmount, patchAdSetBudget.budgetAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetStrategy, budgetRenewal, budgetDeliverySmoothing, budgetDeliveryWeek, budgetAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAdSetBudget {\n");
    sb.append("    budgetStrategy: ").append(toIndentedString(budgetStrategy)).append("\n");
    sb.append("    budgetRenewal: ").append(toIndentedString(budgetRenewal)).append("\n");
    sb.append("    budgetDeliverySmoothing: ").append(toIndentedString(budgetDeliverySmoothing)).append("\n");
    sb.append("    budgetDeliveryWeek: ").append(toIndentedString(budgetDeliveryWeek)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
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

