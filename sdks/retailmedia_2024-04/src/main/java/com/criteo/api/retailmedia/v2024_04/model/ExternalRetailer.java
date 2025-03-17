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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * A Retail Media Retailer used to represent a selection of products from multiple brands
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalRetailer {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets campaignEligibilities
   */
  @JsonAdapter(CampaignEligibilitiesEnum.Adapter.class)
  public enum CampaignEligibilitiesEnum {
    UNKNOWN("unknown"),
    
    AUCTION("auction"),
    
    PREFERRED("preferred"),
    
    OFFSITE("offsite"),
    
    OFFSITECPC("offsiteCpc");

    private String value;

    CampaignEligibilitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignEligibilitiesEnum fromValue(String value) {
      for (CampaignEligibilitiesEnum b : CampaignEligibilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignEligibilitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignEligibilitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignEligibilitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignEligibilitiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_ELIGIBILITIES = "campaignEligibilities";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ELIGIBILITIES)
  private List<CampaignEligibilitiesEnum> campaignEligibilities = null;

  public ExternalRetailer() {
  }

  public ExternalRetailer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalRetailer campaignEligibilities(List<CampaignEligibilitiesEnum> campaignEligibilities) {
    
    this.campaignEligibilities = campaignEligibilities;
    return this;
  }

  public ExternalRetailer addCampaignEligibilitiesItem(CampaignEligibilitiesEnum campaignEligibilitiesItem) {
    if (this.campaignEligibilities == null) {
      this.campaignEligibilities = null;
    }
    this.campaignEligibilities.add(campaignEligibilitiesItem);
    return this;
  }

   /**
   * Get campaignEligibilities
   * @return campaignEligibilities
  **/
  @javax.annotation.Nullable

  public List<CampaignEligibilitiesEnum> getCampaignEligibilities() {
    return campaignEligibilities;
  }


  public void setCampaignEligibilities(List<CampaignEligibilitiesEnum> campaignEligibilities) {
    this.campaignEligibilities = campaignEligibilities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalRetailer externalRetailer = (ExternalRetailer) o;
    return Objects.equals(this.name, externalRetailer.name) &&
        Objects.equals(this.campaignEligibilities, externalRetailer.campaignEligibilities);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, campaignEligibilities);
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
    sb.append("class ExternalRetailer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    campaignEligibilities: ").append(toIndentedString(campaignEligibilities)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("campaignEligibilities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalRetailer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalRetailer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalRetailer is not found in the empty JSON string", ExternalRetailer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalRetailer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalRetailer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalRetailer.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("campaignEligibilities") != null && !jsonObj.get("campaignEligibilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignEligibilities` to be an array in the JSON string but got `%s`", jsonObj.get("campaignEligibilities").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalRetailer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalRetailer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalRetailer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalRetailer.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalRetailer>() {
           @Override
           public void write(JsonWriter out, ExternalRetailer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalRetailer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalRetailer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalRetailer
  * @throws IOException if the JSON string is invalid with respect to ExternalRetailer
  */
  public static ExternalRetailer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalRetailer.class);
  }

 /**
  * Convert an instance of ExternalRetailer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

