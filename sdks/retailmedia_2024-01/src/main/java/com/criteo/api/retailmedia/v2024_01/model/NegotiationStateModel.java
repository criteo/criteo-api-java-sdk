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
 * The state of a negotiation in the context of a line item.
 */
@JsonAdapter(NegotiationStateModel.Adapter.class)
public enum NegotiationStateModel {
  
  INVALID("Invalid"),
  
  MODIFIED("Modified"),
  
  SUBMITTED("Submitted"),
  
  REVIEWED("Reviewed"),
  
  APPROVED("Approved");

  private String value;

  NegotiationStateModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NegotiationStateModel fromValue(String value) {
    for (NegotiationStateModel b : NegotiationStateModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NegotiationStateModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final NegotiationStateModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NegotiationStateModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NegotiationStateModel.fromValue(value);
    }
  }
}

