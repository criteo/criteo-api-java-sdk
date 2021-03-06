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
import com.criteo.api.marketingsolutions.preview.model.AlgebraNodeV1;
import com.criteo.api.marketingsolutions.preview.model.NillableString;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Audience of people of interest for a marketer.
 */
@ApiModel(description = "Audience of people of interest for a marketer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceUpdateEntityV1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private NillableString description;

  public static final String SERIALIZED_NAME_ALGEBRA = "algebra";
  @SerializedName(SERIALIZED_NAME_ALGEBRA)
  private AlgebraNodeV1 algebra;


  public AudienceUpdateEntityV1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the audience
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the audience")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceUpdateEntityV1 description(NillableString description) {
    
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


  public AudienceUpdateEntityV1 algebra(AlgebraNodeV1 algebra) {
    
    this.algebra = algebra;
    return this;
  }

   /**
   * Get algebra
   * @return algebra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlgebraNodeV1 getAlgebra() {
    return algebra;
  }


  public void setAlgebra(AlgebraNodeV1 algebra) {
    this.algebra = algebra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceUpdateEntityV1 audienceUpdateEntityV1 = (AudienceUpdateEntityV1) o;
    return Objects.equals(this.name, audienceUpdateEntityV1.name) &&
        Objects.equals(this.description, audienceUpdateEntityV1.description) &&
        Objects.equals(this.algebra, audienceUpdateEntityV1.algebra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, algebra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceUpdateEntityV1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    algebra: ").append(toIndentedString(algebra)).append("\n");
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

