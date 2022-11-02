/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_07.model;

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
 * Specification of a file variable
 */
@ApiModel(description = "Specification of a file variable")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilesVariablesSpecification {
  /**
   * Gets or Sets extensions
   */
  @JsonAdapter(ExtensionsEnum.Adapter.class)
  public enum ExtensionsEnum {
    UNKNOWN("Unknown"),
    
    JPEG("Jpeg"),
    
    PNG("Png"),
    
    GIF("Gif"),
    
    PDF("Pdf");

    private String value;

    ExtensionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtensionsEnum fromValue(String value) {
      for (ExtensionsEnum b : ExtensionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExtensionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtensionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtensionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExtensionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<ExtensionsEnum> extensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_BYTES = "maxBytes";
  @SerializedName(SERIALIZED_NAME_MAX_BYTES)
  private Integer maxBytes;

  public static final String SERIALIZED_NAME_MIN_FILES = "minFiles";
  @SerializedName(SERIALIZED_NAME_MIN_FILES)
  private Integer minFiles;

  public static final String SERIALIZED_NAME_MAX_FILE = "maxFile";
  @SerializedName(SERIALIZED_NAME_MAX_FILE)
  private Integer maxFile;


  public FilesVariablesSpecification extensions(List<ExtensionsEnum> extensions) {
    
    this.extensions = extensions;
    return this;
  }

  public FilesVariablesSpecification addExtensionsItem(ExtensionsEnum extensionsItem) {
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * The accepted file extensions
   * @return extensions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The accepted file extensions")

  public List<ExtensionsEnum> getExtensions() {
    return extensions;
  }


  public void setExtensions(List<ExtensionsEnum> extensions) {
    this.extensions = extensions;
  }


  public FilesVariablesSpecification maxBytes(Integer maxBytes) {
    
    this.maxBytes = maxBytes;
    return this;
  }

   /**
   * The maximum amount of bytes per file
   * @return maxBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount of bytes per file")

  public Integer getMaxBytes() {
    return maxBytes;
  }


  public void setMaxBytes(Integer maxBytes) {
    this.maxBytes = maxBytes;
  }


  public FilesVariablesSpecification minFiles(Integer minFiles) {
    
    this.minFiles = minFiles;
    return this;
  }

   /**
   * The minimum amount of files requires
   * @return minFiles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The minimum amount of files requires")

  public Integer getMinFiles() {
    return minFiles;
  }


  public void setMinFiles(Integer minFiles) {
    this.minFiles = minFiles;
  }


  public FilesVariablesSpecification maxFile(Integer maxFile) {
    
    this.maxFile = maxFile;
    return this;
  }

   /**
   * The maximum amount of files required
   * @return maxFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount of files required")

  public Integer getMaxFile() {
    return maxFile;
  }


  public void setMaxFile(Integer maxFile) {
    this.maxFile = maxFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesVariablesSpecification filesVariablesSpecification = (FilesVariablesSpecification) o;
    return Objects.equals(this.extensions, filesVariablesSpecification.extensions) &&
        Objects.equals(this.maxBytes, filesVariablesSpecification.maxBytes) &&
        Objects.equals(this.minFiles, filesVariablesSpecification.minFiles) &&
        Objects.equals(this.maxFile, filesVariablesSpecification.maxFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, maxBytes, minFiles, maxFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesVariablesSpecification {\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    maxBytes: ").append(toIndentedString(maxBytes)).append("\n");
    sb.append("    minFiles: ").append(toIndentedString(minFiles)).append("\n");
    sb.append("    maxFile: ").append(toIndentedString(maxFile)).append("\n");
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
