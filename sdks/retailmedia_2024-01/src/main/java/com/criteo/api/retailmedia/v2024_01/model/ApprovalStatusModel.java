/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2024-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2024_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of a booking or runnable in the context of a line item.
 */
@JsonAdapter(ApprovalStatusModel.Adapter.class)
public enum ApprovalStatusModel {
  
  NOTSUBMITTED("NotSubmitted"),
  
  SUBMITTED("Submitted"),
  
  REJECTED("Rejected"),
  
  APPROVED("Approved");

  private String value;

  ApprovalStatusModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApprovalStatusModel fromValue(String value) {
    for (ApprovalStatusModel b : ApprovalStatusModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApprovalStatusModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApprovalStatusModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApprovalStatusModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApprovalStatusModel.fromValue(value);
    }
  }
}

