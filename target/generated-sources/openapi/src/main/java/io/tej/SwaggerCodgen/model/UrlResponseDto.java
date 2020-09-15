package io.tej.SwaggerCodgen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UrlResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-15T11:38:46.522400200+05:30[Asia/Calcutta]")

public class UrlResponseDto   {
  @JsonProperty("shorturl")
  private String shorturl;

  @JsonProperty("longurl")
  private String longurl;

  public UrlResponseDto shorturl(String shorturl) {
    this.shorturl = shorturl;
    return this;
  }

  /**
   * Get shorturl
   * @return shorturl
  */
  @ApiModelProperty(value = "")


  public String getShorturl() {
    return shorturl;
  }

  public void setShorturl(String shorturl) {
    this.shorturl = shorturl;
  }

  public UrlResponseDto longurl(String longurl) {
    this.longurl = longurl;
    return this;
  }

  /**
   * Get longurl
   * @return longurl
  */
  @ApiModelProperty(value = "")


  public String getLongurl() {
    return longurl;
  }

  public void setLongurl(String longurl) {
    this.longurl = longurl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlResponseDto urlResponseDto = (UrlResponseDto) o;
    return Objects.equals(this.shorturl, urlResponseDto.shorturl) &&
        Objects.equals(this.longurl, urlResponseDto.longurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shorturl, longurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlResponseDto {\n");
    
    sb.append("    shorturl: ").append(toIndentedString(shorturl)).append("\n");
    sb.append("    longurl: ").append(toIndentedString(longurl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

