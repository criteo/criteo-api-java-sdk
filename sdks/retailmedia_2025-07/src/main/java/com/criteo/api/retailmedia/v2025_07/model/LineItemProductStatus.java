/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2025-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2025_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of a promoted product in the context of the line item.
 */
@JsonAdapter(LineItemProductStatus.Adapter.class)
public enum LineItemProductStatus {
  
  UNKNOWN("unknown"),
  
  ACTIVE("active"),
  
  PAUSED("paused");

  private String value;

  LineItemProductStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LineItemProductStatus fromValue(String value) {
    for (LineItemProductStatus b : LineItemProductStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LineItemProductStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LineItemProductStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LineItemProductStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LineItemProductStatus.fromValue(value);
    }
  }
}

