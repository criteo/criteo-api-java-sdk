/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2025-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2025_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2025_01.model.InputKeywords;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.criteo.api.retailmedia.v2025_01.JSON;

/**
 * Data associated with a normalized keyword phrase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Keywords {
  /**
   * Review status of the keyword
   */
  @JsonAdapter(ReviewStateEnum.Adapter.class)
  public enum ReviewStateEnum {
    INREVIEW("InReview"),
    
    RECOMMENDED("Recommended"),
    
    APPROVED("Approved"),
    
    AUTOAPPROVED("AutoApproved"),
    
    REJECTED("Rejected"),
    
    AUTOREJECTED("AutoRejected"),
    
    UNKOWN("Unkown");

    private String value;

    ReviewStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReviewStateEnum fromValue(String value) {
      for (ReviewStateEnum b : ReviewStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReviewStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReviewStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReviewStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReviewStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVIEW_STATE = "reviewState";
  @SerializedName(SERIALIZED_NAME_REVIEW_STATE)
  private ReviewStateEnum reviewState;

  /**
   * The matching algorthim to be use when comparing this keyword with the shopper search phrase
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    POSITIVEEXACTMATCH("PositiveExactMatch"),
    
    NEGATIVEEXACTMATCH("NegativeExactMatch"),
    
    NEGATIVEBROADMATCH("NegativeBroadMatch"),
    
    UNKNOWN("Unknown");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String value) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private MatchTypeEnum matchType;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid;

  public static final String SERIALIZED_NAME_INPUT_KEYWORDS = "inputKeywords";
  @SerializedName(SERIALIZED_NAME_INPUT_KEYWORDS)
  private InputKeywords inputKeywords;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Keywords() {
  }

  public Keywords reviewState(ReviewStateEnum reviewState) {
    
    this.reviewState = reviewState;
    return this;
  }

   /**
   * Review status of the keyword
   * @return reviewState
  **/
  @javax.annotation.Nullable

  public ReviewStateEnum getReviewState() {
    return reviewState;
  }


  public void setReviewState(ReviewStateEnum reviewState) {
    this.reviewState = reviewState;
  }


  public Keywords matchType(MatchTypeEnum matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * The matching algorthim to be use when comparing this keyword with the shopper search phrase
   * @return matchType
  **/
  @javax.annotation.Nullable

  public MatchTypeEnum getMatchType() {
    return matchType;
  }


  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }


  public Keywords bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * The bid to use when a positive keyword matches the shopper search phrase
   * @return bid
  **/
  @javax.annotation.Nullable

  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public Keywords inputKeywords(InputKeywords inputKeywords) {
    
    this.inputKeywords = inputKeywords;
    return this;
  }

   /**
   * Get inputKeywords
   * @return inputKeywords
  **/
  @javax.annotation.Nullable

  public InputKeywords getInputKeywords() {
    return inputKeywords;
  }


  public void setInputKeywords(InputKeywords inputKeywords) {
    this.inputKeywords = inputKeywords;
  }


  public Keywords createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which this keyword was created in UTC
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Keywords updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time at which the keyword was last modified in UTC
   * @return updatedAt
  **/
  @javax.annotation.Nullable

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
    Keywords keywords = (Keywords) o;
    return Objects.equals(this.reviewState, keywords.reviewState) &&
        Objects.equals(this.matchType, keywords.matchType) &&
        Objects.equals(this.bid, keywords.bid) &&
        Objects.equals(this.inputKeywords, keywords.inputKeywords) &&
        Objects.equals(this.createdAt, keywords.createdAt) &&
        Objects.equals(this.updatedAt, keywords.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewState, matchType, bid, inputKeywords, createdAt, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keywords {\n");
    sb.append("    reviewState: ").append(toIndentedString(reviewState)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    inputKeywords: ").append(toIndentedString(inputKeywords)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("reviewState");
    openapiFields.add("matchType");
    openapiFields.add("bid");
    openapiFields.add("inputKeywords");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Keywords
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Keywords.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Keywords is not found in the empty JSON string", Keywords.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Keywords.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Keywords` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reviewState") != null && !jsonObj.get("reviewState").isJsonNull()) && !jsonObj.get("reviewState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewState").toString()));
      }
      if ((jsonObj.get("matchType") != null && !jsonObj.get("matchType").isJsonNull()) && !jsonObj.get("matchType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchType").toString()));
      }
      // validate the optional field `inputKeywords`
      if (jsonObj.get("inputKeywords") != null && !jsonObj.get("inputKeywords").isJsonNull()) {
        InputKeywords.validateJsonObject(jsonObj.getAsJsonObject("inputKeywords"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Keywords.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Keywords' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Keywords> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Keywords.class));

       return (TypeAdapter<T>) new TypeAdapter<Keywords>() {
           @Override
           public void write(JsonWriter out, Keywords value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Keywords read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Keywords given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Keywords
  * @throws IOException if the JSON string is invalid with respect to Keywords
  */
  public static Keywords fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Keywords.class);
  }

 /**
  * Convert an instance of Keywords to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

