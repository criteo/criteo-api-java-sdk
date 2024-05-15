/*
 * Criteo API
 * Criteo API - MarketingSolutions
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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Defines a targeting operator
 */
@JsonAdapter(TargetingOperator.Adapter.class)
public enum TargetingOperator {
  
  OR("Or"),
  
  AND("And"),
  
  NOT("Not"),
  
  VALUE("Value");

  private String value;

  TargetingOperator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingOperator fromValue(String value) {
    for (TargetingOperator b : TargetingOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TargetingOperator> {
    @Override
    public void write(final JsonWriter jsonWriter, final TargetingOperator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TargetingOperator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TargetingOperator.fromValue(value);
    }
  }
}

