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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the tax information of a product.
 */
@ApiModel(description = "Defines the tax information of a product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductTax {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_TAX_SHIP = "taxShip";
  @SerializedName(SERIALIZED_NAME_TAX_SHIP)
  private Boolean taxShip;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Long locationId;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;


  public ProductTax rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The percentage of tax rate that applies to the item price.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of tax rate that applies to the item price.")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  public ProductTax country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country within which the item is taxed, specified as a CLDR territory code.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country within which the item is taxed, specified as a CLDR territory code.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ProductTax region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The geographic region to which the tax rate applies.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The geographic region to which the tax rate applies.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ProductTax taxShip(Boolean taxShip) {
    
    this.taxShip = taxShip;
    return this;
  }

   /**
   * Set to true if tax is charged on shipping.
   * @return taxShip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to true if tax is charged on shipping.")

  public Boolean getTaxShip() {
    return taxShip;
  }


  public void setTaxShip(Boolean taxShip) {
    this.taxShip = taxShip;
  }


  public ProductTax locationId(Long locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * The numeric ID of a location that the tax rate applies to as defined in the AdWords API.
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID of a location that the tax rate applies to as defined in the AdWords API.")

  public Long getLocationId() {
    return locationId;
  }


  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }


  public ProductTax postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code range that the tax rate applies to, represented by a ZIP code, a ZIP code prefix using * wildcard, a range between two ZIP codes or two ZIP code prefixes of equal length. Examples: 94114, 94*, 94002-95460, 94*-95*.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code range that the tax rate applies to, represented by a ZIP code, a ZIP code prefix using * wildcard, a range between two ZIP codes or two ZIP code prefixes of equal length. Examples: 94114, 94*, 94002-95460, 94*-95*.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTax productTax = (ProductTax) o;
    return Objects.equals(this.rate, productTax.rate) &&
        Objects.equals(this.country, productTax.country) &&
        Objects.equals(this.region, productTax.region) &&
        Objects.equals(this.taxShip, productTax.taxShip) &&
        Objects.equals(this.locationId, productTax.locationId) &&
        Objects.equals(this.postalCode, productTax.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, country, region, taxShip, locationId, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTax {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    taxShip: ").append(toIndentedString(taxShip)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
