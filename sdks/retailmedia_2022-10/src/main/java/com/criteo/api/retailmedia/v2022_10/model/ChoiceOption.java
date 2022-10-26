/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2022_10.model.TemplateVariable;
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
 * An option given in a choice
 */
@ApiModel(description = "An option given in a choice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChoiceOption {
  public static final String SERIALIZED_NAME_DEPENDENT_VARIABLES = "dependentVariables";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_VARIABLES)
  private List<TemplateVariable> dependentVariables = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public ChoiceOption dependentVariables(List<TemplateVariable> dependentVariables) {
    
    this.dependentVariables = dependentVariables;
    return this;
  }

  public ChoiceOption addDependentVariablesItem(TemplateVariable dependentVariablesItem) {
    this.dependentVariables.add(dependentVariablesItem);
    return this;
  }

   /**
   * Template variables unblocked when the option is chosen
   * @return dependentVariables
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Template variables unblocked when the option is chosen")

  public List<TemplateVariable> getDependentVariables() {
    return dependentVariables;
  }


  public void setDependentVariables(List<TemplateVariable> dependentVariables) {
    this.dependentVariables = dependentVariables;
  }


  public ChoiceOption id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the option
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the option")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChoiceOption choiceOption = (ChoiceOption) o;
    return Objects.equals(this.dependentVariables, choiceOption.dependentVariables) &&
        Objects.equals(this.id, choiceOption.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependentVariables, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoiceOption {\n");
    sb.append("    dependentVariables: ").append(toIndentedString(dependentVariables)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

