/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2024_04.model.ApprovalStatusModel;
import com.criteo.api.retailmedia.v2024_04.model.NegotiationStateModel;
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

import com.criteo.api.retailmedia.v2024_04.JSON;

/**
 * The state of a proposal in the context of a line item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProposalStatusModel {
  public static final String SERIALIZED_NAME_NEGOTIATION_STATE = "negotiationState";
  @SerializedName(SERIALIZED_NAME_NEGOTIATION_STATE)
  private NegotiationStateModel negotiationState;

  public static final String SERIALIZED_NAME_BOOKING_STATUS = "bookingStatus";
  @SerializedName(SERIALIZED_NAME_BOOKING_STATUS)
  private ApprovalStatusModel bookingStatus;

  public static final String SERIALIZED_NAME_RUNNABLE_STATUS = "runnableStatus";
  @SerializedName(SERIALIZED_NAME_RUNNABLE_STATUS)
  private ApprovalStatusModel runnableStatus;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProposalStatusModel() {
  }

  public ProposalStatusModel negotiationState(NegotiationStateModel negotiationState) {
    
    this.negotiationState = negotiationState;
    return this;
  }

   /**
   * Get negotiationState
   * @return negotiationState
  **/
  @javax.annotation.Nullable

  public NegotiationStateModel getNegotiationState() {
    return negotiationState;
  }


  public void setNegotiationState(NegotiationStateModel negotiationState) {
    this.negotiationState = negotiationState;
  }


  public ProposalStatusModel bookingStatus(ApprovalStatusModel bookingStatus) {
    
    this.bookingStatus = bookingStatus;
    return this;
  }

   /**
   * Get bookingStatus
   * @return bookingStatus
  **/
  @javax.annotation.Nullable

  public ApprovalStatusModel getBookingStatus() {
    return bookingStatus;
  }


  public void setBookingStatus(ApprovalStatusModel bookingStatus) {
    this.bookingStatus = bookingStatus;
  }


  public ProposalStatusModel runnableStatus(ApprovalStatusModel runnableStatus) {
    
    this.runnableStatus = runnableStatus;
    return this;
  }

   /**
   * Get runnableStatus
   * @return runnableStatus
  **/
  @javax.annotation.Nullable

  public ApprovalStatusModel getRunnableStatus() {
    return runnableStatus;
  }


  public void setRunnableStatus(ApprovalStatusModel runnableStatus) {
    this.runnableStatus = runnableStatus;
  }


  public ProposalStatusModel comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public ProposalStatusModel createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ProposalStatusModel updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
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
    ProposalStatusModel proposalStatusModel = (ProposalStatusModel) o;
    return Objects.equals(this.negotiationState, proposalStatusModel.negotiationState) &&
        Objects.equals(this.bookingStatus, proposalStatusModel.bookingStatus) &&
        Objects.equals(this.runnableStatus, proposalStatusModel.runnableStatus) &&
        Objects.equals(this.comment, proposalStatusModel.comment) &&
        Objects.equals(this.createdAt, proposalStatusModel.createdAt) &&
        Objects.equals(this.updatedAt, proposalStatusModel.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(negotiationState, bookingStatus, runnableStatus, comment, createdAt, updatedAt);
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
    sb.append("class ProposalStatusModel {\n");
    sb.append("    negotiationState: ").append(toIndentedString(negotiationState)).append("\n");
    sb.append("    bookingStatus: ").append(toIndentedString(bookingStatus)).append("\n");
    sb.append("    runnableStatus: ").append(toIndentedString(runnableStatus)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("negotiationState");
    openapiFields.add("bookingStatus");
    openapiFields.add("runnableStatus");
    openapiFields.add("comment");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProposalStatusModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProposalStatusModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProposalStatusModel is not found in the empty JSON string", ProposalStatusModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProposalStatusModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProposalStatusModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProposalStatusModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProposalStatusModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProposalStatusModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProposalStatusModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProposalStatusModel>() {
           @Override
           public void write(JsonWriter out, ProposalStatusModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProposalStatusModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProposalStatusModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProposalStatusModel
  * @throws IOException if the JSON string is invalid with respect to ProposalStatusModel
  */
  public static ProposalStatusModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProposalStatusModel.class);
  }

 /**
  * Convert an instance of ProposalStatusModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

