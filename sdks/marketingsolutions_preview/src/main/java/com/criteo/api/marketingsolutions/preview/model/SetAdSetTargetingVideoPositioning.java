/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * Video positioning targeting writing model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetAdSetTargetingVideoPositioning {
  /**
   * Gets or Sets videoPlacement
   */
  @JsonAdapter(VideoPlacementEnum.Adapter.class)
  public enum VideoPlacementEnum {
    INBANNER("InBanner"),
    
    INARTICLE("InArticle"),
    
    INFEED("InFeed"),
    
    INTERSTITIAL("Interstitial"),
    
    INSTREAM("InStream");

    private String value;

    VideoPlacementEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoPlacementEnum fromValue(String value) {
      for (VideoPlacementEnum b : VideoPlacementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoPlacementEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoPlacementEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoPlacementEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoPlacementEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_PLACEMENT = "videoPlacement";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLACEMENT)
  private List<VideoPlacementEnum> videoPlacement = null;

  /**
   * Gets or Sets videoPlcmt
   */
  @JsonAdapter(VideoPlcmtEnum.Adapter.class)
  public enum VideoPlcmtEnum {
    INSTREAM("InStream"),
    
    ACCOMPANYINGCONTENT("AccompanyingContent"),
    
    INTERSTITIAL("Interstitial"),
    
    NOCONTENTSTANDALONE("NoContentStandalone");

    private String value;

    VideoPlcmtEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoPlcmtEnum fromValue(String value) {
      for (VideoPlcmtEnum b : VideoPlcmtEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoPlcmtEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoPlcmtEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoPlcmtEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoPlcmtEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_PLCMT = "videoPlcmt";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLCMT)
  private List<VideoPlcmtEnum> videoPlcmt = null;

  /**
   * Gets or Sets playbackMethod
   */
  @JsonAdapter(PlaybackMethodEnum.Adapter.class)
  public enum PlaybackMethodEnum {
    AUTOSOUNDON("AutoSoundOn"),
    
    AUTOSOUNDOFF("AutoSoundOff"),
    
    CLICKSOUNDON("ClickSoundOn"),
    
    MOUSEOVERSOUNDON("MouseOverSoundOn"),
    
    ENTERINGVIEWPORTSOUNDON("EnteringViewportSoundOn"),
    
    ENTERINGVIEWPORTSOUNDOFF("EnteringViewportSoundOff");

    private String value;

    PlaybackMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlaybackMethodEnum fromValue(String value) {
      for (PlaybackMethodEnum b : PlaybackMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlaybackMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlaybackMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlaybackMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlaybackMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLAYBACK_METHOD = "playbackMethod";
  @SerializedName(SERIALIZED_NAME_PLAYBACK_METHOD)
  private List<PlaybackMethodEnum> playbackMethod = null;

  /**
   * Gets or Sets skippable
   */
  @JsonAdapter(SkippableEnum.Adapter.class)
  public enum SkippableEnum {
    REQUIRED("Required"),
    
    BLOCKED("Blocked");

    private String value;

    SkippableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SkippableEnum fromValue(String value) {
      for (SkippableEnum b : SkippableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SkippableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SkippableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SkippableEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SkippableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SKIPPABLE = "skippable";
  @SerializedName(SERIALIZED_NAME_SKIPPABLE)
  private SkippableEnum skippable;

  /**
   * Gets or Sets videoInStreamPosition
   */
  @JsonAdapter(VideoInStreamPositionEnum.Adapter.class)
  public enum VideoInStreamPositionEnum {
    PREROLL("PreRoll"),
    
    MIDROLL("MidRoll"),
    
    POSTROLL("PostRoll");

    private String value;

    VideoInStreamPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoInStreamPositionEnum fromValue(String value) {
      for (VideoInStreamPositionEnum b : VideoInStreamPositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoInStreamPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoInStreamPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoInStreamPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoInStreamPositionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_IN_STREAM_POSITION = "videoInStreamPosition";
  @SerializedName(SERIALIZED_NAME_VIDEO_IN_STREAM_POSITION)
  private List<VideoInStreamPositionEnum> videoInStreamPosition = null;

  /**
   * Gets or Sets videoPlayerSize
   */
  @JsonAdapter(VideoPlayerSizeEnum.Adapter.class)
  public enum VideoPlayerSizeEnum {
    SMALL("Small"),
    
    MEDIUM("Medium"),
    
    LARGE("Large"),
    
    EXTRALARGE("ExtraLarge");

    private String value;

    VideoPlayerSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoPlayerSizeEnum fromValue(String value) {
      for (VideoPlayerSizeEnum b : VideoPlayerSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoPlayerSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoPlayerSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoPlayerSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoPlayerSizeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_PLAYER_SIZE = "videoPlayerSize";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAYER_SIZE)
  private List<VideoPlayerSizeEnum> videoPlayerSize = null;

  /**
   * Gets or Sets videoAspectRatio
   */
  @JsonAdapter(VideoAspectRatioEnum.Adapter.class)
  public enum VideoAspectRatioEnum {
    HORIZONTAL("Horizontal"),
    
    SQUARE("Square"),
    
    VERTICAL("Vertical");

    private String value;

    VideoAspectRatioEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoAspectRatioEnum fromValue(String value) {
      for (VideoAspectRatioEnum b : VideoAspectRatioEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoAspectRatioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoAspectRatioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoAspectRatioEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoAspectRatioEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_ASPECT_RATIO = "videoAspectRatio";
  @SerializedName(SERIALIZED_NAME_VIDEO_ASPECT_RATIO)
  private List<VideoAspectRatioEnum> videoAspectRatio = null;

  public SetAdSetTargetingVideoPositioning() {
  }

  public SetAdSetTargetingVideoPositioning videoPlacement(List<VideoPlacementEnum> videoPlacement) {
    
    this.videoPlacement = videoPlacement;
    return this;
  }

  public SetAdSetTargetingVideoPositioning addVideoPlacementItem(VideoPlacementEnum videoPlacementItem) {
    if (this.videoPlacement == null) {
      this.videoPlacement = null;
    }
    this.videoPlacement.add(videoPlacementItem);
    return this;
  }

   /**
   * Get videoPlacement
   * @return videoPlacement
  **/
  @javax.annotation.Nullable

  public List<VideoPlacementEnum> getVideoPlacement() {
    return videoPlacement;
  }


  public void setVideoPlacement(List<VideoPlacementEnum> videoPlacement) {
    this.videoPlacement = videoPlacement;
  }


  public SetAdSetTargetingVideoPositioning videoPlcmt(List<VideoPlcmtEnum> videoPlcmt) {
    
    this.videoPlcmt = videoPlcmt;
    return this;
  }

  public SetAdSetTargetingVideoPositioning addVideoPlcmtItem(VideoPlcmtEnum videoPlcmtItem) {
    if (this.videoPlcmt == null) {
      this.videoPlcmt = null;
    }
    this.videoPlcmt.add(videoPlcmtItem);
    return this;
  }

   /**
   * Get videoPlcmt
   * @return videoPlcmt
  **/
  @javax.annotation.Nullable

  public List<VideoPlcmtEnum> getVideoPlcmt() {
    return videoPlcmt;
  }


  public void setVideoPlcmt(List<VideoPlcmtEnum> videoPlcmt) {
    this.videoPlcmt = videoPlcmt;
  }


  public SetAdSetTargetingVideoPositioning playbackMethod(List<PlaybackMethodEnum> playbackMethod) {
    
    this.playbackMethod = playbackMethod;
    return this;
  }

  public SetAdSetTargetingVideoPositioning addPlaybackMethodItem(PlaybackMethodEnum playbackMethodItem) {
    if (this.playbackMethod == null) {
      this.playbackMethod = null;
    }
    this.playbackMethod.add(playbackMethodItem);
    return this;
  }

   /**
   * Get playbackMethod
   * @return playbackMethod
  **/
  @javax.annotation.Nullable

  public List<PlaybackMethodEnum> getPlaybackMethod() {
    return playbackMethod;
  }


  public void setPlaybackMethod(List<PlaybackMethodEnum> playbackMethod) {
    this.playbackMethod = playbackMethod;
  }


  public SetAdSetTargetingVideoPositioning skippable(SkippableEnum skippable) {
    
    this.skippable = skippable;
    return this;
  }

   /**
   * Get skippable
   * @return skippable
  **/
  @javax.annotation.Nullable

  public SkippableEnum getSkippable() {
    return skippable;
  }


  public void setSkippable(SkippableEnum skippable) {
    this.skippable = skippable;
  }


  public SetAdSetTargetingVideoPositioning videoInStreamPosition(List<VideoInStreamPositionEnum> videoInStreamPosition) {
    
    this.videoInStreamPosition = videoInStreamPosition;
    return this;
  }

  public SetAdSetTargetingVideoPositioning addVideoInStreamPositionItem(VideoInStreamPositionEnum videoInStreamPositionItem) {
    if (this.videoInStreamPosition == null) {
      this.videoInStreamPosition = null;
    }
    this.videoInStreamPosition.add(videoInStreamPositionItem);
    return this;
  }

   /**
   * Get videoInStreamPosition
   * @return videoInStreamPosition
  **/
  @javax.annotation.Nullable

  public List<VideoInStreamPositionEnum> getVideoInStreamPosition() {
    return videoInStreamPosition;
  }


  public void setVideoInStreamPosition(List<VideoInStreamPositionEnum> videoInStreamPosition) {
    this.videoInStreamPosition = videoInStreamPosition;
  }


  public SetAdSetTargetingVideoPositioning videoPlayerSize(List<VideoPlayerSizeEnum> videoPlayerSize) {
    
    this.videoPlayerSize = videoPlayerSize;
    return this;
  }

  public SetAdSetTargetingVideoPositioning addVideoPlayerSizeItem(VideoPlayerSizeEnum videoPlayerSizeItem) {
    if (this.videoPlayerSize == null) {
      this.videoPlayerSize = null;
    }
    this.videoPlayerSize.add(videoPlayerSizeItem);
    return this;
  }

   /**
   * Get videoPlayerSize
   * @return videoPlayerSize
  **/
  @javax.annotation.Nullable

  public List<VideoPlayerSizeEnum> getVideoPlayerSize() {
    return videoPlayerSize;
  }


  public void setVideoPlayerSize(List<VideoPlayerSizeEnum> videoPlayerSize) {
    this.videoPlayerSize = videoPlayerSize;
  }


  public SetAdSetTargetingVideoPositioning videoAspectRatio(List<VideoAspectRatioEnum> videoAspectRatio) {
    
    this.videoAspectRatio = videoAspectRatio;
    return this;
  }

  public SetAdSetTargetingVideoPositioning addVideoAspectRatioItem(VideoAspectRatioEnum videoAspectRatioItem) {
    if (this.videoAspectRatio == null) {
      this.videoAspectRatio = null;
    }
    this.videoAspectRatio.add(videoAspectRatioItem);
    return this;
  }

   /**
   * Get videoAspectRatio
   * @return videoAspectRatio
  **/
  @javax.annotation.Nullable

  public List<VideoAspectRatioEnum> getVideoAspectRatio() {
    return videoAspectRatio;
  }


  public void setVideoAspectRatio(List<VideoAspectRatioEnum> videoAspectRatio) {
    this.videoAspectRatio = videoAspectRatio;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SetAdSetTargetingVideoPositioning instance itself
   */
  public SetAdSetTargetingVideoPositioning putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetAdSetTargetingVideoPositioning setAdSetTargetingVideoPositioning = (SetAdSetTargetingVideoPositioning) o;
    return Objects.equals(this.videoPlacement, setAdSetTargetingVideoPositioning.videoPlacement) &&
        Objects.equals(this.videoPlcmt, setAdSetTargetingVideoPositioning.videoPlcmt) &&
        Objects.equals(this.playbackMethod, setAdSetTargetingVideoPositioning.playbackMethod) &&
        Objects.equals(this.skippable, setAdSetTargetingVideoPositioning.skippable) &&
        Objects.equals(this.videoInStreamPosition, setAdSetTargetingVideoPositioning.videoInStreamPosition) &&
        Objects.equals(this.videoPlayerSize, setAdSetTargetingVideoPositioning.videoPlayerSize) &&
        Objects.equals(this.videoAspectRatio, setAdSetTargetingVideoPositioning.videoAspectRatio)&&
        Objects.equals(this.additionalProperties, setAdSetTargetingVideoPositioning.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoPlacement, videoPlcmt, playbackMethod, skippable, videoInStreamPosition, videoPlayerSize, videoAspectRatio, additionalProperties);
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
    sb.append("class SetAdSetTargetingVideoPositioning {\n");
    sb.append("    videoPlacement: ").append(toIndentedString(videoPlacement)).append("\n");
    sb.append("    videoPlcmt: ").append(toIndentedString(videoPlcmt)).append("\n");
    sb.append("    playbackMethod: ").append(toIndentedString(playbackMethod)).append("\n");
    sb.append("    skippable: ").append(toIndentedString(skippable)).append("\n");
    sb.append("    videoInStreamPosition: ").append(toIndentedString(videoInStreamPosition)).append("\n");
    sb.append("    videoPlayerSize: ").append(toIndentedString(videoPlayerSize)).append("\n");
    sb.append("    videoAspectRatio: ").append(toIndentedString(videoAspectRatio)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("videoPlacement");
    openapiFields.add("videoPlcmt");
    openapiFields.add("playbackMethod");
    openapiFields.add("skippable");
    openapiFields.add("videoInStreamPosition");
    openapiFields.add("videoPlayerSize");
    openapiFields.add("videoAspectRatio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetAdSetTargetingVideoPositioning
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SetAdSetTargetingVideoPositioning.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetAdSetTargetingVideoPositioning is not found in the empty JSON string", SetAdSetTargetingVideoPositioning.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("videoPlacement") != null && !jsonObj.get("videoPlacement").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoPlacement` to be an array in the JSON string but got `%s`", jsonObj.get("videoPlacement").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("videoPlcmt") != null && !jsonObj.get("videoPlcmt").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoPlcmt` to be an array in the JSON string but got `%s`", jsonObj.get("videoPlcmt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("playbackMethod") != null && !jsonObj.get("playbackMethod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `playbackMethod` to be an array in the JSON string but got `%s`", jsonObj.get("playbackMethod").toString()));
      }
      if ((jsonObj.get("skippable") != null && !jsonObj.get("skippable").isJsonNull()) && !jsonObj.get("skippable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skippable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skippable").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("videoInStreamPosition") != null && !jsonObj.get("videoInStreamPosition").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoInStreamPosition` to be an array in the JSON string but got `%s`", jsonObj.get("videoInStreamPosition").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("videoPlayerSize") != null && !jsonObj.get("videoPlayerSize").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoPlayerSize` to be an array in the JSON string but got `%s`", jsonObj.get("videoPlayerSize").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("videoAspectRatio") != null && !jsonObj.get("videoAspectRatio").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoAspectRatio` to be an array in the JSON string but got `%s`", jsonObj.get("videoAspectRatio").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetAdSetTargetingVideoPositioning.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetAdSetTargetingVideoPositioning' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetAdSetTargetingVideoPositioning> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetAdSetTargetingVideoPositioning.class));

       return (TypeAdapter<T>) new TypeAdapter<SetAdSetTargetingVideoPositioning>() {
           @Override
           public void write(JsonWriter out, SetAdSetTargetingVideoPositioning value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SetAdSetTargetingVideoPositioning read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SetAdSetTargetingVideoPositioning instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetAdSetTargetingVideoPositioning given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetAdSetTargetingVideoPositioning
  * @throws IOException if the JSON string is invalid with respect to SetAdSetTargetingVideoPositioning
  */
  public static SetAdSetTargetingVideoPositioning fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetAdSetTargetingVideoPositioning.class);
  }

 /**
  * Convert an instance of SetAdSetTargetingVideoPositioning to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

