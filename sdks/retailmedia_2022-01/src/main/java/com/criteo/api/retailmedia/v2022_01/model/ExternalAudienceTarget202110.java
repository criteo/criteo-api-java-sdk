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
import java.util.ArrayList;
import java.util.List;

/**
 * Identifies audience targeting for a line item
 */
@ApiModel(description = "Identifies audience targeting for a line item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAudienceTarget202110 {
  /**
   * Scope of the audience target
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

  public static final String SERIALIZED_NAME_AUDIENCE_IDS = "audienceIds";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_IDS)
  private List<String> audienceIds = new ArrayList<>();


  public ExternalAudienceTarget202110 scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope of the audience target
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Scope of the audience target")

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public ExternalAudienceTarget202110 audienceIds(List<String> audienceIds) {
    
    this.audienceIds = audienceIds;
    return this;
  }

  public ExternalAudienceTarget202110 addAudienceIdsItem(String audienceIdsItem) {
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

   /**
   * Audience ids that should be targeted
   * @return audienceIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Audience ids that should be targeted")

  public List<String> getAudienceIds() {
    return audienceIds;
  }


  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAudienceTarget202110 externalAudienceTarget202110 = (ExternalAudienceTarget202110) o;
    return Objects.equals(this.scope, externalAudienceTarget202110.scope) &&
        Objects.equals(this.audienceIds, externalAudienceTarget202110.audienceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, audienceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAudienceTarget202110 {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
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

