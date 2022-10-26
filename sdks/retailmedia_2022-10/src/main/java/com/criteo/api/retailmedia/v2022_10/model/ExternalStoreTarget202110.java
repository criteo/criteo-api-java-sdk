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
 * Identifies store targeting for a line item
 */
@ApiModel(description = "Identifies store targeting for a line item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalStoreTarget202110 {
  /**
   * Scope of the store target
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    UNKNOWN("unknown"),
    
    INCLUDE("include"),
    
    EXCLUDE("exclude");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  public static final String SERIALIZED_NAME_STORE_IDS = "storeIds";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<String> storeIds = new ArrayList<>();


  public ExternalStoreTarget202110 scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope of the store target
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Scope of the store target")

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public ExternalStoreTarget202110 storeIds(List<String> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public ExternalStoreTarget202110 addStoreIdsItem(String storeIdsItem) {
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store ids that should be targeted
   * @return storeIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Store ids that should be targeted")

  public List<String> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalStoreTarget202110 externalStoreTarget202110 = (ExternalStoreTarget202110) o;
    return Objects.equals(this.scope, externalStoreTarget202110.scope) &&
        Objects.equals(this.storeIds, externalStoreTarget202110.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, storeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalStoreTarget202110 {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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

