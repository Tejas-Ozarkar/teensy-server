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
 * UrlRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-15T13:16:14.244362400+05:30[Asia/Calcutta]")

public class UrlRequestDto   {
  @JsonProperty("longurl")
  private String longurl;

  public UrlRequestDto longurl(String longurl) {
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
    UrlRequestDto urlRequestDto = (UrlRequestDto) o;
    return Objects.equals(this.longurl, urlRequestDto.longurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlRequestDto {\n");
    
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

